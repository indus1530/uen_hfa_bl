package utils;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class GothroughRadioButton {


    public static boolean IamHiden(LinearLayout lv) {


        Boolean iamnotgood = true;


        /// Checkbox Celar*************************************

        try {


            if (lv.getVisibility() != View.VISIBLE) {
                return true;


            }

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);


                if (view instanceof RadioGroup) {
                    if (((RadioGroup) view).getCheckedRadioButtonId() != -1) {


                    } else {
                        iamnotgood = false;
                    }


                }

            }
        } catch (Exception e) {

            //      return true;

        }


        return iamnotgood;


    }
}
