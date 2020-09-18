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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_O;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_O extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Radio Button

    RadioButton

            R_O2_1_1,
            R_O2_1_2,
            R_O2_1_3,
            R_O2_2_1,
            R_O2_2_2,
            R_O2_2_3,
            R_O2_3_1,
            R_O2_3_2,
            R_O2_3_3,
            R_O2_4_1,
            R_O2_4_2,
            R_O2_4_3,
            R_O3_yes,
            R_O3_No,
            R_O4_yes,
            R_O4_No,
            R_O6_yes,
            R_O6_No;


    //endregion


    //region Checkboxxx

    CheckBox
            C_O1_1,
            C_O1_2,
            C_O1_3,
            C_O1_4,
            L_O5_1,
            L_O5_2,
            L_O5_3,
            L_O5_4,
            L_O5_5,
            L_O5_6,
            L_O5_7,
            L_O5_8,
            L_O5_9,
            L_O5_10,
            L_O5_11,
            L_O5_12,
            L_O5_13,
            L_O5_14,
            L_O5_15,
            L_O5_16,
            L_O5_17,
            L_O5_18,
            L_O5_19,
            L_O5_20,
            L_O5_21,
            L_O7_1,
            L_O7_2,
            L_O7_3,
            L_O7_4,
            L_O7_5,
            L_O7_6,
            L_O7_7,
            L_O7_8,
            L_O7_9,
            L_O7_10;


    //endregion


    //region LinarLayout


    LinearLayout
            lv_O1,
            lv_O2,
            lv_O3,
            lv_O4,
            lv_O5,
            lv_O6,
            lv_O7;


    //endregion


    //region Sting  Declaer strign here as you mention in Satic classs

    String
            O1_1,
            O1_2,
            O1_3,
            O1_4,
            O2_1,
            O2_2,
            O2_3,
            O2_4,
            O3,
            O4,
            O5_1,
            O5_2,
            O5_3,
            O5_4,
            O5_5,
            O5_6,
            O5_7,
            O5_8,
            O5_9,
            O5_10,
            O5_11,
            O5_12,
            O5_13,
            O5_14,
            O5_15,
            O5_16,
            O5_17,
            O5_18,
            O5_19,
            O5_20,
            O5_21,
            O6,
            O7_1,
            O7_2,
            O7_3,
            O7_4,
            O7_5,
            O7_6,
            O7_7,
            O7_8,
            O7_9,
            O7_10;
    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_O() {
    }

    public static Fragment_O newInstance(String param1, String param2) {
        Fragment_O fragment = new Fragment_O();

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


        View v = inflater.inflate(R.layout.fragment_o, container, false);

        intialzerLinarlayout(v);
        InitalizeRadiobutton(v);
        InitialzieChecbox(v);


        C_O1_1.setOnCheckedChangeListener(this);
        C_O1_2.setOnCheckedChangeListener(this);
        C_O1_3.setOnCheckedChangeListener(this);
        C_O1_4.setOnCheckedChangeListener(this);

        R_O4_yes.setOnCheckedChangeListener(this);
        R_O4_No.setOnCheckedChangeListener(this);

        R_O6_yes.setOnCheckedChangeListener(this);
        R_O6_No.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }

                Assign_Values();
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "O", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_P fragment = new Fragment_P();
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

        if (compoundButton.getId() == R.id.C_O1_1 || compoundButton.getId() == R.id.C_O1_2 ||
                compoundButton.getId() == R.id.C_O1_3 || compoundButton.getId() == R.id.C_O1_4) {


            if (C_O1_4.isChecked()) {

                C_O1_1.setChecked(false);
                C_O1_2.setChecked(false);
                C_O1_3.setChecked(false);

                lv_O2.setVisibility(View.GONE);
                lv_O3.setVisibility(View.GONE);
                lv_O4.setVisibility(View.GONE);
                lv_O5.setVisibility(View.GONE);
                lv_O6.setVisibility(View.GONE);
                lv_O7.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_O2);
                ClearAllcontrol.ClearAll(lv_O3);
                ClearAllcontrol.ClearAll(lv_O4);
                ClearAllcontrol.ClearAll(lv_O5);
                ClearAllcontrol.ClearAll(lv_O6);
                ClearAllcontrol.ClearAll(lv_O7);


            } else {
                lv_O2.setVisibility(View.VISIBLE);
                lv_O3.setVisibility(View.VISIBLE);
                lv_O4.setVisibility(View.VISIBLE);
                lv_O5.setVisibility(View.VISIBLE);
                lv_O6.setVisibility(View.VISIBLE);
                lv_O7.setVisibility(View.VISIBLE);

            }


        }

        if (compoundButton.getId() == R.id.R_O4_yes || compoundButton.getId() == R.id.R_O4_No) {
            if (R_O4_No.isChecked()) {
                lv_O5.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_O5);
            } else {
                lv_O5.setVisibility(View.VISIBLE);

            }

        }

        if (compoundButton.getId() == R.id.R_O6_yes || compoundButton.getId() == R.id.R_O6_No) {
            if (R_O6_No.isChecked()) {
                lv_O7.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_O7);
            } else {
                lv_O7.setVisibility(View.VISIBLE);

            }

        }

    }

    void intialzerLinarlayout(View v) {
        lv_O1 = (LinearLayout) v.findViewById(R.id.lv_O1);
        lv_O2 = (LinearLayout) v.findViewById(R.id.lv_O2);
        lv_O3 = (LinearLayout) v.findViewById(R.id.lv_O3);
        lv_O4 = (LinearLayout) v.findViewById(R.id.lv_O4);
        lv_O5 = (LinearLayout) v.findViewById(R.id.lv_O5);
        lv_O6 = (LinearLayout) v.findViewById(R.id.lv_O6);
        lv_O7 = (LinearLayout) v.findViewById(R.id.lv_O7);


    }

    void InitalizeRadiobutton(View v) {


        R_O2_1_1 = (RadioButton) v.findViewById(R.id.R_O2_1_1);
        R_O2_1_2 = (RadioButton) v.findViewById(R.id.R_O2_1_2);
        R_O2_1_3 = (RadioButton) v.findViewById(R.id.R_O2_1_3);
        R_O2_2_1 = (RadioButton) v.findViewById(R.id.R_O2_2_1);
        R_O2_2_2 = (RadioButton) v.findViewById(R.id.R_O2_2_2);
        R_O2_2_3 = (RadioButton) v.findViewById(R.id.R_O2_2_3);
        R_O2_3_1 = (RadioButton) v.findViewById(R.id.R_O2_3_1);
        R_O2_3_2 = (RadioButton) v.findViewById(R.id.R_O2_3_2);
        R_O2_3_3 = (RadioButton) v.findViewById(R.id.R_O2_3_3);
        R_O2_4_1 = (RadioButton) v.findViewById(R.id.R_O2_4_1);
        R_O2_4_2 = (RadioButton) v.findViewById(R.id.R_O2_4_2);
        R_O2_4_3 = (RadioButton) v.findViewById(R.id.R_O2_4_3);
        R_O3_yes = (RadioButton) v.findViewById(R.id.R_O3_yes);
        R_O3_No = (RadioButton) v.findViewById(R.id.R_O3_No);
        R_O4_yes = (RadioButton) v.findViewById(R.id.R_O4_yes);
        R_O4_No = (RadioButton) v.findViewById(R.id.R_O4_No);
        R_O6_yes = (RadioButton) v.findViewById(R.id.R_O6_yes);
        R_O6_No = (RadioButton) v.findViewById(R.id.R_O6_No);

    }

    void InitialzieChecbox(View v) {
        C_O1_1 = (CheckBox) v.findViewById(R.id.C_O1_1);
        C_O1_2 = (CheckBox) v.findViewById(R.id.C_O1_2);
        C_O1_3 = (CheckBox) v.findViewById(R.id.C_O1_3);
        C_O1_4 = (CheckBox) v.findViewById(R.id.C_O1_4);
        L_O5_1 = (CheckBox) v.findViewById(R.id.L_O5_1);
        L_O5_2 = (CheckBox) v.findViewById(R.id.L_O5_2);
        L_O5_3 = (CheckBox) v.findViewById(R.id.L_O5_3);
        L_O5_4 = (CheckBox) v.findViewById(R.id.L_O5_4);
        L_O5_5 = (CheckBox) v.findViewById(R.id.L_O5_5);
        L_O5_6 = (CheckBox) v.findViewById(R.id.L_O5_6);
        L_O5_7 = (CheckBox) v.findViewById(R.id.L_O5_7);
        L_O5_8 = (CheckBox) v.findViewById(R.id.L_O5_8);
        L_O5_9 = (CheckBox) v.findViewById(R.id.L_O5_9);
        L_O5_10 = (CheckBox) v.findViewById(R.id.L_O5_10);
        L_O5_11 = (CheckBox) v.findViewById(R.id.L_O5_11);
        L_O5_12 = (CheckBox) v.findViewById(R.id.L_O5_12);
        L_O5_13 = (CheckBox) v.findViewById(R.id.L_O5_13);
        L_O5_14 = (CheckBox) v.findViewById(R.id.L_O5_14);
        L_O5_15 = (CheckBox) v.findViewById(R.id.L_O5_15);
        L_O5_16 = (CheckBox) v.findViewById(R.id.L_O5_16);
        L_O5_17 = (CheckBox) v.findViewById(R.id.L_O5_17);
        L_O5_18 = (CheckBox) v.findViewById(R.id.L_O5_18);
        L_O5_19 = (CheckBox) v.findViewById(R.id.L_O5_19);
        L_O5_20 = (CheckBox) v.findViewById(R.id.L_O5_20);
        L_O5_21 = (CheckBox) v.findViewById(R.id.L_O5_21);
        L_O7_1 = (CheckBox) v.findViewById(R.id.L_O7_1);
        L_O7_2 = (CheckBox) v.findViewById(R.id.L_O7_2);
        L_O7_3 = (CheckBox) v.findViewById(R.id.L_O7_3);
        L_O7_4 = (CheckBox) v.findViewById(R.id.L_O7_4);
        L_O7_5 = (CheckBox) v.findViewById(R.id.L_O7_5);
        L_O7_6 = (CheckBox) v.findViewById(R.id.L_O7_6);
        L_O7_7 = (CheckBox) v.findViewById(R.id.L_O7_7);
        L_O7_8 = (CheckBox) v.findViewById(R.id.L_O7_8);
        L_O7_9 = (CheckBox) v.findViewById(R.id.L_O7_9);
        L_O7_10 = (CheckBox) v.findViewById(R.id.L_O7_10);
    }

    void Assign_Values() {
        if (C_O1_1.isChecked()) {
            O1_1 = "1";
        } else {
            O1_1 = "999";
        }

        if (C_O1_2.isChecked()) {
            O1_2 = "1";
        } else {
            O1_2 = "999";
        }

        if (C_O1_3.isChecked()) {
            O1_3 = "1";
        } else {
            O1_3 = "999";
        }

        if (C_O1_4.isChecked()) {
            O1_4 = "1";
        } else {
            O1_4 = "999";
        }

        if (R_O2_1_1.isChecked()) {
            O2_1 = "1";
        } else if (R_O2_1_2.isChecked()) {
            O2_1 = "2";
        } else if (R_O2_1_3.isChecked()) {
            O2_1 = "3";
        } else {
            O2_1 = "999";
        }

        if (R_O2_2_1.isChecked()) {
            O2_2 = "1";
        } else if (R_O2_2_2.isChecked()) {
            O2_2 = "2";
        } else if (R_O2_2_3.isChecked()) {
            O2_2 = "3";
        } else {
            O2_2 = "999";
        }

        if (R_O2_3_1.isChecked()) {
            O2_3 = "1";
        } else if (R_O2_3_2.isChecked()) {
            O2_3 = "2";
        } else if (R_O2_3_3.isChecked()) {
            O2_3 = "3";
        } else {
            O2_3 = "999";
        }

        if (R_O2_4_1.isChecked()) {
            O2_4 = "1";
        } else if (R_O2_4_2.isChecked()) {
            O2_4 = "2";
        } else if (R_O2_4_3.isChecked()) {
            O2_4 = "3";
        } else {
            O2_4 = "999";
        }

        if (R_O3_yes.isChecked()) {
            O3 = "1";
        } else if (R_O3_No.isChecked()) {
            O3 = "2";
        } else {
            O3 = "999";
        }

        if (R_O4_yes.isChecked()) {
            O4 = "1";
        } else if (R_O4_No.isChecked()) {
            O4 = "2";
        } else {
            O4 = "999";
        }

        if (L_O5_1.isChecked()) {
            O5_1 = "1";
        } else {
            O5_1 = "999";
        }

        if (L_O5_2.isChecked()) {
            O5_2 = "1";
        } else {
            O5_2 = "999";
        }

        if (L_O5_3.isChecked()) {
            O5_3 = "1";
        } else {
            O5_3 = "999";
        }

        if (L_O5_4.isChecked()) {
            O5_4 = "1";
        } else {
            O5_4 = "999";
        }

        if (L_O5_5.isChecked()) {
            O5_5 = "1";
        } else {
            O5_5 = "999";
        }

        if (L_O5_6.isChecked()) {
            O5_6 = "1";
        } else {
            O5_6 = "999";
        }

        if (L_O5_7.isChecked()) {
            O5_7 = "1";
        } else {
            O5_7 = "999";
        }

        if (L_O5_8.isChecked()) {
            O5_8 = "1";
        } else {
            O5_8 = "999";
        }

        if (L_O5_9.isChecked()) {
            O5_9 = "1";
        } else {
            O5_9 = "999";
        }

        if (L_O5_10.isChecked()) {
            O5_10 = "1";
        } else {
            O5_10 = "999";
        }

        if (L_O5_11.isChecked()) {
            O5_11 = "1";
        } else {
            O5_11 = "999";
        }

        if (L_O5_12.isChecked()) {
            O5_12 = "1";
        } else {
            O5_12 = "999";
        }

        if (L_O5_13.isChecked()) {
            O5_13 = "1";
        } else {
            O5_13 = "999";
        }

        if (L_O5_14.isChecked()) {
            O5_14 = "1";
        } else {
            O5_14 = "999";
        }

        if (L_O5_15.isChecked()) {
            O5_15 = "1";
        } else {
            O5_15 = "999";
        }

        if (L_O5_16.isChecked()) {
            O5_16 = "1";
        } else {
            O5_16 = "999";
        }

        if (L_O5_17.isChecked()) {
            O5_17 = "1";
        } else {
            O5_17 = "999";
        }

        if (L_O5_18.isChecked()) {
            O5_18 = "1";
        } else {
            O5_18 = "999";
        }

        if (L_O5_19.isChecked()) {
            O5_19 = "1";
        } else {
            O5_19 = "999";
        }

        if (L_O5_20.isChecked()) {
            O5_20 = "1";
        } else {
            O5_20 = "999";
        }

        if (L_O5_21.isChecked()) {
            O5_21 = "1";
        } else {
            O5_21 = "999";
        }

        if (R_O6_yes.isChecked()) {
            O6 = "1";
        } else if (R_O6_No.isChecked()) {
            O6 = "2";
        } else {
            O6 = "999";
        }

        if (L_O7_1.isChecked()) {
            O7_1 = "1";
        } else {
            O7_1 = "999";
        }

        if (L_O7_2.isChecked()) {
            O7_2 = "1";
        } else {
            O7_2 = "999";
        }

        if (L_O7_3.isChecked()) {
            O7_3 = "1";
        } else {
            O7_3 = "999";
        }

        if (L_O7_4.isChecked()) {
            O7_4 = "1";
        } else {
            O7_4 = "999";
        }

        if (L_O7_5.isChecked()) {
            O7_5 = "1";
        } else {
            O7_5 = "999";
        }

        if (L_O7_6.isChecked()) {
            O7_6 = "1";
        } else {
            O7_6 = "999";
        }

        if (L_O7_7.isChecked()) {
            O7_7 = "1";
        } else {
            O7_7 = "999";
        }

        if (L_O7_8.isChecked()) {
            O7_8 = "1";
        } else {
            O7_8 = "999";
        }

        if (L_O7_9.isChecked()) {
            O7_9 = "1";
        } else {
            O7_9 = "999";
        }

        if (L_O7_10.isChecked()) {
            O7_10 = "1";
        } else {
            O7_10 = "999";
        }

    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_O1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_O2) == false) {
            return false;
        } else {
            if (lv_O2.getVisibility() == View.VISIBLE) {
                if (R_O2_1_1.isChecked() || R_O2_1_2.isChecked() || R_O2_1_3.isChecked()) {

                } else {

                    return false;

                }

                if (R_O2_2_1.isChecked() || R_O2_2_2.isChecked() || R_O2_2_3.isChecked()) {

                } else {

                    return false;

                }

                if (R_O2_3_1.isChecked() || R_O2_3_2.isChecked() || R_O2_3_3.isChecked()) {

                } else {

                    return false;

                }
            }

        }
        if (Gothrough.IamHiden(lv_O3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_O4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_O5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_O6) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_O7) != false;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +
                col_O.O1_1 + "='" + O1_1 + "'," +
                col_O.O1_2 + "='" + O1_2 + "'," +
                col_O.O1_3 + "='" + O1_3 + "'," +
                col_O.O1_4 + "='" + O1_4 + "'," +
                col_O.O2_1 + "='" + O2_1 + "'," +
                col_O.O2_2 + "='" + O2_2 + "'," +
                col_O.O2_3 + "='" + O2_3 + "'," +
                col_O.O2_4 + "='" + O2_4 + "'," +
                col_O.O3 + "='" + O3 + "'," +
                col_O.O4 + "='" + O4 + "'," +
                col_O.O5_1 + "='" + O5_1 + "'," +
                col_O.O5_2 + "='" + O5_2 + "'," +
                col_O.O5_3 + "='" + O5_3 + "'," +
                col_O.O5_4 + "='" + O5_4 + "'," +
                col_O.O5_5 + "='" + O5_5 + "'," +
                col_O.O5_6 + "='" + O5_6 + "'," +
                col_O.O5_7 + "='" + O5_7 + "'," +
                col_O.O5_8 + "='" + O5_8 + "'," +
                col_O.O5_9 + "='" + O5_9 + "'," +
                col_O.O5_10 + "='" + O5_10 + "'," +
                col_O.O5_11 + "='" + O5_11 + "'," +
                col_O.O5_12 + "='" + O5_12 + "'," +
                col_O.O5_13 + "='" + O5_13 + "'," +
                col_O.O5_14 + "='" + O5_14 + "'," +
                col_O.O5_15 + "='" + O5_15 + "'," +
                col_O.O5_16 + "='" + O5_16 + "'," +
                col_O.O5_17 + "='" + O5_17 + "'," +
                col_O.O5_18 + "='" + O5_18 + "'," +
                col_O.O5_19 + "='" + O5_19 + "'," +
                col_O.O5_20 + "='" + O5_20 + "'," +
                col_O.O5_21 + "='" + O5_21 + "'," +
                col_O.O6 + "='" + O6 + "'," +
                col_O.O7_1 + "='" + O7_1 + "'," +
                col_O.O7_2 + "='" + O7_2 + "'," +
                col_O.O7_3 + "='" + O7_3 + "'," +
                col_O.O7_4 + "='" + O7_4 + "'," +
                col_O.O7_5 + "='" + O7_5 + "'," +
                col_O.O7_6 + "='" + O7_6 + "'," +
                col_O.O7_7 + "='" + O7_7 + "'," +
                col_O.O7_8 + "='" + O7_8 + "'," +
                col_O.O7_9 + "='" + O7_9 + "'," +
                col_O.O7_10 + "='" + O7_10 + "'" +
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
