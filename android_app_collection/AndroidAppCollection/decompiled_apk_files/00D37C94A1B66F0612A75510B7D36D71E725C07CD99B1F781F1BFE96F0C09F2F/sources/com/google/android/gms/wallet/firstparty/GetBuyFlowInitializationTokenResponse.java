package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(11);
    byte[] a;

    GetBuyFlowInitializationTokenResponse() {
        this(new byte[0]);
    }

    public GetBuyFlowInitializationTokenResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.w(parcel, 2, this.a);
        tqj.n(parcel, m);
    }
}
