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
import data.col_K;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.Validation;


public class Fragment_K extends Fragment implements RadioButton.OnCheckedChangeListener {

    // region RadioButton

    RadioButton

            R_K1_yes,
            R_K1_no,
            R_K2_1,
            R_K2_2,
            R_K2_3,
            R_K2_4,
            R_K3_yes,
            R_K3_no,
            R_K5_yes,
            R_K5_no;

    //endregion

    //region Checkbox

    CheckBox
            C_K4_1,
            C_K4_2,
            C_K4_3,
            C_K4_4,
            C_K4_5,
            C_K4_6;

    //endregion

    //region Editextview

    EditText
            Et_K4_7;


    //endregion

    //region LinearLayout

    LinearLayout
            lv_K1,
            lv_K2,
            lv_K3;


    //endregion


    //region String

    String

            K1,
            K2,
            K3;


    //endergion

    private OnFragmentInteractionListener mListener;

    public Fragment_K() {
    }

    public static Fragment_K newInstance(String param1, String param2) {
        Fragment_K fragment = new Fragment_K();

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


        View v = inflater.inflate(R.layout.fragment_k, container, false);


        initalizeLinearLayout(v);
        initalizRadiobuttonn(v);

        initalizeLinearLayout(v);

        R_K1_yes.setOnCheckedChangeListener(this);
        R_K1_no.setOnCheckedChangeListener(this);

        R_K3_yes.setOnCheckedChangeListener(this);
        R_K3_no.setOnCheckedChangeListener(this);

        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_L fragment = new Fragment_L();
                ftu.replace(R.id.frag_container, fragment).commit();


*/

                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                if (Asignvalues() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "K", Validation.A1);


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_L fragment = new Fragment_L();
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

        if (compoundButton.getId() == R.id.R_K1_yes || compoundButton.getId() == R.id.R_K1_no) {

            if (R_K1_yes.isChecked()) {
                lv_K2.setVisibility(View.VISIBLE);
                lv_K3.setVisibility(View.VISIBLE);
            } else {
                lv_K2.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_K2);

                lv_K3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_K3);
            }

        }


    }

    void initalizRadiobuttonn(View v) {

        R_K1_yes = (RadioButton) v.findViewById(R.id.R_K1_yes);
        R_K1_no = (RadioButton) v.findViewById(R.id.R_K1_no);
        R_K2_1 = (RadioButton) v.findViewById(R.id.R_K2_1);
        R_K2_2 = (RadioButton) v.findViewById(R.id.R_K2_2);
        R_K2_3 = (RadioButton) v.findViewById(R.id.R_K2_3);
        R_K2_4 = (RadioButton) v.findViewById(R.id.R_K2_4);
        R_K3_yes = (RadioButton) v.findViewById(R.id.R_K3_yes);
        R_K3_no = (RadioButton) v.findViewById(R.id.R_K3_no);


    }

    void initalizeLinearLayout(View v) {
        lv_K1 = (LinearLayout) v.findViewById(R.id.lv_K1);
        lv_K2 = (LinearLayout) v.findViewById(R.id.lv_K2);
        lv_K3 = (LinearLayout) v.findViewById(R.id.lv_K3);

    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_K1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_K2) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_K3) != false;

    }

    public boolean Asignvalues() {


        if (R_K1_yes.isChecked()) {
            K1 = "1";
        } else if (R_K1_no.isChecked()) {
            K1 = "2";
        } else {
            K1 = "999";
        }

        if (R_K2_1.isChecked()) {
            K2 = "1";
        } else if (R_K2_2.isChecked()) {
            K2 = "2";
        } else if (R_K2_3.isChecked()) {
            K2 = "3";
        } else if (R_K2_4.isChecked()) {
            K2 = "4";
        } else {
            K2 = "999";
        }


        if (R_K3_yes.isChecked()) {
            K3 = "1";
        } else if (R_K3_no.isChecked()) {
            K3 = "2";
        } else {
            K3 = "999";
        }

        return true;
    }

    boolean updateHFA() {
        String query = "update  hfa set " +

                col_K.K1 + "='" + K1 + "'," +
                col_K.K2 + "='" + K2 + "'," +
                col_K.K3 + "='" + K3 + "'" +
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
