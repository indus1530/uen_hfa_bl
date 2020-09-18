package edu.aku.abdulsajid.uen_hfa_bl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

import data.LocalDataManager;
import data.col_R;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_R extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region LineraLayout

    LinearLayout
            lv_R1,
            lv_R2,
            lv_R3,
            lv_R4,
            lv_R5,
            lv_R6,
            lv_R7,
            lv_R8,
            lv_R9,
            lv_R10,
            lv_R11,
            lv_R12,
            lv_R13,
            lv_R14;


    //endregion

    //region Radiobutton

    RadioButton
            R_R1_yes,
            R_R1_No,
            R_R2_yes,
            R_R2_No,
            R_R3_yes,
            R_R3_No,
            R_R4_yes,
            R_R4_No,

    R_R5_1,
            R_R5_2,
            R_R5_3,
            R_R5_4,
            R_R5_5,
            R_R5_6,
            R_R5_7,
            R_R5_8,
            R_R6_yes,
            R_R6_No,
            R_R7_1,
            R_R7_2,
            R_R7_3,
            R_R8_yes,
            R_R8_No,
            R_R9_yes,
            R_R9_No,
            R_R10_yes,
            R_R10_No,
            R_R11_yes,
            R_R11_No,
            R_R12_yes,
            R_R12_No,
            R_R13_1,
            R_R13_2,
            R_R13_3,
            R_R13_4,
            R_R14_1,
            R_R14_2,
            R_R14_3;

    //endregion


    //String to hold values
    String
            R1,
            R2,
            R3,
            R4,
            R5,
            R6,
            R7,
            R8,
            R9,
            R10,
            R11,
            R12,
            R13,
            R14,
            R15;


    //region EditText

    EditText

            ET_R5_8,
            ed_R15;


    //endregion
    Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(800); // As I am using LENGTH_LONG in Toast
                // Your_Activity.this.finish();


                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                // getActivity().finish();

                System.exit(0);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private OnFragmentInteractionListener mListener;

    public Fragment_R() {
    }

    public static Fragment_R newInstance(String param1, String param2) {
        Fragment_R fragment = new Fragment_R();

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


        View v = inflater.inflate(R.layout.fragment_r, container, false);


        initalizerEditextview(v);
        initalizeRadioButton(v);
        initializLinerlayout(v);

        R_R4_yes.setOnCheckedChangeListener(this);
        R_R4_No.setOnCheckedChangeListener(this);

        R_R6_yes.setOnCheckedChangeListener(this);
        R_R6_No.setOnCheckedChangeListener(this);

        R_R5_1.setOnCheckedChangeListener(this);
        R_R5_2.setOnCheckedChangeListener(this);
        R_R5_3.setOnCheckedChangeListener(this);
        R_R5_4.setOnCheckedChangeListener(this);
        R_R5_5.setOnCheckedChangeListener(this);
        R_R5_6.setOnCheckedChangeListener(this);
        R_R5_7.setOnCheckedChangeListener(this);
        R_R5_8.setOnCheckedChangeListener(this);


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                if (Assign_Values() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                updateHFA();
                updatelogtable();

                Toast.makeText(getContext(), "Interivew Has Been Saved ", Toast.LENGTH_LONG).show();


                thread.start();

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

        if (compoundButton.getId() == R.id.R_R4_yes || compoundButton.getId() == R.id.R_R4_No) {

            if (R_R4_No.isChecked()) {

                lv_R5.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_R5);
            } else {
                lv_R5.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.R_R5_1 || compoundButton.getId() == R.id.R_R5_2 ||
                compoundButton.getId() == R.id.R_R5_3 || compoundButton.getId() == R.id.R_R5_4 ||
                compoundButton.getId() == R.id.R_R5_5 || compoundButton.getId() == R.id.R_R5_6 ||
                compoundButton.getId() == R.id.R_R5_7 || compoundButton.getId() == R.id.R_R5_8) {

            if (R_R5_8.isChecked()) {

                ET_R5_8.setVisibility(View.VISIBLE);
            } else {
                ET_R5_8.setVisibility(View.GONE);
                ET_R5_8.setText("");
            }

        }

        if (compoundButton.getId() == R.id.R_R6_yes || compoundButton.getId() == R.id.R_R6_No) {

            if (R_R6_No.isChecked()) {

                lv_R7.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_R7);
            } else {
                lv_R7.setVisibility(View.VISIBLE);
            }

        }


    }

    void initializLinerlayout(View v) {
        lv_R1 = (LinearLayout) v.findViewById(R.id.lv_R1);
        lv_R2 = (LinearLayout) v.findViewById(R.id.lv_R2);
        lv_R3 = (LinearLayout) v.findViewById(R.id.lv_R3);
        lv_R4 = (LinearLayout) v.findViewById(R.id.lv_R4);
        lv_R5 = (LinearLayout) v.findViewById(R.id.lv_R5);
        lv_R6 = (LinearLayout) v.findViewById(R.id.lv_R6);
        lv_R7 = (LinearLayout) v.findViewById(R.id.lv_R7);
        lv_R8 = (LinearLayout) v.findViewById(R.id.lv_R8);
        lv_R9 = (LinearLayout) v.findViewById(R.id.lv_R9);
        lv_R10 = (LinearLayout) v.findViewById(R.id.lv_R10);
        lv_R11 = (LinearLayout) v.findViewById(R.id.lv_R11);
        lv_R12 = (LinearLayout) v.findViewById(R.id.lv_R12);
        lv_R13 = (LinearLayout) v.findViewById(R.id.lv_R13);
        lv_R14 = (LinearLayout) v.findViewById(R.id.lv_R14);

    }

    void initalizeRadioButton(View v) {

        R_R1_yes = (RadioButton) v.findViewById(R.id.R_R1_yes);
        R_R1_No = (RadioButton) v.findViewById(R.id.R_R1_No);
        R_R2_yes = (RadioButton) v.findViewById(R.id.R_R2_yes);
        R_R2_No = (RadioButton) v.findViewById(R.id.R_R2_No);
        R_R3_yes = (RadioButton) v.findViewById(R.id.R_R3_yes);
        R_R3_No = (RadioButton) v.findViewById(R.id.R_R3_No);
        R_R4_yes = (RadioButton) v.findViewById(R.id.R_R4_yes);
        R_R4_No = (RadioButton) v.findViewById(R.id.R_R4_No);


        R_R5_1 = (RadioButton) v.findViewById(R.id.R_R5_1);
        R_R5_2 = (RadioButton) v.findViewById(R.id.R_R5_2);
        R_R5_3 = (RadioButton) v.findViewById(R.id.R_R5_3);
        R_R5_4 = (RadioButton) v.findViewById(R.id.R_R5_4);
        R_R5_5 = (RadioButton) v.findViewById(R.id.R_R5_5);
        R_R5_6 = (RadioButton) v.findViewById(R.id.R_R5_6);
        R_R5_7 = (RadioButton) v.findViewById(R.id.R_R5_7);
        R_R5_8 = (RadioButton) v.findViewById(R.id.R_R5_8);

        R_R6_yes = (RadioButton) v.findViewById(R.id.R_R6_yes);
        R_R6_No = (RadioButton) v.findViewById(R.id.R_R6_No);
        R_R7_1 = (RadioButton) v.findViewById(R.id.R_R7_1);
        R_R7_2 = (RadioButton) v.findViewById(R.id.R_R7_2);
        R_R7_3 = (RadioButton) v.findViewById(R.id.R_R7_3);
        R_R8_yes = (RadioButton) v.findViewById(R.id.R_R8_yes);
        R_R8_No = (RadioButton) v.findViewById(R.id.R_R8_No);
        R_R9_yes = (RadioButton) v.findViewById(R.id.R_R9_yes);
        R_R9_No = (RadioButton) v.findViewById(R.id.R_R9_No);
        R_R10_yes = (RadioButton) v.findViewById(R.id.R_R10_yes);
        R_R10_No = (RadioButton) v.findViewById(R.id.R_R10_No);
        R_R11_yes = (RadioButton) v.findViewById(R.id.R_R11_yes);
        R_R11_No = (RadioButton) v.findViewById(R.id.R_R11_No);
        R_R12_yes = (RadioButton) v.findViewById(R.id.R_R12_yes);
        R_R12_No = (RadioButton) v.findViewById(R.id.R_R12_No);
        R_R13_1 = (RadioButton) v.findViewById(R.id.R_R13_1);
        R_R13_2 = (RadioButton) v.findViewById(R.id.R_R13_2);
        R_R13_3 = (RadioButton) v.findViewById(R.id.R_R13_3);
        R_R13_4 = (RadioButton) v.findViewById(R.id.R_R13_4);
        R_R14_1 = (RadioButton) v.findViewById(R.id.R_R14_1);
        R_R14_2 = (RadioButton) v.findViewById(R.id.R_R14_2);
        R_R14_3 = (RadioButton) v.findViewById(R.id.R_R14_3);

    }

    void initalizerEditextview(View v) {
        ET_R5_8 = (EditText) v.findViewById(R.id.ET_R5_8);
        ed_R15 = (EditText) v.findViewById(R.id.ed_R15);
    }

    Boolean Assign_Values() {
        if (R_R1_yes.isChecked()) {
            R1 = "1";
        } else if (R_R1_No.isChecked()) {
            R1 = "2";
        } else {
            R1 = "999";
        }

        if (R_R2_yes.isChecked()) {
            R2 = "1";
        } else if (R_R2_No.isChecked()) {
            R2 = "2";
        } else {
            R2 = "999";
        }

        if (R_R3_yes.isChecked()) {
            R3 = "1";
        } else if (R_R3_No.isChecked()) {
            R3 = "2";
        } else {
            R3 = "999";
        }

        if (R_R4_yes.isChecked()) {
            R4 = "1";
        } else if (R_R4_No.isChecked()) {
            R4 = "2";
        } else {
            R4 = "999";
        }

        if (R_R5_1.isChecked()) {
            R5 = "1";
        } else if (R_R5_2.isChecked()) {
            R5 = "2";
        } else if (R_R5_3.isChecked()) {
            R5 = "3";
        } else if (R_R5_4.isChecked()) {
            R5 = "4";
        } else if (R_R5_5.isChecked()) {
            R5 = "5";
        } else if (R_R5_6.isChecked()) {
            R5 = "6";
        } else if (R_R5_7.isChecked()) {
            R5 = "7";
        } else if (R_R5_8.isChecked()) {

            if (ET_R5_8.getText().toString().trim().length() > 0) {
                R5 = ET_R5_8.getText().toString().trim();
                ET_R5_8.setError(null);
            } else {
                ET_R5_8.setError("Enter Text");
                ET_R5_8.requestFocus();
                return false;
            }
        } else {
            R5 = "999";
        }

        if (R_R6_yes.isChecked()) {
            R6 = "1";
        } else if (R_R6_No.isChecked()) {
            R6 = "2";
        } else {
            R6 = "999";
        }

        if (R_R7_1.isChecked()) {
            R7 = "1";
        } else if (R_R7_2.isChecked()) {
            R7 = "2";
        } else if (R_R7_3.isChecked()) {
            R7 = "3";
        } else {
            R7 = "999";
        }

        if (R_R8_yes.isChecked()) {
            R8 = "1";
        } else if (R_R8_No.isChecked()) {
            R8 = "2";
        } else {
            R8 = "999";
        }

        if (R_R9_yes.isChecked()) {
            R9 = "1";
        } else if (R_R9_No.isChecked()) {
            R9 = "2";
        } else {
            R9 = "999";
        }

        if (R_R10_yes.isChecked()) {
            R10 = "1";
        } else if (R_R10_No.isChecked()) {
            R10 = "2";
        } else {
            R10 = "999";
        }

        if (R_R11_yes.isChecked()) {
            R11 = "1";
        } else if (R_R11_No.isChecked()) {
            R11 = "2";
        } else {
            R11 = "999";
        }

        if (R_R12_yes.isChecked()) {
            R12 = "1";
        } else if (R_R12_No.isChecked()) {
            R12 = "2";
        } else {
            R12 = "999";
        }

        if (R_R13_1.isChecked()) {
            R13 = "1";
        } else if (R_R13_2.isChecked()) {
            R13 = "2";
        } else if (R_R13_3.isChecked()) {
            R13 = "3";
        } else if (R_R13_4.isChecked()) {
            R13 = "4";
        } else {
            R13 = "999";
        }

        if (R_R14_1.isChecked()) {
            R14 = "1";
        } else if (R_R14_2.isChecked()) {
            R14 = "2";
        } else if (R_R14_3.isChecked()) {
            R14 = "3";
        } else {
            R14 = "999";
        }

        if (ed_R15.getText().toString().trim().length() > 0) {
            R15 = ed_R15.getText().toString().trim();
        } else {
            R15 = "999";
        }

        return true;
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_R1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_R2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_R9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R12) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_R13) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_R14) != false;
    }

    void updateHFA() {
        String query = "update  hfa set " +

                col_R.R1 + "='" + R1 + "'," +
                col_R.R2 + "='" + R2 + "'," +
                col_R.R3 + "='" + R3 + "'," +
                col_R.R4 + "='" + R4 + "'," +
                col_R.R5 + "='" + R5 + "'," +
                col_R.R6 + "='" + R6 + "'," +
                col_R.R7 + "='" + R7 + "'," +
                col_R.R8 + "='" + R8 + "'," +
                col_R.R9 + "='" + R9 + "'," +
                col_R.R10 + "='" + R10 + "'," +
                col_R.R11 + "='" + R11 + "'," +
                col_R.R12 + "='" + R12 + "'," +
                col_R.R13 + "='" + R13 + "'," +
                col_R.R14 + "='" + R14 + "'," +
                col_R.R15 + "='" + R15 + "'" +
                " Where id=" + Validation.HFAPK;

        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();


    }

    void updatelogtable() {

        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

        String Query = "update tbllog set " +
                "Interview_status='1'," +
                "Interview_end_time='" + currentDateTimeString + "'" +
                " where hfa_id=" + Validation.HFAPK;


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(Query);

        Toast.makeText(getActivity(), "Data inserted Into Log successfully", Toast.LENGTH_SHORT).show();

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    // Function End


}
