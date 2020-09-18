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
import data.col_P;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.GothroughRadioButton;
import utils.GothroughTextboxss;
import utils.Validation;


public class Fragment_P extends Fragment implements RadioButton.OnCheckedChangeListener {

    //region Radiobutton

    RadioButton
            R_P1_yes,
            R_P1_No,
            R_P1_1_yes,
            R_P1_1_No,
            R_P2_yes,
            R_P2_No,
            R_P3_1,
            R_P3_2,
            R_P3_3,
            R_P3_4,
            R_P4_yes,
            R_P4_No,
            R_P5_yes,
            R_P5_No,
            R_P6_yes,
            R_P6_No,
            R_P7_yes,
            R_P7_No,
            R_P8_yes,
            R_P8_No,
            R_P9_yes,
            R_P9_No,
            R_P10_1,
            R_P10_2,
            R_P10_3,
            R_P10_4,
            R_P11_1,
            R_P11_2,
            R_P11_3,
            R_P12_1,
            R_P12_2,
            R_P12_3,
            R_P14_1,
            R_P14_2,
            R_P14_3,
            R_P14_4,
            R_P15_1_1,
            R_P15_1_2,
            R_P15_1_3,
            R_P15_1_4,
            R_P15_1_5,
            R_P15_2_1,
            R_P15_2_2,
            R_P15_2_3,
            R_P15_2_4,
            R_P15_2_5,
            R_P15_3_1,
            R_P15_3_2,
            R_P15_3_3,
            R_P15_3_4,
            R_P15_3_5,
            R_P16_1,
            R_P16_2,
            R_P16_3,
            R_P16_4,
            R_P16_5,
            R_P16_6,
            R_P16_7,
            R_P16_8,
            R_P17_yes,
            R_P17_No,
            R_P18_1,
            R_P18_2,
            R_P18_3,
            R_P19_yes,
            R_P19_No,
            R_P21_1_1,
            R_P21_1_2,
            R_P21_1_3,
            R_P21_2_1,
            R_P21_2_2,
            R_P21_2_3,
            R_P21_3_1,
            R_P21_3_2,
            R_P21_3_3,
            R_P21_4_1,
            R_P21_4_2,
            R_P21_4_3,
            R_P21_5_1,
            R_P21_5_2,
            R_P21_5_3;


    //endregion

    //region Checkbox

    CheckBox

            C_P13_1,
            C_P13_2,
            C_P13_3,
            C_P13_4,
            C_P20_1,
            C_P20_2,
            C_P20_3;


    //endregion


    //region Editetextview

    EditText
            ET_P22_1,
            ET_P22_2,
            ET_P22_3,
            ET_P22_4,
            ET_P22_5,
            ET_P22_6,
            ET_P22_7,
            ET_P22_8;


    //endregion


    //region Linerlayout
    LinearLayout
            lv_P1,
            lv_P1_1,
            lv_P2,
            lv_P3,
            lv_P4,
            lv_P5,
            lv_P6,
            lv_P7,
            lv_P8,
            lv_P9,
            lv_P10,
            lv_P11,
            lv_P12,
            lv_P13,
            lv_P14,
            lv_P15,
            lv_P16,
            lv_P17,
            lv_P18,
            lv_P19,
            lv_P20,
            lv_P21,
            lv_P22,
            lv_sub_main;

    //endregion


    //region Sting  Declaer strign here as you mention in Satic classs

    String
            P1,
            P1_1,
            P2,
            P3,
            P4,
            P5,
            P6,
            P7,
            P8,
            P9,
            P10,
            P11,
            P12,
            P13_1,
            P13_2,
            P13_3,
            P13_4,
            P14,
            P15_1,
            P15_2,
            P15_3,
            P16,
            P17,
            P18,
            P19,
            P20_1,
            P20_2,
            P20_3,
            P21_1,
            P21_2,
            P21_3,
            P21_4,
            P21_5,
            P22_1,
            P22_2,
            P22_3,
            P22_4,
            P22_5,
            P22_6,
            P22_7,
            P22_8;

    //endregion


    private OnFragmentInteractionListener mListener;

    public Fragment_P() {
    }

    public static Fragment_P newInstance(String param1, String param2) {
        Fragment_P fragment = new Fragment_P();

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


        View v = inflater.inflate(R.layout.fragment_p, container, false);

        initalzierEditextview(v);
        initalizerLinerlayout(v);
        initalizeRadiobButton(v);
        intializerCheckbox(v);

        R_P1_No.setOnCheckedChangeListener(this);
        R_P1_yes.setOnCheckedChangeListener(this);
        R_P1_1_No.setOnCheckedChangeListener(this);
        R_P1_1_yes.setOnCheckedChangeListener(this);
        R_P2_No.setOnCheckedChangeListener(this);
        R_P2_yes.setOnCheckedChangeListener(this);

        R_P19_No.setOnCheckedChangeListener(this);
        R_P19_yes.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }

