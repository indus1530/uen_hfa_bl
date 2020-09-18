package edu.aku.abdulsajid.uen_hfa_bl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.InputFilter;
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
import data.col_A;
import data.col_B;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;
import utils.Validation;


public class Fragment_B extends Fragment implements RadioButton.OnCheckedChangeListener {

    String query;
// Declare Linerlayout

    //region Declare Linearlayout
    LinearLayout
            lv_b1,
            lv_b2,
            lv_b3,
            lv_b4,
            lv_b5,
            lv_b6,
            lv_b7,
            lv_b7_1,
            lv_b7_2,
            lv_b7_3,
            lv_b7_4;
    //endregion


    // Declare Radio Buttion


    //region Radio Button Decleation


    RadioButton
            rb_b1_yes,
            rb_b1_no,
            R_B3_1,
            R_B3_2,
            rb_B7_1_1,
            rb_B7_1_2,
            rb_B7_1_3,
            rb_B7_1_4,
            rb_B7_1_5,
            rb_B7_1_6,
            rb_B7_1_7,
            rb_B7_1_8,
            rb_B7_2_1,
            rb_B7_2_2,
            rb_B7_2_3,
            rb_B7_2_4,
            rb_B7_2_5,
            rb_B7_2_6,
            rb_B7_2_7,
            rb_B7_2_8,
            rb_B7_3_1,
            rb_B7_3_2,
            rb_B7_3_3,
            rb_B7_3_4,
            rb_B7_3_5,
            rb_B7_3_6,
            rb_B7_3_7,
            rb_B7_3_8,
            rb_B7_4_1,
            rb_B7_4_2,
            rb_B7_4_3,
            rb_B7_4_4,
            rb_B7_4_5,
            rb_B7_4_6,
            rb_B7_4_7,
            rb_B7_4_8;


    //endregion

    //Declare Checkbox

    //region   checkbooxxx

    CheckBox
            C_B6_1,
            C_B6_2,
            C_B6_3,
            C_B6_4;

    //endregion


    //region Editetextview


    EditText
            ed_b2,
            ed_B4,
            ed_B5,

    ed_B7_1_8,
            ed_B7_2_8,
            ed_B7_3_8,
            ed_B7_4_8;


    //endregion


    String
            B1,
            B2,
            B3,
            B4,
            B5,
            B6_1,
            B6_2,
            B6_3,
            B6_4,
            B7_1,
            B7_2,
            B7_3,
            B7_4;


    private OnFragmentInteractionListener mListener;

    public Fragment_B() {
    }

    public static Fragment_B newInstance(String param1, String param2) {
        Fragment_B fragment = new Fragment_B();

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


        View v = inflater.inflate(R.layout.fragment_b, container, false);


        initalizeLinerlayout(v);
        intializerRadiobutton(v);
        intializerChecbkox(v);
        initializerEditexview(v);

        rb_b1_no.setOnCheckedChangeListener(this);
        rb_b1_yes.setOnCheckedChangeListener(this);

        C_B6_1.setOnCheckedChangeListener(this);
        C_B6_2.setOnCheckedChangeListener(this);
        C_B6_3.setOnCheckedChangeListener(this);
        C_B6_4.setOnCheckedChangeListener(this);

        rb_B7_1_1.setOnCheckedChangeListener(this);
        rb_B7_1_2.setOnCheckedChangeListener(this);
        rb_B7_1_3.setOnCheckedChangeListener(this);
        rb_B7_1_4.setOnCheckedChangeListener(this);
        rb_B7_1_5.setOnCheckedChangeListener(this);
        rb_B7_1_6.setOnCheckedChangeListener(this);
        rb_B7_1_7.setOnCheckedChangeListener(this);
        rb_B7_1_8.setOnCheckedChangeListener(this);
        rb_B7_2_1.setOnCheckedChangeListener(this);
        rb_B7_2_2.setOnCheckedChangeListener(this);
        rb_B7_2_3.setOnCheckedChangeListener(this);
        rb_B7_2_4.setOnCheckedChangeListener(this);
        rb_B7_2_5.setOnCheckedChangeListener(this);
        rb_B7_2_6.setOnCheckedChangeListener(this);
        rb_B7_2_7.setOnCheckedChangeListener(this);
        rb_B7_2_8.setOnCheckedChangeListener(this);
        rb_B7_3_1.setOnCheckedChangeListener(this);
        rb_B7_3_2.setOnCheckedChangeListener(this);
        rb_B7_3_3.setOnCheckedChangeListener(this);
        rb_B7_3_4.setOnCheckedChangeListener(this);
        rb_B7_3_5.setOnCheckedChangeListener(this);
        rb_B7_3_6.setOnCheckedChangeListener(this);
        rb_B7_3_7.setOnCheckedChangeListener(this);
        rb_B7_3_8.setOnCheckedChangeListener(this);
        rb_B7_4_1.setOnCheckedChangeListener(this);
        rb_B7_4_2.setOnCheckedChangeListener(this);
        rb_B7_4_3.setOnCheckedChangeListener(this);
        rb_B7_4_4.setOnCheckedChangeListener(this);
        rb_B7_4_5.setOnCheckedChangeListener(this);
        rb_B7_4_6.setOnCheckedChangeListener(this);
        rb_B7_4_7.setOnCheckedChangeListener(this);
        rb_B7_4_8.setOnCheckedChangeListener(this);


        ed_B5.setFilters(new InputFilter[]{new InputFilterMinMax("1", "24")});

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
                LogtableUpdates.UpdateLogSection(getContext(), "B", Validation.A1);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ftu = fm.beginTransaction();
                Fragment_C fragment = new Fragment_C();
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

        if (compoundButton.getId() == R.id.rb_b1_yes || compoundButton.getId() == R.id.rb_b1_no) {


            if (rb_b1_no.isChecked()) {
                lv_b2.setVisibility(View.GONE);
                lv_b3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_b2);
                ClearAllcontrol.ClearAll(lv_b3);

            } else {
                lv_b2.setVisibility(View.VISIBLE);
                lv_b3.setVisibility(View.VISIBLE);
            }


        }

