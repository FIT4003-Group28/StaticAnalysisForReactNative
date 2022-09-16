package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwl();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    @Deprecated
    String i;
    String j;
    int k;
    ArrayList l;
    TimeInterval m;
    ArrayList n;
    @Deprecated
    String o;
    @Deprecated
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    LoyaltyPoints v;

    LoyaltyWalletObject() {
        this.l = tqn.f();
        this.n = tqn.f();
        this.q = tqn.f();
        this.s = tqn.f();
        this.t = tqn.f();
        this.u = tqn.f();
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
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
        tqj.F(parcel, 11, this.j);
        tqj.s(parcel, 12, this.k);
        tqj.J(parcel, 13, this.l);
        tqj.E(parcel, 14, this.m, i);
        tqj.J(parcel, 15, this.n);
        tqj.F(parcel, 16, this.o);
        tqj.F(parcel, 17, this.p);
        tqj.J(parcel, 18, this.q);
        tqj.o(parcel, 19, this.r);
        tqj.J(parcel, 20, this.s);
        tqj.J(parcel, 21, this.t);
        tqj.J(parcel, 22, this.u);
        tqj.E(parcel, 23, this.v, i);
        tqj.n(parcel, m);
    }
}
