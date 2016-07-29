package com.volansys.notificationdemo;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;
import com.volansys.notificationdemo.service.GCMRegistrationIntentService;

/**
 * Created by pratik on 29/7/16.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GCMRegistrationIntentService.class);
        startService(intent);
    }
}