        if (compoundButton.getId() == R.id.C_B6_1 || compoundButton.getId() == R.id.C_B6_2 || compoundButton.getId() == R.id.C_B6_3 || compoundButton.getId() == R.id.C_B6_4) {
            if (C_B6_1.isChecked()) {
                lv_b7_1.setVisibility(View.VISIBLE);
            } else {
                lv_b7_1.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_b7_1);
            }
            if (C_B6_2.isChecked()) {
                lv_b7_2.setVisibility(View.VISIBLE);
            } else {
                lv_b7_2.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_b7_2);
            }
            if (C_B6_3.isChecked()) {
                lv_b7_3.setVisibility(View.VISIBLE);
            } else {
                lv_b7_3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_b7_3);
            }
            if (C_B6_4.isChecked()) {
                lv_b7_4.setVisibility(View.VISIBLE);
            } else {
                lv_b7_4.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_b7_4);
            }
        }


        if (compoundButton.getId() == R.id.rb_B7_1_1 || compoundButton.getId() == R.id.rb_B7_1_2 ||
                compoundButton.getId() == R.id.rb_B7_1_3 || compoundButton.getId() == R.id.rb_B7_1_4 ||
                compoundButton.getId() == R.id.rb_B7_1_5 || compoundButton.getId() == R.id.rb_B7_1_6 ||
                compoundButton.getId() == R.id.rb_B7_1_7 || compoundButton.getId() == R.id.rb_B7_1_8 ||

                compoundButton.getId() == R.id.rb_B7_2_1 || compoundButton.getId() == R.id.rb_B7_2_2 ||
                compoundButton.getId() == R.id.rb_B7_2_3 || compoundButton.getId() == R.id.rb_B7_2_4 ||
                compoundButton.getId() == R.id.rb_B7_2_5 || compoundButton.getId() == R.id.rb_B7_2_6 ||
                compoundButton.getId() == R.id.rb_B7_2_7 || compoundButton.getId() == R.id.rb_B7_2_8 ||

                compoundButton.getId() == R.id.rb_B7_3_1 || compoundButton.getId() == R.id.rb_B7_3_2 ||
                compoundButton.getId() == R.id.rb_B7_3_3 || compoundButton.getId() == R.id.rb_B7_3_4 ||
                compoundButton.getId() == R.id.rb_B7_3_5 || compoundButton.getId() == R.id.rb_B7_3_6 ||
                compoundButton.getId() == R.id.rb_B7_3_7 || compoundButton.getId() == R.id.rb_B7_3_8 ||

                compoundButton.getId() == R.id.rb_B7_4_1 || compoundButton.getId() == R.id.rb_B7_4_2 ||
                compoundButton.getId() == R.id.rb_B7_4_3 || compoundButton.getId() == R.id.rb_B7_4_4 ||
                compoundButton.getId() == R.id.rb_B7_4_5 || compoundButton.getId() == R.id.rb_B7_4_6 ||
                compoundButton.getId() == R.id.rb_B7_4_7 || compoundButton.getId() == R.id.rb_B7_4_8) {

            if (rb_B7_1_8.isChecked() == true) {
                ed_B7_1_8.setVisibility(View.VISIBLE);
            } else {
                ed_B7_1_8.setVisibility(View.GONE);
                ed_B7_1_8.setText("");
            }

            if (rb_B7_2_8.isChecked() == true) {
                ed_B7_2_8.setVisibility(View.VISIBLE);
            } else {
                ed_B7_2_8.setVisibility(View.GONE);
                ed_B7_2_8.setText("");
            }

            if (rb_B7_3_8.isChecked() == true) {
                ed_B7_3_8.setVisibility(View.VISIBLE);
            } else {
                ed_B7_3_8.setVisibility(View.GONE);
                ed_B7_3_8.setText("");
            }

            if (rb_B7_4_8.isChecked() == true) {
                ed_B7_4_8.setVisibility(View.VISIBLE);
            } else {
                ed_B7_4_8.setVisibility(View.GONE);
                ed_B7_4_8.setText("");
            }
        }

    }

    void intializerRadiobutton(View v) {

        rb_b1_yes = (RadioButton) v.findViewById(R.id.rb_b1_yes);
        rb_b1_no = (RadioButton) v.findViewById(R.id.rb_b1_no);
        R_B3_1 = (RadioButton) v.findViewById(R.id.R_B3_1);
        R_B3_2 = (RadioButton) v.findViewById(R.id.R_B3_2);
        rb_B7_1_1 = (RadioButton) v.findViewById(R.id.rb_B7_1_1);
        rb_B7_1_2 = (RadioButton) v.findViewById(R.id.rb_B7_1_2);
        rb_B7_1_3 = (RadioButton) v.findViewById(R.id.rb_B7_1_3);
        rb_B7_1_4 = (RadioButton) v.findViewById(R.id.rb_B7_1_4);
        rb_B7_1_5 = (RadioButton) v.findViewById(R.id.rb_B7_1_5);
        rb_B7_1_6 = (RadioButton) v.findViewById(R.id.rb_B7_1_6);
        rb_B7_1_7 = (RadioButton) v.findViewById(R.id.rb_B7_1_7);
        rb_B7_1_8 = (RadioButton) v.findViewById(R.id.rb_B7_1_8);
        rb_B7_2_1 = (RadioButton) v.findViewById(R.id.rb_B7_2_1);
        rb_B7_2_2 = (RadioButton) v.findViewById(R.id.rb_B7_2_2);
        rb_B7_2_3 = (RadioButton) v.findViewById(R.id.rb_B7_2_3);
        rb_B7_2_4 = (RadioButton) v.findViewById(R.id.rb_B7_2_4);
        rb_B7_2_5 = (RadioButton) v.findViewById(R.id.rb_B7_2_5);
        rb_B7_2_6 = (RadioButton) v.findViewById(R.id.rb_B7_2_6);
        rb_B7_2_7 = (RadioButton) v.findViewById(R.id.rb_B7_2_7);
        rb_B7_2_8 = (RadioButton) v.findViewById(R.id.rb_B7_2_8);
        rb_B7_3_1 = (RadioButton) v.findViewById(R.id.rb_B7_3_1);
        rb_B7_3_2 = (RadioButton) v.findViewById(R.id.rb_B7_3_2);
        rb_B7_3_3 = (RadioButton) v.findViewById(R.id.rb_B7_3_3);
        rb_B7_3_4 = (RadioButton) v.findViewById(R.id.rb_B7_3_4);
        rb_B7_3_5 = (RadioButton) v.findViewById(R.id.rb_B7_3_5);
        rb_B7_3_6 = (RadioButton) v.findViewById(R.id.rb_B7_3_6);
        rb_B7_3_7 = (RadioButton) v.findViewById(R.id.rb_B7_3_7);
        rb_B7_3_8 = (RadioButton) v.findViewById(R.id.rb_B7_3_8);
        rb_B7_4_1 = (RadioButton) v.findViewById(R.id.rb_B7_4_1);
        rb_B7_4_2 = (RadioButton) v.findViewById(R.id.rb_B7_4_2);
        rb_B7_4_3 = (RadioButton) v.findViewById(R.id.rb_B7_4_3);
        rb_B7_4_4 = (RadioButton) v.findViewById(R.id.rb_B7_4_4);
        rb_B7_4_5 = (RadioButton) v.findViewById(R.id.rb_B7_4_5);
        rb_B7_4_6 = (RadioButton) v.findViewById(R.id.rb_B7_4_6);
        rb_B7_4_7 = (RadioButton) v.findViewById(R.id.rb_B7_4_7);
        rb_B7_4_8 = (RadioButton) v.findViewById(R.id.rb_B7_4_8);
    }

    void initalizeLinerlayout(View v) {


        lv_b1 = (LinearLayout) v.findViewById(R.id.lv_b1);
        lv_b2 = (LinearLayout) v.findViewById(R.id.lv_b2);
        lv_b3 = (LinearLayout) v.findViewById(R.id.lv_b3);
        lv_b4 = (LinearLayout) v.findViewById(R.id.lv_b4);
        lv_b5 = (LinearLayout) v.findViewById(R.id.lv_b5);
        lv_b6 = (LinearLayout) v.findViewById(R.id.lv_b6);
        lv_b7 = (LinearLayout) v.findViewById(R.id.lv_b7);
        lv_b7_1 = (LinearLayout) v.findViewById(R.id.lv_b7_1);
        lv_b7_2 = (LinearLayout) v.findViewById(R.id.lv_b7_2);
        lv_b7_3 = (LinearLayout) v.findViewById(R.id.lv_b7_3);
        lv_b7_4 = (LinearLayout) v.findViewById(R.id.lv_b7_4);
    }

    void intializerChecbkox(View v) {

        C_B6_1 = (CheckBox) v.findViewById(R.id.C_B6_1);
        C_B6_2 = (CheckBox) v.findViewById(R.id.C_B6_2);
        C_B6_3 = (CheckBox) v.findViewById(R.id.C_B6_3);
        C_B6_4 = (CheckBox) v.findViewById(R.id.C_B6_4);
    }

    void initializerEditexview(View v) {
        ed_b2 = (EditText) v.findViewById(R.id.ed_b2);
        ed_B4 = (EditText) v.findViewById(R.id.ed_B4);
        ed_B5 = (EditText) v.findViewById(R.id.ed_B5);

        ed_B7_1_8 = (EditText) v.findViewById(R.id.ed_B7_1_8);
        ed_B7_2_8 = (EditText) v.findViewById(R.id.ed_B7_2_8);
        ed_B7_3_8 = (EditText) v.findViewById(R.id.ed_B7_3_8);
        ed_B7_4_8 = (EditText) v.findViewById(R.id.ed_B7_4_8);
    }

    public boolean Validationiamgood() {


        if (Gothrough.IamHiden(lv_b1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b7_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b7_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_b7_3) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_b7_4) != false;
    }

    public boolean Asignvalues() {


        if (rb_b1_yes.isChecked()) {
            B1 = "1";
        } else if (rb_b1_no.isChecked()) {
            B1 = "2";
        } else {
            B1 = "999";
        }

        if (ed_b2.getText().toString().trim().length() > 0) {
            B2 = ed_b2.getText().toString().trim();
        } else {
            B2 = "999";
        }
        if (R_B3_1.isChecked()) {
            B3 = "1";
        } else if (R_B3_2.isChecked()) {
            B3 = "2";
        } else {
            B3 = "999";
        }

        if (ed_B4.getText().toString().trim().length() > 0) {
            B4 = ed_B4.getText().toString().trim();
        } else {
            B4 = "999";

        }

        if (ed_B5.getText().toString().trim().length() > 0) {
            B5 = ed_B5.getText().toString().trim();
        } else {
            B5 = "999";
        }

        if (C_B6_1.isChecked()) {
            B6_1 = "1";
        } else {
            B6_1 = "999";
        }
        if (C_B6_2.isChecked()) {
            B6_2 = "1";
        } else {
            B6_2 = "999";
        }
        if (C_B6_3.isChecked()) {
            B6_3 = "1";
        } else {
            B6_3 = "999";
        }

        if (C_B6_4.isChecked()) {
            B6_4 = "1";
        } else {
            B6_4 = "999";
        }


        if (rb_B7_1_1.isChecked()) {
            B7_1 = "1";
        } else if (rb_B7_1_2.isChecked()) {
            B7_1 = "2";
        } else if (rb_B7_1_3.isChecked()) {
            B7_1 = "3";
        } else if (rb_B7_1_4.isChecked()) {
            B7_1 = "4";
        } else if (rb_B7_1_5.isChecked()) {
            B7_1 = "5";
        } else if (rb_B7_1_6.isChecked()) {
            B7_1 = "6";
        } else if (rb_B7_1_7.isChecked()) {
            B7_1 = "7";
        } else if (rb_B7_1_8.isChecked()) {
            if (ed_B7_1_8.getText().toString().trim().length() > 0) {
                ed_B7_1_8.setError(null);
                B7_1 = ed_B7_1_8.getText().toString().trim();
            } else {
                B7_1 = "999";

                ed_B7_1_8.setError("Enter");
                return false;

            }
        } else {
            B7_1 = "999";
        }


        if (rb_B7_2_1.isChecked()) {
            B7_2 = "1";
        } else if (rb_B7_2_2.isChecked()) {
            B7_2 = "2";
        } else if (rb_B7_2_3.isChecked()) {
            B7_2 = "3";
        } else if (rb_B7_2_4.isChecked()) {
            B7_2 = "4";
        } else if (rb_B7_2_5.isChecked()) {
            B7_2 = "5";
        } else if (rb_B7_2_6.isChecked()) {
            B7_2 = "6";
        } else if (rb_B7_2_7.isChecked()) {
            B7_2 = "7";
        } else if (rb_B7_2_8.isChecked()) {
            if (ed_B7_2_8.getText().toString().trim().length() > 0) {
                B7_2 = ed_B7_2_8.getText().toString().trim();
            } else {

                B7_2 = "999";
                ed_B7_2_8.setError("Enter");
                return false;
            }
        } else {
            B7_2 = "999";
        }


        if (rb_B7_3_1.isChecked()) {
            B7_3 = "1";
        } else if (rb_B7_3_2.isChecked()) {
            B7_3 = "2";
        } else if (rb_B7_3_3.isChecked()) {
            B7_3 = "3";
        } else if (rb_B7_3_4.isChecked()) {
            B7_3 = "4";
        } else if (rb_B7_3_5.isChecked()) {
            B7_3 = "5";
        } else if (rb_B7_3_6.isChecked()) {
            B7_3 = "6";
        } else if (rb_B7_3_7.isChecked()) {
            B7_3 = "7";
        } else if (rb_B7_3_8.isChecked()) {
            if (ed_B7_3_8.getText().toString().trim().length() > 0) {
                B7_3 = ed_B7_3_8.getText().toString().trim();
            } else {
                B7_3 = "999";

                ed_B7_3_8.setError("Enter");
                return false;
            }
        } else {

            B7_3 = "999";


        }


        if (rb_B7_4_1.isChecked()) {
            B7_4 = "1";
        } else if (rb_B7_4_2.isChecked()) {
            B7_4 = "2";
        } else if (rb_B7_4_3.isChecked()) {
            B7_4 = "3";
        } else if (rb_B7_4_4.isChecked()) {
            B7_4 = "4";
        } else if (rb_B7_4_5.isChecked()) {
            B7_4 = "5";
        } else if (rb_B7_4_6.isChecked()) {
            B7_4 = "6";
        } else if (rb_B7_4_7.isChecked()) {
            B7_4 = "7";
        } else if (rb_B7_4_8.isChecked()) {
            if (ed_B7_4_8.getText().toString().trim().length() > 0) {
                B7_4 = ed_B7_4_8.getText().toString().trim();
            } else {
                B7_4 = "999";

                ed_B7_4_8.setError("Enter");
                return false;
            }
        } else {
            B7_4 = "999";
        }


        return true;

    }

    boolean updateHFA() {
        query = "update  hfa set " +
                col_A.A1 + "='" + Validation.A1 + "'," +
                col_B.B1 + "='" + B1 + "'," +
                col_B.B2 + "='" + B2 + "'," +
                col_B.B3 + "='" + B3 + "'," +
                col_B.B4 + "='" + B4 + "'," +
                col_B.B5 + "='" + B5 + "'," +
                col_B.B6_1 + "='" + B6_1 + "'," +
                col_B.B6_2 + "='" + B6_2 + "'," +
                col_B.B6_3 + "='" + B6_3 + "'," +
                col_B.B6_4 + "='" + B6_4 + "'," +
                col_B.B7_1 + "='" + B7_1 + "'," +
                col_B.B7_2 + "='" + B7_2 + "'," +
                col_B.B7_3 + "='" + B7_3 + "'," +
                col_B.B7_4 + "='" + B7_4 + "'" +
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
