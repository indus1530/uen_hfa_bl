package utils;

import android.view.View;
import android.widget.EditText;

import androidx.cardview.widget.CardView;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class GothroughTextboxss {


    public static boolean IamHiden(CardView cv) {


        Boolean iamnotgood = true;


        /// Checkbox Celar*************************************

        try {


            if (cv.getVisibility() != View.VISIBLE) {
                return true;


            }

            for (int i = 0, count = cv.getChildCount(); i < count; ++i) {
                View view = cv.getChildAt(i);


                if (view instanceof EditText) {
                    if (((EditText) view).getText().length() == 0) {
                        iamnotgood = false;
                        ((EditText) view).setError("Enter Text");
                        view.requestFocus();

                    } else {
                        ((EditText) view).setError(null);
                    }


                }

            }
        } catch (Exception e) {

            //      return true;

        }


        return iamnotgood;


    }
}
