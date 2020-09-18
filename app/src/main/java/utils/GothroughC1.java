package utils;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class GothroughC1 {


    public static boolean IamHiden(LinearLayout lv) {


        boolean textbox1isgood = false;
        boolean textbox2isgood = false;
        boolean radobuttonisgood = false;

        /// Checkbox Celar*************************************

        try {


            if (lv.getVisibility() != View.VISIBLE) {
                return true;


            }


            View view1 = lv.getChildAt(0);

            /*       if (view instanceof RadioGroup)
                {
                   if(((RadioGroup) view).getCheckedRadioButtonId() != -1)

                    //if(((RadioButton) view).isChecked())
                   {

                       return true;
                   }


                }
       */
            if (view1 instanceof EditText) {
                if (((EditText) view1).getText().length() > 0) {
                    textbox1isgood = true;
                    ((EditText) view1).setError(null);
                } else {
                    ((EditText) view1).setError("Enter Text");
                    textbox1isgood = false;
                }


            }


            View view2 = lv.getChildAt(1);


            if (view2 instanceof EditText) {
                if (((EditText) view2).getText().length() > 0) {
                    textbox2isgood = true;
                    ((EditText) view2).setError(null);
                } else {
                    ((EditText) view2).setError("Enter Text");
                    textbox2isgood = false;
                }


            }


            View view3 = lv.getChildAt(2);

            if (view3 instanceof RadioGroup) {
                if (((RadioGroup) view3).getCheckedRadioButtonId() != -1) {

                    radobuttonisgood = true;
                    ((EditText) view2).setError(null);
                } else {

                    radobuttonisgood = false;
                    ((EditText) view2).setError("Select Full time/part Time using Below buttons ");

                }


            }


            return radobuttonisgood == true && textbox1isgood == true && textbox2isgood == true;


        } catch (Exception e) {

            //      return true;

        }


        return true;


    }
}
