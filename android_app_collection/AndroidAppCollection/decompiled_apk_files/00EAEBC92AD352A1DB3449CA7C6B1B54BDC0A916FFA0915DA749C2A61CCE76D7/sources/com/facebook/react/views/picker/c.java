package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6192a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f6193b;

    public c(ReadableMap readableMap) {
        this.f6192a = readableMap.getString("label");
        this.f6193b = (!readableMap.hasKey("color") || readableMap.isNull("color")) ? null : Integer.valueOf(readableMap.getInt("color"));
    }

    public static List<c> a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(new c(readableArray.mo209getMap(i)));
        }
        return arrayList;
    }
}
