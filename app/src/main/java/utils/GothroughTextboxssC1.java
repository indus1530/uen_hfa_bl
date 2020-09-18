package utils;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class GothroughTextboxssC1 {


    public static boolean IamHiden(LinearLayout lv) {


        Boolean iamnotgood = true;


        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int A4 = 0;
        /// Checkbox Celar*************************************

        try {


            if (lv.getVisibility() != View.VISIBLE) {
                return true;


            }

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);


                if (view instanceof EditText) {
                    if (((EditText) view).getText().length() == 0) {
                        iamnotgood = false;
                        ((EditText) view).setError("Enter Text");
                        view.requestFocus();

                    } else {
                        ((EditText) view).setError(null);


                        if (i == 0) {
                            A1 = Integer.parseInt(((EditText) view).getText().toString().trim());
                        }
                        if (i == 1) {
                            A2 = Integer.parseInt(((EditText) view).getText().toString().trim());

                            if (A1 < A2) {
                                ((EditText) view).setError("Section Must Greater then Filled");
                                view.requestFocus();
                                return false;
                            }
                        }
                        if (i == 2) {
                            A3 = Integer.parseInt(((EditText) view).getText().toString().trim());


                        }
                        if (i == 3) {
                            A4 = Integer.parseInt(((EditText) view).getText().toString().trim());

                            if (A2 < A3 + A4) {
                                ((EditText) view).setError("Filled Must Greater then Full time and Part time ");
                                view.requestFocus();
                                return false;
                            }
                        }


                    }


                }

            }
        } catch (Exception e) {

            //      return true;

        }


        return iamnotgood;


    }
}
