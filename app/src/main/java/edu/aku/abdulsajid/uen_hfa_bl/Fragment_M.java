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
import data.col_M;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_M extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Radio button

    RadioButton
            R_M1_yes,
            R_M1_No,
            R_M7_yes,
            R_M7_No,
            R_M8_yes,
            R_M8_No,
            R_M10_1,
            R_M10_2,
            R_M10_3,
            R_M10_4,
            R_M11_yes,
            R_M11_No,
            R_M12_1,
            R_M12_2,
            R_M12_3;

    //endregion

    String M1,
            M2,
            M3,
            M4_1,
            M4_2,
            M4_3,
            M4_4,
            M4_5,
            M4_6,
            M4_7,
            M4_8,
            M4_9,
            M4_10,
            M5,
            M6,
            M7,
            M8,
            M9,
            M10,
            M11,
            M12;
    //region Checkboxx

    CheckBox
            C_M4_1,
            C_M4_2,
            C_M4_3,
            C_M4_4,
            C_M4_5,
            C_M4_6,
            C_M4_7,
            C_M4_8,
            C_M4_9,
            C_M4_10;


    //endregion


    //region  Editextview


    EditText

            ET_M2,
            ET_M3,
            ET_M5,
            ET_M6,
            ET_M9;


    //endregion

    //region LinarLayout


    LinearLayout
            lv_M1,
            lv_M2,
            lv_M3,
            lv_M4,
            lv_M5,
            lv_M6,
            lv_M7,
            lv_M8,
            lv_M9,
            lv_M10,
            lv_M11,
            lv_M12;

    //endregion


    private OnFragmentInteractionListener mListener;

    public Fragment_M() {
    }

    public static Fragment_M newInstance(String param1, String param2) {
        Fragment_M fragment = new Fragment_M();

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


        View v = inflater.inflate(R.layout.fragment_m, container, false);


        initalizeEidtextview(v);
        initalizeLinerlayout(v);
        initializeCheckbox(v);
        initializeRadiobutton(v);


        R_M1_No.setOnCheckedChangeListener(this);
        R_M1_yes.setOnCheckedChangeListener(this);

        R_M8_yes.setOnCheckedChangeListener(this);
        R_M8_No.setOnCheckedChangeListener(this);


        R_M11_yes.setOnCheckedChangeListener(this);
        R_M11_No.setOnCheckedChangeListener(this);
        C_M4_10.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (validationiamgood() == false) {
                    return;
                }

                Assign_Values();
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "M", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_N fragment = new Fragment_N();
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

        if (compoundButton.getId() == R.id.R_M1_No || compoundButton.getId() == R.id.R_M1_yes) {

            if (R_M1_No.isChecked()) {
                lv_M2.setVisibility(View.GONE);
                lv_M3.setVisibility(View.GONE);
                lv_M4.setVisibility(View.GONE);
                lv_M5.setVisibility(View.GONE);
                lv_M6.setVisibility(View.GONE);
                lv_M7.setVisibility(View.GONE);
                lv_M8.setVisibility(View.GONE);
                lv_M9.setVisibility(View.GONE);
                lv_M10.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_M2);
                ClearAllcontrol.ClearAll(lv_M3);
                ClearAllcontrol.ClearAll(lv_M4);
                ClearAllcontrol.ClearAll(lv_M5);
                ClearAllcontrol.ClearAll(lv_M6);
                ClearAllcontrol.ClearAll(lv_M7);
                ClearAllcontrol.ClearAll(lv_M8);
                ClearAllcontrol.ClearAll(lv_M9);
                ClearAllcontrol.ClearAll(lv_M10);


            } else {
                lv_M2.setVisibility(View.VISIBLE);
                lv_M3.setVisibility(View.VISIBLE);
                lv_M4.setVisibility(View.VISIBLE);
                lv_M5.setVisibility(View.VISIBLE);
                lv_M6.setVisibility(View.VISIBLE);
                lv_M7.setVisibility(View.VISIBLE);
                lv_M8.setVisibility(View.VISIBLE);
                lv_M9.setVisibility(View.VISIBLE);
                lv_M10.setVisibility(View.VISIBLE);
            }


        }


        if (C_M4_10.isChecked()) {
            C_M4_1.setChecked(false);
            C_M4_2.setChecked(false);
            C_M4_3.setChecked(false);
            C_M4_4.setChecked(false);
            C_M4_5.setChecked(false);
            C_M4_6.setChecked(false);
            C_M4_7.setChecked(false);
            C_M4_8.setChecked(false);
            C_M4_9.setChecked(false);
        }


        if (compoundButton.getId() == R.id.R_M8_yes || compoundButton.getId() == R.id.R_M8_No) {
            if (R_M8_yes.isChecked()) {
                lv_M9.setVisibility(View.VISIBLE);
            } else {
                lv_M9.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_M9);
            }
        }

        if (compoundButton.getId() == R.id.R_M11_yes || compoundButton.getId() == R.id.R_M11_No) {
            if (R_M11_yes.isChecked()) {
                lv_M12.setVisibility(View.VISIBLE);
            } else {
                lv_M12.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_M12);
            }
        }
    }

    void initializeRadiobutton(View v) {

        R_M1_yes = (RadioButton) v.findViewById(R.id.R_M1_yes);
        R_M1_No = (RadioButton) v.findViewById(R.id.R_M1_No);
        R_M7_yes = (RadioButton) v.findViewById(R.id.R_M7_yes);
        R_M7_No = (RadioButton) v.findViewById(R.id.R_M7_No);
        R_M8_yes = (RadioButton) v.findViewById(R.id.R_M8_yes);
        R_M8_No = (RadioButton) v.findViewById(R.id.R_M8_No);
        R_M10_1 = (RadioButton) v.findViewById(R.id.R_M10_1);
        R_M10_2 = (RadioButton) v.findViewById(R.id.R_M10_2);
        R_M10_3 = (RadioButton) v.findViewById(R.id.R_M10_3);
        R_M10_4 = (RadioButton) v.findViewById(R.id.R_M10_4);
        R_M11_yes = (RadioButton) v.findViewById(R.id.R_M11_yes);
        R_M11_No = (RadioButton) v.findViewById(R.id.R_M11_No);
        R_M12_1 = (RadioButton) v.findViewById(R.id.R_M12_1);
        R_M12_2 = (RadioButton) v.findViewById(R.id.R_M12_2);
        R_M12_3 = (RadioButton) v.findViewById(R.id.R_M12_3);
    }

    void initalizeLinerlayout(View v) {
        lv_M1 = (LinearLayout) v.findViewById(R.id.lv_M1);
        lv_M2 = (LinearLayout) v.findViewById(R.id.lv_M2);
        lv_M3 = (LinearLayout) v.findViewById(R.id.lv_M3);
        lv_M4 = (LinearLayout) v.findViewById(R.id.lv_M4);
        lv_M5 = (LinearLayout) v.findViewById(R.id.lv_M5);
        lv_M6 = (LinearLayout) v.findViewById(R.id.lv_M6);
        lv_M7 = (LinearLayout) v.findViewById(R.id.lv_M7);
        lv_M8 = (LinearLayout) v.findViewById(R.id.lv_M8);
        lv_M9 = (LinearLayout) v.findViewById(R.id.lv_M9);
        lv_M10 = (LinearLayout) v.findViewById(R.id.lv_M10);
        lv_M11 = (LinearLayout) v.findViewById(R.id.lv_M11);
        lv_M12 = (LinearLayout) v.findViewById(R.id.lv_M12);
    }

    void initializeCheckbox(View v) {
        C_M4_1 = (CheckBox) v.findViewById(R.id.C_M4_1);
        C_M4_2 = (CheckBox) v.findViewById(R.id.C_M4_2);
        C_M4_3 = (CheckBox) v.findViewById(R.id.C_M4_3);
        C_M4_4 = (CheckBox) v.findViewById(R.id.C_M4_4);
        C_M4_5 = (CheckBox) v.findViewById(R.id.C_M4_5);
        C_M4_6 = (CheckBox) v.findViewById(R.id.C_M4_6);
        C_M4_7 = (CheckBox) v.findViewById(R.id.C_M4_7);
        C_M4_8 = (CheckBox) v.findViewById(R.id.C_M4_8);
        C_M4_9 = (CheckBox) v.findViewById(R.id.C_M4_9);
        C_M4_10 = (CheckBox) v.findViewById(R.id.C_M4_10);
    }

    void initalizeEidtextview(View v) {
        ET_M2 = (EditText) v.findViewById(R.id.ET_M2);
        ET_M3 = (EditText) v.findViewById(R.id.ET_M3);
        ET_M5 = (EditText) v.findViewById(R.id.ET_M5);
        ET_M6 = (EditText) v.findViewById(R.id.ET_M6);
        ET_M9 = (EditText) v.findViewById(R.id.ET_M9);
    }

    void Assign_Values() {
        if (R_M1_yes.isChecked()) {
            M1 = "1";
        } else if (R_M1_No.isChecked()) {
            M1 = "2";
        }

        if (ET_M2.getText().toString().trim().length() > 0) {
            M2 = ET_M2.getText().toString().trim();
        } else {
            M2 = "999";
        }


        if (ET_M3.getText().toString().trim().length() > 0) {
            M3 = ET_M3.getText().toString().trim();
        } else {

            M3 = "999";

        }

        if (C_M4_1.isChecked()) {
            M4_1 = "1";
        } else {
            M4_1 = "999";
        }

        if (C_M4_2.isChecked()) {
            M4_2 = "1";
        } else {
            M4_2 = "999";
        }

        if (C_M4_3.isChecked()) {
            M4_3 = "1";
        } else {
            M4_3 = "999";
        }

        if (C_M4_4.isChecked()) {
            M4_4 = "1";
        } else {
            M4_4 = "999";
        }

        if (C_M4_5.isChecked()) {
            M4_5 = "1";
        } else {
            M4_5 = "999";
        }

        if (C_M4_6.isChecked()) {
            M4_6 = "1";
        } else {
            M4_6 = "999";
        }

        if (C_M4_7.isChecked()) {
            M4_7 = "1";
        } else {
            M4_7 = "999";
        }

        if (C_M4_8.isChecked()) {
            M4_8 = "1";
        } else {
            M4_8 = "999";
        }

        if (C_M4_9.isChecked()) {
            M4_9 = "1";
        } else {
            M4_9 = "999";
        }

        if (C_M4_10.isChecked()) {
            M4_10 = "1";
        } else {
            M4_10 = "999";
        }

        if (ET_M5.getText().toString().trim().length() > 0) {
            M5 = ET_M5.getText().toString().trim();
        } else {
            M5 = "999";
        }

        if (ET_M6.getText().toString().trim().length() > 0) {
            M6 = ET_M6.getText().toString().trim();
        } else {
            M6 = "999";
        }

        if (R_M7_yes.isChecked()) {
            M7 = "1";
        } else if (R_M7_No.isChecked()) {
            M7 = "2";
        } else {
            M7 = "999";
        }

        if (R_M8_yes.isChecked()) {
            M8 = "1";
        } else if (R_M8_No.isChecked()) {
            M8 = "2";
        } else {
            M8 = "999";
        }

        if (ET_M9.getText().toString().trim().length() > 0) {
            M9 = ET_M9.getText().toString().trim();
        } else {
            M9 = "999";
        }

        if (R_M10_1.isChecked()) {
            M10 = "1";
        } else if (R_M10_2.isChecked()) {
            M10 = "2";
        } else if (R_M10_3.isChecked()) {
            M10 = "3";
        } else if (R_M10_4.isChecked()) {
            M10 = "4";
        } else {
            M10 = "999";
        }

        if (R_M11_yes.isChecked()) {
            M11 = "1";
        } else if (R_M11_No.isChecked()) {
            M11 = "2";
        } else {
            M11 = "999";
        }

        if (R_M12_1.isChecked()) {
            M12 = "1";
        } else if (R_M12_2.isChecked()) {
            M12 = "2";
        } else if (R_M12_3.isChecked()) {
            M12 = "3";
        } else {
            M12 = "999";
        }

    }

    boolean validationiamgood() {

        // M3 should be less then M2
        ET_M2.setError(null);
        String ed2_text = ET_M2.getText().toString().trim();
        String ed4_text = ET_M3.getText().toString().trim();

        if (ed2_text.length() == 0) {
            ed2_text = "0";

        }

        if (ed4_text.length() == 0) {
            ed4_text = "0";

        }

        ET_M3.setError(null);
        if (Integer.parseInt(ed4_text) > Integer.parseInt(ed2_text)) {
            ET_M3.setError("M3 should be Less then M2");
            ET_M3.requestFocus();
            return false;


        }


        if (Gothrough.IamHiden(lv_M1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_M11) == false) {
            return false;
        }

        return Gothrough.IamHiden(lv_M12) != false;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +
                col_M.M1 + "='" + M1 + "'," +
                col_M.M2 + "='" + M2 + "'," +
                col_M.M3 + "='" + M3 + "'," +
                col_M.M4_1 + "='" + M4_1 + "'," +
                col_M.M4_2 + "='" + M4_2 + "'," +
                col_M.M4_3 + "='" + M4_3 + "'," +
                col_M.M4_4 + "='" + M4_4 + "'," +
                col_M.M4_5 + "='" + M4_5 + "'," +
                col_M.M4_6 + "='" + M4_6 + "'," +
                col_M.M4_7 + "='" + M4_7 + "'," +
                col_M.M4_8 + "='" + M4_8 + "'," +
                col_M.M4_9 + "='" + M4_9 + "'," +
                col_M.M4_10 + "='" + M4_10 + "'," +
                col_M.M5 + "='" + M5 + "'," +
                col_M.M6 + "='" + M6 + "'," +
                col_M.M7 + "='" + M7 + "'," +
                col_M.M8 + "='" + M8 + "'," +
                col_M.M9 + "='" + M9 + "'," +
                col_M.M10 + "='" + M10 + "'," +
                col_M.M11 + "='" + M11 + "'," +
                col_M.M12 + "='" + M12 + "'" +
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
