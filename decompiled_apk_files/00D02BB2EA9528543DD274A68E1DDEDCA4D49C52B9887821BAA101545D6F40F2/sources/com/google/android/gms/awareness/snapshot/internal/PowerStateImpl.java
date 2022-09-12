package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PowerStateImpl> CREATOR = new cmvg();
    public final int a;
    public final double b;

    public PowerStateImpl(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final String toString() {
        String num = Integer.toString(this.a);
        double d = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 69);
        sb.append("PowerConnectionState = ");
        sb.append(num);
        sb.append(" Battery Percentage = ");
        sb.append(d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.j(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
