package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj();
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    private CardInfo() {
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.s(parcel, 4, this.d);
        tqj.E(parcel, 5, this.e, i);
        tqj.n(parcel, m);
    }
}
