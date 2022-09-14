package io.invertase.firebase.crashlytics;

import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.k;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class ReactNativeFirebaseCrashlyticsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Crashlytics";

    /* loaded from: classes.dex */
    class a implements Runnable {
        a(ReactNativeFirebaseCrashlyticsModule reactNativeFirebaseCrashlyticsModule) {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Crash Test");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseCrashlyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private void recordJavaScriptError(ReadableMap readableMap) {
        String string = readableMap.getString("message");
        ReadableArray readableArray = (ReadableArray) Objects.requireNonNull(readableMap.getArray("frames"));
        Exception cVar = readableMap.getBoolean("isUnhandledRejection") ? new c(string) : new io.invertase.firebase.crashlytics.a(string);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap readableMap2 = (ReadableMap) Objects.requireNonNull(readableArray.mo209getMap(i));
            stackTraceElementArr[i] = new StackTraceElement("", readableMap2.getString("fn"), readableMap2.getString("file"), -1);
        }
        cVar.setStackTrace(stackTraceElementArr);
        FirebaseCrashlytics.getInstance().recordException(cVar);
    }

    @ReactMethod
    public void crash() {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            new Handler().postDelayed(new a(this), 50L);
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.a()));
        return hashMap;
    }

    @ReactMethod
    public void log(String str) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
    }

    @ReactMethod
    public void logPromise(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void recordError(ReadableMap readableMap) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            recordJavaScriptError(readableMap);
        }
    }

    @ReactMethod
    public void recordErrorPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            recordJavaScriptError(readableMap);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setAttribute(String str, String str2, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                firebaseCrashlytics.setCustomKey(nextKey, readableMap.getString(nextKey));
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setCrashlyticsCollectionEnabled(Boolean bool, Promise promise) {
        k.d().b("crashlytics_auto_collection_enabled", bool.booleanValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
        promise.resolve(null);
    }
}
