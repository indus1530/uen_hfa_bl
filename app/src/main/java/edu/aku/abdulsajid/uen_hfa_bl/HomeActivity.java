package edu.aku.abdulsajid.uen_hfa_bl;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import utils.HhMemberModel;
import utils.MyPreferences;
import utils.Validation;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView Profile_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final MyPreferences preferences = new MyPreferences(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        HhMemberModel.male.clear();
        HhMemberModel.female.clear();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        } else if (id == R.id.action_url) {
            // Intent i = new Intent(this, ServerSettingsActivity.class);
            //startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent = null;

        final MyPreferences preferences = new MyPreferences(HomeActivity.this);
/*
        if (id == R.id.nav_uploaded) {
            intent = new Intent(this, SurveyUploadedActivity.class);
        } else */
        if (id == R.id.nav_new) {
            Validation.clearValidation();
            intent = new Intent(this, SurveyActivity.class);
        } else if (id == R.id.nav_pending) {
            intent = new Intent(this, SurveyPendingActivity.class);
        } else if (id == R.id.nav_completed) {
            intent = new Intent(this, SurveyCompletedActivity.class);
        } else if (id == R.id.nav_lang_e) {
            preferences.setlanguage("en", "US");
            Toast.makeText(this, "Application Language Changed to English", Toast.LENGTH_LONG).show();

        }


        //  else if (id == R.id.nav_rejected) {
        //    intent = new Intent(this, SurveyRejectedActivity.class);
        //    }
        else if (id == R.id.nav_notifi) {

        } else if (id == R.id.nav_logout) {
            AlertDialog.Builder b = new AlertDialog.Builder(this);
            b.setTitle("Logout");
            b.setMessage("Do you want to continue logging out?");
            b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    new MyPreferences(HomeActivity.this).removeUserId();
                    Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            }).show();
        }
        if (intent != null)
            startActivity(intent);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
