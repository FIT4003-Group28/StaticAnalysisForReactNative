package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rjf();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Boolean r;
    public final long s;
    public final List t;
    public final String u;
    public final String v;

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        qnm.l(str);
        this.a = str;
        this.b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j6;
        this.t = list;
        this.u = str8;
        this.v = str9;
    }

    public AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j6;
        this.t = list;
        this.u = str8;
        this.v = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.F(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.t(parcel, 6, this.e);
        tqj.t(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.o(parcel, 9, this.h);
        tqj.o(parcel, 10, this.i);
        tqj.t(parcel, 11, this.j);
        tqj.F(parcel, 12, this.k);
        tqj.t(parcel, 13, this.l);
        tqj.t(parcel, 14, this.m);
        tqj.s(parcel, 15, this.n);
        tqj.o(parcel, 16, this.o);
        tqj.o(parcel, 18, this.p);
        tqj.F(parcel, 19, this.q);
        tqj.u(parcel, 21, this.r);
        tqj.t(parcel, 22, this.s);
        tqj.H(parcel, 23, this.t);
        tqj.F(parcel, 24, this.u);
        tqj.F(parcel, 25, this.v);
        tqj.n(parcel, m);
    }
}
