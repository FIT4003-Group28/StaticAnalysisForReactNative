package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class NetworkLocationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfn(5);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public NetworkLocationStatus(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NetworkLocationStatus) {
            NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus) obj;
            if (this.a == networkLocationStatus.a && this.b == networkLocationStatus.b && this.c == networkLocationStatus.c && this.d == networkLocationStatus.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.d;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(147);
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        sb.append(" elapsed time NS: ");
        sb.append(j);
        sb.append(" system time ms: ");
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.t(parcel, 3, this.c);
        tqj.t(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
