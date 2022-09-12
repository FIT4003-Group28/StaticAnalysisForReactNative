package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetActivityControlsSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetActivityControlsSettingsResult> CREATOR = new cocf();
    public final byte[] a;

    public GetActivityControlsSettingsResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.l(parcel, 1, this.a, false);
        cnwn.c(parcel, d);
    }
}
