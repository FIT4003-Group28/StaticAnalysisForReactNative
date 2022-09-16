package com.dieam.reactnativepushnotification.modules;

import android.os.Build;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f5132a;

    public d(ReactContext reactContext) {
        this.f5132a = reactContext;
    }

    private JSONObject e(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                obj = e((Bundle) obj);
            } else if (Build.VERSION.SDK_INT >= 19) {
                obj = JSONObject.wrap(obj);
            }
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(Bundle bundle) {
        try {
            return e(bundle).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Object obj) {
        if (this.f5132a.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f5132a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String a2 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a2);
        a("remoteNotificationReceived", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        String a2 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a2);
        a("notificationActionReceived", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        String a2 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a2);
        a("remoteFetch", createMap);
    }
}
