package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    DeviceOrientationRequest c;
    List<ClientIdentity> d;
    String e;
    public static final List<ClientIdentity> a = Collections.emptyList();
    public static final DeviceOrientationRequest b = new DeviceOrientationRequest();
    public static final Parcelable.Creator<DeviceOrientationRequestInternal> CREATOR = new colz();

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest, List<ClientIdentity> list, String str) {
        this.c = deviceOrientationRequest;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceOrientationRequestInternal)) {
            return false;
        }
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) obj;
        return cnvv.a(this.c, deviceOrientationRequestInternal.c) && cnvv.a(this.d, deviceOrientationRequestInternal.d) && cnvv.a(this.e, deviceOrientationRequestInternal.e);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'");
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.c, i);
        cnwn.y(parcel, 2, this.d);
        cnwn.k(parcel, 3, this.e, false);
        cnwn.c(parcel, d);
    }
}
