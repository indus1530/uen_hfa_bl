package edu.aku.abdulsajid.uen_hfa_bl;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_I;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_I extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region LinerLayout
    LinearLayout
            lv_I1,
            lv_I2,
            lv_I3,
            lv_I4,
            lv_I5,
            lv_I6,
            lv_I7,
            lv_I8,
            lv_I9,
            lv_I10,
            lv_I11,
            lv_I12,
            lv_I13,
            lv_I14,
            lv_I15,
            lv_sub_main;


    //endregion

    //region RadioButton
    RadioButton
            R_I1_yes,
            R_I1_no,
            R_I2_1,
            R_I2_2,
            R_I2_3,
            R_I2_4,
            R_I2_5,
            R_I2_6,
            R_I2_7,
            R_I2_8,
            R_I5_yes,
            R_I5_no,
            R_I6_1,
            R_I6_2,
            R_I6_3,
            R_I6_4,
            R_I6_5,
            R_I6_6,
            R_I6_7,

    R_I7_yes,
            R_I7_no,
            R_I8_yes,
            R_I8_no,
            R_I9_yes,
            R_I9_no,
            R_I11_yes,
            R_I11_no,
            R_I12_1,
            R_I12_2,
            R_I12_3,
            R_I12_4,
            R_I12_5,
            R_I12_6,
            R_I12_7,
            R_I13_yes,
            R_I13_no,
            R_I14_1,
            R_I14_2,
            R_I14_3,
            R_I14_4,
            R_I14_5,
            R_I14_6,
            R_I14_7,
            R_I14_8;


    //endregion

    //region Checkboxx

    CheckBox
            C_I4_1,
            C_I4_2,
            C_I4_3,
            C_I4_4;


    //endregion

    //region Editext
    EditText
            ed_i4_5,
            ed_I10,
            ed_I12_7,
            ed_I14_7;


    //endregion

    //region Button

    Button
            b_I3,
            b_I15;

    //endregion


    //region Sting


    String
            I1,
            I2,
            I3,
            I4_1,
            I4_2,
            I4_3,
            I4_4,
            I4_5,
            I5,
            I6,
            I7,
            I8,
            I9,
            I10,
            I11,
            I12,
            I13,
            I14,
            I15;


    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_I() {
    }

    public static Fragment_I newInstance(String param1, String param2) {
        Fragment_I fragment = new Fragment_I();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_i, container, false);


        initalzierEditextview(v);
        initializeLinerlayout(v);
        initializerRadiobutton(v);
        initialzierCheckbox(v);


        R_I1_yes.setOnCheckedChangeListener(this);
        R_I1_no.setOnCheckedChangeListener(this);

        R_I2_1.setOnCheckedChangeListener(this);
        R_I2_2.setOnCheckedChangeListener(this);
        R_I2_3.setOnCheckedChangeListener(this);
        R_I2_4.setOnCheckedChangeListener(this);
        R_I2_5.setOnCheckedChangeListener(this);
        R_I2_6.setOnCheckedChangeListener(this);
        R_I2_7.setOnCheckedChangeListener(this);
        R_I2_8.setOnCheckedChangeListener(this);

        R_I5_yes.setOnCheckedChangeListener(this);
        R_I5_no.setOnCheckedChangeListener(this);

        R_I9_yes.setOnCheckedChangeListener(this);
        R_I9_no.setOnCheckedChangeListener(this);

        R_I11_yes.setOnCheckedChangeListener(this);
        R_I11_no.setOnCheckedChangeListener(this);

        // R_I13_yes.setOnCheckedChangeListener(this);
        // R_I13_no.setOnCheckedChangeListener(this);


        R_I12_1.setOnCheckedChangeListener(this);
        R_I12_2.setOnCheckedChangeListener(this);
        R_I12_3.setOnCheckedChangeListener(this);
        R_I12_4.setOnCheckedChangeListener(this);
        R_I12_5.setOnCheckedChangeListener(this);
        R_I12_6.setOnCheckedChangeListener(this);
        R_I12_7.setOnCheckedChangeListener(this);

        R_I14_1.setOnCheckedChangeListener(this);
        R_I14_2.setOnCheckedChangeListener(this);
        R_I14_3.setOnCheckedChangeListener(this);
        R_I14_4.setOnCheckedChangeListener(this);
        R_I14_5.setOnCheckedChangeListener(this);
        R_I14_6.setOnCheckedChangeListener(this);
        R_I14_7.setOnCheckedChangeListener(this);
        R_I14_8.setOnCheckedChangeListener(this);


        //region Button Evensts

        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ValidationIamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                if (Asingvalues() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "I", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_J fragment = new Fragment_J();
                ftu.replace(R.id.frag_container, fragment).commit();


            }
        });


        b_I3 = (Button) v.findViewById(R.id.b_I3);
        b_I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        b_I3.setText(y + "/" + (m + 1) + "/" + d);
                    }
                }, 2017, 06, 1);
                dialog.show();
            }
        });

        b_I15 = (Button) v.findViewById(R.id.b_I15);
        b_I15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        b_I15.setText(y + "/" + (m + 1) + "/" + d);
                    }
                }, 2017, 06, 1);
                dialog.show();
            }
        });


        //endregion


        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
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
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.R_I1_yes || compoundButton.getId() == R.id.R_I1_no) {

            if (R_I1_yes.isChecked()) {

                lv_I2.setVisibility(View.VISIBLE);
                lv_I3.setVisibility(View.VISIBLE);
                lv_I4.setVisibility(View.VISIBLE);
                lv_I5.setVisibility(View.VISIBLE);
                lv_I6.setVisibility(View.VISIBLE);
                lv_I7.setVisibility(View.VISIBLE);
                lv_I8.setVisibility(View.VISIBLE);
                lv_I9.setVisibility(View.VISIBLE);
                lv_I10.setVisibility(View.VISIBLE);
                lv_I11.setVisibility(View.VISIBLE);
                lv_I12.setVisibility(View.VISIBLE);
                lv_I13.setVisibility(View.VISIBLE);
                lv_I14.setVisibility(View.VISIBLE);
                lv_I15.setVisibility(View.VISIBLE);


            } else {
                lv_I2.setVisibility(View.GONE);
                lv_I3.setVisibility(View.GONE);
                lv_I4.setVisibility(View.GONE);
                lv_I5.setVisibility(View.GONE);
                lv_I6.setVisibility(View.GONE);
                lv_I7.setVisibility(View.GONE);
                lv_I8.setVisibility(View.GONE);
                lv_I9.setVisibility(View.GONE);
                lv_I10.setVisibility(View.GONE);
                lv_I11.setVisibility(View.GONE);
                lv_I12.setVisibility(View.GONE);
                lv_I13.setVisibility(View.GONE);
                lv_I14.setVisibility(View.GONE);
                lv_I15.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_I2);
                b_I3.setText("Select Date");
                ClearAllcontrol.ClearAll(lv_I4);
                ClearAllcontrol.ClearAll(lv_I5);
                ClearAllcontrol.ClearAll(lv_I6);
                ClearAllcontrol.ClearAll(lv_I7);
                ClearAllcontrol.ClearAll(lv_I8);
                ClearAllcontrol.ClearAll(lv_I9);
                ClearAllcontrol.ClearAll(lv_I10);
                ClearAllcontrol.ClearAll(lv_I11);
                ClearAllcontrol.ClearAll(lv_I12);
                ClearAllcontrol.ClearAll(lv_I13);
                ClearAllcontrol.ClearAll(lv_I14);
                b_I15.setText("Select Date");
            }
        }


        if (compoundButton.getId() == R.id.R_I2_1 || compoundButton.getId() == R.id.R_I2_2 ||
                compoundButton.getId() == R.id.R_I2_3 || compoundButton.getId() == R.id.R_I2_4 ||
                compoundButton.getId() == R.id.R_I2_5 || compoundButton.getId() == R.id.R_I2_6 ||
                compoundButton.getId() == R.id.R_I2_7 || compoundButton.getId() == R.id.R_I2_8) {


            if (R_I2_8.isChecked()) {
                lv_I3.setVisibility(View.GONE);
                lv_I4.setVisibility(View.GONE);
                lv_I5.setVisibility(View.GONE);

                b_I3.setText("Select Date");
                ClearAllcontrol.ClearAll(lv_I4);
                ClearAllcontrol.ClearAll(lv_I5);


            } else {
                lv_I3.setVisibility(View.VISIBLE);
                lv_I4.setVisibility(View.VISIBLE);
                lv_I5.setVisibility(View.VISIBLE);

            }
        }

        if (compoundButton.getId() == R.id.R_I5_yes || compoundButton.getId() == R.id.R_I5_no) {
            if (R_I5_yes.isChecked()) {
                lv_I6.setVisibility(View.VISIBLE);

            } else {
                lv_I6.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_I6);
            }
        }
        if (compoundButton.getId() == R.id.R_I9_yes || compoundButton.getId() == R.id.R_I9_no) {
            if (R_I9_yes.isChecked()) {
                lv_I10.setVisibility(View.VISIBLE);
            } else {
                lv_I10.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_I10);
            }
        }

        if (compoundButton.getId() == R.id.R_I11_yes || compoundButton.getId() == R.id.R_I11_no) {
            if (R_I11_yes.isChecked()) {
                lv_I12.setVisibility(View.VISIBLE);
                lv_I13.setVisibility(View.VISIBLE);
                // lv_I14.setVisibility(View.VISIBLE);
                //   lv_I15.setVisibility(View.VISIBLE);
            } else {
                lv_I12.setVisibility(View.GONE);
                lv_I13.setVisibility(View.GONE);
                // lv_I14.setVisibility(View.GONE);
                //lv_I15.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_I12);
                ClearAllcontrol.ClearAll(lv_I13);
                // ClearAllcontrol.ClearAll(lv_I14);
                //  b_I15.setText("Select Date");
            }
        }

        if (compoundButton.getId() == R.id.R_I13_yes || compoundButton.getId() == R.id.R_I13_no) {
            if (R_I13_yes.isChecked()) {

                lv_I14.setVisibility(View.VISIBLE);
                lv_I15.setVisibility(View.VISIBLE);
            } else {

                lv_I14.setVisibility(View.GONE);
                lv_I15.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_I14);
                b_I15.setText("Select Date");
            }
        }


        if (compoundButton.getId() == R.id.R_I12_1 || compoundButton.getId() == R.id.R_I12_2 ||
                compoundButton.getId() == R.id.R_I12_3 || compoundButton.getId() == R.id.R_I12_4 ||
                compoundButton.getId() == R.id.R_I12_5 || compoundButton.getId() == R.id.R_I12_6 ||
                compoundButton.getId() == R.id.R_I12_7) {

            if (R_I12_7.isChecked()) {
                ed_I12_7.setVisibility(View.VISIBLE);
            } else {
                ed_I12_7.setVisibility(View.GONE);
                ed_I12_7.setText("");
            }
        }

        if (compoundButton.getId() == R.id.R_I14_1 || compoundButton.getId() == R.id.R_I14_2 ||
                compoundButton.getId() == R.id.R_I14_3 || compoundButton.getId() == R.id.R_I14_4 ||
                compoundButton.getId() == R.id.R_I14_5 || compoundButton.getId() == R.id.R_I14_6 ||
                compoundButton.getId() == R.id.R_I14_7 ||
                compoundButton.getId() == R.id.R_I14_8) {

            if (R_I14_8.isChecked()) {
                ed_I14_7.setVisibility(View.VISIBLE);
            } else {
                ed_I14_7.setVisibility(View.GONE);
                ed_I14_7.setText("");
            }
        }


    }

    void initializeLinerlayout(View v) {
        lv_I1 = (LinearLayout) v.findViewById(R.id.lv_I1);
        lv_I2 = (LinearLayout) v.findViewById(R.id.lv_I2);
        lv_I3 = (LinearLayout) v.findViewById(R.id.lv_I3);
        lv_I4 = (LinearLayout) v.findViewById(R.id.lv_I4);
        lv_I5 = (LinearLayout) v.findViewById(R.id.lv_I5);
        lv_I6 = (LinearLayout) v.findViewById(R.id.lv_I6);
        lv_I7 = (LinearLayout) v.findViewById(R.id.lv_I7);
        lv_I8 = (LinearLayout) v.findViewById(R.id.lv_I8);
        lv_I9 = (LinearLayout) v.findViewById(R.id.lv_I9);
        lv_I10 = (LinearLayout) v.findViewById(R.id.lv_i10);
        lv_I11 = (LinearLayout) v.findViewById(R.id.lv_I11);
        lv_I12 = (LinearLayout) v.findViewById(R.id.lv_I12);
        lv_I13 = (LinearLayout) v.findViewById(R.id.lv_I13);
        lv_I14 = (LinearLayout) v.findViewById(R.id.lv_I14);
        lv_I15 = (LinearLayout) v.findViewById(R.id.lv_I15);
        lv_sub_main = (LinearLayout) v.findViewById(R.id.lv_sub_main);
    }

    void initializerRadiobutton(View v) {

        R_I1_yes = (RadioButton) v.findViewById(R.id.R_I1_yes);
        R_I1_no = (RadioButton) v.findViewById(R.id.R_I1_no);
        R_I2_1 = (RadioButton) v.findViewById(R.id.R_I2_1);
        R_I2_2 = (RadioButton) v.findViewById(R.id.R_I2_2);
        R_I2_3 = (RadioButton) v.findViewById(R.id.R_I2_3);
        R_I2_4 = (RadioButton) v.findViewById(R.id.R_I2_4);
        R_I2_5 = (RadioButton) v.findViewById(R.id.R_I2_5);
        R_I2_6 = (RadioButton) v.findViewById(R.id.R_I2_6);
        R_I2_7 = (RadioButton) v.findViewById(R.id.R_I2_7);
        R_I2_8 = (RadioButton) v.findViewById(R.id.R_I2_8);
        R_I5_yes = (RadioButton) v.findViewById(R.id.R_I5_yes);
        R_I5_no = (RadioButton) v.findViewById(R.id.R_I5_no);
        R_I6_1 = (RadioButton) v.findViewById(R.id.R_I6_1);
        R_I6_2 = (RadioButton) v.findViewById(R.id.R_I6_2);
        R_I6_3 = (RadioButton) v.findViewById(R.id.R_I6_3);
        R_I6_4 = (RadioButton) v.findViewById(R.id.R_I6_4);
        R_I6_5 = (RadioButton) v.findViewById(R.id.R_I6_5);
        R_I6_6 = (RadioButton) v.findViewById(R.id.R_I6_6);
        R_I6_7 = (RadioButton) v.findViewById(R.id.R_I6_7);

        R_I7_yes = (RadioButton) v.findViewById(R.id.R_I7_yes);
        R_I7_no = (RadioButton) v.findViewById(R.id.R_I7_no);
        R_I8_yes = (RadioButton) v.findViewById(R.id.R_I8_yes);
        R_I8_no = (RadioButton) v.findViewById(R.id.R_I8_no);
        R_I9_yes = (RadioButton) v.findViewById(R.id.R_I9_yes);
        R_I9_no = (RadioButton) v.findViewById(R.id.R_I9_no);
        R_I11_yes = (RadioButton) v.findViewById(R.id.R_I11_yes);
        R_I11_no = (RadioButton) v.findViewById(R.id.R_I11_no);
        R_I12_1 = (RadioButton) v.findViewById(R.id.R_I12_1);
        R_I12_2 = (RadioButton) v.findViewById(R.id.R_I12_2);
        R_I12_3 = (RadioButton) v.findViewById(R.id.R_I12_3);
        R_I12_4 = (RadioButton) v.findViewById(R.id.R_I12_4);
        R_I12_5 = (RadioButton) v.findViewById(R.id.R_I12_5);
        R_I12_6 = (RadioButton) v.findViewById(R.id.R_I12_6);
        R_I12_7 = (RadioButton) v.findViewById(R.id.R_I12_7);
        R_I13_yes = (RadioButton) v.findViewById(R.id.R_I13_yes);
        R_I13_no = (RadioButton) v.findViewById(R.id.R_I13_no);
        R_I14_1 = (RadioButton) v.findViewById(R.id.R_I14_1);
        R_I14_2 = (RadioButton) v.findViewById(R.id.R_I14_2);
        R_I14_3 = (RadioButton) v.findViewById(R.id.R_I14_3);
        R_I14_4 = (RadioButton) v.findViewById(R.id.R_I14_4);
        R_I14_5 = (RadioButton) v.findViewById(R.id.R_I14_5);
        R_I14_6 = (RadioButton) v.findViewById(R.id.R_I14_6);
        R_I14_7 = (RadioButton) v.findViewById(R.id.R_I14_7);
        R_I14_8 = (RadioButton) v.findViewById(R.id.R_I14_8);

    }

    void initialzierCheckbox(View v) {
        C_I4_1 = (CheckBox) v.findViewById(R.id.C_I4_1);
        C_I4_2 = (CheckBox) v.findViewById(R.id.C_I4_2);
        C_I4_3 = (CheckBox) v.findViewById(R.id.C_I4_3);
        C_I4_4 = (CheckBox) v.findViewById(R.id.C_I4_4);
    }

    void initalzierEditextview(View v) {
        ed_i4_5 = (EditText) v.findViewById(R.id.ed_i4_5);
        ed_I10 = (EditText) v.findViewById(R.id.ed_I10);
        ed_I12_7 = (EditText) v.findViewById(R.id.ed_I12_7);
        ed_I14_7 = (EditText) v.findViewById(R.id.ed_I14_7);
    }

    boolean Asingvalues() {
        if (R_I1_yes.isChecked()) {
            I1 = "1";
        } else if (R_I1_no.isChecked()) {
            I1 = "2";
        } else {
            I1 = "999";
        }

        if (R_I2_1.isChecked()) {
            I2 = "1";
        } else if (R_I2_2.isChecked()) {
            I2 = "2";
        } else if (R_I2_3.isChecked()) {
            I2 = "3";
        } else if (R_I2_4.isChecked()) {
            I2 = "4";
        } else if (R_I2_5.isChecked()) {
            I2 = "5";
        } else if (R_I2_6.isChecked()) {
            I2 = "6";
        } else if (R_I2_7.isChecked()) {
            I2 = "7";
        } else if (R_I2_8.isChecked()) {
            I2 = "8";
        } else {
            I2 = "999";
        }


        if (b_I3.getText().toString().trim().equals("Select Date")) {
            I3 = "999";
        } else {
            I3 = b_I3.getText().toString().trim();

        }

        if (C_I4_1.isChecked()) {
            I4_1 = "1";
        } else {
            I4_1 = "999";
        }
        if (C_I4_2.isChecked()) {
            I4_2 = "1";
        } else {
            I4_2 = "999";
        }
        if (C_I4_3.isChecked()) {
            I4_3 = "1";
        } else {
            I4_3 = "999";
        }

        if (C_I4_4.isChecked()) {
            I4_4 = "1";
        } else {
            I4_4 = "999";
        }

        if (ed_i4_5.getText().toString().trim().length() > 0) {
            I4_5 = ed_i4_5.getText().toString().trim();
        } else {
            I4_5 = "999";
        }

        if (R_I5_yes.isChecked()) {
            I5 = "1";
        } else if (R_I5_no.isChecked()) {
            I5 = "2";
        } else {
            I5 = "999";
        }


        if (R_I6_1.isChecked()) {
            I6 = "1";
        } else if (R_I6_2.isChecked()) {
            I6 = "2";
        } else if (R_I6_3.isChecked()) {
            I6 = "3";
        } else if (R_I6_4.isChecked()) {
            I6 = "4";
        } else if (R_I6_5.isChecked()) {
            I6 = "5";
        } else if (R_I6_6.isChecked()) {
            I6 = "6";
        } else if (R_I6_7.isChecked()) {
            I6 = "7";
        } else {
            I6 = "999";
        }

        if (R_I7_yes.isChecked()) {
            I7 = "1";
        } else if (R_I7_no.isChecked()) {
            I7 = "2";
        } else {
            I7 = "999";
        }

        if (R_I8_yes.isChecked()) {
            I8 = "1";
        } else if (R_I8_no.isChecked()) {
            I8 = "2";
        } else {
            I8 = "999";
        }

        if (R_I9_yes.isChecked()) {
            I9 = "1";
        } else if (R_I9_no.isChecked()) {
            I9 = "2";
        } else {
            I9 = "999";
        }

        if (ed_I10.getText().toString().trim().length() > 0) {
            I10 = ed_I10.getText().toString().trim();
        } else {
            I10 = "999";
        }

        if (R_I11_yes.isChecked()) {
            I11 = "1";
        } else if (R_I11_no.isChecked()) {
            I11 = "2";
        } else {
            I11 = "999";
        }


        if (R_I12_1.isChecked()) {
            I12 = "1";
        } else if (R_I12_2.isChecked()) {
            I12 = "2";
        } else if (R_I12_3.isChecked()) {
            I12 = "3";
        } else if (R_I12_4.isChecked()) {
            I12 = "4";
        } else if (R_I12_5.isChecked()) {
            I12 = "5";
        } else if (R_I12_6.isChecked()) {
            I12 = "6";
        } else if (R_I12_7.isChecked()) {

            if (ed_I12_7.getText().toString().trim().length() > 0) {
                I12 = ed_I12_7.getText().toString().trim();
            } else {
                ed_I12_7.setError("Endter Text");
                ed_I12_7.requestFocus();

                return false;
            }

        } else {
            I12 = "999";
        }

        if (R_I13_yes.isChecked()) {
            I13 = "1";

        } else if (R_I13_no.isChecked()) {
            I13 = "2";
        } else {
            I13 = "999";
        }


        if (R_I14_1.isChecked()) {
            I14 = "1";
        } else if (R_I14_2.isChecked()) {
            I14 = "2";
        } else if (R_I14_3.isChecked()) {
            I14 = "3";
        } else if (R_I14_4.isChecked()) {
            I14 = "4";
        } else if (R_I14_5.isChecked()) {
            I14 = "5";
        } else if (R_I14_6.isChecked()) {
            I14 = "6";
        } else if (R_I14_7.isChecked()) {
            I14 = "7";
        } else if (R_I14_8.isChecked()) {

            if (ed_I14_7.getText().toString().trim().length() > 0) {
                I14 = ed_I14_7.getText().toString().trim();
            } else {
                ed_I14_7.setError("Endter Text");
                ed_I14_7.requestFocus();

                return false;
            }

        } else {
            I14 = "999";
        }


        if (b_I15.getText().toString().trim().equals("Select Date")) {
            I15 = "999";
        } else {
            I15 = b_I15.getText().toString().trim();

        }


        return true;

    }

    boolean ValidationIamgood() {
        if (Gothrough.IamHiden(lv_I1) == false) {
            return false;

        }
        if (Gothrough.IamHiden(lv_I2) == false) {
            return false;

        }

        if (lv_I3.getVisibility() == View.VISIBLE) {

            String tt = b_I3.getText().toString().trim();
            if (tt.equals("Select Date")) {
                b_I3.setError("Select Date");
                b_I3.requestFocus();
                return false;

            }
            b_I3.setError(null);
        }

        if (Gothrough.IamHiden(lv_I4) == false) {
            return false;

        }
        if (Gothrough.IamHiden(lv_I5) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I6) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I7) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I8) == false) {
            return false;

        }


        if (Gothrough.IamHiden(lv_I9) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I10) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I11) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I12) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I13) == false) {
            return false;

        }

        if (Gothrough.IamHiden(lv_I14) == false) {
            return false;

        }

        if (lv_I15.getVisibility() == View.VISIBLE) {

            String tt = b_I15.getText().toString().trim();
            if (tt.equals("Select Date")) {
                b_I15.setError("Select Date");
                b_I15.requestFocus();
                return false;

            }
            b_I15.setError(null);
        }


        return true;


    }

    boolean updateHFA() {
        String query = "update  hfa set " +

                col_I.I1 + "='" + I1 + "'," +
                col_I.I2 + "='" + I2 + "'," +
                col_I.I3 + "='" + I3 + "'," +
                col_I.I4_1 + "='" + I4_1 + "'," +
                col_I.I4_2 + "='" + I4_2 + "'," +
                col_I.I4_3 + "='" + I4_3 + "'," +
                col_I.I4_4 + "='" + I4_4 + "'," +
                col_I.I4_5 + "='" + I4_5 + "'," +
                col_I.I5 + "='" + I5 + "'," +
                col_I.I6 + "='" + I6 + "'," +
                col_I.I7 + "='" + I7 + "'," +
                col_I.I8 + "='" + I8 + "'," +
                col_I.I9 + "='" + I9 + "'," +
                col_I.I10 + "='" + I10 + "'," +
                col_I.I11 + "='" + I11 + "'," +
                col_I.I12 + "='" + I12 + "'," +
                col_I.I13 + "='" + I13 + "'," +
                col_I.I14 + "='" + I14 + "'," +
                col_I.I15 + "='" + I15 + "'" +
                " Where id=" + Validation.HFAPK;


        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

        return true;


    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
