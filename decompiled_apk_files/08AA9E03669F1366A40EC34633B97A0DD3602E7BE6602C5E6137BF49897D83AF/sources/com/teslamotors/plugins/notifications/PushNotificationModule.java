package com.teslamotors.plugins.notifications;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;
import com.teslamotors.plugins.client.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
/* loaded from: classes.dex */
public class PushNotificationModule extends ReactContextBaseJavaModule {
    private static final String TAG = "PushNotificationModule";
    private BroadcastReceiver mNotificationBroadcastReceiver;
    private BroadcastReceiver mRegistrationBroadcastReceiver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PushNotificationAndroid";
    }

    public PushNotificationModule(ah ahVar) {
        super(ahVar);
        registerNotificationReceiver();
        registerRegistrationReceiver();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @al
    public void getInitialNotification(af afVar) {
        ar b2 = com.facebook.react.bridge.b.b();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            b2.putString("initialNotification", currentActivity.getIntent().getStringExtra("notification"));
        }
        afVar.a(b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, ar arVar) {
        if (getReactApplicationContext().b()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, arVar);
        }
    }

    public boolean onNewIntent(Intent intent) {
        if (intent.hasExtra("notification")) {
            sendNotification(intent.getStringExtra("notification"));
            return true;
        }
        return false;
    }

    private void registerNotificationReceiver() {
        IntentFilter intentFilter = new IntentFilter("remoteNotificationReceived");
        this.mNotificationBroadcastReceiver = new BroadcastReceiver() { // from class: com.teslamotors.plugins.notifications.PushNotificationModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PushNotificationModule.this.sendNotification(intent.getBundleExtra("notification"));
            }
        };
        android.support.v4.a.c.a(getReactApplicationContext()).a(this.mNotificationBroadcastReceiver, intentFilter);
    }

    private void registerRegistrationReceiver() {
        IntentFilter intentFilter = new IntentFilter("remoteNotificationRegistered");
        this.mRegistrationBroadcastReceiver = new BroadcastReceiver() { // from class: com.teslamotors.plugins.notifications.PushNotificationModule.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putString("deviceToken", intent.getStringExtra("deviceToken"));
                PushNotificationModule.this.sendEvent("registrationReceived", b2);
            }
        };
        android.support.v4.a.c.a(getReactApplicationContext()).a(this.mRegistrationBroadcastReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNotification(Bundle bundle) {
        String str;
        if (a.a(bundle)) {
            e.a(getReactApplicationContext()).v();
        }
        try {
            str = com.teslamotors.plugins.client.d.b.a(bundle).toString();
        } catch (JSONException e) {
            Log.e(TAG, "Failed to serialize notification", e);
            str = null;
        }
        sendNotification(str);
    }

    private void sendNotification(String str) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString("dataJSON", str);
        sendEvent("remoteNotificationReceived", b2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        if (this.mNotificationBroadcastReceiver != null) {
            android.support.v4.a.c.a(getReactApplicationContext()).a(this.mNotificationBroadcastReceiver);
            this.mNotificationBroadcastReceiver = null;
        }
        if (this.mRegistrationBroadcastReceiver != null) {
            android.support.v4.a.c.a(getReactApplicationContext()).a(this.mRegistrationBroadcastReceiver);
            this.mRegistrationBroadcastReceiver = null;
        }
    }

    @al
    public void abandonPermissions() {
        new AsyncTask() { // from class: com.teslamotors.plugins.notifications.PushNotificationModule.3
            @Override // android.os.AsyncTask
            protected Object doInBackground(Object[] objArr) {
                try {
                    InstanceID.getInstance(PushNotificationModule.this.getReactApplicationContext()).deleteInstanceID();
                    return null;
                } catch (Exception e) {
                    Log.e(PushNotificationModule.TAG, "Failed to delete GCM Instance ID", e);
                    return null;
                }
            }
        }.execute(new Object[0]);
    }

    @al
    public void saveDeprecatedGCMRegistrationToken(final af afVar) {
        new AsyncTask() { // from class: com.teslamotors.plugins.notifications.PushNotificationModule.4
            @Override // android.os.AsyncTask
            protected Object doInBackground(Object[] objArr) {
                ah reactApplicationContext = PushNotificationModule.this.getReactApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                e a2 = e.a(reactApplicationContext);
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(reactApplicationContext);
                ar b2 = com.facebook.react.bridge.b.b();
                if (isGooglePlayServicesAvailable != 0) {
                    Log.i(PushNotificationModule.TAG, "Failed to get deprecated GCM token - Google Play services unavailable on device");
                } else {
                    try {
                        String register = GoogleCloudMessaging.getInstance(reactApplicationContext).register(a2.h());
                        com.teslamotors.plugins.client.b.a.a(reactApplicationContext, register);
                        b2.putString("token", register);
                    } catch (IOException e) {
                        Log.e(PushNotificationModule.TAG, "Failed to get deprecated GCM token", e);
                    }
                }
                return b2;
            }

            @Override // android.os.AsyncTask
            protected void onPostExecute(Object obj) {
                ar b2 = com.facebook.react.bridge.b.b();
                if (obj instanceof ar) {
                    b2 = (ar) obj;
                }
                afVar.a(b2);
            }
        }.executeOnExecutor(new ScheduledThreadPoolExecutor(1), new Object[0]);
    }
}
