package edu.aku.abdulsajid.uen_hfa_bl;

import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_H;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_H extends Fragment implements RadioButton.OnCheckedChangeListener {


    Button btnDate;

    //region Linerlayout
    LinearLayout
            lv_h1,
            lv_h2,
            lv_h3,
            lv_h4,
            lv_h5,
            lv_h6,
            lv_h7,
            lv_h8,
            lv_h9;

    //endregion

    //region RadioButton

    RadioButton
            R_h1_yes,
            R_h1_no,
            R_H5_1,
            R_H3_1,
            R_H3_2,
            R_H3_3,
            R_H3_4,
            R_H3_5,
            R_H3_6,
            R_H3_7,
            R_H3_8,
            R_H3_9,
            R_H3_10,
            R_H5_2,
            R_H5_3,
            R_H5_4,
            R_H5_5,
            R_H5_6,
            R_H6_1,
            R_H6_2,
            R_H6_3,
            R_H7_1,
            R_H7_2,
            R_H7_3,
            R_H7_4,
            R_H8_yes,
            R_H8_no;


    //endregion


    //region Checkboxs
    CheckBox

            C_H4_1,
            C_H4_2,
            C_H4_3,
            C_H4_4,
            C_H4_5,
            C_H4_6,
            C_H4_7,
            C_H4_8,
            C_H9_1,
            C_H9_2,
            C_H9_3,
            C_H9_4,
            C_H9_5,
            C_H9_6,
            C_H9_7,
            C_H9_8,
            C_H9_9,
            C_H9_10;


    //endregion


    //region string
    String
            H1,
            H2,
            H3,
            H4_1,
            H4_2,
            H4_3,
            H4_4,
            H4_5,
            H4_6,
            H4_7,
            H4_8,
            H5,
            H6,
            H7,
            H8,
            H9_1,
            H9_2,
            H9_3,
            H9_4,
            H9_5,
            H9_6,
            H9_7,
            H9_8,
            H9_9,
            H9_10;

    EditText ed_H3_10, ed_H9_10;

    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_H() {
    }

    public static Fragment_H newInstance(String param1, String param2) {
        Fragment_H fragment = new Fragment_H();

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


        View v = inflater.inflate(R.layout.fragment_h, container, false);


        initalizerCheckbox(v);
        initalziRadiobutton(v);
        initialzierLinerLayout(v);


        // R_H8_no.setOnCheckedChangeListener(this);
        //   R_H8_yes.setOnCheckedChangeListener(this);

        R_h1_no.setOnCheckedChangeListener(this);
        R_h1_yes.setOnCheckedChangeListener(this);

        R_H3_1.setOnCheckedChangeListener(this);
        R_H3_2.setOnCheckedChangeListener(this);
        R_H3_3.setOnCheckedChangeListener(this);
        R_H3_4.setOnCheckedChangeListener(this);
        R_H3_5.setOnCheckedChangeListener(this);
        R_H3_6.setOnCheckedChangeListener(this);
        R_H3_7.setOnCheckedChangeListener(this);
        R_H3_8.setOnCheckedChangeListener(this);
        R_H3_9.setOnCheckedChangeListener(this);
        R_H3_10.setOnCheckedChangeListener(this);

        C_H9_1.setOnCheckedChangeListener(this);
        C_H9_2.setOnCheckedChangeListener(this);
        C_H9_3.setOnCheckedChangeListener(this);
        C_H9_4.setOnCheckedChangeListener(this);
        C_H9_5.setOnCheckedChangeListener(this);
        C_H9_6.setOnCheckedChangeListener(this);
        C_H9_7.setOnCheckedChangeListener(this);
        C_H9_8.setOnCheckedChangeListener(this);
        C_H9_9.setOnCheckedChangeListener(this);
        C_H9_10.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }

                asignValues();
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "H", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_I fragment = new Fragment_I();
                ftu.replace(R.id.frag_container, fragment).commit();


            }
        });


        btnDate = (Button) v.findViewById(R.id.b_H2);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        btnDate.setText(y + "/" + (m + 1) + "/" + d);
                    }
                }, 2017, 06, 6);
                dialog.show();
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

        if (compoundButton.getId() == R.id.R_h1_yes || compoundButton.getId() == R.id.R_h1_no) {


            if (R_h1_no.isChecked()) {
                lv_h2.setVisibility(View.GONE);
                lv_h3.setVisibility(View.GONE);
                lv_h4.setVisibility(View.GONE);
                lv_h5.setVisibility(View.GONE);
                lv_h6.setVisibility(View.GONE);
                lv_h7.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(lv_h2);
                ClearAllcontrol.ClearAll(lv_h3);
                ClearAllcontrol.ClearAll(lv_h4);
                ClearAllcontrol.ClearAll(lv_h5);
                ClearAllcontrol.ClearAll(lv_h6);
                ClearAllcontrol.ClearAll(lv_h7);
                btnDate.setText("Select Date");


            } else {
                lv_h2.setVisibility(View.VISIBLE);
                lv_h3.setVisibility(View.VISIBLE);
                lv_h4.setVisibility(View.VISIBLE);
                lv_h5.setVisibility(View.VISIBLE);
                lv_h6.setVisibility(View.VISIBLE);
                lv_h7.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.R_H8_yes || compoundButton.getId() == R.id.R_H8_no) {
            if (R_H8_no.isChecked()) {
                lv_h9.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_h9);
            } else {
                lv_h9.setVisibility(View.VISIBLE);

            }
        }

        if (compoundButton.getId() == R.id.R_H3_1 || compoundButton.getId() == R.id.R_H3_2 ||
                compoundButton.getId() == R.id.R_H3_3 || compoundButton.getId() == R.id.R_H3_4 ||
                compoundButton.getId() == R.id.R_H3_5 || compoundButton.getId() == R.id.R_H3_6 ||
                compoundButton.getId() == R.id.R_H3_7 || compoundButton.getId() == R.id.R_H3_8 ||
                compoundButton.getId() == R.id.R_H3_9 || compoundButton.getId() == R.id.R_H3_10) {
            if (R_H3_10.isChecked()) {

                ed_H3_10.setVisibility(View.VISIBLE);
            } else {
                ed_H3_10.setVisibility(View.GONE);

                ed_H3_10.setText("");
            }
        }


        if (compoundButton.getId() == R.id.C_H9_1 || compoundButton.getId() == R.id.C_H9_2 ||
                compoundButton.getId() == R.id.C_H9_3 || compoundButton.getId() == R.id.C_H9_4 ||
                compoundButton.getId() == R.id.C_H9_5 || compoundButton.getId() == R.id.C_H9_6 ||
                compoundButton.getId() == R.id.C_H9_7 || compoundButton.getId() == R.id.C_H9_8 ||
                compoundButton.getId() == R.id.C_H9_9 || compoundButton.getId() == R.id.C_H9_10) {
            if (C_H9_10.isChecked()) {

                ed_H9_10.setVisibility(View.VISIBLE);
            } else {
                ed_H9_10.setVisibility(View.GONE);

                ed_H9_10.setText("");
            }
        }
    }

    void initialzierLinerLayout(View v) {
        lv_h1 = (LinearLayout) v.findViewById(R.id.lv_h1);
        lv_h2 = (LinearLayout) v.findViewById(R.id.lv_h2);
        lv_h3 = (LinearLayout) v.findViewById(R.id.lv_H3);
        lv_h4 = (LinearLayout) v.findViewById(R.id.lv_H4);
        lv_h5 = (LinearLayout) v.findViewById(R.id.lv_H5);
        lv_h6 = (LinearLayout) v.findViewById(R.id.lv_H6);
        lv_h7 = (LinearLayout) v.findViewById(R.id.lv_H7);
        lv_h8 = (LinearLayout) v.findViewById(R.id.lv_H8);
        lv_h9 = (LinearLayout) v.findViewById(R.id.lv_H9);
    }

    void initalziRadiobutton(View v) {

        R_h1_yes = (RadioButton) v.findViewById(R.id.R_h1_yes);
        R_h1_no = (RadioButton) v.findViewById(R.id.R_h1_no);


        R_H3_1 = (RadioButton) v.findViewById(R.id.R_H3_1);
        R_H3_2 = (RadioButton) v.findViewById(R.id.R_H3_2);
        R_H3_3 = (RadioButton) v.findViewById(R.id.R_H3_3);
        R_H3_4 = (RadioButton) v.findViewById(R.id.R_H3_4);
        R_H3_5 = (RadioButton) v.findViewById(R.id.R_H3_5);
        R_H3_6 = (RadioButton) v.findViewById(R.id.R_H3_6);
        R_H3_7 = (RadioButton) v.findViewById(R.id.R_H3_7);
        R_H3_8 = (RadioButton) v.findViewById(R.id.R_H3_8);
        R_H3_9 = (RadioButton) v.findViewById(R.id.R_H3_9);
        R_H3_10 = (RadioButton) v.findViewById(R.id.R_H3_10);
        ed_H3_10 = (EditText) v.findViewById(R.id.ed_H3_10);
        ed_H9_10 = (EditText) v.findViewById(R.id.ed_H9_10);

        R_H5_1 = (RadioButton) v.findViewById(R.id.R_H5_1);
        R_H5_2 = (RadioButton) v.findViewById(R.id.R_H5_2);
        R_H5_3 = (RadioButton) v.findViewById(R.id.R_H5_3);
        R_H5_4 = (RadioButton) v.findViewById(R.id.R_H5_4);
        R_H5_5 = (RadioButton) v.findViewById(R.id.R_H5_5);
        R_H5_6 = (RadioButton) v.findViewById(R.id.R_H5_6);
        R_H6_1 = (RadioButton) v.findViewById(R.id.R_H6_1);
        R_H6_2 = (RadioButton) v.findViewById(R.id.R_H6_2);
        R_H6_3 = (RadioButton) v.findViewById(R.id.R_H6_3);
        R_H7_1 = (RadioButton) v.findViewById(R.id.R_H7_1);
        R_H7_2 = (RadioButton) v.findViewById(R.id.R_H7_2);
        R_H7_3 = (RadioButton) v.findViewById(R.id.R_H7_3);
        R_H7_4 = (RadioButton) v.findViewById(R.id.R_H7_4);
        R_H8_yes = (RadioButton) v.findViewById(R.id.R_H8_yes);
        R_H8_no = (RadioButton) v.findViewById(R.id.R_H8_no);

    }

    void initalizerCheckbox(View v) {


        C_H4_1 = (CheckBox) v.findViewById(R.id.C_H4_1);
        C_H4_2 = (CheckBox) v.findViewById(R.id.C_H4_2);
        C_H4_3 = (CheckBox) v.findViewById(R.id.C_H4_3);
        C_H4_4 = (CheckBox) v.findViewById(R.id.C_H4_4);
        C_H4_5 = (CheckBox) v.findViewById(R.id.C_H4_5);
        C_H4_6 = (CheckBox) v.findViewById(R.id.C_H4_6);
        C_H4_7 = (CheckBox) v.findViewById(R.id.C_H4_7);
        C_H4_8 = (CheckBox) v.findViewById(R.id.C_H4_8);
        C_H9_1 = (CheckBox) v.findViewById(R.id.C_H9_1);
        C_H9_2 = (CheckBox) v.findViewById(R.id.C_H9_2);
        C_H9_3 = (CheckBox) v.findViewById(R.id.C_H9_3);
        C_H9_4 = (CheckBox) v.findViewById(R.id.C_H9_4);
        C_H9_5 = (CheckBox) v.findViewById(R.id.C_H9_5);
        C_H9_6 = (CheckBox) v.findViewById(R.id.C_H9_6);
        C_H9_7 = (CheckBox) v.findViewById(R.id.C_H9_7);
        C_H9_8 = (CheckBox) v.findViewById(R.id.C_H9_8);
        C_H9_9 = (CheckBox) v.findViewById(R.id.C_H9_9);
        C_H9_10 = (CheckBox) v.findViewById(R.id.C_H9_10);
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_h1) == false) {
            return false;
        }
        if (lv_h2.getVisibility() == View.VISIBLE) {

            String tt = btnDate.getText().toString().trim();
            if (tt.equals("Select Date")) {
                btnDate.setError("Select Date");
                btnDate.requestFocus();
                return false;

            }
            btnDate.setError(null);
        }

        if (Gothrough.IamHiden(lv_h3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_h4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_h5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_h6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_h7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_h8) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_h9) != false;

    }

    void asignValues() {

        if (R_h1_yes.isChecked()) {
            H1 = "1";
        } else if (R_h1_no.isChecked()) {
            H1 = "2";
        } else {
            H1 = "999";
        }

        if (btnDate.getText().toString().equals("Select Date")) {


            H2 = "999";


        } else {
            H2 = btnDate.getText().toString().trim();
        }


        if (R_H3_1.isChecked()) {
            H3 = "1";
        } else if (R_H3_2.isChecked()) {
            H3 = "2";
        } else if (R_H3_3.isChecked()) {
            H3 = "3";
        } else if (R_H3_4.isChecked()) {
            H3 = "4";
        } else if (R_H3_5.isChecked()) {
            H3 = "5";
        } else if (R_H3_6.isChecked()) {
            H3 = "6";
        } else if (R_H3_7.isChecked()) {
            H3 = "7";
        } else if (R_H3_8.isChecked()) {
            H3 = "8";
        } else if (R_H3_9.isChecked()) {
            H3 = "9";
        } else if (R_H3_10.isChecked()) {
            if (ed_H3_10.getText().toString().trim().length() > 0) {
                H3 = ed_H3_10.getText().toString().trim();
            } else {
                H3 = "999";
            }
        } else {
            H3 = "999";
        }


        if (C_H4_1.isChecked()) {
            H4_1 = "1";
        } else {
            H4_1 = "999";
        }
        if (C_H4_2.isChecked()) {
            H4_2 = "1";
        } else {
            H4_2 = "999";
        }

        if (C_H4_3.isChecked()) {
            H4_3 = "1";
        } else {
            H4_3 = "999";
        }

        if (C_H4_4.isChecked()) {
            H4_4 = "1";
        } else {
            H4_4 = "999";
        }

        if (C_H4_5.isChecked()) {
            H4_5 = "1";
        } else {
            H4_5 = "999";
        }

        if (C_H4_6.isChecked()) {
            H4_6 = "1";
        } else {
            H4_6 = "999";
        }
        if (C_H4_7.isChecked()) {
            H4_7 = "1";
        } else {
            H4_7 = "999";
        }
        if (C_H4_8.isChecked()) {
            H4_8 = "1";
        } else {
            H4_8 = "999";
        }

        if (R_H5_1.isChecked()) {
            H5 = "1";
        } else if (R_H5_2.isChecked()) {
            H5 = "2";
        } else if (R_H5_3.isChecked()) {
            H5 = "3";
        } else if (R_H5_4.isChecked()) {
            H5 = "4";
        } else if (R_H5_5.isChecked()) {
            H5 = "5";
        } else if (R_H5_6.isChecked()) {
            H5 = "6";
        } else {
            H5 = "999";
        }

        if (R_H6_1.isChecked()) {
            H6 = "1";
        } else if (R_H6_2.isChecked()) {
            H6 = "2";
        } else if (R_H6_3.isChecked()) {
            H6 = "3";
        } else {
            H6 = "999";

        }
        if (R_H7_1.isChecked()) {
            H7 = "1";
        } else if (R_H7_2.isChecked()) {
            H7 = "2";
        } else if (R_H7_3.isChecked()) {
            H7 = "3";
        } else if (R_H7_4.isChecked()) {
            H7 = "4";
        } else {
            H7 = "999";
        }

        if (R_H8_yes.isChecked()) {
            H8 = "1";
        } else if (R_H8_no.isChecked()) {
            H8 = "2";
        } else {
            H8 = "999";
        }


        if (C_H9_1.isChecked()) {
            H9_1 = "1";
        } else {
            H9_1 = "999";
        }
        if (C_H9_2.isChecked()) {
            H9_2 = "1";
        } else {
            H9_2 = "999";
        }
        if (C_H9_3.isChecked()) {
            H9_3 = "1";
        } else {
            H9_3 = "999";
        }
        if (C_H9_4.isChecked()) {
            H9_4 = "1";
        } else {
            H9_4 = "999";
        }
        if (C_H9_5.isChecked()) {
            H9_5 = "1";
        } else {
            H9_5 = "999";
        }
        if (C_H9_6.isChecked()) {
            H9_6 = "1";
        } else {
            H9_6 = "999";
        }
        if (C_H9_7.isChecked()) {
            H9_7 = "1";
        } else {
            H9_7 = "999";
        }
        if (C_H9_8.isChecked()) {
            H9_8 = "1";
        } else {
            H9_8 = "999";
        }
        if (C_H9_9.isChecked()) {
            H9_9 = "1";
        } else {
            H9_9 = "999";
        }

        if (C_H9_10.isChecked()) {
            if (ed_H9_10.getText().toString().trim().length() > 0) {
                H9_10 = ed_H9_10.getText().toString().trim();
            } else {
                H9_10 = "999";
            }
        } else {
            H9_10 = "999";
        }

    }

    void updateHFA() {
        String query = "update  hfa set " +

                col_H.H1 + "='" + H1 + "'," +
                col_H.H2 + "='" + H2 + "'," +
                col_H.H3 + "='" + H3 + "'," +
                col_H.H4_1 + "='" + H4_1 + "'," +
                col_H.H4_2 + "='" + H4_2 + "'," +
                col_H.H4_3 + "='" + H4_3 + "'," +
                col_H.H4_4 + "='" + H4_4 + "'," +
                col_H.H4_5 + "='" + H4_5 + "'," +
                col_H.H4_6 + "='" + H4_6 + "'," +
                col_H.H4_7 + "='" + H4_7 + "'," +
                col_H.H4_8 + "='" + H4_8 + "'," +
                col_H.H5 + "='" + H5 + "'," +
                col_H.H6 + "='" + H6 + "'," +
                col_H.H7 + "='" + H7 + "'," +
                col_H.H8 + "='" + H8 + "'," +
                col_H.H9_1 + "='" + H9_1 + "'," +
                col_H.H9_2 + "='" + H9_2 + "'," +
                col_H.H9_3 + "='" + H9_3 + "'," +
                col_H.H9_4 + "='" + H9_4 + "'," +
                col_H.H9_5 + "='" + H9_5 + "'," +
                col_H.H9_6 + "='" + H9_6 + "'," +
                col_H.H9_7 + "='" + H9_7 + "'," +
                col_H.H9_8 + "='" + H9_8 + "'," +
                col_H.H9_9 + "='" + H9_9 + "'," +
                col_H.H9_10 + "='" + H9_10 + "'" +
                " where id=" + Validation.HFAPK;

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