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
import data.col_N;
import data.col_O;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.GothroughTextboxss;
import utils.Validation;


public class Fragment_N extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Radiobutton

    RadioButton


            R_N3_yes,
            R_N3_No,
            R_N4_yes,
            R_N4_No,
            R_N5_yes,
            R_N5_No,
            R_N6_yes,
            R_N6_No,
            R_N7_yes,
            R_N7_No,
            R_N8_yes,
            R_N8_No,
            R_N9_yes,
            R_N9_No,
            R_N10_yes,
            R_N10_No,
            R_N12_yes,
            R_N12_No,
            R_N15_1_yes,
            R_N15_1_No,
            R_N15_2_yes,
            R_N15_2_No,
            R_N15_3_yes,
            R_N15_3_No,
            R_N17_1,
            R_N17_2,
            R_N17_3,
            R_N17_4,
            R_N17_5;


    //endregion

    //region Checkboxxx
    CheckBox
            C_N1_1,
            C_N1_2,
            C_N1_3,
            C_N1_4,
            C_N11_1,
            C_N11_2,
            C_N11_3,
            C_N11_4,
            C_N11_5,
            C_N11_6,
            C_N11_7,
            C_N11_8,
            C_N11_9,
            C_N11_10,
            C_N11_11,
            C_N11_12,
            C_N11_13,
            C_N11_14,
            C_N11_15,
            C_N11_16,
            C_N11_17,
            C_N11_18,
            C_N11_19,
            C_N11_20,
            C_N13_1,
            C_N13_2,
            C_N13_3,
            C_N13_4,
            C_N13_5,
            C_N13_6,
            C_N13_7,
            C_N13_8,
            C_N13_9,
            C_N13_10,
            C_N16_1,
            C_N16_2,
            C_N16_3;


    //endregion

    //region Editextview

    EditText
            ET_N2_1,
            ET_N2_2,
            ET_N2_3,
            ET_N14_1,
            ET_N14_2,
            ET_N14_3,
            ET_N14_4,
            ET_N14_5,
            ET_N14_6;


    //endregion


    //region Linearlayout
    LinearLayout
            lv_sub_main,
            Lv_N1,
            Lv_N2,
            Lv_N3,
            Lv_N4,
            Lv_N5,
            Lv_N6,
            Lv_N7,
            Lv_N8,
            Lv_N9,
            Lv_N10,
            Lv_N11,
            Lv_N12,
            Lv_N13,
            Lv_N14,
            Lv_N15,
            Lv_N16,
            Lv_N17;


    //endregion


    //region Sting  Declaer strign here as you mention in Satic classs


    String
            N1_1,
            N1_2,
            N1_3,
            N1_4,
            N2_1,
            N2_2,
            N2_3,
            N3,
            N4,
            N5,
            N6,
            N7,
            N8,
            N9,
            N10,
            N11_1,
            N11_2,
            N11_3,
            N11_4,
            N11_5,
            N11_6,
            N11_7,
            N11_8,
            N11_9,
            N11_10,
            N11_11,
            N11_12,
            N11_13,
            N11_14,
            N11_15,
            N11_16,
            N11_17,
            N11_18,
            N11_19,
            N11_20,
            N12,
            N13_1,
            N13_2,
            N13_3,
            N13_4,
            N13_5,
            N13_6,
            N13_7,
            N13_8,
            N13_9,
            N13_10,
            N14_1,
            N14_2,
            N14_3,
            N14_4,
            N14_5,
            N14_6,
            N15_1,
            N15_2,
            N15_3,
            N16_1,
            N16_2,
            N16_3,
            N17;


    //endregion


    private OnFragmentInteractionListener mListener;

    public Fragment_N() {
    }

    public static Fragment_N newInstance(String param1, String param2) {
        Fragment_N fragment = new Fragment_N();

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


        View v = inflater.inflate(R.layout.fragment_n, container, false);


        initalizerCheckbox(v);
        initalizerEditext(v);
        initalizerLinearlayout(v);
        initalizRadiobutton(v);


        C_N1_1.setOnCheckedChangeListener(this);
        C_N1_2.setOnCheckedChangeListener(this);
        C_N1_3.setOnCheckedChangeListener(this);
        C_N1_4.setOnCheckedChangeListener(this);

        R_N10_No.setOnCheckedChangeListener(this);
        R_N10_yes.setOnCheckedChangeListener(this);

        R_N12_No.setOnCheckedChangeListener(this);
        R_N12_yes.setOnCheckedChangeListener(this);

        R_N15_1_No.setOnCheckedChangeListener(this);
        R_N15_1_yes.setOnCheckedChangeListener(this);


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


                LogtableUpdates.UpdateLogSection(getContext(), "N", Validation.A1);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();


                if (Validation.A13_2_ischekd.equals("false")) {

                    Fragment_P fragment = new Fragment_P();
                    ftu.replace(R.id.frag_container, fragment).commit();
                    AsingValuesOsection(); // Update O Section if it;s skiped

                } else {
                    Fragment_O fragment = new Fragment_O();
                    ftu.replace(R.id.frag_container, fragment).commit();
                }


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

        if (compoundButton.getId() == R.id.C_N1_1 || compoundButton.getId() == R.id.C_N1_2 ||
                compoundButton.getId() == R.id.C_N1_3 || compoundButton.getId() == R.id.C_N1_4) {


            if (C_N1_1.isChecked()) {
                ET_N2_1.setVisibility(View.VISIBLE);
            } else {
                ET_N2_1.setVisibility(View.GONE);

                ET_N2_1.setText("");
            }
            if (C_N1_2.isChecked()) {
                ET_N2_3.setVisibility(View.VISIBLE);
            } else {
                ET_N2_3.setVisibility(View.GONE);
                ET_N2_3.setText("");
            }
            if (C_N1_3.isChecked()) {
                ET_N2_2.setVisibility(View.VISIBLE);
            } else {
                ET_N2_2.setVisibility(View.GONE);
                ET_N2_3.setText("");
            }

            if (C_N1_4.isChecked()) {
                C_N1_1.setChecked(false);
                C_N1_2.setChecked(false);
                C_N1_3.setChecked(false);


                Lv_N2.setVisibility(View.GONE);
                Lv_N3.setVisibility(View.GONE);
                Lv_N4.setVisibility(View.GONE);
                Lv_N5.setVisibility(View.GONE);
                Lv_N6.setVisibility(View.GONE);
                Lv_N7.setVisibility(View.GONE);
                Lv_N8.setVisibility(View.GONE);
                Lv_N9.setVisibility(View.GONE);
                Lv_N10.setVisibility(View.GONE);
                Lv_N11.setVisibility(View.GONE);
                Lv_N12.setVisibility(View.GONE);
                Lv_N13.setVisibility(View.GONE);
                Lv_N14.setVisibility(View.GONE);
                Lv_N15.setVisibility(View.GONE);
                Lv_N16.setVisibility(View.GONE);
                Lv_N17.setVisibility(View.GONE);


                ClearAllcontrol.ClearAll(Lv_N2);
                ClearAllcontrol.ClearAll(Lv_N3);
                ClearAllcontrol.ClearAll(Lv_N4);
                ClearAllcontrol.ClearAll(Lv_N5);
                ClearAllcontrol.ClearAll(Lv_N6);
                ClearAllcontrol.ClearAll(Lv_N7);
                ClearAllcontrol.ClearAll(Lv_N8);
                ClearAllcontrol.ClearAll(Lv_N9);
                ClearAllcontrol.ClearAll(Lv_N10);
                ClearAllcontrol.ClearAll(Lv_N11);
                ClearAllcontrol.ClearAll(Lv_N12);
                ClearAllcontrol.ClearAll(Lv_N13);
                ClearAllcontrol.ClearAll(Lv_N14);
                ClearAllcontrol.ClearAll(Lv_N15);
                ClearAllcontrol.ClearAll(Lv_N16);
                ClearAllcontrol.ClearAll(Lv_N17);

            } else {
                Lv_N2.setVisibility(View.VISIBLE);
                Lv_N3.setVisibility(View.VISIBLE);
                Lv_N4.setVisibility(View.VISIBLE);
                Lv_N5.setVisibility(View.VISIBLE);
                Lv_N6.setVisibility(View.VISIBLE);
                Lv_N7.setVisibility(View.VISIBLE);
                Lv_N8.setVisibility(View.VISIBLE);
                Lv_N9.setVisibility(View.VISIBLE);
                Lv_N10.setVisibility(View.VISIBLE);
                Lv_N11.setVisibility(View.VISIBLE);
                Lv_N12.setVisibility(View.VISIBLE);
                Lv_N13.setVisibility(View.VISIBLE);
                Lv_N14.setVisibility(View.VISIBLE);
                Lv_N15.setVisibility(View.VISIBLE);
                Lv_N16.setVisibility(View.VISIBLE);
                Lv_N17.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.R_N10_yes || compoundButton.getId() == R.id.R_N10_No) {
            if (R_N10_No.isChecked()) {
                Lv_N11.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(Lv_N11);
            } else {
                Lv_N11.setVisibility(View.VISIBLE);
            }
        }
        if (compoundButton.getId() == R.id.R_N12_yes || compoundButton.getId() == R.id.R_N12_No) {
            if (R_N12_No.isChecked()) {
                Lv_N13.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(Lv_N13);
            } else {
                Lv_N13.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.R_N15_1_No || compoundButton.getId() == R.id.R_N15_1_yes) {
            if (R_N15_1_No.isChecked()) {
                R_N15_2_No.setVisibility(View.GONE);
                R_N15_2_yes.setVisibility(View.GONE);
                R_N15_2_No.setChecked(false);
                R_N15_2_yes.setChecked(false);
            } else {
                R_N15_2_No.setVisibility(View.VISIBLE);
                R_N15_2_yes.setVisibility(View.VISIBLE);
            }
        }
    }

    void initalizerLinearlayout(View v) {

        lv_sub_main = (LinearLayout) v.findViewById(R.id.lv_sub_main);
        Lv_N1 = (LinearLayout) v.findViewById(R.id.lv_N1);
        Lv_N2 = (LinearLayout) v.findViewById(R.id.lv_N2);
        Lv_N3 = (LinearLayout) v.findViewById(R.id.lv_N3);
        Lv_N4 = (LinearLayout) v.findViewById(R.id.lv_N4);
        Lv_N5 = (LinearLayout) v.findViewById(R.id.lv_N5);
        Lv_N6 = (LinearLayout) v.findViewById(R.id.lv_N6);
        Lv_N7 = (LinearLayout) v.findViewById(R.id.lv_N7);
        Lv_N8 = (LinearLayout) v.findViewById(R.id.lv_N8);
        Lv_N9 = (LinearLayout) v.findViewById(R.id.lv_N9);
        Lv_N10 = (LinearLayout) v.findViewById(R.id.lv_N10);
        Lv_N11 = (LinearLayout) v.findViewById(R.id.lv_N11);
        Lv_N12 = (LinearLayout) v.findViewById(R.id.lv_N12);
        Lv_N13 = (LinearLayout) v.findViewById(R.id.lv_N13);
        Lv_N14 = (LinearLayout) v.findViewById(R.id.lv_N14);
        Lv_N15 = (LinearLayout) v.findViewById(R.id.lv_N15);
        Lv_N16 = (LinearLayout) v.findViewById(R.id.lv_N16);
        Lv_N17 = (LinearLayout) v.findViewById(R.id.lv_N17);
    }

    void initalizRadiobutton(View v) {


        R_N3_yes = (RadioButton) v.findViewById(R.id.R_N3_yes);
        R_N3_No = (RadioButton) v.findViewById(R.id.R_N3_No);
        R_N4_yes = (RadioButton) v.findViewById(R.id.R_N4_yes);
        R_N4_No = (RadioButton) v.findViewById(R.id.R_N4_No);
        R_N5_yes = (RadioButton) v.findViewById(R.id.R_N5_yes);
        R_N5_No = (RadioButton) v.findViewById(R.id.R_N5_No);
        R_N6_yes = (RadioButton) v.findViewById(R.id.R_N6_yes);
        R_N6_No = (RadioButton) v.findViewById(R.id.R_N6_No);
        R_N7_yes = (RadioButton) v.findViewById(R.id.R_N7_yes);
        R_N7_No = (RadioButton) v.findViewById(R.id.R_N7_No);
        R_N8_yes = (RadioButton) v.findViewById(R.id.R_N8_yes);
        R_N8_No = (RadioButton) v.findViewById(R.id.R_N8_No);
        R_N9_yes = (RadioButton) v.findViewById(R.id.R_N9_yes);
        R_N9_No = (RadioButton) v.findViewById(R.id.R_N9_No);
        R_N10_yes = (RadioButton) v.findViewById(R.id.R_N10_yes);
        R_N10_No = (RadioButton) v.findViewById(R.id.R_N10_No);
        R_N12_yes = (RadioButton) v.findViewById(R.id.R_N12_yes);
        R_N12_No = (RadioButton) v.findViewById(R.id.R_N12_No);
        R_N15_1_yes = (RadioButton) v.findViewById(R.id.R_N15_1_yes);
        R_N15_1_No = (RadioButton) v.findViewById(R.id.R_N15_1_No);
        R_N15_2_yes = (RadioButton) v.findViewById(R.id.R_N15_2_yes);
        R_N15_2_No = (RadioButton) v.findViewById(R.id.R_N15_2_No);
        R_N15_3_yes = (RadioButton) v.findViewById(R.id.R_N15_3_yes);
        R_N15_3_No = (RadioButton) v.findViewById(R.id.R_N15_3_No);
        R_N17_1 = (RadioButton) v.findViewById(R.id.R_N17_1);
        R_N17_2 = (RadioButton) v.findViewById(R.id.R_N17_2);
        R_N17_3 = (RadioButton) v.findViewById(R.id.R_N17_3);
        R_N17_4 = (RadioButton) v.findViewById(R.id.R_N17_4);
        R_N17_5 = (RadioButton) v.findViewById(R.id.R_N17_5);

    }

    void initalizerCheckbox(View v) {
        C_N1_1 = (CheckBox) v.findViewById(R.id.C_N1_1);
        C_N1_2 = (CheckBox) v.findViewById(R.id.C_N1_2);
        C_N1_3 = (CheckBox) v.findViewById(R.id.C_N1_3);
        C_N1_4 = (CheckBox) v.findViewById(R.id.C_N1_4);
        C_N11_1 = (CheckBox) v.findViewById(R.id.C_N11_1);
        C_N11_2 = (CheckBox) v.findViewById(R.id.C_N11_2);
        C_N11_3 = (CheckBox) v.findViewById(R.id.C_N11_3);
        C_N11_4 = (CheckBox) v.findViewById(R.id.C_N11_4);
        C_N11_5 = (CheckBox) v.findViewById(R.id.C_N11_5);
        C_N11_6 = (CheckBox) v.findViewById(R.id.C_N11_6);
        C_N11_7 = (CheckBox) v.findViewById(R.id.C_N11_7);
        C_N11_8 = (CheckBox) v.findViewById(R.id.C_N11_8);
        C_N11_9 = (CheckBox) v.findViewById(R.id.C_N11_9);
        C_N11_10 = (CheckBox) v.findViewById(R.id.C_N11_10);
        C_N11_11 = (CheckBox) v.findViewById(R.id.C_N11_11);
        C_N11_12 = (CheckBox) v.findViewById(R.id.C_N11_12);
        C_N11_13 = (CheckBox) v.findViewById(R.id.C_N11_13);
        C_N11_14 = (CheckBox) v.findViewById(R.id.C_N11_14);
        C_N11_15 = (CheckBox) v.findViewById(R.id.C_N11_15);
        C_N11_16 = (CheckBox) v.findViewById(R.id.C_N11_16);
        C_N11_17 = (CheckBox) v.findViewById(R.id.C_N11_17);
        C_N11_18 = (CheckBox) v.findViewById(R.id.C_N11_18);
        C_N11_19 = (CheckBox) v.findViewById(R.id.C_N11_19);
        C_N11_20 = (CheckBox) v.findViewById(R.id.C_N11_20);
        C_N13_1 = (CheckBox) v.findViewById(R.id.C_N13_1);
        C_N13_2 = (CheckBox) v.findViewById(R.id.C_N13_2);
        C_N13_3 = (CheckBox) v.findViewById(R.id.C_N13_3);
        C_N13_4 = (CheckBox) v.findViewById(R.id.C_N13_4);
        C_N13_5 = (CheckBox) v.findViewById(R.id.C_N13_5);
        C_N13_6 = (CheckBox) v.findViewById(R.id.C_N13_6);
        C_N13_7 = (CheckBox) v.findViewById(R.id.C_N13_7);
        C_N13_8 = (CheckBox) v.findViewById(R.id.C_N13_8);
        C_N13_9 = (CheckBox) v.findViewById(R.id.C_N13_9);
        C_N13_10 = (CheckBox) v.findViewById(R.id.C_N13_10);
        C_N16_1 = (CheckBox) v.findViewById(R.id.L_N16_1);
        C_N16_2 = (CheckBox) v.findViewById(R.id.L_N16_2);
        C_N16_3 = (CheckBox) v.findViewById(R.id.L_N16_3);
    }

    void initalizerEditext(View v) {
        ET_N2_1 = (EditText) v.findViewById(R.id.ET_N2_1);
        ET_N2_2 = (EditText) v.findViewById(R.id.ET_N2_2);
        ET_N2_3 = (EditText) v.findViewById(R.id.ET_N2_3);
        ET_N14_1 = (EditText) v.findViewById(R.id.ET_N14_1);
        ET_N14_2 = (EditText) v.findViewById(R.id.ET_N14_2);
        ET_N14_3 = (EditText) v.findViewById(R.id.ET_N14_3);
        ET_N14_4 = (EditText) v.findViewById(R.id.ET_N14_4);
        ET_N14_5 = (EditText) v.findViewById(R.id.ET_N14_5);
        ET_N14_6 = (EditText) v.findViewById(R.id.ET_N14_6);
    }

    void Assign_Values() {
        if (C_N1_1.isChecked()) {
            N1_1 = "1";
        } else {
            N1_1 = "999";
        }

        if (C_N1_2.isChecked()) {
            N1_2 = "1";
        } else {
            N1_2 = "999";
        }

        if (C_N1_3.isChecked()) {
            N1_3 = "1";
        } else {
            N1_3 = "999";
        }

        if (C_N1_4.isChecked()) {
            N1_4 = "1";
        } else {
            N1_4 = "999";
        }

        if (ET_N2_1.getText().toString().trim().length() > 0) {
            N2_1 = ET_N2_1.getText().toString().trim();
        } else {
            N2_1 = "999";
        }

        if (ET_N2_2.getText().toString().trim().length() > 0) {
            N2_2 = ET_N2_2.getText().toString().trim();
        } else {
            N2_2 = "999";
        }

        if (ET_N2_3.getText().toString().trim().length() > 0) {
            N2_3 = ET_N2_3.getText().toString().trim();
        } else {
            N2_3 = "999";
        }

        if (R_N3_yes.isChecked()) {
            N3 = "1";
        } else if (R_N3_No.isChecked()) {
            N3 = "2";
        } else {
            N3 = "999";
        }

        if (R_N4_yes.isChecked()) {
            N4 = "1";
        } else if (R_N4_No.isChecked()) {
            N4 = "2";
        } else {
            N4 = "999";
        }

        if (R_N5_yes.isChecked()) {
            N5 = "1";
        } else if (R_N5_No.isChecked()) {
            N5 = "2";
        } else {
            N5 = "999";
        }

        if (R_N6_yes.isChecked()) {
            N6 = "1";
        } else if (R_N6_No.isChecked()) {
            N6 = "2";
        } else {
            N6 = "999";
        }

        if (R_N7_yes.isChecked()) {
            N7 = "1";
        } else if (R_N7_No.isChecked()) {
            N7 = "2";
        } else {
            N7 = "999";
        }

        if (R_N8_yes.isChecked()) {
            N8 = "1";
        } else if (R_N8_No.isChecked()) {
            N8 = "2";
        } else {
            N8 = "999";
        }

        if (R_N9_yes.isChecked()) {
            N9 = "1";
        } else if (R_N9_No.isChecked()) {
            N9 = "2";
        } else {
            N9 = "999";
        }

        if (R_N10_yes.isChecked()) {
            N10 = "1";
        } else if (R_N10_No.isChecked()) {
            N10 = "2";
        } else {
            N10 = "999";
        }

        if (C_N11_1.isChecked()) {
            N11_1 = "1";
        } else {
            N11_1 = "999";
        }

        if (C_N11_2.isChecked()) {
            N11_2 = "1";
        } else {
            N11_2 = "999";
        }

        if (C_N11_3.isChecked()) {
            N11_3 = "1";
        } else {
            N11_3 = "999";
        }

        if (C_N11_4.isChecked()) {
            N11_4 = "1";
        } else {
            N11_4 = "999";
        }

        if (C_N11_5.isChecked()) {
            N11_5 = "1";
        } else {
            N11_5 = "999";
        }

        if (C_N11_6.isChecked()) {
            N11_6 = "1";
        } else {
            N11_6 = "999";
        }

        if (C_N11_7.isChecked()) {
            N11_7 = "1";
        } else {
            N11_7 = "999";
        }

        if (C_N11_8.isChecked()) {
            N11_8 = "1";
        } else {
            N11_8 = "999";
        }

        if (C_N11_9.isChecked()) {
            N11_9 = "1";
        } else {
            N11_9 = "999";
        }

        if (C_N11_10.isChecked()) {
            N11_10 = "1";
        } else {
            N11_10 = "999";
        }

        if (C_N11_11.isChecked()) {
            N11_11 = "1";
        } else {
            N11_11 = "999";
        }

        if (C_N11_12.isChecked()) {
            N11_12 = "1";
        } else {
            N11_12 = "999";
        }

        if (C_N11_13.isChecked()) {
            N11_13 = "1";
        } else {
            N11_13 = "999";
        }

        if (C_N11_14.isChecked()) {
            N11_14 = "1";
        } else {
            N11_14 = "999";
        }

        if (C_N11_15.isChecked()) {
            N11_15 = "1";
        } else {
            N11_15 = "999";
        }

        if (C_N11_16.isChecked()) {
            N11_16 = "1";
        } else {
            N11_16 = "999";
        }

        if (C_N11_17.isChecked()) {
            N11_17 = "1";
        } else {
            N11_17 = "999";
        }

        if (C_N11_18.isChecked()) {
            N11_18 = "1";
        } else {
            N11_18 = "999";
        }

        if (C_N11_19.isChecked()) {
            N11_19 = "1";
        } else {
            N11_19 = "999";
        }

        if (C_N11_20.isChecked()) {
            N11_20 = "1";
        } else {
            N11_20 = "999";
        }

        if (R_N12_yes.isChecked()) {
            N12 = "1";
        } else if (R_N12_No.isChecked()) {
            N12 = "2";
        } else {
            N12 = "999";
        }

        if (C_N13_1.isChecked()) {
            N13_1 = "1";
        } else {
            N13_1 = "999";
        }

        if (C_N13_2.isChecked()) {
            N13_2 = "1";
        } else {
            N13_2 = "999";
        }

        if (C_N13_3.isChecked()) {
            N13_3 = "1";
        } else {
            N13_3 = "999";
        }

        if (C_N13_4.isChecked()) {
            N13_4 = "1";
        } else {
            N13_4 = "999";
        }

        if (C_N13_5.isChecked()) {
            N13_5 = "1";
        } else {
            N13_5 = "999";
        }

        if (C_N13_6.isChecked()) {
            N13_6 = "1";
        } else {
            N13_6 = "999";
        }

        if (C_N13_7.isChecked()) {
            N13_7 = "1";
        } else {
            N13_7 = "999";
        }

        if (C_N13_8.isChecked()) {
            N13_8 = "1";
        } else {
            N13_8 = "999";
        }

        if (C_N13_9.isChecked()) {
            N13_9 = "1";
        } else {
            N13_9 = "999";
        }

        if (C_N13_10.isChecked()) {
            N13_10 = "1";
        } else {
            N13_10 = "999";
        }

        if (ET_N14_1.getText().toString().trim().length() > 0) {
            N14_1 = ET_N14_1.getText().toString().trim();
        } else {
            N14_1 = "999";
        }

        if (ET_N14_2.getText().toString().trim().length() > 0) {
            N14_2 = ET_N14_2.getText().toString().trim();
        } else {
            N14_2 = "999";
        }

        if (ET_N14_3.getText().toString().trim().length() > 0) {
            N14_3 = ET_N14_3.getText().toString().trim();
        } else {
            N14_3 = "999";
        }

        if (ET_N14_4.getText().toString().trim().length() > 0) {
            N14_4 = ET_N14_4.getText().toString().trim();
        } else {
            N14_4 = "999";
        }

        if (ET_N14_5.getText().toString().trim().length() > 0) {
            N14_5 = ET_N14_5.getText().toString().trim();
        } else {
            N14_5 = "999";
        }

        if (ET_N14_6.getText().toString().trim().length() > 0) {
            N14_6 = ET_N14_6.getText().toString().trim();
        } else {
            N14_6 = "999";
        }

        if (R_N15_1_yes.isChecked()) {
            N15_1 = "1";
        } else if (R_N15_1_No.isChecked()) {
            N15_1 = "2";
        } else {
            N15_1 = "999";
        }

        if (R_N15_2_yes.isChecked()) {
            N15_2 = "1";
        } else if (R_N15_2_No.isChecked()) {
            N15_2 = "2";
        } else {
            N15_2 = "999";
        }

        if (R_N15_3_yes.isChecked()) {
            N15_3 = "1";
        } else if (R_N15_3_No.isChecked()) {
            N15_3 = "2";
        } else {
            N15_3 = "999";
        }

        if (C_N16_1.isChecked()) {
            N16_1 = "1";
        } else {
            N16_1 = "999";
        }

        if (C_N16_2.isChecked()) {
            N16_2 = "1";
        } else {
            N16_2 = "999";
        }

        if (C_N16_3.isChecked()) {
            N16_3 = "1";
        } else {
            N16_3 = "999";
        }

        if (R_N17_1.isChecked()) {
            N17 = "1";
        } else if (R_N17_2.isChecked()) {
            N17 = "2";
        } else if (R_N17_3.isChecked()) {
            N17 = "3";
        } else if (R_N17_4.isChecked()) {
            N17 = "4";
        } else if (R_N17_5.isChecked()) {
            N17 = "5";
        } else {
            N17 = "999";
        }

    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(Lv_N1) == false) {

            return false;
        }

        if (Gothrough.IamHiden(Lv_N2) == false) {

            return false;
        } else {

            if (ET_N2_1.getVisibility() == View.VISIBLE) {
                ET_N2_1.setError(null);
                if (ET_N2_1.getText().toString().trim().length() == 0) {

                    ET_N2_1.setError("Enter Text");
                    ET_N2_1.requestFocus();

                    return false;
                }

                if (ET_N2_2.getVisibility() == View.VISIBLE) {
                    ET_N2_2.setError(null);
                    if (ET_N2_2.getText().toString().trim().length() == 0) {

                        ET_N2_2.setError("Enter Text");
                        ET_N2_2.requestFocus();

                        return false;
                    }

                }

                if (ET_N2_3.getVisibility() == View.VISIBLE) {
                    ET_N2_3.setError(null);
                    if (ET_N2_3.getText().toString().trim().length() == 0) {

                        ET_N2_3.setError("Enter Text");
                        ET_N2_3.requestFocus();

                        return false;
                    }
                }
            }

            if (Gothrough.IamHiden(Lv_N3) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N4) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N5) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N6) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N7) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N8) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N9) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N10) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N11) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N12) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N13) == false) {

                return false;
            }

            if (GothroughTextboxss.IamHiden(Lv_N14) == false) {

                return false;
            }
            if (Gothrough.IamHiden(Lv_N15) == false) {

                return false;
            }

            if (Gothrough.IamHiden(Lv_N16) == false) {

                //  return  false;
            }

            return Gothrough.IamHiden(Lv_N17) != false;
        }


    }
    //End Function

    boolean updateHFA() {
        String query = "update  hfa set " +

                col_N.N1_1 + "='" + N1_1 + "'," +
                col_N.N1_2 + "='" + N1_2 + "'," +
                col_N.N1_3 + "='" + N1_3 + "'," +
                col_N.N1_4 + "='" + N1_4 + "'," +
                col_N.N2_1 + "='" + N2_1 + "'," +
                col_N.N2_2 + "='" + N2_2 + "'," +
                col_N.N2_3 + "='" + N2_3 + "'," +
                col_N.N3 + "='" + N3 + "'," +
                col_N.N4 + "='" + N4 + "'," +
                col_N.N5 + "='" + N5 + "'," +
                col_N.N6 + "='" + N6 + "'," +
                col_N.N7 + "='" + N7 + "'," +
                col_N.N8 + "='" + N8 + "'," +
                col_N.N9 + "='" + N9 + "'," +
                col_N.N10 + "='" + N10 + "'," +
                col_N.N11_1 + "='" + N11_1 + "'," +
                col_N.N11_2 + "='" + N11_2 + "'," +
                col_N.N11_3 + "='" + N11_3 + "'," +
                col_N.N11_4 + "='" + N11_4 + "'," +
                col_N.N11_5 + "='" + N11_5 + "'," +
                col_N.N11_6 + "='" + N11_6 + "'," +
                col_N.N11_7 + "='" + N11_7 + "'," +
                col_N.N11_8 + "='" + N11_8 + "'," +
                col_N.N11_9 + "='" + N11_9 + "'," +
                col_N.N11_10 + "='" + N11_10 + "'," +
                col_N.N11_11 + "='" + N11_11 + "'," +
                col_N.N11_12 + "='" + N11_12 + "'," +
                col_N.N11_13 + "='" + N11_13 + "'," +
                col_N.N11_14 + "='" + N11_14 + "'," +
                col_N.N11_15 + "='" + N11_15 + "'," +
                col_N.N11_16 + "='" + N11_16 + "'," +
                col_N.N11_17 + "='" + N11_17 + "'," +
                col_N.N11_18 + "='" + N11_18 + "'," +
                col_N.N11_19 + "='" + N11_19 + "'," +
                col_N.N11_20 + "='" + N11_20 + "'," +
                col_N.N12 + "='" + N12 + "'," +
                col_N.N13_1 + "='" + N13_1 + "'," +
                col_N.N13_2 + "='" + N13_2 + "'," +
                col_N.N13_3 + "='" + N13_3 + "'," +
                col_N.N13_4 + "='" + N13_4 + "'," +
                col_N.N13_5 + "='" + N13_5 + "'," +
                col_N.N13_6 + "='" + N13_6 + "'," +
                col_N.N13_7 + "='" + N13_7 + "'," +
                col_N.N13_8 + "='" + N13_8 + "'," +
                col_N.N13_9 + "='" + N13_9 + "'," +
                col_N.N13_10 + "='" + N13_10 + "'," +
                col_N.N14_1 + "='" + N14_1 + "'," +
                col_N.N14_2 + "='" + N14_2 + "'," +
                col_N.N14_3 + "='" + N14_3 + "'," +
                col_N.N14_4 + "='" + N14_4 + "'," +
                col_N.N14_5 + "='" + N14_5 + "'," +
                col_N.N14_6 + "='" + N14_6 + "'," +
                col_N.N15_1 + "='" + N15_1 + "'," +
                col_N.N15_2 + "='" + N15_2 + "'," +
                col_N.N15_3 + "='" + N15_3 + "'," +
                col_N.N16_1 + "='" + N16_1 + "'," +
                col_N.N16_2 + "='" + N16_2 + "'," +
                col_N.N16_3 + "='" + N16_3 + "'," +
                col_N.N17 + "='" + N17 + "'" +
                " Where id=" + Validation.HFAPK;


        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

        return true;

    }

    public void AsingValuesOsection() {

        String query = "update  hfa set " +
                col_O.O1_1 + " ='999'," +
                col_O.O1_2 + " ='999'," +
                col_O.O1_3 + " ='999'," +
                col_O.O1_4 + " ='999'," +
                col_O.O2_1 + " ='999'," +
                col_O.O2_2 + " ='999'," +
                col_O.O2_3 + " ='999'," +
                col_O.O2_4 + " ='999'," +
                col_O.O3 + " ='999'," +
                col_O.O4 + " ='999'," +
                col_O.O5_1 + " ='999'," +
                col_O.O5_2 + " ='999'," +
                col_O.O5_3 + " ='999'," +
                col_O.O5_4 + " ='999'," +
                col_O.O5_5 + " ='999'," +
                col_O.O5_6 + " ='999'," +
                col_O.O5_7 + " ='999'," +
                col_O.O5_8 + " ='999'," +
                col_O.O5_9 + " ='999'," +
                col_O.O5_10 + " ='999'," +
                col_O.O5_11 + " ='999'," +
                col_O.O5_12 + " ='999'," +
                col_O.O5_13 + " ='999'," +
                col_O.O5_14 + " ='999'," +
                col_O.O5_15 + " ='999'," +
                col_O.O5_16 + " ='999'," +
                col_O.O5_17 + " ='999'," +
                col_O.O5_18 + " ='999'," +
                col_O.O5_19 + " ='999'," +
                col_O.O5_20 + " ='999'," +
                col_O.O5_21 + " ='999'," +
                col_O.O6 + " ='999'," +
                col_O.O7_1 + " ='999'," +
                col_O.O7_2 + " ='999'," +
                col_O.O7_3 + " ='999'," +
                col_O.O7_4 + " ='999'," +
                col_O.O7_5 + " ='999'," +
                col_O.O7_6 + " ='999'," +
                col_O.O7_7 + " ='999'," +
                col_O.O7_8 + " ='999'," +
                col_O.O7_9 + " ='999'," +
                col_O.O7_10 + "= '999'" +
                " Where id=" + Validation.HFAPK;


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted O Section  successfully", Toast.LENGTH_SHORT).show();


    }


    //region Update O Section If it is Skiped


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    //endreigon


}
