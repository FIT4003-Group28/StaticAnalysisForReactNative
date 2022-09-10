package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new colh();
    public final boolean a;
    public final boolean b;
    public LocationSettingsConfiguration c;
    private final List<LocationRequest> d;

    public LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, LocationSettingsConfiguration locationSettingsConfiguration) {
        this.d = list;
        this.a = z;
        this.b = z2;
        this.c = locationSettingsConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 1, Collections.unmodifiableList(this.d));
        cnwn.e(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.u(parcel, 5, this.c, i);
        cnwn.c(parcel, d);
    }
}
