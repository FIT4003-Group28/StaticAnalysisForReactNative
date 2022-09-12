package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarInfo> CREATOR = new cmwj();
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;

    public CarInfo() {
    }

    public CarInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = str9;
        this.q = str10;
    }

    public final String toString() {
        return this.c + " " + this.a + " " + this.b + " " + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.g(parcel, 5, this.e);
        cnwn.g(parcel, 6, this.f);
        cnwn.e(parcel, 7, this.g);
        cnwn.g(parcel, 8, this.h);
        cnwn.k(parcel, 9, this.i, false);
        cnwn.k(parcel, 10, this.j, false);
        cnwn.k(parcel, 11, this.k, false);
        cnwn.k(parcel, 12, this.l, false);
        cnwn.e(parcel, 13, this.m);
        cnwn.e(parcel, 14, this.n);
        cnwn.e(parcel, 15, this.o);
        cnwn.k(parcel, 16, this.p, false);
        cnwn.k(parcel, 17, this.q, false);
        cnwn.c(parcel, d);
    }
}
