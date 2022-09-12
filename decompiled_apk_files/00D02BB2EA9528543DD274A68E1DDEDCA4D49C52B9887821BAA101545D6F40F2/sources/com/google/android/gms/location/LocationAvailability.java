package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new cokz();
    @Deprecated
    int a;
    @Deprecated
    int b;
    long c;
    int d;
    public NetworkLocationStatus[] e;

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = networkLocationStatusArr;
    }

    public static boolean b(Intent intent) {
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean a() {
        return this.d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    public final String toString() {
        boolean a = a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.h(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.x(parcel, 5, this.e, i);
        cnwn.c(parcel, d);
    }
}
