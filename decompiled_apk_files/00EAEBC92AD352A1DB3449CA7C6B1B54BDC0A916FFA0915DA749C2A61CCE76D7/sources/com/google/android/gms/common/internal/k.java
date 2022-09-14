package com.google.android.gms.common.internal;

import android.util.Log;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f7035a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7036b;

    public k(String str) {
        this(str, null);
    }

    public k(String str, String str2) {
        s.a(str, (Object) "log tag cannot be null");
        s.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f7035a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f7036b = null;
        } else {
            this.f7036b = str2;
        }
    }

    private final String a(String str) {
        String str2 = this.f7036b;
        return str2 == null ? str : str2.concat(str);
    }

    public final void a(String str, String str2) {
        if (a(3)) {
            Log.d(str, a(str2));
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, a(str2), th);
        }
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.f7035a, i);
    }

    public final void b(String str, String str2) {
        if (a(6)) {
            Log.e(str, a(str2));
        }
    }

    public final void c(String str, String str2) {
        if (a(2)) {
            Log.v(str, a(str2));
        }
    }
}
