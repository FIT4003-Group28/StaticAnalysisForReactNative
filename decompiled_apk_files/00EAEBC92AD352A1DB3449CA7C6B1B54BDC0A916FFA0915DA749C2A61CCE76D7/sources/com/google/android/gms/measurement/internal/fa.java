package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public final class fa extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<fa> CREATOR = new ea();

    /* renamed from: b  reason: collision with root package name */
    public final String f7303b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7304c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7305d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7306e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7307f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7308g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7309h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final String l;
    public final long m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final Boolean t;
    public final long u;
    public final List<String> v;
    public final String w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        com.google.android.gms.common.internal.s.b(str);
        this.f7303b = str;
        this.f7304c = TextUtils.isEmpty(str2) ? null : str2;
        this.f7305d = str3;
        this.k = j;
        this.f7306e = str4;
        this.f7307f = j2;
        this.f7308g = j3;
        this.f7309h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j6;
        this.v = list;
        this.w = str8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f7303b = str;
        this.f7304c = str2;
        this.f7305d = str3;
        this.k = j3;
        this.f7306e = str4;
        this.f7307f = j;
        this.f7308g = j2;
        this.f7309h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j6;
        this.v = list;
        this.w = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7303b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f7304c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7305d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f7306e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f7307f);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f7308g);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.f7309h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, this.i);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.j);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, this.l, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 13, this.m);
        com.google.android.gms.common.internal.x.c.a(parcel, 14, this.n);
        com.google.android.gms.common.internal.x.c.a(parcel, 15, this.o);
        com.google.android.gms.common.internal.x.c.a(parcel, 16, this.p);
        com.google.android.gms.common.internal.x.c.a(parcel, 17, this.q);
        com.google.android.gms.common.internal.x.c.a(parcel, 18, this.r);
        com.google.android.gms.common.internal.x.c.a(parcel, 19, this.s, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 21, this.t, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 22, this.u);
        com.google.android.gms.common.internal.x.c.a(parcel, 23, this.v, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 24, this.w, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
