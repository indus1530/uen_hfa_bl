package edu.aku.abdulsajid.uen_hfa_bl;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.LogtableUpdates;
import data.col_C;
import data.col_D;
import data.col_E;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.GothroughTextboxssC1;
import utils.HideC1Res1;
import utils.InputFilterMinMax;
import utils.Validation;


public class Fragment_C extends Fragment implements RadioButton.OnCheckedChangeListener {


    //region Checkbox Decleration

    Button btnDate;
    CheckBox
            L_C1_1,
            L_C1_2,
            L_C1_3,
            L_C1_4,
            L_C1_5,
            L_C1_6,
            L_C1_7,
            L_C1_8,
            L_C1_9,
            L_C1_10,
            L_C1_11,
            L_C1_12,
            L_C1_13,
            L_C1_14,
            L_C1_15,
            L_C1_16,
            L_C1_17,
            L_C1_18,
            L_C1_19,
            L_C1_20,
            L_C1_21,
            L_C1_22,
            L_C1_23,
            L_C1_24,
            L_C1_25,
            L_C1_26,
            L_C1_27,
            L_C1_28,
            L_C1_29,
            L_C1_30,
            L_C1_31,
            L_C1_32,
            L_C1_33,
            L_C1_34,
            L_C1_35,
            L_C1_36,
            L_C1_37,
            C_C2_1,
            C_C2_2,
            C_C2_3,
            C_C2_4,
            C_C2_5,
            C_C2_6,
            C_C2_7,
            C_C2_8,
            C_C2_9,
            C_C2_10,
            C_C2_11,
            C_C2_12,
            C_C2_13,
            C_C2_14,
            C_C2_15,
            C_C2_16,
            C_C2_17,
            C_C2_18,
            C_C2_19,
            C_C2_20,
            C_C2_21,
            C_C2_22,
            C_C2_23,
            C_C2_24,
            C_C2_25,
            C_C2_26,
            C_C2_27,
            C_C2_28,
            C_C2_29,
            C_C2_30,
            C_C2_31,
            C_C2_32,
            C_C2_33,
            C_C2_34,
            C_C2_35,
            C_C2_36,
            C_C2_37,
            C_C2_38,
            C_C2_39,
            C_C2_40,
            C_C2_41,
            C_C2_42,
            C_C2_43,
            C_C2_44,
            C_C2_45,
            C_C2_46,
            C_C2_47,
            C_C2_48,
            C_C2_49,
            C_C2_50,
            C_C2_51,
            C_C2_52,
            C_C2_53,
            C_C2_54,
            C_C2_55,
            C_C2_56,
            C_C2_57,
            C_C2_58,
            C_C2_59,
            C_C2_60,
            C_C2_61,
            C_C2_62,
            C_C2_63,
            C_C2_64,
            C_C2_65,
            C_C2_66,
            C_C2_67,
            C_C2_68,
            C_C2_69,
            C_C2_70,
            C_C2_71,
            C_C2_72,
            C_C2_73,
            C_C2_74,
            C_C2_75,
            C_C2_76,
            C_C2_77,
            C_C2_78;


    //endregion

    //region LinarLayout


    LinearLayout
            L_C1,
            lv_C1_1,
            lv_C1_2,
            lv_C1_3,
            lv_C1_4,
            lv_C1_5,
            lv_C1_6,
            lv_C1_7,
            lv_C1_8,
            lv_C1_9,
            lv_C1_10,
            lv_C1_11,
            lv_C1_12,
            lv_C1_13,
            lv_C1_14,
            lv_C1_15,
            lv_C1_16,
            lv_C1_17,
            lv_C1_18,
            lv_C1_19,
            lv_C1_20,
            lv_C1_21,
            lv_C1_22,
            lv_C1_23,
            lv_C1_24,
            lv_C1_25,
            lv_C1_26,
            lv_C1_27,
            lv_C1_28,
            lv_C1_29,
            lv_C1_30,
            lv_C1_31,
            lv_C1_32,
            lv_C1_33,
            lv_C1_34,
            lv_C1_35,
            lv_C1_36,
            lv_C1_37,
            lv_C2_1,
            lv_C2_2,
            lv_C2_3,
            lv_C2_4,
            lv_C2_5,
            lv_C2_6,
            lv_C2_7,
            lv_C2_8,
            lv_C2_9,
            lv_C2_10,
            lv_C2_11,
            lv_C2_12,
            lv_C2_13,
            lv_C2_14,
            lv_C2_15,
            lv_C2_16,
            lv_C2_17,
            lv_C2_18,
            lv_C2_19,
            lv_C2_20,
            lv_C2_21,
            lv_C2_22,
            lv_C2_23,
            lv_C2_24,
            lv_C2_25,
            lv_C2_26,
            lv_C2_27,
            lv_C2_28,
            lv_C2_29,
            lv_C2_30,
            lv_C2_31,
            lv_C2_32,
            lv_C2_33,
            lv_C2_34,
            lv_C2_35,
            lv_C2_36,
            lv_C2_37,
            lv_C2_38,
            lv_C2_39,
            lv_C2_40,
            lv_C2_41,
            lv_C2_42,
            lv_C2_43,
            lv_C2_44,
            lv_C2_45,
            lv_C2_46,
            lv_C2_47,
            lv_C2_48,
            lv_C2_49,
            lv_C2_50,
            lv_C2_51,
            lv_C2_52,
            lv_C2_53,
            lv_C2_54,
            lv_C2_55,
            lv_C2_56,
            lv_C2_57,
            lv_C2_58,
            lv_C2_59,
            lv_C2_60,
            lv_C2_61,
            lv_C2_62,
            lv_C2_63,
            lv_C2_64,
            lv_C2_65,
            lv_C2_66,
            lv_C2_67,
            lv_C2_68,
            lv_C2_69,
            lv_C2_70,
            lv_C2_71,
            lv_C2_72,
            lv_C2_73,
            lv_C2_74,
            lv_C2_75,
            lv_C2_76,
            lv_C2_77,
            lv_C2_78,


    lv_C3,
            lv_C4,
            lv_C4_1,
            lv_C5,
            lv_C6,
            lv_C7;


    //endregion

    //region Editextview

    EditText
            ed_C1_1_1,
            ed_C1_1_2,
            ed_C1_1_3,
            ed_C1_1_4,

    ed_C1_2_1,
            ed_C1_2_2,
            ed_C1_2_3,
            ed_C1_2_4,

    ed_C1_3_1,
            ed_C1_3_2,
            ed_C1_3_3,
            ed_C1_3_4,

    ed_C1_4_1,
            ed_C1_4_2,
            ed_C1_4_3,
            ed_C1_4_4,

    ed_C1_5_1,
            ed_C1_5_2,
            ed_C1_5_3,
            ed_C1_5_4,

    ed_C1_6_1,
            ed_C1_6_2,
            ed_C1_6_3,
            ed_C1_6_4,

    ed_C1_7_1,
            ed_C1_7_2,
            ed_C1_7_3,
            ed_C1_7_4,

    ed_C1_8_1,
            ed_C1_8_2,
            ed_C1_8_3,
            ed_C1_8_4,

    ed_C1_9_1,
            ed_C1_9_2,
            ed_C1_9_3,
            ed_C1_9_4,

    ed_C1_10_1,
            ed_C1_10_2,
            ed_C1_10_3,
            ed_C1_10_4,

    ed_C1_11_1,
            ed_C1_11_2,
            ed_C1_11_3,
            ed_C1_11_4,

    ed_C1_12_1,
            ed_C1_12_2,
            ed_C1_12_3,
            ed_C1_12_4,

    ed_C1_13_1,
            ed_C1_13_2,
            ed_C1_13_3,
            ed_C1_13_4,

    ed_C1_14_1,
            ed_C1_14_2,
            ed_C1_14_3,
            ed_C1_14_4,

    ed_C1_15_1,
            ed_C1_15_2,
            ed_C1_15_3,
            ed_C1_15_4,

    ed_C1_16_1,
            ed_C1_16_2,
            ed_C1_16_3,
            ed_C1_16_4,

    ed_C1_17_1,
            ed_C1_17_2,
            ed_C1_17_3,
            ed_C1_17_4,

    ed_C1_18_1,
            ed_C1_18_2,
            ed_C1_18_3,
            ed_C1_18_4,

    ed_C1_19_1,
            ed_C1_19_2,
            ed_C1_19_3,
            ed_C1_19_4,

    ed_C1_20_1,
            ed_C1_20_2,
            ed_C1_20_3,
            ed_C1_20_4,

    ed_C1_21_1,
            ed_C1_21_2,
            ed_C1_21_3,
            ed_C1_21_4,

    ed_C1_22_1,
            ed_C1_22_2,
            ed_C1_22_3,
            ed_C1_22_4,

    ed_C1_23_1,
            ed_C1_23_2,
            ed_C1_23_3,
            ed_C1_23_4,

    ed_C1_24_1,
            ed_C1_24_2,
            ed_C1_24_3,
            ed_C1_24_4,

    ed_C1_25_1,
            ed_C1_25_2,
            ed_C1_25_3,
            ed_C1_25_4,

    ed_C1_26_1,
            ed_C1_26_2,
            ed_C1_26_3,
            ed_C1_26_4,

    ed_C1_27_1,
            ed_C1_27_2,
            ed_C1_27_3,
            ed_C1_27_4,

    ed_C1_28_1,
            ed_C1_28_2,
            ed_C1_28_3,
            ed_C1_28_4,

    ed_C1_29_1,
            ed_C1_29_2,
            ed_C1_29_3,
            ed_C1_29_4,

    ed_C1_30_1,
            ed_C1_30_2,
            ed_C1_30_3,
            ed_C1_30_4,

    ed_C1_31_1,
            ed_C1_31_2,
            ed_C1_31_3,
            ed_C1_31_4,

    ed_C1_32_1,
            ed_C1_32_2,
            ed_C1_32_3,
            ed_C1_32_4,

    ed_C1_33_1,
            ed_C1_33_2,
            ed_C1_33_3,
            ed_C1_33_4,

    ed_C1_34_1,
            ed_C1_34_2,
            ed_C1_34_3,
            ed_C1_34_4,

    ed_C1_35_1,
            ed_C1_35_2,
            ed_C1_35_3,
            ed_C1_35_4,

    ed_C1_36_1,
            ed_C1_36_2,
            ed_C1_36_3,
            ed_C1_36_4,

    ed_C1_37_1,
            ed_C1_37_2,
            ed_C1_37_3,
            ed_C1_37_4,


    ed_C2_1,
            ed_C2_2,
            ed_C2_3,
            ed_C2_4,
            ed_C2_5,
            ed_C2_6,
            ed_C2_7,
            ed_C2_8,
            ed_C2_9,
            ed_C2_10,
            ed_C2_11,


    ed_C5_days,
            ed_C5_months,
            ed_C5_Year,
            ed_C7_3;


    //endregion


    //region Radiobutton


    RadioButton

            R_C2_12_1,
            R_C2_12_2,
            R_C2_12_3,
            R_C2_12_4,
            R_C2_12_5,
            R_C2_12_6,
            R_C2_12_7,
            R_C2_13_1,
            R_C2_13_2,
            R_C2_13_3,
            R_C2_13_4,
            R_C2_13_5,
            R_C2_13_6,
            R_C2_13_7,
            R_C2_14_1,
            R_C2_14_2,
            R_C2_14_3,
            R_C2_14_4,
            R_C2_14_5,
            R_C2_14_6,
            R_C2_14_7,
            R_C2_15_1,
            R_C2_15_2,
            R_C2_15_3,
            R_C2_15_4,
            R_C2_15_5,
            R_C2_15_6,
            R_C2_15_7,
            R_C2_16_1,
            R_C2_16_2,
            R_C2_16_3,
            R_C2_16_4,
            R_C2_16_5,
            R_C2_16_6,
            R_C2_16_7,
            R_C2_17_1,
            R_C2_17_2,
            R_C2_17_3,
            R_C2_17_4,
            R_C2_17_5,
            R_C2_17_6,
            R_C2_17_7,
            R_C2_18_1,
            R_C2_18_2,
            R_C2_18_3,
            R_C2_18_4,
            R_C2_18_5,
            R_C2_18_6,
            R_C2_18_7,
            R_C2_19_1,
            R_C2_19_2,
            R_C2_19_3,
            R_C2_19_4,
            R_C2_19_5,
            R_C2_19_6,
            R_C2_19_7,
            R_C2_20_1,
            R_C2_20_2,
            R_C2_20_3,
            R_C2_20_4,
            R_C2_20_5,
            R_C2_20_6,
            R_C2_20_7,
            R_C2_21_1,
            R_C2_21_2,
            R_C2_21_3,
            R_C2_21_4,
            R_C2_21_5,
            R_C2_21_6,
            R_C2_21_7,
            R_C2_22_1,
            R_C2_22_2,
            R_C2_22_3,
            R_C2_22_4,
            R_C2_22_5,
            R_C2_22_6,
            R_C2_22_7,
            R_C2_23_1,
            R_C2_23_2,
            R_C2_23_3,
            R_C2_23_4,
            R_C2_23_5,
            R_C2_23_6,
            R_C2_23_7,
            R_C2_24_1,
            R_C2_24_2,
            R_C2_24_3,
            R_C2_24_4,
            R_C2_24_5,
            R_C2_24_6,
            R_C2_24_7,
            R_C2_25_1,
            R_C2_25_2,
            R_C2_25_3,
            R_C2_25_4,
            R_C2_25_5,
            R_C2_25_6,
            R_C2_25_7,
            R_C2_26_1,
            R_C2_26_2,
            R_C2_26_3,
            R_C2_26_4,
            R_C2_26_5,
            R_C2_26_6,
            R_C2_26_7,
            R_C2_27_1,
            R_C2_27_2,
            R_C2_27_3,
            R_C2_27_4,
            R_C2_27_5,
            R_C2_27_6,
            R_C2_27_7,
            R_C2_28_1,
            R_C2_28_2,
            R_C2_28_3,
            R_C2_28_4,
            R_C2_28_5,
            R_C2_28_6,
            R_C2_28_7,
            R_C2_29_1,
            R_C2_29_2,
            R_C2_29_3,
            R_C2_29_4,
            R_C2_29_5,
            R_C2_29_6,
            R_C2_29_7,
            R_C2_30_1,
            R_C2_30_2,
            R_C2_30_3,
            R_C2_30_4,
            R_C2_30_5,
            R_C2_30_6,
            R_C2_30_7,
            R_C2_31_1,
            R_C2_31_2,
            R_C2_31_3,
            R_C2_31_4,
            R_C2_31_5,
            R_C2_31_6,
            R_C2_31_7,
            R_C2_32_1,
            R_C2_32_2,
            R_C2_32_3,
            R_C2_32_4,
            R_C2_32_5,
            R_C2_32_6,
            R_C2_32_7,
            R_C2_33_1,
            R_C2_33_2,
            R_C2_33_3,
            R_C2_33_4,
            R_C2_33_5,
            R_C2_33_6,
            R_C2_33_7,
            R_C2_34_1,
            R_C2_34_2,
            R_C2_34_3,
            R_C2_34_4,
            R_C2_34_5,
            R_C2_34_6,
            R_C2_34_7,
            R_C2_35_1,
            R_C2_35_2,
            R_C2_35_3,
            R_C2_35_4,
            R_C2_35_5,
            R_C2_35_6,
            R_C2_35_7,
            R_C2_36_1,
            R_C2_36_2,
            R_C2_36_3,
            R_C2_36_4,
            R_C2_36_5,
            R_C2_36_6,
            R_C2_36_7,
            R_C2_37_1,
            R_C2_37_2,
            R_C2_37_3,
            R_C2_37_4,
            R_C2_37_5,
            R_C2_37_6,
            R_C2_37_7,
            R_C2_38_1,
            R_C2_38_2,
            R_C2_38_3,
            R_C2_38_4,
            R_C2_38_5,
            R_C2_38_6,
            R_C2_38_7,
            R_C2_39_1,
            R_C2_39_2,
            R_C2_39_3,
            R_C2_39_4,
            R_C2_39_5,
            R_C2_39_6,
            R_C2_39_7,
            R_C2_40_1,
            R_C2_40_2,
            R_C2_40_3,
            R_C2_40_4,
            R_C2_40_5,
            R_C2_40_6,
            R_C2_40_7,
            R_C2_41_1,
            R_C2_41_2,
            R_C2_41_3,
            R_C2_41_4,
            R_C2_41_5,
            R_C2_41_6,
            R_C2_41_7,
            R_C2_42_1,
            R_C2_42_2,
            R_C2_42_3,
            R_C2_42_4,
            R_C2_42_5,
            R_C2_42_6,
            R_C2_42_7,
            R_C2_43_1,
            R_C2_43_2,
            R_C2_43_3,
            R_C2_43_4,
            R_C2_43_5,
            R_C2_43_6,
            R_C2_43_7,
            R_C2_44_1,
            R_C2_44_2,
            R_C2_44_3,
            R_C2_44_4,
            R_C2_44_5,
            R_C2_44_6,
            R_C2_44_7,
            R_C2_45_1,
            R_C2_45_2,
            R_C2_45_3,
            R_C2_45_4,
            R_C2_45_5,
            R_C2_45_6,
            R_C2_45_7,
            R_C2_46_1,
            R_C2_46_2,
            R_C2_46_3,
            R_C2_46_4,
            R_C2_46_5,
            R_C2_46_6,
            R_C2_46_7,

    R_C2_47_1,
            R_C2_47_2,
            R_C2_47_3,
            R_C2_47_4,
            R_C2_47_5,
            R_C2_47_6,
            R_C2_47_7,
            R_C2_48_1,
            R_C2_48_2,
            R_C2_48_3,
            R_C2_48_4,
            R_C2_48_5,
            R_C2_48_6,
            R_C2_48_7,
            R_C2_49_1,
            R_C2_49_2,
            R_C2_49_3,
            R_C2_49_4,
            R_C2_49_5,
            R_C2_49_6,
            R_C2_49_7,
            R_C2_50_1,
            R_C2_50_2,
            R_C2_50_3,
            R_C2_50_4,
            R_C2_50_5,
            R_C2_50_6,
            R_C2_50_7,
            R_C2_51_1,
            R_C2_51_2,
            R_C2_51_3,
            R_C2_51_4,
            R_C2_51_5,
            R_C2_51_6,
            R_C2_51_7,
            R_C2_52_1,
            R_C2_52_2,
            R_C2_52_3,
            R_C2_52_4,
            R_C2_52_5,
            R_C2_52_6,
            R_C2_52_7,
            R_C2_53_1,
            R_C2_53_2,
            R_C2_53_3,
            R_C2_53_4,
            R_C2_53_5,
            R_C2_53_6,
            R_C2_53_7,
            R_C2_54_1,
            R_C2_54_2,
            R_C2_54_3,
            R_C2_54_4,
            R_C2_54_5,
            R_C2_54_6, R_C2_54_7,

    R_C2_55_1,
            R_C2_55_2,
            R_C2_55_3,
            R_C2_55_4,
            R_C2_55_5,
            R_C2_55_6,
            R_C2_55_7,
            R_C2_56_1,
            R_C2_56_2,
            R_C2_56_3,
            R_C2_56_4,
            R_C2_56_5,
            R_C2_56_6,
            R_C2_56_7,
            R_C2_57_1,
            R_C2_57_2,
            R_C2_57_3,
            R_C2_57_4,
            R_C2_57_5,
            R_C2_57_6,
            R_C2_57_7,
            R_C2_58_1,
            R_C2_58_2,
            R_C2_58_3,
            R_C2_58_4,
            R_C2_58_5,
            R_C2_58_6,
            R_C2_58_7,
            R_C2_59_1,
            R_C2_59_2,
            R_C2_59_3,
            R_C2_59_4,
            R_C2_59_5,
            R_C2_59_6,
            R_C2_59_7,
            R_C2_60_1,
            R_C2_60_2,
            R_C2_60_3,
            R_C2_60_4,
            R_C2_60_5,
            R_C2_60_6,
            R_C2_60_7,
            R_C2_61_1,
            R_C2_61_2,
            R_C2_61_3,
            R_C2_61_4,
            R_C2_61_5,
            R_C2_61_6,
            R_C2_61_7,
            R_C2_62_1,
            R_C2_62_2,
            R_C2_62_3,
            R_C2_62_4,
            R_C2_62_5,
            R_C2_62_6,
            R_C2_62_7,
            R_C2_63_1,
            R_C2_63_2,
            R_C2_63_3,
            R_C2_63_4,
            R_C2_63_5,
            R_C2_63_6,
            R_C2_63_7,
            R_C2_64_1,
            R_C2_64_2,
            R_C2_64_3,
            R_C2_64_4,
            R_C2_64_5,
            R_C2_64_6,
            R_C2_64_7,
            R_C2_65_1,
            R_C2_65_2,
            R_C2_65_3,
            R_C2_65_4,
            R_C2_65_5,
            R_C2_65_6,
            R_C2_65_7,
            R_C2_66_1,
            R_C2_66_2,
            R_C2_66_3,
            R_C2_66_4,
            R_C2_66_5,
            R_C2_66_6,
            R_C2_66_7,
            R_C2_67_1,
            R_C2_67_2,
            R_C2_67_3,
            R_C2_67_4,
            R_C2_67_5,
            R_C2_67_6,
            R_C2_67_7,
            R_C2_68_1,
            R_C2_68_2,
            R_C2_68_3,
            R_C2_68_4,
            R_C2_68_5,
            R_C2_68_6,
            R_C2_68_7,
            R_C2_69_1,
            R_C2_69_2,
            R_C2_69_3,
            R_C2_69_4,
            R_C2_69_5,
            R_C2_69_6,
            R_C2_69_7,
            R_C2_70_1,
            R_C2_70_2,
            R_C2_70_3,
            R_C2_70_4,
            R_C2_70_5,
            R_C2_70_6,
            R_C2_70_7,
            R_C2_71_1,
            R_C2_71_2,
            R_C2_71_3,
            R_C2_71_4,
            R_C2_71_5,
            R_C2_71_6,
            R_C2_71_7,
            R_C2_72_1,
            R_C2_72_2,
            R_C2_72_3,
            R_C2_72_4,
            R_C2_72_5,
            R_C2_72_6,
            R_C2_72_7,
            R_C2_73_1,
            R_C2_73_2,
            R_C2_73_3,
            R_C2_73_4,
            R_C2_73_5,
            R_C2_73_6,
            R_C2_73_7,
            R_C2_74_1,
            R_C2_74_2,
            R_C2_74_3,
            R_C2_74_4,
            R_C2_74_5,
            R_C2_74_6,
            R_C2_74_7,
            R_C2_75_1,
            R_C2_75_2,
            R_C2_75_3,
            R_C2_75_4,
            R_C2_75_5,
            R_C2_75_6,
            R_C2_75_7,
            R_C2_76_1,
            R_C2_76_2,
            R_C2_76_3,
            R_C2_76_4,
            R_C2_76_5,
            R_C2_76_6,
            R_C2_76_7,
            R_C2_77_1,
            R_C2_77_2,
            R_C2_77_3,
            R_C2_77_4,
            R_C2_77_5,
            R_C2_77_6,
            R_C2_77_7,
            R_C2_78_1,
            R_C2_78_2,
            R_C2_78_3,
            R_C2_78_4,
            R_C2_78_5,
            R_C2_78_6,
            R_C3_1,
            R_C3_2,
            R_C3_3,
            R_C3_4,
            R_C3_5,
            R_C4_1,
            R_C4_2,
            R_C4_3,
            R_C4_4,
            R_C4_5,
            R_C4_6,
            R_C6_Yes,
            R_C6_No,
            R_C7_1,
            R_C7_2,
            R_C7_3;


    //endregion


    //region String decletion

    String
            C1_1_1,
            C1_1_2,
            C1_1_3,
            C1_1_4,
            C1_2_1,
            C1_2_2,
            C1_2_3,
            C1_2_4,
            C1_3_1,
            C1_3_2,
            C1_3_3,
            C1_3_4,
            C1_4_1,
            C1_4_2,
            C1_4_3,
            C1_4_4,
            C1_5_1,
            C1_5_2,
            C1_5_3,
            C1_5_4,
            C1_6_1,
            C1_6_2,
            C1_6_3,
            C1_6_4,
            C1_7_1,
            C1_7_2,
            C1_7_3,
            C1_7_4,
            C1_8_1,
            C1_8_2,
            C1_8_3,
            C1_8_4,
            C1_9_1,
            C1_9_2,
            C1_9_3,
            C1_9_4,
            C1_10_1,
            C1_10_2,
            C1_10_3,
            C1_10_4,
            C1_11_1,
            C1_11_2,
            C1_11_3,
            C1_11_4,
            C1_12_1,
            C1_12_2,
            C1_12_3,
            C1_12_4,
            C1_13_1,
            C1_13_2,
            C1_13_3,
            C1_13_4,
            C1_14_1,
            C1_14_2,
            C1_14_3,
            C1_14_4,
            C1_15_1,
            C1_15_2,
            C1_15_3,
            C1_15_4,
            C1_16_1,
            C1_16_2,
            C1_16_3,
            C1_16_4,
            C1_17_1,
            C1_17_2,
            C1_17_3,
            C1_17_4,
            C1_18_1,
            C1_18_2,
            C1_18_3,
            C1_18_4,
            C1_19_1,
            C1_19_2,
            C1_19_3,
            C1_19_4,
            C1_20_1,
            C1_20_2,
            C1_20_3,
            C1_20_4,
            C1_21_1,
            C1_21_2,
            C1_21_3,
            C1_21_4,
            C1_22_1,
            C1_22_2,
            C1_22_3,
            C1_22_4,
            C1_23_1,
            C1_23_2,
            C1_23_3,
            C1_23_4,
            C1_24_1,
            C1_24_2,
            C1_24_3,
            C1_24_4,
            C1_25_1,
            C1_25_2,
            C1_25_3,
            C1_25_4,
            C1_26_1,
            C1_26_2,
            C1_26_3,
            C1_26_4,
            C1_27_1,
            C1_27_2,
            C1_27_3,
            C1_27_4,
            C1_28_1,
            C1_28_2,
            C1_28_3,
            C1_28_4,
            C1_29_1,
            C1_29_2,
            C1_29_3,
            C1_29_4,
            C1_30_1,
            C1_30_2,
            C1_30_3,
            C1_30_4,
            C1_31_1,
            C1_31_2,
            C1_31_3,
            C1_31_4,
            C1_32_1,
            C1_32_2,
            C1_32_3,
            C1_32_4,
            C1_33_1,
            C1_33_2,
            C1_33_3,
            C1_33_4,
            C1_34_1,
            C1_34_2,
            C1_34_3,
            C1_34_4,
            C1_35_1,
            C1_35_2,
            C1_35_3,
            C1_35_4,
            C1_36_1,
            C1_36_2,
            C1_36_3,
            C1_36_4,
            C1_37_1,
            C1_37_2,
            C1_37_3,
            C1_37_4,
            C2_1,
            C2_2,
            C2_3,
            C2_4,
            C2_5,
            C2_6,
            C2_7,
            C2_8,
            C2_9,
            C2_10,
            C2_11,
            C2_12,
            C2_13,
            C2_14,
            C2_15,
            C2_16,
            C2_17,
            C2_18,
            C2_19,
            C2_20,
            C2_21,
            C2_22,
            C2_23,
            C2_24,
            C2_25,
            C2_26,
            C2_27,
            C2_28,
            C2_29,
            C2_30,
            C2_31,
            C2_32,
            C2_33,
            C2_34,
            C2_35,
            C2_36,
            C2_37,
            C2_38,
            C2_39,
            C2_40,
            C2_41,
            C2_42,
            C2_43,
            C2_44,
            C2_45,
            C2_46,
            C2_47,
            C2_48,
            C2_49,
            C2_50,
            C2_51,
            C2_52,
            C2_53,
            C2_54,
            C2_55,
            C2_56,
            C2_57,
            C2_58,
            C2_59,
            C2_60,
            C2_61,
            C2_62,
            C2_63,
            C2_64,
            C2_65,
            C2_66,
            C2_67,
            C2_68,
            C2_69,
            C2_70,
            C2_71,
            C2_72,
            C2_73,
            C2_74,
            C2_75,
            C2_76,
            C2_77,
            C2_78,
            C3,
            C4,
            C4_1,
            C5,
            C6,
            C7;

    //endregion

    private OnFragmentInteractionListener mListener;

    public Fragment_C() {
    }

