package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CarDisplayId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayId> CREATOR = new cnet();
    public static final CarDisplayId a = new CarDisplayId(0);
    public final int b;

    public CarDisplayId(int i) {
        this.b = i;
    }

    public final String a() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(21);
        sb.append("DisplayId_");
        sb.append(i);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarDisplayId) && ((CarDisplayId) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(35);
        sb.append("CarDisplayId{displayId=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.b);
        cnwn.c(parcel, d);
    }
}
