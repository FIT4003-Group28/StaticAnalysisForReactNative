package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetAvailableOtherPaymentMethodsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAvailableOtherPaymentMethodsResponse> CREATOR = new cpaf();
    int[] a;

    public GetAvailableOtherPaymentMethodsResponse(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.q(parcel, 1, this.a);
        cnwn.c(parcel, d);
    }
}
