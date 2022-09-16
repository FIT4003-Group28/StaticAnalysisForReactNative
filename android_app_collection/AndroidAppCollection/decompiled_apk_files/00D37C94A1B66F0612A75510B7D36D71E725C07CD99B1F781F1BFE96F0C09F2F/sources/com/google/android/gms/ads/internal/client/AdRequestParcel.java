package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qah();
    public final int a;
    @Deprecated
    public final long b;
    public final Bundle c;
    @Deprecated
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;
    @Deprecated
    public final boolean r;
    public final AdDataParcel s;
    public final int t;
    public final String u;
    public final List v;
    public final int w;
    public final String x;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, AdDataParcel adDataParcel, int i4, String str5, List list3, int i5, String str6) {
        this.a = i;
        this.b = j;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = searchAdRequestParcel;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = adDataParcel;
        this.t = i4;
        this.u = str5;
        this.v = list3 == null ? new ArrayList() : list3;
        this.w = i5;
        this.x = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.a == adRequestParcel.a && this.b == adRequestParcel.b && qge.c(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && tnk.j(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && tnk.j(this.i, adRequestParcel.i) && tnk.j(this.j, adRequestParcel.j) && tnk.j(this.k, adRequestParcel.k) && tnk.j(this.l, adRequestParcel.l) && qge.c(this.m, adRequestParcel.m) && qge.c(this.n, adRequestParcel.n) && tnk.j(this.o, adRequestParcel.o) && tnk.j(this.p, adRequestParcel.p) && tnk.j(this.q, adRequestParcel.q) && this.r == adRequestParcel.r && this.t == adRequestParcel.t && tnk.j(this.u, adRequestParcel.u) && tnk.j(this.v, adRequestParcel.v) && this.w == adRequestParcel.w && tnk.j(this.x, adRequestParcel.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w), this.x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.t(parcel, 2, this.b);
        tqj.v(parcel, 3, this.c);
        tqj.s(parcel, 4, this.d);
        tqj.H(parcel, 5, this.e);
        tqj.o(parcel, 6, this.f);
        tqj.s(parcel, 7, this.g);
        tqj.o(parcel, 8, this.h);
        tqj.F(parcel, 9, this.i);
        tqj.E(parcel, 10, this.j, i);
        tqj.E(parcel, 11, this.k, i);
        tqj.F(parcel, 12, this.l);
        tqj.v(parcel, 13, this.m);
        tqj.v(parcel, 14, this.n);
        tqj.H(parcel, 15, this.o);
        tqj.F(parcel, 16, this.p);
        tqj.F(parcel, 17, this.q);
        tqj.o(parcel, 18, this.r);
        tqj.E(parcel, 19, this.s, i);
        tqj.s(parcel, 20, this.t);
        tqj.F(parcel, 21, this.u);
        tqj.H(parcel, 22, this.v);
        tqj.s(parcel, 23, this.w);
        tqj.F(parcel, 24, this.x);
        tqj.n(parcel, m);
    }
}
