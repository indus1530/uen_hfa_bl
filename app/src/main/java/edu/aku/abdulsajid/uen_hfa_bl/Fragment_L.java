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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_L;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_L extends Fragment implements RadioButton.OnCheckedChangeListener {


    // region  RadioButton


    RadioButton

            R_L1_1,
            R_L1_2,
            R_L1_3,
            R_L1_4,
            R_L2_1,
            R_L2_2,
            R_L2_3,
            R_L2_4,
            R_L3_yes,
            R_L3_No,
            R_L4_yes,
            R_L4_No,
            R_L10_yes,
            R_L10_No,
            R_L12_yes,
            R_L12_No;


    //endregion


    //region Checkbox

    CheckBox
            C_L5_1,
            C_L5_2,
            C_L5_3,
            C_L5_4,
            C_L5_5,
            C_L5_6,

    C_L6_1,
            C_L6_2,
            C_L6_3,
            C_L6_4,
            C_L6_5,
            C_L6_6,

    C_L7_1,
            C_L7_2,
            C_L7_3,
            C_L7_4,
            C_L7_5,
            C_L7_6,

    C_L8_1,
            C_L8_2,
            C_L8_3,
            C_L8_4,
            C_L8_5,
            C_L8_6,

    C_L9_1,
            C_L9_2,
            C_L9_3,
            C_L9_4,
            C_L9_5,
            C_L9_6,

    C_L11_1,
            C_L11_2,
            C_L11_3,
            C_L11_4,
            C_L11_5,
            C_L11_6,
            C_L13_1,
            C_L13_2,
            C_L13_3,
            C_L13_4,
            C_L13_5,
            C_L13_6;


    //endregion

    //region Editextview

    EditText
            ET_L5_7,
            ET_L6_7,
            ET_L7_7,
            ET_L8_7,
            ET_L9_7,
            ET_L13_7;


    //endregion

    //region Linearlayout

    LinearLayout
            lv_L1,
            lv_L2,
            lv_L3,
            lv_L4,
            lv_L5,
            lv_L6,
            lv_L7,
            lv_L8,
            lv_L9,
            lv_L10,
            lv_L11,
            lv_L12,
            lv_L13;


    //endregion


    //region String

    String
            L1,
            L2,
            L3,
            L4,
            L5_1,
            L5_2,
            L5_3,
            L5_4,
            L5_5,
            L5_6,
            L5_7,
            L6_1,
            L6_2,
            L6_3,
            L6_4,
            L6_5,
            L6_6,
            L6_7,
            L7_1,
            L7_2,
            L7_3,
            L7_4,
            L7_5,
            L7_6,
            L7_7,
            L8_1,
            L8_2,
            L8_3,
            L8_4,
            L8_5,
            L8_6,
            L8_7,
            L9_1,
            L9_2,
            L9_3,
            L9_4,
            L9_5,
            L9_6,
            L9_7,
            L10,
            L11_1,
            L11_2,
            L11_3,
            L11_4,
            L11_5,
            L11_6,
            L12,
            L13_1,
            L13_2,
            L13_3,
            L13_4,
            L13_5,
            L13_6,
            L13_7;


    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_L() {
    }

    public static Fragment_L newInstance(String param1, String param2) {
        Fragment_L fragment = new Fragment_L();

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


        View v = inflater.inflate(R.layout.fragment_l, container, false);


        intializeEditeview(v);
        initalCheckbox(v);
        initalizeLinearlayout(v);
        initalizeRadiobutton(v);


        R_L10_yes.setOnCheckedChangeListener(this);
        R_L10_No.setOnCheckedChangeListener(this);
        R_L12_yes.setOnCheckedChangeListener(this);
        R_L12_No.setOnCheckedChangeListener(this);

        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                if (Asignvalues() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "L", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_M fragment = new Fragment_M();
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

        if (compoundButton.getId() == R.id.R_L10_No || compoundButton.getId() == R.id.R_L10_yes) {

            if (R_L10_yes.isChecked()) {
                lv_L11.setVisibility(View.VISIBLE);
            } else {
                lv_L11.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_L11);
            }


        }

        if (compoundButton.getId() == R.id.R_L12_No || compoundButton.getId() == R.id.R_L12_yes) {

            if (R_L12_yes.isChecked()) {
                lv_L13.setVisibility(View.VISIBLE);
            } else {
                lv_L13.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_L13);
            }


        }
    }

    void initalizeLinearlayout(View v) {

        lv_L1 = (LinearLayout) v.findViewById(R.id.lv_L1);
        lv_L2 = (LinearLayout) v.findViewById(R.id.lv_L2);
        lv_L3 = (LinearLayout) v.findViewById(R.id.lv_L3);
        lv_L4 = (LinearLayout) v.findViewById(R.id.lv_L4);
        lv_L5 = (LinearLayout) v.findViewById(R.id.lv_L5);
        lv_L6 = (LinearLayout) v.findViewById(R.id.lv_L6);
        lv_L7 = (LinearLayout) v.findViewById(R.id.lv_L7);
        lv_L8 = (LinearLayout) v.findViewById(R.id.lv_L8);
        lv_L9 = (LinearLayout) v.findViewById(R.id.lv_L9);
        lv_L10 = (LinearLayout) v.findViewById(R.id.lv_L10);
        lv_L11 = (LinearLayout) v.findViewById(R.id.lv_L11);
        lv_L12 = (LinearLayout) v.findViewById(R.id.lv_L12);
        lv_L13 = (LinearLayout) v.findViewById(R.id.lv_L13);
    }

    void initalizeRadiobutton(View v) {
        R_L1_1 = (RadioButton) v.findViewById(R.id.R_L1_1);
        R_L1_2 = (RadioButton) v.findViewById(R.id.R_L1_2);
        R_L1_3 = (RadioButton) v.findViewById(R.id.R_L1_3);
        R_L1_4 = (RadioButton) v.findViewById(R.id.R_L1_4);
        R_L2_1 = (RadioButton) v.findViewById(R.id.R_L2_1);
        R_L2_2 = (RadioButton) v.findViewById(R.id.R_L2_2);
        R_L2_3 = (RadioButton) v.findViewById(R.id.R_L2_3);
        R_L2_4 = (RadioButton) v.findViewById(R.id.R_L2_4);
        R_L3_yes = (RadioButton) v.findViewById(R.id.R_L3_yes);
        R_L3_No = (RadioButton) v.findViewById(R.id.R_L3_No);
        R_L4_yes = (RadioButton) v.findViewById(R.id.R_L4_yes);
        R_L4_No = (RadioButton) v.findViewById(R.id.R_L4_no);
        R_L10_yes = (RadioButton) v.findViewById(R.id.R_L10_yes);
        R_L10_No = (RadioButton) v.findViewById(R.id.R_L10_No);
        R_L12_yes = (RadioButton) v.findViewById(R.id.R_L12_yes);
        R_L12_No = (RadioButton) v.findViewById(R.id.R_L12_No);
    }

    void initalCheckbox(View v) {
        C_L5_1 = (CheckBox) v.findViewById(R.id.C_L5_1);
        C_L5_2 = (CheckBox) v.findViewById(R.id.C_L5_2);
        C_L5_3 = (CheckBox) v.findViewById(R.id.C_L5_3);
        C_L5_4 = (CheckBox) v.findViewById(R.id.C_L5_4);
        C_L5_5 = (CheckBox) v.findViewById(R.id.C_L5_5);
        C_L5_6 = (CheckBox) v.findViewById(R.id.C_L5_6);
        C_L6_1 = (CheckBox) v.findViewById(R.id.C_L6_1);
        C_L6_2 = (CheckBox) v.findViewById(R.id.C_L6_2);
        C_L6_3 = (CheckBox) v.findViewById(R.id.C_L6_3);
        C_L6_4 = (CheckBox) v.findViewById(R.id.C_L6_4);
        C_L6_5 = (CheckBox) v.findViewById(R.id.C_L6_5);
        C_L6_6 = (CheckBox) v.findViewById(R.id.C_L6_6);
        C_L7_1 = (CheckBox) v.findViewById(R.id.C_L7_1);
        C_L7_2 = (CheckBox) v.findViewById(R.id.C_L7_2);
        C_L7_3 = (CheckBox) v.findViewById(R.id.C_L7_3);
        C_L7_4 = (CheckBox) v.findViewById(R.id.C_L7_4);
        C_L7_5 = (CheckBox) v.findViewById(R.id.C_L7_5);
        C_L7_6 = (CheckBox) v.findViewById(R.id.C_L7_6);
        C_L8_1 = (CheckBox) v.findViewById(R.id.C_L8_1);
        C_L8_2 = (CheckBox) v.findViewById(R.id.C_L8_2);
        C_L8_3 = (CheckBox) v.findViewById(R.id.C_L8_3);
        C_L8_4 = (CheckBox) v.findViewById(R.id.C_L8_4);
        C_L8_5 = (CheckBox) v.findViewById(R.id.C_L8_5);
        C_L8_6 = (CheckBox) v.findViewById(R.id.C_L8_6);
        C_L9_1 = (CheckBox) v.findViewById(R.id.C_L9_1);
        C_L9_2 = (CheckBox) v.findViewById(R.id.C_L9_2);
        C_L9_3 = (CheckBox) v.findViewById(R.id.C_L9_3);
        C_L9_4 = (CheckBox) v.findViewById(R.id.C_L9_4);
        C_L9_5 = (CheckBox) v.findViewById(R.id.C_L9_5);
        C_L9_6 = (CheckBox) v.findViewById(R.id.C_L9_6);
        C_L11_1 = (CheckBox) v.findViewById(R.id.C_L11_1);
        C_L11_2 = (CheckBox) v.findViewById(R.id.C_L11_2);
        C_L11_3 = (CheckBox) v.findViewById(R.id.C_L11_3);
        C_L11_4 = (CheckBox) v.findViewById(R.id.C_L11_4);
        C_L11_5 = (CheckBox) v.findViewById(R.id.C_L11_5);
        C_L11_6 = (CheckBox) v.findViewById(R.id.C_L11_6);
        C_L13_1 = (CheckBox) v.findViewById(R.id.C_L13_1);
        C_L13_2 = (CheckBox) v.findViewById(R.id.C_L13_2);
        C_L13_3 = (CheckBox) v.findViewById(R.id.C_L13_3);
        C_L13_4 = (CheckBox) v.findViewById(R.id.C_L13_4);
        C_L13_5 = (CheckBox) v.findViewById(R.id.C_L13_5);
        C_L13_6 = (CheckBox) v.findViewById(R.id.C_L13_6);

    }

    void intializeEditeview(View v) {
        ET_L5_7 = (EditText) v.findViewById(R.id.ET_L5_7);
        ET_L6_7 = (EditText) v.findViewById(R.id.ET_L6_7);
        ET_L7_7 = (EditText) v.findViewById(R.id.ET_L7_7);
        ET_L8_7 = (EditText) v.findViewById(R.id.ET_L8_7);
        ET_L9_7 = (EditText) v.findViewById(R.id.ET_L9_7);
        ET_L13_7 = (EditText) v.findViewById(R.id.ET_L13_7);
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_L1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_L12) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_L13) != false;
    }

    public boolean Asignvalues() {


        if (R_L1_1.isChecked()) {


            L1 = "1";
        } else if (R_L1_2.isChecked()) {


            L1 = "2";
        } else if (R_L1_3.isChecked()) {


            L1 = "3";
        } else if (R_L1_4.isChecked()) {


            L1 = "4";
        } else {
            L1 = "999";
        }


        if (R_L2_1.isChecked()) {


            L2 = "1";
        } else if (R_L2_2.isChecked()) {


            L2 = "2";
        } else if (R_L2_3.isChecked()) {


            L2 = "3";
        } else if (R_L2_4.isChecked()) {


            L2 = "4";
        } else {
            L2 = "999";
        }


        if (R_L3_yes.isChecked()) {


            L3 = "1";
        } else if (R_L3_No.isChecked()) {


            L3 = "2";
        } else {
            L3 = "999";
        }

        if (R_L4_yes.isChecked()) {


            L4 = "1";
        } else if (R_L4_No.isChecked()) {


            L4 = "2";
        } else {
            L4 = "999";
        }


        if (C_L5_1.isChecked()) {
            L5_1 = "1";
        } else {
            L5_1 = "999";
        }

        if (C_L5_2.isChecked()) {
            L5_2 = "1";
        } else {
            L5_2 = "999";
        }
        if (C_L5_3.isChecked()) {
            L5_3 = "1";
        } else {
            L5_3 = "999";
        }
        if (C_L5_4.isChecked()) {
            L5_4 = "1";
        } else {
            L5_4 = "999";
        }
        if (C_L5_5.isChecked()) {
            L5_5 = "1";
        } else {
            L5_5 = "999";
        }
        if (C_L5_6.isChecked()) {
            L5_6 = "1";
        } else {
            L5_6 = "999";
        }
        if (ET_L5_7.getText().toString().trim().length() > 0) {
            L5_7 = ET_L5_7.getText().toString().trim();
        } else {
            L5_7 = "999";
        }


        if (C_L6_1.isChecked()) {
            L6_1 = "1";
        } else {
            L6_1 = "999";
        }

        if (C_L6_2.isChecked()) {
            L6_2 = "1";
        } else {
            L6_2 = "999";
        }
        if (C_L6_3.isChecked()) {
            L6_3 = "1";
        } else {
            L6_3 = "999";
        }
        if (C_L6_4.isChecked()) {
            L6_4 = "1";
        } else {
            L6_4 = "999";
        }
        if (C_L6_5.isChecked()) {
            L6_5 = "1";
        } else {
            L6_5 = "999";
        }
        if (C_L6_6.isChecked()) {
            L6_6 = "1";
        } else {
            L6_6 = "999";
        }
        if (ET_L6_7.getText().toString().trim().length() > 0) {
            L6_7 = ET_L6_7.getText().toString().trim();
        } else {
            L6_7 = "999";
        }


        if (C_L7_1.isChecked()) {
            L7_1 = "1";
        } else {
            L7_1 = "999";
        }

        if (C_L7_2.isChecked()) {
            L7_2 = "1";
        } else {
            L7_2 = "999";
        }
        if (C_L7_3.isChecked()) {
            L7_3 = "1";
        } else {
            L7_3 = "999";
        }
        if (C_L7_4.isChecked()) {
            L7_4 = "1";
        } else {
            L7_4 = "999";
        }
        if (C_L7_5.isChecked()) {
            L7_5 = "1";
        } else {
            L7_5 = "999";
        }
        if (C_L7_6.isChecked()) {
            L7_6 = "1";
        } else {
            L7_6 = "999";
        }
        if (ET_L7_7.getText().toString().trim().length() > 0) {
            L7_7 = ET_L7_7.getText().toString().trim();
        } else {
            L7_7 = "999";
        }


        if (C_L8_1.isChecked()) {
            L8_1 = "1";
        } else {
            L8_1 = "999";
        }

        if (C_L8_2.isChecked()) {
            L8_2 = "1";
        } else {
            L8_2 = "999";
        }
        if (C_L8_3.isChecked()) {
            L8_3 = "1";
        } else {
            L8_3 = "999";
        }
        if (C_L8_4.isChecked()) {
            L8_4 = "1";
        } else {
            L8_4 = "999";
        }
        if (C_L8_5.isChecked()) {
            L8_5 = "1";
        } else {
            L8_5 = "999";
        }
        if (C_L8_6.isChecked()) {
            L8_6 = "1";
        } else {
            L8_6 = "999";
        }
        if (ET_L8_7.getText().toString().trim().length() > 0) {
            L8_7 = ET_L8_7.getText().toString().trim();
        } else {
            L8_7 = "999";
        }


        if (C_L9_1.isChecked()) {
            L9_1 = "1";
        } else {
            L9_1 = "999";
        }

        if (C_L9_2.isChecked()) {
            L9_2 = "1";
        } else {
            L9_2 = "999";
        }
        if (C_L9_3.isChecked()) {
            L9_3 = "1";
        } else {
            L9_3 = "999";
        }
        if (C_L9_4.isChecked()) {
            L9_4 = "1";
        } else {
            L9_4 = "999";
        }
        if (C_L9_5.isChecked()) {
            L9_5 = "1";
        } else {
            L9_5 = "999";
        }
        if (C_L9_6.isChecked()) {
            L9_6 = "1";
        } else {
            L9_6 = "999";
        }
        if (ET_L9_7.getText().toString().trim().length() > 0) {
            L9_7 = ET_L9_7.getText().toString().trim();
        } else {
            L9_7 = "999";
        }

        if (R_L10_yes.isChecked()) {
            L10 = "1";
        } else if (R_L10_No.isChecked()) {
            L10 = "2";
        } else {
            L10 = "999";
        }

        if (C_L11_1.isChecked()) {
            L11_1 = "1";
        } else {
            L11_1 = "999";
        }

        if (C_L11_2.isChecked()) {
            L11_2 = "1";
        } else {
            L11_2 = "999";
        }
        if (C_L11_3.isChecked()) {
            L11_3 = "1";
        } else {
            L11_3 = "999";
        }
        if (C_L11_4.isChecked()) {
            L11_4 = "1";
        } else {
            L11_4 = "999";
        }
        if (C_L11_5.isChecked()) {
            L11_5 = "1";
        } else {
            L11_5 = "999";
        }
        if (C_L11_6.isChecked()) {
            L11_6 = "1";
        } else {
            L11_6 = "999";
        }

        if (R_L12_yes.isChecked()) {
            L12 = "1";
        } else if (R_L12_No.isChecked()) {
            L12 = "2";
        } else {
            L12 = "999";
        }


        if (C_L13_1.isChecked()) {
            L13_1 = "1";
        } else {
            L13_1 = "999";
        }

        if (C_L13_2.isChecked()) {
            L13_2 = "1";
        } else {
            L13_2 = "999";
        }
        if (C_L13_3.isChecked()) {
            L13_3 = "1";
        } else {
            L13_3 = "999";
        }
        if (C_L13_4.isChecked()) {
            L13_4 = "1";
        } else {
            L13_4 = "999";
        }
        if (C_L13_5.isChecked()) {
            L13_5 = "1";
        } else {
            L13_5 = "999";
        }
        if (C_L13_6.isChecked()) {
            L13_6 = "1";
        } else {
            L13_6 = "999";
        }
        if (ET_L13_7.getText().toString().trim().length() > 0) {
            L13_7 = ET_L13_7.getText().toString().trim();
        } else {
            L13_7 = "999";
        }


        return true;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +


                col_L.L1 + "='" + L1 + "'," +
                col_L.L2 + "='" + L2 + "'," +
                col_L.L3 + "='" + L3 + "'," +
                col_L.L4 + "='" + L4 + "'," +
                col_L.L5_1 + "='" + L5_1 + "'," +
                col_L.L5_2 + "='" + L5_2 + "'," +
                col_L.L5_3 + "='" + L5_3 + "'," +
                col_L.L5_4 + "='" + L5_4 + "'," +
                col_L.L5_5 + "='" + L5_5 + "'," +
                col_L.L5_6 + "='" + L5_6 + "'," +
                col_L.L5_7 + "='" + L5_7 + "'," +
                col_L.L6_1 + "='" + L6_1 + "'," +
                col_L.L6_2 + "='" + L6_2 + "'," +
                col_L.L6_3 + "='" + L6_3 + "'," +
                col_L.L6_4 + "='" + L6_4 + "'," +
                col_L.L6_5 + "='" + L6_5 + "'," +
                col_L.L6_6 + "='" + L6_6 + "'," +
                col_L.L6_7 + "='" + L6_7 + "'," +
                col_L.L7_1 + "='" + L7_1 + "'," +
                col_L.L7_2 + "='" + L7_2 + "'," +
                col_L.L7_3 + "='" + L7_3 + "'," +
                col_L.L7_4 + "='" + L7_4 + "'," +
                col_L.L7_5 + "='" + L7_5 + "'," +
                col_L.L7_6 + "='" + L7_6 + "'," +
                col_L.L7_7 + "='" + L7_7 + "'," +
                col_L.L8_1 + "='" + L8_1 + "'," +
                col_L.L8_2 + "='" + L8_2 + "'," +
                col_L.L8_3 + "='" + L8_3 + "'," +
                col_L.L8_4 + "='" + L8_4 + "'," +
                col_L.L8_5 + "='" + L8_5 + "'," +
                col_L.L8_6 + "='" + L8_6 + "'," +
                col_L.L8_7 + "='" + L8_7 + "'," +
                col_L.L9_1 + "='" + L9_1 + "'," +
                col_L.L9_2 + "='" + L9_2 + "'," +
                col_L.L9_3 + "='" + L9_3 + "'," +
                col_L.L9_4 + "='" + L9_4 + "'," +
                col_L.L9_5 + "='" + L9_5 + "'," +
                col_L.L9_6 + "='" + L9_6 + "'," +
                col_L.L9_7 + "='" + L9_7 + "'," +
                col_L.L10 + "='" + L10 + "'," +
                col_L.L11_1 + "='" + L11_1 + "'," +
                col_L.L11_2 + "='" + L11_2 + "'," +
                col_L.L11_3 + "='" + L11_3 + "'," +
                col_L.L11_4 + "='" + L11_4 + "'," +
                col_L.L11_5 + "='" + L11_5 + "'," +
                col_L.L11_6 + "='" + L11_6 + "'," +
                col_L.L12 + "='" + L12 + "'," +
                col_L.L13_1 + "='" + L13_1 + "'," +
                col_L.L13_2 + "='" + L13_2 + "'," +
                col_L.L13_3 + "='" + L13_3 + "'," +
                col_L.L13_4 + "='" + L13_4 + "'," +
                col_L.L13_5 + "='" + L13_5 + "'," +
                col_L.L13_6 + "='" + L13_6 + "'," +
                col_L.L13_7 + "='" + L13_7 + "'" +
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
