package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxi(2);
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.p(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.t(parcel, 6, this.e);
        tqj.s(parcel, 7, this.f);
        tqj.n(parcel, m);
    }
}
