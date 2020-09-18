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
import data.col_F;
import utils.Gothrough;
import utils.Validation;


public class Fragment_F extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Checkbox
    CheckBox
            C_F1_1,
            C_F1_2,
            C_F1_3,
            C_F1_4,
            C_F1_5,
            C_F1_6,
            C_F1_7,
            C_F1_8,
            C_F1_9,
            C_F1_10,
            C_F1_11,
            C_F1_12,
            C_F1_13,
            C_F1_14,
            C_F1_15,
            C_F1_16,
            C_F1_17,
            C_F1_18,
            C_F1_19,
            C_F1_20,
            C_F1_21,
            C_F1_22,
            C_F1_23,
            C_F1_24,
            C_F1_25,

    C_F2_1,
            C_F2_2,
            C_F2_3,
            C_F2_4,
            C_F2_5,
            C_F2_6,
            C_F2_7,
            C_F2_8,
            C_F2_9,
            C_F2_10,
            C_F2_11,
            C_F2_12,
            C_F2_13,
            C_F2_14,
            C_F2_15,

    C_F3_1,
            C_F3_2,
            C_F3_3,
            C_F3_4,
            C_F3_5,
            C_F3_6,
            C_F3_7,
            C_F3_8,
            C_F3_9,
            C_F3_10,
            C_F3_11,
            C_F3_12,
            C_F3_13,
            C_F3_14;


