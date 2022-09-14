package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    final ReadableMap f5885a;

    public c0(ReadableMap readableMap) {
        this.f5885a = readableMap;
    }

    public float a(String str, float f2) {
        return this.f5885a.isNull(str) ? f2 : (float) this.f5885a.getDouble(str);
    }

    public int a(String str, int i) {
        return this.f5885a.isNull(str) ? i : this.f5885a.getInt(str);
    }

    public ReadableArray a(String str) {
        return this.f5885a.getArray(str);
    }

    public boolean a(String str, boolean z) {
        return this.f5885a.isNull(str) ? z : this.f5885a.getBoolean(str);
    }

    public ReadableMap b(String str) {
        return this.f5885a.mo210getMap(str);
    }

    public String c(String str) {
        return this.f5885a.getString(str);
    }

    public boolean d(String str) {
        return this.f5885a.hasKey(str);
    }

    public String toString() {
        return "{ " + c0.class.getSimpleName() + ": " + this.f5885a.toString() + " }";
    }
}
