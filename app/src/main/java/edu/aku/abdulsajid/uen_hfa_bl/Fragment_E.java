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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_E;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_E extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Linerlayout
    LinearLayout
            lv_E1,
            lv_E2,
            lv_E3,
            lv_E4,
            lv_E5,
            lv_E6;


    //endregion

    //region RadioButton

    RadioButton
            r_E1_yes,
            r_E1_no,
            R_E3_1,
            R_E3_2,
            R_E3_3,
            R_E3_4,
            R_E3_5,
            R_E3_6,
            r_E5_yes,
            r_E5_No,
            L_E6_1,
            L_E6_2,
            L_E6_3,
            L_E6_4,
            L_E6_5,
            L_E6_6;


    //endregion radio button

    //region EditTextview


    EditText
            ed_E2,
            ed_E4;


    //endregion

    String
            E1,
            E2,
            E3,
            E4,
            E5,
            E6;

    private OnFragmentInteractionListener mListener;

    public Fragment_E() {
    }

    public static Fragment_E newInstance(String param1, String param2) {
        Fragment_E fragment = new Fragment_E();

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


        View v = inflater.inflate(R.layout.fragment_e, container, false);


        initializerLinerLayout(v);
        initiallizeRadioButton(v);
        initialzieEdittextview(v);


        r_E1_no.setOnCheckedChangeListener(this);
        r_E1_yes.setOnCheckedChangeListener(this);

        r_E5_yes.setOnCheckedChangeListener(this);
        r_E5_No.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                Asignvalues();
                UpdateHfa();

                LogtableUpdates.UpdateLogSection(getContext(), "E", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_F fragment = new Fragment_F();
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

        if (compoundButton.getId() == R.id.r_E1_yes || compoundButton.getId() == R.id.r_E1_no) {

            if (r_E1_no.isChecked()) {

                lv_E2.setVisibility(View.GONE);
                lv_E3.setVisibility(View.GONE);
                lv_E4.setVisibility(View.GONE);
                lv_E5.setVisibility(View.GONE);
                lv_E6.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_E2);
                ClearAllcontrol.ClearAll(lv_E3);
                ClearAllcontrol.ClearAll(lv_E4);
                ClearAllcontrol.ClearAll(lv_E5);
                ClearAllcontrol.ClearAll(lv_E6);

            } else {
                lv_E2.setVisibility(View.VISIBLE);
                lv_E3.setVisibility(View.VISIBLE);
                lv_E4.setVisibility(View.VISIBLE);
                lv_E5.setVisibility(View.VISIBLE);
                lv_E6.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.r_E5_yes || compoundButton.getId() == R.id.r_E5_No) {

            if (r_E5_No.isChecked()) {
                lv_E6.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_E6);
            } else {
                lv_E6.setVisibility(View.VISIBLE);
            }


        }


    }

    void initializerLinerLayout(View v) {
        lv_E1 = (LinearLayout) v.findViewById(R.id.lv_E1);
        lv_E2 = (LinearLayout) v.findViewById(R.id.lv_E2);
        lv_E3 = (LinearLayout) v.findViewById(R.id.lv_E3);
        lv_E4 = (LinearLayout) v.findViewById(R.id.lv_E4);
        lv_E5 = (LinearLayout) v.findViewById(R.id.lv_E5);
        lv_E6 = (LinearLayout) v.findViewById(R.id.lv_E6);

    }

    void initiallizeRadioButton(View v) {

        r_E1_yes = (RadioButton) v.findViewById(R.id.r_E1_yes);
        r_E1_no = (RadioButton) v.findViewById(R.id.r_E1_no);
        R_E3_1 = (RadioButton) v.findViewById(R.id.R_E3_1);
        R_E3_2 = (RadioButton) v.findViewById(R.id.R_E3_2);
        R_E3_3 = (RadioButton) v.findViewById(R.id.R_E3_3);
        R_E3_4 = (RadioButton) v.findViewById(R.id.R_E3_4);
        R_E3_5 = (RadioButton) v.findViewById(R.id.R_E3_5);
        R_E3_6 = (RadioButton) v.findViewById(R.id.R_E3_6);
        r_E5_yes = (RadioButton) v.findViewById(R.id.r_E5_yes);
        r_E5_No = (RadioButton) v.findViewById(R.id.r_E5_No);
        L_E6_1 = (RadioButton) v.findViewById(R.id.L_E6_1);
        L_E6_2 = (RadioButton) v.findViewById(R.id.L_E6_2);
        L_E6_3 = (RadioButton) v.findViewById(R.id.L_E6_3);
        L_E6_4 = (RadioButton) v.findViewById(R.id.L_E6_4);
        L_E6_5 = (RadioButton) v.findViewById(R.id.L_E6_5);
        L_E6_6 = (RadioButton) v.findViewById(R.id.L_E6_6);
    }

    void initialzieEdittextview(View v) {

        ed_E2 = (EditText) v.findViewById(R.id.ed_E2);
        ed_E4 = (EditText) v.findViewById(R.id.ed_E4);

    }

    boolean validationiamgood() {

        // E4 should be less then E2
        ed_E4.setError(null);
        String ed2_text = ed_E2.getText().toString().trim();
        String ed4_text = ed_E4.getText().toString().trim();

        if (ed2_text.length() == 0) {
            ed2_text = "0";

        }

        if (ed4_text.length() == 0) {
            ed4_text = "0";

        }

        if (Integer.parseInt(ed4_text) > Integer.parseInt(ed2_text)) {
            ed_E4.setError("E4 should be Less then E2");
            return false;


        }


        if (Gothrough.IamHiden(lv_E1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_E2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_E3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_E4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_E5) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_E6) != false;
    }

    public void Asignvalues() {


        if (r_E1_yes.isChecked()) {
            E1 = "1";
        } else if (r_E1_no.isChecked()) {
            E1 = "2";
        } else {
            E1 = "999";
        }
        if (ed_E2.getText().toString().trim().length() > 0) {
            E2 = ed_E2.getText().toString().trim();
        } else {
            E2 = "999";
        }

        if (R_E3_1.isChecked()) {
            E3 = "1";
        } else if (R_E3_2.isChecked()) {
            E3 = "2";
        } else if (R_E3_3.isChecked()) {
            E3 = "3";
        } else if (R_E3_4.isChecked()) {
            E3 = "4";
        } else if (R_E3_5.isChecked()) {
            E3 = "5";
        } else if (R_E3_6.isChecked()) {
            E3 = "6";
        } else {
            E3 = "999";
        }

        if (ed_E4.getText().toString().trim().length() > 0) {
            E4 = ed_E4.getText().toString().trim();
        } else {
            E4 = "999";
        }
        if (r_E5_yes.isChecked()) {
            E5 = "1";
        } else if (r_E5_No.isChecked()) {
            E5 = "2";
        } else {
            E5 = "999";
        }

        if (L_E6_1.isChecked()) {
            E6 = "1";
        } else if (L_E6_2.isChecked()) {
            E6 = "2";
        } else if (L_E6_3.isChecked()) {
            E6 = "3";
        } else if (L_E6_4.isChecked()) {
            E6 = "4";
        } else if (L_E6_5.isChecked()) {
            E6 = "5";
        } else if (L_E6_6.isChecked()) {
            E6 = "6";
        } else {
            E6 = "999";
        }
    }

    public void UpdateHfa() {
        String query = "update  hfa set " +
                col_E.E1 + "='" + E1 + "'," +
                col_E.E2 + "='" + E2 + "'," +
                col_E.E3 + "='" + E3 + "'," +
                col_E.E4 + "='" + E4 + "'," +
                col_E.E5 + "='" + E5 + "'," +
                col_E.E6 + "='" + E6 + "'" +
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
