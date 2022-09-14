package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new cmui();
    final int a;
    public String b;

    public ClearTokenRequest() {
        this.a = 1;
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.c(parcel, d);
    }
}
