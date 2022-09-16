package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class Address extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(1);
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    String k;

    Address() {
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
        this.k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.F(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.F(parcel, 6, this.e);
        tqj.F(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.F(parcel, 9, this.h);
        tqj.F(parcel, 10, this.i);
        tqj.o(parcel, 11, this.j);
        tqj.F(parcel, 12, this.k);
        tqj.n(parcel, m);
    }
}
