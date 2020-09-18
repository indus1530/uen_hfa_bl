package data;

import android.content.Context;

import utils.Validation;

/**
 * Created by sajidlatif on 7/10/2017.
 */

public class LogtableUpdates {


    public static void UpdateLogSection(Context context, String Section, String HID) {
        String Query = "update tbllog set " +
                "atsection='" + Section + "'," +
                "F1_4_ischekd='" + Validation.F1_4_ischekd + "'," +
                "F1_5_ischekd='" + Validation.F1_5_ischekd + "'," +
                "F1_6_ischekd='" + Validation.F1_6_ischekd + "'," +
                "F1_15_ischekd='" + Validation.F1_15_ischekd + "'," +
                "A13_2_ischekd='" + Validation.A13_2_ischekd + "'," +
                "A2='" + Validation.A2 + "'," +
                "A3='" + Validation.A3 + "'," +
                "HFAPK='" + Validation.HFAPK + "'," +
                "A1='" + Validation.A1 + "'," +
                "hfauploadid='" + Validation.hfauploadid + "'," +
                "A4='" + Validation.A4 + "'" +

                " where hfa_id=" + Validation.HFAPK;


        LocalDataManager Lm = new LocalDataManager(context);

        LocalDataManager.database.execSQL(Query);


    }


    public static void UpdateLogStatusUpload(Context context, String HID) {
        String Query = "update tbllog set " +
                "Interview_status='" + "2" + "'" +


                " where hfa_id=" + HID;


        LocalDataManager Lm = new LocalDataManager(context);

        LocalDataManager.database.execSQL(Query);


    }
}
