package com.taisys.sc.mobileidj;

/**
 * Created by sunny.sun on 2017/11/24.
 */

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        utility.setMySetting(this, "fcmToken", token);
        utility.setMySetting(this, "fcmTokenChanged", "Y");
        Log.d("FCM", "Token: " + token);
    }
}
