package utils;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.cardview.widget.CardView;

/**
 * Created by sajidlatif on 3/28/2017.
 */

public class ClearAllcontrol {


    public static void ClearAll(CardView cv) {

        /// Checkbox Celar*************************************

        try {

            for (int i = 0, count = cv.getChildCount(); i < count; ++i) {
                View view = cv.getChildAt(i);
                if (view instanceof CheckBox) {
                    ((CheckBox) view).setChecked(false);
                } else if (view instanceof RadioGroup) {
                    ((RadioGroup) view).clearCheck();
                } else if (view instanceof EditText) {
                    ((EditText) view).setText("");
                }

            }
        } catch (Exception e) {

        }


    }
}
