package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NetworkStateImpl> CREATOR = new cmvf();
    public final int a;
    public final int b;

    public NetworkStateImpl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        String num = Integer.toString(this.a);
        String num2 = Integer.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 41 + String.valueOf(num2).length());
        sb.append("ConnectionState = ");
        sb.append(num);
        sb.append(" NetworkMeteredState = ");
        sb.append(num2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
