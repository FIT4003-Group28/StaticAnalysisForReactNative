package com.google.firebase.crashlytics.c;

import android.util.Log;
/* loaded from: classes.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    static final b f8582c = new b("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f8583a;

    /* renamed from: b  reason: collision with root package name */
    private int f8584b = 4;

    public b(String str) {
        this.f8583a = str;
    }

    public static b a() {
        return f8582c;
    }

    private boolean a(int i) {
        return this.f8584b <= i || Log.isLoggable(this.f8583a, i);
    }

    public void a(String str) {
        a(str, null);
    }

    public void a(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f8583a, str, th);
        }
    }

    public void b(String str) {
        b(str, null);
    }

    public void b(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f8583a, str, th);
        }
    }

    public void c(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f8583a, str, th);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void d(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f8583a, str, th);
        }
    }
}
