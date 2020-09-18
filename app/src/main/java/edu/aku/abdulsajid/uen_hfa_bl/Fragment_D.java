package edu.aku.abdulsajid.uen_hfa_bl;

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
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_D;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_D extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region RadioButton

    RadioButton
            R_D1_yes,
            R_D1_no,
            r_d2_yes,
            r_d2_no,
            R_D3_1,
            R_D3_2,
            R_D3_3,
            R_D3_4,
            R_D3_5,
            r_D4_yes,
            r_D4_no,
            r_D5_yes,
            r_D5_no,
            R_D6_1,
            R_D6_2,
            R_D6_3,
            R_D6_4,
            R_D6_5;


    //endregion


    //region Linerlayout

    LinearLayout
            lv_D1,
            lv_D2,
            lv_D3,
            lv_D4,
            lv_D5,
            lv_D6;


    //endregion


    //region String

    String
            D1,
            D2,
            D3,
            D4,
            D5,
            D6;
    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_D() {
    }

    public static Fragment_D newInstance(String param1, String param2) {
        Fragment_D fragment = new Fragment_D();

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


        View v = inflater.inflate(R.layout.fragment_d, container, false);

        initializerLinerlayout(v);
        initiaRadiobutton(v);


        R_D1_yes.setOnCheckedChangeListener(this);
        R_D1_no.setOnCheckedChangeListener(this);
        r_d2_yes.setOnCheckedChangeListener(this);
        r_d2_no.setOnCheckedChangeListener(this);
        r_D5_yes.setOnCheckedChangeListener(this);
        r_D5_no.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                asignvalues();

                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "D", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_E fragment = new Fragment_E();
                ftu.replace(R.id.frag_container, fragment).commit();


            }
        });

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

        if (compoundButton.getId() == R.id.R_D1_yes || compoundButton.getId() == R.id.R_D1_no) {

            if (R_D1_no.isChecked()) {
                lv_D2.setVisibility(View.GONE);
                lv_D3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_D2);
                ClearAllcontrol.ClearAll(lv_D3);
            } else {
                lv_D2.setVisibility(View.VISIBLE);
                lv_D3.setVisibility(View.VISIBLE);
            }

        }

        if (compoundButton.getId() == R.id.r_d2_yes || compoundButton.getId() == R.id.r_d2_no) {

            if (r_d2_no.isChecked()) {

                lv_D3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_D3);
            } else {

                lv_D3.setVisibility(View.VISIBLE);
            }

        }

        if (compoundButton.getId() == R.id.r_D5_yes || compoundButton.getId() == R.id.r_D5_no) {

            if (r_D5_no.isChecked()) {

                lv_D6.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_D6);
            } else {

                lv_D6.setVisibility(View.VISIBLE);
            }

        }

    }

    void initiaRadiobutton(View v) {
        R_D1_yes = (RadioButton) v.findViewById(R.id.R_D1_yes);
        R_D1_no = (RadioButton) v.findViewById(R.id.R_D1_no);
        r_d2_yes = (RadioButton) v.findViewById(R.id.r_d2_yes);
        r_d2_no = (RadioButton) v.findViewById(R.id.r_d2_no);
        R_D3_1 = (RadioButton) v.findViewById(R.id.R_D3_1);
        R_D3_2 = (RadioButton) v.findViewById(R.id.R_D3_2);
        R_D3_3 = (RadioButton) v.findViewById(R.id.R_D3_3);
        R_D3_4 = (RadioButton) v.findViewById(R.id.R_D3_4);
        R_D3_5 = (RadioButton) v.findViewById(R.id.R_D3_5);
        r_D4_yes = (RadioButton) v.findViewById(R.id.r_D4_yes);
        r_D4_no = (RadioButton) v.findViewById(R.id.r_D4_no);
        r_D5_yes = (RadioButton) v.findViewById(R.id.r_D5_yes);
        r_D5_no = (RadioButton) v.findViewById(R.id.r_D5_no);
        R_D6_1 = (RadioButton) v.findViewById(R.id.R_D6_1);
        R_D6_2 = (RadioButton) v.findViewById(R.id.R_D6_2);
        R_D6_3 = (RadioButton) v.findViewById(R.id.R_D6_3);
        R_D6_4 = (RadioButton) v.findViewById(R.id.R_D6_4);
        R_D6_5 = (RadioButton) v.findViewById(R.id.R_D6_5);
    }

    void initializerLinerlayout(View v) {

        lv_D1 = (LinearLayout) v.findViewById(R.id.lv_D1);
        lv_D2 = (LinearLayout) v.findViewById(R.id.lv_D2);
        lv_D3 = (LinearLayout) v.findViewById(R.id.lv_D3);
        lv_D4 = (LinearLayout) v.findViewById(R.id.lv_D4);
        lv_D5 = (LinearLayout) v.findViewById(R.id.lv_D5);
        lv_D6 = (LinearLayout) v.findViewById(R.id.lv_D6);

    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_D1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_D2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_D3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_D4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_D5) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_D6) != false;
    }

    void asignvalues() {
        if (R_D1_yes.isChecked()) {
            D1 = "1";
        } else if (R_D1_no.isChecked()) {
            D1 = "2";
        } else {
            D1 = "999";
        }

        if (r_d2_yes.isChecked()) {
            D2 = "1";
        } else if (r_d2_no.isChecked()) {
            D2 = "2";
        } else {
            D2 = "999";
        }


        if (R_D3_1.isChecked()) {
            D3 = "1";
        } else if (R_D3_2.isChecked()) {
            D3 = "2";
        } else if (R_D3_3.isChecked()) {
            D3 = "3";
        } else if (R_D3_4.isChecked()) {
            D3 = "4";
        } else if (R_D3_5.isChecked()) {
            D3 = "5";
        } else {
            D3 = "999";
        }

        if (r_D4_yes.isChecked()) {
            D4 = "1";
        } else if (r_D4_no.isChecked()) {
            D4 = "2";
        } else {
            D4 = "999";
        }

        if (r_D5_yes.isChecked()) {
            D5 = "1";
        } else if (r_D5_no.isChecked()) {
            D5 = "2";
        } else {
            D5 = "999";
        }

        if (R_D6_1.isChecked()) {
            D6 = "1";
        } else if (R_D6_2.isChecked()) {
            D6 = "2";
        } else if (R_D6_3.isChecked()) {
            D6 = "3";
        } else if (R_D6_4.isChecked()) {
            D6 = "4";
        } else if (R_D6_5.isChecked()) {
            D6 = "5";
        } else {
            D6 = "999";
        }
    }

    void updateHFA() {
        String query = "update  hfa set " +
                col_D.D1 + "='" + D1 + "'," +
                col_D.D2 + "='" + D2 + "'," +
                col_D.D3 + "='" + D3 + "'," +
                col_D.D4 + "='" + D4 + "'," +
                col_D.D5 + "='" + D5 + "'," +
                col_D.D6 + "='" + D6 + "'" +
                " Where id=" + Validation.HFAPK;
        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();


    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
