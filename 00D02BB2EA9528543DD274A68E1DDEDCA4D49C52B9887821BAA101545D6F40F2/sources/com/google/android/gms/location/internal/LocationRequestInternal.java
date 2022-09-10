package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public LocationRequest b;
    List<ClientIdentity> c;
    String d;
    boolean e;
    boolean f;
    boolean g;
    String h;
    boolean i;
    public boolean j;
    public String k;
    public long l;
    public static final List<ClientIdentity> a = Collections.emptyList();
    public static final Parcelable.Creator<LocationRequestInternal> CREATOR = new cons();

    public LocationRequestInternal(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = j;
    }

    public static LocationRequestInternal a(LocationRequest locationRequest) {
        return new LocationRequestInternal(locationRequest, a, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequestInternal)) {
            return false;
        }
        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
        return cnvv.a(this.b, locationRequestInternal.b) && cnvv.a(this.c, locationRequestInternal.c) && cnvv.a(this.d, locationRequestInternal.d) && this.e == locationRequestInternal.e && this.f == locationRequestInternal.f && this.g == locationRequestInternal.g && cnvv.a(this.h, locationRequestInternal.h) && this.i == locationRequestInternal.i && this.j == locationRequestInternal.j && cnvv.a(this.k, locationRequestInternal.k);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.b, i);
        cnwn.y(parcel, 5, this.c);
        cnwn.k(parcel, 6, this.d, false);
        cnwn.e(parcel, 7, this.e);
        cnwn.e(parcel, 8, this.f);
        cnwn.e(parcel, 9, this.g);
        cnwn.k(parcel, 10, this.h, false);
        cnwn.e(parcel, 11, this.i);
        cnwn.e(parcel, 12, this.j);
        cnwn.k(parcel, 13, this.k, false);
        cnwn.h(parcel, 14, this.l);
        cnwn.c(parcel, d);
    }
}
