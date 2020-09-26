package edu.aku.abdulsajid.uen_hfa_bl;

import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_A;
import edu.aku.abdulsajid.uen_hfa_bl.databinding.FragmentABinding;
import utils.ClearAllcontrol;
import utils.Districts;
import utils.Gothrough;
import utils.GothroughTextboxss;
import utils.InputFilterMinMax;
import utils.MyPreferences;
import utils.Tehsils;
import utils.Ucs;
import utils.Validation;

import static android.widget.Toast.LENGTH_LONG;
import static data.LocalDataManager.database;


public class Fragment_A extends Fragment {

    FragmentABinding bi;

    String query;
    String A1,
            A4,
            A5,
            A6,
            A7,
            A8,
            A9,
            A10,
            A11,
            A12,
            A1296x,
            A131,
            A132,
            A14,
            A141,
            A142,
            A143a,
            A143ax,
            A143b,
            A143bx,
            A143c,
            A143cx,
            A143d,
            A143dx,
            A143e,
            A143ex,
            A143f,
            A143fx,
            A143g,
            A143gx,
            A143h,
            A143hx,
            A143i,
            A143ix,
            A143j,
            A143jx,
            A143k,
            A143kx,
            A143l,
            A143lx,
            A143m,
            A143mx,
            A143n,
            A143nx,
            A143o,
            A143ox,
            A143p,
            A143px,
            A143q,
            A143qx,
            A14_3_2,
            A14_3_3,
            A14_3_4,
            A14_3_5,
            A14_3_6,
            A14_3_7,
            A14_3_8,
            A14_3_9,
            A14_3_10,
            A14_3_11,
            A14_3_13,
            A14_3_14,
            A14_3_15,
            A14_3_16,
            A14_3_17,
            A15,
            A16,
            A17,
            A18,
            A19,
            A20,
            A21;

    private OnFragmentInteractionListener mListener;

    public Fragment_A() {
    }

    public static Fragment_A newInstance(String param1, String param2) {
        Fragment_A fragment = new Fragment_A();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        bi = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false);
        View view = bi.getRoot();
        bi.setCallback(this);
        return view;
        setupSkips();


        bi.a19month.setFilters(new InputFilter[]{new InputFilterMinMax("0", "11")});

        pref = new MyPreferences(getActivity());

        GetClusterNumber();


        public void BtnContinue () {


            if (bi.a13b.isChecked()) {
                Validation.A13_2_ischekd = "true";
            } else {
                Validation.A13_2_ischekd = "false";
            }


            fun_put_99in_A14();

            if (Validationiamgood() == false) {
                Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", LENGTH_LONG).show();
                return;
            }

            if (asigningvalues() == false) {
                Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", LENGTH_LONG).show();
                return;
            }


            insertdata();

            Validation.HFAPK = GetHFAPK();
            Validation.A1 = A1 + Validation.HFAPK;

            Validation.A4 = A4;

            insertLogtable();
            LogtableUpdates.UpdateLogSection(getContext(), "A", Validation.A1);

            FragmentManager fm = getFragmentManager();
            FragmentTransaction ftu = fm.beginTransaction();
            Fragment_B fragment = new Fragment_B();
            ftu.replace(R.id.frag_container, fragment).commit();
        }


