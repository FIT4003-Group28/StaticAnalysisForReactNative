package c.e.a.b.d.e;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public final class u2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<u2> CREATOR = new v2();

    /* renamed from: b  reason: collision with root package name */
    private String f3997b;

    /* renamed from: c  reason: collision with root package name */
    private String f3998c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3999d;

    /* renamed from: e  reason: collision with root package name */
    private String f4000e;

    /* renamed from: f  reason: collision with root package name */
    private String f4001f;

    /* renamed from: g  reason: collision with root package name */
    private e3 f4002g;

    /* renamed from: h  reason: collision with root package name */
    private String f4003h;
    private String i;
    private long j;
    private long k;
    private boolean l;
    private com.google.firebase.auth.a1 m;
    private List<a3> n;

    public u2() {
        this.f4002g = new e3();
    }

    public u2(String str, String str2, boolean z, String str3, String str4, e3 e3Var, String str5, String str6, long j, long j2, boolean z2, com.google.firebase.auth.a1 a1Var, List<a3> list) {
        this.f3997b = str;
        this.f3998c = str2;
        this.f3999d = z;
        this.f4000e = str3;
        this.f4001f = str4;
        this.f4002g = e3Var == null ? new e3() : e3.a(e3Var);
        this.f4003h = str5;
        this.i = str6;
        this.j = j;
        this.k = j2;
        this.l = z2;
        this.m = a1Var;
        this.n = list == null ? w.f() : list;
    }

    public final String f() {
        return this.f3998c;
    }

    public final Uri g() {
        if (!TextUtils.isEmpty(this.f4001f)) {
            return Uri.parse(this.f4001f);
        }
        return null;
    }

    public final boolean j() {
        return this.f3999d;
    }

    public final String k() {
        return this.f4000e;
    }

    public final String q() {
        return this.f3997b;
    }

    public final String r() {
        return this.i;
    }

    public final long s() {
        return this.j;
    }

    public final long t() {
        return this.k;
    }

    public final boolean u() {
        return this.l;
    }

    public final List<c3> v() {
        return this.f4002g.f();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3997b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3998c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3999d);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f4000e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f4001f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, (Parcelable) this.f4002g, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.f4003h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, this.i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.j);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, this.l);
        com.google.android.gms.common.internal.x.c.a(parcel, 13, (Parcelable) this.m, i, false);
        com.google.android.gms.common.internal.x.c.b(parcel, 14, this.n, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }

    public final com.google.firebase.auth.a1 x() {
        return this.m;
    }

    public final List<a3> y() {
        return this.n;
    }
}
