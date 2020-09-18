package edu.aku.abdulsajid.uen_hfa_bl;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

import utils.GpsTracker;
import utils.HhMemberModel;
import utils.LocationHelper;
import utils.QuestionModel;
import utils.Validation;
import utils.hidekybord;


public class GpsFragment extends Fragment {

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    Button mBtnGps, mBtnNext, mBtnGpsDeviice;
    TextView textLatitude, textLongitude;
    ProgressDialog progressBar;
    private OnFragmentInteractionListener mListener;

    public GpsFragment() {

    }

    public static GpsFragment newInstance(String param1, String param2) {
        GpsFragment fragment = new GpsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gps, container, false);
        InputMethodManager inputManager = (InputMethodManager) getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(v.getWindowToken(), 0);

        textLatitude = (TextView) v.findViewById(R.id.text_frag_gps_latitude);
        textLongitude = (TextView) v.findViewById(R.id.text_frag_gps_longitude);
        mBtnGps = (Button) v.findViewById(R.id.btn_frag_gps);
        mBtnGpsDeviice = (Button) v.findViewById(R.id.btn_frag_gps_device);
        mBtnNext = (Button) v.findViewById(R.id.btn_frag_gps_next);


        populateCachedData();


        mBtnGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GpsTracker gpsObj = new GpsTracker(getContext());
                gpsObj.requestLocationUpdate(new GpsTracker.LocationCallback() {
                    @Override
                    public void onNewLocation(String gpsData) {
                        if (gpsData.split("-").length > 1) {
                            textLatitude.setText(gpsData.split("-")[0]);
                            textLongitude.setText(gpsData.split("-")[1]);
                        } else {
                            textLatitude.setText("00");
                            textLongitude.setText("00");
                        }
                    }
                });
            }
        });


//////////////////////////////////////////// get GPS VIA DEVICE


        // to get location updates, initialize LocationResult
        this.locationResult = new LocationHelper.LocationResult() {
            @Override
            public void gotLocation(Location location) {

                //Got the location!
                if (location != null) {

                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();


                    textLatitude.setText(latitude + "");
                    textLongitude.setText(longitude + "");

                    locationHelper.stopGettingLocationUpdates();
                    // here you can save the latitude and longitude values
                    // maybe in your text file or database
                    progressBar.dismiss();
                } else {
                    //Toast.makeText(getApplicationContext.this,"Kindly Turn ON Device GPS",Toast.LENGTH_LONG).show();
                    progressBar.dismiss();
                }

            }

        };
        // initialize our useful class,
        this.locationHelper = new LocationHelper();
        mBtnGpsDeviice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {


                    progressBar = new ProgressDialog(getActivity());
                    progressBar.setMessage("Searching for GPS coordinates...");
                    progressBar.setCancelable(false);
                    progressBar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialogInterface) {

                        }
                    });
                    progressBar.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            locationHelper.stopGettingLocationUpdates();
                            dialog.dismiss();
                        }
                    });
                    progressBar.show();


                    locationHelper.getLocation(getActivity(), locationResult);

                } catch (Exception e) {
                    Toast.makeText(getContext(), "Exception", Toast.LENGTH_LONG).show();
                }
            }

        });


        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Section Completed");
                builder.setMessage("Do you want to SUBMIT this section. Please note that " +
                        "NO CHANGES will be allowed once submitted");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                        if (!validateInput()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                            builder.setTitle("Invalid Data");
                            builder.setMessage("Please enter Correct data e.g 00.00");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).show();

                            return;
                        }


                        // Hide Kyebord
                        hidekybord.hideKeyboard(getActivity());

                        Validation.A2 = textLatitude.getText().toString().trim();
                        Validation.A3 = textLongitude.getText().toString().trim();


                        //swipe to next Section
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ftu = fm.beginTransaction();
                        Fragment_A idFrgment = new Fragment_A();
                        ftu.replace(R.id.frag_container, idFrgment).commit();


                        dialogInterface.dismiss();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
            }
        });


        return v;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (QuestionModel.quest.get("b") == null) {
            // clearData();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    boolean validateInput() {
        if (textLatitude.getText().toString().trim().isEmpty() ||
                textLongitude.getText().toString().trim().isEmpty()) {
            return false;
        } else {

            String b1 = textLatitude.getText().toString().trim();
            String b2 = textLongitude.getText().toString().trim();


            if (b1.length() > 4) {

                try {
                    String[] v1 = b1.split("\\.");


                    if (v1[0].length() != 2 || v1[1].length() < 2) {

                        Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);

                        return false;

                    }
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);

                    return false;
                }
            } else {
                Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);
                return false;
            }


            if (b2.length() > 4) {


                try {
                    String[] v1 = b2.split("\\.");
                    if (v1[0].length() != 2 || v1[1].length() < 2) {

                        Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);

                        return false;

                    }
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);

                    return false;
                }

            } else {
                Toast.makeText(getContext(), "Kindly Make GPS in Format like 00.00", Toast.LENGTH_LONG);
                return false;
            }


        }
        return true;
    }

    void populateCachedData() {
        if (QuestionModel.quest.containsKey("b")) {
            HashMap<String, List<String>> map = QuestionModel.quest.get("b");
            textLatitude.setText(map.get("b1").get(0));
            textLongitude.setText(map.get("b2").get(0));
        }
    }

    void clearData() {
        textLatitude.setText("");
        textLongitude.setText("");
    }

    void addToPending() {

       /* HashMap<String, List<String>> map = new HashMap<>();

        map.put("b1", new ArrayList<String>());
        map.get("b1").add(textLatitude.getText().toString().trim());
        map.put("b2", new ArrayList<String>());
        map.get("b2").add(textLongitude.getText().toString().trim());
        QuestionModel.quest.put("b", map);


        */

        HhMemberModel.B1 = textLatitude.getText().toString().trim();

        HhMemberModel.B2 = textLongitude.getText().toString().trim();

    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

}
