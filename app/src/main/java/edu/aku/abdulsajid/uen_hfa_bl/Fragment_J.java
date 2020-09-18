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
import data.col_J;
import data.col_K;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_J extends Fragment implements RadioButton.OnCheckedChangeListener {


//region RadioButton

    RadioButton
            r_J1_yes,
            r_J1_no,
            r_J2_yes,
            r_J2_no,
            R_J3_1,
            R_J3_2,
            R_J3_3,
            R_J3_4,
            R_J3_5,
            R_J3_6,
            r_J4_yes,
            r_J4_no,
            r_J6_yes,
            r_J6_no,
            r_J8_yes,
            r_J8_no,
            r_J9_yes,
            r_J9_no,
            r_J10_yes,
            r_J10_no;

    //endregion


    //region editextview
    EditText
            ed_J5,
            ed_J7_9;

    //endregion


    //region LV
    LinearLayout
            lv_J1,
            lv_sub_main,
            lv_J2,
            lv_J3,
            lv_J4,
            lv_J5,
            lv_J6,
            lv_J7,
            lv_J8,
            lv_J9,
            lv_J10;

    //endregion

    //region Checkbox

    CheckBox

            C_J7_1,
            C_J7_2,
            C_J7_3,
            C_J7_4,
            C_J7_5,
            C_J7_6,
            C_J7_7,
            C_J7_8;


    //endregion


    //region String


    String

            J1,
            J2,
            J3,
            J4,
            J5,
            J6,
            J7_1,
            J7_2,
            J7_3,
            J7_4,
            J7_5,
            J7_6,
            J7_7,
            J7_8,
            J7_9,
            J8,
            J9,
            J10;

    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_J() {
    }

    public static Fragment_J newInstance(String param1, String param2) {
        Fragment_J fragment = new Fragment_J();

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


        View v = inflater.inflate(R.layout.fragment_j, container, false);


        initalizeRadioButton(v);
        initalzieEditexview(v);
        initalizerLinlyaout(v);
        initalizeCheckbox(v);


        r_J1_no.setOnCheckedChangeListener(this);
        r_J1_yes.setOnCheckedChangeListener(this);

        r_J4_yes.setOnCheckedChangeListener(this);
        r_J4_no.setOnCheckedChangeListener(this);


        r_J6_yes.setOnCheckedChangeListener(this);
        r_J6_no.setOnCheckedChangeListener(this);

        r_J9_yes.setOnCheckedChangeListener(this);
        r_J9_no.setOnCheckedChangeListener(this);

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
                LogtableUpdates.UpdateLogSection(getContext(), "J", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();


                if (Validation.A4 == "2") {


                    updateHFAKSection();

                    Fragment_L fragment = new Fragment_L();
                    ftu.replace(R.id.frag_container, fragment).commit();
                } else {

                    Fragment_K fragment = new Fragment_K();
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

        if (compoundButton.getId() == R.id.r_J1_yes || compoundButton.getId() == R.id.r_J1_no) {

            if (r_J1_no.isChecked()) {


                lv_J2.setVisibility(View.GONE);
                lv_J3.setVisibility(View.GONE);
                lv_J4.setVisibility(View.GONE);
                lv_J5.setVisibility(View.GONE);


                ClearAllcontrol.ClearAll(lv_J2);
                ClearAllcontrol.ClearAll(lv_J3);
                ClearAllcontrol.ClearAll(lv_J4);
                ClearAllcontrol.ClearAll(lv_J5);


            } else {
                lv_J2.setVisibility(View.VISIBLE);
                lv_J3.setVisibility(View.VISIBLE);
                lv_J4.setVisibility(View.VISIBLE);
                lv_J5.setVisibility(View.VISIBLE);

            }


        }

        if (compoundButton.getId() == R.id.r_J4_yes || compoundButton.getId() == R.id.r_J4_no) {

            if (r_J4_yes.isChecked()) {
                lv_J5.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_J5);
            } else {
                lv_J5.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.r_J6_yes || compoundButton.getId() == R.id.r_J6_no) {

            if (r_J6_no.isChecked()) {
                lv_J7.setVisibility(View.GONE);
                lv_J8.setVisibility(View.GONE);
                lv_J9.setVisibility(View.GONE);
                lv_J10.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_J7);
                ClearAllcontrol.ClearAll(lv_J8);
                ClearAllcontrol.ClearAll(lv_J9);
                ClearAllcontrol.ClearAll(lv_J10);
            } else {
                lv_J7.setVisibility(View.VISIBLE);
                lv_J8.setVisibility(View.VISIBLE);
                lv_J9.setVisibility(View.VISIBLE);
                lv_J10.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.r_J9_yes || compoundButton.getId() == R.id.r_J9_no) {

            if (r_J9_no.isChecked()) {
                lv_J10.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_J10);

            } else {
                lv_J10.setVisibility(View.VISIBLE);

            }


        }
    }

    void initalizeRadioButton(View v) {
        r_J1_yes = (RadioButton) v.findViewById(R.id.r_J1_yes);
        r_J1_no = (RadioButton) v.findViewById(R.id.r_J1_no);
        r_J2_yes = (RadioButton) v.findViewById(R.id.r_J2_yes);
        r_J2_no = (RadioButton) v.findViewById(R.id.r_J2_No);
        R_J3_1 = (RadioButton) v.findViewById(R.id.R_J3_1);
        R_J3_2 = (RadioButton) v.findViewById(R.id.R_J3_2);
        R_J3_3 = (RadioButton) v.findViewById(R.id.R_J3_3);
        R_J3_4 = (RadioButton) v.findViewById(R.id.R_J3_4);
        R_J3_5 = (RadioButton) v.findViewById(R.id.R_J3_5);
        R_J3_6 = (RadioButton) v.findViewById(R.id.R_J3_6);
        r_J4_yes = (RadioButton) v.findViewById(R.id.r_J4_yes);
        r_J4_no = (RadioButton) v.findViewById(R.id.r_J4_no);

        r_J6_yes = (RadioButton) v.findViewById(R.id.r_J6_yes);
        r_J6_no = (RadioButton) v.findViewById(R.id.r_J6_no);

        r_J8_yes = (RadioButton) v.findViewById(R.id.r_J8_yes);
        r_J8_no = (RadioButton) v.findViewById(R.id.r_J8_no);
        r_J9_yes = (RadioButton) v.findViewById(R.id.r_J9_yes);
        r_J9_no = (RadioButton) v.findViewById(R.id.r_J9_no);
        r_J10_yes = (RadioButton) v.findViewById(R.id.r_J10_yes);
        r_J10_no = (RadioButton) v.findViewById(R.id.r_J10_no);
    }

    void initalizeCheckbox(View v) {
        C_J7_1 = (CheckBox) v.findViewById(R.id.C_J7_1);
        C_J7_2 = (CheckBox) v.findViewById(R.id.C_J7_2);
        C_J7_3 = (CheckBox) v.findViewById(R.id.C_J7_3);
        C_J7_4 = (CheckBox) v.findViewById(R.id.C_J7_4);
        C_J7_5 = (CheckBox) v.findViewById(R.id.C_J7_5);
        C_J7_6 = (CheckBox) v.findViewById(R.id.C_J7_6);
        C_J7_7 = (CheckBox) v.findViewById(R.id.C_J7_7);
        C_J7_8 = (CheckBox) v.findViewById(R.id.C_J7_8);

    }

    void initalzieEditexview(View v) {
        ed_J5 = (EditText) v.findViewById(R.id.ed_J5);
        ed_J7_9 = (EditText) v.findViewById(R.id.ed_J7_9);

    }

    void initalizerLinlyaout(View v) {
        lv_J1 = (LinearLayout) v.findViewById(R.id.lv_J1);
        lv_sub_main = (LinearLayout) v.findViewById(R.id.lv_sub_main);
        lv_J2 = (LinearLayout) v.findViewById(R.id.lv_J2);
        lv_J3 = (LinearLayout) v.findViewById(R.id.lv_J3);
        lv_J4 = (LinearLayout) v.findViewById(R.id.lv_J4);
        lv_J5 = (LinearLayout) v.findViewById(R.id.lv_J5);
        lv_J6 = (LinearLayout) v.findViewById(R.id.lv_J6);
        lv_J7 = (LinearLayout) v.findViewById(R.id.lv_J7);
        lv_J8 = (LinearLayout) v.findViewById(R.id.lv_J8);
        lv_J9 = (LinearLayout) v.findViewById(R.id.lv_J9);
        lv_J10 = (LinearLayout) v.findViewById(R.id.lv_J10);
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_J1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_J9) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_J10) != false;
    }

    public boolean Asignvalues() {


        if (r_J1_yes.isChecked()) {
            J1 = "1";
        } else if (r_J1_no.isChecked()) {
            J1 = "2";
        } else {
            J1 = "999";
        }


        if (r_J2_yes.isChecked()) {
            J2 = "1";
        } else if (r_J2_no.isChecked()) {
            J2 = "2";
        } else {
            J2 = "999";
        }

        if (R_J3_1.isChecked()) {
            J3 = "1";
        } else if (R_J3_2.isChecked()) {
            J3 = "2";
        } else if (R_J3_3.isChecked()) {
            J3 = "3";
        } else if (R_J3_4.isChecked()) {
            J3 = "4";
        } else if (R_J3_5.isChecked()) {
            J3 = "5";
        } else if (R_J3_6.isChecked()) {
            J3 = "6";
        } else {
            J3 = "999";
        }

        if (r_J4_yes.isChecked()) {
            J4 = "1";
        } else if (r_J4_no.isChecked()) {
            J4 = "2";
        } else {
            J4 = "999";
        }

        if (ed_J5.getText().toString().trim().length() > 0) {
            J5 = ed_J5.getText().toString().trim();
        } else {
            J5 = "999";
        }

        if (r_J6_yes.isChecked()) {
            J6 = "1";
        } else if (r_J6_no.isChecked()) {
            J6 = "2";
        } else {
            J6 = "999";
        }


        if (C_J7_1.isChecked()) {
            J7_1 = "1";
        } else {
            J7_1 = "999";
        }
        if (C_J7_2.isChecked()) {
            J7_2 = "1";
        } else {
            J7_2 = "999";
        }
        if (C_J7_3.isChecked()) {
            J7_3 = "1";
        } else {
            J7_3 = "999";
        }
        if (C_J7_4.isChecked()) {
            J7_4 = "1";
        } else {
            J7_4 = "999";
        }
        if (C_J7_5.isChecked()) {
            J7_5 = "1";
        } else {
            J7_5 = "999";
        }
        if (C_J7_6.isChecked()) {
            J7_6 = "1";
        } else {
            J7_6 = "999";
        }
        if (C_J7_7.isChecked()) {
            J7_7 = "1";
        } else {
            J7_7 = "999";
        }
        if (C_J7_8.isChecked()) {
            J7_8 = "1";
        } else {
            J7_8 = "999";
        }
        if (ed_J7_9.getText().toString().trim().length() > 0) {
            J7_9 = ed_J7_9.getText().toString().trim();
        } else {
            J7_9 = "999";
        }

        if (r_J8_yes.isChecked()) {
            J8 = "1";
        } else if (r_J8_no.isChecked()) {
            J8 = "2";
        } else {
            J8 = "999";
        }

        if (r_J9_yes.isChecked()) {
            J9 = "1";
        } else if (r_J9_no.isChecked()) {
            J9 = "2";
        } else {
            J9 = "999";
        }

        if (r_J10_yes.isChecked()) {
            J10 = "1";
        } else if (r_J10_no.isChecked()) {
            J10 = "2";
        } else {
            J10 = "999";
        }


        return true;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +

                col_J.J1 + "='" + J1 + "'," +
                col_J.J2 + "='" + J2 + "'," +
                col_J.J3 + "='" + J3 + "'," +
                col_J.J4 + "='" + J4 + "'," +
                col_J.J5 + "='" + J5 + "'," +
                col_J.J6 + "='" + J6 + "'," +
                col_J.J7_1 + "='" + J7_1 + "'," +
                col_J.J7_2 + "='" + J7_2 + "'," +
                col_J.J7_3 + "='" + J7_3 + "'," +
                col_J.J7_4 + "='" + J7_4 + "'," +
                col_J.J7_5 + "='" + J7_5 + "'," +
                col_J.J7_6 + "='" + J7_6 + "'," +
                col_J.J7_7 + "='" + J7_7 + "'," +
                col_J.J7_8 + "='" + J7_8 + "'," +
                col_J.J7_9 + "='" + J7_9 + "'," +
                col_J.J8 + "='" + J8 + "'," +
                col_J.J9 + "='" + J9 + "'," +
                col_J.J10 + "='" + J10 + "'" +
                " Where id=" + Validation.HFAPK;

        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

        return true;


    }

    void updateHFAKSection() {
        String query = "update  hfa set " +

                col_K.K1 + "='" + "999" + "'," +
                col_K.K2 + "='" + "999" + "'," +
                col_K.K3 + "='" + "999" + "'" +
                " Where id=" + Validation.HFAPK;

        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted K Section successfully", Toast.LENGTH_SHORT).show();


    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
