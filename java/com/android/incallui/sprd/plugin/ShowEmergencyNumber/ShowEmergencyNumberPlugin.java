package com.android.incallui.sprd.plugin.ShowEmergencyNumber;

import com.android.incallui.call.CallList;
import com.android.incallui.call.DialerCall;
import com.android.incallui.Log;
import com.android.incallui.sprd.plugin.ShowEmergencyNumber.ShowEmergencyNumberHelper;

/**
 * Show emergency number when dial emergency call feature
 */
public class ShowEmergencyNumberPlugin extends ShowEmergencyNumberHelper{
    //add for bug1158388
    //private Context mContext;
    private static final String TAG = "ShowEmergencyNumberPlugin";

    private String mEmergencyNumber = ""; // Show emergency number when dial emergency call

    public ShowEmergencyNumberPlugin() {
    }

    /* Show emergency number when dial emergency call feature. @{ */
    public void setEmergencyNumber(String number) {
        //UNISOC:add for bug1381822
        Log.d(TAG, "number = " + number);
        DialerCall call = CallList.getInstance().getFirstCall();
        if (call != null) {
            mEmergencyNumber = call.getNumber();
            Log.d(TAG, "Display emergency number = " + mEmergencyNumber);
        } else {
            mEmergencyNumber = number;
        }
    }

    public String getEmergencyNumber() {
        return mEmergencyNumber;
    }
    /* @} */
}