    public static Fragment_C newInstance(String param1, String param2) {
        Fragment_C fragment = new Fragment_C();

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


        View v = inflater.inflate(R.layout.fragment_c, container, false);


        initializeCheckbox(v);
        initializeEditetview(v);
        initializeRadioButton(v);
        intializeLinerlayout(v);


        //region Click Listerner


        L_C1_1.setOnCheckedChangeListener(this);
        L_C1_2.setOnCheckedChangeListener(this);
        L_C1_3.setOnCheckedChangeListener(this);
        L_C1_4.setOnCheckedChangeListener(this);
        L_C1_5.setOnCheckedChangeListener(this);
        L_C1_6.setOnCheckedChangeListener(this);
        L_C1_7.setOnCheckedChangeListener(this);
        L_C1_8.setOnCheckedChangeListener(this);
        L_C1_9.setOnCheckedChangeListener(this);
        L_C1_10.setOnCheckedChangeListener(this);
        L_C1_11.setOnCheckedChangeListener(this);
        L_C1_12.setOnCheckedChangeListener(this);
        L_C1_13.setOnCheckedChangeListener(this);
        L_C1_14.setOnCheckedChangeListener(this);
        L_C1_15.setOnCheckedChangeListener(this);
        L_C1_16.setOnCheckedChangeListener(this);
        L_C1_17.setOnCheckedChangeListener(this);
        L_C1_18.setOnCheckedChangeListener(this);
        L_C1_19.setOnCheckedChangeListener(this);
        L_C1_20.setOnCheckedChangeListener(this);
        L_C1_21.setOnCheckedChangeListener(this);
        L_C1_22.setOnCheckedChangeListener(this);
        L_C1_23.setOnCheckedChangeListener(this);
        L_C1_24.setOnCheckedChangeListener(this);
        L_C1_25.setOnCheckedChangeListener(this);
        L_C1_26.setOnCheckedChangeListener(this);
        L_C1_27.setOnCheckedChangeListener(this);
        L_C1_28.setOnCheckedChangeListener(this);
        L_C1_29.setOnCheckedChangeListener(this);
        L_C1_30.setOnCheckedChangeListener(this);
        L_C1_31.setOnCheckedChangeListener(this);
        L_C1_32.setOnCheckedChangeListener(this);
        L_C1_33.setOnCheckedChangeListener(this);
        L_C1_34.setOnCheckedChangeListener(this);
        L_C1_35.setOnCheckedChangeListener(this);
        L_C1_36.setOnCheckedChangeListener(this);
        L_C1_37.setOnCheckedChangeListener(this);
        C_C2_1.setOnCheckedChangeListener(this);
        C_C2_2.setOnCheckedChangeListener(this);
        C_C2_3.setOnCheckedChangeListener(this);
        C_C2_4.setOnCheckedChangeListener(this);
        C_C2_5.setOnCheckedChangeListener(this);
        C_C2_6.setOnCheckedChangeListener(this);
        C_C2_7.setOnCheckedChangeListener(this);
        C_C2_8.setOnCheckedChangeListener(this);
        C_C2_9.setOnCheckedChangeListener(this);
        C_C2_10.setOnCheckedChangeListener(this);
        C_C2_11.setOnCheckedChangeListener(this);
        C_C2_12.setOnCheckedChangeListener(this);
        C_C2_13.setOnCheckedChangeListener(this);
        C_C2_14.setOnCheckedChangeListener(this);
        C_C2_15.setOnCheckedChangeListener(this);
        C_C2_16.setOnCheckedChangeListener(this);
        C_C2_17.setOnCheckedChangeListener(this);
        C_C2_18.setOnCheckedChangeListener(this);
        C_C2_19.setOnCheckedChangeListener(this);
        C_C2_20.setOnCheckedChangeListener(this);
        C_C2_21.setOnCheckedChangeListener(this);
        C_C2_22.setOnCheckedChangeListener(this);
        C_C2_23.setOnCheckedChangeListener(this);
        C_C2_24.setOnCheckedChangeListener(this);
        C_C2_25.setOnCheckedChangeListener(this);
        C_C2_26.setOnCheckedChangeListener(this);
        C_C2_27.setOnCheckedChangeListener(this);
        C_C2_28.setOnCheckedChangeListener(this);
        C_C2_29.setOnCheckedChangeListener(this);
        C_C2_30.setOnCheckedChangeListener(this);
        C_C2_31.setOnCheckedChangeListener(this);
        C_C2_32.setOnCheckedChangeListener(this);
        C_C2_33.setOnCheckedChangeListener(this);
        C_C2_34.setOnCheckedChangeListener(this);
        C_C2_35.setOnCheckedChangeListener(this);
        C_C2_36.setOnCheckedChangeListener(this);
        C_C2_37.setOnCheckedChangeListener(this);
        C_C2_38.setOnCheckedChangeListener(this);
        C_C2_39.setOnCheckedChangeListener(this);
        C_C2_40.setOnCheckedChangeListener(this);
        C_C2_41.setOnCheckedChangeListener(this);
        C_C2_42.setOnCheckedChangeListener(this);
        C_C2_43.setOnCheckedChangeListener(this);
        C_C2_44.setOnCheckedChangeListener(this);
        C_C2_45.setOnCheckedChangeListener(this);
        C_C2_46.setOnCheckedChangeListener(this);
        C_C2_47.setOnCheckedChangeListener(this);
        C_C2_48.setOnCheckedChangeListener(this);
        C_C2_49.setOnCheckedChangeListener(this);
        C_C2_50.setOnCheckedChangeListener(this);
        C_C2_51.setOnCheckedChangeListener(this);
        C_C2_52.setOnCheckedChangeListener(this);
        C_C2_53.setOnCheckedChangeListener(this);
        C_C2_54.setOnCheckedChangeListener(this);
        C_C2_55.setOnCheckedChangeListener(this);
        C_C2_56.setOnCheckedChangeListener(this);
        C_C2_57.setOnCheckedChangeListener(this);
        C_C2_58.setOnCheckedChangeListener(this);
        C_C2_59.setOnCheckedChangeListener(this);
        C_C2_60.setOnCheckedChangeListener(this);
        C_C2_61.setOnCheckedChangeListener(this);
        C_C2_62.setOnCheckedChangeListener(this);
        C_C2_63.setOnCheckedChangeListener(this);
        C_C2_64.setOnCheckedChangeListener(this);
        C_C2_65.setOnCheckedChangeListener(this);
        C_C2_66.setOnCheckedChangeListener(this);
        C_C2_67.setOnCheckedChangeListener(this);
        C_C2_68.setOnCheckedChangeListener(this);
        C_C2_69.setOnCheckedChangeListener(this);
        C_C2_70.setOnCheckedChangeListener(this);
        C_C2_71.setOnCheckedChangeListener(this);
        C_C2_72.setOnCheckedChangeListener(this);
        C_C2_73.setOnCheckedChangeListener(this);
        C_C2_74.setOnCheckedChangeListener(this);
        C_C2_75.setOnCheckedChangeListener(this);
        C_C2_76.setOnCheckedChangeListener(this);
        C_C2_77.setOnCheckedChangeListener(this);
        C_C2_78.setOnCheckedChangeListener(this);


        R_C6_Yes.setOnCheckedChangeListener(this);
        R_C6_No.setOnCheckedChangeListener(this);

        R_C7_1.setOnCheckedChangeListener(this);
        R_C7_2.setOnCheckedChangeListener(this);
        R_C7_3.setOnCheckedChangeListener(this);
        btnDate = (Button) v.findViewById(R.id.b_C4_1);


        ed_C5_days.setFilters(new InputFilter[]{new InputFilterMinMax("0", "30")});
        ed_C5_months.setFilters(new InputFilter[]{new InputFilterMinMax("0", "12")});

        //endregion


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        btnDate.setText(y + "/" + (m + 1) + "/" + d);
                    }
                }, 2017, 06, 6);
                dialog.show();
            }
        });


        Button btnNext = (Button) v.findViewById(R.id.btn_A_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Validationiamgood() == false) {


                    Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                    return;

                }


                if (IamgoodParttwoo() == false) {


                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Warning");
                    builder.setMessage("Do you want to SUBMIT this section. Please note that " +
                            "there is some missing values");
                    builder.setCancelable(false);

                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                            if (asignValues() == false) {


                                Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                                return;

                            }

                            updateHFA();
                            LogtableUpdates.UpdateLogSection(getContext(), "C", Validation.A1);
                            FragmentManager fm = getFragmentManager();
                            FragmentTransaction ftu = fm.beginTransaction();


                            if (Validation.A4 == "2") {


                                updateHFADsection();
                                UpdateHfaEsection();

                                Fragment_F fragment = new Fragment_F();
                                ftu.replace(R.id.frag_container, fragment).commit();
                            } else {
                                Fragment_D fragment = new Fragment_D();
                                ftu.replace(R.id.frag_container, fragment).commit();
                            }


                            dialogInterface.dismiss();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            return;
                        }
                    }).show();
                } else {
                    if (asignValues() == false) {


                        Toast.makeText(getContext(), "There is Some Missing Question Kindly Fill that Scroll Up and Down", Toast.LENGTH_LONG).show();
                        return;

                    }
                    updateHFA();
                    LogtableUpdates.UpdateLogSection(getContext(), "C", Validation.A1);
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ftu = fm.beginTransaction();


                    if (Validation.A4 == "2") {


                        updateHFADsection();
                        UpdateHfaEsection();

                        Fragment_F fragment = new Fragment_F();
                        ftu.replace(R.id.frag_container, fragment).commit();
                    } else {
                        Fragment_D fragment = new Fragment_D();
                        ftu.replace(R.id.frag_container, fragment).commit();
                    }
                }


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

        if (compoundButton.getId() == R.id.L_C1_1) {
            if (L_C1_1.isChecked()) {
                lv_C1_1.setVisibility(View.VISIBLE);

            } else {
                lv_C1_1.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_1);
            }
        }

        if (compoundButton.getId() == R.id.L_C1_2) {
            if (L_C1_2.isChecked()) {
                lv_C1_2.setVisibility(View.VISIBLE);
            } else {
                lv_C1_2.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_2);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_3) {
            if (L_C1_3.isChecked()) {
                lv_C1_3.setVisibility(View.VISIBLE);
            } else {
                lv_C1_3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_3);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_4) {
            if (L_C1_4.isChecked()) {
                lv_C1_4.setVisibility(View.VISIBLE);
            } else {
                lv_C1_4.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_4);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_5) {
            if (L_C1_5.isChecked()) {
                lv_C1_5.setVisibility(View.VISIBLE);
            } else {
                lv_C1_5.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_5);

            }
        }

        if (compoundButton.getId() == R.id.L_C1_6) {
            if (L_C1_6.isChecked()) {
                lv_C1_6.setVisibility(View.VISIBLE);
            } else {
                lv_C1_6.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_6);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_7) {
            if (L_C1_7.isChecked()) {
                lv_C1_7.setVisibility(View.VISIBLE);
            } else {
                lv_C1_7.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_7);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_8) {
            if (L_C1_8.isChecked()) {
                lv_C1_8.setVisibility(View.VISIBLE);
            } else {
                lv_C1_8.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_8);

                HideC1Res1.IamHiden(lv_C1_8);
            }
        }

        if (compoundButton.getId() == R.id.L_C1_9) {
            if (L_C1_9.isChecked()) {
                lv_C1_9.setVisibility(View.VISIBLE);
            } else {
                lv_C1_9.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_9);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_10) {
            if (L_C1_10.isChecked()) {
                lv_C1_10.setVisibility(View.VISIBLE);
            } else {
                lv_C1_10.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_10);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_11) {
            if (L_C1_11.isChecked()) {
                lv_C1_11.setVisibility(View.VISIBLE);
            } else {
                lv_C1_11.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_11);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_12) {
            if (L_C1_12.isChecked()) {
                lv_C1_12.setVisibility(View.VISIBLE);
            } else {
                lv_C1_12.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_12);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_13) {
            if (L_C1_13.isChecked()) {
                lv_C1_13.setVisibility(View.VISIBLE);
            } else {
                lv_C1_13.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_13);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_14) {
            if (L_C1_14.isChecked()) {
                lv_C1_14.setVisibility(View.VISIBLE);
            } else {
                lv_C1_14.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_14);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_15) {
            if (L_C1_15.isChecked()) {
                lv_C1_15.setVisibility(View.VISIBLE);
            } else {
                lv_C1_15.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_15);

                HideC1Res1.IamHiden(lv_C1_15);
            }
        }

        if (compoundButton.getId() == R.id.L_C1_16) {
            if (L_C1_16.isChecked()) {
                lv_C1_16.setVisibility(View.VISIBLE);
            } else {
                lv_C1_16.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_16);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_17) {
            if (L_C1_17.isChecked()) {
                lv_C1_17.setVisibility(View.VISIBLE);
            } else {
                lv_C1_17.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_17);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_18) {
            if (L_C1_18.isChecked()) {
                lv_C1_18.setVisibility(View.VISIBLE);
            } else {
                lv_C1_18.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_18);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_19) {
            if (L_C1_19.isChecked()) {
                lv_C1_19.setVisibility(View.VISIBLE);
            } else {
                lv_C1_19.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_19);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_20) {
            if (L_C1_20.isChecked()) {
                lv_C1_20.setVisibility(View.VISIBLE);
            } else {
                lv_C1_20.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_20);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_21) {
            if (L_C1_21.isChecked()) {
                lv_C1_21.setVisibility(View.VISIBLE);
            } else {
                lv_C1_21.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_21);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_22) {
            if (L_C1_22.isChecked()) {
                lv_C1_22.setVisibility(View.VISIBLE);
            } else {
                lv_C1_22.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_22);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_23) {
            if (L_C1_23.isChecked()) {
                lv_C1_23.setVisibility(View.VISIBLE);
            } else {
                lv_C1_23.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_23);

                HideC1Res1.IamHiden(lv_C1_23);
            }
        }

        if (compoundButton.getId() == R.id.L_C1_24) {
            if (L_C1_24.isChecked()) {
                lv_C1_24.setVisibility(View.VISIBLE);
            } else {
                lv_C1_24.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_24);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_25) {
            if (L_C1_25.isChecked()) {
                lv_C1_25.setVisibility(View.VISIBLE);
            } else {
                lv_C1_25.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_25);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_26) {
            if (L_C1_26.isChecked()) {
                lv_C1_26.setVisibility(View.VISIBLE);
            } else {
                lv_C1_26.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_26);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_27) {
            if (L_C1_27.isChecked()) {
                lv_C1_27.setVisibility(View.VISIBLE);
            } else {
                lv_C1_27.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_27);


            }
        }


        if (compoundButton.getId() == R.id.L_C1_28) {
            if (L_C1_28.isChecked()) {
                lv_C1_28.setVisibility(View.VISIBLE);
            } else {
                lv_C1_28.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_28);


            }
        }

        if (compoundButton.getId() == R.id.L_C1_29) {
            if (L_C1_29.isChecked()) {
                lv_C1_29.setVisibility(View.VISIBLE);
            } else {
                lv_C1_29.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_29);

            }
        }
        if (compoundButton.getId() == R.id.L_C1_30) {
            if (L_C1_30.isChecked()) {
                lv_C1_30.setVisibility(View.VISIBLE);
            } else {
                lv_C1_30.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_30);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_31) {
            if (L_C1_31.isChecked()) {
                lv_C1_31.setVisibility(View.VISIBLE);
            } else {
                lv_C1_31.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_31);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_32) {
            if (L_C1_32.isChecked()) {
                lv_C1_32.setVisibility(View.VISIBLE);
            } else {
                lv_C1_32.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_32);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_33) {
            if (L_C1_33.isChecked()) {
                lv_C1_33.setVisibility(View.VISIBLE);
            } else {
                lv_C1_33.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_33);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_34) {
            if (L_C1_34.isChecked()) {
                lv_C1_34.setVisibility(View.VISIBLE);
            } else {
                lv_C1_34.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_34);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_35) {
            if (L_C1_35.isChecked()) {
                lv_C1_35.setVisibility(View.VISIBLE);
            } else {
                lv_C1_35.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_35);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_36) {
            if (L_C1_36.isChecked()) {
                lv_C1_36.setVisibility(View.VISIBLE);
            } else {
                lv_C1_36.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_36);
            }
        }
        if (compoundButton.getId() == R.id.L_C1_37) {
            if (L_C1_37.isChecked()) {
                lv_C1_37.setVisibility(View.VISIBLE);
            } else {
                lv_C1_37.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C1_37);
            }
        }


        /// C2 Events


        if (compoundButton.getId() == R.id.C_C2_1) {
            if (C_C2_1.isChecked()) {
                lv_C2_1.setVisibility(View.VISIBLE);
            } else {
                lv_C2_1.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_1);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_2) {
            if (C_C2_2.isChecked()) {
                lv_C2_2.setVisibility(View.VISIBLE);
            } else {
                lv_C2_2.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_2);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_3) {
            if (C_C2_3.isChecked()) {
                lv_C2_3.setVisibility(View.VISIBLE);
            } else {
                lv_C2_3.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_3);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_4) {
            if (C_C2_4.isChecked()) {
                lv_C2_4.setVisibility(View.VISIBLE);
            } else {
                lv_C2_4.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_4);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_5) {
            if (C_C2_5.isChecked()) {
                lv_C2_5.setVisibility(View.VISIBLE);
            } else {
                lv_C2_5.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_5);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_6) {
            if (C_C2_6.isChecked()) {
                lv_C2_6.setVisibility(View.VISIBLE);
            } else {
                lv_C2_6.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_6);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_7) {
            if (C_C2_7.isChecked()) {
                lv_C2_7.setVisibility(View.VISIBLE);
            } else {
                lv_C2_7.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_7);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_8) {
            if (C_C2_8.isChecked()) {
                lv_C2_8.setVisibility(View.VISIBLE);
            } else {
                lv_C2_8.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_8);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_9) {
            if (C_C2_9.isChecked()) {
                lv_C2_9.setVisibility(View.VISIBLE);
            } else {
                lv_C2_9.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_9);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_10) {
            if (C_C2_10.isChecked()) {
                lv_C2_10.setVisibility(View.VISIBLE);
            } else {
                lv_C2_10.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_10);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_11) {
            if (C_C2_11.isChecked()) {
                lv_C2_11.setVisibility(View.VISIBLE);
            } else {
                lv_C2_11.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_11);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_12) {
            if (C_C2_12.isChecked()) {
                lv_C2_12.setVisibility(View.VISIBLE);
            } else {
                lv_C2_12.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_12);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_13) {
            if (C_C2_13.isChecked()) {
                lv_C2_13.setVisibility(View.VISIBLE);
            } else {
                lv_C2_13.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_13);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_14) {
            if (C_C2_14.isChecked()) {
                lv_C2_14.setVisibility(View.VISIBLE);
            } else {
                lv_C2_14.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_14);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_15) {
            if (C_C2_15.isChecked()) {
                lv_C2_15.setVisibility(View.VISIBLE);
            } else {
                lv_C2_15.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_15);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_16) {
            if (C_C2_16.isChecked()) {
                lv_C2_16.setVisibility(View.VISIBLE);
            } else {
                lv_C2_16.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_16);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_17) {
            if (C_C2_17.isChecked()) {
                lv_C2_17.setVisibility(View.VISIBLE);
            } else {
                lv_C2_17.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_17);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_18) {
            if (C_C2_18.isChecked()) {
                lv_C2_18.setVisibility(View.VISIBLE);
            } else {
                lv_C2_18.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_18);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_19) {
            if (C_C2_19.isChecked()) {
                lv_C2_19.setVisibility(View.VISIBLE);
            } else {
                lv_C2_19.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_19);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_20) {
            if (C_C2_20.isChecked()) {
                lv_C2_20.setVisibility(View.VISIBLE);
            } else {
                lv_C2_20.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_20);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_21) {
            if (C_C2_21.isChecked()) {
                lv_C2_21.setVisibility(View.VISIBLE);
            } else {
                lv_C2_21.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_21);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_22) {
            if (C_C2_22.isChecked()) {
                lv_C2_22.setVisibility(View.VISIBLE);
            } else {
                lv_C2_22.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_22);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_23) {
            if (C_C2_23.isChecked()) {
                lv_C2_23.setVisibility(View.VISIBLE);
            } else {
                lv_C2_23.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_23);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_24) {
            if (C_C2_24.isChecked()) {
                lv_C2_24.setVisibility(View.VISIBLE);
            } else {
                lv_C2_24.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_24);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_25) {
            if (C_C2_25.isChecked()) {
                lv_C2_25.setVisibility(View.VISIBLE);
            } else {
                lv_C2_25.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_25);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_26) {
            if (C_C2_26.isChecked()) {
                lv_C2_26.setVisibility(View.VISIBLE);
            } else {
                lv_C2_26.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_26);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_27) {
            if (C_C2_27.isChecked()) {
                lv_C2_27.setVisibility(View.VISIBLE);
            } else {
                lv_C2_27.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_27);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_28) {
            if (C_C2_28.isChecked()) {
                lv_C2_28.setVisibility(View.VISIBLE);
            } else {
                lv_C2_28.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_28);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_29) {
            if (C_C2_29.isChecked()) {
                lv_C2_29.setVisibility(View.VISIBLE);
            } else {
                lv_C2_29.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_29);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_30) {
            if (C_C2_30.isChecked()) {
                lv_C2_30.setVisibility(View.VISIBLE);
            } else {
                lv_C2_30.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_30);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_31) {
            if (C_C2_31.isChecked()) {
                lv_C2_31.setVisibility(View.VISIBLE);
            } else {
                lv_C2_31.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_31);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_32) {
            if (C_C2_32.isChecked()) {
                lv_C2_32.setVisibility(View.VISIBLE);
            } else {
                lv_C2_32.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_32);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_33) {
            if (C_C2_33.isChecked()) {
                lv_C2_33.setVisibility(View.VISIBLE);
            } else {
                lv_C2_33.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_33);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_34) {
            if (C_C2_34.isChecked()) {
                lv_C2_34.setVisibility(View.VISIBLE);
            } else {
                lv_C2_34.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_34);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_35) {
            if (C_C2_35.isChecked()) {
                lv_C2_35.setVisibility(View.VISIBLE);
            } else {
                lv_C2_35.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_35);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_36) {
            if (C_C2_36.isChecked()) {
                lv_C2_36.setVisibility(View.VISIBLE);
            } else {
                lv_C2_36.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_36);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_37) {
            if (C_C2_37.isChecked()) {
                lv_C2_37.setVisibility(View.VISIBLE);
            } else {
                lv_C2_37.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_37);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_38) {
            if (C_C2_38.isChecked()) {
                lv_C2_38.setVisibility(View.VISIBLE);
            } else {
                lv_C2_38.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_38);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_39) {
            if (C_C2_39.isChecked()) {
                lv_C2_39.setVisibility(View.VISIBLE);
            } else {
                lv_C2_39.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_39);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_40) {
            if (C_C2_40.isChecked()) {
                lv_C2_40.setVisibility(View.VISIBLE);
            } else {
                lv_C2_40.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_40);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_41) {
            if (C_C2_41.isChecked()) {
                lv_C2_41.setVisibility(View.VISIBLE);
            } else {
                lv_C2_41.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_41);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_42) {
            if (C_C2_42.isChecked()) {
                lv_C2_42.setVisibility(View.VISIBLE);
            } else {
                lv_C2_42.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_42);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_43) {
            if (C_C2_43.isChecked()) {
                lv_C2_43.setVisibility(View.VISIBLE);
            } else {
                lv_C2_43.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_43);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_44) {
            if (C_C2_44.isChecked()) {
                lv_C2_44.setVisibility(View.VISIBLE);
            } else {
                lv_C2_44.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_44);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_45) {
            if (C_C2_45.isChecked()) {
                lv_C2_45.setVisibility(View.VISIBLE);
            } else {
                lv_C2_45.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_45);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_46) {
            if (C_C2_46.isChecked()) {
                lv_C2_46.setVisibility(View.VISIBLE);
            } else {
                lv_C2_46.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_46);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_47) {
            if (C_C2_47.isChecked()) {
                lv_C2_47.setVisibility(View.VISIBLE);
            } else {
                lv_C2_47.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_47);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_48) {
            if (C_C2_48.isChecked()) {
                lv_C2_48.setVisibility(View.VISIBLE);
            } else {
                lv_C2_48.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_48);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_49) {
            if (C_C2_49.isChecked()) {
                lv_C2_49.setVisibility(View.VISIBLE);
            } else {
                lv_C2_49.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_49);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_50) {
            if (C_C2_50.isChecked()) {
                lv_C2_50.setVisibility(View.VISIBLE);
            } else {
                lv_C2_50.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_50);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_51) {
            if (C_C2_51.isChecked()) {
                lv_C2_51.setVisibility(View.VISIBLE);
            } else {
                lv_C2_51.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_51);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_52) {
            if (C_C2_52.isChecked()) {
                lv_C2_52.setVisibility(View.VISIBLE);
            } else {
                lv_C2_52.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_52);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_53) {
            if (C_C2_53.isChecked()) {
                lv_C2_53.setVisibility(View.VISIBLE);
            } else {
                lv_C2_53.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_53);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_54) {
            if (C_C2_54.isChecked()) {
                lv_C2_54.setVisibility(View.VISIBLE);
            } else {
                lv_C2_54.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_54);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_55) {
            if (C_C2_55.isChecked()) {
                lv_C2_55.setVisibility(View.VISIBLE);
            } else {
                lv_C2_55.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_55);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_56) {
            if (C_C2_56.isChecked()) {
                lv_C2_56.setVisibility(View.VISIBLE);
            } else {
                lv_C2_56.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_56);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_57) {
            if (C_C2_57.isChecked()) {
                lv_C2_57.setVisibility(View.VISIBLE);
            } else {
                lv_C2_57.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_57);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_58) {
            if (C_C2_58.isChecked()) {
                lv_C2_58.setVisibility(View.VISIBLE);
            } else {
                lv_C2_58.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_58);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_59) {
            if (C_C2_59.isChecked()) {
                lv_C2_59.setVisibility(View.VISIBLE);
            } else {
                lv_C2_59.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_59);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_60) {
            if (C_C2_60.isChecked()) {
                lv_C2_60.setVisibility(View.VISIBLE);
            } else {
                lv_C2_60.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_60);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_61) {
            if (C_C2_61.isChecked()) {
                lv_C2_61.setVisibility(View.VISIBLE);
            } else {
                lv_C2_61.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_61);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_62) {
            if (C_C2_62.isChecked()) {
                lv_C2_62.setVisibility(View.VISIBLE);
            } else {
                lv_C2_62.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_62);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_63) {
            if (C_C2_63.isChecked()) {
                lv_C2_63.setVisibility(View.VISIBLE);
            } else {
                lv_C2_63.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_63);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_64) {
            if (C_C2_64.isChecked()) {
                lv_C2_64.setVisibility(View.VISIBLE);
            } else {
                lv_C2_64.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_64);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_65) {
            if (C_C2_65.isChecked()) {
                lv_C2_65.setVisibility(View.VISIBLE);
            } else {
                lv_C2_65.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_65);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_66) {
            if (C_C2_66.isChecked()) {
                lv_C2_66.setVisibility(View.VISIBLE);
            } else {
                lv_C2_66.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_66);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_67) {
            if (C_C2_67.isChecked()) {
                lv_C2_67.setVisibility(View.VISIBLE);
            } else {
                lv_C2_67.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_67);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_68) {
            if (C_C2_68.isChecked()) {
                lv_C2_68.setVisibility(View.VISIBLE);
            } else {
                lv_C2_68.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_68);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_69) {
            if (C_C2_69.isChecked()) {
                lv_C2_69.setVisibility(View.VISIBLE);
            } else {
                lv_C2_69.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_69);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_70) {
            if (C_C2_70.isChecked()) {
                lv_C2_70.setVisibility(View.VISIBLE);
            } else {
                lv_C2_70.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_70);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_71) {
            if (C_C2_71.isChecked()) {
                lv_C2_71.setVisibility(View.VISIBLE);
            } else {
                lv_C2_71.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_71);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_72) {
            if (C_C2_72.isChecked()) {
                lv_C2_72.setVisibility(View.VISIBLE);
            } else {
                lv_C2_72.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_72);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_73) {
            if (C_C2_73.isChecked()) {
                lv_C2_73.setVisibility(View.VISIBLE);
            } else {
                lv_C2_73.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_73);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_74) {
            if (C_C2_74.isChecked()) {
                lv_C2_74.setVisibility(View.VISIBLE);
            } else {
                lv_C2_74.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_74);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_75) {
            if (C_C2_75.isChecked()) {
                lv_C2_75.setVisibility(View.VISIBLE);
            } else {
                lv_C2_75.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_75);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_76) {
            if (C_C2_76.isChecked()) {
                lv_C2_76.setVisibility(View.VISIBLE);
            } else {
                lv_C2_76.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_76);
            }
        }

        if (compoundButton.getId() == R.id.C_C2_77) {
            if (C_C2_77.isChecked()) {
                lv_C2_77.setVisibility(View.VISIBLE);
            } else {
                lv_C2_77.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_77);
            }
        }
        if (compoundButton.getId() == R.id.C_C2_78) {
            if (C_C2_78.isChecked()) {
                lv_C2_78.setVisibility(View.VISIBLE);
            } else {
                lv_C2_78.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C2_78);
            }
        }


        if (compoundButton.getId() == R.id.R_C6_Yes || compoundButton.getId() == R.id.R_C6_Yes) {
            if (R_C6_Yes.isChecked()) {
                lv_C7.setVisibility(View.VISIBLE);
            } else {
                lv_C7.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(lv_C7);
            }
        }

        if (compoundButton.getId() == R.id.R_C7_1 || compoundButton.getId() == R.id.R_C7_2
                || compoundButton.getId() == R.id.R_C7_3) {
            if (R_C7_3.isChecked()) {
                ed_C7_3.setVisibility(View.VISIBLE);
            } else {
                ed_C7_3.setVisibility(View.GONE);
                ed_C7_3.setText("");
            }
        }


        if (Validation.A4 == "2") {
            HideC1Res1.IamHiden(lv_C1_1);
            HideC1Res1.IamHiden(lv_C1_2);
            HideC1Res1.IamHiden(lv_C1_3);
            HideC1Res1.IamHiden(lv_C1_4);
            HideC1Res1.IamHiden(lv_C1_5);
            HideC1Res1.IamHiden(lv_C1_6);
            HideC1Res1.IamHiden(lv_C1_7);
            HideC1Res1.IamHiden(lv_C1_8);
            HideC1Res1.IamHiden(lv_C1_9);
            HideC1Res1.IamHiden(lv_C1_10);
            HideC1Res1.IamHiden(lv_C1_11);
            HideC1Res1.IamHiden(lv_C1_12);
            HideC1Res1.IamHiden(lv_C1_13);
            HideC1Res1.IamHiden(lv_C1_14);
            HideC1Res1.IamHiden(lv_C1_15);
            HideC1Res1.IamHiden(lv_C1_16);
            HideC1Res1.IamHiden(lv_C1_17);
            HideC1Res1.IamHiden(lv_C1_18);
            HideC1Res1.IamHiden(lv_C1_19);
            HideC1Res1.IamHiden(lv_C1_20);
            HideC1Res1.IamHiden(lv_C1_21);
            HideC1Res1.IamHiden(lv_C1_22);
            HideC1Res1.IamHiden(lv_C1_23);
            HideC1Res1.IamHiden(lv_C1_24);
            HideC1Res1.IamHiden(lv_C1_25);
            HideC1Res1.IamHiden(lv_C1_26);
            HideC1Res1.IamHiden(lv_C1_27);
            HideC1Res1.IamHiden(lv_C1_28);
            HideC1Res1.IamHiden(lv_C1_29);
            HideC1Res1.IamHiden(lv_C1_30);
            HideC1Res1.IamHiden(lv_C1_31);
            HideC1Res1.IamHiden(lv_C1_32);
            HideC1Res1.IamHiden(lv_C1_33);
            HideC1Res1.IamHiden(lv_C1_34);
            HideC1Res1.IamHiden(lv_C1_35);
            HideC1Res1.IamHiden(lv_C1_36);
            HideC1Res1.IamHiden(lv_C1_37);


        }


    }

    void intializeLinerlayout(View v) {


        L_C1 = (LinearLayout) v.findViewById(R.id.lv_C1);
        lv_C1_1 = (LinearLayout) v.findViewById(R.id.lv_C1_1);
        lv_C1_2 = (LinearLayout) v.findViewById(R.id.lv_C1_2);
        lv_C1_3 = (LinearLayout) v.findViewById(R.id.lv_C1_3);
        lv_C1_4 = (LinearLayout) v.findViewById(R.id.lv_C1_4);
        lv_C1_5 = (LinearLayout) v.findViewById(R.id.lv_C1_5);
        lv_C1_6 = (LinearLayout) v.findViewById(R.id.lv_C1_6);
        lv_C1_7 = (LinearLayout) v.findViewById(R.id.lv_C1_7);
        lv_C1_8 = (LinearLayout) v.findViewById(R.id.lv_C1_8);
        lv_C1_9 = (LinearLayout) v.findViewById(R.id.lv_C1_9);
        lv_C1_10 = (LinearLayout) v.findViewById(R.id.lv_C1_10);
        lv_C1_11 = (LinearLayout) v.findViewById(R.id.lv_C1_11);
        lv_C1_12 = (LinearLayout) v.findViewById(R.id.lv_C1_12);
        lv_C1_13 = (LinearLayout) v.findViewById(R.id.lv_C1_13);
        lv_C1_14 = (LinearLayout) v.findViewById(R.id.lv_C1_14);
        lv_C1_15 = (LinearLayout) v.findViewById(R.id.lv_C1_15);
        lv_C1_16 = (LinearLayout) v.findViewById(R.id.lv_C1_16);
        lv_C1_17 = (LinearLayout) v.findViewById(R.id.lv_C1_17);
        lv_C1_18 = (LinearLayout) v.findViewById(R.id.lv_C1_18);
        lv_C1_19 = (LinearLayout) v.findViewById(R.id.lv_C1_19);
        lv_C1_20 = (LinearLayout) v.findViewById(R.id.lv_C1_20);
        lv_C1_21 = (LinearLayout) v.findViewById(R.id.lv_C1_21);
        lv_C1_22 = (LinearLayout) v.findViewById(R.id.lv_C1_22);
        lv_C1_23 = (LinearLayout) v.findViewById(R.id.lv_C1_23);
        lv_C1_24 = (LinearLayout) v.findViewById(R.id.lv_C1_24);
        lv_C1_25 = (LinearLayout) v.findViewById(R.id.lv_C1_25);
        lv_C1_26 = (LinearLayout) v.findViewById(R.id.lv_C1_26);
        lv_C1_27 = (LinearLayout) v.findViewById(R.id.lv_C1_27);
        lv_C1_28 = (LinearLayout) v.findViewById(R.id.lv_C1_28);
        lv_C1_29 = (LinearLayout) v.findViewById(R.id.lv_C1_29);
        lv_C1_30 = (LinearLayout) v.findViewById(R.id.lv_C1_30);
        lv_C1_31 = (LinearLayout) v.findViewById(R.id.lv_C1_31);
        lv_C1_32 = (LinearLayout) v.findViewById(R.id.lv_C1_32);
        lv_C1_33 = (LinearLayout) v.findViewById(R.id.lv_C1_33);
        lv_C1_34 = (LinearLayout) v.findViewById(R.id.lv_C1_34);
        lv_C1_35 = (LinearLayout) v.findViewById(R.id.lv_C1_35);
        lv_C1_36 = (LinearLayout) v.findViewById(R.id.lv_C1_36);
        lv_C1_37 = (LinearLayout) v.findViewById(R.id.lv_C1_37);

        lv_C2_1 = (LinearLayout) v.findViewById(R.id.lv_C2_1);
        lv_C2_2 = (LinearLayout) v.findViewById(R.id.lv_C2_2);
        lv_C2_3 = (LinearLayout) v.findViewById(R.id.lv_C2_3);
        lv_C2_4 = (LinearLayout) v.findViewById(R.id.lv_C2_4);
        lv_C2_5 = (LinearLayout) v.findViewById(R.id.lv_C2_5);
        lv_C2_6 = (LinearLayout) v.findViewById(R.id.lv_C2_6);
        lv_C2_7 = (LinearLayout) v.findViewById(R.id.lv_C2_7);
        lv_C2_8 = (LinearLayout) v.findViewById(R.id.lv_C2_8);
        lv_C2_9 = (LinearLayout) v.findViewById(R.id.lv_C2_9);
        lv_C2_10 = (LinearLayout) v.findViewById(R.id.lv_C2_10);
        lv_C2_11 = (LinearLayout) v.findViewById(R.id.lv_C2_11);
        lv_C2_12 = (LinearLayout) v.findViewById(R.id.lv_C2_12);
        lv_C2_13 = (LinearLayout) v.findViewById(R.id.lv_C2_13);
        lv_C2_14 = (LinearLayout) v.findViewById(R.id.lv_C2_14);
        lv_C2_15 = (LinearLayout) v.findViewById(R.id.lv_C2_15);
        lv_C2_16 = (LinearLayout) v.findViewById(R.id.lv_C2_16);
        lv_C2_17 = (LinearLayout) v.findViewById(R.id.lv_C2_17);
        lv_C2_18 = (LinearLayout) v.findViewById(R.id.lv_C2_18);
        lv_C2_19 = (LinearLayout) v.findViewById(R.id.lv_C2_19);
        lv_C2_20 = (LinearLayout) v.findViewById(R.id.lv_C2_20);
        lv_C2_21 = (LinearLayout) v.findViewById(R.id.lv_C2_21);
        lv_C2_22 = (LinearLayout) v.findViewById(R.id.lv_C2_22);
        lv_C2_23 = (LinearLayout) v.findViewById(R.id.lv_C2_23);
        lv_C2_24 = (LinearLayout) v.findViewById(R.id.lv_C2_24);
        lv_C2_25 = (LinearLayout) v.findViewById(R.id.lv_C2_25);
        lv_C2_26 = (LinearLayout) v.findViewById(R.id.lv_C2_26);
        lv_C2_27 = (LinearLayout) v.findViewById(R.id.lv_C2_27);
        lv_C2_28 = (LinearLayout) v.findViewById(R.id.lv_C2_28);
        lv_C2_29 = (LinearLayout) v.findViewById(R.id.lv_C2_29);
        lv_C2_30 = (LinearLayout) v.findViewById(R.id.lv_C2_30);
        lv_C2_31 = (LinearLayout) v.findViewById(R.id.lv_C2_31);
        lv_C2_32 = (LinearLayout) v.findViewById(R.id.lv_C2_32);
        lv_C2_33 = (LinearLayout) v.findViewById(R.id.lv_C2_33);
        lv_C2_34 = (LinearLayout) v.findViewById(R.id.lv_C2_34);
        lv_C2_35 = (LinearLayout) v.findViewById(R.id.lv_C2_35);
        lv_C2_36 = (LinearLayout) v.findViewById(R.id.lv_C2_36);
        lv_C2_37 = (LinearLayout) v.findViewById(R.id.lv_C2_37);
        lv_C2_38 = (LinearLayout) v.findViewById(R.id.lv_C2_38);
        lv_C2_39 = (LinearLayout) v.findViewById(R.id.lv_C2_39);
        lv_C2_40 = (LinearLayout) v.findViewById(R.id.lv_C2_40);
        lv_C2_41 = (LinearLayout) v.findViewById(R.id.lv_C2_41);
        lv_C2_42 = (LinearLayout) v.findViewById(R.id.lv_C2_42);
        lv_C2_43 = (LinearLayout) v.findViewById(R.id.lv_C2_43);
        lv_C2_44 = (LinearLayout) v.findViewById(R.id.lv_C2_44);
        lv_C2_45 = (LinearLayout) v.findViewById(R.id.lv_C2_45);
        lv_C2_46 = (LinearLayout) v.findViewById(R.id.lv_C2_46);
        lv_C2_47 = (LinearLayout) v.findViewById(R.id.lv_C2_47);
        lv_C2_48 = (LinearLayout) v.findViewById(R.id.lv_C2_48);
        lv_C2_49 = (LinearLayout) v.findViewById(R.id.lv_C2_49);
        lv_C2_50 = (LinearLayout) v.findViewById(R.id.lv_C2_50);
        lv_C2_51 = (LinearLayout) v.findViewById(R.id.lv_C2_51);
        lv_C2_52 = (LinearLayout) v.findViewById(R.id.lv_C2_52);
        lv_C2_53 = (LinearLayout) v.findViewById(R.id.lv_C2_53);
        lv_C2_54 = (LinearLayout) v.findViewById(R.id.lv_C2_54);
        lv_C2_55 = (LinearLayout) v.findViewById(R.id.lv_C2_55);
        lv_C2_56 = (LinearLayout) v.findViewById(R.id.lv_C2_56);
        lv_C2_57 = (LinearLayout) v.findViewById(R.id.lv_C2_57);
        lv_C2_58 = (LinearLayout) v.findViewById(R.id.lv_C2_58);
        lv_C2_59 = (LinearLayout) v.findViewById(R.id.lv_C2_59);
        lv_C2_60 = (LinearLayout) v.findViewById(R.id.lv_C2_60);
        lv_C2_61 = (LinearLayout) v.findViewById(R.id.lv_C2_61);
        lv_C2_62 = (LinearLayout) v.findViewById(R.id.lv_C2_62);
        lv_C2_63 = (LinearLayout) v.findViewById(R.id.lv_C2_63);
        lv_C2_64 = (LinearLayout) v.findViewById(R.id.lv_C2_64);
        lv_C2_65 = (LinearLayout) v.findViewById(R.id.lv_C2_65);
        lv_C2_66 = (LinearLayout) v.findViewById(R.id.lv_C2_66);
        lv_C2_67 = (LinearLayout) v.findViewById(R.id.lv_C2_67);
        lv_C2_68 = (LinearLayout) v.findViewById(R.id.lv_C2_68);
        lv_C2_69 = (LinearLayout) v.findViewById(R.id.lv_C2_69);
        lv_C2_70 = (LinearLayout) v.findViewById(R.id.lv_C2_70);
        lv_C2_71 = (LinearLayout) v.findViewById(R.id.lv_C2_71);
        lv_C2_72 = (LinearLayout) v.findViewById(R.id.lv_C2_72);
        lv_C2_73 = (LinearLayout) v.findViewById(R.id.lv_C2_73);
        lv_C2_74 = (LinearLayout) v.findViewById(R.id.lv_C2_74);
        lv_C2_75 = (LinearLayout) v.findViewById(R.id.lv_C2_75);
        lv_C2_76 = (LinearLayout) v.findViewById(R.id.lv_C2_76);
        lv_C2_77 = (LinearLayout) v.findViewById(R.id.lv_C2_77);
        lv_C2_78 = (LinearLayout) v.findViewById(R.id.lv_C2_78);


        C_C2_1 = (CheckBox) v.findViewById(R.id.C_C2_1);
        C_C2_2 = (CheckBox) v.findViewById(R.id.C_C2_2);
        C_C2_3 = (CheckBox) v.findViewById(R.id.C_C2_3);
        C_C2_4 = (CheckBox) v.findViewById(R.id.C_C2_4);
        C_C2_5 = (CheckBox) v.findViewById(R.id.C_C2_5);
        C_C2_6 = (CheckBox) v.findViewById(R.id.C_C2_6);
        C_C2_7 = (CheckBox) v.findViewById(R.id.C_C2_7);
        C_C2_8 = (CheckBox) v.findViewById(R.id.C_C2_8);
        C_C2_9 = (CheckBox) v.findViewById(R.id.C_C2_9);
        C_C2_10 = (CheckBox) v.findViewById(R.id.C_C2_10);
        C_C2_11 = (CheckBox) v.findViewById(R.id.C_C2_11);
        C_C2_12 = (CheckBox) v.findViewById(R.id.C_C2_12);
        C_C2_13 = (CheckBox) v.findViewById(R.id.C_C2_13);
        C_C2_14 = (CheckBox) v.findViewById(R.id.C_C2_14);
        C_C2_15 = (CheckBox) v.findViewById(R.id.C_C2_15);
        C_C2_16 = (CheckBox) v.findViewById(R.id.C_C2_16);
        C_C2_17 = (CheckBox) v.findViewById(R.id.C_C2_17);
        C_C2_18 = (CheckBox) v.findViewById(R.id.C_C2_18);
        C_C2_19 = (CheckBox) v.findViewById(R.id.C_C2_19);
        C_C2_20 = (CheckBox) v.findViewById(R.id.C_C2_20);
        C_C2_21 = (CheckBox) v.findViewById(R.id.C_C2_21);
        C_C2_22 = (CheckBox) v.findViewById(R.id.C_C2_22);
        C_C2_23 = (CheckBox) v.findViewById(R.id.C_C2_23);
        C_C2_24 = (CheckBox) v.findViewById(R.id.C_C2_24);
        C_C2_25 = (CheckBox) v.findViewById(R.id.C_C2_25);
        C_C2_26 = (CheckBox) v.findViewById(R.id.C_C2_26);
        C_C2_27 = (CheckBox) v.findViewById(R.id.C_C2_27);
        C_C2_28 = (CheckBox) v.findViewById(R.id.C_C2_28);
        C_C2_29 = (CheckBox) v.findViewById(R.id.C_C2_29);
        C_C2_30 = (CheckBox) v.findViewById(R.id.C_C2_30);
        C_C2_31 = (CheckBox) v.findViewById(R.id.C_C2_31);
        C_C2_32 = (CheckBox) v.findViewById(R.id.C_C2_32);
        C_C2_33 = (CheckBox) v.findViewById(R.id.C_C2_33);
        C_C2_34 = (CheckBox) v.findViewById(R.id.C_C2_34);
        C_C2_35 = (CheckBox) v.findViewById(R.id.C_C2_35);
        C_C2_36 = (CheckBox) v.findViewById(R.id.C_C2_36);
        C_C2_37 = (CheckBox) v.findViewById(R.id.C_C2_37);
        C_C2_38 = (CheckBox) v.findViewById(R.id.C_C2_38);
        C_C2_39 = (CheckBox) v.findViewById(R.id.C_C2_39);
        C_C2_40 = (CheckBox) v.findViewById(R.id.C_C2_40);
        C_C2_41 = (CheckBox) v.findViewById(R.id.C_C2_41);
        C_C2_42 = (CheckBox) v.findViewById(R.id.C_C2_42);
        C_C2_43 = (CheckBox) v.findViewById(R.id.C_C2_43);
        C_C2_44 = (CheckBox) v.findViewById(R.id.C_C2_44);
        C_C2_45 = (CheckBox) v.findViewById(R.id.C_C2_45);
        C_C2_46 = (CheckBox) v.findViewById(R.id.C_C2_46);
        C_C2_47 = (CheckBox) v.findViewById(R.id.C_C2_47);
        C_C2_48 = (CheckBox) v.findViewById(R.id.C_C2_48);
        C_C2_49 = (CheckBox) v.findViewById(R.id.C_C2_49);
        C_C2_50 = (CheckBox) v.findViewById(R.id.C_C2_50);
        C_C2_51 = (CheckBox) v.findViewById(R.id.C_C2_51);
        C_C2_52 = (CheckBox) v.findViewById(R.id.C_C2_52);
        C_C2_53 = (CheckBox) v.findViewById(R.id.C_C2_53);
        C_C2_54 = (CheckBox) v.findViewById(R.id.C_C2_54);
        C_C2_55 = (CheckBox) v.findViewById(R.id.C_C2_55);
        C_C2_56 = (CheckBox) v.findViewById(R.id.C_C2_56);
        C_C2_57 = (CheckBox) v.findViewById(R.id.C_C2_57);
        C_C2_58 = (CheckBox) v.findViewById(R.id.C_C2_58);
        C_C2_59 = (CheckBox) v.findViewById(R.id.C_C2_59);
        C_C2_60 = (CheckBox) v.findViewById(R.id.C_C2_60);
        C_C2_61 = (CheckBox) v.findViewById(R.id.C_C2_61);
        C_C2_62 = (CheckBox) v.findViewById(R.id.C_C2_62);
        C_C2_63 = (CheckBox) v.findViewById(R.id.C_C2_63);
        C_C2_64 = (CheckBox) v.findViewById(R.id.C_C2_64);
        C_C2_65 = (CheckBox) v.findViewById(R.id.C_C2_65);
        C_C2_66 = (CheckBox) v.findViewById(R.id.C_C2_66);
        C_C2_67 = (CheckBox) v.findViewById(R.id.C_C2_67);
        C_C2_68 = (CheckBox) v.findViewById(R.id.C_C2_68);
        C_C2_69 = (CheckBox) v.findViewById(R.id.C_C2_69);
        C_C2_70 = (CheckBox) v.findViewById(R.id.C_C2_70);
        C_C2_71 = (CheckBox) v.findViewById(R.id.C_C2_71);
        C_C2_72 = (CheckBox) v.findViewById(R.id.C_C2_72);
        C_C2_73 = (CheckBox) v.findViewById(R.id.C_C2_73);
        C_C2_74 = (CheckBox) v.findViewById(R.id.C_C2_74);
        C_C2_75 = (CheckBox) v.findViewById(R.id.C_C2_75);
        C_C2_76 = (CheckBox) v.findViewById(R.id.C_C2_76);
        C_C2_77 = (CheckBox) v.findViewById(R.id.C_C2_77);
        C_C2_78 = (CheckBox) v.findViewById(R.id.C_C2_78);


        lv_C3 = (LinearLayout) v.findViewById(R.id.lv_C3);
        lv_C4 = (LinearLayout) v.findViewById(R.id.lv_C4);
        lv_C4_1 = (LinearLayout) v.findViewById(R.id.lv_C4_1);
        lv_C5 = (LinearLayout) v.findViewById(R.id.lv_C5);
        lv_C6 = (LinearLayout) v.findViewById(R.id.lv_C6);
        lv_C7 = (LinearLayout) v.findViewById(R.id.lv_C7);
    }

    void initializeCheckbox(View v) {
        L_C1_1 = (CheckBox) v.findViewById(R.id.L_C1_1);
        L_C1_2 = (CheckBox) v.findViewById(R.id.L_C1_2);
        L_C1_3 = (CheckBox) v.findViewById(R.id.L_C1_3);
        L_C1_4 = (CheckBox) v.findViewById(R.id.L_C1_4);
        L_C1_5 = (CheckBox) v.findViewById(R.id.L_C1_5);
        L_C1_6 = (CheckBox) v.findViewById(R.id.L_C1_6);
        L_C1_7 = (CheckBox) v.findViewById(R.id.L_C1_7);
        L_C1_8 = (CheckBox) v.findViewById(R.id.L_C1_8);
        L_C1_9 = (CheckBox) v.findViewById(R.id.L_C1_9);
        L_C1_10 = (CheckBox) v.findViewById(R.id.L_C1_10);
        L_C1_11 = (CheckBox) v.findViewById(R.id.L_C1_11);
        L_C1_12 = (CheckBox) v.findViewById(R.id.L_C1_12);
        L_C1_13 = (CheckBox) v.findViewById(R.id.L_C1_13);
        L_C1_14 = (CheckBox) v.findViewById(R.id.L_C1_14);
        L_C1_15 = (CheckBox) v.findViewById(R.id.L_C1_15);
        L_C1_16 = (CheckBox) v.findViewById(R.id.L_C1_16);
        L_C1_17 = (CheckBox) v.findViewById(R.id.L_C1_17);
        L_C1_18 = (CheckBox) v.findViewById(R.id.L_C1_18);
        L_C1_19 = (CheckBox) v.findViewById(R.id.L_C1_19);
        L_C1_20 = (CheckBox) v.findViewById(R.id.L_C1_20);
        L_C1_21 = (CheckBox) v.findViewById(R.id.L_C1_21);
        L_C1_22 = (CheckBox) v.findViewById(R.id.L_C1_22);
        L_C1_23 = (CheckBox) v.findViewById(R.id.L_C1_23);
        L_C1_24 = (CheckBox) v.findViewById(R.id.L_C1_24);
        L_C1_25 = (CheckBox) v.findViewById(R.id.L_C1_25);
        L_C1_26 = (CheckBox) v.findViewById(R.id.L_C1_26);
        L_C1_27 = (CheckBox) v.findViewById(R.id.L_C1_27);
        L_C1_28 = (CheckBox) v.findViewById(R.id.L_C1_28);
        L_C1_29 = (CheckBox) v.findViewById(R.id.L_C1_29);
        L_C1_30 = (CheckBox) v.findViewById(R.id.L_C1_30);
        L_C1_31 = (CheckBox) v.findViewById(R.id.L_C1_31);
        L_C1_32 = (CheckBox) v.findViewById(R.id.L_C1_32);
        L_C1_33 = (CheckBox) v.findViewById(R.id.L_C1_33);
        L_C1_34 = (CheckBox) v.findViewById(R.id.L_C1_34);
        L_C1_35 = (CheckBox) v.findViewById(R.id.L_C1_35);
        L_C1_36 = (CheckBox) v.findViewById(R.id.L_C1_36);
        L_C1_37 = (CheckBox) v.findViewById(R.id.L_C1_37);

    }

    void initializeEditetview(View v) {
        ed_C1_1_1 = (EditText) v.findViewById(R.id.ed_C1_1_1);
        ed_C1_1_2 = (EditText) v.findViewById(R.id.ed_C1_1_2);
        ed_C1_1_3 = (EditText) v.findViewById(R.id.ed_C1_1_3);
        ed_C1_1_4 = (EditText) v.findViewById(R.id.ed_C1_1_4);

        ed_C1_2_1 = (EditText) v.findViewById(R.id.ed_C1_2_1);
        ed_C1_2_2 = (EditText) v.findViewById(R.id.ed_C1_2_2);
        ed_C1_2_3 = (EditText) v.findViewById(R.id.ed_C1_2_3);
        ed_C1_2_4 = (EditText) v.findViewById(R.id.ed_C1_2_4);


        ed_C1_3_1 = (EditText) v.findViewById(R.id.ed_C1_3_1);
        ed_C1_3_2 = (EditText) v.findViewById(R.id.ed_C1_3_2);
        ed_C1_3_3 = (EditText) v.findViewById(R.id.ed_C1_3_3);
        ed_C1_3_4 = (EditText) v.findViewById(R.id.ed_C1_3_4);

        ed_C1_4_1 = (EditText) v.findViewById(R.id.ed_C1_4_1);
        ed_C1_4_2 = (EditText) v.findViewById(R.id.ed_C1_4_2);
        ed_C1_4_3 = (EditText) v.findViewById(R.id.ed_C1_4_3);
        ed_C1_4_4 = (EditText) v.findViewById(R.id.ed_C1_4_4);

        ed_C1_5_1 = (EditText) v.findViewById(R.id.ed_C1_5_1);
        ed_C1_5_2 = (EditText) v.findViewById(R.id.ed_C1_5_2);
        ed_C1_5_3 = (EditText) v.findViewById(R.id.ed_C1_5_3);
        ed_C1_5_4 = (EditText) v.findViewById(R.id.ed_C1_5_4);

        ed_C1_6_1 = (EditText) v.findViewById(R.id.ed_C1_6_1);
        ed_C1_6_2 = (EditText) v.findViewById(R.id.ed_C1_6_2);
        ed_C1_6_3 = (EditText) v.findViewById(R.id.ed_C1_6_3);
        ed_C1_6_4 = (EditText) v.findViewById(R.id.ed_C1_6_4);

        ed_C1_7_1 = (EditText) v.findViewById(R.id.ed_C1_7_1);
        ed_C1_7_2 = (EditText) v.findViewById(R.id.ed_C1_7_2);
        ed_C1_7_3 = (EditText) v.findViewById(R.id.ed_C1_7_3);
        ed_C1_7_4 = (EditText) v.findViewById(R.id.ed_C1_7_4);

        ed_C1_8_1 = (EditText) v.findViewById(R.id.ed_C1_8_1);
        ed_C1_8_2 = (EditText) v.findViewById(R.id.ed_C1_8_2);
        ed_C1_8_3 = (EditText) v.findViewById(R.id.ed_C1_8_3);
        ed_C1_8_4 = (EditText) v.findViewById(R.id.ed_C1_8_4);

        ed_C1_9_1 = (EditText) v.findViewById(R.id.ed_C1_9_1);
        ed_C1_9_2 = (EditText) v.findViewById(R.id.ed_C1_9_2);
        ed_C1_9_3 = (EditText) v.findViewById(R.id.ed_C1_9_3);
        ed_C1_9_4 = (EditText) v.findViewById(R.id.ed_C1_9_4);

        ed_C1_10_1 = (EditText) v.findViewById(R.id.ed_C1_10_1);
        ed_C1_10_2 = (EditText) v.findViewById(R.id.ed_C1_10_2);
        ed_C1_10_3 = (EditText) v.findViewById(R.id.ed_C1_10_3);
        ed_C1_10_4 = (EditText) v.findViewById(R.id.ed_C1_10_4);

        ed_C1_11_1 = (EditText) v.findViewById(R.id.ed_C1_11_1);
        ed_C1_11_2 = (EditText) v.findViewById(R.id.ed_C1_11_2);
        ed_C1_11_3 = (EditText) v.findViewById(R.id.ed_C1_11_3);
        ed_C1_11_4 = (EditText) v.findViewById(R.id.ed_C1_11_4);

        ed_C1_12_1 = (EditText) v.findViewById(R.id.ed_C1_12_1);
        ed_C1_12_2 = (EditText) v.findViewById(R.id.ed_C1_12_2);
        ed_C1_12_3 = (EditText) v.findViewById(R.id.ed_C1_12_3);
        ed_C1_12_4 = (EditText) v.findViewById(R.id.ed_C1_12_4);

        ed_C1_13_1 = (EditText) v.findViewById(R.id.ed_C1_13_1);
        ed_C1_13_2 = (EditText) v.findViewById(R.id.ed_C1_13_2);
        ed_C1_13_3 = (EditText) v.findViewById(R.id.ed_C1_13_3);
        ed_C1_13_4 = (EditText) v.findViewById(R.id.ed_C1_13_4);

        ed_C1_14_1 = (EditText) v.findViewById(R.id.ed_C1_14_1);
        ed_C1_14_2 = (EditText) v.findViewById(R.id.ed_C1_14_2);
        ed_C1_14_3 = (EditText) v.findViewById(R.id.ed_C1_14_3);
        ed_C1_14_4 = (EditText) v.findViewById(R.id.ed_C1_14_4);

        ed_C1_15_1 = (EditText) v.findViewById(R.id.ed_C1_15_1);
        ed_C1_15_2 = (EditText) v.findViewById(R.id.ed_C1_15_2);
        ed_C1_15_3 = (EditText) v.findViewById(R.id.ed_C1_15_3);
        ed_C1_15_4 = (EditText) v.findViewById(R.id.ed_C1_15_4);

        ed_C1_16_1 = (EditText) v.findViewById(R.id.ed_C1_16_1);
        ed_C1_16_2 = (EditText) v.findViewById(R.id.ed_C1_16_2);
        ed_C1_16_3 = (EditText) v.findViewById(R.id.ed_C1_16_3);
        ed_C1_16_4 = (EditText) v.findViewById(R.id.ed_C1_16_4);

        ed_C1_17_1 = (EditText) v.findViewById(R.id.ed_C1_17_1);
        ed_C1_17_2 = (EditText) v.findViewById(R.id.ed_C1_17_2);
        ed_C1_17_3 = (EditText) v.findViewById(R.id.ed_C1_17_3);
        ed_C1_17_4 = (EditText) v.findViewById(R.id.ed_C1_17_4);

        ed_C1_18_1 = (EditText) v.findViewById(R.id.ed_C1_18_1);
        ed_C1_18_2 = (EditText) v.findViewById(R.id.ed_C1_18_2);
        ed_C1_18_3 = (EditText) v.findViewById(R.id.ed_C1_18_3);
        ed_C1_18_4 = (EditText) v.findViewById(R.id.ed_C1_18_4);

        ed_C1_19_1 = (EditText) v.findViewById(R.id.ed_C1_19_1);
        ed_C1_19_2 = (EditText) v.findViewById(R.id.ed_C1_19_2);
        ed_C1_19_3 = (EditText) v.findViewById(R.id.ed_C1_19_3);
        ed_C1_19_4 = (EditText) v.findViewById(R.id.ed_C1_19_4);

        ed_C1_20_1 = (EditText) v.findViewById(R.id.ed_C1_20_1);
        ed_C1_20_2 = (EditText) v.findViewById(R.id.ed_C1_20_2);
        ed_C1_20_3 = (EditText) v.findViewById(R.id.ed_C1_20_3);
        ed_C1_20_4 = (EditText) v.findViewById(R.id.ed_C1_20_4);

        ed_C1_21_1 = (EditText) v.findViewById(R.id.ed_C1_21_1);
        ed_C1_21_2 = (EditText) v.findViewById(R.id.ed_C1_21_2);
        ed_C1_21_3 = (EditText) v.findViewById(R.id.ed_C1_21_3);
        ed_C1_21_4 = (EditText) v.findViewById(R.id.ed_C1_21_4);

        ed_C1_22_1 = (EditText) v.findViewById(R.id.ed_C1_22_1);
        ed_C1_22_2 = (EditText) v.findViewById(R.id.ed_C1_22_2);
        ed_C1_22_3 = (EditText) v.findViewById(R.id.ed_C1_22_3);
        ed_C1_22_4 = (EditText) v.findViewById(R.id.ed_C1_22_4);

        ed_C1_23_1 = (EditText) v.findViewById(R.id.ed_C1_23_1);
        ed_C1_23_2 = (EditText) v.findViewById(R.id.ed_C1_23_2);
        ed_C1_23_3 = (EditText) v.findViewById(R.id.ed_C1_23_3);
        ed_C1_23_4 = (EditText) v.findViewById(R.id.ed_C1_23_4);

        ed_C1_24_1 = (EditText) v.findViewById(R.id.ed_C1_24_1);
        ed_C1_24_2 = (EditText) v.findViewById(R.id.ed_C1_24_2);
        ed_C1_24_3 = (EditText) v.findViewById(R.id.ed_C1_24_3);
        ed_C1_24_4 = (EditText) v.findViewById(R.id.ed_C1_24_4);

        ed_C1_25_1 = (EditText) v.findViewById(R.id.ed_C1_25_1);
        ed_C1_25_2 = (EditText) v.findViewById(R.id.ed_C1_25_2);
        ed_C1_25_3 = (EditText) v.findViewById(R.id.ed_C1_25_3);
        ed_C1_25_4 = (EditText) v.findViewById(R.id.ed_C1_25_4);

        ed_C1_26_1 = (EditText) v.findViewById(R.id.ed_C1_26_1);
        ed_C1_26_2 = (EditText) v.findViewById(R.id.ed_C1_26_2);
        ed_C1_26_3 = (EditText) v.findViewById(R.id.ed_C1_26_3);
        ed_C1_26_4 = (EditText) v.findViewById(R.id.ed_C1_26_4);

        ed_C1_27_1 = (EditText) v.findViewById(R.id.ed_C1_27_1);
        ed_C1_27_2 = (EditText) v.findViewById(R.id.ed_C1_27_2);
        ed_C1_27_3 = (EditText) v.findViewById(R.id.ed_C1_27_3);
        ed_C1_27_4 = (EditText) v.findViewById(R.id.ed_C1_27_4);

        ed_C1_28_1 = (EditText) v.findViewById(R.id.ed_C1_28_1);
        ed_C1_28_2 = (EditText) v.findViewById(R.id.ed_C1_28_2);
        ed_C1_28_3 = (EditText) v.findViewById(R.id.ed_C1_28_3);
        ed_C1_28_4 = (EditText) v.findViewById(R.id.ed_C1_28_4);

        ed_C1_29_1 = (EditText) v.findViewById(R.id.ed_C1_29_1);
        ed_C1_29_2 = (EditText) v.findViewById(R.id.ed_C1_29_2);
        ed_C1_29_3 = (EditText) v.findViewById(R.id.ed_C1_29_3);
        ed_C1_29_4 = (EditText) v.findViewById(R.id.ed_C1_29_4);

        ed_C1_30_1 = (EditText) v.findViewById(R.id.ed_C1_30_1);
        ed_C1_30_2 = (EditText) v.findViewById(R.id.ed_C1_30_2);
        ed_C1_30_3 = (EditText) v.findViewById(R.id.ed_C1_30_3);
        ed_C1_30_4 = (EditText) v.findViewById(R.id.ed_C1_30_4);

        ed_C1_31_1 = (EditText) v.findViewById(R.id.ed_C1_31_1);
        ed_C1_31_2 = (EditText) v.findViewById(R.id.ed_C1_31_2);
        ed_C1_31_3 = (EditText) v.findViewById(R.id.ed_C1_31_3);
        ed_C1_31_4 = (EditText) v.findViewById(R.id.ed_C1_31_4);

        ed_C1_32_1 = (EditText) v.findViewById(R.id.ed_C1_32_1);
        ed_C1_32_2 = (EditText) v.findViewById(R.id.ed_C1_32_2);
        ed_C1_32_3 = (EditText) v.findViewById(R.id.ed_C1_32_3);
        ed_C1_32_4 = (EditText) v.findViewById(R.id.ed_C1_32_4);

        ed_C1_33_1 = (EditText) v.findViewById(R.id.ed_C1_33_1);
        ed_C1_33_2 = (EditText) v.findViewById(R.id.ed_C1_33_2);
        ed_C1_33_3 = (EditText) v.findViewById(R.id.ed_C1_33_3);
        ed_C1_33_4 = (EditText) v.findViewById(R.id.ed_C1_33_4);

        ed_C1_34_1 = (EditText) v.findViewById(R.id.ed_C1_34_1);
        ed_C1_34_2 = (EditText) v.findViewById(R.id.ed_C1_34_2);
        ed_C1_34_3 = (EditText) v.findViewById(R.id.ed_C1_34_3);
        ed_C1_34_4 = (EditText) v.findViewById(R.id.ed_C1_34_4);

        ed_C1_35_1 = (EditText) v.findViewById(R.id.ed_C1_35_1);
        ed_C1_35_2 = (EditText) v.findViewById(R.id.ed_C1_35_2);
        ed_C1_35_3 = (EditText) v.findViewById(R.id.ed_C1_35_3);
        ed_C1_35_4 = (EditText) v.findViewById(R.id.ed_C1_35_4);

        ed_C1_36_1 = (EditText) v.findViewById(R.id.ed_C1_36_1);
        ed_C1_36_2 = (EditText) v.findViewById(R.id.ed_C1_36_2);
        ed_C1_36_3 = (EditText) v.findViewById(R.id.ed_C1_36_3);
        ed_C1_36_4 = (EditText) v.findViewById(R.id.ed_C1_36_4);

        ed_C1_37_1 = (EditText) v.findViewById(R.id.ed_C1_37_1);
        ed_C1_37_2 = (EditText) v.findViewById(R.id.ed_C1_37_2);
        ed_C1_37_3 = (EditText) v.findViewById(R.id.ed_C1_37_3);
        ed_C1_37_4 = (EditText) v.findViewById(R.id.ed_C1_37_4);


        ed_C2_1 = (EditText) v.findViewById(R.id.ed_C2_1);
        ed_C2_2 = (EditText) v.findViewById(R.id.ed_C2_2);
        ed_C2_3 = (EditText) v.findViewById(R.id.ed_C2_3);
        ed_C2_4 = (EditText) v.findViewById(R.id.ed_C2_4);
        ed_C2_5 = (EditText) v.findViewById(R.id.ed_C2_5);
        ed_C2_6 = (EditText) v.findViewById(R.id.ed_C2_6);
        ed_C2_7 = (EditText) v.findViewById(R.id.ed_C2_7);
        ed_C2_8 = (EditText) v.findViewById(R.id.ed_C2_8);
        ed_C2_9 = (EditText) v.findViewById(R.id.ed_C2_9);
        ed_C2_10 = (EditText) v.findViewById(R.id.ed_C2_10);
        ed_C2_11 = (EditText) v.findViewById(R.id.ed_C2_11);


        ed_C5_days = (EditText) v.findViewById(R.id.ed_C5_days);
        ed_C5_months = (EditText) v.findViewById(R.id.ed_C5_months);
        ed_C5_Year = (EditText) v.findViewById(R.id.ed_C5_Year);
        ed_C7_3 = (EditText) v.findViewById(R.id.ed_C7_3);
    }

    void initializeRadioButton(View v) {

        R_C2_12_1 = (RadioButton) v.findViewById(R.id.R_C2_12_1);
        R_C2_12_2 = (RadioButton) v.findViewById(R.id.R_C2_12_2);
        R_C2_12_3 = (RadioButton) v.findViewById(R.id.R_C2_12_3);
        R_C2_12_4 = (RadioButton) v.findViewById(R.id.R_C2_12_4);
        R_C2_12_5 = (RadioButton) v.findViewById(R.id.R_C2_12_5);
        R_C2_12_6 = (RadioButton) v.findViewById(R.id.R_C2_12_6);
        R_C2_12_7 = (RadioButton) v.findViewById(R.id.R_C2_12_7);
        R_C2_13_1 = (RadioButton) v.findViewById(R.id.R_C2_13_1);
        R_C2_13_2 = (RadioButton) v.findViewById(R.id.R_C2_13_2);
        R_C2_13_3 = (RadioButton) v.findViewById(R.id.R_C2_13_3);
        R_C2_13_4 = (RadioButton) v.findViewById(R.id.R_C2_13_4);
        R_C2_13_5 = (RadioButton) v.findViewById(R.id.R_C2_13_5);
        R_C2_13_6 = (RadioButton) v.findViewById(R.id.R_C2_13_6);
        R_C2_13_7 = (RadioButton) v.findViewById(R.id.R_C2_13_7);
        R_C2_14_1 = (RadioButton) v.findViewById(R.id.R_C2_14_1);
        R_C2_14_2 = (RadioButton) v.findViewById(R.id.R_C2_14_2);
        R_C2_14_3 = (RadioButton) v.findViewById(R.id.R_C2_14_3);
        R_C2_14_4 = (RadioButton) v.findViewById(R.id.R_C2_14_4);
        R_C2_14_5 = (RadioButton) v.findViewById(R.id.R_C2_14_5);
        R_C2_14_6 = (RadioButton) v.findViewById(R.id.R_C2_14_6);
        R_C2_14_7 = (RadioButton) v.findViewById(R.id.R_C2_14_7);
        R_C2_15_1 = (RadioButton) v.findViewById(R.id.R_C2_15_1);
        R_C2_15_2 = (RadioButton) v.findViewById(R.id.R_C2_15_2);
        R_C2_15_3 = (RadioButton) v.findViewById(R.id.R_C2_15_3);
        R_C2_15_4 = (RadioButton) v.findViewById(R.id.R_C2_15_4);
        R_C2_15_5 = (RadioButton) v.findViewById(R.id.R_C2_15_5);
        R_C2_15_6 = (RadioButton) v.findViewById(R.id.R_C2_15_6);
        R_C2_15_7 = (RadioButton) v.findViewById(R.id.R_C2_15_7);
        R_C2_16_1 = (RadioButton) v.findViewById(R.id.R_C2_16_1);
        R_C2_16_2 = (RadioButton) v.findViewById(R.id.R_C2_16_2);
        R_C2_16_3 = (RadioButton) v.findViewById(R.id.R_C2_16_3);
        R_C2_16_4 = (RadioButton) v.findViewById(R.id.R_C2_16_4);
        R_C2_16_5 = (RadioButton) v.findViewById(R.id.R_C2_16_5);
        R_C2_16_6 = (RadioButton) v.findViewById(R.id.R_C2_16_6);
        R_C2_16_7 = (RadioButton) v.findViewById(R.id.R_C2_16_7);
        R_C2_17_1 = (RadioButton) v.findViewById(R.id.R_C2_17_1);
        R_C2_17_2 = (RadioButton) v.findViewById(R.id.R_C2_17_2);
        R_C2_17_3 = (RadioButton) v.findViewById(R.id.R_C2_17_3);
        R_C2_17_4 = (RadioButton) v.findViewById(R.id.R_C2_17_4);
        R_C2_17_5 = (RadioButton) v.findViewById(R.id.R_C2_17_5);
        R_C2_17_6 = (RadioButton) v.findViewById(R.id.R_C2_17_6);
        R_C2_17_7 = (RadioButton) v.findViewById(R.id.R_C2_17_7);
        R_C2_18_1 = (RadioButton) v.findViewById(R.id.R_C2_18_1);
        R_C2_18_2 = (RadioButton) v.findViewById(R.id.R_C2_18_2);
        R_C2_18_3 = (RadioButton) v.findViewById(R.id.R_C2_18_3);
        R_C2_18_4 = (RadioButton) v.findViewById(R.id.R_C2_18_4);
        R_C2_18_5 = (RadioButton) v.findViewById(R.id.R_C2_18_5);
        R_C2_18_6 = (RadioButton) v.findViewById(R.id.R_C2_18_6);
        R_C2_18_7 = (RadioButton) v.findViewById(R.id.R_C2_18_7);
        R_C2_19_1 = (RadioButton) v.findViewById(R.id.R_C2_19_1);
        R_C2_19_2 = (RadioButton) v.findViewById(R.id.R_C2_19_2);
        R_C2_19_3 = (RadioButton) v.findViewById(R.id.R_C2_19_3);
        R_C2_19_4 = (RadioButton) v.findViewById(R.id.R_C2_19_4);
        R_C2_19_5 = (RadioButton) v.findViewById(R.id.R_C2_19_5);
        R_C2_19_6 = (RadioButton) v.findViewById(R.id.R_C2_19_6);
        R_C2_19_7 = (RadioButton) v.findViewById(R.id.R_C2_19_7);
        R_C2_20_1 = (RadioButton) v.findViewById(R.id.R_C2_20_1);
        R_C2_20_2 = (RadioButton) v.findViewById(R.id.R_C2_20_2);
        R_C2_20_3 = (RadioButton) v.findViewById(R.id.R_C2_20_3);
        R_C2_20_4 = (RadioButton) v.findViewById(R.id.R_C2_20_4);
        R_C2_20_5 = (RadioButton) v.findViewById(R.id.R_C2_20_5);
        R_C2_20_6 = (RadioButton) v.findViewById(R.id.R_C2_20_6);
        R_C2_20_7 = (RadioButton) v.findViewById(R.id.R_C2_20_7);
        R_C2_21_1 = (RadioButton) v.findViewById(R.id.R_C2_21_1);
        R_C2_21_2 = (RadioButton) v.findViewById(R.id.R_C2_21_2);
        R_C2_21_3 = (RadioButton) v.findViewById(R.id.R_C2_21_3);
        R_C2_21_4 = (RadioButton) v.findViewById(R.id.R_C2_21_4);
        R_C2_21_5 = (RadioButton) v.findViewById(R.id.R_C2_21_5);
        R_C2_21_6 = (RadioButton) v.findViewById(R.id.R_C2_21_6);
        R_C2_21_7 = (RadioButton) v.findViewById(R.id.R_C2_21_7);
        R_C2_22_1 = (RadioButton) v.findViewById(R.id.R_C2_22_1);
        R_C2_22_2 = (RadioButton) v.findViewById(R.id.R_C2_22_2);
        R_C2_22_3 = (RadioButton) v.findViewById(R.id.R_C2_22_3);
        R_C2_22_4 = (RadioButton) v.findViewById(R.id.R_C2_22_4);
        R_C2_22_5 = (RadioButton) v.findViewById(R.id.R_C2_22_5);
        R_C2_22_6 = (RadioButton) v.findViewById(R.id.R_C2_22_6);
        R_C2_22_7 = (RadioButton) v.findViewById(R.id.R_C2_22_7);
        R_C2_23_1 = (RadioButton) v.findViewById(R.id.R_C2_23_1);
        R_C2_23_2 = (RadioButton) v.findViewById(R.id.R_C2_23_2);
        R_C2_23_3 = (RadioButton) v.findViewById(R.id.R_C2_23_3);
        R_C2_23_4 = (RadioButton) v.findViewById(R.id.R_C2_23_4);
        R_C2_23_5 = (RadioButton) v.findViewById(R.id.R_C2_23_5);
        R_C2_23_6 = (RadioButton) v.findViewById(R.id.R_C2_23_6);
        R_C2_23_7 = (RadioButton) v.findViewById(R.id.R_C2_23_7);
        R_C2_24_1 = (RadioButton) v.findViewById(R.id.R_C2_24_1);
        R_C2_24_2 = (RadioButton) v.findViewById(R.id.R_C2_24_2);
        R_C2_24_3 = (RadioButton) v.findViewById(R.id.R_C2_24_3);
        R_C2_24_4 = (RadioButton) v.findViewById(R.id.R_C2_24_4);
        R_C2_24_5 = (RadioButton) v.findViewById(R.id.R_C2_24_5);
        R_C2_24_6 = (RadioButton) v.findViewById(R.id.R_C2_24_6);
        R_C2_24_7 = (RadioButton) v.findViewById(R.id.R_C2_24_7);
        R_C2_25_1 = (RadioButton) v.findViewById(R.id.R_C2_25_1);
        R_C2_25_2 = (RadioButton) v.findViewById(R.id.R_C2_25_2);
        R_C2_25_3 = (RadioButton) v.findViewById(R.id.R_C2_25_3);
        R_C2_25_4 = (RadioButton) v.findViewById(R.id.R_C2_25_4);
        R_C2_25_5 = (RadioButton) v.findViewById(R.id.R_C2_25_5);
        R_C2_25_6 = (RadioButton) v.findViewById(R.id.R_C2_25_6);
        R_C2_25_7 = (RadioButton) v.findViewById(R.id.R_C2_25_7);
        R_C2_26_1 = (RadioButton) v.findViewById(R.id.R_C2_26_1);
        R_C2_26_2 = (RadioButton) v.findViewById(R.id.R_C2_26_2);
        R_C2_26_3 = (RadioButton) v.findViewById(R.id.R_C2_26_3);
        R_C2_26_4 = (RadioButton) v.findViewById(R.id.R_C2_26_4);
        R_C2_26_5 = (RadioButton) v.findViewById(R.id.R_C2_26_5);
        R_C2_26_6 = (RadioButton) v.findViewById(R.id.R_C2_26_6);
        R_C2_26_7 = (RadioButton) v.findViewById(R.id.R_C2_26_7);
        R_C2_27_1 = (RadioButton) v.findViewById(R.id.R_C2_27_1);
        R_C2_27_2 = (RadioButton) v.findViewById(R.id.R_C2_27_2);
        R_C2_27_3 = (RadioButton) v.findViewById(R.id.R_C2_27_3);
        R_C2_27_4 = (RadioButton) v.findViewById(R.id.R_C2_27_4);
        R_C2_27_5 = (RadioButton) v.findViewById(R.id.R_C2_27_5);
        R_C2_27_6 = (RadioButton) v.findViewById(R.id.R_C2_27_6);
        R_C2_27_7 = (RadioButton) v.findViewById(R.id.R_C2_27_7);
        R_C2_28_1 = (RadioButton) v.findViewById(R.id.R_C2_28_1);
        R_C2_28_2 = (RadioButton) v.findViewById(R.id.R_C2_28_2);
        R_C2_28_3 = (RadioButton) v.findViewById(R.id.R_C2_28_3);
        R_C2_28_4 = (RadioButton) v.findViewById(R.id.R_C2_28_4);
        R_C2_28_5 = (RadioButton) v.findViewById(R.id.R_C2_28_5);
        R_C2_28_6 = (RadioButton) v.findViewById(R.id.R_C2_28_6);
        R_C2_28_7 = (RadioButton) v.findViewById(R.id.R_C2_28_7);
        R_C2_29_1 = (RadioButton) v.findViewById(R.id.R_C2_29_1);
        R_C2_29_2 = (RadioButton) v.findViewById(R.id.R_C2_29_2);
        R_C2_29_3 = (RadioButton) v.findViewById(R.id.R_C2_29_3);
        R_C2_29_4 = (RadioButton) v.findViewById(R.id.R_C2_29_4);
        R_C2_29_5 = (RadioButton) v.findViewById(R.id.R_C2_29_5);
        R_C2_29_6 = (RadioButton) v.findViewById(R.id.R_C2_29_6);
        R_C2_29_7 = (RadioButton) v.findViewById(R.id.R_C2_29_7);
        R_C2_30_1 = (RadioButton) v.findViewById(R.id.R_C2_30_1);
        R_C2_30_2 = (RadioButton) v.findViewById(R.id.R_C2_30_2);
        R_C2_30_3 = (RadioButton) v.findViewById(R.id.R_C2_30_3);
        R_C2_30_4 = (RadioButton) v.findViewById(R.id.R_C2_30_4);
        R_C2_30_5 = (RadioButton) v.findViewById(R.id.R_C2_30_5);
        R_C2_30_6 = (RadioButton) v.findViewById(R.id.R_C2_30_6);
        R_C2_30_7 = (RadioButton) v.findViewById(R.id.R_C2_30_7);

        R_C2_31_1 = (RadioButton) v.findViewById(R.id.R_C2_31_1);
        R_C2_31_2 = (RadioButton) v.findViewById(R.id.R_C2_31_2);
        R_C2_31_3 = (RadioButton) v.findViewById(R.id.R_C2_31_3);
        R_C2_31_4 = (RadioButton) v.findViewById(R.id.R_C2_31_4);
        R_C2_31_5 = (RadioButton) v.findViewById(R.id.R_C2_31_5);
        R_C2_31_6 = (RadioButton) v.findViewById(R.id.R_C2_31_6);
        R_C2_31_7 = (RadioButton) v.findViewById(R.id.R_C2_31_7);

        R_C2_32_1 = (RadioButton) v.findViewById(R.id.R_C2_32_1);
        R_C2_32_2 = (RadioButton) v.findViewById(R.id.R_C2_32_2);
        R_C2_32_3 = (RadioButton) v.findViewById(R.id.R_C2_32_3);
        R_C2_32_4 = (RadioButton) v.findViewById(R.id.R_C2_32_4);
        R_C2_32_5 = (RadioButton) v.findViewById(R.id.R_C2_32_5);
        R_C2_32_6 = (RadioButton) v.findViewById(R.id.R_C2_32_6);
        R_C2_32_7 = (RadioButton) v.findViewById(R.id.R_C2_32_7);
        R_C2_33_1 = (RadioButton) v.findViewById(R.id.R_C2_33_1);
        R_C2_33_2 = (RadioButton) v.findViewById(R.id.R_C2_33_2);
        R_C2_33_3 = (RadioButton) v.findViewById(R.id.R_C2_33_3);
        R_C2_33_4 = (RadioButton) v.findViewById(R.id.R_C2_33_4);
        R_C2_33_5 = (RadioButton) v.findViewById(R.id.R_C2_33_5);
        R_C2_33_6 = (RadioButton) v.findViewById(R.id.R_C2_33_6);
        R_C2_33_7 = (RadioButton) v.findViewById(R.id.R_C2_33_7);
        R_C2_34_1 = (RadioButton) v.findViewById(R.id.R_C2_34_1);
        R_C2_34_2 = (RadioButton) v.findViewById(R.id.R_C2_34_2);
        R_C2_34_3 = (RadioButton) v.findViewById(R.id.R_C2_34_3);
        R_C2_34_4 = (RadioButton) v.findViewById(R.id.R_C2_34_4);
        R_C2_34_5 = (RadioButton) v.findViewById(R.id.R_C2_34_5);
        R_C2_34_6 = (RadioButton) v.findViewById(R.id.R_C2_34_6);
        R_C2_34_7 = (RadioButton) v.findViewById(R.id.R_C2_34_7);
        R_C2_35_1 = (RadioButton) v.findViewById(R.id.R_C2_35_1);
        R_C2_35_2 = (RadioButton) v.findViewById(R.id.R_C2_35_2);
        R_C2_35_3 = (RadioButton) v.findViewById(R.id.R_C2_35_3);
        R_C2_35_4 = (RadioButton) v.findViewById(R.id.R_C2_35_4);
        R_C2_35_5 = (RadioButton) v.findViewById(R.id.R_C2_35_5);
        R_C2_35_6 = (RadioButton) v.findViewById(R.id.R_C2_35_6);
        R_C2_35_7 = (RadioButton) v.findViewById(R.id.R_C2_35_7);
        R_C2_36_1 = (RadioButton) v.findViewById(R.id.R_C2_36_1);
        R_C2_36_2 = (RadioButton) v.findViewById(R.id.R_C2_36_2);
        R_C2_36_3 = (RadioButton) v.findViewById(R.id.R_C2_36_3);
        R_C2_36_4 = (RadioButton) v.findViewById(R.id.R_C2_36_4);
        R_C2_36_5 = (RadioButton) v.findViewById(R.id.R_C2_36_5);
        R_C2_36_6 = (RadioButton) v.findViewById(R.id.R_C2_36_6);
        R_C2_36_7 = (RadioButton) v.findViewById(R.id.R_C2_36_7);
        R_C2_37_1 = (RadioButton) v.findViewById(R.id.R_C2_37_1);
        R_C2_37_2 = (RadioButton) v.findViewById(R.id.R_C2_37_2);
        R_C2_37_3 = (RadioButton) v.findViewById(R.id.R_C2_37_3);
        R_C2_37_4 = (RadioButton) v.findViewById(R.id.R_C2_37_4);
        R_C2_37_5 = (RadioButton) v.findViewById(R.id.R_C2_37_5);
        R_C2_37_6 = (RadioButton) v.findViewById(R.id.R_C2_37_6);
        R_C2_37_7 = (RadioButton) v.findViewById(R.id.R_C2_37_7);
        R_C2_38_1 = (RadioButton) v.findViewById(R.id.R_C2_38_1);
        R_C2_38_2 = (RadioButton) v.findViewById(R.id.R_C2_38_2);
        R_C2_38_3 = (RadioButton) v.findViewById(R.id.R_C2_38_3);
        R_C2_38_4 = (RadioButton) v.findViewById(R.id.R_C2_38_4);
        R_C2_38_5 = (RadioButton) v.findViewById(R.id.R_C2_38_5);
        R_C2_38_6 = (RadioButton) v.findViewById(R.id.R_C2_38_6);
        R_C2_38_7 = (RadioButton) v.findViewById(R.id.R_C2_38_7);
        R_C2_39_1 = (RadioButton) v.findViewById(R.id.R_C2_39_1);
        R_C2_39_2 = (RadioButton) v.findViewById(R.id.R_C2_39_2);
        R_C2_39_3 = (RadioButton) v.findViewById(R.id.R_C2_39_3);
        R_C2_39_4 = (RadioButton) v.findViewById(R.id.R_C2_39_4);
        R_C2_39_5 = (RadioButton) v.findViewById(R.id.R_C2_39_5);
        R_C2_39_6 = (RadioButton) v.findViewById(R.id.R_C2_39_6);
        R_C2_39_7 = (RadioButton) v.findViewById(R.id.R_C2_39_7);
        R_C2_40_1 = (RadioButton) v.findViewById(R.id.R_C2_40_1);
        R_C2_40_2 = (RadioButton) v.findViewById(R.id.R_C2_40_2);
        R_C2_40_3 = (RadioButton) v.findViewById(R.id.R_C2_40_3);
        R_C2_40_4 = (RadioButton) v.findViewById(R.id.R_C2_40_4);
        R_C2_40_5 = (RadioButton) v.findViewById(R.id.R_C2_40_5);
        R_C2_40_6 = (RadioButton) v.findViewById(R.id.R_C2_40_6);
        R_C2_40_7 = (RadioButton) v.findViewById(R.id.R_C2_40_7);
        R_C2_41_1 = (RadioButton) v.findViewById(R.id.R_C2_41_1);
        R_C2_41_2 = (RadioButton) v.findViewById(R.id.R_C2_41_2);
        R_C2_41_3 = (RadioButton) v.findViewById(R.id.R_C2_41_3);
        R_C2_41_4 = (RadioButton) v.findViewById(R.id.R_C2_41_4);
        R_C2_41_5 = (RadioButton) v.findViewById(R.id.R_C2_41_5);
        R_C2_41_6 = (RadioButton) v.findViewById(R.id.R_C2_41_6);
        R_C2_41_7 = (RadioButton) v.findViewById(R.id.R_C2_41_7);
        R_C2_42_1 = (RadioButton) v.findViewById(R.id.R_C2_42_1);
        R_C2_42_2 = (RadioButton) v.findViewById(R.id.R_C2_42_2);
        R_C2_42_3 = (RadioButton) v.findViewById(R.id.R_C2_42_3);
        R_C2_42_4 = (RadioButton) v.findViewById(R.id.R_C2_42_4);
        R_C2_42_5 = (RadioButton) v.findViewById(R.id.R_C2_42_5);
        R_C2_42_6 = (RadioButton) v.findViewById(R.id.R_C2_42_6);
        R_C2_42_7 = (RadioButton) v.findViewById(R.id.R_C2_42_7);
        R_C2_43_1 = (RadioButton) v.findViewById(R.id.R_C2_43_1);
        R_C2_43_2 = (RadioButton) v.findViewById(R.id.R_C2_43_2);
        R_C2_43_3 = (RadioButton) v.findViewById(R.id.R_C2_43_3);
        R_C2_43_4 = (RadioButton) v.findViewById(R.id.R_C2_43_4);
        R_C2_43_5 = (RadioButton) v.findViewById(R.id.R_C2_43_5);
        R_C2_43_6 = (RadioButton) v.findViewById(R.id.R_C2_43_6);
        R_C2_43_7 = (RadioButton) v.findViewById(R.id.R_C2_43_7);
        R_C2_44_1 = (RadioButton) v.findViewById(R.id.R_C2_44_1);
        R_C2_44_2 = (RadioButton) v.findViewById(R.id.R_C2_44_2);
        R_C2_44_3 = (RadioButton) v.findViewById(R.id.R_C2_44_3);
        R_C2_44_4 = (RadioButton) v.findViewById(R.id.R_C2_44_4);
        R_C2_44_5 = (RadioButton) v.findViewById(R.id.R_C2_44_5);
        R_C2_44_6 = (RadioButton) v.findViewById(R.id.R_C2_44_6);
        R_C2_44_7 = (RadioButton) v.findViewById(R.id.R_C2_44_7);
        R_C2_45_1 = (RadioButton) v.findViewById(R.id.R_C2_45_1);
        R_C2_45_2 = (RadioButton) v.findViewById(R.id.R_C2_45_2);
        R_C2_45_3 = (RadioButton) v.findViewById(R.id.R_C2_45_3);
        R_C2_45_4 = (RadioButton) v.findViewById(R.id.R_C2_45_4);
        R_C2_45_5 = (RadioButton) v.findViewById(R.id.R_C2_45_5);
        R_C2_45_6 = (RadioButton) v.findViewById(R.id.R_C2_45_6);
        R_C2_45_7 = (RadioButton) v.findViewById(R.id.R_C2_45_7);
        R_C2_46_1 = (RadioButton) v.findViewById(R.id.R_C2_46_1);
        R_C2_46_2 = (RadioButton) v.findViewById(R.id.R_C2_46_2);
        R_C2_46_3 = (RadioButton) v.findViewById(R.id.R_C2_46_3);
        R_C2_46_4 = (RadioButton) v.findViewById(R.id.R_C2_46_4);
        R_C2_46_5 = (RadioButton) v.findViewById(R.id.R_C2_46_5);
        R_C2_46_6 = (RadioButton) v.findViewById(R.id.R_C2_46_6);
        R_C2_46_7 = (RadioButton) v.findViewById(R.id.R_C2_46_7);
        R_C2_47_1 = (RadioButton) v.findViewById(R.id.R_C2_47_1);
        R_C2_47_2 = (RadioButton) v.findViewById(R.id.R_C2_47_2);
        R_C2_47_3 = (RadioButton) v.findViewById(R.id.R_C2_47_3);
        R_C2_47_4 = (RadioButton) v.findViewById(R.id.R_C2_47_4);
        R_C2_47_5 = (RadioButton) v.findViewById(R.id.R_C2_47_5);
        R_C2_47_6 = (RadioButton) v.findViewById(R.id.R_C2_47_6);
        R_C2_47_7 = (RadioButton) v.findViewById(R.id.R_C2_47_7);
        R_C2_48_1 = (RadioButton) v.findViewById(R.id.R_C2_48_1);
        R_C2_48_2 = (RadioButton) v.findViewById(R.id.R_C2_48_2);
        R_C2_48_3 = (RadioButton) v.findViewById(R.id.R_C2_48_3);
        R_C2_48_4 = (RadioButton) v.findViewById(R.id.R_C2_48_4);
        R_C2_48_5 = (RadioButton) v.findViewById(R.id.R_C2_48_5);
        R_C2_48_6 = (RadioButton) v.findViewById(R.id.R_C2_48_6);
        R_C2_48_7 = (RadioButton) v.findViewById(R.id.R_C2_48_7);
        R_C2_49_1 = (RadioButton) v.findViewById(R.id.R_C2_49_1);
        R_C2_49_2 = (RadioButton) v.findViewById(R.id.R_C2_49_2);
        R_C2_49_3 = (RadioButton) v.findViewById(R.id.R_C2_49_3);
        R_C2_49_4 = (RadioButton) v.findViewById(R.id.R_C2_49_4);
        R_C2_49_5 = (RadioButton) v.findViewById(R.id.R_C2_49_5);
        R_C2_49_6 = (RadioButton) v.findViewById(R.id.R_C2_49_6);
        R_C2_49_7 = (RadioButton) v.findViewById(R.id.R_C2_49_7);
        R_C2_50_1 = (RadioButton) v.findViewById(R.id.R_C2_50_1);
        R_C2_50_2 = (RadioButton) v.findViewById(R.id.R_C2_50_2);
        R_C2_50_3 = (RadioButton) v.findViewById(R.id.R_C2_50_3);
        R_C2_50_4 = (RadioButton) v.findViewById(R.id.R_C2_50_4);
        R_C2_50_5 = (RadioButton) v.findViewById(R.id.R_C2_50_5);
        R_C2_50_6 = (RadioButton) v.findViewById(R.id.R_C2_50_6);
        R_C2_50_7 = (RadioButton) v.findViewById(R.id.R_C2_50_7);
        R_C2_51_1 = (RadioButton) v.findViewById(R.id.R_C2_51_1);
        R_C2_51_2 = (RadioButton) v.findViewById(R.id.R_C2_51_2);
        R_C2_51_3 = (RadioButton) v.findViewById(R.id.R_C2_51_3);
        R_C2_51_4 = (RadioButton) v.findViewById(R.id.R_C2_51_4);
        R_C2_51_5 = (RadioButton) v.findViewById(R.id.R_C2_51_5);
        R_C2_51_6 = (RadioButton) v.findViewById(R.id.R_C2_51_6);
        R_C2_51_7 = (RadioButton) v.findViewById(R.id.R_C2_51_7);

        R_C2_52_1 = (RadioButton) v.findViewById(R.id.R_C2_52_1);
        R_C2_52_2 = (RadioButton) v.findViewById(R.id.R_C2_52_2);
        R_C2_52_3 = (RadioButton) v.findViewById(R.id.R_C2_52_3);
        R_C2_52_4 = (RadioButton) v.findViewById(R.id.R_C2_52_4);
        R_C2_52_5 = (RadioButton) v.findViewById(R.id.R_C2_52_5);
        R_C2_52_6 = (RadioButton) v.findViewById(R.id.R_C2_52_6);
        R_C2_52_7 = (RadioButton) v.findViewById(R.id.R_C2_52_7);
        R_C2_53_1 = (RadioButton) v.findViewById(R.id.R_C2_53_1);
        R_C2_53_2 = (RadioButton) v.findViewById(R.id.R_C2_53_2);
        R_C2_53_3 = (RadioButton) v.findViewById(R.id.R_C2_53_3);
        R_C2_53_4 = (RadioButton) v.findViewById(R.id.R_C2_53_4);
        R_C2_53_5 = (RadioButton) v.findViewById(R.id.R_C2_53_5);
        R_C2_53_6 = (RadioButton) v.findViewById(R.id.R_C2_53_6);
        R_C2_53_7 = (RadioButton) v.findViewById(R.id.R_C2_53_7);
        R_C2_54_1 = (RadioButton) v.findViewById(R.id.R_C2_54_1);
        R_C2_54_2 = (RadioButton) v.findViewById(R.id.R_C2_54_2);
        R_C2_54_3 = (RadioButton) v.findViewById(R.id.R_C2_54_3);
        R_C2_54_4 = (RadioButton) v.findViewById(R.id.R_C2_54_4);
        R_C2_54_5 = (RadioButton) v.findViewById(R.id.R_C2_54_5);
        R_C2_54_6 = (RadioButton) v.findViewById(R.id.R_C2_54_6);
        R_C2_54_7 = (RadioButton) v.findViewById(R.id.R_C2_54_7);
        R_C2_55_1 = (RadioButton) v.findViewById(R.id.R_C2_55_1);
        R_C2_55_2 = (RadioButton) v.findViewById(R.id.R_C2_55_2);
        R_C2_55_3 = (RadioButton) v.findViewById(R.id.R_C2_55_3);
        R_C2_55_4 = (RadioButton) v.findViewById(R.id.R_C2_55_4);
        R_C2_55_5 = (RadioButton) v.findViewById(R.id.R_C2_55_5);
        R_C2_55_6 = (RadioButton) v.findViewById(R.id.R_C2_55_6);
        R_C2_55_7 = (RadioButton) v.findViewById(R.id.R_C2_55_7);
        R_C2_56_1 = (RadioButton) v.findViewById(R.id.R_C2_56_1);
        R_C2_56_2 = (RadioButton) v.findViewById(R.id.R_C2_56_2);
        R_C2_56_3 = (RadioButton) v.findViewById(R.id.R_C2_56_3);
        R_C2_56_4 = (RadioButton) v.findViewById(R.id.R_C2_56_4);
        R_C2_56_5 = (RadioButton) v.findViewById(R.id.R_C2_56_5);
        R_C2_56_6 = (RadioButton) v.findViewById(R.id.R_C2_56_6);
        R_C2_56_7 = (RadioButton) v.findViewById(R.id.R_C2_56_7);
        R_C2_57_1 = (RadioButton) v.findViewById(R.id.R_C2_57_1);
        R_C2_57_2 = (RadioButton) v.findViewById(R.id.R_C2_57_2);
        R_C2_57_3 = (RadioButton) v.findViewById(R.id.R_C2_57_3);
        R_C2_57_4 = (RadioButton) v.findViewById(R.id.R_C2_57_4);
        R_C2_57_5 = (RadioButton) v.findViewById(R.id.R_C2_57_5);
        R_C2_57_6 = (RadioButton) v.findViewById(R.id.R_C2_57_6);
        R_C2_57_7 = (RadioButton) v.findViewById(R.id.R_C2_57_7);
        R_C2_58_1 = (RadioButton) v.findViewById(R.id.R_C2_58_1);
        R_C2_58_2 = (RadioButton) v.findViewById(R.id.R_C2_58_2);
        R_C2_58_3 = (RadioButton) v.findViewById(R.id.R_C2_58_3);
        R_C2_58_4 = (RadioButton) v.findViewById(R.id.R_C2_58_4);
        R_C2_58_5 = (RadioButton) v.findViewById(R.id.R_C2_58_5);
        R_C2_58_6 = (RadioButton) v.findViewById(R.id.R_C2_58_6);
        R_C2_58_7 = (RadioButton) v.findViewById(R.id.R_C2_58_7);
        R_C2_59_1 = (RadioButton) v.findViewById(R.id.R_C2_59_1);
        R_C2_59_2 = (RadioButton) v.findViewById(R.id.R_C2_59_2);
        R_C2_59_3 = (RadioButton) v.findViewById(R.id.R_C2_59_3);
        R_C2_59_4 = (RadioButton) v.findViewById(R.id.R_C2_59_4);
        R_C2_59_5 = (RadioButton) v.findViewById(R.id.R_C2_59_5);
        R_C2_59_6 = (RadioButton) v.findViewById(R.id.R_C2_59_6);
        R_C2_59_7 = (RadioButton) v.findViewById(R.id.R_C2_59_7);
        R_C2_60_1 = (RadioButton) v.findViewById(R.id.R_C2_60_1);
        R_C2_60_2 = (RadioButton) v.findViewById(R.id.R_C2_60_2);
        R_C2_60_3 = (RadioButton) v.findViewById(R.id.R_C2_60_3);
        R_C2_60_4 = (RadioButton) v.findViewById(R.id.R_C2_60_4);
        R_C2_60_5 = (RadioButton) v.findViewById(R.id.R_C2_60_5);
        R_C2_60_6 = (RadioButton) v.findViewById(R.id.R_C2_60_6);
        R_C2_60_7 = (RadioButton) v.findViewById(R.id.R_C2_60_7);
        R_C2_61_1 = (RadioButton) v.findViewById(R.id.R_C2_61_1);
        R_C2_61_2 = (RadioButton) v.findViewById(R.id.R_C2_61_2);
        R_C2_61_3 = (RadioButton) v.findViewById(R.id.R_C2_61_3);
        R_C2_61_4 = (RadioButton) v.findViewById(R.id.R_C2_61_4);
        R_C2_61_5 = (RadioButton) v.findViewById(R.id.R_C2_61_5);
        R_C2_61_6 = (RadioButton) v.findViewById(R.id.R_C2_61_6);
        R_C2_61_7 = (RadioButton) v.findViewById(R.id.R_C2_61_7);
        R_C2_62_1 = (RadioButton) v.findViewById(R.id.R_C2_62_1);
        R_C2_62_2 = (RadioButton) v.findViewById(R.id.R_C2_62_2);
        R_C2_62_3 = (RadioButton) v.findViewById(R.id.R_C2_62_3);
        R_C2_62_4 = (RadioButton) v.findViewById(R.id.R_C2_62_4);
        R_C2_62_5 = (RadioButton) v.findViewById(R.id.R_C2_62_5);
        R_C2_62_6 = (RadioButton) v.findViewById(R.id.R_C2_62_6);
        R_C2_62_7 = (RadioButton) v.findViewById(R.id.R_C2_62_7);
        R_C2_63_1 = (RadioButton) v.findViewById(R.id.R_C2_63_1);
        R_C2_63_2 = (RadioButton) v.findViewById(R.id.R_C2_63_2);
        R_C2_63_3 = (RadioButton) v.findViewById(R.id.R_C2_63_3);
        R_C2_63_4 = (RadioButton) v.findViewById(R.id.R_C2_63_4);
        R_C2_63_5 = (RadioButton) v.findViewById(R.id.R_C2_63_5);
        R_C2_63_6 = (RadioButton) v.findViewById(R.id.R_C2_63_6);
        R_C2_63_7 = (RadioButton) v.findViewById(R.id.R_C2_63_7);
        R_C2_64_1 = (RadioButton) v.findViewById(R.id.R_C2_64_1);
        R_C2_64_2 = (RadioButton) v.findViewById(R.id.R_C2_64_2);
        R_C2_64_3 = (RadioButton) v.findViewById(R.id.R_C2_64_3);
        R_C2_64_4 = (RadioButton) v.findViewById(R.id.R_C2_64_4);
        R_C2_64_5 = (RadioButton) v.findViewById(R.id.R_C2_64_5);
        R_C2_64_6 = (RadioButton) v.findViewById(R.id.R_C2_64_6);
        R_C2_64_7 = (RadioButton) v.findViewById(R.id.R_C2_64_7);
        R_C2_65_1 = (RadioButton) v.findViewById(R.id.R_C2_65_1);
        R_C2_65_2 = (RadioButton) v.findViewById(R.id.R_C2_65_2);
        R_C2_65_3 = (RadioButton) v.findViewById(R.id.R_C2_65_3);
        R_C2_65_4 = (RadioButton) v.findViewById(R.id.R_C2_65_4);
        R_C2_65_5 = (RadioButton) v.findViewById(R.id.R_C2_65_5);
        R_C2_65_6 = (RadioButton) v.findViewById(R.id.R_C2_65_6);
        R_C2_65_7 = (RadioButton) v.findViewById(R.id.R_C2_65_7);
        R_C2_66_1 = (RadioButton) v.findViewById(R.id.R_C2_66_1);
        R_C2_66_2 = (RadioButton) v.findViewById(R.id.R_C2_66_2);
        R_C2_66_3 = (RadioButton) v.findViewById(R.id.R_C2_66_3);
        R_C2_66_4 = (RadioButton) v.findViewById(R.id.R_C2_66_4);
        R_C2_66_5 = (RadioButton) v.findViewById(R.id.R_C2_66_5);
        R_C2_66_6 = (RadioButton) v.findViewById(R.id.R_C2_66_6);
        R_C2_66_7 = (RadioButton) v.findViewById(R.id.R_C2_66_7);
        R_C2_67_1 = (RadioButton) v.findViewById(R.id.R_C2_67_1);
        R_C2_67_2 = (RadioButton) v.findViewById(R.id.R_C2_67_2);
        R_C2_67_3 = (RadioButton) v.findViewById(R.id.R_C2_67_3);
        R_C2_67_4 = (RadioButton) v.findViewById(R.id.R_C2_67_4);
        R_C2_67_5 = (RadioButton) v.findViewById(R.id.R_C2_67_5);
        R_C2_67_6 = (RadioButton) v.findViewById(R.id.R_C2_67_6);
        R_C2_67_7 = (RadioButton) v.findViewById(R.id.R_C2_67_7);
        R_C2_68_1 = (RadioButton) v.findViewById(R.id.R_C2_68_1);
        R_C2_68_2 = (RadioButton) v.findViewById(R.id.R_C2_68_2);
        R_C2_68_3 = (RadioButton) v.findViewById(R.id.R_C2_68_3);
        R_C2_68_4 = (RadioButton) v.findViewById(R.id.R_C2_68_4);
        R_C2_68_5 = (RadioButton) v.findViewById(R.id.R_C2_68_5);
        R_C2_68_6 = (RadioButton) v.findViewById(R.id.R_C2_68_6);
        R_C2_68_7 = (RadioButton) v.findViewById(R.id.R_C2_68_7);


        R_C2_69_1 = (RadioButton) v.findViewById(R.id.R_C2_69_1);
        R_C2_69_2 = (RadioButton) v.findViewById(R.id.R_C2_69_2);
        R_C2_69_3 = (RadioButton) v.findViewById(R.id.R_C2_69_3);
        R_C2_69_4 = (RadioButton) v.findViewById(R.id.R_C2_69_4);
        R_C2_69_5 = (RadioButton) v.findViewById(R.id.R_C2_69_5);
        R_C2_69_6 = (RadioButton) v.findViewById(R.id.R_C2_69_6);
        R_C2_69_7 = (RadioButton) v.findViewById(R.id.R_C2_69_7);

        R_C2_70_1 = (RadioButton) v.findViewById(R.id.R_C2_70_1);
        R_C2_70_2 = (RadioButton) v.findViewById(R.id.R_C2_70_2);
        R_C2_70_3 = (RadioButton) v.findViewById(R.id.R_C2_70_3);
        R_C2_70_4 = (RadioButton) v.findViewById(R.id.R_C2_70_4);
        R_C2_70_5 = (RadioButton) v.findViewById(R.id.R_C2_70_5);
        R_C2_70_6 = (RadioButton) v.findViewById(R.id.R_C2_70_6);
        R_C2_70_7 = (RadioButton) v.findViewById(R.id.R_C2_70_7);
        R_C2_71_1 = (RadioButton) v.findViewById(R.id.R_C2_71_1);
        R_C2_71_2 = (RadioButton) v.findViewById(R.id.R_C2_71_2);
        R_C2_71_3 = (RadioButton) v.findViewById(R.id.R_C2_71_3);
        R_C2_71_4 = (RadioButton) v.findViewById(R.id.R_C2_71_4);
        R_C2_71_5 = (RadioButton) v.findViewById(R.id.R_C2_71_5);
        R_C2_71_6 = (RadioButton) v.findViewById(R.id.R_C2_71_6);
        R_C2_71_7 = (RadioButton) v.findViewById(R.id.R_C2_71_7);
        R_C2_72_1 = (RadioButton) v.findViewById(R.id.R_C2_72_1);
        R_C2_72_2 = (RadioButton) v.findViewById(R.id.R_C2_72_2);
        R_C2_72_3 = (RadioButton) v.findViewById(R.id.R_C2_72_3);
        R_C2_72_4 = (RadioButton) v.findViewById(R.id.R_C2_72_4);
        R_C2_72_5 = (RadioButton) v.findViewById(R.id.R_C2_72_5);
        R_C2_72_6 = (RadioButton) v.findViewById(R.id.R_C2_72_6);
        R_C2_72_7 = (RadioButton) v.findViewById(R.id.R_C2_72_7);
        R_C2_73_1 = (RadioButton) v.findViewById(R.id.R_C2_73_1);
        R_C2_73_2 = (RadioButton) v.findViewById(R.id.R_C2_73_2);
        R_C2_73_3 = (RadioButton) v.findViewById(R.id.R_C2_73_3);
        R_C2_73_4 = (RadioButton) v.findViewById(R.id.R_C2_73_4);
        R_C2_73_5 = (RadioButton) v.findViewById(R.id.R_C2_73_5);
        R_C2_73_6 = (RadioButton) v.findViewById(R.id.R_C2_73_6);
        R_C2_73_7 = (RadioButton) v.findViewById(R.id.R_C2_73_7);
        R_C2_74_1 = (RadioButton) v.findViewById(R.id.R_C2_74_1);
        R_C2_74_2 = (RadioButton) v.findViewById(R.id.R_C2_74_2);
        R_C2_74_3 = (RadioButton) v.findViewById(R.id.R_C2_74_3);
        R_C2_74_4 = (RadioButton) v.findViewById(R.id.R_C2_74_4);
        R_C2_74_5 = (RadioButton) v.findViewById(R.id.R_C2_74_5);
        R_C2_74_6 = (RadioButton) v.findViewById(R.id.R_C2_74_6);
        R_C2_74_7 = (RadioButton) v.findViewById(R.id.R_C2_74_7);
        R_C2_75_1 = (RadioButton) v.findViewById(R.id.R_C2_75_1);
        R_C2_75_2 = (RadioButton) v.findViewById(R.id.R_C2_75_2);
        R_C2_75_3 = (RadioButton) v.findViewById(R.id.R_C2_75_3);
        R_C2_75_4 = (RadioButton) v.findViewById(R.id.R_C2_75_4);
        R_C2_75_5 = (RadioButton) v.findViewById(R.id.R_C2_75_5);
        R_C2_75_6 = (RadioButton) v.findViewById(R.id.R_C2_75_6);
        R_C2_75_7 = (RadioButton) v.findViewById(R.id.R_C2_75_7);

        R_C2_76_1 = (RadioButton) v.findViewById(R.id.R_C2_76_1);
        R_C2_76_2 = (RadioButton) v.findViewById(R.id.R_C2_76_2);
        R_C2_76_3 = (RadioButton) v.findViewById(R.id.R_C2_76_3);
        R_C2_76_4 = (RadioButton) v.findViewById(R.id.R_C2_76_4);
        R_C2_76_5 = (RadioButton) v.findViewById(R.id.R_C2_76_5);
        R_C2_76_6 = (RadioButton) v.findViewById(R.id.R_C2_76_6);
        R_C2_76_7 = (RadioButton) v.findViewById(R.id.R_C2_76_7);


        R_C2_77_1 = (RadioButton) v.findViewById(R.id.R_C2_77_1);
        R_C2_77_2 = (RadioButton) v.findViewById(R.id.R_C2_77_2);
        R_C2_77_3 = (RadioButton) v.findViewById(R.id.R_C2_77_3);
        R_C2_77_4 = (RadioButton) v.findViewById(R.id.R_C2_77_4);
        R_C2_77_5 = (RadioButton) v.findViewById(R.id.R_C2_77_5);
        R_C2_77_6 = (RadioButton) v.findViewById(R.id.R_C2_77_6);
        R_C2_77_7 = (RadioButton) v.findViewById(R.id.R_C2_77_7);


        R_C2_78_1 = (RadioButton) v.findViewById(R.id.R_C2_78_1);
        R_C2_78_2 = (RadioButton) v.findViewById(R.id.R_C2_78_2);
        R_C2_78_3 = (RadioButton) v.findViewById(R.id.R_C2_78_3);
        R_C2_78_4 = (RadioButton) v.findViewById(R.id.R_C2_78_4);
        R_C2_78_5 = (RadioButton) v.findViewById(R.id.R_C2_78_5);
        R_C2_78_6 = (RadioButton) v.findViewById(R.id.R_C2_78_6);

        R_C3_1 = (RadioButton) v.findViewById(R.id.R_C3_1);
        R_C3_2 = (RadioButton) v.findViewById(R.id.R_C3_2);
        R_C3_3 = (RadioButton) v.findViewById(R.id.R_C3_3);
        R_C3_4 = (RadioButton) v.findViewById(R.id.R_C3_4);
        R_C3_5 = (RadioButton) v.findViewById(R.id.R_C3_5);
        R_C4_1 = (RadioButton) v.findViewById(R.id.R_C4_1);
        R_C4_2 = (RadioButton) v.findViewById(R.id.R_C4_2);
        R_C4_3 = (RadioButton) v.findViewById(R.id.R_C4_3);
        R_C4_4 = (RadioButton) v.findViewById(R.id.R_C4_4);
        R_C4_5 = (RadioButton) v.findViewById(R.id.R_C4_5);
        R_C4_6 = (RadioButton) v.findViewById(R.id.R_C4_6);
        R_C6_Yes = (RadioButton) v.findViewById(R.id.R_C6_Yes);
        R_C6_No = (RadioButton) v.findViewById(R.id.R_C6_No);
        R_C7_1 = (RadioButton) v.findViewById(R.id.R_C7_1);
        R_C7_2 = (RadioButton) v.findViewById(R.id.R_C7_2);
        R_C7_3 = (RadioButton) v.findViewById(R.id.R_C7_3);


    }

    public boolean Validationiamgood() {


        if (GothroughTextboxssC1.IamHiden(lv_C1_1) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_2) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_3) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_4) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_5) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_6) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_7) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_8) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_9) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_10) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_11) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_12) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_13) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_14) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_15) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_16) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_17) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_18) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_19) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_20) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_21) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_22) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_23) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_24) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_25) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_26) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_27) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_28) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_29) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_30) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_31) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_32) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_33) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_34) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_35) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_36) == false) {
            return false;
        }
        if (GothroughTextboxssC1.IamHiden(lv_C1_37) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_C2_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_12) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_13) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_14) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_15) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_16) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_17) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_18) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_19) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_20) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_21) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_22) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_23) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_24) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_25) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_26) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_27) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_28) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_29) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_30) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_31) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_32) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_33) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_34) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_35) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_36) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_37) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_38) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_39) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_40) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_41) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_42) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_43) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_44) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_45) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_46) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_47) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_48) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_49) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_50) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_51) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_52) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_53) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_54) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_55) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_56) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_57) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_58) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_58) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_59) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_60) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_61) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_62) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_63) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_64) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_65) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_66) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_68) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_69) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_70) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_71) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_72) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_73) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_74) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_75) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C2_76) == false) {
            return false;
        }

        if (Gothrough.IamHiden(lv_C2_77) == false) {
            return false;
        }

        return Gothrough.IamHiden(lv_C2_78) != false;
    }


    public boolean IamgoodParttwoo() {

        if (Gothrough.IamHiden(lv_C3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(lv_C6) == false) {
            return false;
        }
        return Gothrough.IamHiden(lv_C7) != false;
    }

    boolean asignValues() {

        if (ed_C1_1_1.getText().toString().trim().length() > 0) {
            C1_1_1 = ed_C1_1_1.getText().toString().trim();
        } else {
            C1_1_1 = "999";
        }

        if (ed_C1_1_2.getText().toString().trim().length() > 0) {
            C1_1_2 = ed_C1_1_2.getText().toString().trim();
        } else {
            C1_1_2 = "999";
        }

        if (ed_C1_1_3.getText().toString().trim().length() > 0) {
            C1_1_3 = ed_C1_1_3.getText().toString().trim();
        } else {
            C1_1_3 = "999";
        }

        if (ed_C1_1_4.getText().toString().trim().length() > 0) {
            C1_1_4 = ed_C1_1_4.getText().toString().trim();
        } else {
            C1_1_4 = "999";
        }


        if (ed_C1_2_1.getText().toString().trim().length() > 0) {
            C1_2_1 = ed_C1_2_1.getText().toString().trim();
        } else {
            C1_2_1 = "999";
        }


        if (ed_C1_2_2.getText().toString().trim().length() > 0) {
            C1_2_2 = ed_C1_2_2.getText().toString().trim();

        } else {

            C1_2_2 = "999";

        }

        if (ed_C1_2_3.getText().toString().trim().length() > 0) {
            C1_2_3 = ed_C1_2_3.getText().toString().trim();
        } else {
            C1_2_3 = "999";
        }
        if (ed_C1_2_4.getText().toString().trim().length() > 0) {
            C1_2_4 = ed_C1_2_4.getText().toString().trim();
        } else {
            C1_2_4 = "999";
        }


///////////////////////////////////////////////////
        if (ed_C1_3_1.getText().toString().trim().length() > 0) {
            C1_3_1 = ed_C1_3_1.getText().toString().trim();
        } else {
            C1_3_1 = "999";
        }
        if (ed_C1_3_2.getText().toString().trim().length() > 0) {
            C1_3_2 = ed_C1_3_2.getText().toString().trim();
        } else {
            C1_3_2 = "999";
        }

        if (ed_C1_3_3.getText().toString().trim().length() > 0) {
            C1_3_3 = ed_C1_3_3.getText().toString().trim();
        } else {
            C1_3_3 = "999";
        }
        if (ed_C1_3_4.getText().toString().trim().length() > 0) {
            C1_3_4 = ed_C1_3_4.getText().toString().trim();
        } else {
            C1_3_4 = "999";
        }

        if (ed_C1_4_1.getText().toString().trim().length() > 0) {
            C1_4_1 = ed_C1_4_1.getText().toString().trim();

        } else {

            C1_4_1 = "999";

        }
        if (ed_C1_4_2.getText().toString().trim().length() > 0) {
            C1_4_2 = ed_C1_4_2.getText().toString().trim();

        } else {

            C1_4_2 = "999";

        }

        if (ed_C1_4_3.getText().toString().trim().length() > 0) {
            C1_4_3 = ed_C1_4_3.getText().toString().trim();
        } else {
            C1_4_3 = "999";
        }
        if (ed_C1_4_4.getText().toString().trim().length() > 0) {
            C1_4_4 = ed_C1_4_4.getText().toString().trim();
        } else {
            C1_4_4 = "999";
        }

        if (ed_C1_5_1.getText().toString().trim().length() > 0) {
            C1_5_1 = ed_C1_5_1.getText().toString().trim();

        } else {

            C1_5_1 = "999";

        }
        if (ed_C1_5_2.getText().toString().trim().length() > 0) {
            C1_5_2 = ed_C1_5_2.getText().toString().trim();

        } else {

            C1_5_2 = "999";

        }

        if (ed_C1_5_3.getText().toString().trim().length() > 0) {
            C1_5_3 = ed_C1_5_3.getText().toString().trim();
        } else {
            C1_5_3 = "999";
        }
        if (ed_C1_5_4.getText().toString().trim().length() > 0) {
            C1_5_4 = ed_C1_5_4.getText().toString().trim();
        } else {
            C1_5_4 = "999";
        }

        if (ed_C1_6_1.getText().toString().trim().length() > 0) {
            C1_6_1 = ed_C1_6_1.getText().toString().trim();

        } else {

            C1_6_1 = "999";

        }
        if (ed_C1_6_2.getText().toString().trim().length() > 0) {
            C1_6_2 = ed_C1_6_2.getText().toString().trim();

        } else {

            C1_6_2 = "999";

        }

        if (ed_C1_6_3.getText().toString().trim().length() > 0) {
            C1_6_3 = ed_C1_6_3.getText().toString().trim();
        } else {
            C1_6_3 = "999";
        }
        if (ed_C1_6_4.getText().toString().trim().length() > 0) {
            C1_6_4 = ed_C1_6_4.getText().toString().trim();
        } else {
            C1_6_4 = "999";
        }

        if (ed_C1_7_1.getText().toString().trim().length() > 0) {
            C1_7_1 = ed_C1_7_1.getText().toString().trim();

        } else {

            C1_7_1 = "999";

        }
        if (ed_C1_7_2.getText().toString().trim().length() > 0) {
            C1_7_2 = ed_C1_7_2.getText().toString().trim();

        } else {

            C1_7_2 = "999";

        }

        if (ed_C1_7_3.getText().toString().trim().length() > 0) {
            C1_7_3 = ed_C1_7_3.getText().toString().trim();
        } else {
            C1_7_3 = "999";
        }
        if (ed_C1_7_4.getText().toString().trim().length() > 0) {
            C1_7_4 = ed_C1_7_4.getText().toString().trim();
        } else {
            C1_7_4 = "999";
        }

        if (ed_C1_8_1.getText().toString().trim().length() > 0) {
            C1_8_1 = ed_C1_8_1.getText().toString().trim();

        } else {

            C1_8_1 = "999";

        }
        if (ed_C1_8_2.getText().toString().trim().length() > 0) {
            C1_8_2 = ed_C1_8_2.getText().toString().trim();

        } else {

            C1_8_2 = "999";

        }

        if (ed_C1_8_3.getText().toString().trim().length() > 0) {
            C1_8_3 = ed_C1_8_3.getText().toString().trim();
        } else {
            C1_8_3 = "999";
        }
        if (ed_C1_8_4.getText().toString().trim().length() > 0) {
            C1_8_4 = ed_C1_8_4.getText().toString().trim();
        } else {
            C1_8_4 = "999";
        }

        if (ed_C1_9_1.getText().toString().trim().length() > 0) {
            C1_9_1 = ed_C1_9_1.getText().toString().trim();

        } else {

            C1_9_1 = "999";

        }
        if (ed_C1_9_2.getText().toString().trim().length() > 0) {
            C1_9_2 = ed_C1_9_2.getText().toString().trim();

        } else {

            C1_9_2 = "999";

        }

        if (ed_C1_9_3.getText().toString().trim().length() > 0) {
            C1_9_3 = ed_C1_9_3.getText().toString().trim();
        } else {
            C1_9_3 = "999";
        }
        if (ed_C1_9_4.getText().toString().trim().length() > 0) {
            C1_9_4 = ed_C1_9_4.getText().toString().trim();
        } else {
            C1_9_4 = "999";
        }

        if (ed_C1_10_1.getText().toString().trim().length() > 0) {
            C1_10_1 = ed_C1_10_1.getText().toString().trim();

        } else {

            C1_10_1 = "999";

        }
        if (ed_C1_10_2.getText().toString().trim().length() > 0) {
            C1_10_2 = ed_C1_10_2.getText().toString().trim();

        } else {

            C1_10_2 = "999";

        }

        if (ed_C1_10_3.getText().toString().trim().length() > 0) {
            C1_10_3 = ed_C1_10_3.getText().toString().trim();
        } else {
            C1_10_3 = "999";
        }
        if (ed_C1_10_4.getText().toString().trim().length() > 0) {
            C1_10_4 = ed_C1_10_4.getText().toString().trim();
        } else {
            C1_10_4 = "999";
        }

        if (ed_C1_11_1.getText().toString().trim().length() > 0) {
            C1_11_1 = ed_C1_11_1.getText().toString().trim();

        } else {

            C1_11_1 = "999";

        }
        if (ed_C1_11_2.getText().toString().trim().length() > 0) {
            C1_11_2 = ed_C1_11_2.getText().toString().trim();

        } else {

            C1_11_2 = "999";

        }

        if (ed_C1_11_3.getText().toString().trim().length() > 0) {
            C1_11_3 = ed_C1_11_3.getText().toString().trim();
        } else {
            C1_11_3 = "999";
        }
        if (ed_C1_11_4.getText().toString().trim().length() > 0) {
            C1_11_4 = ed_C1_11_4.getText().toString().trim();
        } else {
            C1_11_4 = "999";
        }

        if (ed_C1_12_1.getText().toString().trim().length() > 0) {
            C1_12_1 = ed_C1_12_1.getText().toString().trim();

        } else {

            C1_12_1 = "999";

        }
        if (ed_C1_12_2.getText().toString().trim().length() > 0) {
            C1_12_2 = ed_C1_12_2.getText().toString().trim();

        } else {

            C1_12_2 = "999";

        }

        if (ed_C1_12_3.getText().toString().trim().length() > 0) {
            C1_12_3 = ed_C1_12_3.getText().toString().trim();
        } else {
            C1_12_3 = "999";
        }
        if (ed_C1_12_4.getText().toString().trim().length() > 0) {
            C1_12_4 = ed_C1_12_4.getText().toString().trim();
        } else {
            C1_12_4 = "999";
        }

        if (ed_C1_13_1.getText().toString().trim().length() > 0) {
            C1_13_1 = ed_C1_13_1.getText().toString().trim();

        } else {

            C1_13_1 = "999";

        }
        if (ed_C1_13_2.getText().toString().trim().length() > 0) {
            C1_13_2 = ed_C1_13_2.getText().toString().trim();

        } else {

            C1_13_2 = "999";

        }

        if (ed_C1_13_3.getText().toString().trim().length() > 0) {
            C1_13_3 = ed_C1_13_3.getText().toString().trim();
        } else {
            C1_13_3 = "999";
        }
        if (ed_C1_13_4.getText().toString().trim().length() > 0) {
            C1_13_4 = ed_C1_13_4.getText().toString().trim();
        } else {
            C1_13_4 = "999";
        }

        if (ed_C1_14_1.getText().toString().trim().length() > 0) {
            C1_14_1 = ed_C1_14_1.getText().toString().trim();

        } else {

            C1_14_1 = "999";

        }
        if (ed_C1_14_2.getText().toString().trim().length() > 0) {
            C1_14_2 = ed_C1_14_2.getText().toString().trim();

        } else {

            C1_14_2 = "999";

        }

        if (ed_C1_14_3.getText().toString().trim().length() > 0) {
            C1_14_3 = ed_C1_14_3.getText().toString().trim();
        } else {
            C1_14_3 = "999";
        }
        if (ed_C1_14_4.getText().toString().trim().length() > 0) {
            C1_14_4 = ed_C1_14_4.getText().toString().trim();
        } else {
            C1_14_4 = "999";
        }

        if (ed_C1_15_1.getText().toString().trim().length() > 0) {
            C1_15_1 = ed_C1_15_1.getText().toString().trim();

        } else {

            C1_15_1 = "999";

        }
        if (ed_C1_15_2.getText().toString().trim().length() > 0) {
            C1_15_2 = ed_C1_15_2.getText().toString().trim();

        } else {

            C1_15_2 = "999";

        }

        if (ed_C1_15_3.getText().toString().trim().length() > 0) {
            C1_15_3 = ed_C1_15_3.getText().toString().trim();
        } else {
            C1_15_3 = "999";
        }
        if (ed_C1_15_4.getText().toString().trim().length() > 0) {
            C1_15_4 = ed_C1_15_4.getText().toString().trim();
        } else {
            C1_15_4 = "999";
        }

        if (ed_C1_16_1.getText().toString().trim().length() > 0) {
            C1_16_1 = ed_C1_16_1.getText().toString().trim();

        } else {

            C1_16_1 = "999";

        }
        if (ed_C1_16_2.getText().toString().trim().length() > 0) {
            C1_16_2 = ed_C1_16_2.getText().toString().trim();

        } else {

            C1_16_2 = "999";

        }

        if (ed_C1_16_3.getText().toString().trim().length() > 0) {
            C1_16_3 = ed_C1_16_3.getText().toString().trim();
        } else {
            C1_16_3 = "999";
        }
        if (ed_C1_16_4.getText().toString().trim().length() > 0) {
            C1_16_4 = ed_C1_16_4.getText().toString().trim();
        } else {
            C1_16_4 = "999";
        }

        if (ed_C1_17_1.getText().toString().trim().length() > 0) {
            C1_17_1 = ed_C1_17_1.getText().toString().trim();

        } else {

            C1_17_1 = "999";

        }
        if (ed_C1_17_2.getText().toString().trim().length() > 0) {
            C1_17_2 = ed_C1_17_2.getText().toString().trim();

        } else {

            C1_17_2 = "999";

        }

        if (ed_C1_17_3.getText().toString().trim().length() > 0) {
            C1_17_3 = ed_C1_17_3.getText().toString().trim();
        } else {
            C1_17_3 = "999";
        }
        if (ed_C1_17_4.getText().toString().trim().length() > 0) {
            C1_17_4 = ed_C1_17_4.getText().toString().trim();
        } else {
            C1_17_4 = "999";
        }

        if (ed_C1_18_1.getText().toString().trim().length() > 0) {
            C1_18_1 = ed_C1_18_1.getText().toString().trim();

        } else {

            C1_18_1 = "999";

        }
        if (ed_C1_18_2.getText().toString().trim().length() > 0) {
            C1_18_2 = ed_C1_18_2.getText().toString().trim();

        } else {

            C1_18_2 = "999";

        }

        if (ed_C1_18_3.getText().toString().trim().length() > 0) {
            C1_18_3 = ed_C1_18_3.getText().toString().trim();
        } else {
            C1_18_3 = "999";
        }
        if (ed_C1_18_4.getText().toString().trim().length() > 0) {
            C1_18_4 = ed_C1_18_4.getText().toString().trim();
        } else {
            C1_18_4 = "999";
        }

        if (ed_C1_19_1.getText().toString().trim().length() > 0) {
            C1_19_1 = ed_C1_19_1.getText().toString().trim();

        } else {

            C1_19_1 = "999";

        }
        if (ed_C1_19_2.getText().toString().trim().length() > 0) {
            C1_19_2 = ed_C1_19_2.getText().toString().trim();

        } else {

            C1_19_2 = "999";

        }

        if (ed_C1_19_3.getText().toString().trim().length() > 0) {
            C1_19_3 = ed_C1_19_3.getText().toString().trim();
        } else {
            C1_19_3 = "999";
        }
        if (ed_C1_19_4.getText().toString().trim().length() > 0) {
            C1_19_4 = ed_C1_19_4.getText().toString().trim();
        } else {
            C1_19_4 = "999";
        }

        if (ed_C1_20_1.getText().toString().trim().length() > 0) {
            C1_20_1 = ed_C1_20_1.getText().toString().trim();

        } else {

            C1_20_1 = "999";

        }
        if (ed_C1_20_2.getText().toString().trim().length() > 0) {
            C1_20_2 = ed_C1_20_2.getText().toString().trim();

        } else {

            C1_20_2 = "999";

        }

        if (ed_C1_20_3.getText().toString().trim().length() > 0) {
            C1_20_3 = ed_C1_20_3.getText().toString().trim();
        } else {
            C1_20_3 = "999";
        }
        if (ed_C1_20_4.getText().toString().trim().length() > 0) {
            C1_20_4 = ed_C1_20_4.getText().toString().trim();
        } else {
            C1_20_4 = "999";
        }

        if (ed_C1_21_1.getText().toString().trim().length() > 0) {
            C1_21_1 = ed_C1_21_1.getText().toString().trim();

        } else {

            C1_21_1 = "999";

        }
        if (ed_C1_21_2.getText().toString().trim().length() > 0) {
            C1_21_2 = ed_C1_21_2.getText().toString().trim();

        } else {

            C1_21_2 = "999";

        }

        if (ed_C1_21_3.getText().toString().trim().length() > 0) {
            C1_21_3 = ed_C1_21_3.getText().toString().trim();
        } else {
            C1_21_3 = "999";
        }
        if (ed_C1_21_4.getText().toString().trim().length() > 0) {
            C1_21_4 = ed_C1_21_4.getText().toString().trim();
        } else {
            C1_21_4 = "999";
        }

        if (ed_C1_22_1.getText().toString().trim().length() > 0) {
            C1_22_1 = ed_C1_22_1.getText().toString().trim();

        } else {

            C1_22_1 = "999";

        }
        if (ed_C1_22_2.getText().toString().trim().length() > 0) {
            C1_22_2 = ed_C1_22_2.getText().toString().trim();

        } else {

            C1_22_2 = "999";

        }

        if (ed_C1_22_3.getText().toString().trim().length() > 0) {
            C1_22_3 = ed_C1_22_3.getText().toString().trim();
        } else {
            C1_22_3 = "999";
        }
        if (ed_C1_22_4.getText().toString().trim().length() > 0) {
            C1_22_4 = ed_C1_22_4.getText().toString().trim();
        } else {
            C1_22_4 = "999";
        }

        if (ed_C1_23_1.getText().toString().trim().length() > 0) {
            C1_23_1 = ed_C1_23_1.getText().toString().trim();

        } else {

            C1_23_1 = "999";

        }
        if (ed_C1_23_2.getText().toString().trim().length() > 0) {
            C1_23_2 = ed_C1_23_2.getText().toString().trim();

        } else {

            C1_23_2 = "999";

        }

        if (ed_C1_23_3.getText().toString().trim().length() > 0) {
            C1_23_3 = ed_C1_23_3.getText().toString().trim();
        } else {
            C1_23_3 = "999";
        }
        if (ed_C1_23_4.getText().toString().trim().length() > 0) {
            C1_23_4 = ed_C1_23_4.getText().toString().trim();
        } else {
            C1_23_4 = "999";
        }

        if (ed_C1_24_1.getText().toString().trim().length() > 0) {
            C1_24_1 = ed_C1_24_1.getText().toString().trim();

        } else {

            C1_24_1 = "999";

        }
        if (ed_C1_24_2.getText().toString().trim().length() > 0) {
            C1_24_2 = ed_C1_24_2.getText().toString().trim();

        } else {

            C1_24_2 = "999";

        }

        if (ed_C1_24_3.getText().toString().trim().length() > 0) {
            C1_24_3 = ed_C1_24_3.getText().toString().trim();
        } else {
            C1_24_3 = "999";
        }
        if (ed_C1_24_4.getText().toString().trim().length() > 0) {
            C1_24_4 = ed_C1_24_4.getText().toString().trim();
        } else {
            C1_24_4 = "999";
        }

        if (ed_C1_25_1.getText().toString().trim().length() > 0) {
            C1_25_1 = ed_C1_25_1.getText().toString().trim();

        } else {

            C1_25_1 = "999";

        }
        if (ed_C1_25_2.getText().toString().trim().length() > 0) {
            C1_25_2 = ed_C1_25_2.getText().toString().trim();

        } else {

            C1_25_2 = "999";

        }

        if (ed_C1_25_3.getText().toString().trim().length() > 0) {
            C1_25_3 = ed_C1_25_3.getText().toString().trim();
        } else {
            C1_25_3 = "999";
        }
        if (ed_C1_25_4.getText().toString().trim().length() > 0) {
            C1_25_4 = ed_C1_25_4.getText().toString().trim();
        } else {
            C1_25_4 = "999";
        }

        if (ed_C1_26_1.getText().toString().trim().length() > 0) {
            C1_26_1 = ed_C1_26_1.getText().toString().trim();

        } else {

            C1_26_1 = "999";

        }
        if (ed_C1_26_2.getText().toString().trim().length() > 0) {
            C1_26_2 = ed_C1_26_2.getText().toString().trim();

        } else {

            C1_26_2 = "999";

        }

        if (ed_C1_26_3.getText().toString().trim().length() > 0) {
            C1_26_3 = ed_C1_26_3.getText().toString().trim();
        } else {
            C1_26_3 = "999";
        }
        if (ed_C1_26_4.getText().toString().trim().length() > 0) {
            C1_26_4 = ed_C1_26_4.getText().toString().trim();
        } else {
            C1_26_4 = "999";
        }

        if (ed_C1_27_1.getText().toString().trim().length() > 0) {
            C1_27_1 = ed_C1_27_1.getText().toString().trim();

        } else {

            C1_27_1 = "999";

        }
        if (ed_C1_27_2.getText().toString().trim().length() > 0) {
            C1_27_2 = ed_C1_27_2.getText().toString().trim();

        } else {

            C1_27_2 = "999";

        }

        if (ed_C1_27_3.getText().toString().trim().length() > 0) {
            C1_27_3 = ed_C1_27_3.getText().toString().trim();
        } else {
            C1_27_3 = "999";
        }
        if (ed_C1_27_4.getText().toString().trim().length() > 0) {
            C1_27_4 = ed_C1_27_4.getText().toString().trim();
        } else {
            C1_27_4 = "999";
        }

        if (ed_C1_28_1.getText().toString().trim().length() > 0) {
            C1_28_1 = ed_C1_28_1.getText().toString().trim();

        } else {

            C1_28_1 = "999";

        }
        if (ed_C1_28_2.getText().toString().trim().length() > 0) {
            C1_28_2 = ed_C1_28_2.getText().toString().trim();

        } else {

            C1_28_2 = "999";

        }

        if (ed_C1_28_3.getText().toString().trim().length() > 0) {
            C1_28_3 = ed_C1_28_3.getText().toString().trim();
        } else {
            C1_28_3 = "999";
        }
        if (ed_C1_28_4.getText().toString().trim().length() > 0) {
            C1_28_4 = ed_C1_28_4.getText().toString().trim();
        } else {
            C1_28_4 = "999";
        }

        if (ed_C1_29_1.getText().toString().trim().length() > 0) {
            C1_29_1 = ed_C1_29_1.getText().toString().trim();

        } else {

            C1_29_1 = "999";

        }
        if (ed_C1_29_2.getText().toString().trim().length() > 0) {
            C1_29_2 = ed_C1_29_2.getText().toString().trim();

        } else {

            C1_29_2 = "999";

        }

        if (ed_C1_29_3.getText().toString().trim().length() > 0) {
            C1_29_3 = ed_C1_29_3.getText().toString().trim();
        } else {
            C1_29_3 = "999";
        }
        if (ed_C1_29_4.getText().toString().trim().length() > 0) {
            C1_29_4 = ed_C1_29_4.getText().toString().trim();
        } else {
            C1_29_4 = "999";
        }

        if (ed_C1_30_1.getText().toString().trim().length() > 0) {
            C1_30_1 = ed_C1_30_1.getText().toString().trim();

        } else {

            C1_30_1 = "999";

        }
        if (ed_C1_30_2.getText().toString().trim().length() > 0) {
            C1_30_2 = ed_C1_30_2.getText().toString().trim();

        } else {

            C1_30_2 = "999";

        }

        if (ed_C1_30_3.getText().toString().trim().length() > 0) {
            C1_30_3 = ed_C1_30_3.getText().toString().trim();
        } else {
            C1_30_3 = "999";
        }
        if (ed_C1_30_4.getText().toString().trim().length() > 0) {
            C1_30_4 = ed_C1_30_4.getText().toString().trim();
        } else {
            C1_30_4 = "999";
        }

        if (ed_C1_31_1.getText().toString().trim().length() > 0) {
            C1_31_1 = ed_C1_31_1.getText().toString().trim();

        } else {

            C1_31_1 = "999";

        }
        if (ed_C1_31_2.getText().toString().trim().length() > 0) {
            C1_31_2 = ed_C1_31_2.getText().toString().trim();

        } else {

            C1_31_2 = "999";

        }

        if (ed_C1_31_3.getText().toString().trim().length() > 0) {
            C1_31_3 = ed_C1_31_3.getText().toString().trim();
        } else {
            C1_31_3 = "999";
        }
        if (ed_C1_31_4.getText().toString().trim().length() > 0) {
            C1_31_4 = ed_C1_31_4.getText().toString().trim();
        } else {
            C1_31_4 = "999";
        }

        if (ed_C1_32_1.getText().toString().trim().length() > 0) {
            C1_32_1 = ed_C1_32_1.getText().toString().trim();

        } else {

            C1_32_1 = "999";

        }
        if (ed_C1_32_2.getText().toString().trim().length() > 0) {
            C1_32_2 = ed_C1_32_2.getText().toString().trim();

        } else {

            C1_32_2 = "999";

        }

        if (ed_C1_32_3.getText().toString().trim().length() > 0) {
            C1_32_3 = ed_C1_32_3.getText().toString().trim();
        } else {
            C1_32_3 = "999";
        }
        if (ed_C1_32_4.getText().toString().trim().length() > 0) {
            C1_32_4 = ed_C1_32_4.getText().toString().trim();
        } else {
            C1_32_4 = "999";
        }

        if (ed_C1_33_1.getText().toString().trim().length() > 0) {
            C1_33_1 = ed_C1_33_1.getText().toString().trim();

        } else {

            C1_33_1 = "999";

        }
        if (ed_C1_33_2.getText().toString().trim().length() > 0) {
            C1_33_2 = ed_C1_33_2.getText().toString().trim();

        } else {

            C1_33_2 = "999";

        }

        if (ed_C1_33_3.getText().toString().trim().length() > 0) {
            C1_33_3 = ed_C1_33_3.getText().toString().trim();
        } else {
            C1_33_3 = "999";
        }
        if (ed_C1_33_4.getText().toString().trim().length() > 0) {
            C1_33_4 = ed_C1_33_4.getText().toString().trim();
        } else {
            C1_33_4 = "999";
        }

        if (ed_C1_34_1.getText().toString().trim().length() > 0) {
            C1_34_1 = ed_C1_34_1.getText().toString().trim();

        } else {

            C1_34_1 = "999";

        }
        if (ed_C1_34_2.getText().toString().trim().length() > 0) {
            C1_34_2 = ed_C1_34_2.getText().toString().trim();

        } else {

            C1_34_2 = "999";

        }

        if (ed_C1_34_3.getText().toString().trim().length() > 0) {
            C1_34_3 = ed_C1_34_3.getText().toString().trim();
        } else {
            C1_34_3 = "999";
        }
        if (ed_C1_34_4.getText().toString().trim().length() > 0) {
            C1_34_4 = ed_C1_34_4.getText().toString().trim();
        } else {
            C1_34_4 = "999";
        }

        if (ed_C1_35_1.getText().toString().trim().length() > 0) {
            C1_35_1 = ed_C1_35_1.getText().toString().trim();

        } else {

            C1_35_1 = "999";

        }
        if (ed_C1_35_2.getText().toString().trim().length() > 0) {
            C1_35_2 = ed_C1_35_2.getText().toString().trim();

        } else {

            C1_35_2 = "999";

        }

        if (ed_C1_35_3.getText().toString().trim().length() > 0) {
            C1_35_3 = ed_C1_35_3.getText().toString().trim();
        } else {
            C1_35_3 = "999";
        }
        if (ed_C1_35_4.getText().toString().trim().length() > 0) {
            C1_35_4 = ed_C1_35_4.getText().toString().trim();
        } else {
            C1_35_4 = "999";
        }

        if (ed_C1_36_1.getText().toString().trim().length() > 0) {
            C1_36_1 = ed_C1_36_1.getText().toString().trim();

        } else {

            C1_36_1 = "999";

        }
        if (ed_C1_36_2.getText().toString().trim().length() > 0) {
            C1_36_2 = ed_C1_36_2.getText().toString().trim();

        } else {

            C1_36_2 = "999";

        }

        if (ed_C1_36_3.getText().toString().trim().length() > 0) {
            C1_36_3 = ed_C1_36_3.getText().toString().trim();
        } else {
            C1_36_3 = "999";
        }
        if (ed_C1_36_4.getText().toString().trim().length() > 0) {
            C1_36_4 = ed_C1_36_4.getText().toString().trim();
        } else {
            C1_36_4 = "999";
        }

        if (ed_C1_37_1.getText().toString().trim().length() > 0) {
            C1_37_1 = ed_C1_37_1.getText().toString().trim();

        } else {
            C1_37_1 = "999";
        }
        if (ed_C1_37_2.getText().toString().trim().length() > 0) {
            C1_37_2 = ed_C1_37_2.getText().toString().trim();

        } else {

            C1_37_2 = "999";

        }

        if (ed_C1_37_3.getText().toString().trim().length() > 0) {
            C1_37_3 = ed_C1_37_3.getText().toString().trim();
        } else {
            C1_37_3 = "999";
        }
        if (ed_C1_37_4.getText().toString().trim().length() > 0) {
            C1_37_4 = ed_C1_37_4.getText().toString().trim();
        } else {
            C1_37_4 = "999";
        }


        if (ed_C2_1.getText().toString().trim().length() > 0) {
            C2_1 = ed_C2_1.getText().toString().trim();
        } else {
            C2_1 = "999";
        }


        if (ed_C2_2.getText().toString().trim().length() > 0) {
            C2_2 = ed_C2_2.getText().toString().trim();
        } else {
            C2_2 = "999";
        }


        if (ed_C2_3.getText().toString().trim().length() > 0) {
            C2_3 = ed_C2_3.getText().toString().trim();
        } else {
            C2_3 = "999";
        }


        if (ed_C2_4.getText().toString().trim().length() > 0) {
            C2_4 = ed_C2_4.getText().toString().trim();
        } else {
            C2_4 = "999";
        }


        if (ed_C2_5.getText().toString().trim().length() > 0) {
            C2_5 = ed_C2_5.getText().toString().trim();
        } else {
            C2_5 = "999";
        }


        if (ed_C2_6.getText().toString().trim().length() > 0) {
            C2_6 = ed_C2_6.getText().toString().trim();
        } else {
            C2_6 = "999";
        }


        if (ed_C2_7.getText().toString().trim().length() > 0) {
            C2_7 = ed_C2_7.getText().toString().trim();
        } else {
            C2_7 = "999";
        }


        if (ed_C2_8.getText().toString().trim().length() > 0) {
            C2_8 = ed_C2_8.getText().toString().trim();
        } else {
            C2_8 = "999";
        }


        if (ed_C2_9.getText().toString().trim().length() > 0) {
            C2_9 = ed_C2_9.getText().toString().trim();
        } else {
            C2_9 = "999";
        }

        if (ed_C2_10.getText().toString().trim().length() > 0) {
            C2_10 = ed_C2_10.getText().toString().trim();
        } else {
            C2_10 = "999";
        }


        if (ed_C2_11.getText().toString().trim().length() > 0) {
            C2_11 = ed_C2_11.getText().toString().trim();
        } else {
            C2_11 = "999";
        }


        if (R_C2_12_1.isChecked()) {
            C2_12 = "1";
        } else if (R_C2_12_2.isChecked()) {
            C2_12 = "2";
        } else if (R_C2_12_3.isChecked()) {
            C2_12 = "3";
        } else if (R_C2_12_4.isChecked()) {
            C2_12 = "4";
        } else if (R_C2_12_5.isChecked()) {
            C2_12 = "5";
        } else if (R_C2_12_6.isChecked()) {
            C2_12 = "6";
        } else if (R_C2_12_7.isChecked()) {
            C2_12 = "7";
        } else {
            C2_12 = "999";
        }


        if (R_C2_13_1.isChecked()) {
            C2_13 = "1";
        } else if (R_C2_13_2.isChecked()) {
            C2_13 = "2";
        } else if (R_C2_13_3.isChecked()) {
            C2_13 = "3";
        } else if (R_C2_13_4.isChecked()) {
            C2_13 = "4";
        } else if (R_C2_13_5.isChecked()) {
            C2_13 = "5";
        } else if (R_C2_13_6.isChecked()) {
            C2_13 = "6";
        } else if (R_C2_13_7.isChecked()) {
            C2_13 = "7";
        } else {
            C2_13 = "999";
        }


        if (R_C2_14_1.isChecked()) {
            C2_14 = "1";
        } else if (R_C2_14_2.isChecked()) {
            C2_14 = "2";
        } else if (R_C2_14_3.isChecked()) {
            C2_14 = "3";
        } else if (R_C2_14_4.isChecked()) {
            C2_14 = "4";
        } else if (R_C2_14_5.isChecked()) {
            C2_14 = "5";
        } else if (R_C2_14_6.isChecked()) {
            C2_14 = "6";
        } else if (R_C2_14_7.isChecked()) {
            C2_14 = "7";
        } else {
            C2_14 = "999";
        }


        if (R_C2_15_1.isChecked()) {
            C2_15 = "1";
        } else if (R_C2_15_2.isChecked()) {
            C2_15 = "2";
        } else if (R_C2_15_3.isChecked()) {
            C2_15 = "3";
        } else if (R_C2_15_4.isChecked()) {
            C2_15 = "4";
        } else if (R_C2_15_5.isChecked()) {
            C2_15 = "5";
        } else if (R_C2_15_6.isChecked()) {
            C2_15 = "6";
        } else if (R_C2_15_7.isChecked()) {
            C2_15 = "7";
        } else {
            C2_15 = "999";
        }


        if (R_C2_16_1.isChecked()) {
            C2_16 = "1";
        } else if (R_C2_16_2.isChecked()) {
            C2_16 = "2";
        } else if (R_C2_16_3.isChecked()) {
            C2_16 = "3";
        } else if (R_C2_16_4.isChecked()) {
            C2_16 = "4";
        } else if (R_C2_16_5.isChecked()) {
            C2_16 = "5";
        } else if (R_C2_16_6.isChecked()) {
            C2_16 = "6";
        } else if (R_C2_16_7.isChecked()) {
            C2_16 = "7";
        } else {
            C2_16 = "999";
        }


        if (R_C2_17_1.isChecked()) {
            C2_17 = "1";
        } else if (R_C2_17_2.isChecked()) {
            C2_17 = "2";
        } else if (R_C2_17_3.isChecked()) {
            C2_17 = "3";
        } else if (R_C2_17_4.isChecked()) {
            C2_17 = "4";
        } else if (R_C2_17_5.isChecked()) {
            C2_17 = "5";
        } else if (R_C2_17_6.isChecked()) {
            C2_17 = "6";
        } else if (R_C2_17_7.isChecked()) {
            C2_17 = "7";
        } else {
            C2_17 = "999";
        }


        if (R_C2_18_1.isChecked()) {
            C2_18 = "1";
        } else if (R_C2_18_2.isChecked()) {
            C2_18 = "2";
        } else if (R_C2_18_3.isChecked()) {
            C2_18 = "3";
        } else if (R_C2_18_4.isChecked()) {
            C2_18 = "4";
        } else if (R_C2_18_5.isChecked()) {
            C2_18 = "5";
        } else if (R_C2_18_6.isChecked()) {
            C2_18 = "6";
        } else if (R_C2_18_7.isChecked()) {
            C2_18 = "7";
        } else {
            C2_18 = "999";
        }

        if (R_C2_19_1.isChecked()) {
            C2_19 = "1";
        } else if (R_C2_19_2.isChecked()) {
            C2_19 = "2";
        } else if (R_C2_19_3.isChecked()) {
            C2_19 = "3";
        } else if (R_C2_19_4.isChecked()) {
            C2_19 = "4";
        } else if (R_C2_19_5.isChecked()) {
            C2_19 = "5";
        } else if (R_C2_19_6.isChecked()) {
            C2_19 = "6";
        } else if (R_C2_19_7.isChecked()) {
            C2_19 = "7";
        } else {
            C2_19 = "999";

        }


        if (R_C2_20_1.isChecked()) {
            C2_20 = "1";
        } else if (R_C2_20_2.isChecked()) {
            C2_20 = "2";
        } else if (R_C2_20_3.isChecked()) {
            C2_20 = "3";
        } else if (R_C2_20_4.isChecked()) {
            C2_20 = "4";
        } else if (R_C2_20_5.isChecked()) {
            C2_20 = "5";
        } else if (R_C2_20_6.isChecked()) {
            C2_20 = "6";
        } else if (R_C2_20_7.isChecked()) {
            C2_20 = "7";
        } else {
            C2_20 = "999";

        }

        if (R_C2_21_1.isChecked()) {
            C2_21 = "1";
        } else if (R_C2_21_2.isChecked()) {
            C2_21 = "2";
        } else if (R_C2_21_3.isChecked()) {
            C2_21 = "3";
        } else if (R_C2_21_4.isChecked()) {
            C2_21 = "4";
        } else if (R_C2_21_5.isChecked()) {
            C2_21 = "5";
        } else if (R_C2_21_6.isChecked()) {
            C2_21 = "6";
        } else if (R_C2_21_7.isChecked()) {
            C2_21 = "7";
        } else {
            C2_21 = "999";

        }


        if (R_C2_22_1.isChecked()) {
            C2_22 = "1";
        } else if (R_C2_22_2.isChecked()) {
            C2_22 = "2";
        } else if (R_C2_22_3.isChecked()) {
            C2_22 = "3";
        } else if (R_C2_22_4.isChecked()) {
            C2_22 = "4";
        } else if (R_C2_22_5.isChecked()) {
            C2_22 = "5";
        } else if (R_C2_22_6.isChecked()) {
            C2_22 = "6";
        } else if (R_C2_22_7.isChecked()) {
            C2_22 = "7";
        } else {
            C2_22 = "999";

        }


        if (R_C2_23_1.isChecked()) {
            C2_23 = "1";
        } else if (R_C2_23_2.isChecked()) {
            C2_23 = "2";
        } else if (R_C2_23_3.isChecked()) {
            C2_23 = "3";
        } else if (R_C2_23_4.isChecked()) {
            C2_23 = "4";
        } else if (R_C2_23_5.isChecked()) {
            C2_23 = "5";
        } else if (R_C2_23_6.isChecked()) {
            C2_23 = "6";
        } else if (R_C2_23_7.isChecked()) {
            C2_23 = "7";
        } else {
            C2_23 = "999";

        }


        if (R_C2_24_1.isChecked()) {
            C2_24 = "1";
        } else if (R_C2_24_2.isChecked()) {
            C2_24 = "2";
        } else if (R_C2_24_3.isChecked()) {
            C2_24 = "3";
        } else if (R_C2_24_4.isChecked()) {
            C2_24 = "4";
        } else if (R_C2_24_5.isChecked()) {
            C2_24 = "5";
        } else if (R_C2_24_6.isChecked()) {
            C2_24 = "6";
        } else if (R_C2_24_7.isChecked()) {
            C2_24 = "7";
        } else {
            C2_24 = "999";

        }


        if (R_C2_25_1.isChecked()) {
            C2_25 = "1";
        } else if (R_C2_25_2.isChecked()) {
            C2_25 = "2";
        } else if (R_C2_25_3.isChecked()) {
            C2_25 = "3";
        } else if (R_C2_25_4.isChecked()) {
            C2_25 = "4";
        } else if (R_C2_25_5.isChecked()) {
            C2_25 = "5";
        } else if (R_C2_25_6.isChecked()) {
            C2_25 = "6";
        } else if (R_C2_25_7.isChecked()) {
            C2_25 = "7";
        } else {
            C2_25 = "999";

        }


        if (R_C2_26_1.isChecked()) {
            C2_26 = "1";
        } else if (R_C2_26_2.isChecked()) {
            C2_26 = "2";
        } else if (R_C2_26_3.isChecked()) {
            C2_26 = "3";
        } else if (R_C2_26_4.isChecked()) {
            C2_26 = "4";
        } else if (R_C2_26_5.isChecked()) {
            C2_26 = "5";
        } else if (R_C2_26_6.isChecked()) {
            C2_26 = "6";
        } else if (R_C2_26_7.isChecked()) {
            C2_26 = "7";
        } else {
            C2_26 = "999";

        }


        if (R_C2_27_1.isChecked()) {
            C2_27 = "1";
        } else if (R_C2_27_2.isChecked()) {
            C2_27 = "2";
        } else if (R_C2_27_3.isChecked()) {
            C2_27 = "3";
        } else if (R_C2_27_4.isChecked()) {
            C2_27 = "4";
        } else if (R_C2_27_5.isChecked()) {
            C2_27 = "5";
        } else if (R_C2_27_6.isChecked()) {
            C2_27 = "6";
        } else if (R_C2_27_7.isChecked()) {
            C2_27 = "7";
        } else {
            C2_27 = "999";

        }


        if (R_C2_28_1.isChecked()) {
            C2_28 = "1";
        } else if (R_C2_28_2.isChecked()) {
            C2_28 = "2";
        } else if (R_C2_28_3.isChecked()) {
            C2_28 = "3";
        } else if (R_C2_28_4.isChecked()) {
            C2_28 = "4";
        } else if (R_C2_28_5.isChecked()) {
            C2_28 = "5";
        } else if (R_C2_28_6.isChecked()) {
            C2_28 = "6";
        } else if (R_C2_28_7.isChecked()) {
            C2_28 = "7";
        } else {
            C2_28 = "999";

        }

        if (R_C2_29_1.isChecked()) {
            C2_29 = "1";
        } else if (R_C2_29_2.isChecked()) {
            C2_29 = "2";
        } else if (R_C2_29_3.isChecked()) {
            C2_29 = "3";
        } else if (R_C2_29_4.isChecked()) {
            C2_29 = "4";
        } else if (R_C2_29_5.isChecked()) {
            C2_29 = "5";
        } else if (R_C2_29_6.isChecked()) {
            C2_29 = "6";
        } else if (R_C2_29_7.isChecked()) {
            C2_29 = "7";
        } else {
            C2_29 = "999";

        }

        if (R_C2_30_1.isChecked()) {
            C2_30 = "1";
        } else if (R_C2_30_2.isChecked()) {
            C2_30 = "2";
        } else if (R_C2_30_3.isChecked()) {
            C2_30 = "3";
        } else if (R_C2_30_4.isChecked()) {
            C2_30 = "4";
        } else if (R_C2_30_5.isChecked()) {
            C2_30 = "5";
        } else if (R_C2_30_6.isChecked()) {
            C2_30 = "6";
        } else if (R_C2_30_7.isChecked()) {
            C2_30 = "7";
        } else {
            C2_30 = "999";

        }


        if (R_C2_31_1.isChecked()) {
            C2_31 = "1";
        } else if (R_C2_31_2.isChecked()) {
            C2_31 = "2";
        } else if (R_C2_31_3.isChecked()) {
            C2_31 = "3";
        } else if (R_C2_31_4.isChecked()) {
            C2_31 = "4";
        } else if (R_C2_31_5.isChecked()) {
            C2_31 = "5";
        } else if (R_C2_31_6.isChecked()) {
            C2_31 = "6";
        } else if (R_C2_31_7.isChecked()) {
            C2_31 = "7";
        } else {
            C2_31 = "999";

        }

        if (R_C2_32_1.isChecked()) {
            C2_32 = "1";
        } else if (R_C2_32_2.isChecked()) {
            C2_32 = "2";
        } else if (R_C2_32_3.isChecked()) {
            C2_32 = "3";
        } else if (R_C2_32_4.isChecked()) {
            C2_32 = "4";
        } else if (R_C2_32_5.isChecked()) {
            C2_32 = "5";
        } else if (R_C2_32_6.isChecked()) {
            C2_32 = "6";
        } else if (R_C2_32_7.isChecked()) {
            C2_32 = "7";
        } else {
            C2_32 = "999";

        }


        if (R_C2_33_1.isChecked()) {
            C2_33 = "1";
        } else if (R_C2_33_2.isChecked()) {
            C2_33 = "2";
        } else if (R_C2_33_3.isChecked()) {
            C2_33 = "3";
        } else if (R_C2_33_4.isChecked()) {
            C2_33 = "4";
        } else if (R_C2_33_5.isChecked()) {
            C2_33 = "5";
        } else if (R_C2_33_6.isChecked()) {
            C2_33 = "6";
        } else if (R_C2_33_7.isChecked()) {
            C2_33 = "7";
        } else {
            C2_33 = "999";

        }


        if (R_C2_34_1.isChecked()) {
            C2_34 = "1";
        } else if (R_C2_34_2.isChecked()) {
            C2_34 = "2";
        } else if (R_C2_34_3.isChecked()) {
            C2_34 = "3";
        } else if (R_C2_34_4.isChecked()) {
            C2_34 = "4";
        } else if (R_C2_34_5.isChecked()) {
            C2_34 = "5";
        } else if (R_C2_34_6.isChecked()) {
            C2_34 = "6";
        } else if (R_C2_34_7.isChecked()) {
            C2_34 = "7";
        } else {
            C2_34 = "999";

        }


        if (R_C2_35_1.isChecked()) {
            C2_35 = "1";
        } else if (R_C2_35_2.isChecked()) {
            C2_35 = "2";
        } else if (R_C2_35_3.isChecked()) {
            C2_35 = "3";
        } else if (R_C2_35_4.isChecked()) {
            C2_35 = "4";
        } else if (R_C2_35_5.isChecked()) {
            C2_35 = "5";
        } else if (R_C2_35_6.isChecked()) {
            C2_35 = "6";
        } else if (R_C2_35_7.isChecked()) {
            C2_35 = "7";
        } else {
            C2_35 = "999";

        }

        if (R_C2_36_1.isChecked()) {
            C2_36 = "1";
        } else if (R_C2_36_2.isChecked()) {
            C2_36 = "2";
        } else if (R_C2_36_3.isChecked()) {
            C2_36 = "3";
        } else if (R_C2_36_4.isChecked()) {
            C2_36 = "4";
        } else if (R_C2_36_5.isChecked()) {
            C2_36 = "5";
        } else if (R_C2_36_6.isChecked()) {
            C2_36 = "6";
        } else if (R_C2_36_7.isChecked()) {
            C2_36 = "7";
        } else {
            C2_36 = "999";

        }


        if (R_C2_37_1.isChecked()) {
            C2_37 = "1";
        } else if (R_C2_37_2.isChecked()) {
            C2_37 = "2";
        } else if (R_C2_37_3.isChecked()) {
            C2_37 = "3";
        } else if (R_C2_37_4.isChecked()) {
            C2_37 = "4";
        } else if (R_C2_37_5.isChecked()) {
            C2_37 = "5";
        } else if (R_C2_37_6.isChecked()) {
            C2_37 = "6";
        } else if (R_C2_37_7.isChecked()) {
            C2_37 = "7";
        } else {
            C2_37 = "999";

        }


        if (R_C2_38_1.isChecked()) {
            C2_38 = "1";
        } else if (R_C2_38_2.isChecked()) {
            C2_38 = "2";
        } else if (R_C2_38_3.isChecked()) {
            C2_38 = "3";
        } else if (R_C2_38_4.isChecked()) {
            C2_38 = "4";
        } else if (R_C2_38_5.isChecked()) {
            C2_38 = "5";
        } else if (R_C2_38_6.isChecked()) {
            C2_38 = "6";
        } else if (R_C2_38_7.isChecked()) {
            C2_38 = "7";
        } else {
            C2_38 = "999";

        }


        if (R_C2_39_1.isChecked()) {
            C2_39 = "1";
        } else if (R_C2_39_2.isChecked()) {
            C2_39 = "2";
        } else if (R_C2_39_3.isChecked()) {
            C2_39 = "3";
        } else if (R_C2_39_4.isChecked()) {
            C2_39 = "4";
        } else if (R_C2_39_5.isChecked()) {
            C2_39 = "5";
        } else if (R_C2_39_6.isChecked()) {
            C2_39 = "6";
        } else if (R_C2_39_7.isChecked()) {
            C2_39 = "7";
        } else {
            C2_39 = "999";

        }

        if (R_C2_40_1.isChecked()) {
            C2_40 = "1";
        } else if (R_C2_40_2.isChecked()) {
            C2_40 = "2";
        } else if (R_C2_40_3.isChecked()) {
            C2_40 = "3";
        } else if (R_C2_40_4.isChecked()) {
            C2_40 = "4";
        } else if (R_C2_40_5.isChecked()) {
            C2_40 = "5";
        } else if (R_C2_40_6.isChecked()) {
            C2_40 = "6";
        } else if (R_C2_40_7.isChecked()) {
            C2_40 = "7";
        } else {
            C2_40 = "999";

        }


        if (R_C2_41_1.isChecked()) {
            C2_41 = "1";
        } else if (R_C2_41_2.isChecked()) {
            C2_41 = "2";
        } else if (R_C2_41_3.isChecked()) {
            C2_41 = "3";
        } else if (R_C2_41_4.isChecked()) {
            C2_41 = "4";
        } else if (R_C2_41_5.isChecked()) {
            C2_41 = "5";
        } else if (R_C2_41_6.isChecked()) {
            C2_41 = "6";
        } else if (R_C2_41_7.isChecked()) {
            C2_41 = "7";
        } else {
            C2_41 = "999";

        }

        if (R_C2_42_1.isChecked()) {
            C2_42 = "1";
        } else if (R_C2_42_2.isChecked()) {
            C2_42 = "2";
        } else if (R_C2_42_3.isChecked()) {
            C2_42 = "3";
        } else if (R_C2_42_4.isChecked()) {
            C2_42 = "4";
        } else if (R_C2_42_5.isChecked()) {
            C2_42 = "5";
        } else if (R_C2_42_6.isChecked()) {
            C2_42 = "6";
        } else if (R_C2_42_7.isChecked()) {
            C2_42 = "7";
        } else {
            C2_42 = "999";

        }


        if (R_C2_43_1.isChecked()) {
            C2_43 = "1";
        } else if (R_C2_43_2.isChecked()) {
            C2_43 = "2";
        } else if (R_C2_43_3.isChecked()) {
            C2_43 = "3";
        } else if (R_C2_43_4.isChecked()) {
            C2_43 = "4";
        } else if (R_C2_43_5.isChecked()) {
            C2_43 = "5";
        } else if (R_C2_43_6.isChecked()) {
            C2_43 = "6";
        } else if (R_C2_43_7.isChecked()) {
            C2_43 = "7";
        } else {
            C2_43 = "999";

        }

        if (R_C2_44_1.isChecked()) {
            C2_44 = "1";
        } else if (R_C2_44_2.isChecked()) {
            C2_44 = "2";
        } else if (R_C2_44_3.isChecked()) {
            C2_44 = "3";
        } else if (R_C2_44_4.isChecked()) {
            C2_44 = "4";
        } else if (R_C2_44_5.isChecked()) {
            C2_44 = "5";
        } else if (R_C2_44_6.isChecked()) {
            C2_44 = "6";
        } else if (R_C2_44_7.isChecked()) {
            C2_44 = "7";
        } else {
            C2_44 = "999";

        }

        if (R_C2_45_1.isChecked()) {
            C2_45 = "1";
        } else if (R_C2_45_2.isChecked()) {
            C2_45 = "2";
        } else if (R_C2_45_3.isChecked()) {
            C2_45 = "3";
        } else if (R_C2_45_4.isChecked()) {
            C2_45 = "4";
        } else if (R_C2_45_5.isChecked()) {
            C2_45 = "5";
        } else if (R_C2_45_6.isChecked()) {
            C2_45 = "6";
        } else if (R_C2_45_7.isChecked()) {
            C2_45 = "7";
        } else {
            C2_45 = "999";

        }


        if (R_C2_46_1.isChecked()) {
            C2_46 = "1";
        } else if (R_C2_46_2.isChecked()) {
            C2_46 = "2";
        } else if (R_C2_46_3.isChecked()) {
            C2_46 = "3";
        } else if (R_C2_46_4.isChecked()) {
            C2_46 = "4";
        } else if (R_C2_46_5.isChecked()) {
            C2_46 = "5";
        } else if (R_C2_46_6.isChecked()) {
            C2_46 = "6";
        } else if (R_C2_46_7.isChecked()) {
            C2_46 = "7";
        } else {
            C2_46 = "999";

        }


        if (R_C2_47_1.isChecked()) {
            C2_47 = "1";
        } else if (R_C2_47_2.isChecked()) {
            C2_47 = "2";
        } else if (R_C2_47_3.isChecked()) {
            C2_47 = "3";
        } else if (R_C2_47_4.isChecked()) {
            C2_47 = "4";
        } else if (R_C2_47_5.isChecked()) {
            C2_47 = "5";
        } else if (R_C2_47_6.isChecked()) {
            C2_47 = "6";
        } else if (R_C2_47_7.isChecked()) {
            C2_47 = "7";
        } else {
            C2_47 = "999";

        }


        if (R_C2_48_1.isChecked()) {
            C2_48 = "1";
        } else if (R_C2_48_2.isChecked()) {
            C2_48 = "2";
        } else if (R_C2_48_3.isChecked()) {
            C2_48 = "3";
        } else if (R_C2_48_4.isChecked()) {
            C2_48 = "4";
        } else if (R_C2_48_5.isChecked()) {
            C2_48 = "5";
        } else if (R_C2_48_6.isChecked()) {
            C2_48 = "6";
        } else if (R_C2_48_7.isChecked()) {
            C2_48 = "7";
        } else {
            C2_48 = "999";

        }


        if (R_C2_49_1.isChecked()) {
            C2_49 = "1";
        } else if (R_C2_49_2.isChecked()) {
            C2_49 = "2";
        } else if (R_C2_49_3.isChecked()) {
            C2_49 = "3";
        } else if (R_C2_49_4.isChecked()) {
            C2_49 = "4";
        } else if (R_C2_49_5.isChecked()) {
            C2_49 = "5";
        } else if (R_C2_49_6.isChecked()) {
            C2_49 = "6";
        } else if (R_C2_49_7.isChecked()) {
            C2_49 = "7";
        } else {
            C2_49 = "999";

        }

        if (R_C2_50_1.isChecked()) {
            C2_50 = "1";
        } else if (R_C2_50_2.isChecked()) {
            C2_50 = "2";
        } else if (R_C2_50_3.isChecked()) {
            C2_50 = "3";
        } else if (R_C2_50_4.isChecked()) {
            C2_50 = "4";
        } else if (R_C2_50_5.isChecked()) {
            C2_50 = "5";
        } else if (R_C2_50_6.isChecked()) {
            C2_50 = "6";
        } else if (R_C2_50_7.isChecked()) {
            C2_50 = "7";
        } else {
            C2_50 = "999";

        }


        if (R_C2_51_1.isChecked()) {
            C2_51 = "1";
        } else if (R_C2_51_2.isChecked()) {
            C2_51 = "2";
        } else if (R_C2_51_3.isChecked()) {
            C2_51 = "3";
        } else if (R_C2_51_4.isChecked()) {
            C2_51 = "4";
        } else if (R_C2_51_5.isChecked()) {
            C2_51 = "5";
        } else if (R_C2_51_6.isChecked()) {
            C2_51 = "6";
        } else if (R_C2_51_7.isChecked()) {
            C2_51 = "7";
        } else {
            C2_51 = "999";

        }

        if (R_C2_52_1.isChecked()) {
            C2_52 = "1";
        } else if (R_C2_52_2.isChecked()) {
            C2_52 = "2";
        } else if (R_C2_52_3.isChecked()) {
            C2_52 = "3";
        } else if (R_C2_52_4.isChecked()) {
            C2_52 = "4";
        } else if (R_C2_52_5.isChecked()) {
            C2_52 = "5";
        } else if (R_C2_52_6.isChecked()) {
            C2_52 = "6";
        } else if (R_C2_52_7.isChecked()) {
            C2_52 = "7";
        } else {
            C2_52 = "999";

        }

        if (R_C2_53_1.isChecked()) {
            C2_53 = "1";
        } else if (R_C2_53_2.isChecked()) {
            C2_53 = "2";
        } else if (R_C2_53_3.isChecked()) {
            C2_53 = "3";
        } else if (R_C2_53_4.isChecked()) {
            C2_53 = "4";
        } else if (R_C2_53_5.isChecked()) {
            C2_53 = "5";
        } else if (R_C2_53_6.isChecked()) {
            C2_53 = "6";
        } else if (R_C2_53_7.isChecked()) {
            C2_53 = "7";
        } else {
            C2_53 = "999";

        }

        if (R_C2_54_1.isChecked()) {
            C2_54 = "1";
        } else if (R_C2_54_2.isChecked()) {
            C2_54 = "2";
        } else if (R_C2_54_3.isChecked()) {
            C2_54 = "3";
        } else if (R_C2_54_4.isChecked()) {
            C2_54 = "4";
        } else if (R_C2_54_5.isChecked()) {
            C2_54 = "5";
        } else if (R_C2_54_6.isChecked()) {
            C2_54 = "6";
        } else if (R_C2_54_7.isChecked()) {
            C2_54 = "7";
        } else {
            C2_54 = "999";

        }

        if (R_C2_55_1.isChecked()) {
            C2_55 = "1";
        } else if (R_C2_55_2.isChecked()) {
            C2_55 = "2";
        } else if (R_C2_55_3.isChecked()) {
            C2_55 = "3";
        } else if (R_C2_55_4.isChecked()) {
            C2_55 = "4";
        } else if (R_C2_55_5.isChecked()) {
            C2_55 = "5";
        } else if (R_C2_55_6.isChecked()) {
            C2_55 = "6";
        } else if (R_C2_55_7.isChecked()) {
            C2_55 = "7";
        } else {
            C2_55 = "999";

        }

        if (R_C2_56_1.isChecked()) {
            C2_56 = "1";
        } else if (R_C2_56_2.isChecked()) {
            C2_56 = "2";
        } else if (R_C2_56_3.isChecked()) {
            C2_56 = "3";
        } else if (R_C2_56_4.isChecked()) {
            C2_56 = "4";
        } else if (R_C2_56_5.isChecked()) {
            C2_56 = "5";
        } else if (R_C2_56_6.isChecked()) {
            C2_56 = "6";
        } else if (R_C2_56_7.isChecked()) {
            C2_56 = "7";
        } else {
            C2_56 = "999";

        }

        if (R_C2_57_1.isChecked()) {
            C2_57 = "1";
        } else if (R_C2_57_2.isChecked()) {
            C2_57 = "2";
        } else if (R_C2_57_3.isChecked()) {
            C2_57 = "3";
        } else if (R_C2_57_4.isChecked()) {
            C2_57 = "4";
        } else if (R_C2_57_5.isChecked()) {
            C2_57 = "5";
        } else if (R_C2_57_6.isChecked()) {
            C2_57 = "6";
        } else if (R_C2_57_7.isChecked()) {
            C2_57 = "7";
        } else {
            C2_57 = "999";

        }

        if (R_C2_58_1.isChecked()) {
            C2_58 = "1";
        } else if (R_C2_58_2.isChecked()) {
            C2_58 = "2";
        } else if (R_C2_58_3.isChecked()) {
            C2_58 = "3";
        } else if (R_C2_58_4.isChecked()) {
            C2_58 = "4";
        } else if (R_C2_58_5.isChecked()) {
            C2_58 = "5";
        } else if (R_C2_58_6.isChecked()) {
            C2_58 = "6";
        } else if (R_C2_58_7.isChecked()) {
            C2_58 = "7";
        } else {
            C2_58 = "999";

        }

        if (R_C2_59_1.isChecked()) {
            C2_59 = "1";
        } else if (R_C2_59_2.isChecked()) {
            C2_59 = "2";
        } else if (R_C2_59_3.isChecked()) {
            C2_59 = "3";
        } else if (R_C2_59_4.isChecked()) {
            C2_59 = "4";
        } else if (R_C2_59_5.isChecked()) {
            C2_59 = "5";
        } else if (R_C2_59_6.isChecked()) {
            C2_59 = "6";
        } else if (R_C2_59_7.isChecked()) {
            C2_59 = "7";
        } else {
            C2_59 = "999";

        }

        if (R_C2_60_1.isChecked()) {
            C2_60 = "1";
        } else if (R_C2_60_2.isChecked()) {
            C2_60 = "2";
        } else if (R_C2_60_3.isChecked()) {
            C2_60 = "3";
        } else if (R_C2_60_4.isChecked()) {
            C2_60 = "4";
        } else if (R_C2_60_5.isChecked()) {
            C2_60 = "5";
        } else if (R_C2_60_6.isChecked()) {
            C2_60 = "6";
        } else if (R_C2_60_7.isChecked()) {
            C2_60 = "7";
        } else {
            C2_60 = "999";

        }

        if (R_C2_61_1.isChecked()) {
            C2_61 = "1";
        } else if (R_C2_61_2.isChecked()) {
            C2_61 = "2";
        } else if (R_C2_61_3.isChecked()) {
            C2_61 = "3";
        } else if (R_C2_61_4.isChecked()) {
            C2_61 = "4";
        } else if (R_C2_61_5.isChecked()) {
            C2_61 = "5";
        } else if (R_C2_61_6.isChecked()) {
            C2_61 = "6";
        } else if (R_C2_61_7.isChecked()) {
            C2_61 = "7";
        } else {
            C2_61 = "999";

        }

        if (R_C2_62_1.isChecked()) {
            C2_62 = "1";
        } else if (R_C2_62_2.isChecked()) {
            C2_62 = "2";
        } else if (R_C2_62_3.isChecked()) {
            C2_62 = "3";
        } else if (R_C2_62_4.isChecked()) {
            C2_62 = "4";
        } else if (R_C2_62_5.isChecked()) {
            C2_62 = "5";
        } else if (R_C2_62_6.isChecked()) {
            C2_62 = "6";
        } else if (R_C2_62_7.isChecked()) {
            C2_62 = "7";
        } else {
            C2_62 = "999";

        }

        if (R_C2_63_1.isChecked()) {
            C2_63 = "1";
        } else if (R_C2_63_2.isChecked()) {
            C2_63 = "2";
        } else if (R_C2_63_3.isChecked()) {
            C2_63 = "3";
        } else if (R_C2_63_4.isChecked()) {
            C2_63 = "4";
        } else if (R_C2_63_5.isChecked()) {
            C2_63 = "5";
        } else if (R_C2_63_6.isChecked()) {
            C2_63 = "6";
        } else if (R_C2_63_7.isChecked()) {
            C2_63 = "7";
        } else {
            C2_63 = "999";

        }

        if (R_C2_64_1.isChecked()) {
            C2_64 = "1";
        } else if (R_C2_64_2.isChecked()) {
            C2_64 = "2";
        } else if (R_C2_64_3.isChecked()) {
            C2_64 = "3";
        } else if (R_C2_64_4.isChecked()) {
            C2_64 = "4";
        } else if (R_C2_64_5.isChecked()) {
            C2_64 = "5";
        } else if (R_C2_64_6.isChecked()) {
            C2_64 = "6";
        } else if (R_C2_64_7.isChecked()) {
            C2_64 = "7";
        } else {
            C2_64 = "999";

        }

        if (R_C2_65_1.isChecked()) {
            C2_65 = "1";
        } else if (R_C2_65_2.isChecked()) {
            C2_65 = "2";
        } else if (R_C2_65_3.isChecked()) {
            C2_65 = "3";
        } else if (R_C2_65_4.isChecked()) {
            C2_65 = "4";
        } else if (R_C2_65_5.isChecked()) {
            C2_65 = "5";
        } else if (R_C2_65_6.isChecked()) {
            C2_65 = "6";
        } else if (R_C2_65_7.isChecked()) {
            C2_65 = "7";
        } else {
            C2_65 = "999";

        }

        if (R_C2_66_1.isChecked()) {
            C2_66 = "1";
        } else if (R_C2_66_2.isChecked()) {
            C2_66 = "2";
        } else if (R_C2_66_3.isChecked()) {
            C2_66 = "3";
        } else if (R_C2_66_4.isChecked()) {
            C2_66 = "4";
        } else if (R_C2_66_5.isChecked()) {
            C2_66 = "5";
        } else if (R_C2_66_6.isChecked()) {
            C2_66 = "6";
        } else if (R_C2_66_7.isChecked()) {
            C2_66 = "7";
        } else {
            C2_66 = "999";

        }

        if (R_C2_67_1.isChecked()) {
            C2_67 = "1";
        } else if (R_C2_67_2.isChecked()) {
            C2_67 = "2";
        } else if (R_C2_67_3.isChecked()) {
            C2_67 = "3";
        } else if (R_C2_67_4.isChecked()) {
            C2_67 = "4";
        } else if (R_C2_67_5.isChecked()) {
            C2_67 = "5";
        } else if (R_C2_67_6.isChecked()) {
            C2_67 = "6";
        } else if (R_C2_67_7.isChecked()) {
            C2_67 = "7";
        } else {
            C2_67 = "999";

        }

        if (R_C2_68_1.isChecked()) {
            C2_68 = "1";
        } else if (R_C2_68_2.isChecked()) {
            C2_68 = "2";
        } else if (R_C2_68_3.isChecked()) {
            C2_68 = "3";
        } else if (R_C2_68_4.isChecked()) {
            C2_68 = "4";
        } else if (R_C2_68_5.isChecked()) {
            C2_68 = "5";
        } else if (R_C2_68_6.isChecked()) {
            C2_68 = "6";
        } else if (R_C2_68_7.isChecked()) {
            C2_68 = "7";
        } else {
            C2_68 = "999";

        }


        if (R_C2_69_1.isChecked()) {
            C2_69 = "1";
        } else if (R_C2_69_2.isChecked()) {
            C2_69 = "2";
        } else if (R_C2_69_3.isChecked()) {
            C2_69 = "3";
        } else if (R_C2_69_4.isChecked()) {
            C2_69 = "4";
        } else if (R_C2_69_5.isChecked()) {
            C2_69 = "5";
        } else if (R_C2_69_6.isChecked()) {
            C2_69 = "6";
        } else if (R_C2_69_7.isChecked()) {
            C2_69 = "7";
        } else {
            C2_69 = "999";
        }


        if (R_C2_70_1.isChecked()) {
            C2_70 = "1";
        } else if (R_C2_70_2.isChecked()) {
            C2_70 = "2";
        } else if (R_C2_70_3.isChecked()) {
            C2_70 = "3";
        } else if (R_C2_70_4.isChecked()) {
            C2_70 = "4";
        } else if (R_C2_70_5.isChecked()) {
            C2_70 = "5";
        } else if (R_C2_70_6.isChecked()) {

            C2_70 = "6";
        } else if (R_C2_70_7.isChecked()) {

            C2_70 = "7";
        } else {
            C2_70 = "999";
        }


        if (R_C2_71_1.isChecked()) {
            C2_71 = "1";
        } else if (R_C2_71_2.isChecked()) {
            C2_71 = "2";
        } else if (R_C2_71_3.isChecked()) {
            C2_71 = "3";
        } else if (R_C2_71_4.isChecked()) {
            C2_71 = "4";
        } else if (R_C2_71_5.isChecked()) {
            C2_71 = "5";
        } else if (R_C2_71_6.isChecked()) {
            C2_71 = "6";
        } else if (R_C2_71_7.isChecked()) {
            C2_71 = "7";
        } else {
            C2_71 = "999";
        }

        if (R_C2_72_1.isChecked()) {
            C2_72 = "1";
        } else if (R_C2_72_2.isChecked()) {
            C2_72 = "2";
        } else if (R_C2_72_3.isChecked()) {
            C2_72 = "3";
        } else if (R_C2_72_4.isChecked()) {
            C2_72 = "4";
        } else if (R_C2_72_5.isChecked()) {
            C2_72 = "5";
        } else if (R_C2_72_6.isChecked()) {
            C2_72 = "6";
        } else if (R_C2_72_7.isChecked()) {
            C2_72 = "7";
        } else {
            C2_72 = "999";
        }

        if (R_C2_73_1.isChecked()) {
            C2_73 = "1";
        } else if (R_C2_73_2.isChecked()) {
            C2_73 = "2";
        } else if (R_C2_73_3.isChecked()) {
            C2_73 = "3";
        } else if (R_C2_73_4.isChecked()) {
            C2_73 = "4";
        } else if (R_C2_73_5.isChecked()) {
            C2_73 = "5";
        } else if (R_C2_73_6.isChecked()) {
            C2_73 = "6";
        } else if (R_C2_73_7.isChecked()) {
            C2_73 = "7";
        } else {
            C2_73 = "999";
        }

        if (R_C2_74_1.isChecked()) {
            C2_74 = "1";
        } else if (R_C2_74_2.isChecked()) {
            C2_74 = "2";
        } else if (R_C2_74_3.isChecked()) {
            C2_74 = "3";
        } else if (R_C2_74_4.isChecked()) {
            C2_74 = "4";
        } else if (R_C2_74_5.isChecked()) {
            C2_74 = "5";
        } else if (R_C2_74_6.isChecked()) {
            C2_74 = "6";
        } else if (R_C2_74_7.isChecked()) {
            C2_74 = "7";
        } else {
            C2_74 = "999";
        }

        if (R_C2_75_1.isChecked()) {
            C2_75 = "1";
        } else if (R_C2_75_2.isChecked()) {
            C2_75 = "2";
        } else if (R_C2_75_3.isChecked()) {
            C2_75 = "3";
        } else if (R_C2_75_4.isChecked()) {
            C2_75 = "4";
        } else if (R_C2_75_5.isChecked()) {
            C2_75 = "5";
        } else if (R_C2_75_6.isChecked()) {
            C2_75 = "6";
        } else if (R_C2_75_7.isChecked()) {
            C2_75 = "7";
        } else {
            C2_75 = "999";
        }


        if (R_C2_76_1.isChecked()) {
            C2_76 = "1";
        } else if (R_C2_76_2.isChecked()) {
            C2_76 = "2";
        } else if (R_C2_76_3.isChecked()) {
            C2_76 = "3";
        } else if (R_C2_76_4.isChecked()) {
            C2_76 = "4";
        } else if (R_C2_76_5.isChecked()) {
            C2_76 = "5";
        } else if (R_C2_76_6.isChecked()) {
            C2_76 = "6";
        } else if (R_C2_76_7.isChecked()) {
            C2_76 = "7";
        } else {
            C2_76 = "999";
        }


        if (R_C2_77_1.isChecked()) {
            C2_77 = "1";
        } else if (R_C2_77_2.isChecked()) {
            C2_77 = "2";
        } else if (R_C2_77_3.isChecked()) {
            C2_77 = "3";
        } else if (R_C2_77_4.isChecked()) {
            C2_77 = "4";
        } else if (R_C2_77_5.isChecked()) {
            C2_77 = "5";
        } else if (R_C2_77_6.isChecked()) {
            C2_77 = "6";
        } else if (R_C2_77_7.isChecked()) {
            C2_77 = "7";
        } else {
            C2_77 = "999";
        }


        if (R_C2_78_1.isChecked()) {
            C2_78 = "1";
        } else if (R_C2_78_2.isChecked()) {
            C2_78 = "2";
        } else if (R_C2_78_3.isChecked()) {
            C2_78 = "3";
        } else if (R_C2_78_4.isChecked()) {
            C2_78 = "4";
        } else if (R_C2_78_5.isChecked()) {
            C2_78 = "5";
        } else if (R_C2_78_6.isChecked()) {
            C2_78 = "6";
        } else {
            C2_78 = "999";
        }


        if (R_C3_1.isChecked()) {
            C3 = "1";
        } else if (R_C3_2.isChecked()) {
            C3 = "2";
        } else if (R_C3_3.isChecked()) {
            C3 = "3";
        } else if (R_C3_4.isChecked()) {
            C3 = "4";
        } else if (R_C3_5.isChecked()) {
            C3 = "5";
        } else {
            C3 = "999";
        }

        if (R_C4_1.isChecked()) {
            C4 = "1";
        } else if (R_C4_2.isChecked()) {
            C4 = "2";
        } else if (R_C4_3.isChecked()) {
            C4 = "3";
        } else if (R_C4_4.isChecked()) {
            C4 = "4";
        } else if (R_C4_5.isChecked()) {
            C4 = "5";
        } else if (R_C4_6.isChecked()) {
            C4 = "6";
        } else {
            C4 = "999";
        }

        int Days = 0;

        if (ed_C5_Year.getText().toString().trim().length() > 0) {
            int Year = Integer.parseInt(ed_C5_Year.getText().toString().trim()) * 365;
            Days = Year;
        }

        if (ed_C5_months.getText().toString().trim().length() > 0) {
            int Year = Integer.parseInt(ed_C5_months.getText().toString().trim()) * 30;
            Days = Days + Year;
        }

        if (ed_C5_days.getText().toString().trim().length() > 0) {
            int Year = Integer.parseInt(ed_C5_days.getText().toString().trim());
            Days = Days + Year;
        }


        C5 = Days + "";

        if (R_C6_Yes.isChecked()) {
            C6 = "1";
        } else if (R_C6_No.isChecked()) {
            C6 = "2";
        } else {
            C6 = "999";
        }


        if (R_C7_1.isChecked()) {
            C7 = "1";
        } else if (R_C7_2.isChecked()) {
            C7 = "2";
        } else if (R_C7_3.isChecked()) {
            if (ed_C7_3.getText().toString().trim().length() > 0) {
                C7 = ed_C7_3.getText().toString().trim();
            } else {
                ed_C7_3.setError("Enter");
                ed_C7_3.requestFocus();

                return false;
            }
        } else {
            C7 = "999";
        }

        if (btnDate.getText().toString().equals("Select Date")) {


            C4_1 = "999";


        } else {
            C4_1 = btnDate.getText().toString().trim();
        }


        return true;
    }


    boolean updateHFA() {
        String query = "update  hfa set " +

                col_C.C1_1_1 + "='" + C1_1_1 + "'," +
                col_C.C1_1_2 + "='" + C1_1_2 + "'," +
                col_C.C1_1_3 + "='" + C1_1_3 + "'," +
                col_C.C1_1_4 + "='" + C1_1_4 + "'," +
                col_C.C1_2_1 + "='" + C1_2_1 + "'," +
                col_C.C1_2_2 + "='" + C1_2_2 + "'," +
                col_C.C1_2_3 + "='" + C1_2_3 + "'," +
                col_C.C1_2_4 + "='" + C1_2_4 + "'," +
                col_C.C1_3_1 + "='" + C1_3_1 + "'," +
                col_C.C1_3_2 + "='" + C1_3_2 + "'," +
                col_C.C1_3_3 + "='" + C1_3_3 + "'," +
                col_C.C1_3_4 + "='" + C1_3_4 + "'," +
                col_C.C1_4_1 + "='" + C1_4_1 + "'," +
                col_C.C1_4_2 + "='" + C1_4_2 + "'," +
                col_C.C1_4_3 + "='" + C1_4_3 + "'," +
                col_C.C1_4_4 + "='" + C1_4_4 + "'," +
                col_C.C1_5_1 + "='" + C1_5_1 + "'," +
                col_C.C1_5_2 + "='" + C1_5_2 + "'," +
                col_C.C1_5_3 + "='" + C1_5_3 + "'," +
                col_C.C1_5_4 + "='" + C1_5_4 + "'," +
                col_C.C1_6_1 + "='" + C1_6_1 + "'," +
                col_C.C1_6_2 + "='" + C1_6_2 + "'," +
                col_C.C1_6_3 + "='" + C1_6_3 + "'," +
                col_C.C1_6_4 + "='" + C1_6_4 + "'," +
                col_C.C1_7_1 + "='" + C1_7_1 + "'," +
                col_C.C1_7_2 + "='" + C1_7_2 + "'," +
                col_C.C1_7_3 + "='" + C1_7_3 + "'," +
                col_C.C1_7_4 + "='" + C1_7_4 + "'," +
                col_C.C1_8_1 + "='" + C1_8_1 + "'," +
                col_C.C1_8_2 + "='" + C1_8_2 + "'," +
                col_C.C1_8_3 + "='" + C1_8_3 + "'," +
                col_C.C1_8_4 + "='" + C1_8_4 + "'," +
                col_C.C1_9_1 + "='" + C1_9_1 + "'," +
                col_C.C1_9_2 + "='" + C1_9_2 + "'," +
                col_C.C1_9_3 + "='" + C1_9_3 + "'," +
                col_C.C1_9_4 + "='" + C1_9_4 + "'," +
                col_C.C1_10_1 + "='" + C1_10_1 + "'," +
                col_C.C1_10_2 + "='" + C1_10_2 + "'," +
                col_C.C1_10_3 + "='" + C1_10_3 + "'," +
                col_C.C1_10_4 + "='" + C1_10_4 + "'," +
                col_C.C1_11_1 + "='" + C1_11_1 + "'," +
                col_C.C1_11_2 + "='" + C1_11_2 + "'," +
                col_C.C1_11_3 + "='" + C1_11_3 + "'," +
                col_C.C1_11_4 + "='" + C1_11_4 + "'," +
                col_C.C1_12_1 + "='" + C1_12_1 + "'," +
                col_C.C1_12_2 + "='" + C1_12_2 + "'," +
                col_C.C1_12_3 + "='" + C1_12_3 + "'," +
                col_C.C1_12_4 + "='" + C1_12_4 + "'," +
                col_C.C1_13_1 + "='" + C1_13_1 + "'," +
                col_C.C1_13_2 + "='" + C1_13_2 + "'," +
                col_C.C1_13_3 + "='" + C1_13_3 + "'," +
                col_C.C1_13_4 + "='" + C1_13_4 + "'," +
                col_C.C1_14_1 + "='" + C1_14_1 + "'," +
                col_C.C1_14_2 + "='" + C1_14_2 + "'," +
                col_C.C1_14_3 + "='" + C1_14_3 + "'," +
                col_C.C1_14_4 + "='" + C1_14_4 + "'," +
                col_C.C1_15_1 + "='" + C1_15_1 + "'," +
                col_C.C1_15_2 + "='" + C1_15_2 + "'," +
                col_C.C1_15_3 + "='" + C1_15_3 + "'," +
                col_C.C1_15_4 + "='" + C1_15_4 + "'," +
                col_C.C1_16_1 + "='" + C1_16_1 + "'," +
                col_C.C1_16_2 + "='" + C1_16_2 + "'," +
                col_C.C1_16_3 + "='" + C1_16_3 + "'," +
                col_C.C1_16_4 + "='" + C1_16_4 + "'," +
                col_C.C1_17_1 + "='" + C1_17_1 + "'," +
                col_C.C1_17_2 + "='" + C1_17_2 + "'," +
                col_C.C1_17_3 + "='" + C1_17_3 + "'," +
                col_C.C1_17_4 + "='" + C1_17_4 + "'," +
                col_C.C1_18_1 + "='" + C1_18_1 + "'," +
                col_C.C1_18_2 + "='" + C1_18_2 + "'," +
                col_C.C1_18_3 + "='" + C1_18_3 + "'," +
                col_C.C1_18_4 + "='" + C1_18_4 + "'," +
                col_C.C1_19_1 + "='" + C1_19_1 + "'," +
                col_C.C1_19_2 + "='" + C1_19_2 + "'," +
                col_C.C1_19_3 + "='" + C1_19_3 + "'," +
                col_C.C1_19_4 + "='" + C1_19_4 + "'," +
                col_C.C1_20_1 + "='" + C1_20_1 + "'," +
                col_C.C1_20_2 + "='" + C1_20_2 + "'," +
                col_C.C1_20_3 + "='" + C1_20_3 + "'," +
                col_C.C1_20_4 + "='" + C1_20_4 + "'," +
                col_C.C1_21_1 + "='" + C1_21_1 + "'," +
                col_C.C1_21_2 + "='" + C1_21_2 + "'," +
                col_C.C1_21_3 + "='" + C1_21_3 + "'," +
                col_C.C1_21_4 + "='" + C1_21_4 + "'," +
                col_C.C1_22_1 + "='" + C1_22_1 + "'," +
                col_C.C1_22_2 + "='" + C1_22_2 + "'," +
                col_C.C1_22_3 + "='" + C1_22_3 + "'," +
                col_C.C1_22_4 + "='" + C1_22_4 + "'," +
                col_C.C1_23_1 + "='" + C1_23_1 + "'," +
                col_C.C1_23_2 + "='" + C1_23_2 + "'," +
                col_C.C1_23_3 + "='" + C1_23_3 + "'," +
                col_C.C1_23_4 + "='" + C1_23_4 + "'," +
                col_C.C1_24_1 + "='" + C1_24_1 + "'," +
                col_C.C1_24_2 + "='" + C1_24_2 + "'," +
                col_C.C1_24_3 + "='" + C1_24_3 + "'," +
                col_C.C1_24_4 + "='" + C1_24_4 + "'," +
                col_C.C1_25_1 + "='" + C1_25_1 + "'," +
                col_C.C1_25_2 + "='" + C1_25_2 + "'," +
                col_C.C1_25_3 + "='" + C1_25_3 + "'," +
                col_C.C1_25_4 + "='" + C1_25_4 + "'," +
                col_C.C1_26_1 + "='" + C1_26_1 + "'," +
                col_C.C1_26_2 + "='" + C1_26_2 + "'," +
                col_C.C1_26_3 + "='" + C1_26_3 + "'," +
                col_C.C1_26_4 + "='" + C1_26_4 + "'," +
                col_C.C1_27_1 + "='" + C1_27_1 + "'," +
                col_C.C1_27_2 + "='" + C1_27_2 + "'," +
                col_C.C1_27_3 + "='" + C1_27_3 + "'," +
                col_C.C1_27_4 + "='" + C1_27_4 + "'," +
                col_C.C1_28_1 + "='" + C1_28_1 + "'," +
                col_C.C1_28_2 + "='" + C1_28_2 + "'," +
                col_C.C1_28_3 + "='" + C1_28_3 + "'," +
                col_C.C1_28_4 + "='" + C1_28_4 + "'," +
                col_C.C1_29_1 + "='" + C1_29_1 + "'," +
                col_C.C1_29_2 + "='" + C1_29_2 + "'," +
                col_C.C1_29_3 + "='" + C1_29_3 + "'," +
                col_C.C1_29_4 + "='" + C1_29_4 + "'," +
                col_C.C1_30_1 + "='" + C1_30_1 + "'," +
                col_C.C1_30_2 + "='" + C1_30_2 + "'," +
                col_C.C1_30_3 + "='" + C1_30_3 + "'," +
                col_C.C1_30_4 + "='" + C1_30_4 + "'," +
                col_C.C1_31_1 + "='" + C1_31_1 + "'," +
                col_C.C1_31_2 + "='" + C1_31_2 + "'," +
                col_C.C1_31_3 + "='" + C1_31_3 + "'," +
                col_C.C1_31_4 + "='" + C1_31_4 + "'," +
                col_C.C1_32_1 + "='" + C1_32_1 + "'," +
                col_C.C1_32_2 + "='" + C1_32_2 + "'," +
                col_C.C1_32_3 + "='" + C1_32_3 + "'," +
                col_C.C1_32_4 + "='" + C1_32_4 + "'," +
                col_C.C1_33_1 + "='" + C1_33_1 + "'," +
                col_C.C1_33_2 + "='" + C1_33_2 + "'," +
                col_C.C1_33_3 + "='" + C1_33_3 + "'," +
                col_C.C1_33_4 + "='" + C1_33_4 + "'," +
                col_C.C1_34_1 + "='" + C1_34_1 + "'," +
                col_C.C1_34_2 + "='" + C1_34_2 + "'," +
                col_C.C1_34_3 + "='" + C1_34_3 + "'," +
                col_C.C1_34_4 + "='" + C1_34_4 + "'," +
                col_C.C1_35_1 + "='" + C1_35_1 + "'," +
                col_C.C1_35_2 + "='" + C1_35_2 + "'," +
                col_C.C1_35_3 + "='" + C1_35_3 + "'," +
                col_C.C1_35_4 + "='" + C1_35_4 + "'," +
                col_C.C1_36_1 + "='" + C1_36_1 + "'," +
                col_C.C1_36_2 + "='" + C1_36_2 + "'," +
                col_C.C1_36_3 + "='" + C1_36_3 + "'," +
                col_C.C1_36_4 + "='" + C1_36_4 + "'," +
                col_C.C1_37_1 + "='" + C1_37_1 + "'," +
                col_C.C1_37_2 + "='" + C1_37_2 + "'," +
                col_C.C1_37_3 + "='" + C1_37_3 + "'," +
                col_C.C1_37_4 + "='" + C1_37_4 + "'," +
                col_C.C2_1 + "='" + C2_1 + "'," +
                col_C.C2_2 + "='" + C2_2 + "'," +
                col_C.C2_3 + "='" + C2_3 + "'," +
                col_C.C2_4 + "='" + C2_4 + "'," +
                col_C.C2_5 + "='" + C2_5 + "'," +
                col_C.C2_6 + "='" + C2_6 + "'," +
                col_C.C2_7 + "='" + C2_7 + "'," +
                col_C.C2_8 + "='" + C2_8 + "'," +
                col_C.C2_9 + "='" + C2_9 + "'," +
                col_C.C2_10 + "='" + C2_10 + "'," +
                col_C.C2_11 + "='" + C2_11 + "'," +
                col_C.C2_12 + "='" + C2_12 + "'," +
                col_C.C2_13 + "='" + C2_13 + "'," +
                col_C.C2_14 + "='" + C2_14 + "'," +
                col_C.C2_15 + "='" + C2_15 + "'," +
                col_C.C2_16 + "='" + C2_16 + "'," +
                col_C.C2_17 + "='" + C2_17 + "'," +
                col_C.C2_18 + "='" + C2_18 + "'," +
                col_C.C2_19 + "='" + C2_19 + "'," +
                col_C.C2_20 + "='" + C2_20 + "'," +
                col_C.C2_21 + "='" + C2_21 + "'," +
                col_C.C2_22 + "='" + C2_22 + "'," +
                col_C.C2_23 + "='" + C2_23 + "'," +
                col_C.C2_24 + "='" + C2_24 + "'," +
                col_C.C2_25 + "='" + C2_25 + "'," +
                col_C.C2_26 + "='" + C2_26 + "'," +
                col_C.C2_27 + "='" + C2_27 + "'," +
                col_C.C2_28 + "='" + C2_28 + "'," +
                col_C.C2_29 + "='" + C2_29 + "'," +
                col_C.C2_30 + "='" + C2_30 + "'," +
                col_C.C2_31 + "='" + C2_31 + "'," +
                col_C.C2_32 + "='" + C2_32 + "'," +
                col_C.C2_33 + "='" + C2_33 + "'," +
                col_C.C2_34 + "='" + C2_34 + "'," +
                col_C.C2_35 + "='" + C2_35 + "'," +
                col_C.C2_36 + "='" + C2_36 + "'," +
                col_C.C2_37 + "='" + C2_37 + "'," +
                col_C.C2_38 + "='" + C2_38 + "'," +
                col_C.C2_39 + "='" + C2_39 + "'," +
                col_C.C2_40 + "='" + C2_40 + "'," +
                col_C.C2_41 + "='" + C2_41 + "'," +
                col_C.C2_42 + "='" + C2_42 + "'," +
                col_C.C2_43 + "='" + C2_43 + "'," +
                col_C.C2_44 + "='" + C2_44 + "'," +
                col_C.C2_45 + "='" + C2_45 + "'," +
                col_C.C2_46 + "='" + C2_46 + "'," +
                col_C.C2_47 + "='" + C2_47 + "'," +
                col_C.C2_48 + "='" + C2_48 + "'," +
                col_C.C2_49 + "='" + C2_49 + "'," +
                col_C.C2_50 + "='" + C2_50 + "'," +
                col_C.C2_51 + "='" + C2_51 + "'," +
                col_C.C2_52 + "='" + C2_52 + "'," +
                col_C.C2_53 + "='" + C2_53 + "'," +
                col_C.C2_54 + "='" + C2_54 + "'," +
                col_C.C2_55 + "='" + C2_55 + "'," +
                col_C.C2_56 + "='" + C2_56 + "'," +
                col_C.C2_57 + "='" + C2_57 + "'," +
                col_C.C2_58 + "='" + C2_58 + "'," +
                col_C.C2_59 + "='" + C2_59 + "'," +
                col_C.C2_60 + "='" + C2_60 + "'," +
                col_C.C2_61 + "='" + C2_61 + "'," +
                col_C.C2_62 + "='" + C2_62 + "'," +
                col_C.C2_63 + "='" + C2_63 + "'," +
                col_C.C2_64 + "='" + C2_64 + "'," +
                col_C.C2_65 + "='" + C2_65 + "'," +
                col_C.C2_66 + "='" + C2_66 + "'," +
                col_C.C2_67 + "='" + C2_67 + "'," +
                col_C.C2_68 + "='" + C2_68 + "'," +
                col_C.C2_69 + "='" + C2_69 + "'," +
                col_C.C2_70 + "='" + C2_70 + "'," +
                col_C.C2_71 + "='" + C2_71 + "'," +
                col_C.C2_72 + "='" + C2_72 + "'," +
                col_C.C2_73 + "='" + C2_73 + "'," +
                col_C.C2_74 + "='" + C2_74 + "'," +
                col_C.C2_75 + "='" + C2_75 + "'," +
                col_C.C2_76 + "='" + C2_76 + "'," +
                col_C.C2_77 + "='" + C2_77 + "'," +
                col_C.C2_78 + "='" + C2_78 + "'," +
                col_C.C3 + "='" + C3 + "'," +
                col_C.C4 + "='" + C4 + "'," +
                col_C.C4_1 + "='" + C4_1 + "'," +
                col_C.C5 + "='" + C5 + "'," +
                col_C.C6 + "='" + C6 + "'," +
                col_C.C7 + "='" + C7 + "'" +
                " where id=" + Validation.HFAPK;


        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

        return true;


    }


    void updateHFADsection() {
        String query = "update  hfa set " +
                col_D.D1 + "='" + "999" + "'," +
                col_D.D2 + "='" + "999" + "'," +
                col_D.D3 + "='" + "999" + "'," +
                col_D.D4 + "='" + "999" + "'," +
                col_D.D5 + "='" + "999" + "'," +
                col_D.D6 + "='" + "999" + "'" +
                " Where id=" + Validation.HFAPK;
        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted D Section successfully", Toast.LENGTH_SHORT).show();


    }


    public void UpdateHfaEsection() {
        String query = "update  hfa set " +
                col_E.E1 + "='" + "999" + "'," +
                col_E.E2 + "='" + "999" + "'," +
                col_E.E3 + "='" + "999" + "'," +
                col_E.E4 + "='" + "999" + "'," +
                col_E.E5 + "='" + "999" + "'," +
                col_E.E6 + "='" + "999" + "'" +
                " Where id=" + Validation.HFAPK;

        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(getContext());

        LocalDataManager.database.execSQL(query);

        Toast.makeText(getActivity(), "Data inserted E Section successfully", Toast.LENGTH_SHORT).show();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
