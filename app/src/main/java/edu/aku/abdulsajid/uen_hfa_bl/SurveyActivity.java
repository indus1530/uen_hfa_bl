package edu.aku.abdulsajid.uen_hfa_bl;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import utils.Validation;

public class SurveyActivity extends AppCompatActivity implements
        GpsFragment.OnFragmentInteractionListener, Fragment_A.OnFragmentInteractionListener,

        Fragment_B.OnFragmentInteractionListener, Fragment_C.OnFragmentInteractionListener,
        Fragment_D.OnFragmentInteractionListener, Fragment_E.OnFragmentInteractionListener,
        Fragment_F.OnFragmentInteractionListener, Fragment_G.OnFragmentInteractionListener,
        Fragment_H.OnFragmentInteractionListener, Fragment_I.OnFragmentInteractionListener,
        Fragment_J.OnFragmentInteractionListener, Fragment_K.OnFragmentInteractionListener,
        Fragment_R.OnFragmentInteractionListener, Fragment_Q.OnFragmentInteractionListener,
        Fragment_P.OnFragmentInteractionListener, Fragment_O.OnFragmentInteractionListener,
        Fragment_N.OnFragmentInteractionListener, Fragment_M.OnFragmentInteractionListener,
        Fragment_L.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_survey);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);


        actionBar.hide();


        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("GSP").
                setTabListener(new TabListener(new GpsFragment())));
        actionBar.addTab(actionBar.newTab().setText("A").
                setTabListener(new TabListener(new Fragment_A())));
        actionBar.addTab(actionBar.newTab().setText("B").
                setTabListener(new TabListener(new Fragment_B())));
        actionBar.addTab(actionBar.newTab().setText("C").
                setTabListener(new TabListener(new Fragment_C())));
        actionBar.addTab(actionBar.newTab().setText("D").
                setTabListener(new TabListener(new Fragment_D())));
        actionBar.addTab(actionBar.newTab().setText("E").
                setTabListener(new TabListener(new Fragment_E())));
        actionBar.addTab(actionBar.newTab().setText("F").
                setTabListener(new TabListener(new Fragment_F())));
        actionBar.addTab(actionBar.newTab().setText("G").
                setTabListener(new TabListener(new Fragment_G())));
        actionBar.addTab(actionBar.newTab().setText("H").
                setTabListener(new TabListener(new Fragment_H())));
        actionBar.addTab(actionBar.newTab().setText("I").
                setTabListener(new TabListener(new Fragment_I())));
        actionBar.addTab(actionBar.newTab().setText("J").
                setTabListener(new TabListener(new Fragment_J())));
        actionBar.addTab(actionBar.newTab().setText("K").
                setTabListener(new TabListener(new Fragment_K())));


        actionBar.addTab(actionBar.newTab().setText("L").
                setTabListener(new TabListener(new Fragment_L())));
        actionBar.addTab(actionBar.newTab().setText("M").
                setTabListener(new TabListener(new Fragment_M())));

        actionBar.addTab(actionBar.newTab().setText("N").
                setTabListener(new TabListener(new Fragment_N())));

        actionBar.addTab(actionBar.newTab().setText("O").
                setTabListener(new TabListener(new Fragment_O())));

        actionBar.addTab(actionBar.newTab().setText("P").
                setTabListener(new TabListener(new Fragment_P())));

        actionBar.addTab(actionBar.newTab().setText("Q").
                setTabListener(new TabListener(new Fragment_Q())));

        actionBar.addTab(actionBar.newTab().setText("R").
                setTabListener(new TabListener(new Fragment_R())));


        // from where to resume??


        Fragment fragment = null;


        // fragment = new GpsFragment();
        if (Validation.atstage.equals("A")) {
            fragment = new Fragment_B();
        } else if (Validation.atstage.equals("B")) {
            fragment = new Fragment_C();
        } else if (Validation.atstage.equals("C")) {
            fragment = new Fragment_D();
        } else if (Validation.atstage.equals("D")) {
            fragment = new Fragment_E();
        } else if (Validation.atstage.equals("E")) {
            fragment = new Fragment_F();
        } else if (Validation.atstage.equals("F")) {
            fragment = new Fragment_G();
        } else if (Validation.atstage.equals("G")) {
            fragment = new Fragment_H();
        } else if (Validation.atstage.equals("H")) {
            fragment = new Fragment_I();
        } else if (Validation.atstage.equals("I")) {
            fragment = new Fragment_J();
        } else if (Validation.atstage.equals("J")) {
            fragment = new Fragment_K();
        } else if (Validation.atstage.equals("K")) {
            fragment = new Fragment_L();
        } else if (Validation.atstage.equals("L")) {
            fragment = new Fragment_M();
        } else if (Validation.atstage.equals("M")) {
            fragment = new Fragment_N();
        } else if (Validation.atstage.equals("N")) {
            fragment = new Fragment_O();
        } else if (Validation.atstage.equals("O")) {
            fragment = new Fragment_P();
        } else if (Validation.atstage.equals("P")) {
            fragment = new Fragment_Q();
        } else if (Validation.atstage.equals("Q")) {
            fragment = new Fragment_R();
        } else {

            fragment = new GpsFragment();
        }


        // start from that fragment..
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftu = fm.beginTransaction();
        ftu.replace(R.id.frag_container, fragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onBackPressed() {
        final AlertDialog b = new AlertDialog.Builder(this).create();

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_back, null);
        b.setView(v);


        Button btnPending = (Button) v.findViewById(R.id.btn_dialog_back_pending);
        Button btnCancel = (Button) v.findViewById(R.id.btn_dialog_back_cancel);


        //endregion


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SurveyActivity.super.onBackPressed();
                b.cancel();
            }
        });

        btnPending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b.cancel();

            }
        });


        //show dialog
        b.show();
    }
}


/*  Class: TabListener */
class TabListener implements ActionBar.TabListener {
    public Fragment fragment;

    public TabListener(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.frag_container, fragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}