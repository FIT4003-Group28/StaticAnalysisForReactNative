package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new cokp();
    public final List<ParcelableGeofence> a;
    public final int b;
    public final String c;

    public GeofencingRequest(List<ParcelableGeofence> list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.a);
        int i = this.b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.c);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.c(parcel, d);
    }
}
