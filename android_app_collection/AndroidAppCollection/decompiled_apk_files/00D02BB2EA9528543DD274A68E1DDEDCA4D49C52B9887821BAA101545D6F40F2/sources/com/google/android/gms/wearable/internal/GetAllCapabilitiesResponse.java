package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAllCapabilitiesResponse> CREATOR = new cpif();
    public final int a;
    public final List<CapabilityInfoParcelable> b;

    public GetAllCapabilitiesResponse(int i, List<CapabilityInfoParcelable> list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.y(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
