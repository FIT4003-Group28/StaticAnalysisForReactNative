package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(4);
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    UserAddress i;
    UserAddress j;
    InstrumentInfo[] k;

    private MaskedWallet() {
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = loyaltyWalletObjectArr;
        this.h = offerWalletObjectArr;
        this.i = userAddress;
        this.j = userAddress2;
        this.k = instrumentInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.G(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.E(parcel, 6, this.e, i);
        tqj.E(parcel, 7, this.f, i);
        tqj.I(parcel, 8, this.g, i);
        tqj.I(parcel, 9, this.h, i);
        tqj.E(parcel, 10, this.i, i);
        tqj.E(parcel, 11, this.j, i);
        tqj.I(parcel, 12, this.k, i);
        tqj.n(parcel, m);
    }
}
