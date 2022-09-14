package com.dieam.reactnativepushnotification.modules;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.j;
import c.e.a.b.g.h;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.w;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class RNPushNotification extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String LOG_TAG = "RNPushNotification";
    private d mJsDelivery;
    private c mRNPushNotificationHelper;
    private final SecureRandom mRandomNumberGenerator;

    /* loaded from: classes.dex */
    class a implements c.e.a.b.g.c<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f5106a;

        a(RNPushNotification rNPushNotification, d dVar) {
            this.f5106a = dVar;
        }

        @Override // c.e.a.b.g.c
        public void a(h<w> hVar) {
            if (!hVar.e()) {
                Log.e(RNPushNotification.LOG_TAG, "exception", hVar.a());
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("deviceToken", hVar.b().b());
            this.f5106a.a("remoteNotificationsRegistered", createMap);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b(RNPushNotification rNPushNotification) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FirebaseInstanceId.n().b();
                Log.i(RNPushNotification.LOG_TAG, "InstanceID deleted");
            } catch (IOException e2) {
                Log.e(RNPushNotification.LOG_TAG, "exception", e2);
            }
        }
    }

    public RNPushNotification(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRandomNumberGenerator = new SecureRandom();
        reactApplicationContext.addActivityEventListener(this);
        this.mRNPushNotificationHelper = new c((Application) reactApplicationContext.getApplicationContext());
        this.mJsDelivery = new d(reactApplicationContext);
        this.mRNPushNotificationHelper.b();
    }

    private Bundle getBundleFromIntent(Intent intent) {
        if (intent.hasExtra("notification")) {
            return intent.getBundleExtra("notification");
        }
        if (!intent.hasExtra("google.message_id")) {
            return null;
        }
        return intent.getExtras();
    }

    @ReactMethod
    public void abandonPermissions() {
        new Thread(new b(this)).start();
    }

    @ReactMethod
    public void cancelAllLocalNotifications() {
        this.mRNPushNotificationHelper.a();
        this.mRNPushNotificationHelper.c();
    }

    @ReactMethod
    public void cancelLocalNotifications(ReadableMap readableMap) {
        this.mRNPushNotificationHelper.a(readableMap);
    }

    @ReactMethod
    public void channelBlocked(String str, Callback callback) {
        boolean a2 = this.mRNPushNotificationHelper.a(str);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(a2));
        }
    }

    @ReactMethod
    public void channelExists(String str, Callback callback) {
        boolean b2 = this.mRNPushNotificationHelper.b(str);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(b2));
        }
    }

    @ReactMethod
    public void checkPermissions(Promise promise) {
        promise.resolve(Boolean.valueOf(j.a(getReactApplicationContext()).a()));
    }

    @ReactMethod
    public void clearLocalNotification(String str, int i) {
        this.mRNPushNotificationHelper.a(str, i);
    }

    @ReactMethod
    public void createChannel(ReadableMap readableMap, Callback callback) {
        boolean b2 = this.mRNPushNotificationHelper.b(readableMap);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(b2));
        }
    }

    @ReactMethod
    public void deleteChannel(String str) {
        this.mRNPushNotificationHelper.c(str);
    }

    @ReactMethod
    public void getChannels(Callback callback) {
        WritableArray fromList = Arguments.fromList(this.mRNPushNotificationHelper.h());
        if (callback != null) {
            callback.invoke(fromList);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @ReactMethod
    public void getDeliveredNotifications(Callback callback) {
        callback.invoke(this.mRNPushNotificationHelper.d());
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        Bundle bundleFromIntent;
        WritableMap createMap = Arguments.createMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (bundleFromIntent = getBundleFromIntent(currentActivity.getIntent())) != null) {
            bundleFromIntent.putBoolean("foreground", false);
            createMap.putString("dataJSON", this.mJsDelivery.a(bundleFromIntent));
        }
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return LOG_TAG;
    }

    @ReactMethod
    public void getScheduledLocalNotifications(Callback callback) {
        callback.invoke(this.mRNPushNotificationHelper.f());
    }

    @ReactMethod
    public void invokeApp(ReadableMap readableMap) {
        this.mRNPushNotificationHelper.a(readableMap != null ? Arguments.toBundle(readableMap) : null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        Bundle bundleFromIntent = getBundleFromIntent(intent);
        if (bundleFromIntent != null) {
            this.mJsDelivery.b(bundleFromIntent);
        }
    }

    @ReactMethod
    public void presentLocalNotification(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.d(bundle);
    }

    @ReactMethod
    public void removeAllDeliveredNotifications() {
        this.mRNPushNotificationHelper.c();
    }

    @ReactMethod
    public void removeDeliveredNotifications(ReadableArray readableArray) {
        this.mRNPushNotificationHelper.a(readableArray);
    }

    @ReactMethod
    public void requestPermissions() {
        FirebaseInstanceId.n().g().a(new a(this, this.mJsDelivery));
    }

    @ReactMethod
    public void scheduleLocalNotification(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.b(bundle);
    }

    @ReactMethod
    public void setApplicationIconBadgeNumber(int i) {
        c.c.a.b.a.f2716c.a(getReactApplicationContext(), i);
    }

    @ReactMethod
    public void subscribeToTopic(String str) {
        FirebaseMessaging.b().a(str);
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str) {
        FirebaseMessaging.b().b(str);
    }
}
