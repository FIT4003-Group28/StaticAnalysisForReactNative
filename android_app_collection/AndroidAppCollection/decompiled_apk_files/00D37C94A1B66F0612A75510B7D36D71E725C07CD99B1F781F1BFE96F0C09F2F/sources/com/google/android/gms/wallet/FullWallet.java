package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(2);
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    UserAddress h;
    UserAddress i;
    InstrumentInfo[] j;
    PaymentMethodToken k;

    private FullWallet() {
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.b = str2;
        this.c = proxyCard;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.E(parcel, 4, this.c, i);
        tqj.F(parcel, 5, this.d);
        tqj.E(parcel, 6, this.e, i);
        tqj.E(parcel, 7, this.f, i);
        tqj.G(parcel, 8, this.g);
        tqj.E(parcel, 9, this.h, i);
        tqj.E(parcel, 10, this.i, i);
        tqj.I(parcel, 11, this.j, i);
        tqj.E(parcel, 12, this.k, i);
        tqj.n(parcel, m);
    }
}
