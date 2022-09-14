package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetSecurityParamsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSecurityParamsResponse> CREATOR = new cpal();
    boolean a;
    boolean b;

    public GetSecurityParamsResponse(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
