package data;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;
import utils.Validation;

import static data.LocalDataManager.database;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class UploadHouseInfoAsync extends AsyncTask {

    public static ProgressDialog dialog;
    Context mContext;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;
    // wait for Toast then kill app
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

    public UploadHouseInfoAsync(Context context) {

        //stop interview
        // if(InterviewUploadingStatus.status<2)
        //   this.cancel(false);

        mContext = context;
        dialog = new ProgressDialog(context);
        param = new HashMap<>();

    }

    @Override
    protected void onPreExecute() {

        dialog.setMessage("Uploading interview Please wait ....");
        dialog.setCancelable(false);
        dialog.show();


        HashMap<String, List<String>> map = QuestionModel.quest.get("a");


        //region Query

        String query = "select" +
                "     h.A1 ," +
                "     h.A2 ," +
                "     h.A3 ," +
                "     h.A4 ," +
                "     h.A5 ," +
                "     h.A6 ," +
                "     h.A7 ," +
                "     h.A8 ," +
                "     h.A9 ," +
                "    h.A10 ," +
                "    h.A11 ," +
                "    h.A12 ," +
                "  h.A13_1 ," +
                "  h.A13_2 ," +
                "  h.A14," +
                "  h.A14_1 ," +
                "  h.A14_2 ," +
                "  h.A14_3_1 ," +
                "  h.A14_3_2 ," +
                "  A14_3_3 ," +
                "  A14_3_4 ," +
                "  A14_3_5 ," +
                "  A14_3_6 ," +
                "  A14_3_7 ," +
                "  A14_3_8 ," +
                "  A14_3_9 ," +
                " A14_3_10 ," +
                " A14_3_11 ," +
                " A14_3_12 ," +
                " A14_3_13 ," +
                " A14_3_14 ," +
                " A14_3_15 ," +
                " A14_3_16 ," +
                " A14_3_17 ," +
                " A14_3_17 ," +
                "    A15 ," +
                "    A16 ," +
                "    A17 ," +
                "    A18 ," +
                "    A19 ," +
                "    A20 ," +
                "    A21 ," +
                "     B1 ," +
                "     B2 ," +
                "     B3 ," +
                "     B4 ," +
                "     B5 ," +
                "   B6_1 ," +
                "   B6_2 ," +
                "   B6_3 ," +
                "   B6_4 ," +
                "   B7_1 ," +
                "   B7_2 ," +
                "   B7_3 ," +
                "   B7_4 ," +
                " C1_1_1 ," +
                " C1_1_2 ," +
                " C1_1_3 ," +
                " C1_1_4 ," +
                " C1_2_1 ," +
                " C1_2_2 ," +
                " C1_2_3 ," +
                " C1_2_4 ," +
                " C1_3_1 ," +
                " C1_3_2 ," +
                " C1_3_3 ," +
                " C1_3_4 ," +
                " C1_4_1 ," +
                " C1_4_2 ," +
                " C1_4_3 ," +
                " C1_4_4 ," +
                " C1_5_1 ," +
                " C1_5_2 ," +
                " C1_5_3 ," +
                " C1_5_4 ," +
                " C1_6_1 ," +
                " C1_6_2 ," +
                " C1_6_3 ," +
                " C1_6_4 ," +
                " C1_7_1 ," +
                " C1_7_2 ," +
                " C1_7_3 ," +
                " C1_7_4 ," +
                " C1_8_1 ," +
                " C1_8_2 ," +
                " C1_8_3 ," +
                " C1_8_4 ," +
                " C1_9_1 ," +
                " C1_9_2 ," +
                " C1_9_3 ," +
                " C1_9_4 ," +
                "C1_10_1 ," +
                "C1_10_2 ," +
                "C1_10_3 ," +
                "C1_10_4 ," +
                "C1_11_1 ," +
                "C1_11_2 ," +
                "C1_11_3 ," +
                "C1_11_4 ," +
                "C1_12_1 ," +
                "C1_12_2 ," +
                "C1_12_3 ," +
                "C1_12_4 ," +
                "C1_13_1 ," +
                "C1_13_2 ," +
                "C1_13_3 ," +
                "C1_13_4 ," +
                "C1_14_1 ," +
                "C1_14_2 ," +
                "C1_14_3 ," +
                "C1_14_4 ," +
                "C1_15_1 ," +
                "C1_15_2 ," +
                "C1_15_3 ," +
                "C1_15_4 ," +
                "C1_16_1 ," +
                "C1_16_2 ," +
                "C1_16_3 ," +
                "C1_16_4 ," +
                "C1_17_1 ," +
                "C1_17_2 ," +
                "C1_17_3 ," +
                "C1_17_4 ," +
                "C1_18_1 ," +
                "C1_18_2 ," +
                "C1_18_3 ," +
                "C1_18_4 ," +
                "C1_19_1 ," +
                "C1_19_2 ," +
                "C1_19_3 ," +
                "C1_19_4 ," +
                "C1_20_1 ," +
                "C1_20_2 ," +
                "C1_20_3 ," +
                "C1_20_4 ," +
                "C1_21_1 ," +
                "C1_21_2 ," +
                "C1_21_3 ," +
                "C1_21_4 ," +
                "C1_22_1 ," +
                "C1_22_2 ," +
                "C1_22_3 ," +
                "C1_22_4 ," +
                "C1_23_1 ," +
                "C1_23_2 ," +
                "C1_23_3 ," +
                "C1_23_4 ," +
                "C1_24_1 ," +
                "C1_24_2 ," +
                "C1_24_3 ," +
                "C1_24_4 ," +
                "C1_25_1 ," +
                "C1_25_2 ," +
                "C1_25_3 ," +
                "C1_25_4 ," +
                "C1_26_1 ," +
                "C1_26_2 ," +
                "C1_26_3 ," +
                "C1_26_4 ," +
                "C1_27_1 ," +
                "C1_27_2 ," +
                "C1_27_3 ," +
                "C1_27_4 ," +
                "C1_28_1 ," +
                "C1_28_2 ," +
                "C1_28_3 ," +
                "C1_28_4 ," +
                "C1_29_1 ," +
                "C1_29_2 ," +
                "C1_29_3 ," +
                "C1_29_4 ," +
                "C1_30_1 ," +
                "C1_30_2 ," +
                "C1_30_3 ," +
                "C1_30_4 ," +
                "C1_31_1 ," +
                "C1_31_2 ," +
                "C1_31_3 ," +
                "C1_31_4 ," +
                "C1_32_1 ," +
                "C1_32_2 ," +
                "C1_32_3 ," +
                "C1_32_4 ," +
                "C1_33_1 ," +
                "C1_33_2 ," +
                "C1_33_3 ," +
                "C1_33_4 ," +
                "C1_34_1 ," +
                "C1_34_2 ," +
                "C1_34_3 ," +
                "C1_34_4 ," +
                "C1_35_1 ," +
                "C1_35_2 ," +
                "C1_35_3 ," +
                "C1_35_4 ," +
                "C1_36_1 ," +
                "C1_36_2 ," +
                "C1_36_3 ," +
                "C1_36_4 ," +
                "C1_37_1 ," +
                "C1_37_2 ," +
                "C1_37_3 ," +
                "C1_37_4 ," +
                "   C2_1 ," +
                "   C2_2 ," +
                "   C2_3 ," +
                "   C2_4 ," +
                "   C2_5 ," +
                "   C2_6 ," +
                "   C2_7 ," +
                "   C2_8 ," +
                "   C2_9 ," +
                "  C2_10 ," +
                "  C2_11 ," +
                "  C2_12 ," +
                "  C2_13 ," +
                "  C2_14 ," +
                "  C2_15 ," +
                "  C2_16 ," +
                "  C2_17 ," +
                "  C2_18 ," +
                "  C2_19 ," +
                "  C2_20 ," +
                "  C2_21 ," +
                "  C2_22 ," +
                "  C2_23 ," +
                "  C2_24 ," +
                "  C2_25 ," +
                "  C2_26 ," +
                "  C2_27 ," +
                "  C2_28 ," +
                "  C2_29 ," +
                "  C2_30 ," +
                "  C2_31 ," +
                "  C2_32 ," +
                "  C2_33 ," +
                "  C2_34 ," +
                "  C2_35 ," +
                "  C2_36 ," +
                "  C2_37 ," +
                "  C2_38 ," +
                "  C2_39 ," +
                "  C2_40 ," +
                "  C2_41 ," +
                "  C2_42 ," +
                "  C2_43 ," +
                "  C2_44 ," +
                "  C2_45 ," +
                "  C2_46 ," +
                "  C2_47 ," +
                "  C2_48 ," +
                "  C2_49 ," +
                "  C2_50 ," +
                "  C2_51 ," +
                "  C2_52 ," +
                "  C2_53 ," +
                "  C2_54 ," +
                "  C2_55 ," +
                "  C2_56 ," +
                "  C2_57 ," +
                "  C2_58 ," +
                "  C2_59 ," +
                "  C2_60 ," +
                "  C2_61 ," +
                "  C2_62 ," +
                "  C2_63 ," +
                "  C2_64 ," +
                "  C2_65 ," +
                "  C2_66 ," +
                "  C2_67 ," +
                "  C2_68 ," +
                "  C2_69 ," +
                "  C2_70 ," +
                "  C2_71 ," +
                "  C2_72 ," +
                "  C2_73 ," +
                "  C2_74 ," +
                "  C2_75 ," +
                "     C3 ," +
                "     C4 ," +
                "     C5 ," +
                "     C6 ," +
                "     C7 ," +
                "     D1 ," +
                "     D2 ," +
                "     D3 ," +
                "     D4 ," +
                "     D5 ," +
                "     D6 ," +
                "     E1 ," +
                "     E2 ," +
                "     E3 ," +
                "     E4 ," +
                "     E5 ," +
                "     E6 ," +
                "   F1_1 ," +
                "   F1_2 ," +
                "   F1_3 ," +
                "   F1_4 ," +
                "   F1_5 ," +
                "   F1_6 ," +
                "   F1_7 ," +
                "   F1_8 ," +
                "   F1_9 ," +
                "  F1_10 ," +
                "  F1_11 ," +
                "  F1_12 ," +
                "  F1_13 ," +
                "  F1_14 ," +
                "  F1_15 ," +
                "  F1_16 ," +
                "  F1_17 ," +
                "  F1_18 ," +
                "  F1_19 ," +
                "  F1_20 ," +
                "  F1_21 ," +
                "  F1_22 ," +
                "  F1_23 ," +
                "  F1_24 ," +
                "  F1_25 ," +
                "   F2_1 ," +
                "   F2_2 ," +
                "   F2_3 ," +
                "   F2_4 ," +
                "   F2_5 ," +
                "   F2_6 ," +
                "   F2_7 ," +
                "   F2_8 ," +
                "   F2_9 ," +
                "  F2_10 ," +
                "  F2_11 ," +
                "  F2_12 ," +
                "  F2_13 ," +
                "  F2_14 ," +
                "  F2_15 ," +
                "   F3_1 ," +
                "   F3_2 ," +
                "   F3_3 ," +
                "   F3_4 ," +
                "   F3_5 ," +
                "   F3_6 ," +
                "   F3_7 ," +
                "   F3_8 ," +
                "   F3_9 ," +
                "  F3_10 ," +
                "  F3_11 ," +
                "  F3_12 ," +
                "  F3_13 ," +
                "  F3_14 ," +
                "   G1_1 ," +
                "   G1_2 ," +
                "   G1_3 ," +
                "   G1_4 ," +
                "   G1_5 ," +
                "     G2 ," +
                "     G3 ," +
                "     G4 ," +
                "   G5_1 ," +
                "   G5_2 ," +
                "   G5_3 ," +
                "   G5_4 ," +
                "   G5_5 ," +
                "   G5_6 ," +
                "   G5_7 ," +
                "   G6_1 ," +
                "   G6_2 ," +
                "   G6_3 ," +
                "   G6_4 ," +
                "     G7 ," +
                "     G8 ," +
                "   G9_1 ," +
                "   G9_2 ," +
                "   G9_3 ," +
                "  G10_1 ," +
                "  G10_2 ," +
                "  G10_3 ," +
                "  G11_1 ," +
                "  G11_2 ," +
                "  G11_3 ," +
                "  G11_4 ," +
                "  G11_5 ," +
                "  G11_6 ," +
                "  G11_7 ," +
                "  G11_8 ," +
                "  G11_9 ," +
                " G11_10 ," +
                " G11_11 ," +
                " G11_12 ," +
                " G11_13 ," +
                "     H1 ," +
                "     H2 ," +
                "     H3 ," +
                "   H4_1 ," +
                "   H4_2 ," +
                "   H4_3 ," +
                "   H4_4 ," +
                "   H4_5 ," +
                "   H4_6 ," +
                "   H4_7 ," +
                "     H5 ," +
                "     H6 ," +
                "     H7 ," +
                "     H8 ," +
                "   H9_1 ," +
                "   H9_2 ," +
                "   H9_3 ," +
                "   H9_4 ," +
                "   H9_5 ," +
                "   H9_6 ," +
                "   H9_7 ," +
                "   H9_8 ," +
                "   H9_9 ," +
                "     I1 ," +
                "     I2 ," +
                "     I3 ," +
                "   I4_1 ," +
                "   I4_2 ," +
                "   I4_3 ," +
                "   I4_4 ," +
                "   I4_5 ," +
                "     I5 ," +
                "     I6 ," +
                "     I7 ," +
                "     I8 ," +
                "     I9 ," +
                "    I10 ," +
                "    I11 ," +
                "    I12 ," +
                "    I13 ," +
                "    I14 ," +
                "    I15 ," +
                "     J1 ," +
                "     J2 ," +
                "     J3 ," +
                "     J4 ," +
                "     J5 ," +
                "     J6 ," +
                "   J7_1 ," +
                "   J7_2 ," +
                "   J7_3 ," +
                "   J7_4 ," +
                "   J7_5 ," +
                "   J7_6 ," +
                "   J7_7 ," +
                "   J7_8 ," +
                "   J7_9 ," +
                "     J8 ," +
                "     J9 ," +
                "    J10 ," +
                "     K1 ," +
                "     K2 ," +
                "     K3 ," +
                "     L1 ," +
                "     L2 ," +
                "     L3 ," +
                "     L4 ," +
                "   L5_1 ," +
                "   L5_2 ," +
                "   L5_3 ," +
                "   L5_4 ," +
                "   L5_5 ," +
                "   L5_6 ," +
                "   L5_7 ," +
                "   L6_1 ," +
                "   L6_2 ," +
                "   L6_3 ," +
                "   L6_4 ," +
                "   L6_5 ," +
                "   L6_6 ," +
                "   L6_7 ," +
                "   L7_1 ," +
                "   L7_2 ," +
                "   L7_3 ," +
                "   L7_4 ," +
                "   L7_5 ," +
                "   L7_6 ," +
                "   L7_7 ," +
                "   L8_1 ," +
                "   L8_2 ," +
                "   L8_3 ," +
                "   L8_4 ," +
                "   L8_5 ," +
                "   L8_6 ," +
                "   L8_7 ," +
                "   L9_1 ," +
                "   L9_2 ," +
                "   L9_3 ," +
                "   L9_4 ," +
                "   L9_5 ," +
                "   L9_6 ," +
                "   L9_7 ," +
                "    L10 ," +
                "  L11_1 ," +
                "  L11_2 ," +
                "  L11_3 ," +
                "  L11_4 ," +
                "  L11_5 ," +
                "  L11_6 ," +
                "    L12 ," +
                "  L13_1 ," +
                "  L13_2 ," +
                "  L13_3 ," +
                "  L13_4 ," +
                "  L13_5 ," +
                "  L13_6 ," +
                "  L13_7 ," +
                "     M1 ," +
                "     M2 ," +
                "     M3 ," +
                "   M4_1 ," +
                "   M4_2 ," +
                "   M4_3 ," +
                "   M4_4 ," +
                "   M4_5 ," +
                "   M4_6 ," +
                "   M4_7 ," +
                "   M4_8 ," +
                "   M4_9 ," +
                "  M4_10 ," +
                "     M5 ," +
                "     M6 ," +
                "     M7 ," +
                "     M8 ," +
                "     M9 ," +
                "    M10 ," +
                "    M11 ," +
                "    M12 ," +
                "   N1_1 ," +
                "   N1_2 ," +
                "   N1_3 ," +
                "   N1_4 ," +
                "   N2_1 ," +
                "   N2_2 ," +
                "   N2_3 ," +
                "     N3 ," +
                "     N4 ," +
                "     N5 ," +
                "     N6 ," +
                "     N7 ," +
                "     N8 ," +
                "     N9 ," +
                "    N10 ," +
                "  N11_1 ," +
                "  N11_2 ," +
                "  N11_3 ," +
                "  N11_4 ," +
                "  N11_5 ," +
                "  N11_6 ," +
                "  N11_7 ," +
                "  N11_8 ," +
                "  N11_9 ," +
                " N11_10 ," +
                " N11_11 ," +
                " N11_12 ," +
                " N11_13 ," +
                " N11_14 ," +
                " N11_15 ," +
                " N11_16 ," +
                " N11_17 ," +
                " N11_18 ," +
                " N11_19 ," +
                " N11_20 ," +
                "    N12 ," +
                "  N13_1 ," +
                "  N13_2 ," +
                "  N13_3 ," +
                "  N13_4 ," +
                "  N13_5 ," +
                "  N13_6 ," +
                "  N13_7 ," +
                "  N13_8 ," +
                "  N13_9 ," +
                " N13_10 ," +
                "  N14_1 ," +
                "  N14_2 ," +
                "N14_3 ," +
                "N14_4 ," +
                "N14_5 ," +
                "N14_6 ," +
                "N15_1 ," +
                "N15_2 ," +
                "N15_3 ," +
                "N16_1 ," +
                "N16_2 ," +
                "N16_3 ," +
                "  N17 ," +
                " O1_1 ," +
                " O1_2 ," +
                " O1_3 ," +
                " O1_4 ," +
                " O2_1 ," +
                " O2_2 ," +
                " O2_3 ," +
                " O2_4 ," +
                "   O3 ," +
                "   O4 ," +
                " O5_1 ," +
                " O5_2 ," +
                " O5_3 ," +
                " O5_4 ," +
                " O5_5 ," +
                " O5_6 ," +
                " O5_7 ," +
                " O5_8 ," +
                " O5_9 ," +
                "O5_10 ," +
                "O5_11 ," +
                "O5_12 ," +
                "O5_13 ," +
                "O5_14 ," +
                "O5_15 ," +
                "O5_16 ," +
                "O5_17 ," +
                "O5_18 ," +
                "O5_19 ," +
                "O5_20 ," +
                "O5_21 ," +
                "   O6 ," +
                " O7_1 ," +
                " O7_2 ," +
                " O7_3 ," +
                " O7_4 ," +
                " O7_5 ," +
                " O7_6 ," +
                " O7_7 ," +
                " O7_8 ," +
                " O7_9 ," +
                "O7_10 ," +
                "   P1 ," +
                "   P2 ," +
                "   P3 ," +
                "   P4 ," +
                "   P5 ," +
                "   P6 ," +
                "   P7 ," +
                "   P8 ," +
                "   P9 ," +
                "  P10 ," +
                "  P11 ," +
                "  P12 ," +
                "P13_1 ," +
                "P13_2 ," +
                "P13_3 ," +
                "P13_4 ," +
                "  P14 ," +
                "P15_1 ," +
                "P15_2 ," +
                "P15_3 ," +
                "  P16 ," +
                "  P17 ," +
                "  P18 ," +
                "  P19 ," +
                "P20_1 ," +
                "P20_2 ," +
                "P20_3 ," +
                "P21_1 ," +
                "P21_2 ," +
                "P21_3 ," +
                "P21_4 ," +
                "P21_5 ," +
                "P22_1 ," +
                "P22_2 ," +
                "P22_3 ," +
                "P22_4 ," +
                "P22_5 ," +
                "P22_6 ," +
                "P22_7 ," +
                "P22_8 ," +
                "   Q1 ," +
                "   Q2 ," +
                " Q3_1 ," +
                " Q3_2 ," +
                " Q3_3 ," +
                " Q3_4 ," +
                " Q4_1 ," +
                " Q4_2 ," +
                " Q4_3 ," +
                " Q4_4 ," +
                " Q4_5 ," +
                " Q4_6 ," +
                " Q4_7 ," +
                " Q4_8 ," +
                " Q4_9 ," +
                "Q4_10 ," +
                "Q4_11 ," +
                "Q4_12 ," +
                "Q4_13 ," +
                "Q4_14 ," +
                "Q4_15 ," +
                "Q4_16 ," +
                "Q4_17 ," +
                "Q4_18 ," +
                "Q4_19 ," +
                "Q4_20 ," +
                "Q4_21 ," +
                "Q4_22 ," +
                "Q4_23 ," +
                "Q4_24 ," +
                "   Q5 ," +
                "   Q6 ," +
                " Q7_1 ," +
                " Q7_2 ," +
                " Q7_3 ," +
                " Q7_4 ," +
                " Q7_5 ," +
                " Q7_6 ," +
                " Q7_7 ," +
                " Q7_8 ," +
                " Q7_9 ," +
                " Q8_1 ," +
                " Q8_2 ," +
                " Q8_3 ," +
                " Q8_4 ," +
                " Q8_5 ," +
                " Q8_6 ," +
                " Q8_7 ," +
                " Q8_8 ," +
                " Q8_9 ," +
                "Q8_10 ," +
                "Q8_11 ," +
                "Q8_12 ," +
                "Q8_13 ," +
                "Q8_14 ," +
                "Q8_15 ," +
                "  Q8_16 ," +
                "   Q9 ," +
                "  Q10 ," +
                "  Q11 ," +
                "   R1 ," +
                "   R2 ," +
                "   R3 ," +
                "   R4 ," +
                "   R5 ," +
                "   R6 ," +
                "   R7 ," +
                "   R8 ," +
                "   R9 ," +
                "  R10 ," +
                "  R11 ," +
                "  R12 ," +
                "  R13 ," +
                "   R14," +
                "   Interview_date," +
                "   Interview_start_time," +
                "   Interview_end_time," +
                "   Interview_status," +
                "   Interview_user," +
                "   C2_76," +
                "   C4_1, " +
                "   C2_77," +
                "   C2_78," +
                "   R15," +
                "   P1_1, " +
                "   H4_8, " +
                "   H9_10 " +

                " from hfa h join tbllog lg on h.id=lg.hfa_id  where h.id = %s ORDER BY h.id desc LIMIT 1";

        //  query="select * from hfa h join tbllog lg on h.id=lg.hfa_id  where h.id = %s ORDER BY h.id desc LIMIT 1";
        query = String.format(query, Validation.hfauploadid);

        LocalDataManager Lm = new LocalDataManager(mContext);
        Cursor c = database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {
                param.put("A1", c.getString(0));
                param.put("A2", c.getString(1));
                param.put("A3", c.getString(2));
                param.put("A4", c.getString(3));
                param.put("A5", c.getString(4));
                param.put("A6", c.getString(5));
                param.put("A7", c.getString(6));
                param.put("A8", c.getString(7));
                param.put("A9", c.getString(8));
                param.put("A10", c.getString(9));
                param.put("A11", c.getString(10));
                param.put("A12", c.getString(11));
                param.put("A13_1", c.getString(12));
                param.put("A13_2", c.getString(13));
                param.put("A14", c.getString(14));
                param.put("A14_1", c.getString(15));
                param.put("A14_2", c.getString(16));
                param.put("A14_3_1", c.getString(17));
                param.put("A14_3_2", c.getString(18));
                param.put("A14_3_3", c.getString(19));
                param.put("A14_3_4", c.getString(20));
                param.put("A14_3_5", c.getString(21));
                param.put("A14_3_6", c.getString(22));
                param.put("A14_3_7", c.getString(23));
                param.put("A14_3_8", c.getString(24));
                param.put("A14_3_9", c.getString(25));
                param.put("A14_3_10", c.getString(26));
                param.put("A14_3_11", c.getString(27));
                param.put("A14_3_12", c.getString(28));
                param.put("A14_3_13", c.getString(29));
                param.put("A14_3_14", c.getString(30));
                param.put("A14_3_15", c.getString(31));
                param.put("A14_3_16", c.getString(32));
                param.put("A14_3_17", c.getString(33));

                param.put("A15", c.getString(35));
                param.put("A16", c.getString(36));
                param.put("A17", c.getString(37));
                param.put("A18", c.getString(38));
                param.put("A19", c.getString(39));
                param.put("A20", c.getString(40));
                param.put("A21", c.getString(41));
                param.put("B1", c.getString(42));
                param.put("B2", c.getString(43));
                param.put("B3", c.getString(44));
                param.put("B4", c.getString(45));
                param.put("B5", c.getString(46));
                param.put("B6_1", c.getString(47));
                param.put("B6_2", c.getString(48));
                param.put("B6_3", c.getString(49));
                param.put("B6_4", c.getString(50));
                param.put("B7_1", c.getString(51));
                param.put("B7_2", c.getString(52));
                param.put("B7_3", c.getString(53));
                param.put("B7_4", c.getString(54));
                param.put("C1_1_1", c.getString(55));
                param.put("C1_1_2", c.getString(56));
                param.put("C1_1_3", c.getString(57));
                param.put("C1_1_4", c.getString(58));
                param.put("C1_2_1", c.getString(59));
                param.put("C1_2_2", c.getString(60));
                param.put("C1_2_3", c.getString(61));
                param.put("C1_2_4", c.getString(62));
                param.put("C1_3_1", c.getString(63));
                param.put("C1_3_2", c.getString(64));
                param.put("C1_3_3", c.getString(65));
                param.put("C1_3_4", c.getString(66));
                param.put("C1_4_1", c.getString(67));
                param.put("C1_4_2", c.getString(68));
                param.put("C1_4_3", c.getString(69));
                param.put("C1_4_4", c.getString(70));
                param.put("C1_5_1", c.getString(71));
                param.put("C1_5_2", c.getString(72));
                param.put("C1_5_3", c.getString(73));
                param.put("C1_5_4", c.getString(74));
                param.put("C1_6_1", c.getString(75));
                param.put("C1_6_2", c.getString(76));
                param.put("C1_6_3", c.getString(77));
                param.put("C1_6_4", c.getString(78));
                param.put("C1_7_1", c.getString(79));
                param.put("C1_7_2", c.getString(80));
                param.put("C1_7_3", c.getString(81));
                param.put("C1_7_4", c.getString(82));
                param.put("C1_8_1", c.getString(83));
                param.put("C1_8_2", c.getString(84));
                param.put("C1_8_3", c.getString(85));
                param.put("C1_8_4", c.getString(86));
                param.put("C1_9_1", c.getString(87));
                param.put("C1_9_2", c.getString(88));
                param.put("C1_9_3", c.getString(89));
                param.put("C1_9_4", c.getString(90));
                param.put("C1_10_1", c.getString(91));
                param.put("C1_10_2", c.getString(92));
                param.put("C1_10_3", c.getString(93));
                param.put("C1_10_4", c.getString(94));
                param.put("C1_11_1", c.getString(95));
                param.put("C1_11_2", c.getString(96));
                param.put("C1_11_3", c.getString(97));
                param.put("C1_11_4", c.getString(98));
                param.put("C1_12_1", c.getString(99));
                param.put("C1_12_2", c.getString(100));
                param.put("C1_12_3", c.getString(101));
                param.put("C1_12_4", c.getString(102));
                param.put("C1_13_1", c.getString(103));
                param.put("C1_13_2", c.getString(104));
                param.put("C1_13_3", c.getString(105));
                param.put("C1_13_4", c.getString(106));
                param.put("C1_14_1", c.getString(107));
                param.put("C1_14_2", c.getString(108));
                param.put("C1_14_3", c.getString(109));
                param.put("C1_14_4", c.getString(110));
                param.put("C1_15_1", c.getString(111));
                param.put("C1_15_2", c.getString(112));
                param.put("C1_15_3", c.getString(113));
                param.put("C1_15_4", c.getString(114));
                param.put("C1_16_1", c.getString(115));
                param.put("C1_16_2", c.getString(116));
                param.put("C1_16_3", c.getString(117));
                param.put("C1_16_4", c.getString(118));
                param.put("C1_17_1", c.getString(119));
                param.put("C1_17_2", c.getString(120));
                param.put("C1_17_3", c.getString(121));
                param.put("C1_17_4", c.getString(122));
                param.put("C1_18_1", c.getString(123));
                param.put("C1_18_2", c.getString(124));
                param.put("C1_18_3", c.getString(125));
                param.put("C1_18_4", c.getString(126));
                param.put("C1_19_1", c.getString(127));
                param.put("C1_19_2", c.getString(128));
                param.put("C1_19_3", c.getString(129));
                param.put("C1_19_4", c.getString(130));
                param.put("C1_20_1", c.getString(131));
                param.put("C1_20_2", c.getString(132));
                param.put("C1_20_3", c.getString(133));
                param.put("C1_20_4", c.getString(134));
                param.put("C1_21_1", c.getString(135));
                param.put("C1_21_2", c.getString(136));
                param.put("C1_21_3", c.getString(137));
                param.put("C1_21_4", c.getString(138));
                param.put("C1_22_1", c.getString(139));
                param.put("C1_22_2", c.getString(140));
                param.put("C1_22_3", c.getString(141));
                param.put("C1_22_4", c.getString(142));
                param.put("C1_23_1", c.getString(143));
                param.put("C1_23_2", c.getString(144));
                param.put("C1_23_3", c.getString(145));
                param.put("C1_23_4", c.getString(146));
                param.put("C1_24_1", c.getString(147));
                param.put("C1_24_2", c.getString(148));
                param.put("C1_24_3", c.getString(149));
                param.put("C1_24_4", c.getString(150));
                param.put("C1_25_1", c.getString(151));
                param.put("C1_25_2", c.getString(152));
                param.put("C1_25_3", c.getString(153));
                param.put("C1_25_4", c.getString(154));
                param.put("C1_26_1", c.getString(155));
                param.put("C1_26_2", c.getString(156));
                param.put("C1_26_3", c.getString(157));
                param.put("C1_26_4", c.getString(158));
                param.put("C1_27_1", c.getString(159));
                param.put("C1_27_2", c.getString(160));
                param.put("C1_27_3", c.getString(161));
                param.put("C1_27_4", c.getString(162));
                param.put("C1_28_1", c.getString(163));
                param.put("C1_28_2", c.getString(164));
                param.put("C1_28_3", c.getString(165));
                param.put("C1_28_4", c.getString(166));
                param.put("C1_29_1", c.getString(167));
                param.put("C1_29_2", c.getString(168));
                param.put("C1_29_3", c.getString(169));
                param.put("C1_29_4", c.getString(170));
                param.put("C1_30_1", c.getString(171));
                param.put("C1_30_2", c.getString(172));
                param.put("C1_30_3", c.getString(173));
                param.put("C1_30_4", c.getString(174));
                param.put("C1_31_1", c.getString(175));
                param.put("C1_31_2", c.getString(176));
                param.put("C1_31_3", c.getString(177));
                param.put("C1_31_4", c.getString(178));
                param.put("C1_32_1", c.getString(179));
                param.put("C1_32_2", c.getString(180));
                param.put("C1_32_3", c.getString(181));
                param.put("C1_32_4", c.getString(182));
                param.put("C1_33_1", c.getString(183));
                param.put("C1_33_2", c.getString(184));
                param.put("C1_33_3", c.getString(185));
                param.put("C1_33_4", c.getString(186));
                param.put("C1_34_1", c.getString(187));
                param.put("C1_34_2", c.getString(188));
                param.put("C1_34_3", c.getString(189));
                param.put("C1_34_4", c.getString(190));
                param.put("C1_35_1", c.getString(191));
                param.put("C1_35_2", c.getString(192));
                param.put("C1_35_3", c.getString(193));
                param.put("C1_35_4", c.getString(194));
                param.put("C1_36_1", c.getString(195));
                param.put("C1_36_2", c.getString(196));
                param.put("C1_36_3", c.getString(197));
                param.put("C1_36_4", c.getString(198));
                param.put("C1_37_1", c.getString(199));
                param.put("C1_37_2", c.getString(200));
                param.put("C1_37_3", c.getString(201));
                param.put("C1_37_4", c.getString(202));
                param.put("C2_1", c.getString(203));
                param.put("C2_2", c.getString(204));
                param.put("C2_3", c.getString(205));
                param.put("C2_4", c.getString(206));
                param.put("C2_5", c.getString(207));
                param.put("C2_6", c.getString(208));
                param.put("C2_7", c.getString(209));
                param.put("C2_8", c.getString(210));
                param.put("C2_9", c.getString(211));
                param.put("C2_10", c.getString(212));
                param.put("C2_11", c.getString(213));
                param.put("C2_12", c.getString(214));
                param.put("C2_13", c.getString(215));
                param.put("C2_14", c.getString(216));
                param.put("C2_15", c.getString(217));
                param.put("C2_16", c.getString(218));
                param.put("C2_17", c.getString(219));
                param.put("C2_18", c.getString(220));
                param.put("C2_19", c.getString(221));
                param.put("C2_20", c.getString(222));
                param.put("C2_21", c.getString(223));
                param.put("C2_22", c.getString(224));
                param.put("C2_23", c.getString(225));
                param.put("C2_24", c.getString(226));
                param.put("C2_25", c.getString(227));
                param.put("C2_26", c.getString(228));
                param.put("C2_27", c.getString(229));
                param.put("C2_28", c.getString(230));
                param.put("C2_29", c.getString(231));
                param.put("C2_30", c.getString(232));
                param.put("C2_31", c.getString(233));
                param.put("C2_32", c.getString(234));
                param.put("C2_33", c.getString(235));
                param.put("C2_34", c.getString(236));
                param.put("C2_35", c.getString(237));
                param.put("C2_36", c.getString(238));
                param.put("C2_37", c.getString(239));
                param.put("C2_38", c.getString(240));
                param.put("C2_39", c.getString(241));
                param.put("C2_40", c.getString(242));
                param.put("C2_41", c.getString(243));
                param.put("C2_42", c.getString(244));
                param.put("C2_43", c.getString(245));
                param.put("C2_44", c.getString(246));
                param.put("C2_45", c.getString(247));
                param.put("C2_46", c.getString(248));
                param.put("C2_47", c.getString(249));
                param.put("C2_48", c.getString(250));
                param.put("C2_49", c.getString(251));
                param.put("C2_50", c.getString(252));
                param.put("C2_51", c.getString(253));
                param.put("C2_52", c.getString(254));
                param.put("C2_53", c.getString(255));
                param.put("C2_54", c.getString(256));
                param.put("C2_55", c.getString(257));
                param.put("C2_56", c.getString(258));
                param.put("C2_57", c.getString(259));
                param.put("C2_58", c.getString(260));
                param.put("C2_59", c.getString(261));
                param.put("C2_60", c.getString(262));
                param.put("C2_61", c.getString(263));
                param.put("C2_62", c.getString(264));
                param.put("C2_63", c.getString(265));
                param.put("C2_64", c.getString(266));
                param.put("C2_65", c.getString(267));
                param.put("C2_66", c.getString(268));
                param.put("C2_67", c.getString(269));
                param.put("C2_68", c.getString(270));
                param.put("C2_69", c.getString(271));
                param.put("C2_70", c.getString(272));
                param.put("C2_71", c.getString(273));
                param.put("C2_72", c.getString(274));
                param.put("C2_73", c.getString(275));
                param.put("C2_74", c.getString(276));
                param.put("C2_75", c.getString(277));
                param.put("C3", c.getString(278));
                param.put("C4", c.getString(279));
                param.put("C5", c.getString(280));
                param.put("C6", c.getString(281));
                param.put("C7", c.getString(282));
                param.put("D1", c.getString(283));
                param.put("D2", c.getString(284));
                param.put("D3", c.getString(285));
                param.put("D4", c.getString(286));
                param.put("D5", c.getString(287));
                param.put("D6", c.getString(288));
                param.put("E1", c.getString(289));
                param.put("E2", c.getString(290));
                param.put("E3", c.getString(291));
                param.put("E4", c.getString(292));
                param.put("E5", c.getString(293));
                param.put("E6", c.getString(294));
                param.put("F1_1", c.getString(295));
                param.put("F1_2", c.getString(296));
                param.put("F1_3", c.getString(297));
                param.put("F1_4", c.getString(298));
                param.put("F1_5", c.getString(299));
                param.put("F1_6", c.getString(300));
                param.put("F1_7", c.getString(301));
                param.put("F1_8", c.getString(302));
                param.put("F1_9", c.getString(303));
                param.put("F1_10", c.getString(304));
                param.put("F1_11", c.getString(305));
                param.put("F1_12", c.getString(306));
                param.put("F1_13", c.getString(307));
                param.put("F1_14", c.getString(308));
                param.put("F1_15", c.getString(309));
                param.put("F1_16", c.getString(310));
                param.put("F1_17", c.getString(311));
                param.put("F1_18", c.getString(312));
                param.put("F1_19", c.getString(313));
                param.put("F1_20", c.getString(314));
                param.put("F1_21", c.getString(315));
                param.put("F1_22", c.getString(316));
                param.put("F1_23", c.getString(317));
                param.put("F1_24", c.getString(318));
                param.put("F1_25", c.getString(319));
                param.put("F2_1", c.getString(320));
                param.put("F2_2", c.getString(321));
                param.put("F2_3", c.getString(322));
                param.put("F2_4", c.getString(323));
                param.put("F2_5", c.getString(324));
                param.put("F2_6", c.getString(325));
                param.put("F2_7", c.getString(326));
                param.put("F2_8", c.getString(327));
                param.put("F2_9", c.getString(328));
                param.put("F2_10", c.getString(329));
                param.put("F2_11", c.getString(330));
                param.put("F2_12", c.getString(331));
                param.put("F2_13", c.getString(332));
                param.put("F2_14", c.getString(333));
                param.put("F2_15", c.getString(334));
                param.put("F3_1", c.getString(335));
                param.put("F3_2", c.getString(336));
                param.put("F3_3", c.getString(337));
                param.put("F3_4", c.getString(338));
                param.put("F3_5", c.getString(339));
                param.put("F3_6", c.getString(340));
                param.put("F3_7", c.getString(341));
                param.put("F3_8", c.getString(342));
                param.put("F3_9", c.getString(343));
                param.put("F3_10", c.getString(344));
                param.put("F3_11", c.getString(345));
                param.put("F3_12", c.getString(346));
                param.put("F3_13", c.getString(347));
                param.put("F3_14", c.getString(348));
                param.put("G1_1", c.getString(349));
                param.put("G1_2", c.getString(350));
                param.put("G1_3", c.getString(351));
                param.put("G1_4", c.getString(352));
                param.put("G1_5", c.getString(353));
                param.put("G2", c.getString(354));
                param.put("G3", c.getString(355));
                param.put("G4", c.getString(356));
                param.put("G5_1", c.getString(357));
                param.put("G5_2", c.getString(358));
                param.put("G5_3", c.getString(359));
                param.put("G5_4", c.getString(360));
                param.put("G5_5", c.getString(361));
                param.put("G5_6", c.getString(362));
                param.put("G5_7", c.getString(363));
                param.put("G6_1", c.getString(364));
                param.put("G6_2", c.getString(365));
                param.put("G6_3", c.getString(366));
                param.put("G6_4", c.getString(367));
                param.put("G7", c.getString(368));
                param.put("G8", c.getString(369));
                param.put("G9_1", c.getString(370));
                param.put("G9_2", c.getString(371));
                param.put("G9_3", c.getString(372));
                param.put("G10_1", c.getString(373));
                param.put("G10_2", c.getString(374));
                param.put("G10_3", c.getString(375));
                param.put("G11_1", c.getString(376));
                param.put("G11_2", c.getString(377));
                param.put("G11_3", c.getString(378));
                param.put("G11_4", c.getString(379));
                param.put("G11_5", c.getString(380));
                param.put("G11_6", c.getString(381));
                param.put("G11_7", c.getString(382));
                param.put("G11_8", c.getString(383));
                param.put("G11_9", c.getString(384));
                param.put("G11_10", c.getString(385));
                param.put("G11_11", c.getString(386));
                param.put("G11_12", c.getString(387));
                param.put("G11_13", c.getString(388));
                param.put("H1", c.getString(389));
                param.put("H2", c.getString(390));
                param.put("H3", c.getString(391));
                param.put("H4_1", c.getString(392));
                param.put("H4_2", c.getString(393));
                param.put("H4_3", c.getString(394));
                param.put("H4_4", c.getString(395));
                param.put("H4_5", c.getString(396));
                param.put("H4_6", c.getString(397));
                param.put("H4_7", c.getString(398));
                param.put("H5", c.getString(399));
                param.put("H6", c.getString(400));
                param.put("H7", c.getString(401));
                param.put("H8", c.getString(402));
                param.put("H9_1", c.getString(403));
                param.put("H9_2", c.getString(404));
                param.put("H9_3", c.getString(405));
                param.put("H9_4", c.getString(406));
                param.put("H9_5", c.getString(407));
                param.put("H9_6", c.getString(408));
                param.put("H9_7", c.getString(409));
                param.put("H9_8", c.getString(410));
                param.put("H9_9", c.getString(411));
                param.put("I1", c.getString(412));
                param.put("I2", c.getString(413));
                param.put("I3", c.getString(414));
                param.put("I4_1", c.getString(415));
                param.put("I4_2", c.getString(416));
                param.put("I4_3", c.getString(417));
                param.put("I4_4", c.getString(418));
                param.put("I4_5", c.getString(419));
                param.put("I5", c.getString(420));
                param.put("I6", c.getString(421));
                param.put("I7", c.getString(422));
                param.put("I8", c.getString(423));
                param.put("I9", c.getString(424));
                param.put("I10", c.getString(425));
                param.put("I11", c.getString(426));
                param.put("I12", c.getString(427));
                param.put("I13", c.getString(428));
                param.put("I14", c.getString(429));
                param.put("I15", c.getString(430));
                param.put("J1", c.getString(431));
                param.put("J2", c.getString(432));
                param.put("J3", c.getString(433));
                param.put("J4", c.getString(434));
                param.put("J5", c.getString(435));
                param.put("J6", c.getString(436));
                param.put("J7_1", c.getString(437));
                param.put("J7_2", c.getString(438));
                param.put("J7_3", c.getString(439));
                param.put("J7_4", c.getString(440));
                param.put("J7_5", c.getString(441));
                param.put("J7_6", c.getString(442));
                param.put("J7_7", c.getString(443));
                param.put("J7_8", c.getString(444));
                param.put("J7_9", c.getString(445));
                param.put("J8", c.getString(446));
                param.put("J9", c.getString(447));
                param.put("J10", c.getString(448));
                param.put("K1", c.getString(449));
                param.put("K2", c.getString(450));
                param.put("K3", c.getString(451));
                param.put("L1", c.getString(452));
                param.put("L2", c.getString(453));
                param.put("L3", c.getString(454));
                param.put("L4", c.getString(455));
                param.put("L5_1", c.getString(456));
                param.put("L5_2", c.getString(457));
                param.put("L5_3", c.getString(458));
                param.put("L5_4", c.getString(459));
                param.put("L5_5", c.getString(460));
                param.put("L5_6", c.getString(461));
                param.put("L5_7", c.getString(462));
                param.put("L6_1", c.getString(463));
                param.put("L6_2", c.getString(464));
                param.put("L6_3", c.getString(465));
                param.put("L6_4", c.getString(466));
                param.put("L6_5", c.getString(467));
                param.put("L6_6", c.getString(468));
                param.put("L6_7", c.getString(469));
                param.put("L7_1", c.getString(470));
                param.put("L7_2", c.getString(471));
                param.put("L7_3", c.getString(472));
                param.put("L7_4", c.getString(473));
                param.put("L7_5", c.getString(474));
                param.put("L7_6", c.getString(475));
                param.put("L7_7", c.getString(476));
                param.put("L8_1", c.getString(477));
                param.put("L8_2", c.getString(478));
                param.put("L8_3", c.getString(479));
                param.put("L8_4", c.getString(480));
                param.put("L8_5", c.getString(481));
                param.put("L8_6", c.getString(482));
                param.put("L8_7", c.getString(483));
                param.put("L9_1", c.getString(484));
                param.put("L9_2", c.getString(485));
                param.put("L9_3", c.getString(486));
                param.put("L9_4", c.getString(487));
                param.put("L9_5", c.getString(488));
                param.put("L9_6", c.getString(489));
                param.put("L9_7", c.getString(490));
                param.put("L10", c.getString(491));
                param.put("L11_1", c.getString(492));
                param.put("L11_2", c.getString(493));
                param.put("L11_3", c.getString(494));
                param.put("L11_4", c.getString(495));
                param.put("L11_5", c.getString(496));
                param.put("L11_6", c.getString(497));
                param.put("L12", c.getString(498));
                param.put("L13_1", c.getString(499));
                param.put("L13_2", c.getString(500));
                param.put("L13_3", c.getString(501));
                param.put("L13_4", c.getString(502));
                param.put("L13_5", c.getString(503));
                param.put("L13_6", c.getString(504));
                param.put("L13_7", c.getString(505));
                param.put("M1", c.getString(506));
                param.put("M2", c.getString(507));
                param.put("M3", c.getString(508));
                param.put("M4_1", c.getString(509));
                param.put("M4_2", c.getString(510));
                param.put("M4_3", c.getString(511));
                param.put("M4_4", c.getString(512));
                param.put("M4_5", c.getString(513));
                param.put("M4_6", c.getString(514));
                param.put("M4_7", c.getString(515));
                param.put("M4_8", c.getString(516));
                param.put("M4_9", c.getString(517));
                param.put("M4_10", c.getString(518));
                param.put("M5", c.getString(519));
                param.put("M6", c.getString(520));
                param.put("M7", c.getString(521));
                param.put("M8", c.getString(522));
                param.put("M9", c.getString(523));
                param.put("M10", c.getString(524));
                param.put("M11", c.getString(525));
                param.put("M12", c.getString(526));
                param.put("N1_1", c.getString(527));
                param.put("N1_2", c.getString(528));
                param.put("N1_3", c.getString(529));
                param.put("N1_4", c.getString(530));
                param.put("N2_1", c.getString(531));
                param.put("N2_2", c.getString(532));
                param.put("N2_3", c.getString(533));
                param.put("N3", c.getString(534));
                param.put("N4", c.getString(535));
                param.put("N5", c.getString(536));
                param.put("N6", c.getString(537));
                param.put("N7", c.getString(538));
                param.put("N8", c.getString(539));
                param.put("N9", c.getString(540));
                param.put("N10", c.getString(541));
                param.put("N11_1", c.getString(542));
                param.put("N11_2", c.getString(543));
                param.put("N11_3", c.getString(544));
                param.put("N11_4", c.getString(545));
                param.put("N11_5", c.getString(546));
                param.put("N11_6", c.getString(547));
                param.put("N11_7", c.getString(548));
                param.put("N11_8", c.getString(549));
                param.put("N11_9", c.getString(550));
                param.put("N11_10", c.getString(551));
                param.put("N11_11", c.getString(552));
                param.put("N11_12", c.getString(553));
                param.put("N11_13", c.getString(554));
                param.put("N11_14", c.getString(555));
                param.put("N11_15", c.getString(556));
                param.put("N11_16", c.getString(557));
                param.put("N11_17", c.getString(558));
                param.put("N11_18", c.getString(559));
                param.put("N11_19", c.getString(560));
                param.put("N11_20", c.getString(561));
                param.put("N12", c.getString(562));
                param.put("N13_1", c.getString(563));
                param.put("N13_2", c.getString(564));
                param.put("N13_3", c.getString(565));
                param.put("N13_4", c.getString(566));
                param.put("N13_5", c.getString(567));
                param.put("N13_6", c.getString(568));
                param.put("N13_7", c.getString(569));
                param.put("N13_8", c.getString(570));
                param.put("N13_9", c.getString(571));
                param.put("N13_10", c.getString(572));
                param.put("N14_1", c.getString(573));
                param.put("N14_2", c.getString(574));
                param.put("N14_3", c.getString(575));
                param.put("N14_4", c.getString(576));
                param.put("N14_5", c.getString(577));
                param.put("N14_6", c.getString(578));
                param.put("N15_1", c.getString(579));
                param.put("N15_2", c.getString(580));
                param.put("N15_3", c.getString(581));
                param.put("N16_1", c.getString(582));
                param.put("N16_2", c.getString(583));
                param.put("N16_3", c.getString(584));
                param.put("N17", c.getString(585));
                param.put("O1_1", c.getString(586));
                param.put("O1_2", c.getString(587));
                param.put("O1_3", c.getString(588));
                param.put("O1_4", c.getString(589));
                param.put("O2_1", c.getString(590));
                param.put("O2_2", c.getString(591));
                param.put("O2_3", c.getString(592));
                param.put("O2_4", c.getString(593));
                param.put("O3", c.getString(594));
                param.put("O4", c.getString(595));
                param.put("O5_1", c.getString(596));
                param.put("O5_2", c.getString(597));
                param.put("O5_3", c.getString(598));
                param.put("O5_4", c.getString(599));
                param.put("O5_5", c.getString(600));
                param.put("O5_6", c.getString(601));
                param.put("O5_7", c.getString(602));
                param.put("O5_8", c.getString(603));
                param.put("O5_9", c.getString(604));
                param.put("O5_10", c.getString(605));
                param.put("O5_11", c.getString(606));
                param.put("O5_12", c.getString(607));
                param.put("O5_13", c.getString(608));
                param.put("O5_14", c.getString(609));
                param.put("O5_15", c.getString(610));
                param.put("O5_16", c.getString(611));
                param.put("O5_17", c.getString(612));
                param.put("O5_18", c.getString(613));
                param.put("O5_19", c.getString(614));
                param.put("O5_20", c.getString(615));
                param.put("O5_21", c.getString(616));
                param.put("O6", c.getString(617));
                param.put("O7_1", c.getString(618));
                param.put("O7_2", c.getString(619));
                param.put("O7_3", c.getString(620));
                param.put("O7_4", c.getString(621));
                param.put("O7_5", c.getString(622));
                param.put("O7_6", c.getString(623));
                param.put("O7_7", c.getString(624));
                param.put("O7_8", c.getString(625));
                param.put("O7_9", c.getString(626));
                param.put("O7_10", c.getString(627));
                param.put("P1", c.getString(628));
                param.put("P2", c.getString(629));
                param.put("P3", c.getString(630));
                param.put("P4", c.getString(631));
                param.put("P5", c.getString(632));
                param.put("P6", c.getString(633));
                param.put("P7", c.getString(634));
                param.put("P8", c.getString(635));
                param.put("P9", c.getString(636));
                param.put("P10", c.getString(637));
                param.put("P11", c.getString(638));
                param.put("P12", c.getString(639));
                param.put("P13_1", c.getString(640));
                param.put("P13_2", c.getString(641));
                param.put("P13_3", c.getString(642));
                param.put("P13_4", c.getString(643));
                param.put("P14", c.getString(644));
                param.put("P15_1", c.getString(645));
                param.put("P15_2", c.getString(646));
                param.put("P15_3", c.getString(647));
                param.put("P16", c.getString(648));
                param.put("P17", c.getString(649));
                param.put("P18", c.getString(650));
                param.put("P19", c.getString(651));
                param.put("P20_1", c.getString(652));
                param.put("P20_2", c.getString(653));
                param.put("P20_3", c.getString(654));
                param.put("P21_1", c.getString(655));
                param.put("P21_2", c.getString(656));
                param.put("P21_3", c.getString(657));
                param.put("P21_4", c.getString(658));
                param.put("P21_5", c.getString(659));
                param.put("P22_1", c.getString(660));
                param.put("P22_2", c.getString(661));
                param.put("P22_3", c.getString(662));
                param.put("P22_4", c.getString(663));
                param.put("P22_5", c.getString(664));
                param.put("P22_6", c.getString(665));
                param.put("P22_7", c.getString(666));
                param.put("P22_8", c.getString(667));
                param.put("Q1", c.getString(668));
                param.put("Q2", c.getString(669));
                param.put("Q3_1", c.getString(670));
                param.put("Q3_2", c.getString(671));
                param.put("Q3_3", c.getString(672));
                param.put("Q3_4", c.getString(673));
                param.put("Q4_1", c.getString(674));
                param.put("Q4_2", c.getString(675));
                param.put("Q4_3", c.getString(676));
                param.put("Q4_4", c.getString(677));
                param.put("Q4_5", c.getString(678));
                param.put("Q4_6", c.getString(679));
                param.put("Q4_7", c.getString(680));
                param.put("Q4_8", c.getString(681));
                param.put("Q4_9", c.getString(682));
                param.put("Q4_10", c.getString(683));
                param.put("Q4_11", c.getString(684));
                param.put("Q4_12", c.getString(685));
                param.put("Q4_13", c.getString(686));
                param.put("Q4_14", c.getString(687));
                param.put("Q4_15", c.getString(688));
                param.put("Q4_16", c.getString(689));
                param.put("Q4_17", c.getString(690));
                param.put("Q4_18", c.getString(691));
                param.put("Q4_19", c.getString(692));
                param.put("Q4_20", c.getString(693));
                param.put("Q4_21", c.getString(694));
                param.put("Q4_22", c.getString(695));
                param.put("Q4_23", c.getString(696));
                param.put("Q4_24", c.getString(697));
                param.put("Q5", c.getString(698));
                param.put("Q6", c.getString(699));
                param.put("Q7_1", c.getString(700));
                param.put("Q7_2", c.getString(701));
                param.put("Q7_3", c.getString(702));
                param.put("Q7_4", c.getString(703));
                param.put("Q7_5", c.getString(704));
                param.put("Q7_6", c.getString(705));
                param.put("Q7_7", c.getString(706));
                param.put("Q7_8", c.getString(707));
                param.put("Q7_9", c.getString(708));
                param.put("Q8_1", c.getString(709));
                param.put("Q8_2", c.getString(710));
                param.put("Q8_3", c.getString(711));
                param.put("Q8_4", c.getString(712));
                param.put("Q8_5", c.getString(713));
                param.put("Q8_6", c.getString(714));
                param.put("Q8_7", c.getString(715));
                param.put("Q8_8", c.getString(716));
                param.put("Q8_9", c.getString(717));
                param.put("Q8_10", c.getString(718));
                param.put("Q8_11", c.getString(719));
                param.put("Q8_12", c.getString(720));
                param.put("Q8_13", c.getString(721));
                param.put("Q8_14", c.getString(722));
                param.put("Q8_15", c.getString(723));
                param.put("Q8_16", c.getString(724));
                param.put("Q9", c.getString(725));
                param.put("Q10", c.getString(726));
                param.put("Q11", c.getString(727));
                param.put("R1", c.getString(728));
                param.put("R2", c.getString(729));
                param.put("R3", c.getString(730));
                param.put("R4", c.getString(731));
                param.put("R5", c.getString(732));
                param.put("R6", c.getString(733));
                param.put("R7", c.getString(734));
                param.put("R8", c.getString(735));
                param.put("R9", c.getString(736));
                param.put("R10", c.getString(737));
                param.put("R11", c.getString(738));
                param.put("R12", c.getString(739));
                param.put("R13", c.getString(740));
                param.put("R14", c.getString(741));
                param.put("start_date", c.getString(742));
                param.put("start_time", c.getString(743));
                param.put("end_time", c.getString(744));
                param.put("interview_status", c.getString(745));
                param.put("user_conduct_id", c.getString(746));
                param.put("C2_76", c.getString(747));
                param.put("C4_1", c.getString(748));
                param.put("C2_77", c.getString(749));
                param.put("C2_78", c.getString(750));
                param.put("R15", c.getString(751));
                param.put("P1_1", c.getString(752));
                param.put("H4_8", c.getString(753));
                param.put("H9_10", c.getString(754));
                param.put("user_submite_id", new MyPreferences(mContext).getUserId() + "");
                param.put("app_version", "HFA714");
            }

        }
        //endregion


        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        String urlString = new MyPreferences(mContext).getReq1();

        URL url;
        HttpURLConnection connection;

        try {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(1000);

            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, StandardCharsets.UTF_8));

            bw.write(PostRequestData.getData(param));
            bw.flush();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String st = "", line;
                while ((line = br.readLine()) != null) {
                    st = st + line;
                }
                return st;
            } else {
                mUserMsg = "Server Couldn't process the request";
            }
        } catch (MalformedURLException e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {


            mUserMsg = "Please make sure that Internet connection is available," +
                    " and server IP is inserted in settings";
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {


        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();


            //int houseId = Integer.parseInt(((String) o).replace("\"",""));

            String result = (((String) o).replace("\"", ""));


            Toast.makeText(mContext, "Interivew Has ben Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            LogtableUpdates.UpdateLogStatusUpload(mContext, Validation.hfauploadid);

            thread.start();


        } catch (IOException e) {
            //if connection was available via connecting but
            //we can't get data from server..
            if (mUserMsg == null)
                mUserMsg = "Please check connection";
            dialog.dismiss();
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            mUserMsg = e.getMessage();
            dialog.dismiss();
        } catch (Exception e) {
            Toast.makeText(mContext, "Uploading failed at request 1", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}