        bi.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        return view;
    }


    private void setupSkips() {

        bi.a4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                ClearAllcontrol.ClearAll(bi.cva5);
                ClearAllcontrol.ClearAll(bi.cva16);
                bi.cva16.setVisibility(View.GONE);
                bi.cva5.setVisibility(View.GONE);

                if (i == bi.a4a.getId()) {
                    bi.cva16.setVisibility(View.VISIBLE);
                } else if (i == bi.a4b.getId()) {
                    bi.cva5.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.a6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                GetDistrict();
            }
        });

        bi.a13a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.cva14.setVisibility(View.GONE);
                    bi.cva141.setVisibility(View.GONE);
                    bi.cva142.setVisibility(View.GONE);
                    bi.cva143.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(bi.cva14);
                    ClearAllcontrol.ClearAll(bi.cva141);
                    ClearAllcontrol.ClearAll(bi.cva142);
                    ClearAllcontrol.ClearAll(bi.cva143);
                } else {
                    bi.cva14.setVisibility(View.VISIBLE);
                    bi.cva141.setVisibility(View.VISIBLE);
                    bi.cva142.setVisibility(View.VISIBLE);
                    bi.cva143.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.a141.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                bi.cva143.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(bi.cva143);
                if (i == bi.a141a.getId()) {
                    bi.cva143.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.a142.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                bi.cva143.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(bi.cva143);

                if (i == bi.a142a.getId()) {
                    bi.cva143.setVisibility(View.VISIBLE);
                }
            }
        });

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


    public boolean Validationiamgood() {


        if (!Gothrough.IamHiden(bi.cva5)) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva6) == false) {
            return false;
        }
        if (bi.a7.getSelectedItem().toString().trim().equals("Select")) {

            Toast.makeText(getActivity(), "ERROR Select District", LENGTH_LONG).show();
            return false;
        }
        if (bi.a8.getSelectedItem().toString().trim().equals("Select")) {

            Toast.makeText(getActivity(), "ERROR Select Tehsil", LENGTH_LONG).show();

            return false;
        }
        if (bi.a9.getSelectedItem().toString().trim().equals("Select")) {

            Toast.makeText(getActivity(), "ERROR Select UC", LENGTH_LONG).show();
            return false;
        }

        if (Gothrough.IamHiden(bi.cva10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva12) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva13) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva14) == false) {
            return false;
        }

        if (bi.a13b.isChecked() == true) {

            if (GothroughTextboxss.IamHiden(bi.cva14) == false) {
                return false;
            }


        }
        if (Gothrough.IamHiden(bi.cva14) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva141) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva142) == false) {
            return false;
        }

        if (Gothrough.IamHiden(bi.cva143) == false) {
            return false;
        }

        if (bi.cva143.getVisibility() == View.VISIBLE) {
            bi.a143ax.setError(null);
            if (bi.a143ax.getText().toString().trim().length() == 0) {
                bi.a143ax.setError("Enter Number");

                return false;
            }
            bi.a143bx.setError(null);
            if (bi.a143bx.getText().toString().trim().length() == 0) {
                bi.a143bx.setError("Enter Number");
                return false;
            }

            bi.a143cx.setError(null);
            if (bi.a143cx.getText().toString().trim().length() == 0) {
                bi.a143cx.setError("Enter Number");
                return false;
            }

            bi.a143dx.setError(null);
            if (bi.a143dx.getText().toString().trim().length() == 0) {
                bi.a143dx.setError("Enter Number");
                return false;
            }

            bi.a143ex.setError(null);
            if (bi.a143ex.getText().toString().trim().length() == 0) {
                bi.a143ex.setError("Enter Number");
                return false;
            }

            bi.a143fx.setError(null);
            if (bi.a143fx.getText().toString().trim().length() == 0) {
                bi.a143fx.setError("Enter Number");
                return false;
            }

            bi.a143gx.setError(null);
            if (bi.a143gx.getText().toString().trim().length() == 0) {
                bi.a143gx.setError("Enter Number");
                return false;
            }

            bi.a143hx.setError(null);
            if (bi.a143hx.getText().toString().trim().length() == 0) {
                bi.a143hx.setError("Enter Number");
                return false;
            }

            bi.a143ix.setError(null);
            if (bi.a143ix.getText().toString().trim().length() == 0) {
                bi.a143ix.setError("Enter Number");
                return false;
            }

            bi.a143jx.setError(null);
            if (bi.a143jx.getText().toString().trim().length() == 0) {
                bi.a143jx.setError("Enter Number");
                return false;
            }
            bi.a143kx.setError(null);
            if (bi.a143kx.getText().toString().trim().length() == 0) {
                bi.a143kx.setError("Enter Number");
                return false;
            }
            bi.a143lx.setError(null);
            if (bi.a143lx.getText().toString().trim().length() == 0) {
                bi.a143lx.setError("Enter Number");
                return false;
            }

            bi.a143mx.setError(null);
            if (bi.a143mx.getText().toString().trim().length() == 0) {
                bi.a143mx.setError("Enter Number");
                return false;
            }

            bi.a143nx.setError(null);
            if (bi.a143nx.getText().toString().trim().length() == 0) {
                bi.a143nx.setError("Enter Number");
                return false;
            }
            bi.a143ox.setError(null);
            if (bi.a143ox.getText().toString().trim().length() == 0) {
                bi.a143ox.setError("Enter Number");
                return false;
            }
            bi.a143px.setError(null);
            if (bi.a143px.getText().toString().trim().length() == 0) {
                bi.a143px.setError("Enter Number");
                return false;
            }

            bi.a143qx.setError(null);
            if (bi.a143qx.getText().toString().trim().length() == 0) {
                bi.a143qx.setError("Enter Number");
                return false;
            }


        }


        if (Gothrough.IamHiden(bi.cva15) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva16) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva17) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva18) == false) {
            return false;
        }
        if (Gothrough.IamHiden(bi.cva19) == false) {
            return false;
        }
        return Gothrough.IamHiden(bi.cva20) != false;
    }

    boolean insertdata() {


        query = "insert into  hfa(" +

                col_A.A2 + "," +
                col_A.A3 + "," +
                col_A.A4 + "," +
                col_A.A5 + "," +
                col_A.A6 + "," +
                col_A.A7 + "," +
                col_A.A8 + "," +
                col_A.A9 + "," +
                col_A.A10 + "," +
                col_A.A11 + "," +
                col_A.A12 + "," +
                col_A.A13_1 + "," +
                col_A.A13_2 + "," +
                col_A.A14 + "," +
                col_A.A14_1 + "," +
                col_A.A14_2 + "," +
                col_A.A14_3_1 + "," +
                col_A.A14_3_2 + "," +
                col_A.A14_3_3 + "," +
                col_A.A14_3_4 + "," +
                col_A.A14_3_5 + "," +
                col_A.A14_3_6 + "," +
                col_A.A14_3_7 + "," +
                col_A.A14_3_8 + "," +
                col_A.A14_3_9 + "," +
                col_A.A14_3_10 + "," +
                col_A.A14_3_11 + "," +
                col_A.A14_3_12 + "," +
                col_A.A14_3_13 + "," +
                col_A.A14_3_14 + "," +
                col_A.A14_3_15 + "," +
                col_A.A14_3_16 + "," +
                col_A.A14_3_17 + "," +
                col_A.A15 + "," +
                col_A.A16 + "," +
                col_A.A17 + "," +
                col_A.A18 + "," +
                col_A.A19 + "," +
                col_A.A20 + "," +
                col_A.A21 + ")" +
                "values ('" +
                Validation.A2 + "','" +
                Validation.A3 + "','" +
                A4 + "','" +
                A5 + "','" +
                A6 + "','" +
                A7 + "','" +
                A8 + "','" +
                A9 + "','" +
                A10 + "','" +
                A11 + "','" +
                A12 + "','" +
                A131 + "','" +
                A132 + "','" +
                A14 + "','" +
                A141 + "','" +
                A142 + "','" +
                A143a + "','" +
                A14_3_2 + "','" +
                A14_3_3 + "','" +
                A14_3_4 + "','" +
                A14_3_5 + "','" +
                A14_3_6 + "','" +
                A14_3_7 + "','" +
                A14_3_8 + "','" +
                A14_3_9 + "','" +
                A14_3_10 + "','" +
                A14_3_11 + "','" +
                A143l + "','" +
                A14_3_13 + "','" +
                A14_3_14 + "','" +
                A14_3_15 + "','" +
                A14_3_16 + "','" +
                A14_3_17 + "','" +
                A15 + "','" +
                A16 + "','" +
                A17 + "','" +
                A18 + "','" +
                A19 + "','" +
                A20 + "','" +
                A21 + "' )";

        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

        return true;
    }

    public boolean asigningvalues() {

        A4 = bi.a4a.isChecked() ? "1"
                : bi.a4b.isChecked() ? "2"
                : "-1";

        A5 = bi.a5.getText().toString().trim().isEmpty() ? "-1" : bi.a5.getText().toString();

        A6 = bi.a6a.isChecked() ? "1"
                : bi.a6b.isChecked() ? "2"
                : bi.a6c.isChecked() ? "3"
                : "-1";

        A7 = String.valueOf(bi.a7.getSelectedItem() == null ? "-1" : bi.a7.getSelectedItem());
        A8 = String.valueOf(bi.a8.getSelectedItem() == null ? "-1" : bi.a8.getSelectedItem());
        A9 = String.valueOf(bi.a9.getSelectedItem() == null ? "-1" : bi.a9.getSelectedItem());

        A10 = bi.a10.getText().toString().trim().isEmpty() ? "-1" : bi.a10.getText().toString();

        A11 = bi.a11.getText().toString().trim().isEmpty() ? "-1" : bi.a11.getText().toString();

        A12 = bi.a12a.isChecked() ? "1"
                : bi.a12b.isChecked() ? "2"
                : bi.a12c.isChecked() ? "3"
                : bi.a12d.isChecked() ? "4"
                : bi.a12e.isChecked() ? "5"
                : bi.a12f.isChecked() ? "6"
                : bi.a12g.isChecked() ? "7"
                : bi.a12h.isChecked() ? "8"
                : bi.a12i.isChecked() ? "9"
                : bi.a12j.isChecked() ? "10"
                : bi.a12k.isChecked() ? "11"
                : bi.a12l.isChecked() ? "12"
                : bi.a1296.isChecked() ? "96"
                : "-1";
        A1296x = bi.a1296x.getText().toString().trim().isEmpty() ? "-1" : bi.a1296x.getText().toString();

        A131 = bi.a13a.isChecked() ? "1" : "-1";
        A132 = bi.a13b.isChecked() ? "2" : "-1";

        A14 = bi.a14.getText().toString().trim().isEmpty() ? "-1" : bi.a14.getText().toString();

        A141 = bi.a141a.isChecked() ? "1"
                : bi.a141b.isChecked() ? "2"
                : "-1";

        A142 = bi.a142a.isChecked() ? "1"
                : bi.a142b.isChecked() ? "2"
                : "-1";

        A143a = bi.a143a.isChecked() ? "1" : "-1";
        A143ax = bi.a143ax.getText().toString().trim().isEmpty() ? "-1" : bi.a143ax.getText().toString();
        A143b = bi.a143b.isChecked() ? "2" : "-1";
        A143bx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143c = bi.a143c.isChecked() ? "3" : "-1";
        A143cx = bi.a143cx.getText().toString().trim().isEmpty() ? "-1" : bi.a143cx.getText().toString();
        A143d = bi.a143d.isChecked() ? "4" : "-1";
        A143dx = bi.a143dx.getText().toString().trim().isEmpty() ? "-1" : bi.a143dx.getText().toString();
        A143e = bi.a143e.isChecked() ? "5" : "-1";
        A143ex = bi.a143ex.getText().toString().trim().isEmpty() ? "-1" : bi.a143ex.getText().toString();
        A143f = bi.a143f.isChecked() ? "6" : "-1";
        A143fx = bi.a143fx.getText().toString().trim().isEmpty() ? "-1" : bi.a143fx.getText().toString();
        A143g = bi.a143g.isChecked() ? "7" : "-1";
        A143gx = bi.a143gx.getText().toString().trim().isEmpty() ? "-1" : bi.a143gx.getText().toString();
        A143h = bi.a143b.isChecked() ? "8" : "-1";
        A143hx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143i = bi.a143b.isChecked() ? "9" : "-1";
        A143ix = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143j = bi.a143b.isChecked() ? "10" : "-1";
        A143jx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143k = bi.a143b.isChecked() ? "11" : "-1";
        A143kx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143l = bi.a143b.isChecked() ? "12" : "-1";
        A143lx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143m = bi.a143b.isChecked() ? "13" : "-1";
        A143mx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143n = bi.a143b.isChecked() ? "14" : "-1";
        A143nx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143o = bi.a143b.isChecked() ? "15" : "-1";
        A143ox = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143p = bi.a143b.isChecked() ? "16" : "-1";
        A143px = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();
        A143q = bi.a143b.isChecked() ? "17" : "-1";
        A143qx = bi.a143bx.getText().toString().trim().isEmpty() ? "-1" : bi.a143bx.getText().toString();


        if (bi.a14_3_1.getText().toString().trim().length() > 0) {
            A143a = bi.a14_3_1.getText().toString().trim();
        } else {
            A143a = "999";
        }
        if (bi.a14_3_2.getText().toString().trim().length() > 0) {
            A14_3_2 = bi.a14_3_2.getText().toString().trim();
        } else {
            A14_3_2 = "999";
        }

        if (bi.a14_3_3.getText().toString().trim().length() > 0) {
            A14_3_3 = bi.a14_3_3.getText().toString().trim();
        } else {
            A14_3_3 = "999";
        }
        if (bi.a14_3_4.getText().toString().trim().length() > 0) {
            A14_3_4 = bi.a14_3_4.getText().toString().trim();
        } else {
            A14_3_4 = "999";
        }
        if (bi.a14_3_5.getText().toString().trim().length() > 0) {
            A14_3_5 = bi.a14_3_5.getText().toString().trim();
        } else {
            A14_3_5 = "999";
        }
        if (bi.a14_3_6.getText().toString().trim().length() > 0) {
            A14_3_6 = bi.a14_3_6.getText().toString().trim();
        } else {
            A14_3_6 = "999";
        }
        if (bi.a14_3_7.getText().toString().trim().length() > 0) {
            A14_3_7 = bi.a14_3_7.getText().toString().trim();
        } else {
            A14_3_7 = "999";
        }
        if (bi.a14_3_8.getText().toString().trim().length() > 0) {
            A14_3_8 = bi.a14_3_8.getText().toString().trim();
        } else {
            A14_3_8 = "999";
        }
        if (bi.a14_3_9.getText().toString().trim().length() > 0) {
            A14_3_9 = bi.a14_3_9.getText().toString().trim();
        } else {
            A14_3_9 = "999";
        }
        if (bi.a14_3_10.getText().toString().trim().length() > 0) {
            A14_3_10 = bi.a14_3_10.getText().toString().trim();
        } else {
            A14_3_10 = "999";
        }
        if (bi.a143kx.getText().toString().trim().length() > 0) {
            A14_3_11 = bi.a143kx.getText().toString().trim();
        } else {
            A14_3_11 = "999";
        }
        if (bi.a143lx.getText().toString().trim().length() > 0) {
            A143l = bi.a143lx.getText().toString().trim();
        } else {
            A143l = "999";
        }
        if (bi.a143mx.getText().toString().trim().length() > 0) {
            A14_3_13 = bi.a143mx.getText().toString().trim();
        } else {
            A14_3_13 = "999";
        }
        if (bi.a14_3_14.getText().toString().trim().length() > 0) {
            A14_3_14 = bi.a14_3_14.getText().toString().trim();
        } else {
            A14_3_14 = "999";
        }
        if (bi.a14_3_15.getText().toString().trim().length() > 0) {
            A14_3_15 = bi.a14_3_15.getText().toString().trim();
        } else {
            A14_3_15 = "999";
        }
        if (bi.a14_3_16.getText().toString().trim().length() > 0) {
            A14_3_16 = bi.a14_3_16.getText().toString().trim();
        } else {
            A14_3_16 = "999";
        }
        if (bi.a14_3_17.getText().toString().trim().length() > 0) {
            A14_3_17 = bi.a14_3_17.getText().toString().trim();
        } else {
            A14_3_17 = "999";
        }


        if (R_A15_1.isChecked()) {
            A15 = "1";
        } else if (R_A15_2.isChecked()) {
            A15 = "2";
        } else if (R_A15_3.isChecked()) {
            A15 = "3";
        } else if (R_A15_4.isChecked()) {
            A15 = "4";
        } else if (R_A15_5.isChecked()) {
            A15 = "5";
        } else if (R_A15_6.isChecked()) {
            A15 = "6";
        } else if (R_A15_7.isChecked()) {
            A15 = "7";
        } else if (R_A15_8.isChecked()) {
            A15 = "8";
        } else if (R_A15_9.isChecked()) {
            if (bi.a15_9.getText().toString().trim().length() > 0) {
                A15 = "NGO " + bi.a15_9.getText().toString().trim();
                bi.a15_9.setError(null);
            } else {
                A15 = "999";

                bi.a15_9.setError("Enter");
                return false;
            }
        } else if (R_A15_10.isChecked()) {
            A15 = "10";
        } else if (R_A15_11.isChecked()) {
            if (bi.a15_11.getText().toString().trim().length() > 0) {

                A15 = bi.a15_11.getText().toString().trim();
                bi.a15_11.setError(null);
            } else {
                A15 = "999";

                bi.a15_11.setError("Enter");

                return false;
            }
        } else {
            A15 = "999";
        }


        if (R_A16_1.isChecked()) {
            A16 = "1";
        } else if (R_A16_2.isChecked()) {
            A16 = "2";
        } else if (R_A16_3.isChecked()) {
            A16 = "3";
        } else if (R_A16_4.isChecked()) {
            A16 = "4";
        } else if (R_A16_5.isChecked()) {
            A16 = "5";
        } else if (R_A16_6.isChecked()) {
            A16 = "6";
        } else if (R_A16_7.isChecked()) {
            A16 = "7";
        } else if (R_A16_8.isChecked()) {
            A16 = "8";
        } else if (R_A16_9.isChecked()) {
            A16 = "9";
        } else if (R_A16_10.isChecked()) {
            A16 = "10";
        } else if (R_A16_11.isChecked()) {
            A16 = "11";
        } else if (R_A16_12.isChecked()) {
            A16 = "12";
        } else if (R_A16_13.isChecked()) {
            A16 = "13";
        } else if (R_A16_14.isChecked()) {
            A16 = "14";
        } else if (R_A16_15.isChecked()) {
            if (bi.a16_14.getText().toString().trim().length() > 0) {
                A16 = bi.a16_14.getText().toString().trim();
                bi.a16_14.setError(null);

            } else {
                A16 = "999";

                bi.a16_14.setError("Enter");
                return false;
            }
        } else {
            A16 = "999";
        }

        if (bi.a17.getText().toString().trim().length() > 0) {
            A17 = bi.a17.getText().toString().trim();
        } else {
            A17 = "999";
        }


        if (R_A18_1.isChecked()) {
            A18 = "1";
        } else if (R_A18_2.isChecked()) {
            A18 = "2";
        } else if (R_A18_3.isChecked()) {
            A18 = "3";
        } else if (R_A18_4.isChecked()) {
            A18 = "4";
        } else if (R_A18_5.isChecked()) {
            A18 = "5";
        } else if (R_A18_6.isChecked()) {
            A18 = "6";
        } else if (R_A18_7.isChecked()) {
            A18 = "7";
        } else if (R_A18_8.isChecked()) {

            if (bi.a18_8.getText().toString().trim().length() > 0) {
                A18 = bi.a18_8.getText().toString().trim();

                bi.a18_8.setError(null);
            } else {
                A18 = "999";

                bi.a18_8.setError("Enter");
                return false;
            }
        } else {
            A18 = "999";
        }

        int A19_months = 0;

        if (bi.a19_year.getText().toString().trim().length() > 0 || bi.a19_month.getText().toString().trim().length() > 0) {
            if (bi.a19_year.getText().toString().trim().length() > 0) {
                int a19year = Integer.parseInt(bi.a19_year.getText().toString().trim());
                A19_months = a19year * 12;
            }
            if (bi.a19_month.getText().toString().trim().length() > 0) {
                int a19month = Integer.parseInt(bi.a19_month.getText().toString().trim());
                A19_months = A19_months + a19month;
            }
        } else {
            A19_months = 999;
        }
        A19 = A19_months + "";


        if (bi.a20.getText().toString().trim().length() > 0) {

            A20 = bi.a20.getText().toString().trim();
        } else {
            A20 = "999";
        }

        if (bi.a21.getText().toString().trim().length() > 0) {

            A21 = bi.a21.getText().toString().trim();
        } else {
            A21 = "999";
        }


        String spA6 = "";
        String spA7;
        String spA8;
        String spA9;

        if (R_A6_1.isChecked()) {
            spA6 = "B";
        }
        if (R_A6_2.isChecked()) {
            spA6 = "P";
        }
        if (R_A6_3.isChecked()) {
            spA6 = "S";
        }

        spA7 = bi.a7.getSelectedItem().toString().trim();
        spA8 = bi.a8.getSelectedItem().toString().trim();
        spA9 = bi.a9.getSelectedItem().toString().trim();

        spA7 = spA7.substring(0, 1);
        spA8 = spA8.substring(0, 1);
        spA9 = spA9.substring(0, 1);


        String s_form_serial_number = spA6 + spA7 + spA8 + spA9 + pref.getUserId();


        try {
            String timeStamp = new SimpleDateFormat("MMdd").format(Calendar.getInstance().getTime());


            s_form_serial_number = s_form_serial_number + timeStamp;
        } catch (Exception e) {

        }


        A1 = s_form_serial_number;

        return true;


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        int id = adapterView.getId();
        switch (id) {
            case R.id.bi.a7:

                if (bi.a7.getSelectedItem().toString().equals("Select"))
                    break;

                GetTehsil(bi.a7.getSelectedItem().toString().trim());

            case R.id.bi.a8:
                if (bi.a8.getSelectedItem().toString().equals("Select"))
                    break;

                GetUC(bi.a8.getSelectedItem().toString().trim());

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void GetDistrict() {


        String province;
        if (R_A6_1.isChecked()) {
            province = "Balochistan";
        } else if (R_A6_2.isChecked()) {
            province = "Punjab";
        } else if (R_A6_3.isChecked()) {
            province = "Sindh";
        } else {
            return;
        }


        list_District = Districts.get(province);
        ArrayAdapter<String> dataAdapterD = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, list_District);

        dataAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bi.a7.setAdapter(dataAdapterD);


        bi.a7.setSelection(0);
    }

    public void GetTehsil(String District) {


        List<String> list_tehsil = Tehsils.get(District);
        ArrayAdapter<String> dataAdapterD = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, list_tehsil);

        dataAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bi.a8.setAdapter(dataAdapterD);


        bi.a8.setSelection(0);
    }

    public void GetUC(String Tehsil) {


        List<String> list_UC = Ucs.get(Tehsil);
        ArrayAdapter<String> dataAdapterD = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, list_UC);

        dataAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bi.a9.setAdapter(dataAdapterD);


        bi.a9.setSelection(0);
    }

    public String GetHFAPK() {

        query = "select * from hfa ORDER BY id DESC LIMIT 1";
        Cursor c = database.rawQuery(query, null);

        int houseInfoId = -1;
        if (c != null)
            if (c.moveToFirst())
                houseInfoId = c.getInt(0);


        return houseInfoId + "";

    }

    public void insertLogtable() {
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        String Curent_date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());


        String query = "insert into tbllog(Interview_date,Interview_start_time,Interview_status,Interview_user,hfa_id,hfa_a1)" +

                "values('" + Curent_date + "','" + currentDateTimeString + "'," + "'0'" + ",'" + pref.getUserId() + "','" + Validation.HFAPK + "','" + Validation.A1 + "')";


        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted Log Table successfully", Toast.LENGTH_SHORT).show();


    }

    public void GetClusterNumber() {


        List<String> list_DHIS = new ArrayList<>();


        list_DHIS.add("432032");
        list_DHIS.add("432033");
        list_DHIS.add("432086");
        list_DHIS.add("432074");
        list_DHIS.add("432078");
        list_DHIS.add("432036");
        list_DHIS.add("432073");
        list_DHIS.add("432089");
        list_DHIS.add("432034");
        list_DHIS.add("432079");
        list_DHIS.add("432038");
        list_DHIS.add("432035");
        list_DHIS.add("432037");
        list_DHIS.add("432075");
        list_DHIS.add("432076");
        list_DHIS.add("432046");
        list_DHIS.add("432011");
        list_DHIS.add("432050");
        list_DHIS.add("432051");
        list_DHIS.add("432048");
        list_DHIS.add("432044");
        list_DHIS.add("432047");
        list_DHIS.add("432043");
        list_DHIS.add("432012");
        list_DHIS.add("432010");
        list_DHIS.add("432095");
        list_DHIS.add("432014");
        list_DHIS.add("432007");
        list_DHIS.add("432080");
        list_DHIS.add("432006");
        list_DHIS.add("432005");
        list_DHIS.add("432015");
        list_DHIS.add("432041");
        list_DHIS.add("432056");
        list_DHIS.add("432055");
        list_DHIS.add("432016");
        list_DHIS.add("432092");
        list_DHIS.add("432054");
        list_DHIS.add("432052");
        list_DHIS.add("432017");
        list_DHIS.add("432057");
        list_DHIS.add("432058");
        list_DHIS.add("432059");
        list_DHIS.add("432090");
        list_DHIS.add("432077");
        list_DHIS.add("432053");
        list_DHIS.add("432008");
        list_DHIS.add("432082");
        list_DHIS.add("432009");
        list_DHIS.add("414069");
        list_DHIS.add("414111");
        list_DHIS.add("414032");
        list_DHIS.add("414108");
        list_DHIS.add("414012");
        list_DHIS.add("414102");
        list_DHIS.add("414011");
        list_DHIS.add("414078");
        list_DHIS.add("414123");
        list_DHIS.add("414008");
        list_DHIS.add("414016");
        list_DHIS.add("414023");
        list_DHIS.add("414048");
        list_DHIS.add("414057");
        list_DHIS.add("414058");
        list_DHIS.add("414105");
        list_DHIS.add("414031");
        list_DHIS.add("414043");
        list_DHIS.add("414059");
        list_DHIS.add("414009");
        list_DHIS.add("414070");
        list_DHIS.add("414099");
        list_DHIS.add("414116");
        list_DHIS.add("414127");
        list_DHIS.add("414017");
        list_DHIS.add("414051");
        list_DHIS.add("414115");
        list_DHIS.add("414118");
        list_DHIS.add("414071");
        list_DHIS.add("414067");
        list_DHIS.add("414034");
        list_DHIS.add("414037");
        list_DHIS.add("414029");
        list_DHIS.add("414094");
        list_DHIS.add("414125");
        list_DHIS.add("414079");
        list_DHIS.add("414003");
        list_DHIS.add("414026");
        list_DHIS.add("414039");
        list_DHIS.add("414044");
        list_DHIS.add("414124");
        list_DHIS.add("414056");
        list_DHIS.add("414021");
        list_DHIS.add("414035");
        list_DHIS.add("414095");
        list_DHIS.add("414128");
        list_DHIS.add("414036");
        list_DHIS.add("414072");
        list_DHIS.add("414010");
        list_DHIS.add("414024");
        list_DHIS.add("414126");
        list_DHIS.add("414086");
        list_DHIS.add("414038");
        list_DHIS.add("414045");
        list_DHIS.add("414062");
        list_DHIS.add("414030");
        list_DHIS.add("414042");
        list_DHIS.add("414052");
        list_DHIS.add("414033");
        list_DHIS.add("414068");
        list_DHIS.add("414006");
        list_DHIS.add("414007");
        list_DHIS.add("414046");
        list_DHIS.add("414018");
        list_DHIS.add("414060");
        list_DHIS.add("414061");
        list_DHIS.add("414091");
        list_DHIS.add("414054");
        list_DHIS.add("414121");
        list_DHIS.add("414019");
        list_DHIS.add("414019");
        list_DHIS.add("414087");
        list_DHIS.add("414065");
        list_DHIS.add("414097");
        list_DHIS.add("414013");
        list_DHIS.add("414120");
        list_DHIS.add("414088");
        list_DHIS.add("414101");
        list_DHIS.add("434010");
        list_DHIS.add("434004");
        list_DHIS.add("434009");
        list_DHIS.add("434033");
        list_DHIS.add("434040");
        list_DHIS.add("434037");
        list_DHIS.add("434016");
        list_DHIS.add("434012");
        list_DHIS.add("434029");
        list_DHIS.add("434028");
        list_DHIS.add("434020");
        list_DHIS.add("434052");
        list_DHIS.add("434003");
        list_DHIS.add("434024");
        list_DHIS.add("434025");
        list_DHIS.add("434023");
        list_DHIS.add("434005");
        list_DHIS.add("434032");
        list_DHIS.add("434051");
        list_DHIS.add("434039");
        list_DHIS.add("434036");
        list_DHIS.add("434050");
        list_DHIS.add("434021");
        list_DHIS.add("434044");
        list_DHIS.add("434043");
        list_DHIS.add("404349");
        list_DHIS.add("434048");
        list_DHIS.add("434017");
        list_DHIS.add("434036");
        list_DHIS.add("434013");
        list_DHIS.add("434035");
        list_DHIS.add("434015");
        list_DHIS.add("434034");
        list_DHIS.add("434018");
        list_DHIS.add("434019");
        list_DHIS.add("434008");
        list_DHIS.add("434007");
        list_DHIS.add("434026");
        list_DHIS.add("123128");
        list_DHIS.add("123014");
        list_DHIS.add("123015");
        list_DHIS.add("123034");
        list_DHIS.add("123004");
        list_DHIS.add("123003");
        list_DHIS.add("123016");
        list_DHIS.add("123008");
        list_DHIS.add("123011");
        list_DHIS.add("123018");
        list_DHIS.add("123084");
        list_DHIS.add("123010");
        list_DHIS.add("123007");
        list_DHIS.add("123009");
        list_DHIS.add("123017");
        list_DHIS.add("123083");
        list_DHIS.add("123047");
        list_DHIS.add("123065");
        list_DHIS.add("123066");
        list_DHIS.add("123019");
        list_DHIS.add("123002");
        list_DHIS.add("123001");
        list_DHIS.add("123045");
        list_DHIS.add("123012");
        list_DHIS.add("123086");
        list_DHIS.add("123064");
        list_DHIS.add("123127");
        list_DHIS.add("123022");
        list_DHIS.add("123005");
        list_DHIS.add("123013");
        list_DHIS.add("123124");
        list_DHIS.add("123020");
        list_DHIS.add("123085");
        list_DHIS.add("123021");
        list_DHIS.add("123006");
        list_DHIS.add("123028");
        list_DHIS.add("123037");
        list_DHIS.add("123113");
        list_DHIS.add("123122");
        list_DHIS.add("123126");
        list_DHIS.add("123024");
        list_DHIS.add("123089");
        list_DHIS.add("123090");
        list_DHIS.add("123088");
        list_DHIS.add("123032");
        list_DHIS.add("123027");
        list_DHIS.add("123023");
        list_DHIS.add("123123");
        list_DHIS.add("123067");
        list_DHIS.add("123035");
        list_DHIS.add("123129");
        list_DHIS.add("123029");
        list_DHIS.add("123031");
        list_DHIS.add("123025");
        list_DHIS.add("123063");
        list_DHIS.add("123026");
        list_DHIS.add("123036");
        list_DHIS.add("123038");
        list_DHIS.add("123033");
        list_DHIS.add("123030");
        list_DHIS.add("123121");
        list_DHIS.add("123070");
        list_DHIS.add("123060");
        list_DHIS.add("123096");
        list_DHIS.add("123080");
        list_DHIS.add("123116");
        list_DHIS.add("123079");
        list_DHIS.add("123044");
        list_DHIS.add("123152");
        list_DHIS.add("123041");
        list_DHIS.add("123052");
        list_DHIS.add("123094");
        list_DHIS.add("123095");
        list_DHIS.add("123154");
        list_DHIS.add("123049");
        list_DHIS.add("123093");
        list_DHIS.add("123133");
        list_DHIS.add("123042");
        list_DHIS.add("123062");
        list_DHIS.add("123043");
        list_DHIS.add("123136");
        list_DHIS.add("123091");
        list_DHIS.add("123149");
        list_DHIS.add("123125");
        list_DHIS.add("123142");
        list_DHIS.add("123069");
        list_DHIS.add("123039");
        list_DHIS.add("123132");
        list_DHIS.add("123056");
        list_DHIS.add("123139");
        list_DHIS.add("123155");
        list_DHIS.add("123059");
        list_DHIS.add("123082");
        list_DHIS.add("123145");
        list_DHIS.add("123040");
        list_DHIS.add("123050");
        list_DHIS.add("123092");
        list_DHIS.add("123055");
        list_DHIS.add("123068");
        list_DHIS.add("123156");
        list_DHIS.add("123130");
        list_DHIS.add("123115");
        list_DHIS.add("123060");
        list_DHIS.add("123117");
        list_DHIS.add("123081");
        list_DHIS.add("123058");
        list_DHIS.add("123061");
        list_DHIS.add("123057");
        list_DHIS.add("123072");
        list_DHIS.add("123137");
        list_DHIS.add("123138");
        list_DHIS.add("123054");
        list_DHIS.add("123053");
        list_DHIS.add("123143");
        list_DHIS.add("123048");
        list_DHIS.add("123051");
        list_DHIS.add("123120");
        list_DHIS.add("123046");
        list_DHIS.add("123131");
        list_DHIS.add("123071");
        list_DHIS.add("123134");
        list_DHIS.add("123140");
        list_DHIS.add("113176");
        list_DHIS.add("113006");
        list_DHIS.add("113007");
        list_DHIS.add("113195");
        list_DHIS.add("113001");
        list_DHIS.add("113004");
        list_DHIS.add("113012");
        list_DHIS.add("113014");
        list_DHIS.add("113008");
        list_DHIS.add("113009");
        list_DHIS.add("113005");
        list_DHIS.add("113254");
        list_DHIS.add("113011");
        list_DHIS.add("113010");
        list_DHIS.add("113016");
        list_DHIS.add("113002");
        list_DHIS.add("113021");
        list_DHIS.add("113013");
        list_DHIS.add("113015");
        list_DHIS.add("113017");
        list_DHIS.add("113019");
        list_DHIS.add("113018");
        list_DHIS.add("113196");
        list_DHIS.add("113175");
        list_DHIS.add("113250");
        list_DHIS.add("113003");
        list_DHIS.add("113273");
        list_DHIS.add("113197");
        list_DHIS.add("113025");
        list_DHIS.add("113251");
        list_DHIS.add("113028");
        list_DHIS.add("113274");
        list_DHIS.add("113280");
        list_DHIS.add("113026");
        list_DHIS.add("113281");
        list_DHIS.add("113027");
        list_DHIS.add("113043");
        list_DHIS.add("113033");
        list_DHIS.add("113198");
        list_DHIS.add("113248");
        list_DHIS.add("113282");
        list_DHIS.add("113029");
        list_DHIS.add("113199");
        list_DHIS.add("113177");
        list_DHIS.add("113030");
        list_DHIS.add("113022");
        list_DHIS.add("113034");
        list_DHIS.add("113041");
        list_DHIS.add("113024");
        list_DHIS.add("113035");
        list_DHIS.add("113036");
        list_DHIS.add("113031");
        list_DHIS.add("113032");
        list_DHIS.add("113200");
        list_DHIS.add("113039");
        list_DHIS.add("113253");
        list_DHIS.add("113037");
        list_DHIS.add("113023");
        list_DHIS.add("113038");
        list_DHIS.add("113201");
        list_DHIS.add("113042");
        list_DHIS.add("113040");
        list_DHIS.add("113054");
        list_DHIS.add("113055");
        list_DHIS.add("113044");
        list_DHIS.add("113046");
        list_DHIS.add("113064");
        list_DHIS.add("113048");
        list_DHIS.add("113265");
        list_DHIS.add("113047");
        list_DHIS.add("113049");
        list_DHIS.add("113050");
        list_DHIS.add("113247");
        list_DHIS.add("113051");
        list_DHIS.add("113056");
        list_DHIS.add("113202");
        list_DHIS.add("113052");
        list_DHIS.add("113174");
        list_DHIS.add("113071");
        list_DHIS.add("113045");
        list_DHIS.add("113063");
        list_DHIS.add("113061");
        list_DHIS.add("113204");
        list_DHIS.add("113062");
        list_DHIS.add("113205");
        list_DHIS.add("113066");
        list_DHIS.add("113067");
        list_DHIS.add("113057");
        list_DHIS.add("113206");
        list_DHIS.add("113053");
        list_DHIS.add("113060");
        list_DHIS.add("113065");
        list_DHIS.add("113069");
        list_DHIS.add("113068");
        list_DHIS.add("113070");
        list_DHIS.add("113203");
        list_DHIS.add("113058");
        list_DHIS.add("113059");
        list_DHIS.add("113077");
        list_DHIS.add("113078");
        list_DHIS.add("113080");
        list_DHIS.add("113076");
        list_DHIS.add("113207");
        list_DHIS.add("113211");
        list_DHIS.add("113089");
        list_DHIS.add("113208");
        list_DHIS.add("113081");
        list_DHIS.add("113079");
        list_DHIS.add("113181");
        list_DHIS.add("113073");
        list_DHIS.add("113082");
        list_DHIS.add("113083");
        list_DHIS.add("113084");
        list_DHIS.add("113072");
        list_DHIS.add("113209");
        list_DHIS.add("113086");
        list_DHIS.add("113087");
        list_DHIS.add("113085");
        list_DHIS.add("113075");
        list_DHIS.add("113074");
        list_DHIS.add("113210");
        list_DHIS.add("113272");
        list_DHIS.add("113088");
        list_DHIS.add("113090");
        list_DHIS.add("113091");
        list_DHIS.add("113092");
        list_DHIS.add("113271");
        list_DHIS.add("113246");
        list_DHIS.add("211005");
        list_DHIS.add("211009");
        list_DHIS.add("211049");
        list_DHIS.add("211096");
        list_DHIS.add("211110");
        list_DHIS.add("211010");
        list_DHIS.add("211013");
        list_DHIS.add("211033");
        list_DHIS.add("211122");
        list_DHIS.add("211003");
        list_DHIS.add("211062");
        list_DHIS.add("211113");
        list_DHIS.add("211007");
        list_DHIS.add("211040");
        list_DHIS.add("211004");
        list_DHIS.add("211060");
        list_DHIS.add("211063");
        list_DHIS.add("211098");
        list_DHIS.add("211099");
        list_DHIS.add("211006");
        list_DHIS.add("211042");
        list_DHIS.add("211064");
        list_DHIS.add("211002");
        list_DHIS.add("211069");
        list_DHIS.add("211074");
        list_DHIS.add("211011");
        list_DHIS.add("211065");
        list_DHIS.add("211107");
        list_DHIS.add("211043");
        list_DHIS.add("211097");
        list_DHIS.add("211108");
        list_DHIS.add("211109");
        list_DHIS.add("211070");
        list_DHIS.add("211111");
        list_DHIS.add("211112");
        list_DHIS.add("211012");
        list_DHIS.add("211015");
        list_DHIS.add("211055");
        list_DHIS.add("211121");
        list_DHIS.add("211050");
        list_DHIS.add("211072");
        list_DHIS.add("211073");
        list_DHIS.add("211083");
        list_DHIS.add("211035");
        list_DHIS.add("211014");
        list_DHIS.add("211034");
        list_DHIS.add("211031");
        list_DHIS.add("211045");
        list_DHIS.add("211056");
        list_DHIS.add("211016");
        list_DHIS.add("211094");
        list_DHIS.add("211114");
        list_DHIS.add("211020");
        list_DHIS.add("211071");
        list_DHIS.add("211078");
        list_DHIS.add("211084");
        list_DHIS.add("211085");
        list_DHIS.add("211103");
        list_DHIS.add("211104");
        list_DHIS.add("211115");
        list_DHIS.add("211116");
        list_DHIS.add("211017");
        list_DHIS.add("211019");
        list_DHIS.add("211067");
        list_DHIS.add("211102");
        list_DHIS.add("211092");
        list_DHIS.add("211105");
        list_DHIS.add("211021");
        list_DHIS.add("211022");
        list_DHIS.add("211023");
        list_DHIS.add("211066");
        list_DHIS.add("211018");
        list_DHIS.add("211057");
        list_DHIS.add("211100");
        list_DHIS.add("211036");
        list_DHIS.add("211038");
        list_DHIS.add("211024");
        list_DHIS.add("211076");
        list_DHIS.add("211101");
        list_DHIS.add("211046");
        list_DHIS.add("211025");
        list_DHIS.add("211081");
        list_DHIS.add("211008");
        list_DHIS.add("211027");
        list_DHIS.add("211095");
        list_DHIS.add("211026");
        list_DHIS.add("211032");
        list_DHIS.add("211039");
        list_DHIS.add("211048");
        list_DHIS.add("211051");
        list_DHIS.add("211079");
        list_DHIS.add("211028");
        list_DHIS.add("211044");
        list_DHIS.add("211077");
        list_DHIS.add("211054");
        list_DHIS.add("211068");
        list_DHIS.add("211080");
        list_DHIS.add("211086");
        list_DHIS.add("211087");
        list_DHIS.add("211117");
        list_DHIS.add("211041");
        list_DHIS.add("211088");
        list_DHIS.add("211047");
        list_DHIS.add("211091");
        list_DHIS.add("211030");
        list_DHIS.add("211089");
        list_DHIS.add("211119");
        list_DHIS.add("211120");
        list_DHIS.add("211053");
        list_DHIS.add("211058");
        list_DHIS.add("211061");
        list_DHIS.add("211090");
        list_DHIS.add("211052");
        list_DHIS.add("211082");
        list_DHIS.add("211029");
        list_DHIS.add("211059");
        list_DHIS.add("211075");
        list_DHIS.add("211093");
        list_DHIS.add("211106");
        list_DHIS.add("211118");
        list_DHIS.add("211037");
        list_DHIS.add("234031");
        list_DHIS.add("234307");
        list_DHIS.add("234032");
        list_DHIS.add("234115");
        list_DHIS.add("234030");
        list_DHIS.add("234061");
        list_DHIS.add("234048");
        list_DHIS.add("234083");
        list_DHIS.add("234051");
        list_DHIS.add("234105");
        list_DHIS.add("234053");
        list_DHIS.add("234078");
        list_DHIS.add("234099");
        list_DHIS.add("234106");
        list_DHIS.add("234072");
        list_DHIS.add("234144");
        list_DHIS.add("234015");
        list_DHIS.add("234121");
        list_DHIS.add("234013");
        list_DHIS.add("234020");
        list_DHIS.add("234111");
        list_DHIS.add("234890");
        list_DHIS.add("234012");
        list_DHIS.add("234014");
        list_DHIS.add("234108");
        list_DHIS.add("234109");
        list_DHIS.add("234019");
        list_DHIS.add("234010");
        list_DHIS.add("234016");
        list_DHIS.add("234017");
        list_DHIS.add("234136");
        list_DHIS.add("234441");
        list_DHIS.add("234058");
        list_DHIS.add("234107");
        list_DHIS.add("234018");
        list_DHIS.add("234113");
        list_DHIS.add("234045");
        list_DHIS.add("234070");
        list_DHIS.add("234117");
        list_DHIS.add("234042");
        list_DHIS.add("234043");
        list_DHIS.add("234127");
        list_DHIS.add("234777");
        list_DHIS.add("234071");
        list_DHIS.add("234063");
        list_DHIS.add("234085");
        list_DHIS.add("234303");
        list_DHIS.add("234001");
        list_DHIS.add("234138");
        list_DHIS.add("234114");
        list_DHIS.add("234116");
        list_DHIS.add("234137");
        list_DHIS.add("234029");
        list_DHIS.add("234090");
        list_DHIS.add("234128");
        list_DHIS.add("234775");
        list_DHIS.add("234034");
        list_DHIS.add("234101");
        list_DHIS.add("234141");
        list_DHIS.add("234301");
        list_DHIS.add("234049");
        list_DHIS.add("234104");
        list_DHIS.add("234052");
        list_DHIS.add("234305");
        list_DHIS.add("234047");
        list_DHIS.add("234073");
        list_DHIS.add("234050");
        list_DHIS.add("234064");
        list_DHIS.add("234102");
        list_DHIS.add("252097");
        list_DHIS.add("252098");
        list_DHIS.add("252100");
        list_DHIS.add("252101");
        list_DHIS.add("252095");
        list_DHIS.add("252096");
        list_DHIS.add("252099");
        list_DHIS.add("252088");
        list_DHIS.add("252089");
        list_DHIS.add("252090");
        list_DHIS.add("252103");
        list_DHIS.add("252087");
        list_DHIS.add("252084");
        list_DHIS.add("252080");
        list_DHIS.add("252081");
        list_DHIS.add("252082");
        list_DHIS.add("252083");
        list_DHIS.add("252085");
        list_DHIS.add("252086");
        list_DHIS.add("252093");
        list_DHIS.add("252094");
        list_DHIS.add("252075");
        list_DHIS.add("252076");
        list_DHIS.add("252077");
        list_DHIS.add("252078");
        list_DHIS.add("252079");
        list_DHIS.add("252091");
        list_DHIS.add("252092");
        list_DHIS.add("252017");
        list_DHIS.add("252018");
        list_DHIS.add("252012");
        list_DHIS.add("252007");
        list_DHIS.add("252008");
        list_DHIS.add("252004");
        list_DHIS.add("252005");
        list_DHIS.add("252006");
        list_DHIS.add("252002");
        list_DHIS.add("252003");
        list_DHIS.add("252001");
        list_DHIS.add("252009");
        list_DHIS.add("252010");
        list_DHIS.add("252011");
        list_DHIS.add("252013");
        list_DHIS.add("252014");
        list_DHIS.add("252015");
        list_DHIS.add("252016");
        list_DHIS.add("252057");
        list_DHIS.add("252058");
        list_DHIS.add("252059");
        list_DHIS.add("252055");
        list_DHIS.add("252056");
        list_DHIS.add("252050");
        list_DHIS.add("252051");
        list_DHIS.add("252052");
        list_DHIS.add("252045");
        list_DHIS.add("252046");
        list_DHIS.add("252047");
        list_DHIS.add("252102");
        list_DHIS.add("252040");
        list_DHIS.add("252041");
        list_DHIS.add("252048");
        list_DHIS.add("252049");
        list_DHIS.add("252039");
        list_DHIS.add("252053");
        list_DHIS.add("252054");
        list_DHIS.add("252042");
        list_DHIS.add("252043");
        list_DHIS.add("252044");
        list_DHIS.add("252020");
        list_DHIS.add("252021");
        list_DHIS.add("252025");
        list_DHIS.add("252026");
        list_DHIS.add("252027");
        list_DHIS.add("252028");
        list_DHIS.add("252029");
        list_DHIS.add("252036");
        list_DHIS.add("252037");
        list_DHIS.add("252034");
        list_DHIS.add("252035");
        list_DHIS.add("252038");
        list_DHIS.add("252022");
        list_DHIS.add("252023");
        list_DHIS.add("252024");
        list_DHIS.add("252030");
        list_DHIS.add("252031");
        list_DHIS.add("252032");
        list_DHIS.add("252033");
        list_DHIS.add("252019");
        list_DHIS.add("252064");
        list_DHIS.add("252065");
        list_DHIS.add("252066");
        list_DHIS.add("252067");
        list_DHIS.add("252068");
        list_DHIS.add("252069");
        list_DHIS.add("252070");
        list_DHIS.add("252071");
        list_DHIS.add("252072");
        list_DHIS.add("252061");
        list_DHIS.add("252062");
        list_DHIS.add("252063");
        list_DHIS.add("252073");
        list_DHIS.add("252074");
        list_DHIS.add("252060");


        ArrayAdapter<String> dataAdapterD = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, list_DHIS);

        dataAdapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        A_A5.setAdapter(dataAdapterD);


    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
