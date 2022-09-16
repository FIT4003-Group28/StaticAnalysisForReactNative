package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: vbr  reason: default package */
/* loaded from: classes4.dex */
public final class vbr {
    final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    final boolean g;
    public final boolean h;
    final ampg i;

    public vbr(Uri uri) {
        this(uri, "", "", false, false, false);
    }

    public vbr(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = null;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = false;
        this.h = z3;
        this.i = null;
    }

    public final vbr a() {
        Uri uri = this.b;
        if (uri == null) {
            throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new vbr(uri, this.c, this.d, this.e, this.f, true);
    }

    public final vbr b() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new vbr(this.b, this.c, this.d, true, this.f, this.h);
    }

    public final vbt c(String str, double d) {
        return new vbn(this, str, Double.valueOf(d));
    }

    public final vbt d(String str, long j) {
        return new vbl(this, str, Long.valueOf(j));
    }

    public final vbt e(String str, String str2) {
        return new vbo(this, str, str2);
    }

    public final vbt f(String str, boolean z) {
        return new vbm(this, str, Boolean.valueOf(z));
    }

    public final vbt g(String str, Object obj, vbq vbqVar) {
        return vbt.b(this, str, obj, vbqVar, true);
    }
}
