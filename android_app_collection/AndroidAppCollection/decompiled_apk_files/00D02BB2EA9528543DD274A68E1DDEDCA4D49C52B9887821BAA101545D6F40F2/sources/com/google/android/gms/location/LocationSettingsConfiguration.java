package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class LocationSettingsConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsConfiguration> CREATOR = new colf();
    public final String a;
    public final String b;
    public final String c;

    public LocationSettingsConfiguration(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 5, this.c, false);
        cnwn.c(parcel, d);
    }
}
