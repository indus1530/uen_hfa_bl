package data;

/**
 * Created by sajidlatif on 6/14/2017.
 */

public class LogTable {


    public static String TABLE_NAME = "tbllog";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                "Interview_date Text," +
                "Interview_start_time Text," +
                "Interview_end_time Text," +
                "Interview_status Text," +
                "Interview_user Text," +
                "hfa_id Text," +
                "hfa_a1 Text," +
                "F1_4_ischekd Text," +   // validationsss when interview back from pending
                "F1_5_ischekd Text," +
                "F1_6_ischekd Text," +
                "F1_15_ischekd Text," +
                "A13_2_ischekd Text," +
                "A2 Text," +
                "A3 Text," +
                "HFAPK Text," +
                "A1 Text," +
                "hfauploadid Text," +
                "A4 Text, " +
                "atsection Text" +


                ')';


        return query;
    }
}
