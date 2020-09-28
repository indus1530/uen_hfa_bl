package data;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class HFATable {
    public static String TABLE_NAME = "hfa";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +
                col_A.A1 + " TEXT," +
                col_A.A2 + " TEXT," +
                col_A.A3 + " TEXT," +
                col_A.A4 + " TEXT," +
                col_A.A5 + " TEXT," +
                col_A.A6 + " TEXT," +
                col_A.A7 + " TEXT," +
                col_A.A8 + " TEXT," +
                col_A.A9 + " TEXT," +
                col_A.A10 + " TEXT," +
                col_A.A11 + " TEXT," +
                col_A.A12 + " TEXT," +
                col_A.A131 + " TEXT," +
                col_A.A132 + " TEXT," +
                col_A.A14 + " TEXT," +
                col_A.A14_1 + " TEXT," +
                col_A.A14_2 + " TEXT," +

                col_A.A14_3_1 + " Text," +
                col_A.A14_3_2 + " Text," +
                col_A.A14_3_3 + " Text," +
                col_A.A14_3_4 + " Text," +
                col_A.A14_3_5 + " Text," +
                col_A.A14_3_6 + " Text," +
                col_A.A14_3_7 + " Text," +
                col_A.A14_3_8 + " Text," +
                col_A.A14_3_9 + " Text," +
                col_A.A14_3_10 + " Text," +
                col_A.A14_3_11 + " Text," +
                col_A.A14_3_12 + " Text," +
                col_A.A14_3_13 + " Text," +
                col_A.A14_3_14 + " Text," +
                col_A.A14_3_15 + " Text," +
                col_A.A14_3_16 + " Text," +
                col_A.A14_3_17 + " Text," +

                col_A.A15 + " TEXT," +
                col_A.A16 + " TEXT," +
                col_A.A17 + " TEXT," +
                col_A.A18 + " TEXT," +
                col_A.A19 + " TEXT," +
                col_A.A20 + " TEXT," +
                col_A.A21 + " TEXT," +
                col_B.B1 + " TEXT," +
                col_B.B2 + " TEXT," +
                col_B.B3 + " TEXT," +
                col_B.B4 + " TEXT," +
                col_B.B5 + " TEXT," +
                col_B.B6_1 + " TEXT," +
                col_B.B6_2 + " TEXT," +
                col_B.B6_3 + " TEXT," +
                col_B.B6_4 + " TEXT," +
                col_B.B7_1 + " TEXT," +
                col_B.B7_2 + " TEXT," +
                col_B.B7_3 + " TEXT," +
                col_B.B7_4 + " TEXT, " +
                col_C.C1_1_1 + " Text," +
                col_C.C1_1_2 + " Text," +
                col_C.C1_1_3 + " Text," +
                col_C.C1_1_4 + " Text," +
                col_C.C1_2_1 + " Text," +
                col_C.C1_2_2 + " Text," +
                col_C.C1_2_3 + " Text," +
                col_C.C1_2_4 + " Text," +
                col_C.C1_3_1 + " Text," +
                col_C.C1_3_2 + " Text," +
                col_C.C1_3_3 + " Text," +
                col_C.C1_3_4 + " Text," +
                col_C.C1_4_1 + " Text," +
                col_C.C1_4_2 + " Text," +
                col_C.C1_4_3 + " Text," +
                col_C.C1_4_4 + " Text," +
                col_C.C1_5_1 + " Text," +
                col_C.C1_5_2 + " Text," +
                col_C.C1_5_3 + " Text," +
                col_C.C1_5_4 + " Text," +
                col_C.C1_6_1 + " Text," +
                col_C.C1_6_2 + " Text," +
                col_C.C1_6_3 + " Text," +
                col_C.C1_6_4 + " Text," +
                col_C.C1_7_1 + " Text," +
                col_C.C1_7_2 + " Text," +
                col_C.C1_7_3 + " Text," +
                col_C.C1_7_4 + " Text," +
                col_C.C1_8_1 + " Text," +
                col_C.C1_8_2 + " Text," +
                col_C.C1_8_3 + " Text," +
                col_C.C1_8_4 + " Text," +
                col_C.C1_9_1 + " Text," +
                col_C.C1_9_2 + " Text," +
                col_C.C1_9_3 + " Text," +
                col_C.C1_9_4 + " Text," +
                col_C.C1_10_1 + " Text," +
                col_C.C1_10_2 + " Text," +
                col_C.C1_10_3 + " Text," +
                col_C.C1_10_4 + " Text," +
                col_C.C1_11_1 + " Text," +
                col_C.C1_11_2 + " Text," +
                col_C.C1_11_3 + " Text," +
                col_C.C1_11_4 + " Text," +
                col_C.C1_12_1 + " Text," +
                col_C.C1_12_2 + " Text," +
                col_C.C1_12_3 + " Text," +
                col_C.C1_12_4 + " Text," +
                col_C.C1_13_1 + " Text," +
                col_C.C1_13_2 + " Text," +
                col_C.C1_13_3 + " Text," +
                col_C.C1_13_4 + " Text," +
                col_C.C1_14_1 + " Text," +
                col_C.C1_14_2 + " Text," +
                col_C.C1_14_3 + " Text," +
                col_C.C1_14_4 + " Text," +
                col_C.C1_15_1 + " Text," +
                col_C.C1_15_2 + " Text," +
                col_C.C1_15_3 + " Text," +
                col_C.C1_15_4 + " Text," +
                col_C.C1_16_1 + " Text," +
                col_C.C1_16_2 + " Text," +
                col_C.C1_16_3 + " Text," +
                col_C.C1_16_4 + " Text," +
                col_C.C1_17_1 + " Text," +
                col_C.C1_17_2 + " Text," +
                col_C.C1_17_3 + " Text," +
                col_C.C1_17_4 + " Text," +
                col_C.C1_18_1 + " Text," +
                col_C.C1_18_2 + " Text," +
                col_C.C1_18_3 + " Text," +
                col_C.C1_18_4 + " Text," +
                col_C.C1_19_1 + " Text," +
                col_C.C1_19_2 + " Text," +
                col_C.C1_19_3 + " Text," +
                col_C.C1_19_4 + " Text," +
                col_C.C1_20_1 + " Text," +
                col_C.C1_20_2 + " Text," +
                col_C.C1_20_3 + " Text," +
                col_C.C1_20_4 + " Text," +
                col_C.C1_21_1 + " Text," +
                col_C.C1_21_2 + " Text," +
                col_C.C1_21_3 + " Text," +
                col_C.C1_21_4 + " Text," +
                col_C.C1_22_1 + " Text," +
                col_C.C1_22_2 + " Text," +
                col_C.C1_22_3 + " Text," +
                col_C.C1_22_4 + " Text," +
                col_C.C1_23_1 + " Text," +
                col_C.C1_23_2 + " Text," +
                col_C.C1_23_3 + " Text," +
                col_C.C1_23_4 + " Text," +
                col_C.C1_24_1 + " Text," +
                col_C.C1_24_2 + " Text," +
                col_C.C1_24_3 + " Text," +
                col_C.C1_24_4 + " Text," +
                col_C.C1_25_1 + " Text," +
                col_C.C1_25_2 + " Text," +
                col_C.C1_25_3 + " Text," +
                col_C.C1_25_4 + " Text," +
                col_C.C1_26_1 + " Text," +
                col_C.C1_26_2 + " Text," +
                col_C.C1_26_3 + " Text," +
                col_C.C1_26_4 + " Text," +
                col_C.C1_27_1 + " Text," +
                col_C.C1_27_2 + " Text," +
                col_C.C1_27_3 + " Text," +
                col_C.C1_27_4 + " Text," +
                col_C.C1_28_1 + " Text," +
                col_C.C1_28_2 + " Text," +
                col_C.C1_28_3 + " Text," +
                col_C.C1_28_4 + " Text," +
                col_C.C1_29_1 + " Text," +
                col_C.C1_29_2 + " Text," +
                col_C.C1_29_3 + " Text," +
                col_C.C1_29_4 + " Text," +
                col_C.C1_30_1 + " Text," +
                col_C.C1_30_2 + " Text," +
                col_C.C1_30_3 + " Text," +
                col_C.C1_30_4 + " Text," +
                col_C.C1_31_1 + " Text," +
                col_C.C1_31_2 + " Text," +
                col_C.C1_31_3 + " Text," +
                col_C.C1_31_4 + " Text," +
                col_C.C1_32_1 + " Text," +
                col_C.C1_32_2 + " Text," +
                col_C.C1_32_3 + " Text," +
                col_C.C1_32_4 + " Text," +
                col_C.C1_33_1 + " Text," +
                col_C.C1_33_2 + " Text," +
                col_C.C1_33_3 + " Text," +
                col_C.C1_33_4 + " Text," +
                col_C.C1_34_1 + " Text," +
                col_C.C1_34_2 + " Text," +
                col_C.C1_34_3 + " Text," +
                col_C.C1_34_4 + " Text," +
                col_C.C1_35_1 + " Text," +
                col_C.C1_35_2 + " Text," +
                col_C.C1_35_3 + " Text," +
                col_C.C1_35_4 + " Text," +
                col_C.C1_36_1 + " Text," +
                col_C.C1_36_2 + " Text," +
                col_C.C1_36_3 + " Text," +
                col_C.C1_36_4 + " Text," +
                col_C.C1_37_1 + " Text," +
                col_C.C1_37_2 + " Text," +
                col_C.C1_37_3 + " Text," +
                col_C.C1_37_4 + " Text," +
                col_C.C2_1 + " Text," +
                col_C.C2_2 + " Text," +
                col_C.C2_3 + " Text," +
                col_C.C2_4 + " Text," +
                col_C.C2_5 + " Text," +
                col_C.C2_6 + " Text," +
                col_C.C2_7 + " Text," +
                col_C.C2_8 + " Text," +
                col_C.C2_9 + " Text," +
                col_C.C2_10 + " Text," +
                col_C.C2_11 + " Text," +
                col_C.C2_12 + " Text," +
                col_C.C2_13 + " Text," +
                col_C.C2_14 + " Text," +
                col_C.C2_15 + " Text," +
                col_C.C2_16 + " Text," +
                col_C.C2_17 + " Text," +
                col_C.C2_18 + " Text," +
                col_C.C2_19 + " Text," +
                col_C.C2_20 + " Text," +
                col_C.C2_21 + " Text," +
                col_C.C2_22 + " Text," +
                col_C.C2_23 + " Text," +
                col_C.C2_24 + " Text," +
                col_C.C2_25 + " Text," +
                col_C.C2_26 + " Text," +
                col_C.C2_27 + " Text," +
                col_C.C2_28 + " Text," +
                col_C.C2_29 + " Text," +
                col_C.C2_30 + " Text," +
                col_C.C2_31 + " Text," +
                col_C.C2_32 + " Text," +
                col_C.C2_33 + " Text," +
                col_C.C2_34 + " Text," +
                col_C.C2_35 + " Text," +
                col_C.C2_36 + " Text," +
                col_C.C2_37 + " Text," +
                col_C.C2_38 + " Text," +
                col_C.C2_39 + " Text," +
                col_C.C2_40 + " Text," +
                col_C.C2_41 + " Text," +
                col_C.C2_42 + " Text," +
                col_C.C2_43 + " Text," +
                col_C.C2_44 + " Text," +
                col_C.C2_45 + " Text," +
                col_C.C2_46 + " Text," +
                col_C.C2_47 + " Text," +
                col_C.C2_48 + " Text," +
                col_C.C2_49 + " Text," +
                col_C.C2_50 + " Text," +
                col_C.C2_51 + " Text," +
                col_C.C2_52 + " Text," +
                col_C.C2_53 + " Text," +
                col_C.C2_54 + " Text," +
                col_C.C2_55 + " Text," +
                col_C.C2_56 + " Text," +
                col_C.C2_57 + " Text," +
                col_C.C2_58 + " Text," +
                col_C.C2_59 + " Text," +
                col_C.C2_60 + " Text," +
                col_C.C2_61 + " Text," +
                col_C.C2_62 + " Text," +
                col_C.C2_63 + " Text," +
                col_C.C2_64 + " Text," +
                col_C.C2_65 + " Text," +
                col_C.C2_66 + " Text," +
                col_C.C2_67 + " Text," +
                col_C.C2_68 + " Text," +
                col_C.C2_69 + " Text," +
                col_C.C2_70 + " Text," +
                col_C.C2_71 + " Text," +
                col_C.C2_72 + " Text," +
                col_C.C2_73 + " Text," +
                col_C.C2_74 + " Text," +
                col_C.C2_75 + " Text," +
                col_C.C3 + " Text," +
                col_C.C4 + " Text," +
                col_C.C5 + " Text," +
                col_C.C6 + " Text," +
                col_C.C7 + " Text," +
                col_D.D1 + " TEXT," +
                col_D.D2 + " TEXT," +
                col_D.D3 + " TEXT," +
                col_D.D4 + " TEXT," +
                col_D.D5 + " TEXT," +
                col_D.D6 + " TEXT," +
                col_E.E1 + " TEXT," +
                col_E.E2 + " TEXT," +
                col_E.E3 + " TEXT," +
                col_E.E4 + " TEXT," +
                col_E.E5 + " TEXT," +
                col_E.E6 + " TEXT," +
                col_F.F1_1 + " Text," +
                col_F.F1_2 + " Text," +
                col_F.F1_3 + " Text," +
                col_F.F1_4 + " Text," +
                col_F.F1_5 + " Text," +
                col_F.F1_6 + " Text," +
                col_F.F1_7 + " Text," +
                col_F.F1_8 + " Text," +
                col_F.F1_9 + " Text," +
                col_F.F1_10 + " Text," +
                col_F.F1_11 + " Text," +
                col_F.F1_12 + " Text," +
                col_F.F1_13 + " Text," +
                col_F.F1_14 + " Text," +
                col_F.F1_15 + " Text," +
                col_F.F1_16 + " Text," +
                col_F.F1_17 + " Text," +
                col_F.F1_18 + " Text," +
                col_F.F1_19 + " Text," +
                col_F.F1_20 + " Text," +
                col_F.F1_21 + " Text," +
                col_F.F1_22 + " Text," +
                col_F.F1_23 + " Text," +
                col_F.F1_24 + " Text," +
                col_F.F1_25 + " Text," +
                col_F.F2_1 + " Text," +
                col_F.F2_2 + " Text," +
                col_F.F2_3 + " Text," +
                col_F.F2_4 + " Text," +
                col_F.F2_5 + " Text," +
                col_F.F2_6 + " Text," +
                col_F.F2_7 + " Text," +
                col_F.F2_8 + " Text," +
                col_F.F2_9 + " Text," +
                col_F.F2_10 + " Text," +
                col_F.F2_11 + " Text," +
                col_F.F2_12 + " Text," +
                col_F.F2_13 + " Text," +
                col_F.F2_14 + " Text," +
                col_F.F2_15 + " Text," +
                col_F.F3_1 + " Text," +
                col_F.F3_2 + " Text," +
                col_F.F3_3 + " Text," +
                col_F.F3_4 + " Text," +
                col_F.F3_5 + " Text," +
                col_F.F3_6 + " Text," +
                col_F.F3_7 + " Text," +
                col_F.F3_8 + " Text," +
                col_F.F3_9 + " Text," +
                col_F.F3_10 + " Text," +
                col_F.F3_11 + " Text," +
                col_F.F3_12 + " Text," +
                col_F.F3_13 + " Text," +
                col_F.F3_14 + " Text," +
                col_G.G1_1 + " Text," +
                col_G.G1_2 + " Text," +
                col_G.G1_3 + " Text," +
                col_G.G1_4 + " Text," +
                col_G.G1_5 + " Text," +
                col_G.G2 + " Text," +
                col_G.G3 + " Text," +
                col_G.G4 + " Text," +
                col_G.G5_1 + " Text," +
                col_G.G5_2 + " Text," +
                col_G.G5_3 + " Text," +
                col_G.G5_4 + " Text," +
                col_G.G5_5 + " Text," +
                col_G.G5_6 + " Text," +
                col_G.G5_7 + " Text," +
                col_G.G6_1 + " Text," +
                col_G.G6_2 + " Text," +
                col_G.G6_3 + " Text," +
                col_G.G6_4 + " Text," +
                col_G.G7 + " Text," +
                col_G.G8 + " Text," +
                col_G.G9_1 + " Text," +
                col_G.G9_2 + " Text," +
                col_G.G9_3 + " Text," +
                col_G.G10_1 + " Text," +
                col_G.G10_2 + " Text," +
                col_G.G10_3 + " Text," +
                col_G.G11_1 + " Text," +
                col_G.G11_2 + " Text," +
                col_G.G11_3 + " Text," +
                col_G.G11_4 + " Text," +
                col_G.G11_5 + " Text," +
                col_G.G11_6 + " Text," +
                col_G.G11_7 + " Text," +
                col_G.G11_8 + " Text," +
                col_G.G11_9 + " Text," +
                col_G.G11_10 + " Text," +
                col_G.G11_11 + " Text," +
                col_G.G11_12 + " Text," +
                col_G.G11_13 + " Text," +
                col_H.H1 + " Text," +
                col_H.H2 + " Text," +
                col_H.H3 + " Text," +
                col_H.H4_1 + " Text," +
                col_H.H4_2 + " Text," +
                col_H.H4_3 + " Text," +
                col_H.H4_4 + " Text," +
                col_H.H4_5 + " Text," +
                col_H.H4_6 + " Text," +
                col_H.H4_7 + " Text," +
                col_H.H5 + " Text," +
                col_H.H6 + " Text," +
                col_H.H7 + " Text," +
                col_H.H8 + " Text," +
                col_H.H9_1 + " Text," +
                col_H.H9_2 + " Text," +
                col_H.H9_3 + " Text," +
                col_H.H9_4 + " Text," +
                col_H.H9_5 + " Text," +
                col_H.H9_6 + " Text," +
                col_H.H9_7 + " Text," +
                col_H.H9_8 + " Text," +
                col_H.H9_9 + " Text," +
                col_I.I1 + " Text," +
                col_I.I2 + " Text," +
                col_I.I3 + " Text," +
                col_I.I4_1 + " Text," +
                col_I.I4_2 + " Text," +
                col_I.I4_3 + " Text," +
                col_I.I4_4 + " Text," +
                col_I.I4_5 + " Text," +
                col_I.I5 + " Text," +
                col_I.I6 + " Text," +
                col_I.I7 + " Text," +
                col_I.I8 + " Text," +
                col_I.I9 + " Text," +
                col_I.I10 + " Text," +
                col_I.I11 + " Text," +
                col_I.I12 + " Text," +
                col_I.I13 + " Text," +
                col_I.I14 + " Text," +
                col_I.I15 + " Text," +
                col_J.J1 + " Text," +
                col_J.J2 + " Text," +
                col_J.J3 + " Text," +
                col_J.J4 + " Text," +
                col_J.J5 + " Text," +
                col_J.J6 + " Text," +
                col_J.J7_1 + " Text," +
                col_J.J7_2 + " Text," +
                col_J.J7_3 + " Text," +
                col_J.J7_4 + " Text," +
                col_J.J7_5 + " Text," +
                col_J.J7_6 + " Text," +
                col_J.J7_7 + " Text," +
                col_J.J7_8 + " Text," +
                col_J.J7_9 + " Text," +
                col_J.J8 + " Text," +
                col_J.J9 + " Text," +
                col_J.J10 + " Text," +
                col_K.K1 + " Text," +
                col_K.K2 + " Text," +
                col_K.K3 + " Text," +
                col_L.L1 + " Text," +
                col_L.L2 + " Text," +
                col_L.L3 + " Text," +
                col_L.L4 + " Text," +
                col_L.L5_1 + " Text," +
                col_L.L5_2 + " Text," +
                col_L.L5_3 + " Text," +
                col_L.L5_4 + " Text," +
                col_L.L5_5 + " Text," +
                col_L.L5_6 + " Text," +
                col_L.L5_7 + " Text," +
                col_L.L6_1 + " Text," +
                col_L.L6_2 + " Text," +
                col_L.L6_3 + " Text," +
                col_L.L6_4 + " Text," +
                col_L.L6_5 + " Text," +
                col_L.L6_6 + " Text," +
                col_L.L6_7 + " Text," +
                col_L.L7_1 + " Text," +
                col_L.L7_2 + " Text," +
                col_L.L7_3 + " Text," +
                col_L.L7_4 + " Text," +
                col_L.L7_5 + " Text," +
                col_L.L7_6 + " Text," +
                col_L.L7_7 + " Text," +
                col_L.L8_1 + " Text," +
                col_L.L8_2 + " Text," +
                col_L.L8_3 + " Text," +
                col_L.L8_4 + " Text," +
                col_L.L8_5 + " Text," +
                col_L.L8_6 + " Text," +
                col_L.L8_7 + " Text," +
                col_L.L9_1 + " Text," +
                col_L.L9_2 + " Text," +
                col_L.L9_3 + " Text," +
                col_L.L9_4 + " Text," +
                col_L.L9_5 + " Text," +
                col_L.L9_6 + " Text," +
                col_L.L9_7 + " Text," +
                col_L.L10 + " Text," +
                col_L.L11_1 + " Text," +
                col_L.L11_2 + " Text," +
                col_L.L11_3 + " Text," +
                col_L.L11_4 + " Text," +
                col_L.L11_5 + " Text," +
                col_L.L11_6 + " Text," +
                col_L.L12 + " Text," +
                col_L.L13_1 + " Text," +
                col_L.L13_2 + " Text," +
                col_L.L13_3 + " Text," +
                col_L.L13_4 + " Text," +
                col_L.L13_5 + " Text," +
                col_L.L13_6 + " Text," +
                col_L.L13_7 + " Text," +
                col_M.M1 + " Text," +
                col_M.M2 + " Text," +
                col_M.M3 + " Text," +
                col_M.M4_1 + " Text," +
                col_M.M4_2 + " Text," +
                col_M.M4_3 + " Text," +
                col_M.M4_4 + " Text," +
                col_M.M4_5 + " Text," +
                col_M.M4_6 + " Text," +
                col_M.M4_7 + " Text," +
                col_M.M4_8 + " Text," +
                col_M.M4_9 + " Text," +
                col_M.M4_10 + " Text," +
                col_M.M5 + " Text," +
                col_M.M6 + " Text," +
                col_M.M7 + " Text," +
                col_M.M8 + " Text," +
                col_M.M9 + " Text," +
                col_M.M10 + " Text," +
                col_M.M11 + " Text," +
                col_M.M12 + " Text," +
                col_N.N1_1 + " Text," +
                col_N.N1_2 + " Text," +
                col_N.N1_3 + " Text," +
                col_N.N1_4 + " Text," +
                col_N.N2_1 + " Text," +
                col_N.N2_2 + " Text," +
                col_N.N2_3 + " Text," +
                col_N.N3 + " Text," +
                col_N.N4 + " Text," +
                col_N.N5 + " Text," +
                col_N.N6 + " Text," +
                col_N.N7 + " Text," +
                col_N.N8 + " Text," +
                col_N.N9 + " Text," +
                col_N.N10 + " Text," +
                col_N.N11_1 + " Text," +
                col_N.N11_2 + " Text," +
                col_N.N11_3 + " Text," +
                col_N.N11_4 + " Text," +
                col_N.N11_5 + " Text," +
                col_N.N11_6 + " Text," +
                col_N.N11_7 + " Text," +
                col_N.N11_8 + " Text," +
                col_N.N11_9 + " Text," +
                col_N.N11_10 + " Text," +
                col_N.N11_11 + " Text," +
                col_N.N11_12 + " Text," +
                col_N.N11_13 + " Text," +
                col_N.N11_14 + " Text," +
                col_N.N11_15 + " Text," +
                col_N.N11_16 + " Text," +
                col_N.N11_17 + " Text," +
                col_N.N11_18 + " Text," +
                col_N.N11_19 + " Text," +
                col_N.N11_20 + " Text," +
                col_N.N12 + " Text," +
                col_N.N13_1 + " Text," +
                col_N.N13_2 + " Text," +
                col_N.N13_3 + " Text," +
                col_N.N13_4 + " Text," +
                col_N.N13_5 + " Text," +
                col_N.N13_6 + " Text," +
                col_N.N13_7 + " Text," +
                col_N.N13_8 + " Text," +
                col_N.N13_9 + " Text," +
                col_N.N13_10 + " Text," +
                col_N.N14_1 + " Text," +
                col_N.N14_2 + " Text," +
                col_N.N14_3 + " Text," +
                col_N.N14_4 + " Text," +
                col_N.N14_5 + " Text," +
                col_N.N14_6 + " Text," +
                col_N.N15_1 + " Text," +
                col_N.N15_2 + " Text," +
                col_N.N15_3 + " Text," +
                col_N.N16_1 + " Text," +
                col_N.N16_2 + " Text," +
                col_N.N16_3 + " Text," +
                col_N.N17 + " Text," +
                col_O.O1_1 + " Text," +
                col_O.O1_2 + " Text," +
                col_O.O1_3 + " Text," +
                col_O.O1_4 + " Text," +
                col_O.O2_1 + " Text," +
                col_O.O2_2 + " Text," +
                col_O.O2_3 + " Text," +
                col_O.O2_4 + " Text," +
                col_O.O3 + " Text," +
                col_O.O4 + " Text," +
                col_O.O5_1 + " Text," +
                col_O.O5_2 + " Text," +
                col_O.O5_3 + " Text," +
                col_O.O5_4 + " Text," +
                col_O.O5_5 + " Text," +
                col_O.O5_6 + " Text," +
                col_O.O5_7 + " Text," +
                col_O.O5_8 + " Text," +
                col_O.O5_9 + " Text," +
                col_O.O5_10 + " Text," +
                col_O.O5_11 + " Text," +
                col_O.O5_12 + " Text," +
                col_O.O5_13 + " Text," +
                col_O.O5_14 + " Text," +
                col_O.O5_15 + " Text," +
                col_O.O5_16 + " Text," +
                col_O.O5_17 + " Text," +
                col_O.O5_18 + " Text," +
                col_O.O5_19 + " Text," +
                col_O.O5_20 + " Text," +
                col_O.O5_21 + " Text," +
                col_O.O6 + " Text," +
                col_O.O7_1 + " Text," +
                col_O.O7_2 + " Text," +
                col_O.O7_3 + " Text," +
                col_O.O7_4 + " Text," +
                col_O.O7_5 + " Text," +
                col_O.O7_6 + " Text," +
                col_O.O7_7 + " Text," +
                col_O.O7_8 + " Text," +
                col_O.O7_9 + " Text," +
                col_O.O7_10 + " Text," +
                col_P.P1 + " Text," +
                col_P.P2 + " Text," +
                col_P.P3 + " Text," +
                col_P.P4 + " Text," +
                col_P.P5 + " Text," +
                col_P.P6 + " Text," +
                col_P.P7 + " Text," +
                col_P.P8 + " Text," +
                col_P.P9 + " Text," +
                col_P.P10 + " Text," +
                col_P.P11 + " Text," +
                col_P.P12 + " Text," +
                col_P.P13_1 + " Text," +
                col_P.P13_2 + " Text," +
                col_P.P13_3 + " Text," +
                col_P.P13_4 + " Text," +
                col_P.P14 + " Text," +
                col_P.P15_1 + " Text," +
                col_P.P15_2 + " Text," +
                col_P.P15_3 + " Text," +
                col_P.P16 + " Text," +
                col_P.P17 + " Text," +
                col_P.P18 + " Text," +
                col_P.P19 + " Text," +
                col_P.P20_1 + " Text," +
                col_P.P20_2 + " Text," +
                col_P.P20_3 + " Text," +
                col_P.P21_1 + " Text," +
                col_P.P21_2 + " Text," +
                col_P.P21_3 + " Text," +
                col_P.P21_4 + " Text," +
                col_P.P21_5 + " Text," +
                col_P.P22_1 + " Text," +
                col_P.P22_2 + " Text," +
                col_P.P22_3 + " Text," +
                col_P.P22_4 + " Text," +
                col_P.P22_5 + " Text," +
                col_P.P22_6 + " Text," +
                col_P.P22_7 + " Text," +
                col_P.P22_8 + " Text," +
                col_Q.Q1 + " Text," +
                col_Q.Q2 + " Text," +
                col_Q.Q3_1 + " Text," +
                col_Q.Q3_2 + " Text," +
                col_Q.Q3_3 + " Text," +
                col_Q.Q3_4 + " Text," +
                col_Q.Q4_1 + " Text," +
                col_Q.Q4_2 + " Text," +
                col_Q.Q4_3 + " Text," +
                col_Q.Q4_4 + " Text," +
                col_Q.Q4_5 + " Text," +
                col_Q.Q4_6 + " Text," +
                col_Q.Q4_7 + " Text," +
                col_Q.Q4_8 + " Text," +
                col_Q.Q4_9 + " Text," +
                col_Q.Q4_10 + " Text," +
                col_Q.Q4_11 + " Text," +
                col_Q.Q4_12 + " Text," +
                col_Q.Q4_13 + " Text," +
                col_Q.Q4_14 + " Text," +
                col_Q.Q4_15 + " Text," +
                col_Q.Q4_16 + " Text," +
                col_Q.Q4_17 + " Text," +
                col_Q.Q4_18 + " Text," +
                col_Q.Q4_19 + " Text," +
                col_Q.Q4_20 + " Text," +
                col_Q.Q4_21 + " Text," +
                col_Q.Q4_22 + " Text," +
                col_Q.Q4_23 + " Text," +
                col_Q.Q4_24 + " Text," +
                col_Q.Q5 + " Text," +
                col_Q.Q6 + " Text," +
                col_Q.Q7_1 + " Text," +
                col_Q.Q7_2 + " Text," +
                col_Q.Q7_3 + " Text," +
                col_Q.Q7_4 + " Text," +
                col_Q.Q7_5 + " Text," +
                col_Q.Q7_6 + " Text," +
                col_Q.Q7_7 + " Text," +
                col_Q.Q7_8 + " Text," +
                col_Q.Q7_9 + " Text," +
                col_Q.Q8_1 + " Text," +
                col_Q.Q8_2 + " Text," +
                col_Q.Q8_3 + " Text," +
                col_Q.Q8_4 + " Text," +
                col_Q.Q8_5 + " Text," +
                col_Q.Q8_6 + " Text," +
                col_Q.Q8_7 + " Text," +
                col_Q.Q8_8 + " Text," +
                col_Q.Q8_9 + " Text," +
                col_Q.Q8_10 + " Text," +
                col_Q.Q8_11 + " Text," +
                col_Q.Q8_12 + " Text," +
                col_Q.Q8_13 + " Text," +
                col_Q.Q8_14 + " Text," +
                col_Q.Q8_15 + " Text," +
                col_Q.Q8_16 + " Text," +
                col_Q.Q9 + " Text," +
                col_Q.Q10 + " Text," +
                col_Q.Q11 + " Text," +
                col_R.R1 + " Text," +
                col_R.R2 + " Text," +
                col_R.R3 + " Text," +
                col_R.R4 + " Text," +
                col_R.R5 + " Text," +
                col_R.R6 + " Text," +
                col_R.R7 + " Text," +
                col_R.R8 + " Text," +
                col_R.R9 + " Text," +
                col_R.R10 + " Text," +
                col_R.R11 + " Text," +
                col_R.R12 + " Text," +
                col_R.R13 + " Text," +
                col_R.R14 + " Text," +
                col_C.C2_76 + " Text," +
                col_C.C4_1 + " Text," +
                col_C.C2_77 + " Text," +
                col_C.C2_78 + " Text," +
                col_R.R15 + " Text," +
                col_P.P1_1 + " Text," +
                col_H.H4_8 + " Text," +
                col_H.H9_10 + " Text" +


                ')';


        return query;
    }
}
