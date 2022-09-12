package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UdcCacheRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UdcCacheRequest> CREATOR = new cpds();
    public final int[] a;

    public UdcCacheRequest(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheRequest)) {
            return false;
        }
        return Arrays.equals(this.a, ((UdcCacheRequest) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("SettingId", Arrays.toString(this.a));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.q(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
