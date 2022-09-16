package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceRequest> CREATOR = new cook();
    public final PlaceFilter a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public PlaceRequest(PlaceFilter placeFilter, long j, int i, long j2, boolean z, boolean z2) {
        this.a = placeFilter;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceRequest)) {
            return false;
        }
        PlaceRequest placeRequest = (PlaceRequest) obj;
        return cnvv.a(this.a, placeRequest.a) && this.b == placeRequest.b && this.c == placeRequest.c && this.d == placeRequest.d && this.e == placeRequest.e && this.f == placeRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("filter", this.a);
        b.a("interval", Long.valueOf(this.b));
        b.a("priority", Integer.valueOf(this.c));
        b.a("expireAt", Long.valueOf(this.d));
        b.a("receiveFailures", Boolean.valueOf(this.e));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.h(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.h(parcel, 5, this.d);
        cnwn.e(parcel, 6, this.e);
        cnwn.e(parcel, 7, this.f);
        cnwn.c(parcel, d);
    }
}
