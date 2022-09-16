package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
/* loaded from: classes.dex */
public class RNPushNotificationBootEventReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver loading scheduled notifications");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("rn_push_notification", 0);
            Set<String> keySet = sharedPreferences.getAll().keySet();
            c cVar = new c((Application) context.getApplicationContext());
            for (String str : keySet) {
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string != null) {
                        a a2 = a.a(string);
                        if (a2.a() < System.currentTimeMillis()) {
                            Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver: Showing notification for " + a2.b());
                            cVar.d(a2.h());
                        } else {
                            Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver: Scheduling notification for " + a2.b());
                            cVar.c(a2.h());
                        }
                    }
                } catch (Exception e2) {
                    Log.e(RNPushNotification.LOG_TAG, "Problem with boot receiver loading notification " + str, e2);
                }
            }
        }
    }
}
