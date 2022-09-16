package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
import java.util.Map;
/* loaded from: classes.dex */
class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> a(a aVar) {
        return com.facebook.react.common.f.a("top", Float.valueOf(q.a(aVar.f10086a)), "right", Float.valueOf(q.a(aVar.f10087b)), "bottom", Float.valueOf(q.a(aVar.f10088c)), "left", Float.valueOf(q.a(aVar.f10089d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> a(c cVar) {
        return com.facebook.react.common.f.a("x", Float.valueOf(q.a(cVar.f10092a)), "y", Float.valueOf(q.a(cVar.f10093b)), "width", Float.valueOf(q.a(cVar.f10094c)), "height", Float.valueOf(q.a(cVar.f10095d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap b(a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", q.a(aVar.f10086a));
        createMap.putDouble("right", q.a(aVar.f10087b));
        createMap.putDouble("bottom", q.a(aVar.f10088c));
        createMap.putDouble("left", q.a(aVar.f10089d));
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap b(c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", q.a(cVar.f10092a));
        createMap.putDouble("y", q.a(cVar.f10093b));
        createMap.putDouble("width", q.a(cVar.f10094c));
        createMap.putDouble("height", q.a(cVar.f10095d));
        return createMap;
    }
}
