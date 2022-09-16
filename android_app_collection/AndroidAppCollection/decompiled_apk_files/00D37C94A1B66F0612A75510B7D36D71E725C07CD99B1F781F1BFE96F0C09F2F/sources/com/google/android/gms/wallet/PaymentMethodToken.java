package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(8);
    int a;
    String b;

    private PaymentMethodToken() {
    }

    public PaymentMethodToken(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
