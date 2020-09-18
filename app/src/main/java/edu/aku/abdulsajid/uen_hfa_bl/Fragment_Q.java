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
import data.col_Q;
import utils.Gothrough;
import utils.GothroughRadioButton;
import utils.Validation;


public class Fragment_Q extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Initializer Radio Button

    RadioButton
            R_Q1_yes,
            R_Q1_no,
            R_Q2_yes,
            R_Q2_No,


    R_Q5_yes,
            R_Q5_No,
            R_Q6_yes,
            R_Q6_No,
            R_Q8_1_1,
            R_Q8_1_2,
            R_Q8_1_3,
            R_Q8_2_1,
            R_Q8_2_2,
            R_Q8_2_3,
            R_Q8_3_1,
            R_Q8_3_2,
            R_Q8_3_3,
            R_Q8_4_1,
            R_Q8_4_2,
            R_Q8_4_3,
            R_Q8_5_1,
            R_Q8_5_2,
            R_Q8_5_3,
            R_Q8_6_1,
            R_Q8_6_2,
            R_Q8_6_3,
            R_Q8_7_1,
            R_Q8_7_2,
            R_Q8_7_3,
            R_Q8_8_1,
            R_Q8_8_2,
            R_Q8_8_3,
            R_Q8_9_1,
            R_Q8_9_2,
            R_Q8_9_3,
            R_Q8_10_1,
            R_Q8_10_2,
            R_Q8_10_3,
            R_Q8_11_1,
            R_Q8_11_2,
            R_Q8_11_3,
            R_Q8_12_1,
            R_Q8_12_2,
            R_Q8_12_3,
            R_Q8_13_1,
            R_Q8_13_2,
            R_Q8_13_3,
            R_Q8_14_1,
            R_Q8_14_2,
            R_Q8_14_3,
            R_Q8_15_1,
            R_Q8_15_2,
            R_Q8_15_3,
            R_Q8_16_1,
            R_Q8_16_2,
            R_Q8_16_3,
            R_Q9_yes,
            R_Q9_NO,
            R_Q10_yes,
            R_Q10_NO,
            R_Q11_yes,
            R_Q11_NO;


    //endregion


    //region Initialze Checkboxes

    CheckBox

            C_Q3_1,
            C_Q3_2,
            C_Q3_3,
            C_Q3_4,
            C_Q4_1,
            C_Q4_2,
            C_Q4_3,
            C_Q4_4,
            C_Q4_5,
            C_Q4_6,
            C_Q4_7,
            C_Q4_8,
            C_Q4_9,
            C_Q4_10,
            C_Q4_11,
            C_Q4_12,
            C_Q4_13,
            C_Q4_14,
            C_Q4_15,
            C_Q4_16,
            C_Q4_17,
            C_Q4_18,
            C_Q4_19,
            C_Q4_20,
            C_Q4_21,
            C_Q4_22,
            C_Q4_23,
            C_Q4_24,
            C_Q7_1,
            C_Q7_2,
            C_Q7_3,
            C_Q7_4,
            C_Q7_5,
            C_Q7_6,
            C_Q7_7,
            C_Q7_8;


    //endregion

    //region Editextview

    EditText
            ET_Q7_9;


    //endregion

    //region Linerlayout

    LinearLayout
            lv_Q1,
            lv_Q2,
            lv_Q3,
            lv_Q4,
            lv_Q5,
            lv_Q6,
            lv_Q7,
            lv_Q8,
            lv_Q9,
            lv_Q10,
            lv_Q11;

    //endregion


    //region Sting  Declaer strign here as you mention in Satic classs

    String
            Q1,
            Q2,
            Q3_1,
            Q3_2,
            Q3_3,
            Q3_4,
            Q4_1,
            Q4_2,
            Q4_3,
            Q4_4,
            Q4_5,
            Q4_6,
            Q4_7,
            Q4_8,
            Q4_9,
            Q4_10,
            Q4_11,
            Q4_12,
            Q4_13,
            Q4_14,
            Q4_15,
            Q4_16,
            Q4_17,
            Q4_18,
            Q4_19,
            Q4_20,
            Q4_21,
            Q4_22,
            Q4_23,
            Q4_24,
            Q5,
            Q6,
            Q7_1,
            Q7_2,
            Q7_3,
            Q7_4,
            Q7_5,
            Q7_6,
            Q7_7,
            Q7_8,
            Q7_9,
            Q8_1,
            Q8_2,
            Q8_3,
            Q8_4,
            Q8_5,
            Q8_6,
            Q8_7,
            Q8_8,
            Q8_9,
            Q8_10,
            Q8_11,
            Q8_12,
            Q8_13,
            Q8_14,
            Q8_15,
            Q8_16,
            Q9,
            Q10,
            Q11;

    //endregion


    private OnFragmentInteractionListener mListener;

    public Fragment_Q() {
    }

    public static Fragment_Q newInstance(String param1, String param2) {
        Fragment_Q fragment = new Fragment_Q();

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


        View v = inflater.inflate(R.layout.fragment_q, container, false);

        initalizerCheckbox(v);
        intializerEditextview(v);
        intializerLinerlayout(v);
        intializerRadiobuttion(v);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }
                Assign_Values();
                UpdateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "Q", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_R fragment = new Fragment_R();
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

        switch (compoundButton.getId()) {


        }
    }

    void intializerRadiobuttion(View v) {
        R_Q1_yes = (RadioButton) v.findViewById(R.id.R_Q1_yes);
        R_Q1_no = (RadioButton) v.findViewById(R.id.R_Q1_No);
        R_Q2_yes = (RadioButton) v.findViewById(R.id.R_Q2_yes);
        R_Q2_No = (RadioButton) v.findViewById(R.id.R_Q2_No);

        R_Q5_yes = (RadioButton) v.findViewById(R.id.R_Q5_yes);
        R_Q5_No = (RadioButton) v.findViewById(R.id.R_Q5_No);
        R_Q6_yes = (RadioButton) v.findViewById(R.id.R_Q6_yes);
        R_Q6_No = (RadioButton) v.findViewById(R.id.R_Q6_No);
        R_Q8_1_1 = (RadioButton) v.findViewById(R.id.R_Q8_1_1);
        R_Q8_1_2 = (RadioButton) v.findViewById(R.id.R_Q8_1_2);
        R_Q8_1_3 = (RadioButton) v.findViewById(R.id.R_Q8_1_3);
        R_Q8_2_1 = (RadioButton) v.findViewById(R.id.R_Q8_2_1);
        R_Q8_2_2 = (RadioButton) v.findViewById(R.id.R_Q8_2_2);
        R_Q8_2_3 = (RadioButton) v.findViewById(R.id.R_Q8_2_3);
        R_Q8_3_1 = (RadioButton) v.findViewById(R.id.R_Q8_3_1);
        R_Q8_3_2 = (RadioButton) v.findViewById(R.id.R_Q8_3_2);
        R_Q8_3_3 = (RadioButton) v.findViewById(R.id.R_Q8_3_3);
        R_Q8_4_1 = (RadioButton) v.findViewById(R.id.R_Q8_4_1);
        R_Q8_4_2 = (RadioButton) v.findViewById(R.id.R_Q8_4_2);
        R_Q8_4_3 = (RadioButton) v.findViewById(R.id.R_Q8_4_3);
        R_Q8_5_1 = (RadioButton) v.findViewById(R.id.R_Q8_5_1);
        R_Q8_5_2 = (RadioButton) v.findViewById(R.id.R_Q8_5_2);
        R_Q8_5_3 = (RadioButton) v.findViewById(R.id.R_Q8_5_3);
        R_Q8_6_1 = (RadioButton) v.findViewById(R.id.R_Q8_6_1);
        R_Q8_6_2 = (RadioButton) v.findViewById(R.id.R_Q8_6_2);
        R_Q8_6_3 = (RadioButton) v.findViewById(R.id.R_Q8_6_3);
        R_Q8_7_1 = (RadioButton) v.findViewById(R.id.R_Q8_7_1);
        R_Q8_7_2 = (RadioButton) v.findViewById(R.id.R_Q8_7_2);
        R_Q8_7_3 = (RadioButton) v.findViewById(R.id.R_Q8_7_3);
        R_Q8_8_1 = (RadioButton) v.findViewById(R.id.R_Q8_8_1);
        R_Q8_8_2 = (RadioButton) v.findViewById(R.id.R_Q8_8_2);
        R_Q8_8_3 = (RadioButton) v.findViewById(R.id.R_Q8_8_3);
        R_Q8_9_1 = (RadioButton) v.findViewById(R.id.R_Q8_9_1);
        R_Q8_9_2 = (RadioButton) v.findViewById(R.id.R_Q8_9_2);
        R_Q8_9_3 = (RadioButton) v.findViewById(R.id.R_Q8_9_3);
        R_Q8_10_1 = (RadioButton) v.findViewById(R.id.R_Q8_10_1);
        R_Q8_10_2 = (RadioButton) v.findViewById(R.id.R_Q8_10_2);
        R_Q8_10_3 = (RadioButton) v.findViewById(R.id.R_Q8_10_3);
        R_Q8_11_1 = (RadioButton) v.findViewById(R.id.R_Q8_11_1);
        R_Q8_11_2 = (RadioButton) v.findViewById(R.id.R_Q8_11_2);
        R_Q8_11_3 = (RadioButton) v.findViewById(R.id.R_Q8_11_3);
        R_Q8_12_1 = (RadioButton) v.findViewById(R.id.R_Q8_12_1);
        R_Q8_12_2 = (RadioButton) v.findViewById(R.id.R_Q8_12_2);
        R_Q8_12_3 = (RadioButton) v.findViewById(R.id.R_Q8_12_3);
        R_Q8_13_1 = (RadioButton) v.findViewById(R.id.R_Q8_13_1);
        R_Q8_13_2 = (RadioButton) v.findViewById(R.id.R_Q8_13_2);
        R_Q8_13_3 = (RadioButton) v.findViewById(R.id.R_Q8_13_3);
        R_Q8_14_1 = (RadioButton) v.findViewById(R.id.R_Q8_14_1);
        R_Q8_14_2 = (RadioButton) v.findViewById(R.id.R_Q8_14_2);
        R_Q8_14_3 = (RadioButton) v.findViewById(R.id.R_Q8_14_3);
        R_Q8_15_1 = (RadioButton) v.findViewById(R.id.R_Q8_15_1);
        R_Q8_15_2 = (RadioButton) v.findViewById(R.id.R_Q8_15_2);
        R_Q8_15_3 = (RadioButton) v.findViewById(R.id.R_Q8_15_3);
        R_Q8_16_1 = (RadioButton) v.findViewById(R.id.R_Q8_16_1);
        R_Q8_16_2 = (RadioButton) v.findViewById(R.id.R_Q8_16_2);
        R_Q8_16_3 = (RadioButton) v.findViewById(R.id.R_Q8_16_3);
        R_Q9_yes = (RadioButton) v.findViewById(R.id.R_Q9_yes);
        R_Q9_NO = (RadioButton) v.findViewById(R.id.R_Q9_No);
        R_Q10_yes = (RadioButton) v.findViewById(R.id.R_Q10_yes);
        R_Q10_NO = (RadioButton) v.findViewById(R.id.R_Q10_No);
        R_Q11_yes = (RadioButton) v.findViewById(R.id.R_Q11_yes);
        R_Q11_NO = (RadioButton) v.findViewById(R.id.R_Q11_No);
    }

    void intializerLinerlayout(View v) {
        lv_Q1 = (LinearLayout) v.findViewById(R.id.lv_Q1);
        lv_Q2 = (LinearLayout) v.findViewById(R.id.lv_Q2);
        lv_Q3 = (LinearLayout) v.findViewById(R.id.lv_Q3);
        lv_Q4 = (LinearLayout) v.findViewById(R.id.lv_Q4);
        lv_Q5 = (LinearLayout) v.findViewById(R.id.lv_Q5);
        lv_Q6 = (LinearLayout) v.findViewById(R.id.lv_Q6);
        lv_Q7 = (LinearLayout) v.findViewById(R.id.lv_Q7);
        lv_Q8 = (LinearLayout) v.findViewById(R.id.lv_Q8);
        lv_Q9 = (LinearLayout) v.findViewById(R.id.lv_Q9);
        lv_Q10 = (LinearLayout) v.findViewById(R.id.lv_Q10);
        lv_Q11 = (LinearLayout) v.findViewById(R.id.lv_Q11);
    }

    void initalizerCheckbox(View v) {

        C_Q3_1 = (CheckBox) v.findViewById(R.id.C_Q3_1);
        C_Q3_2 = (CheckBox) v.findViewById(R.id.C_Q3_2);
        C_Q3_3 = (CheckBox) v.findViewById(R.id.C_Q3_3);
        C_Q3_4 = (CheckBox) v.findViewById(R.id.C_Q3_4);
        C_Q3_1 = (CheckBox) v.findViewById(R.id.C_Q3_1);
        C_Q3_2 = (CheckBox) v.findViewById(R.id.C_Q3_2);
        C_Q3_3 = (CheckBox) v.findViewById(R.id.C_Q3_3);
        C_Q4_1 = (CheckBox) v.findViewById(R.id.C_Q4_1);
        C_Q4_2 = (CheckBox) v.findViewById(R.id.C_Q4_2);
        C_Q4_3 = (CheckBox) v.findViewById(R.id.C_Q4_3);
        C_Q4_4 = (CheckBox) v.findViewById(R.id.C_Q4_4);
        C_Q4_5 = (CheckBox) v.findViewById(R.id.C_Q4_5);
        C_Q4_6 = (CheckBox) v.findViewById(R.id.C_Q4_6);
        C_Q4_7 = (CheckBox) v.findViewById(R.id.C_Q4_7);
        C_Q4_8 = (CheckBox) v.findViewById(R.id.C_Q4_8);
        C_Q4_9 = (CheckBox) v.findViewById(R.id.C_Q4_9);
        C_Q4_10 = (CheckBox) v.findViewById(R.id.C_Q4_10);
        C_Q4_11 = (CheckBox) v.findViewById(R.id.C_Q4_11);
        C_Q4_12 = (CheckBox) v.findViewById(R.id.C_Q4_12);
        C_Q4_13 = (CheckBox) v.findViewById(R.id.C_Q4_13);
        C_Q4_14 = (CheckBox) v.findViewById(R.id.C_Q4_14);
        C_Q4_15 = (CheckBox) v.findViewById(R.id.C_Q4_15);
        C_Q4_16 = (CheckBox) v.findViewById(R.id.C_Q4_16);
        C_Q4_17 = (CheckBox) v.findViewById(R.id.C_Q4_17);
        C_Q4_18 = (CheckBox) v.findViewById(R.id.C_Q4_18);
        C_Q4_19 = (CheckBox) v.findViewById(R.id.C_Q4_19);
        C_Q4_20 = (CheckBox) v.findViewById(R.id.C_Q4_20);
        C_Q4_21 = (CheckBox) v.findViewById(R.id.C_Q4_21);
        C_Q4_22 = (CheckBox) v.findViewById(R.id.C_Q4_22);
        C_Q4_23 = (CheckBox) v.findViewById(R.id.C_Q4_23);
        C_Q4_24 = (CheckBox) v.findViewById(R.id.C_Q4_24);
        C_Q7_1 = (CheckBox) v.findViewById(R.id.C_Q7_1);
        C_Q7_2 = (CheckBox) v.findViewById(R.id.C_Q7_2);
        C_Q7_3 = (CheckBox) v.findViewById(R.id.C_Q7_3);
        C_Q7_4 = (CheckBox) v.findViewById(R.id.C_Q7_4);
        C_Q7_5 = (CheckBox) v.findViewById(R.id.C_Q7_5);
        C_Q7_6 = (CheckBox) v.findViewById(R.id.C_Q7_6);
        C_Q7_7 = (CheckBox) v.findViewById(R.id.C_Q7_7);
        C_Q7_8 = (CheckBox) v.findViewById(R.id.C_Q7_8);

    }

    void intializerEditextview(View v) {
        ET_Q7_9 = (EditText) v.findViewById(R.id.ET_Q7_9);

    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_Q1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_Q2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_Q3) == false) {
            //  return false;
        }
        if (Gothrough.IamHiden(lv_Q4) == false) {
            //       return false;
        }
        if (Gothrough.IamHiden(lv_Q5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_Q6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_Q7) == false) {
            return false;
        }
        if (GothroughRadioButton.IamHiden(lv_Q8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_Q9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_Q10) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_Q11) != false;

    }

    void Assign_Values() {
        if (R_Q1_yes.isChecked()) {
            Q1 = "1";
        } else if (R_Q1_no.isChecked()) {
            Q1 = "2";
        } else {
            Q1 = "999";
        }

        if (R_Q2_yes.isChecked()) {
            Q2 = "1";
        } else if (R_Q2_No.isChecked()) {
            Q2 = "2";
        } else {
            Q2 = "999";
        }

        if (C_Q3_1.isChecked()) {
            Q3_1 = "1";
        } else {
            Q3_1 = "999";
        }

        if (C_Q3_2.isChecked()) {
            Q3_2 = "1";
        } else {
            Q3_2 = "999";
        }

        if (C_Q3_3.isChecked()) {
            Q3_3 = "1";
        } else {
            Q3_3 = "999";
        }

        if (C_Q3_4.isChecked()) {
            Q3_4 = "1";
        } else {
            Q3_4 = "999";
        }

        if (C_Q4_1.isChecked()) {
            Q4_1 = "1";
        } else {
            Q4_1 = "999";
        }

        if (C_Q4_2.isChecked()) {
            Q4_2 = "1";
        } else {
            Q4_2 = "999";
        }

        if (C_Q4_3.isChecked()) {
            Q4_3 = "1";
        } else {
            Q4_3 = "999";
        }

        if (C_Q4_4.isChecked()) {
            Q4_4 = "1";
        } else {
            Q4_4 = "999";
        }

        if (C_Q4_5.isChecked()) {
            Q4_5 = "1";
        } else {
            Q4_5 = "999";
        }

        if (C_Q4_6.isChecked()) {
            Q4_6 = "1";
        } else {
            Q4_6 = "999";
        }

        if (C_Q4_7.isChecked()) {
            Q4_7 = "1";
        } else {
            Q4_7 = "999";
        }

        if (C_Q4_8.isChecked()) {
            Q4_8 = "1";
        } else {
            Q4_8 = "999";
        }

        if (C_Q4_9.isChecked()) {
            Q4_9 = "1";
        } else {
            Q4_9 = "999";
        }

        if (C_Q4_10.isChecked()) {
            Q4_10 = "1";
        } else {
            Q4_10 = "999";
        }

        if (C_Q4_11.isChecked()) {
            Q4_11 = "1";
        } else {
            Q4_11 = "999";
        }

        if (C_Q4_12.isChecked()) {
            Q4_12 = "1";
        } else {
            Q4_12 = "999";
        }

        if (C_Q4_13.isChecked()) {
            Q4_13 = "1";
        } else {
            Q4_13 = "999";
        }

        if (C_Q4_14.isChecked()) {
            Q4_14 = "1";
        } else {
            Q4_14 = "999";
        }

        if (C_Q4_15.isChecked()) {
            Q4_15 = "1";
        } else {
            Q4_15 = "999";
        }

        if (C_Q4_16.isChecked()) {
            Q4_16 = "1";
        } else {
            Q4_16 = "999";
        }

        if (C_Q4_17.isChecked()) {
            Q4_17 = "1";
        } else {
            Q4_17 = "999";
        }

        if (C_Q4_18.isChecked()) {
            Q4_18 = "1";
        } else {
            Q4_18 = "999";
        }

        if (C_Q4_19.isChecked()) {
            Q4_19 = "1";
        } else {
            Q4_19 = "999";
        }

        if (C_Q4_20.isChecked()) {
            Q4_20 = "1";
        } else {
            Q4_20 = "999";
        }

        if (C_Q4_21.isChecked()) {
            Q4_21 = "1";
        } else {
            Q4_21 = "999";
        }

        if (C_Q4_22.isChecked()) {
            Q4_22 = "1";
        } else {
            Q4_22 = "999";
        }

        if (C_Q4_23.isChecked()) {
            Q4_23 = "1";
        } else {
            Q4_23 = "999";
        }

        if (C_Q4_24.isChecked()) {
            Q4_24 = "1";
        } else {
            Q4_24 = "999";
        }

        if (R_Q5_yes.isChecked()) {
            Q5 = "1";
        } else if (R_Q5_No.isChecked()) {
            Q5 = "2";
        } else {
            Q5 = "999";
        }

        if (R_Q6_yes.isChecked()) {
            Q6 = "1";
        } else if (R_Q6_No.isChecked()) {
            Q6 = "2";
        } else {
            Q6 = "999";
        }

        if (C_Q7_1.isChecked()) {
            Q7_1 = "1";
        } else {
            Q7_1 = "999";
        }

        if (C_Q7_2.isChecked()) {
            Q7_2 = "1";
        } else {
            Q7_2 = "999";
        }

        if (C_Q7_3.isChecked()) {
            Q7_3 = "1";
        } else {
            Q7_3 = "999";
        }

        if (C_Q7_4.isChecked()) {
            Q7_4 = "1";
        } else {
            Q7_4 = "999";
        }

        if (C_Q7_5.isChecked()) {
            Q7_5 = "1";
        } else {
            Q7_5 = "999";
        }

        if (C_Q7_6.isChecked()) {
            Q7_6 = "1";
        } else {
            Q7_6 = "999";
        }

        if (C_Q7_7.isChecked()) {
            Q7_7 = "1";
        } else {
            Q7_7 = "999";
        }

        if (C_Q7_8.isChecked()) {
            Q7_8 = "1";
        } else {
            Q7_8 = "999";
        }

        if (ET_Q7_9.getText().toString().trim().length() > 0) {
            Q7_9 = ET_Q7_9.getText().toString().trim();
        } else {
            Q7_9 = "999";
        }

        if (R_Q8_1_1.isChecked()) {
            Q8_1 = "1";
        } else if (R_Q8_1_2.isChecked()) {
            Q8_1 = "2";
        } else if (R_Q8_1_3.isChecked()) {
            Q8_1 = "3";
        } else {
            Q8_1 = "999";
        }

        if (R_Q8_2_1.isChecked()) {
            Q8_2 = "1";
        } else if (R_Q8_2_2.isChecked()) {
            Q8_2 = "2";
        } else if (R_Q8_2_3.isChecked()) {
            Q8_2 = "3";
        } else {
            Q8_2 = "999";
        }

        if (R_Q8_3_1.isChecked()) {
            Q8_3 = "1";
        } else if (R_Q8_3_2.isChecked()) {
            Q8_3 = "2";
        } else if (R_Q8_3_3.isChecked()) {
            Q8_3 = "3";
        } else {
            Q8_3 = "999";
        }

        if (R_Q8_4_1.isChecked()) {
            Q8_4 = "1";
        } else if (R_Q8_4_2.isChecked()) {
            Q8_4 = "2";
        } else if (R_Q8_4_3.isChecked()) {
            Q8_4 = "3";
        } else {
            Q8_4 = "999";
        }

        if (R_Q8_5_1.isChecked()) {
            Q8_5 = "1";
        } else if (R_Q8_5_2.isChecked()) {
            Q8_5 = "2";
        } else if (R_Q8_5_3.isChecked()) {
            Q8_5 = "3";
        } else {
            Q8_5 = "999";
        }

        if (R_Q8_6_1.isChecked()) {
            Q8_6 = "1";
        } else if (R_Q8_6_2.isChecked()) {
            Q8_6 = "2";
        } else if (R_Q8_6_3.isChecked()) {
            Q8_6 = "3";
        } else {
            Q8_6 = "999";
        }

        if (R_Q8_7_1.isChecked()) {
            Q8_7 = "1";
        } else if (R_Q8_7_2.isChecked()) {
            Q8_7 = "2";
        } else if (R_Q8_7_3.isChecked()) {
            Q8_7 = "3";
        } else {
            Q8_7 = "999";
        }

        if (R_Q8_8_1.isChecked()) {
            Q8_8 = "1";
        } else if (R_Q8_8_2.isChecked()) {
            Q8_8 = "2";
        } else if (R_Q8_8_3.isChecked()) {
            Q8_8 = "3";
        } else {
            Q8_8 = "999";
        }

        if (R_Q8_9_1.isChecked()) {
            Q8_9 = "1";
        } else if (R_Q8_9_2.isChecked()) {
            Q8_9 = "2";
        } else if (R_Q8_9_3.isChecked()) {
            Q8_9 = "3";
        } else {
            Q8_9 = "999";
        }

        if (R_Q8_10_1.isChecked()) {
            Q8_10 = "1";
        } else if (R_Q8_10_2.isChecked()) {
            Q8_10 = "2";
        } else if (R_Q8_10_3.isChecked()) {
            Q8_10 = "3";
        } else {
            Q8_10 = "999";
        }

        if (R_Q8_11_1.isChecked()) {
            Q8_11 = "1";
        } else if (R_Q8_11_2.isChecked()) {
            Q8_11 = "2";
        } else if (R_Q8_11_3.isChecked()) {
            Q8_11 = "3";
        } else {
            Q8_11 = "999";
        }

        if (R_Q8_12_1.isChecked()) {
            Q8_12 = "1";
        } else if (R_Q8_12_2.isChecked()) {
            Q8_12 = "2";
        } else if (R_Q8_12_3.isChecked()) {
            Q8_12 = "3";
        } else {
            Q8_12 = "999";
        }

        if (R_Q8_13_1.isChecked()) {
            Q8_13 = "1";
        } else if (R_Q8_13_2.isChecked()) {
            Q8_13 = "2";
        } else if (R_Q8_13_3.isChecked()) {
            Q8_13 = "3";
        } else {
            Q8_13 = "999";
        }

        if (R_Q8_14_1.isChecked()) {
            Q8_14 = "1";
        } else if (R_Q8_14_2.isChecked()) {
            Q8_14 = "2";
        } else if (R_Q8_14_3.isChecked()) {
            Q8_14 = "3";
        } else {
            Q8_14 = "999";
        }

        if (R_Q8_15_1.isChecked()) {
            Q8_15 = "1";
        } else if (R_Q8_15_2.isChecked()) {
            Q8_15 = "2";
        } else if (R_Q8_15_3.isChecked()) {
            Q8_15 = "3";
        } else {
            Q8_15 = "999";
        }

        if (R_Q8_16_1.isChecked()) {
            Q8_16 = "1";
        } else if (R_Q8_16_2.isChecked()) {
            Q8_16 = "2";
        } else if (R_Q8_16_3.isChecked()) {
            Q8_16 = "3";
        } else {
            Q8_16 = "999";
        }

        if (R_Q9_yes.isChecked()) {
            Q9 = "1";
        } else if (R_Q9_NO.isChecked()) {
            Q9 = "2";
        } else {
            Q9 = "999";
        }

        if (R_Q10_yes.isChecked()) {
            Q10 = "1";
        } else if (R_Q10_NO.isChecked()) {
            Q10 = "2";
        } else {
            Q10 = "999";
        }

        if (R_Q11_yes.isChecked()) {
            Q11 = "1";
        } else if (R_Q11_NO.isChecked()) {
            Q11 = "2";
        } else {
            Q11 = "999";
        }

    }

    void UpdateHFA() {
        String query = "Update hfa set " +

                col_Q.Q1 + "='" + Q1 + "'," +
                col_Q.Q2 + "='" + Q2 + "'," +
                col_Q.Q3_1 + "='" + Q3_1 + "'," +
                col_Q.Q3_2 + "='" + Q3_2 + "'," +
                col_Q.Q3_3 + "='" + Q3_3 + "'," +
                col_Q.Q3_4 + "='" + Q3_4 + "'," +
                col_Q.Q4_1 + "='" + Q4_1 + "'," +
                col_Q.Q4_2 + "='" + Q4_2 + "'," +
                col_Q.Q4_3 + "='" + Q4_3 + "'," +
                col_Q.Q4_4 + "='" + Q4_4 + "'," +
                col_Q.Q4_5 + "='" + Q4_5 + "'," +
                col_Q.Q4_6 + "='" + Q4_6 + "'," +
                col_Q.Q4_7 + "='" + Q4_7 + "'," +
                col_Q.Q4_8 + "='" + Q4_8 + "'," +
                col_Q.Q4_9 + "='" + Q4_9 + "'," +
                col_Q.Q4_10 + "='" + Q4_10 + "'," +
                col_Q.Q4_11 + "='" + Q4_11 + "'," +
                col_Q.Q4_12 + "='" + Q4_12 + "'," +
                col_Q.Q4_13 + "='" + Q4_13 + "'," +
                col_Q.Q4_14 + "='" + Q4_14 + "'," +
                col_Q.Q4_15 + "='" + Q4_15 + "'," +
                col_Q.Q4_16 + "='" + Q4_16 + "'," +
                col_Q.Q4_17 + "='" + Q4_17 + "'," +
                col_Q.Q4_18 + "='" + Q4_18 + "'," +
                col_Q.Q4_19 + "='" + Q4_19 + "'," +
                col_Q.Q4_20 + "='" + Q4_20 + "'," +
                col_Q.Q4_21 + "='" + Q4_21 + "'," +
                col_Q.Q4_22 + "='" + Q4_22 + "'," +
                col_Q.Q4_23 + "='" + Q4_23 + "'," +
                col_Q.Q4_24 + "='" + Q4_24 + "'," +
                col_Q.Q5 + "='" + Q5 + "'," +
                col_Q.Q6 + "='" + Q6 + "'," +
                col_Q.Q7_1 + "='" + Q7_1 + "'," +
                col_Q.Q7_2 + "='" + Q7_2 + "'," +
                col_Q.Q7_3 + "='" + Q7_3 + "'," +
                col_Q.Q7_4 + "='" + Q7_4 + "'," +
                col_Q.Q7_5 + "='" + Q7_5 + "'," +
                col_Q.Q7_6 + "='" + Q7_6 + "'," +
                col_Q.Q7_7 + "='" + Q7_7 + "'," +
                col_Q.Q7_8 + "='" + Q7_8 + "'," +
                col_Q.Q7_9 + "='" + Q7_9 + "'," +
                col_Q.Q8_1 + "='" + Q8_1 + "'," +
                col_Q.Q8_2 + "='" + Q8_2 + "'," +
                col_Q.Q8_3 + "='" + Q8_3 + "'," +
                col_Q.Q8_4 + "='" + Q8_4 + "'," +
                col_Q.Q8_5 + "='" + Q8_5 + "'," +
                col_Q.Q8_6 + "='" + Q8_6 + "'," +
                col_Q.Q8_7 + "='" + Q8_7 + "'," +
                col_Q.Q8_8 + "='" + Q8_8 + "'," +
                col_Q.Q8_9 + "='" + Q8_9 + "'," +
                col_Q.Q8_10 + "='" + Q8_10 + "'," +
                col_Q.Q8_11 + "='" + Q8_11 + "'," +
                col_Q.Q8_12 + "='" + Q8_12 + "'," +
                col_Q.Q8_13 + "='" + Q8_13 + "'," +
                col_Q.Q8_14 + "='" + Q8_14 + "'," +
                col_Q.Q8_15 + "='" + Q8_15 + "'," +
                col_Q.Q8_16 + "='" + Q8_16 + "'," +
                col_Q.Q9 + "='" + Q9 + "'," +
                col_Q.Q10 + "='" + Q10 + "'," +
                col_Q.Q11 + "='" + Q11 + "'" +
                " Where id=" + Validation.HFAPK;

        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();


    }
    // Function End


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}