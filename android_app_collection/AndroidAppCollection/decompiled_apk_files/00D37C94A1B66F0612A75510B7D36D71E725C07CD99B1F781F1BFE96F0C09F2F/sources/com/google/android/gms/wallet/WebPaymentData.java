package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebPaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(10);
    String a;
    Bundle b;

    private WebPaymentData() {
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.v(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
