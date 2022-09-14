package io.invertase.firebase.common;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule implements e.a.a.a.a {
    private static Map<String, ExecutorService> executors = new HashMap();
    private String moduleName;

    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString("message", str2);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString("message", str2);
        createMap.putString("nativeErrorMessage", str3);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithExceptionMap(Promise promise, Exception exc) {
        promise.reject(exc, l.a(exc));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        return getReactApplicationContext();
    }

    public ExecutorService getExecutor() {
        ExecutorService executorService = executors.get(getName());
        if (executorService != null) {
            return executorService;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executors.put(getName(), newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFB" + this.moduleName + "Module";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        ExecutorService executorService = executors.get(getName());
        if (executorService != null) {
            executorService.shutdownNow();
            executors.remove(getName());
        }
    }
}
