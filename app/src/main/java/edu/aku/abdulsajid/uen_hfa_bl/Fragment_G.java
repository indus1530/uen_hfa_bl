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
import data.col_G;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.GothroughTextboxss;
import utils.Validation;


public class Fragment_G extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Chekcbox


    CheckBox
            C_G1_1,
            C_G1_2,
            C_G1_3,
            C_G1_4,
            C_G1_5,
            C_G11_1,
            C_G11_2,
            C_G11_3,
            C_G11_4,
            C_G11_5,
            C_G11_6,
            C_G11_7,
            C_G11_8,
            C_G11_9,
            C_G11_10,
            C_G11_11,
            C_G11_12,
            C_G11_13;


    //endregion


    //region Linerlayout

    LinearLayout
            lv_g1,
            lv_g2,
            lv_g3,
            lv_g4,
            lv_g5,
            lv_g6,
            lv_g7,
            lv_g8,
            lv_g9,
            lv_g10,

    lv_g11,
            lv_sub_main;


    //endregion


    //region Radio Button

    RadioButton
            rb_G2_yes,
            rb_G2_no,
            rb_G3_yes,
            rb_G3_no,
            rb_G4_yes,
            rb_G4_no,
            R_G8_Yes,
            R_G8_no;


    //endregion

    //region EditTextview


    EditText
            ed_G5_1,
            ed_G5_2,
            ed_G5_3,
            ed_G5_4,
            ed_G5_5,
            ed_G5_6,
            ed_G5_7,
            ed_G6_1,
            ed_G6_2,
            ed_G6_3,
            ed_G6_4,
            ed_G7,
            ed_G9_1,
            ed_G9_2,
            ed_G9_3,
            ed_G10_1,
            ed_G10_2,
            ed_G10_3,
            ed_G11_13;


    //endregion


    //region String

    String

            G1_1,
            G1_2,
            G1_3,
            G1_4,
            G1_5,
            G2,
            G3,
            G4,
            G5_1,
            G5_2,
            G5_3,
            G5_4,
            G5_5,
            G5_6,
            G5_7,
            G6_1,
            G6_2,
            G6_3,
            G6_4,
            G7,
            G8,
            G9_1,
            G9_2,
            G9_3,
            G10_1,
            G10_2,
            G10_3,
            G11_1,
            G11_2,
            G11_3,
            G11_4,
            G11_5,
            G11_6,
            G11_7,
            G11_8,
            G11_9,
            G11_10,
            G11_11,
            G11_12,
            G11_13;


    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_G() {
    }

    public static Fragment_G newInstance(String param1, String param2) {
        Fragment_G fragment = new Fragment_G();

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


        View v = inflater.inflate(R.layout.fragment_g, container, false);


        initalizeRadiobutton(v);
        initalizerCheckbox(v);
        initalzieLinerLayout(v);
        initializerEditextview(v);

        C_G1_1.setOnCheckedChangeListener(this);
        C_G1_2.setOnCheckedChangeListener(this);
        C_G1_3.setOnCheckedChangeListener(this);
        C_G1_4.setOnCheckedChangeListener(this);
        C_G1_5.setOnCheckedChangeListener(this);
        R_G8_Yes.setOnCheckedChangeListener(this);
        R_G8_no.setOnCheckedChangeListener(this);

        C_G11_13.setOnCheckedChangeListener(this);

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
                LogtableUpdates.UpdateLogSection(getContext(), "G", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_H fragment = new Fragment_H();
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

        if (compoundButton.getId() == R.id.C_G1_1 || compoundButton.getId() == R.id.C_G1_2 ||
                compoundButton.getId() == R.id.C_G1_3 || compoundButton.getId() == R.id.C_G1_4 ||
                compoundButton.getId() == R.id.C_G1_5) {


            if (C_G1_4.isChecked()) {
                C_G1_1.setChecked(false);
                C_G1_2.setChecked(false);
                C_G1_3.setChecked(false);
                C_G1_5.setChecked(false);

                lv_g2.setVisibility(View.GONE);
                lv_g3.setVisibility(View.GONE);
                lv_g4.setVisibility(View.GONE);
                lv_g5.setVisibility(View.GONE);
                lv_g6.setVisibility(View.GONE);
                lv_g7.setVisibility(View.GONE);
                lv_g8.setVisibility(View.GONE);
                lv_g9.setVisibility(View.GONE);
                lv_g10.setVisibility(View.GONE);
                lv_g11.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_g2);
                ClearAllcontrol.ClearAll(lv_g3);
                ClearAllcontrol.ClearAll(lv_g4);
                ClearAllcontrol.ClearAll(lv_g5);
                ClearAllcontrol.ClearAll(lv_g6);
                ClearAllcontrol.ClearAll(lv_g7);
                ClearAllcontrol.ClearAll(lv_g8);
                ClearAllcontrol.ClearAll(lv_g9);
                ClearAllcontrol.ClearAll(lv_g10);
                ClearAllcontrol.ClearAll(lv_g11);


            } else if (C_G1_5.isChecked()) {
                C_G1_1.setChecked(false);
                C_G1_2.setChecked(false);
                C_G1_3.setChecked(false);
                C_G1_4.setChecked(false);


                lv_g2.setVisibility(View.GONE);
                lv_g3.setVisibility(View.GONE);
                lv_g4.setVisibility(View.GONE);
                lv_g5.setVisibility(View.GONE);
                lv_g6.setVisibility(View.GONE);
                lv_g7.setVisibility(View.GONE);
                lv_g8.setVisibility(View.GONE);
                lv_g9.setVisibility(View.GONE);
                lv_g10.setVisibility(View.GONE);
                lv_g11.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_g2);
                ClearAllcontrol.ClearAll(lv_g3);
                ClearAllcontrol.ClearAll(lv_g4);
                ClearAllcontrol.ClearAll(lv_g5);
                ClearAllcontrol.ClearAll(lv_g6);
                ClearAllcontrol.ClearAll(lv_g7);
                ClearAllcontrol.ClearAll(lv_g8);
                ClearAllcontrol.ClearAll(lv_g9);
                ClearAllcontrol.ClearAll(lv_g10);
                ClearAllcontrol.ClearAll(lv_g11);

            } else {


                lv_g2.setVisibility(View.VISIBLE);
                lv_g3.setVisibility(View.VISIBLE);
                lv_g4.setVisibility(View.VISIBLE);
                lv_g5.setVisibility(View.VISIBLE);
                lv_g6.setVisibility(View.VISIBLE);
                lv_g7.setVisibility(View.VISIBLE);
                lv_g8.setVisibility(View.VISIBLE);
                lv_g9.setVisibility(View.VISIBLE);
                lv_g10.setVisibility(View.VISIBLE);
                lv_g11.setVisibility(View.VISIBLE);

                C_G1_5.setChecked(false);
                C_G1_4.setChecked(false);


            }


            if (C_G1_1.isChecked()) {
                lv_g5.setVisibility(View.VISIBLE);
                lv_g6.setVisibility(View.VISIBLE);
                lv_g7.setVisibility(View.VISIBLE);
                lv_g8.setVisibility(View.VISIBLE);
                lv_g9.setVisibility(View.VISIBLE);
                lv_g10.setVisibility(View.VISIBLE);
            } else {
                lv_g5.setVisibility(View.GONE);
                lv_g6.setVisibility(View.GONE);
                lv_g7.setVisibility(View.GONE);
                lv_g8.setVisibility(View.GONE);
                lv_g9.setVisibility(View.GONE);
                lv_g10.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_g5);
                ClearAllcontrol.ClearAll(lv_g6);
                ClearAllcontrol.ClearAll(lv_g7);
                ClearAllcontrol.ClearAll(lv_g8);
                ClearAllcontrol.ClearAll(lv_g9);
                ClearAllcontrol.ClearAll(lv_g10);
            }

            if (Validation.F1_4_ischekd.equals("true") || Validation.F1_5_ischekd.equals("true")) {

                lv_g11.setVisibility(View.VISIBLE);
            } else {
                lv_g11.setVisibility(View.GONE);
            }


        }

        if (compoundButton.getId() == R.id.R_G8_Yes || compoundButton.getId() == R.id.R_G8_no) {
            if (R_G8_no.isChecked()) {
                lv_g9.setVisibility(View.GONE);
            } else {
                lv_g9.setVisibility(View.VISIBLE);

            }
        }

        if (C_G11_13.isChecked()) {

            ed_G11_13.setVisibility(View.VISIBLE);
        } else {


            ed_G11_13.setVisibility(View.GONE);
            ed_G11_13.setText("");

        }


        if (Validation.A13_2_ischekd.equals("true")) {
            lv_g6.setVisibility(View.VISIBLE);


        } else {
            lv_g6.setVisibility(View.GONE);
        }

    }

    void initalzieLinerLayout(View v) {

        lv_g1 = (LinearLayout) v.findViewById(R.id.lv_g1);
        lv_g2 = (LinearLayout) v.findViewById(R.id.lv_g2);
        lv_g3 = (LinearLayout) v.findViewById(R.id.lv_g3);
        lv_g4 = (LinearLayout) v.findViewById(R.id.lv_g4);
        lv_g5 = (LinearLayout) v.findViewById(R.id.lv_g5);
        lv_g6 = (LinearLayout) v.findViewById(R.id.lv_g6);
        lv_g7 = (LinearLayout) v.findViewById(R.id.lv_G7);
        lv_g8 = (LinearLayout) v.findViewById(R.id.lv_G8);
        lv_g9 = (LinearLayout) v.findViewById(R.id.lv_g9);
        lv_g10 = (LinearLayout) v.findViewById(R.id.lv_g10);

        lv_g11 = (LinearLayout) v.findViewById(R.id.lv_g11);
        lv_sub_main = (LinearLayout) v.findViewById(R.id.lv_sub_main);

    }

    void initalizeRadiobutton(View v) {

        rb_G2_yes = (RadioButton) v.findViewById(R.id.rb_G2_yes);
        rb_G2_no = (RadioButton) v.findViewById(R.id.rb_G2_no);
        rb_G3_yes = (RadioButton) v.findViewById(R.id.rb_G3_yes);
        rb_G3_no = (RadioButton) v.findViewById(R.id.rb_G3_no);
        rb_G4_yes = (RadioButton) v.findViewById(R.id.rb_G4_yes);
        rb_G4_no = (RadioButton) v.findViewById(R.id.rb_G4_no);
        R_G8_Yes = (RadioButton) v.findViewById(R.id.R_G8_Yes);
        R_G8_no = (RadioButton) v.findViewById(R.id.R_G8_no);

    }

    void initalizerCheckbox(View v) {
        C_G1_1 = (CheckBox) v.findViewById(R.id.C_G1_1);
        C_G1_2 = (CheckBox) v.findViewById(R.id.C_G1_2);
        C_G1_3 = (CheckBox) v.findViewById(R.id.C_G1_3);
        C_G1_4 = (CheckBox) v.findViewById(R.id.C_G1_4);
        C_G1_5 = (CheckBox) v.findViewById(R.id.C_G1_5);
        C_G11_1 = (CheckBox) v.findViewById(R.id.C_G11_1);
        C_G11_2 = (CheckBox) v.findViewById(R.id.C_G11_2);
        C_G11_3 = (CheckBox) v.findViewById(R.id.C_G11_3);
        C_G11_4 = (CheckBox) v.findViewById(R.id.C_G11_4);
        C_G11_5 = (CheckBox) v.findViewById(R.id.C_G11_5);
        C_G11_6 = (CheckBox) v.findViewById(R.id.C_G11_6);
        C_G11_7 = (CheckBox) v.findViewById(R.id.C_G11_7);
        C_G11_8 = (CheckBox) v.findViewById(R.id.C_G11_8);
        C_G11_9 = (CheckBox) v.findViewById(R.id.C_G11_9);
        C_G11_10 = (CheckBox) v.findViewById(R.id.C_G11_10);
        C_G11_11 = (CheckBox) v.findViewById(R.id.C_G11_11);
        C_G11_12 = (CheckBox) v.findViewById(R.id.C_G11_12);
        C_G11_13 = (CheckBox) v.findViewById(R.id.C_G11_13);
    }

    void initializerEditextview(View v) {

        ed_G5_1 = (EditText) v.findViewById(R.id.ed_G5_1);
        ed_G5_2 = (EditText) v.findViewById(R.id.ed_G5_2);
        ed_G5_3 = (EditText) v.findViewById(R.id.ed_G5_3);
        ed_G5_4 = (EditText) v.findViewById(R.id.ed_G5_4);
        ed_G5_5 = (EditText) v.findViewById(R.id.ed_G5_5);
        ed_G5_6 = (EditText) v.findViewById(R.id.ed_G5_6);
        ed_G5_7 = (EditText) v.findViewById(R.id.ed_G5_7);
        ed_G6_1 = (EditText) v.findViewById(R.id.ed_G6_1);
        ed_G6_2 = (EditText) v.findViewById(R.id.ed_G6_2);
        ed_G6_3 = (EditText) v.findViewById(R.id.ed_G6_3);
        ed_G6_4 = (EditText) v.findViewById(R.id.ed_G6_4);
        ed_G7 = (EditText) v.findViewById(R.id.ed_G7);
        ed_G9_1 = (EditText) v.findViewById(R.id.ed_G9_1);
        ed_G9_2 = (EditText) v.findViewById(R.id.ed_G9_2);
        ed_G9_3 = (EditText) v.findViewById(R.id.ed_G9_3);
        ed_G10_1 = (EditText) v.findViewById(R.id.ed_G10_1);
        ed_G10_2 = (EditText) v.findViewById(R.id.ed_G10_2);
        ed_G10_3 = (EditText) v.findViewById(R.id.ed_G10_3);
        ed_G11_13 = (EditText) v.findViewById(R.id.ed_G11_13);


    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_g1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_g2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_g3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_g4) == false) {
            return false;
        }

        if (GothroughTextboxss.IamHiden(lv_g5) == false) {
            return false;
        }


        if (GothroughTextboxss.IamHiden(lv_g6) == false) {
            return false;
        }


        if (Gothrough.IamHiden(lv_g7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_g8) == false) {
            return false;
        }

        if (GothroughTextboxss.IamHiden(lv_g9) == false) {
            return false;
        }

        if (GothroughTextboxss.IamHiden(lv_g10) == false) {
            return false;
        }

        return Gothrough.IamHiden(lv_g11) != false;
    }

    void asignvalues() {

        if (C_G1_1.isChecked()) {
            G1_1 = "1";
        } else {
            G1_1 = "999";
        }

        if (C_G1_2.isChecked()) {
            G1_2 = "1";
        } else {
            G1_2 = "999";
        }

        if (C_G1_3.isChecked()) {
            G1_3 = "1";
        } else {
            G1_3 = "999";
        }


        if (C_G1_4.isChecked()) {
            G1_4 = "1";
        } else {
            G1_4 = "999";
        }


        if (C_G1_5.isChecked()) {
            G1_5 = "1";
        } else {
            G1_5 = "999";
        }

        if (rb_G2_yes.isChecked()) {
            G2 = "1";
        } else if (rb_G2_no.isChecked()) {
            G2 = "2";
        } else {
            G2 = "999";
        }

        if (rb_G3_yes.isChecked()) {
            G3 = "1";
        } else if (rb_G3_no.isChecked()) {
            G3 = "2";
        } else {
            G3 = "999";
        }


        if (rb_G4_yes.isChecked()) {
            G4 = "1";
        } else if (rb_G4_no.isChecked()) {
            G4 = "2";
        } else {
            G4 = "999";
        }

        if (ed_G5_1.getText().toString().trim().length() > 0) {
            G5_1 = ed_G5_1.getText().toString().trim();
        } else {
            G5_1 = "999";
        }
        if (ed_G5_2.getText().toString().trim().length() > 0) {
            G5_2 = ed_G5_2.getText().toString().trim();
        } else {
            G5_2 = "999";
        }

        if (ed_G5_3.getText().toString().trim().length() > 0) {
            G5_3 = ed_G5_3.getText().toString().trim();
        } else {
            G5_3 = "999";
        }

        if (ed_G5_4.getText().toString().trim().length() > 0) {
            G5_4 = ed_G5_4.getText().toString().trim();
        } else {
            G5_4 = "999";
        }

        if (ed_G5_5.getText().toString().trim().length() > 0) {
            G5_5 = ed_G5_5.getText().toString().trim();
        } else {
            G5_5 = "999";
        }

        if (ed_G5_6.getText().toString().trim().length() > 0) {
            G5_6 = ed_G5_6.getText().toString().trim();
        } else {
            G5_6 = "999";
        }

        if (ed_G5_7.getText().toString().trim().length() > 0) {
            G5_7 = ed_G5_7.getText().toString().trim();
        } else {
            G5_7 = "999";
        }


        if (ed_G6_1.getText().toString().trim().length() > 0) {
            G6_1 = ed_G6_1.getText().toString().trim();
        } else {
            G6_1 = "999";
        }
        if (ed_G6_2.getText().toString().trim().length() > 0) {
            G6_2 = ed_G6_2.getText().toString().trim();
        } else {
            G6_2 = "999";
        }

        if (ed_G6_3.getText().toString().trim().length() > 0) {
            G6_3 = ed_G6_3.getText().toString().trim();
        } else {
            G6_3 = "999";
        }

        if (ed_G6_4.getText().toString().trim().length() > 0) {
            G6_4 = ed_G6_4.getText().toString().trim();
        } else {
            G6_4 = "999";
        }

        if (ed_G7.getText().toString().trim().length() > 0) {
            G7 = ed_G7.getText().toString().trim();
        } else {
            G7 = "999";
        }

        if (R_G8_Yes.isChecked()) {
            G8 = "1";
        } else if (R_G8_no.isChecked()) {
            G8 = "2";
        } else {
            G8 = "999";
        }

        if (ed_G9_1.getText().toString().trim().length() > 0) {
            G9_1 = ed_G9_1.getText().toString().trim();
        } else {
            G9_1 = "999";
        }
        if (ed_G9_2.getText().toString().trim().length() > 0) {
            G9_2 = ed_G9_2.getText().toString().trim();
        } else {
            G9_2 = "999";
        }

        if (ed_G9_3.getText().toString().trim().length() > 0) {
            G9_3 = ed_G9_3.getText().toString().trim();
        } else {
            G9_3 = "999";
        }


        if (ed_G10_1.getText().toString().trim().length() > 0) {
            G10_1 = ed_G10_1.getText().toString().trim();
        } else {
            G10_1 = "999";
        }
        if (ed_G10_2.getText().toString().trim().length() > 0) {
            G10_2 = ed_G10_2.getText().toString().trim();
        } else {
            G10_2 = "999";
        }

        if (ed_G10_3.getText().toString().trim().length() > 0) {
            G10_3 = ed_G10_3.getText().toString().trim();
        } else {
            G10_3 = "999";
        }


        if (C_G11_1.isChecked()) {
            G11_1 = "1";
        } else {
            G11_1 = "999";
        }
        if (C_G11_2.isChecked()) {
            G11_2 = "1";
        } else {
            G11_2 = "999";
        }
        if (C_G11_3.isChecked()) {
            G11_3 = "1";
        } else {
            G11_3 = "999";
        }
        if (C_G11_4.isChecked()) {
            G11_4 = "1";
        } else {
            G11_4 = "999";
        }
        if (C_G11_5.isChecked()) {
            G11_5 = "1";
        } else {
            G11_5 = "999";
        }
        if (C_G11_6.isChecked()) {
            G11_6 = "1";
        } else {
            G11_6 = "999";
        }
        if (C_G11_7.isChecked()) {
            G11_7 = "1";
        } else {
            G11_7 = "999";
        }
        if (C_G11_8.isChecked()) {
            G11_8 = "1";
        } else {
            G11_8 = "999";
        }
        if (C_G11_9.isChecked()) {
            G11_9 = "1";
        } else {
            G11_9 = "999";
        }
        if (C_G11_10.isChecked()) {
            G11_10 = "1";
        } else {
            G11_10 = "999";
        }
        if (C_G11_11.isChecked()) {
            G11_11 = "1";
        } else {
            G11_11 = "999";
        }
        if (C_G11_12.isChecked()) {
            G11_12 = "1";
        } else {
            G11_12 = "999";
        }
        if (C_G11_13.isChecked()) {
            if (ed_G11_13.getText().toString().trim().length() > 0) {
                G11_13 = ed_G11_13.getText().toString().trim();
            } else {
                G11_13 = "999";
            }
        } else {
            G11_13 = "999";
        }

    }

    void updateHFA() {
        String query = "update  hfa set " +

                col_G.G1_1 + "='" + G1_1 + "'," +
                col_G.G1_2 + "='" + G1_2 + "'," +
                col_G.G1_3 + "='" + G1_3 + "'," +
                col_G.G1_4 + "='" + G1_4 + "'," +
                col_G.G1_5 + "='" + G1_5 + "'," +
                col_G.G2 + "='" + G2 + "'," +
                col_G.G3 + "='" + G3 + "'," +
                col_G.G4 + "='" + G4 + "'," +
                col_G.G5_1 + "='" + G5_1 + "'," +
                col_G.G5_2 + "='" + G5_2 + "'," +
                col_G.G5_3 + "='" + G5_3 + "'," +
                col_G.G5_4 + "='" + G5_4 + "'," +
                col_G.G5_5 + "='" + G5_5 + "'," +
                col_G.G5_6 + "='" + G5_6 + "'," +
                col_G.G5_7 + "='" + G5_7 + "'," +
                col_G.G6_1 + "='" + G6_1 + "'," +
                col_G.G6_2 + "='" + G6_2 + "'," +
                col_G.G6_3 + "='" + G6_3 + "'," +
                col_G.G6_4 + "='" + G6_4 + "'," +
                col_G.G7 + "='" + G7 + "'," +
                col_G.G8 + "='" + G8 + "'," +
                col_G.G9_1 + "='" + G9_1 + "'," +
                col_G.G9_2 + "='" + G9_2 + "'," +
                col_G.G9_3 + "='" + G9_3 + "'," +
                col_G.G10_1 + "='" + G10_1 + "'," +
                col_G.G10_2 + "='" + G10_2 + "'," +
                col_G.G10_3 + "='" + G10_3 + "'," +
                col_G.G11_1 + "='" + G11_1 + "'," +
                col_G.G11_2 + "='" + G11_2 + "'," +
                col_G.G11_3 + "='" + G11_3 + "'," +
                col_G.G11_4 + "='" + G11_4 + "'," +
                col_G.G11_5 + "='" + G11_5 + "'," +
                col_G.G11_6 + "='" + G11_6 + "'," +
                col_G.G11_7 + "='" + G11_7 + "'," +
                col_G.G11_8 + "='" + G11_8 + "'," +
                col_G.G11_9 + "='" + G11_9 + "'," +
                col_G.G11_10 + "='" + G11_10 + "'," +
                col_G.G11_11 + "='" + G11_11 + "'," +
                col_G.G11_12 + "='" + G11_12 + "'," +
                col_G.G11_13 + "='" + G11_13 + "'" +
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
