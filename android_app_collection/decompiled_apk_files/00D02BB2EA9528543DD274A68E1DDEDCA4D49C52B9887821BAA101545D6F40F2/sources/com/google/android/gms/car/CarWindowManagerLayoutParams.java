package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarWindowManagerLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarWindowManagerLayoutParams> CREATOR = new cmwx();
    public int a;

    public CarWindowManagerLayoutParams() {
    }

    public CarWindowManagerLayoutParams(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((CarWindowManagerLayoutParams) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(59);
        sb.append("CarWindowManagerLayoutParams{windowLayoutFlags=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.c(parcel, d);
    }
}
