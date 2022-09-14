package io.invertase.firebase.app;

import c.e.b.d;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.e;
import io.invertase.firebase.common.f;
import io.invertase.firebase.common.g;
import io.invertase.firebase.common.i;
import io.invertase.firebase.common.j;
import io.invertase.firebase.common.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        d a2 = d.a(str);
        if (a2 != null) {
            a2.a();
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.b().a(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.b().a());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.b().b(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.b().b(new f(str, e.a(readableMap)));
        promise.resolve(e.a(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.b().a(str, bool);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (d dVar : d.a(getReactApplicationContext())) {
            arrayList.add(e.a(dVar));
        }
        hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
        hashMap.put("FIREBASE_RAW_JSON", i.c().b());
        return hashMap;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        g.b().a(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        promise.resolve(e.b(e.a(readableMap, readableMap2, getContext())));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.c().a());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.c().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.d().a();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.d().b());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z, Promise promise) {
        k.d().b(str, z);
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.d().a(str, str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        d.a(str).b(bool.booleanValue());
    }
}
