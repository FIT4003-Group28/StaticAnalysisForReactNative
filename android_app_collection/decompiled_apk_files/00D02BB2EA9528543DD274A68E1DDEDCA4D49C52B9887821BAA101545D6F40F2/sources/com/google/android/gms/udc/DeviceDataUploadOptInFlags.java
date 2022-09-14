package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceDataUploadOptInFlags> CREATOR = new cpdg();
    public final boolean a;
    public final boolean b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
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
