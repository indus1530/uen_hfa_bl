package utils;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class HideC1Res1 {


    public static boolean IamHiden(LinearLayout lv) {


        Boolean iamnotgood = true;


        /// Checkbox Celar*************************************

        try {


            if (lv.getVisibility() != View.VISIBLE) {
                return true;


            }

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);


                if (view instanceof EditText) {
                    if (i == 0) {

                        view.setVisibility(View.GONE);
                        ((EditText) view).setText("999");

                    }


                }

            }
        } catch (Exception e) {

            //      return true;

        }


        return iamnotgood;


    }
}
