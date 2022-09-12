package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new colk();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.e(parcel, 4, this.d);
        cnwn.e(parcel, 5, this.e);
        cnwn.e(parcel, 6, this.f);
        cnwn.c(parcel, d);
    }
}