//endregion

    //region LinerLayout


    LinearLayout lv_F1, lv_F2, lv_F3;

    //endregion

    //region String


    String
            F1_1,
            F1_2,
            F1_3,
            F1_4,
            F1_5,
            F1_6,
            F1_7,
            F1_8,
            F1_9,
            F1_10,
            F1_11,
            F1_12,
            F1_13,
            F1_14,
            F1_15,
            F1_16,
            F1_17,
            F1_18,
            F1_19,
            F1_20,
            F1_21,
            F1_22,
            F1_23,
            F1_24,
            F1_25,
            F2_1,
            F2_2,
            F2_3,
            F2_4,
            F2_5,
            F2_6,
            F2_7,
            F2_8,
            F2_9,
            F2_10,
            F2_11,
            F2_12,
            F2_13,
            F2_14,
            F2_15,
            F3_1,
            F3_2,
            F3_3,
            F3_4,
            F3_5,
            F3_6,
            F3_7,
            F3_8,
            F3_9,
            F3_10,
            F3_11,
            F3_12,
            F3_13,
            F3_14;
    //endregion


    private OnFragmentInteractionListener mListener;

    public Fragment_F() {
    }

    public static Fragment_F newInstance(String param1, String param2) {
        Fragment_F fragment = new Fragment_F();

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


        View v = inflater.inflate(R.layout.fragment_f, container, false);


        initalizeChekcbox(v);
        initlizeLinerlayout(v);

        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // Marke F1_4,F1_5 for G section Use


                if (C_F1_4.isChecked()) {
                    Validation.F1_4_ischekd = "true";
                } else {
                    Validation.F1_4_ischekd = "false";
                }

                if (C_F1_5.isChecked()) {
                    Validation.F1_5_ischekd = "true";
                } else {
                    Validation.F1_5_ischekd = "false";
                }


                if (C_F1_6.isChecked()) {
                    Validation.F1_6_ischekd = "true";
                } else {
                    Validation.F1_6_ischekd = "false";
                }

                if (C_F1_15.isChecked()) {
                    Validation.F1_15_ischekd = "true";
                } else {
                    Validation.F1_15_ischekd = "false";
                }


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }
                Asignvalues();
                updateHFA();
                LogtableUpdates.UpdateLogSection(getContext(), "F", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_G fragment = new Fragment_G();
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

        switch (compoundButton.getId()) {


        }
    }

    void initalizeChekcbox(View v) {
        C_F1_1 = (CheckBox) v.findViewById(R.id.C_F1_1);
        C_F1_2 = (CheckBox) v.findViewById(R.id.C_F1_2);
        C_F1_3 = (CheckBox) v.findViewById(R.id.C_F1_3);
        C_F1_4 = (CheckBox) v.findViewById(R.id.C_F1_4);
        C_F1_5 = (CheckBox) v.findViewById(R.id.C_F1_5);
        C_F1_6 = (CheckBox) v.findViewById(R.id.C_F1_6);
        C_F1_7 = (CheckBox) v.findViewById(R.id.C_F1_7);
        C_F1_8 = (CheckBox) v.findViewById(R.id.C_F1_8);
        C_F1_9 = (CheckBox) v.findViewById(R.id.C_F1_9);
        C_F1_10 = (CheckBox) v.findViewById(R.id.C_F1_10);
        C_F1_11 = (CheckBox) v.findViewById(R.id.C_F1_11);
        C_F1_12 = (CheckBox) v.findViewById(R.id.C_F1_12);
        C_F1_13 = (CheckBox) v.findViewById(R.id.C_F1_13);
        C_F1_14 = (CheckBox) v.findViewById(R.id.C_F1_14);
        C_F1_15 = (CheckBox) v.findViewById(R.id.C_F1_15);
        C_F1_16 = (CheckBox) v.findViewById(R.id.C_F1_16);
        C_F1_17 = (CheckBox) v.findViewById(R.id.C_F1_17);
        C_F1_18 = (CheckBox) v.findViewById(R.id.C_F1_18);
        C_F1_19 = (CheckBox) v.findViewById(R.id.C_F1_19);
        C_F1_20 = (CheckBox) v.findViewById(R.id.C_F1_20);
        C_F1_21 = (CheckBox) v.findViewById(R.id.C_F1_21);
        C_F1_22 = (CheckBox) v.findViewById(R.id.C_F1_22);
        C_F1_23 = (CheckBox) v.findViewById(R.id.C_F1_23);
        C_F1_24 = (CheckBox) v.findViewById(R.id.C_F1_24);
        C_F1_25 = (CheckBox) v.findViewById(R.id.C_F1_25);
        C_F2_1 = (CheckBox) v.findViewById(R.id.C_F2_1);
        C_F2_2 = (CheckBox) v.findViewById(R.id.C_F2_2);
        C_F2_3 = (CheckBox) v.findViewById(R.id.C_F2_3);
        C_F2_4 = (CheckBox) v.findViewById(R.id.C_F2_4);
        C_F2_5 = (CheckBox) v.findViewById(R.id.C_F2_5);
        C_F2_6 = (CheckBox) v.findViewById(R.id.C_F2_6);
        C_F2_7 = (CheckBox) v.findViewById(R.id.C_F2_7);
        C_F2_8 = (CheckBox) v.findViewById(R.id.C_F2_8);
        C_F2_9 = (CheckBox) v.findViewById(R.id.C_F2_9);
        C_F2_10 = (CheckBox) v.findViewById(R.id.C_F2_10);
        C_F2_11 = (CheckBox) v.findViewById(R.id.C_F2_11);
        C_F2_12 = (CheckBox) v.findViewById(R.id.C_F2_12);
        C_F2_13 = (CheckBox) v.findViewById(R.id.C_F2_13);
        C_F2_14 = (CheckBox) v.findViewById(R.id.C_F2_14);
        C_F2_15 = (CheckBox) v.findViewById(R.id.C_F2_15);
        C_F3_1 = (CheckBox) v.findViewById(R.id.C_F3_1);
        C_F3_2 = (CheckBox) v.findViewById(R.id.C_F3_2);
        C_F3_3 = (CheckBox) v.findViewById(R.id.C_F3_3);
        C_F3_4 = (CheckBox) v.findViewById(R.id.C_F3_4);
        C_F3_5 = (CheckBox) v.findViewById(R.id.C_F3_5);
        C_F3_6 = (CheckBox) v.findViewById(R.id.C_F3_6);
        C_F3_7 = (CheckBox) v.findViewById(R.id.C_F3_7);
        C_F3_8 = (CheckBox) v.findViewById(R.id.C_F3_8);
        C_F3_9 = (CheckBox) v.findViewById(R.id.C_F3_9);
        C_F3_10 = (CheckBox) v.findViewById(R.id.C_F3_10);
        C_F3_11 = (CheckBox) v.findViewById(R.id.C_F3_11);
        C_F3_12 = (CheckBox) v.findViewById(R.id.C_F3_12);
        C_F3_13 = (CheckBox) v.findViewById(R.id.C_F3_13);
        C_F3_14 = (CheckBox) v.findViewById(R.id.C_F3_14);
    }

    void initlizeLinerlayout(View v) {
        lv_F1 = (LinearLayout) v.findViewById(R.id.lv_f1);
        lv_F2 = (LinearLayout) v.findViewById(R.id.lv_f2);
        lv_F3 = (LinearLayout) v.findViewById(R.id.lv_f3);
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_F1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_F2) == false) {
            //return false;
        }
        if (Gothrough.IamHiden(lv_F3) == false) {
            //   return false;
        }

        return true;
    }

    public void Asignvalues() {
        if (C_F1_1.isChecked()) {
            F1_1 = "1";
        } else {
            F1_1 = "999";
        }
        if (C_F1_2.isChecked()) {
            F1_2 = "1";
        } else {
            F1_2 = "999";
        }
        if (C_F1_3.isChecked()) {
            F1_3 = "1";
        } else {
            F1_3 = "999";
        }
        if (C_F1_4.isChecked()) {
            F1_4 = "1";
        } else {
            F1_4 = "999";
        }
        if (C_F1_5.isChecked()) {
            F1_5 = "1";
        } else {
            F1_5 = "999";
        }
        if (C_F1_6.isChecked()) {
            F1_6 = "1";
        } else {
            F1_6 = "999";
        }
        if (C_F1_7.isChecked()) {
            F1_7 = "1";
        } else {
            F1_7 = "999";
        }
        if (C_F1_8.isChecked()) {
            F1_8 = "1";
        } else {
            F1_8 = "999";
        }
        if (C_F1_9.isChecked()) {
            F1_9 = "1";
        } else {
            F1_9 = "999";
        }
        if (C_F1_10.isChecked()) {
            F1_10 = "1";
        } else {
            F1_10 = "999";
        }
        if (C_F1_11.isChecked()) {
            F1_11 = "1";
        } else {
            F1_11 = "999";
        }

        if (C_F1_12.isChecked()) {
            F1_12 = "1";
        } else {
            F1_12 = "999";
        }


        if (C_F1_13.isChecked()) {
            F1_13 = "1";
        } else {
            F1_13 = "999";
        }


        if (C_F1_14.isChecked()) {
            F1_14 = "1";
        } else {
            F1_14 = "999";
        }

        if (C_F1_15.isChecked()) {
            F1_15 = "1";
        } else {
            F1_15 = "999";
        }

        if (C_F1_16.isChecked()) {
            F1_16 = "1";
        } else {
            F1_16 = "999";
        }

        if (C_F1_17.isChecked()) {
            F1_17 = "1";
        } else {
            F1_17 = "999";
        }

        if (C_F1_18.isChecked()) {
            F1_18 = "1";
        } else {
            F1_18 = "999";
        }

        if (C_F1_19.isChecked()) {
            F1_19 = "1";
        } else {
            F1_19 = "999";
        }

        if (C_F1_20.isChecked()) {
            F1_20 = "1";
        } else {
            F1_20 = "999";
        }


        if (C_F1_21.isChecked()) {
            F1_21 = "1";
        } else {
            F1_21 = "999";
        }

        if (C_F1_22.isChecked()) {
            F1_22 = "1";
        } else {
            F1_22 = "999";
        }

        if (C_F1_23.isChecked()) {
            F1_23 = "1";
        } else {
            F1_23 = "999";
        }

        if (C_F1_24.isChecked()) {
            F1_24 = "1";
        } else {
            F1_24 = "999";
        }

        if (C_F1_25.isChecked()) {
            F1_25 = "1";
        } else {
            F1_25 = "999";
        }

        if (C_F2_1.isChecked()) {
            F2_1 = "1";
        } else {
            F2_1 = "999";
        }
        if (C_F2_2.isChecked()) {
            F2_2 = "1";
        } else {
            F2_2 = "999";
        }
        if (C_F2_3.isChecked()) {
            F2_3 = "1";
        } else {
            F2_3 = "999";
        }
        if (C_F2_4.isChecked()) {
            F2_4 = "1";
        } else {
            F2_4 = "999";
        }
        if (C_F2_5.isChecked()) {
            F2_5 = "1";
        } else {
            F2_5 = "999";
        }
        if (C_F2_6.isChecked()) {
            F2_6 = "1";
        } else {
            F2_6 = "999";
        }
        if (C_F2_7.isChecked()) {
            F2_7 = "1";
        } else {
            F2_7 = "999";
        }
        if (C_F2_8.isChecked()) {
            F2_8 = "1";
        } else {
            F2_8 = "999";
        }
        if (C_F2_9.isChecked()) {
            F2_9 = "1";
        } else {
            F2_9 = "999";
        }
        if (C_F2_10.isChecked()) {
            F2_10 = "1";
        } else {
            F2_10 = "999";
        }
        if (C_F2_11.isChecked()) {
            F2_11 = "1";
        } else {
            F2_11 = "999";
        }

        if (C_F2_12.isChecked()) {
            F2_12 = "1";
        } else {
            F2_12 = "999";
        }


        if (C_F2_13.isChecked()) {
            F2_13 = "1";
        } else {
            F2_13 = "999";
        }


        if (C_F2_14.isChecked()) {
            F2_14 = "1";
        } else {
            F2_14 = "999";
        }

        if (C_F2_15.isChecked()) {
            F2_15 = "1";
        } else {
            F2_15 = "999";
        }

        if (C_F3_1.isChecked()) {
            F3_1 = "1";
        } else {
            F3_1 = "999";
        }
        if (C_F3_2.isChecked()) {
            F3_2 = "1";
        } else {
            F3_2 = "999";
        }
        if (C_F3_3.isChecked()) {
            F3_3 = "1";
        } else {
            F3_3 = "999";
        }
        if (C_F3_4.isChecked()) {
            F3_4 = "1";
        } else {
            F3_4 = "999";
        }
        if (C_F3_5.isChecked()) {
            F3_5 = "1";
        } else {
            F3_5 = "999";
        }
        if (C_F3_6.isChecked()) {
            F3_6 = "1";
        } else {
            F3_6 = "999";
        }
        if (C_F3_7.isChecked()) {
            F3_7 = "1";
        } else {
            F3_7 = "999";
        }
        if (C_F3_8.isChecked()) {
            F3_8 = "1";
        } else {
            F3_8 = "999";
        }
        if (C_F3_9.isChecked()) {
            F3_9 = "1";
        } else {
            F3_9 = "999";
        }
        if (C_F3_10.isChecked()) {
            F3_10 = "1";
        } else {
            F3_10 = "999";
        }
        if (C_F3_11.isChecked()) {
            F3_11 = "1";
        } else {
            F3_11 = "999";
        }

        if (C_F3_12.isChecked()) {
            F3_12 = "1";
        } else {
            F3_12 = "999";
        }


        if (C_F3_13.isChecked()) {
            F3_13 = "1";
        } else {
            F3_13 = "999";
        }


        if (C_F3_14.isChecked()) {
            F3_14 = "1";
        } else {
            F3_14 = "999";
        }


    }

    void updateHFA() {
        String query = "update  hfa set " +
                col_F.F1_1 + "='" + F1_1 + "'," +
                col_F.F1_2 + "='" + F1_2 + "'," +
                col_F.F1_3 + "='" + F1_3 + "'," +
                col_F.F1_4 + "='" + F1_4 + "'," +
                col_F.F1_5 + "='" + F1_5 + "'," +
                col_F.F1_6 + "='" + F1_6 + "'," +
                col_F.F1_7 + "='" + F1_7 + "'," +
                col_F.F1_8 + "='" + F1_8 + "'," +
                col_F.F1_9 + "='" + F1_9 + "'," +
                col_F.F1_10 + "='" + F1_10 + "'," +
                col_F.F1_11 + "='" + F1_11 + "'," +
                col_F.F1_12 + "='" + F1_12 + "'," +
                col_F.F1_13 + "='" + F1_13 + "'," +
                col_F.F1_14 + "='" + F1_14 + "'," +
                col_F.F1_15 + "='" + F1_15 + "'," +
                col_F.F1_16 + "='" + F1_16 + "'," +
                col_F.F1_17 + "='" + F1_17 + "'," +
                col_F.F1_18 + "='" + F1_18 + "'," +
                col_F.F1_19 + "='" + F1_19 + "'," +
                col_F.F1_20 + "='" + F1_20 + "'," +
                col_F.F1_21 + "='" + F1_21 + "'," +
                col_F.F1_22 + "='" + F1_22 + "'," +
                col_F.F1_23 + "='" + F1_23 + "'," +
                col_F.F1_24 + "='" + F1_24 + "'," +
                col_F.F1_25 + "='" + F1_25 + "'," +
                col_F.F2_1 + "='" + F2_1 + "'," +
                col_F.F2_2 + "='" + F2_2 + "'," +
                col_F.F2_3 + "='" + F2_3 + "'," +
                col_F.F2_4 + "='" + F2_4 + "'," +
                col_F.F2_5 + "='" + F2_5 + "'," +
                col_F.F2_6 + "='" + F2_6 + "'," +
                col_F.F2_7 + "='" + F2_7 + "'," +
                col_F.F2_8 + "='" + F2_8 + "'," +
                col_F.F2_9 + "='" + F2_9 + "'," +
                col_F.F2_10 + "='" + F2_10 + "'," +
                col_F.F2_11 + "='" + F2_11 + "'," +
                col_F.F2_12 + "='" + F2_12 + "'," +
                col_F.F2_13 + "='" + F2_13 + "'," +
                col_F.F2_14 + "='" + F2_14 + "'," +
                col_F.F2_15 + "='" + F2_15 + "'," +
                col_F.F3_1 + "='" + F3_1 + "'," +
                col_F.F3_2 + "='" + F3_2 + "'," +
                col_F.F3_3 + "='" + F3_3 + "'," +
                col_F.F3_4 + "='" + F3_4 + "'," +
                col_F.F3_5 + "='" + F3_5 + "'," +
                col_F.F3_6 + "='" + F3_6 + "'," +
                col_F.F3_7 + "='" + F3_7 + "'," +
                col_F.F3_8 + "='" + F3_8 + "'," +
                col_F.F3_9 + "='" + F3_9 + "'," +
                col_F.F3_10 + "='" + F3_10 + "'," +
                col_F.F3_11 + "='" + F3_11 + "'," +
                col_F.F3_12 + "='" + F3_12 + "'," +
                col_F.F3_13 + "='" + F3_13 + "'," +
                col_F.F3_14 + "='" + F3_14 + "'" +
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
