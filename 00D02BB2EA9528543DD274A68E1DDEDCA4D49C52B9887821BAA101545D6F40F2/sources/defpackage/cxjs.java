package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cxjs  reason: default package */
/* loaded from: classes.dex */
public final class cxjs {
    public final String a;
    public final Uri b;
    final String c;
    public final String d;
    public final boolean e;
    final boolean f;
    final boolean g;
    public final boolean h;
    @dzsi
    final dbrn<Context, Boolean> i;

    public cxjs(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public cxjs(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = false;
        this.g = false;
        this.h = z2;
        this.i = null;
    }

    public final cxjs a(String str) {
        return new cxjs(this.a, this.b, this.c, str, this.e, this.h);
    }

    public final cxjs b() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new cxjs(this.a, this.b, this.c, this.d, true, this.h);
    }

    public final cxjs c() {
        Uri uri = this.b;
        if (uri == null) {
            throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new cxjs(this.a, uri, this.c, this.d, this.e, true);
    }

    public final cxju<Boolean> d(String str, boolean z) {
        return cxju.h(this, str, z, false);
    }

    public final cxju<Integer> e(String str, int i) {
        return new cxjm(this, str, Integer.valueOf(i));
    }

    public final cxju<Double> f(String str, double d) {
        return cxju.i(this, str, d, false);
    }

    public final cxju<Long> g(String str, long j) {
        return cxju.g(this, str, j, true);
    }

    public final cxju<Boolean> h(String str, boolean z) {
        return cxju.h(this, str, z, true);
    }

    public final cxju<Double> i(String str, double d) {
        return cxju.i(this, str, d, true);
    }

    public final cxju<String> j(String str, String str2) {
        return cxju.j(this, str, str2, true);
    }

    public final <T> cxju<T> k(String str, T t, cxjr<T> cxjrVar) {
        return cxju.k(this, str, t, cxjrVar, true);
    }

    public cxjs(String str) {
        this(str, null, "", "", false, false);
    }
}
