package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.security.SecureRandom;
/* loaded from: classes.dex */
public class RNPushNotificationPublisher extends BroadcastReceiver {
    private void a(Context context, Bundle bundle) {
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(new SecureRandom().nextInt()));
        }
        c cVar = new c((Application) context.getApplicationContext());
        cVar.g();
        Log.v(RNPushNotification.LOG_TAG, "sendNotification: " + bundle);
        cVar.d(bundle);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("notificationId", 0);
        long currentTimeMillis = System.currentTimeMillis();
        Log.i(RNPushNotification.LOG_TAG, "NotificationPublisher: Prepare To Publish: " + intExtra + ", Now Time: " + currentTimeMillis);
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived: ");
        sb.append(extras);
        Log.v(RNPushNotification.LOG_TAG, sb.toString());
        a(context, extras);
    }
}
