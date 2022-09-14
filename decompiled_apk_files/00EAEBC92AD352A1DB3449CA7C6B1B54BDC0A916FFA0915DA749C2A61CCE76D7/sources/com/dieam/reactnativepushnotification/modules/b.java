package com.dieam.reactnativepushnotification.modules;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
class b {

    /* renamed from: b  reason: collision with root package name */
    private static Bundle f5125b;

    /* renamed from: a  reason: collision with root package name */
    private Context f5126a;

    public b(Context context) {
        this.f5126a = context;
        if (f5125b == null) {
            try {
                f5125b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                Log.e(RNPushNotification.LOG_TAG, "Error reading application meta, falling back to defaults");
                f5125b = new Bundle();
            }
        }
    }

    private String a(String str, String str2) {
        try {
            String string = f5125b.getString(str);
            if (string != null) {
                if (string.length() > 0) {
                    return string;
                }
            }
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + str + " in manifest. Falling back to default");
        }
        return str2;
    }

    public String a(String str) {
        String a2 = a("com.dieam.reactnativepushnotification.notification_channel_description", "");
        return a("com.dieam.reactnativepushnotification.notification_channel_description." + str, a2);
    }

    public boolean a() {
        try {
            return f5125b.getBoolean("com.dieam.reactnativepushnotification.channel_create_default", true);
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.channel_create_default in manifest. Falling back to default");
            return true;
        }
    }

    public int b() {
        try {
            return a.g.e.f.f.a(this.f5126a.getResources(), f5125b.getInt("com.dieam.reactnativepushnotification.notification_color"), null);
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.notification_color in manifest. Falling back to default");
            return -1;
        }
    }

    public String b(String str) {
        String a2 = a("com.dieam.reactnativepushnotification.notification_channel_name", "rn-push-notification-channel");
        return a("com.dieam.reactnativepushnotification.notification_channel_name." + str, a2);
    }

    public boolean c() {
        try {
            return f5125b.getBoolean("com.dieam.reactnativepushnotification.notification_foreground", false);
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.notification_foreground in manifest. Falling back to default");
            return false;
        }
    }
}
