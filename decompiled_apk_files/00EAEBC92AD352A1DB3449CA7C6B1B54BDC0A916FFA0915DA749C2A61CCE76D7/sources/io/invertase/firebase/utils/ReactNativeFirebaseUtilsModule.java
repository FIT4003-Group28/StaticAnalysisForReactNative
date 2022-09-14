package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.b;
import com.google.android.gms.common.e;
import io.invertase.firebase.app.a;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap createMap = Arguments.createMap();
        e a2 = e.a();
        int b2 = a2.b(getContext());
        createMap.putInt("status", b2);
        if (b2 == 0) {
            createMap.putBoolean("isAvailable", true);
        } else {
            createMap.putBoolean("isAvailable", false);
            createMap.putString("error", a2.a(b2));
            createMap.putBoolean("isUserResolvableError", a2.b(b2));
            createMap.putBoolean("hasResolution", new b(b2).t());
        }
        return createMap;
    }

    private int isGooglePlayServicesAvailable() {
        return e.a().b(getContext());
    }

    private static Boolean isRunningInTestLab() {
        return Boolean.valueOf("true".equals(Settings.System.getString(a.a().getContentResolver(), FIREBASE_TEST_LAB)));
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() == 0 || (activity = getActivity()) == null) {
            return;
        }
        e.a().a(activity);
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        e a2 = e.a();
        if (isGooglePlayServicesAvailable == 0 || !a2.b(isGooglePlayServicesAvailable) || (activity = getActivity()) == null) {
            return;
        }
        a2.a(activity, isGooglePlayServicesAvailable, isGooglePlayServicesAvailable).show();
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        b bVar = new b(isGooglePlayServicesAvailable);
        if (bVar.u() || !bVar.t() || (activity = getActivity()) == null) {
            return;
        }
        try {
            bVar.a(activity, isGooglePlayServicesAvailable);
        } catch (IntentSender.SendIntentException e2) {
            Log.d(TAG, "resolutionForPlayServices", e2);
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isRunningInTestLab", isRunningInTestLab());
        hashMap.put("androidPlayServices", getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        hashMap.put(KEY_MAIN_BUNDLE, "");
        hashMap.put(KEY_LIBRARY_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put(KEY_TEMP_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(KEY_CACHE_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(KEY_DOCUMENT_DIRECTORY, (Build.VERSION.SDK_INT >= 19 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) : reactApplicationContext.getFilesDir()).getAbsolutePath());
        hashMap.put(KEY_PICS_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(KEY_MOVIES_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(KEY_EXT_STORAGE_DIRECTORY, externalStorageDirectory.getAbsolutePath());
        }
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            hashMap.put(KEY_EXTERNAL_DIRECTORY, externalFilesDir.getAbsolutePath());
        }
        return hashMap;
    }
}
