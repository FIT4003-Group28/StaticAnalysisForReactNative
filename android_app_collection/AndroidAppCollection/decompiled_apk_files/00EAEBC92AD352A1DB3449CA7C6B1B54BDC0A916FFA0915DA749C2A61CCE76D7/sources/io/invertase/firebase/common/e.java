package io.invertase.firebase.common;

import android.content.Context;
import c.e.b.i;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class e {
    public static c.e.b.d a(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        i.b bVar = new i.b();
        String string = readableMap2.getString("name");
        bVar.a(readableMap.getString("apiKey"));
        bVar.b(readableMap.getString("appId"));
        bVar.f(readableMap.getString("projectId"));
        bVar.c(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("gaTrackingId")) {
            bVar.d(readableMap.getString("gaTrackingId"));
        }
        bVar.g(readableMap.getString("storageBucket"));
        bVar.e(readableMap.getString("messagingSenderId"));
        c.e.b.d a2 = string.equals("[DEFAULT]") ? c.e.b.d.a(context, bVar.a()) : c.e.b.d.a(context, bVar.a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            a2.b(readableMap2.getBoolean("automaticDataCollectionEnabled"));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            a2.a(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return a2;
    }

    public static WritableMap a(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }

    public static Map<String, Object> a(c.e.b.d dVar) {
        String c2 = dVar.c();
        c.e.b.i d2 = dVar.d();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", c2);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(dVar.f()));
        hashMap2.put("apiKey", d2.a());
        hashMap2.put("appId", d2.b());
        hashMap2.put("projectId", d2.f());
        hashMap2.put("databaseURL", d2.c());
        hashMap2.put("gaTrackingId", d2.d());
        hashMap2.put("messagingSenderId", d2.e());
        hashMap2.put("storageBucket", d2.g());
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    public static WritableMap b(c.e.b.d dVar) {
        return Arguments.makeNativeMap(a(dVar));
    }
}