                Assign_Values();
                LogtableUpdates.UpdateLogSection(getContext(), "P", Validation.A1);

                if (!P22_1.equals("999")) {
                    ET_P22_1.setError(null);

                    if (Integer.parseInt(P22_1) < Integer.parseInt(P22_2) + Integer.parseInt(P22_3) + Integer.parseInt(P22_4) + Integer.parseInt(P22_5)) {
                        ET_P22_1.setError("Total Operation Must be Greater");
                        ET_P22_1.requestFocus();

                        return;

                    }


                }


                if (!P22_6.equals("999")) {
                    ET_P22_6.setError(null);

                    if (Integer.parseInt(P22_6) < Integer.parseInt(P22_7) + Integer.parseInt(P22_8)) {
                        ET_P22_6.setError("Total Deaths  Must be Greater");
                        ET_P22_6.requestFocus();

                        return;

                    }


                }


                updateHFA();


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_Q fragment = new Fragment_Q();
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


        if (compoundButton.getId() == R.id.R_P1_yes || compoundButton.getId() == R.id.R_P1_No) {

            if (R_P1_yes.isChecked()) {

                lv_P1_1.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_P1_1);

            } else {
                lv_P1_1.setVisibility(View.VISIBLE);
            }

        }

        if (compoundButton.getId() == R.id.R_P1_1_yes || compoundButton.getId() == R.id.R_P1_1_No) {

            if (R_P1_1_No.isChecked()) {

                lv_P2.setVisibility(View.GONE);
                lv_P3.setVisibility(View.GONE);
                lv_P4.setVisibility(View.GONE);
                lv_P5.setVisibility(View.GONE);
                lv_P6.setVisibility(View.GONE);
                lv_P7.setVisibility(View.GONE);
                lv_P8.setVisibility(View.GONE);
                lv_P9.setVisibility(View.GONE);
                lv_P10.setVisibility(View.GONE);
                lv_P11.setVisibility(View.GONE);
                lv_P12.setVisibility(View.GONE);
                lv_P13.setVisibility(View.GONE);
                lv_P14.setVisibility(View.GONE);
                lv_P15.setVisibility(View.GONE);
                lv_P16.setVisibility(View.GONE);
                lv_P17.setVisibility(View.GONE);
                lv_P18.setVisibility(View.GONE);
                lv_P19.setVisibility(View.GONE);
                lv_P20.setVisibility(View.GONE);
                lv_P21.setVisibility(View.GONE);
                lv_P22.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_P2);
                ClearAllcontrol.ClearAll(lv_P3);
                ClearAllcontrol.ClearAll(lv_P4);
                ClearAllcontrol.ClearAll(lv_P5);
                ClearAllcontrol.ClearAll(lv_P6);
                ClearAllcontrol.ClearAll(lv_P7);
                ClearAllcontrol.ClearAll(lv_P8);
                ClearAllcontrol.ClearAll(lv_P9);
                ClearAllcontrol.ClearAll(lv_P10);
                ClearAllcontrol.ClearAll(lv_P11);
                ClearAllcontrol.ClearAll(lv_P12);
                ClearAllcontrol.ClearAll(lv_P13);
                ClearAllcontrol.ClearAll(lv_P14);
                ClearAllcontrol.ClearAll(lv_P15);
                ClearAllcontrol.ClearAll(lv_P16);
                ClearAllcontrol.ClearAll(lv_P17);
                ClearAllcontrol.ClearAll(lv_P18);
                ClearAllcontrol.ClearAll(lv_P19);
                ClearAllcontrol.ClearAll(lv_P20);
                ClearAllcontrol.ClearAll(lv_P21);
                ClearAllcontrol.ClearAll(lv_P22);

            } else {

                lv_P2.setVisibility(View.VISIBLE);
                lv_P3.setVisibility(View.VISIBLE);
                lv_P4.setVisibility(View.VISIBLE);
                lv_P5.setVisibility(View.VISIBLE);
                lv_P6.setVisibility(View.VISIBLE);
                lv_P7.setVisibility(View.VISIBLE);
                lv_P8.setVisibility(View.VISIBLE);
                lv_P9.setVisibility(View.VISIBLE);
                lv_P10.setVisibility(View.VISIBLE);
                lv_P11.setVisibility(View.VISIBLE);
                lv_P12.setVisibility(View.VISIBLE);
                lv_P13.setVisibility(View.VISIBLE);
                lv_P14.setVisibility(View.VISIBLE);
                lv_P15.setVisibility(View.VISIBLE);
                lv_P16.setVisibility(View.VISIBLE);
                lv_P17.setVisibility(View.VISIBLE);
                lv_P18.setVisibility(View.VISIBLE);
                lv_P19.setVisibility(View.VISIBLE);
                lv_P20.setVisibility(View.VISIBLE);
                lv_P21.setVisibility(View.VISIBLE);
                lv_P22.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.R_P2_yes || compoundButton.getId() == R.id.R_P2_No) {

            if (R_P2_No.isChecked()) {

                lv_P3.setVisibility(View.GONE);
                lv_P4.setVisibility(View.GONE);
                lv_P5.setVisibility(View.GONE);
                lv_P6.setVisibility(View.GONE);
                lv_P7.setVisibility(View.GONE);
                lv_P8.setVisibility(View.GONE);
                lv_P9.setVisibility(View.GONE);
                lv_P10.setVisibility(View.GONE);
                lv_P11.setVisibility(View.GONE);
                lv_P12.setVisibility(View.GONE);
                lv_P13.setVisibility(View.GONE);
                lv_P14.setVisibility(View.GONE);
                lv_P15.setVisibility(View.GONE);
                lv_P16.setVisibility(View.GONE);
                lv_P17.setVisibility(View.GONE);
                lv_P18.setVisibility(View.GONE);
                lv_P19.setVisibility(View.GONE);
                lv_P20.setVisibility(View.GONE);
                lv_P21.setVisibility(View.GONE);
                lv_P22.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_P3);
                ClearAllcontrol.ClearAll(lv_P4);
                ClearAllcontrol.ClearAll(lv_P5);
                ClearAllcontrol.ClearAll(lv_P6);
                ClearAllcontrol.ClearAll(lv_P7);
                ClearAllcontrol.ClearAll(lv_P8);
                ClearAllcontrol.ClearAll(lv_P9);
                ClearAllcontrol.ClearAll(lv_P10);
                ClearAllcontrol.ClearAll(lv_P11);
                ClearAllcontrol.ClearAll(lv_P12);
                ClearAllcontrol.ClearAll(lv_P13);
                ClearAllcontrol.ClearAll(lv_P14);
                ClearAllcontrol.ClearAll(lv_P15);
                ClearAllcontrol.ClearAll(lv_P16);
                ClearAllcontrol.ClearAll(lv_P17);
                ClearAllcontrol.ClearAll(lv_P18);
                ClearAllcontrol.ClearAll(lv_P19);
                ClearAllcontrol.ClearAll(lv_P20);
                ClearAllcontrol.ClearAll(lv_P21);
                ClearAllcontrol.ClearAll(lv_P22);
            } else {
                lv_P3.setVisibility(View.VISIBLE);
                lv_P4.setVisibility(View.VISIBLE);
                lv_P5.setVisibility(View.VISIBLE);
                lv_P6.setVisibility(View.VISIBLE);
                lv_P7.setVisibility(View.VISIBLE);
                lv_P8.setVisibility(View.VISIBLE);
                lv_P9.setVisibility(View.VISIBLE);
                lv_P10.setVisibility(View.VISIBLE);
                lv_P11.setVisibility(View.VISIBLE);
                lv_P12.setVisibility(View.VISIBLE);
                lv_P13.setVisibility(View.VISIBLE);
                lv_P14.setVisibility(View.VISIBLE);
                lv_P15.setVisibility(View.VISIBLE);
                lv_P16.setVisibility(View.VISIBLE);
                lv_P17.setVisibility(View.VISIBLE);
                lv_P18.setVisibility(View.VISIBLE);
                lv_P19.setVisibility(View.VISIBLE);
                lv_P20.setVisibility(View.VISIBLE);
                lv_P21.setVisibility(View.VISIBLE);
                lv_P22.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.R_P19_yes || compoundButton.getId() == R.id.R_P19_No) {

            if (R_P19_No.isChecked()) {
                lv_P20.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_P20);
            } else {
                lv_P20.setVisibility(View.VISIBLE);
            }


        }


    }

    void initalizeRadiobButton(View v) {
        R_P1_yes = (RadioButton) v.findViewById(R.id.R_P1_yes);
        R_P1_No = (RadioButton) v.findViewById(R.id.R_P1_No);

        R_P1_1_yes = (RadioButton) v.findViewById(R.id.R_P1_1_yes);
        R_P1_1_No = (RadioButton) v.findViewById(R.id.R_P1_1_No);

        R_P2_yes = (RadioButton) v.findViewById(R.id.R_P2_yes);
        R_P2_No = (RadioButton) v.findViewById(R.id.R_P2_No);
        R_P3_1 = (RadioButton) v.findViewById(R.id.R_P3_1);
        R_P3_2 = (RadioButton) v.findViewById(R.id.R_P3_2);
        R_P3_3 = (RadioButton) v.findViewById(R.id.R_P3_3);
        R_P3_4 = (RadioButton) v.findViewById(R.id.R_P3_4);
        R_P4_yes = (RadioButton) v.findViewById(R.id.R_P4_yes);
        R_P4_No = (RadioButton) v.findViewById(R.id.R_P4_No);
        R_P5_yes = (RadioButton) v.findViewById(R.id.R_P5_yes);
        R_P5_No = (RadioButton) v.findViewById(R.id.R_P5_No);
        R_P6_yes = (RadioButton) v.findViewById(R.id.R_P6_yes);
        R_P6_No = (RadioButton) v.findViewById(R.id.R_P6_No);
        R_P7_yes = (RadioButton) v.findViewById(R.id.R_P7_yes);
        R_P7_No = (RadioButton) v.findViewById(R.id.R_P7_No);
        R_P8_yes = (RadioButton) v.findViewById(R.id.R_P8_yes);
        R_P8_No = (RadioButton) v.findViewById(R.id.R_P8_No);
        R_P9_yes = (RadioButton) v.findViewById(R.id.R_P9_yes);
        R_P9_No = (RadioButton) v.findViewById(R.id.R_P9_No);
        R_P10_1 = (RadioButton) v.findViewById(R.id.R_P10_1);
        R_P10_2 = (RadioButton) v.findViewById(R.id.R_P10_2);
        R_P10_3 = (RadioButton) v.findViewById(R.id.R_P10_3);
        R_P10_4 = (RadioButton) v.findViewById(R.id.R_P10_4);
        R_P11_1 = (RadioButton) v.findViewById(R.id.L_P11_1);
        R_P11_2 = (RadioButton) v.findViewById(R.id.L_P11_2);
        R_P11_3 = (RadioButton) v.findViewById(R.id.L_P11_3);
        R_P12_1 = (RadioButton) v.findViewById(R.id.R_P12_1);
        R_P12_2 = (RadioButton) v.findViewById(R.id.R_P12_2);
        R_P12_3 = (RadioButton) v.findViewById(R.id.R_P12_3);
        R_P14_1 = (RadioButton) v.findViewById(R.id.R_P14_1);
        R_P14_2 = (RadioButton) v.findViewById(R.id.R_P14_2);
        R_P14_3 = (RadioButton) v.findViewById(R.id.R_P14_3);
        R_P14_4 = (RadioButton) v.findViewById(R.id.R_P14_4);
        R_P15_1_1 = (RadioButton) v.findViewById(R.id.R_P15_1_1);
        R_P15_1_2 = (RadioButton) v.findViewById(R.id.R_P15_1_2);
        R_P15_1_3 = (RadioButton) v.findViewById(R.id.R_P15_1_3);
        R_P15_1_4 = (RadioButton) v.findViewById(R.id.R_P15_1_4);
        R_P15_1_5 = (RadioButton) v.findViewById(R.id.R_P15_1_5);
        R_P15_2_1 = (RadioButton) v.findViewById(R.id.R_P15_2_1);
        R_P15_2_2 = (RadioButton) v.findViewById(R.id.R_P15_2_2);
        R_P15_2_3 = (RadioButton) v.findViewById(R.id.R_P15_2_3);
        R_P15_2_4 = (RadioButton) v.findViewById(R.id.R_P15_2_4);
        R_P15_2_5 = (RadioButton) v.findViewById(R.id.R_P15_2_5);
        R_P15_3_1 = (RadioButton) v.findViewById(R.id.R_P15_3_1);
        R_P15_3_2 = (RadioButton) v.findViewById(R.id.R_P15_3_2);
        R_P15_3_3 = (RadioButton) v.findViewById(R.id.R_P15_3_3);
        R_P15_3_4 = (RadioButton) v.findViewById(R.id.R_P15_3_4);
        R_P15_3_5 = (RadioButton) v.findViewById(R.id.R_P15_3_5);
        R_P16_1 = (RadioButton) v.findViewById(R.id.R_P16_1);
        R_P16_2 = (RadioButton) v.findViewById(R.id.R_P16_2);
        R_P16_3 = (RadioButton) v.findViewById(R.id.R_P16_3);
        R_P16_4 = (RadioButton) v.findViewById(R.id.R_P16_4);
        R_P16_5 = (RadioButton) v.findViewById(R.id.R_P16_5);
        R_P16_6 = (RadioButton) v.findViewById(R.id.R_P16_6);
        R_P16_7 = (RadioButton) v.findViewById(R.id.R_P16_7);
        R_P16_8 = (RadioButton) v.findViewById(R.id.R_P16_8);
        R_P17_yes = (RadioButton) v.findViewById(R.id.R_P17_yes);
        R_P17_No = (RadioButton) v.findViewById(R.id.R_P17_No);
        R_P18_1 = (RadioButton) v.findViewById(R.id.R_P18_1);
        R_P18_2 = (RadioButton) v.findViewById(R.id.R_P18_2);
        R_P18_3 = (RadioButton) v.findViewById(R.id.R_P18_3);
        R_P19_yes = (RadioButton) v.findViewById(R.id.R_P19_yes);
        R_P19_No = (RadioButton) v.findViewById(R.id.R_P19_No);
        R_P21_1_1 = (RadioButton) v.findViewById(R.id.R_P21_1_1);
        R_P21_1_2 = (RadioButton) v.findViewById(R.id.R_P21_1_2);
        R_P21_1_3 = (RadioButton) v.findViewById(R.id.R_P21_1_3);
        R_P21_2_1 = (RadioButton) v.findViewById(R.id.R_P21_2_1);
        R_P21_2_2 = (RadioButton) v.findViewById(R.id.R_P21_2_2);
        R_P21_2_3 = (RadioButton) v.findViewById(R.id.R_P21_2_3);
        R_P21_3_1 = (RadioButton) v.findViewById(R.id.R_P21_3_1);
        R_P21_3_2 = (RadioButton) v.findViewById(R.id.R_P21_3_2);
        R_P21_3_3 = (RadioButton) v.findViewById(R.id.R_P21_3_3);
        R_P21_4_1 = (RadioButton) v.findViewById(R.id.R_P21_4_1);
        R_P21_4_2 = (RadioButton) v.findViewById(R.id.R_P21_4_2);
        R_P21_4_3 = (RadioButton) v.findViewById(R.id.R_P21_4_3);
        R_P21_5_1 = (RadioButton) v.findViewById(R.id.R_P21_5_1);
        R_P21_5_2 = (RadioButton) v.findViewById(R.id.R_P21_5_2);
        R_P21_5_3 = (RadioButton) v.findViewById(R.id.R_P21_5_3);
    }

    void initalizerLinerlayout(View v) {
        lv_P1 = (LinearLayout) v.findViewById(R.id.lv_P1);
        lv_P1_1 = (LinearLayout) v.findViewById(R.id.lv_P1_1);
        lv_P2 = (LinearLayout) v.findViewById(R.id.lv_P2);
        lv_P3 = (LinearLayout) v.findViewById(R.id.lv_P3);
        lv_P4 = (LinearLayout) v.findViewById(R.id.lv_P4);
        lv_P5 = (LinearLayout) v.findViewById(R.id.lv_P5);
        lv_P6 = (LinearLayout) v.findViewById(R.id.lv_P6);
        lv_P7 = (LinearLayout) v.findViewById(R.id.lv_P7);
        lv_P8 = (LinearLayout) v.findViewById(R.id.lv_P8);
        lv_P9 = (LinearLayout) v.findViewById(R.id.lv_P9);
        lv_P10 = (LinearLayout) v.findViewById(R.id.lv_P10);
        lv_P11 = (LinearLayout) v.findViewById(R.id.lv_P11);
        lv_P12 = (LinearLayout) v.findViewById(R.id.lv_P12);
        lv_P13 = (LinearLayout) v.findViewById(R.id.lv_P13);
        lv_P14 = (LinearLayout) v.findViewById(R.id.lv_P14);
        lv_P15 = (LinearLayout) v.findViewById(R.id.lv_P15);
        lv_P16 = (LinearLayout) v.findViewById(R.id.lv_P16);
        lv_P17 = (LinearLayout) v.findViewById(R.id.lv_P17);
        lv_P18 = (LinearLayout) v.findViewById(R.id.lv_P18);
        lv_P19 = (LinearLayout) v.findViewById(R.id.lv_P19);
        lv_P20 = (LinearLayout) v.findViewById(R.id.lv_P20);
        lv_P21 = (LinearLayout) v.findViewById(R.id.lv_P21);
        lv_P22 = (LinearLayout) v.findViewById(R.id.lv_P22);
        lv_sub_main = (LinearLayout) v.findViewById(R.id.lv_sub_main);
    }

    void initalzierEditextview(View v) {
        ET_P22_1 = (EditText) v.findViewById(R.id.ET_P22_1);
        ET_P22_2 = (EditText) v.findViewById(R.id.ET_P22_2);
        ET_P22_3 = (EditText) v.findViewById(R.id.ET_P22_3);
        ET_P22_4 = (EditText) v.findViewById(R.id.ET_P22_4);
        ET_P22_5 = (EditText) v.findViewById(R.id.ET_P22_5);
        ET_P22_6 = (EditText) v.findViewById(R.id.ET_P22_6);
        ET_P22_7 = (EditText) v.findViewById(R.id.ET_P22_7);
        ET_P22_8 = (EditText) v.findViewById(R.id.ET_P22_8);

    }

    void intializerCheckbox(View v) {
        C_P13_1 = (CheckBox) v.findViewById(R.id.C_P13_1);
        C_P13_2 = (CheckBox) v.findViewById(R.id.C_P13_2);
        C_P13_3 = (CheckBox) v.findViewById(R.id.C_P13_3);
        C_P13_4 = (CheckBox) v.findViewById(R.id.C_P13_4);
        C_P20_1 = (CheckBox) v.findViewById(R.id.C_P20_1);
        C_P20_2 = (CheckBox) v.findViewById(R.id.C_P20_2);
        C_P20_3 = (CheckBox) v.findViewById(R.id.C_P20_3);
    }

    void Assign_Values() {
        if (R_P1_yes.isChecked()) {
            P1 = "1";
        } else if (R_P1_No.isChecked()) {
            P1 = "2";
        } else {
            P1 = "999";
        }


        if (R_P1_1_yes.isChecked()) {
            P1_1 = "1";
        } else if (R_P1_1_No.isChecked()) {
            P1_1 = "2";
        } else {
            P1_1 = "999";
        }

        if (R_P2_yes.isChecked()) {
            P2 = "1";
        } else if (R_P2_No.isChecked()) {
            P2 = "2";
        } else {
            P2 = "999";
        }


        if (R_P3_1.isChecked()) {
            P3 = "1";
        } else if (R_P3_2.isChecked()) {
            P3 = "2";
        } else if (R_P3_3.isChecked()) {
            P3 = "3";
        } else if (R_P3_4.isChecked()) {
            P3 = "4";
        } else {
            P3 = "999";
        }

        if (R_P4_yes.isChecked()) {
            P4 = "1";
        } else if (R_P4_No.isChecked()) {
            P4 = "2";
        } else {
            P4 = "999";
        }

        if (R_P5_yes.isChecked()) {
            P5 = "1";
        } else if (R_P5_No.isChecked()) {
            P5 = "2";
        } else {
            P5 = "999";
        }

        if (R_P6_yes.isChecked()) {
            P6 = "1";
        } else if (R_P6_No.isChecked()) {
            P6 = "2";
        } else {
            P6 = "999";
        }

        if (R_P7_yes.isChecked()) {
            P7 = "1";
        } else if (R_P7_No.isChecked()) {
            P7 = "2";
        } else {
            P7 = "999";
        }

        if (R_P8_yes.isChecked()) {
            P8 = "1";
        } else if (R_P8_No.isChecked()) {
            P8 = "2";
        } else {
            P8 = "999";
        }

        if (R_P9_yes.isChecked()) {
            P9 = "1";
        } else if (R_P9_No.isChecked()) {
            P9 = "2";
        } else {
            P9 = "999";
        }

        if (R_P10_1.isChecked()) {
            P10 = "1";
        } else if (R_P10_2.isChecked()) {
            P10 = "2";
        } else if (R_P10_3.isChecked()) {
            P10 = "3";
        } else if (R_P10_4.isChecked()) {
            P10 = "4";
        } else {
            P10 = "999";
        }

        if (R_P11_1.isChecked()) {
            P11 = "1";
        } else if (R_P11_2.isChecked()) {
            P11 = "2";
        } else if (R_P11_3.isChecked()) {
            P11 = "3";
        } else {
            P11 = "999";
        }

        if (R_P12_1.isChecked()) {
            P12 = "1";
        } else if (R_P12_2.isChecked()) {
            P12 = "2";
        } else if (R_P12_3.isChecked()) {
            P12 = "3";
        } else {
            P12 = "999";
        }

        if (C_P13_1.isChecked()) {
            P13_1 = "1";
        } else {
            P13_1 = "999";
        }

        if (C_P13_2.isChecked()) {
            P13_2 = "1";
        } else {
            P13_2 = "999";
        }

        if (C_P13_3.isChecked()) {
            P13_3 = "1";
        } else {
            P13_3 = "999";
        }

        if (C_P13_4.isChecked()) {
            P13_4 = "1";
        } else {
            P13_4 = "999";
        }

        if (R_P14_1.isChecked()) {
            P14 = "1";
        } else if (R_P14_2.isChecked()) {
            P14 = "2";
        } else if (R_P14_3.isChecked()) {
            P14 = "3";
        } else if (R_P14_4.isChecked()) {
            P14 = "4";
        } else {
            P14 = "999";
        }

        if (R_P15_1_1.isChecked()) {
            P15_1 = "1";
        } else if (R_P15_1_2.isChecked()) {
            P15_1 = "2";
        } else if (R_P15_1_3.isChecked()) {
            P15_1 = "3";
        } else if (R_P15_1_4.isChecked()) {
            P15_1 = "4";
        } else if (R_P15_1_5.isChecked()) {
            P15_1 = "5";
        } else {
            P15_1 = "999";
        }

        if (R_P15_2_1.isChecked()) {
            P15_2 = "1";
        } else if (R_P15_2_2.isChecked()) {
            P15_2 = "2";
        } else if (R_P15_2_3.isChecked()) {
            P15_2 = "3";
        } else if (R_P15_2_4.isChecked()) {
            P15_2 = "4";
        } else if (R_P15_2_5.isChecked()) {
            P15_2 = "5";
        } else {
            P15_2 = "999";
        }

        if (R_P15_3_1.isChecked()) {
            P15_3 = "1";
        } else if (R_P15_3_2.isChecked()) {
            P15_3 = "2";
        } else if (R_P15_3_3.isChecked()) {
            P15_3 = "3";
        } else if (R_P15_3_4.isChecked()) {
            P15_3 = "4";
        } else if (R_P15_3_5.isChecked()) {
            P15_3 = "5";
        } else {
            P15_3 = "999";
        }

        if (R_P16_1.isChecked()) {
            P16 = "1";
        } else if (R_P16_2.isChecked()) {
            P16 = "2";
        } else if (R_P16_3.isChecked()) {
            P16 = "3";
        } else if (R_P16_4.isChecked()) {
            P16 = "4";
        } else if (R_P16_5.isChecked()) {
            P16 = "5";
        } else if (R_P16_6.isChecked()) {
            P16 = "6";
        } else if (R_P16_7.isChecked()) {
            P16 = "7";
        } else if (R_P16_8.isChecked()) {
            P16 = "8";
        } else {
            P16 = "999";
        }

        if (R_P17_yes.isChecked()) {
            P17 = "1";
        } else if (R_P17_No.isChecked()) {
            P17 = "2";
        } else {
            P17 = "999";
        }

        if (R_P18_1.isChecked()) {
            P18 = "1";
        } else if (R_P18_2.isChecked()) {
            P18 = "2";
        } else if (R_P18_3.isChecked()) {
            P18 = "3";
        } else {
            P18 = "999";
        }

        if (R_P19_yes.isChecked()) {
            P19 = "1";
        } else if (R_P19_No.isChecked()) {
            P19 = "2";
        } else {
            P19 = "999";
        }

        if (C_P20_1.isChecked()) {
            P20_1 = "1";
        } else {
            P20_1 = "999";
        }

        if (C_P20_2.isChecked()) {
            P20_2 = "1";
        } else {
            P20_2 = "999";
        }

        if (C_P20_3.isChecked()) {
            P20_3 = "1";
        } else {
            P20_3 = "999";
        }

        if (R_P21_1_1.isChecked()) {
            P21_1 = "1";
        } else if (R_P21_1_2.isChecked()) {
            P21_1 = "2";
        } else if (R_P21_1_3.isChecked()) {
            P21_1 = "3";
        } else {
            P21_1 = "999";
        }

        if (R_P21_2_1.isChecked()) {
            P21_2 = "1";
        } else if (R_P21_2_2.isChecked()) {
            P21_2 = "2";
        } else if (R_P21_2_3.isChecked()) {
            P21_2 = "3";
        } else {
            P21_2 = "999";
        }

        if (R_P21_3_1.isChecked()) {
            P21_3 = "1";
        } else if (R_P21_3_2.isChecked()) {
            P21_3 = "2";
        } else if (R_P21_3_3.isChecked()) {
            P21_3 = "3";
        } else {
            P21_3 = "999";
        }

        if (R_P21_4_1.isChecked()) {
            P21_4 = "1";
        } else if (R_P21_4_2.isChecked()) {
            P21_4 = "2";
        } else if (R_P21_4_3.isChecked()) {
            P21_4 = "3";
        } else {
            P21_4 = "999";
        }

        if (R_P21_5_1.isChecked()) {
            P21_5 = "1";
        } else if (R_P21_5_2.isChecked()) {
            P21_5 = "2";
        } else if (R_P21_5_3.isChecked()) {
            P21_5 = "3";
        } else {
            P21_5 = "999";
        }

        if (ET_P22_1.getText().toString().trim().length() > 0) {
            P22_1 = ET_P22_1.getText().toString().trim();
        } else {
            P22_1 = "999";
        }

        if (ET_P22_2.getText().toString().trim().length() > 0) {
            P22_2 = ET_P22_2.getText().toString().trim();
        } else {
            P22_2 = "999";
        }

        if (ET_P22_3.getText().toString().trim().length() > 0) {
            P22_3 = ET_P22_3.getText().toString().trim();
        } else {
            P22_3 = "999";
        }

        if (ET_P22_4.getText().toString().trim().length() > 0) {
            P22_4 = ET_P22_4.getText().toString().trim();
        } else {
            P22_4 = "999";
        }

        if (ET_P22_5.getText().toString().trim().length() > 0) {
            P22_5 = ET_P22_5.getText().toString().trim();
        } else {
            P22_5 = "999";
        }

        if (ET_P22_6.getText().toString().trim().length() > 0) {
            P22_6 = ET_P22_6.getText().toString().trim();
        } else {
            P22_6 = "999";
        }

        if (ET_P22_7.getText().toString().trim().length() > 0) {
            P22_7 = ET_P22_7.getText().toString().trim();
        } else {
            P22_7 = "999";
        }

        if (ET_P22_8.getText().toString().trim().length() > 0) {
            P22_8 = ET_P22_8.getText().toString().trim();
        } else {
            P22_8 = "999";
        }

    }


    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_P1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P1_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_P3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P4) == false) {
            return false;
        }


        if (Gothrough.IamHiden(lv_P5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_P9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P13) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_P14) == false) {
            return false;
        }

        if (GothroughRadioButton.IamHiden(lv_P15) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_P16) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_P17) == false) {
            return false;
        }


        if (Gothrough.IamHiden(lv_P18) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P19) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_P20) == false) {
            return false;
        }

        if (GothroughRadioButton.IamHiden(lv_P21) == false) {
            return false;
        }

        return GothroughTextboxss.IamHiden(lv_P22) != false;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +

                col_P.P1 + "='" + P1 + "'," +
                col_P.P1_1 + "='" + P1_1 + "'," +
                col_P.P2 + "='" + P2 + "'," +
                col_P.P3 + "='" + P3 + "'," +
                col_P.P4 + "='" + P4 + "'," +
                col_P.P5 + "='" + P5 + "'," +
                col_P.P6 + "='" + P6 + "'," +
                col_P.P7 + "='" + P7 + "'," +
                col_P.P8 + "='" + P8 + "'," +
                col_P.P9 + "='" + P9 + "'," +
                col_P.P10 + "='" + P10 + "'," +
                col_P.P11 + "='" + P11 + "'," +
                col_P.P12 + "='" + P12 + "'," +
                col_P.P13_1 + "='" + P13_1 + "'," +
                col_P.P13_2 + "='" + P13_2 + "'," +
                col_P.P13_3 + "='" + P13_3 + "'," +
                col_P.P13_4 + "='" + P13_4 + "'," +
                col_P.P14 + "='" + P14 + "'," +
                col_P.P15_1 + "='" + P15_1 + "'," +
                col_P.P15_2 + "='" + P15_2 + "'," +
                col_P.P15_3 + "='" + P15_3 + "'," +
                col_P.P16 + "='" + P16 + "'," +
                col_P.P17 + "='" + P17 + "'," +
                col_P.P18 + "='" + P18 + "'," +
                col_P.P19 + "='" + P19 + "'," +
                col_P.P20_1 + "='" + P20_1 + "'," +
                col_P.P20_2 + "='" + P20_2 + "'," +
                col_P.P20_3 + "='" + P20_3 + "'," +
                col_P.P21_1 + "='" + P21_1 + "'," +
                col_P.P21_2 + "='" + P21_2 + "'," +
                col_P.P21_3 + "='" + P21_3 + "'," +
                col_P.P21_4 + "='" + P21_4 + "'," +
                col_P.P21_5 + "='" + P21_5 + "'," +
                col_P.P22_1 + "='" + P22_1 + "'," +
                col_P.P22_2 + "='" + P22_2 + "'," +
                col_P.P22_3 + "='" + P22_3 + "'," +
                col_P.P22_4 + "='" + P22_4 + "'," +
                col_P.P22_5 + "='" + P22_5 + "'," +
                col_P.P22_6 + "='" + P22_6 + "'," +
                col_P.P22_7 + "='" + P22_7 + "'," +
                col_P.P22_8 + "='" + P22_8 + "'" +
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
    // Function End


}