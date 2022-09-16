package com.facebook.react.uimanager;
/* compiled from: ReactStylesDiffMap.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    final com.facebook.react.bridge.an f3938a;

    public y(com.facebook.react.bridge.an anVar) {
        this.f3938a = anVar;
    }

    public boolean a(String str) {
        return this.f3938a.hasKey(str);
    }

    public boolean b(String str) {
        return this.f3938a.isNull(str);
    }

    public boolean a(String str, boolean z) {
        return this.f3938a.isNull(str) ? z : this.f3938a.getBoolean(str);
    }

    public double a(String str, double d2) {
        return this.f3938a.isNull(str) ? d2 : this.f3938a.getDouble(str);
    }

    public float a(String str, float f) {
        return this.f3938a.isNull(str) ? f : (float) this.f3938a.getDouble(str);
    }

    public int a(String str, int i) {
        return this.f3938a.isNull(str) ? i : this.f3938a.getInt(str);
    }

    public String c(String str) {
        return this.f3938a.getString(str);
    }

    public com.facebook.react.bridge.am d(String str) {
        return this.f3938a.e(str);
    }

    public com.facebook.react.bridge.an e(String str) {
        return this.f3938a.d(str);
    }

    public com.facebook.react.bridge.g f(String str) {
        return this.f3938a.c(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f3938a.toString() + " }";
    }
}
