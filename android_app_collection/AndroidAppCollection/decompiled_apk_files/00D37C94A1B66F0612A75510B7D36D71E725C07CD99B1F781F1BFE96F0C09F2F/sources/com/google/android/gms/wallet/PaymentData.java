package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(7);
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.E(parcel, 2, this.b, i);
        tqj.E(parcel, 3, this.c, i);
        tqj.E(parcel, 4, this.d, i);
        tqj.F(parcel, 5, this.e);
        tqj.v(parcel, 6, this.f);
        tqj.F(parcel, 7, this.g);
        tqj.v(parcel, 8, this.h);
        tqj.n(parcel, m);
    }
}
