package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCapabilityResponse> CREATOR = new cpig();
    public final int a;
    public final CapabilityInfoParcelable b;

    public GetCapabilityResponse(int i, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.a = i;
        this.b = capabilityInfoParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
