package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UdcSettingDisplayInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UdcSettingDisplayInfoRequest> CREATOR = new cpdx();
    public final int a;
    public final int b;
    public final String c;
    public String d;

    public UdcSettingDisplayInfoRequest(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.c(parcel, d);
    }
}
