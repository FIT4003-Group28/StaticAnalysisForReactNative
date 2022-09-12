package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CarRegionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarRegionId> CREATOR = new cneu();
    public final int a;
    public final CarDisplayId b;

    static {
        new CarRegionId(0, CarDisplayId.a);
        new CarRegionId(1, CarDisplayId.a);
    }

    public CarRegionId(int i, CarDisplayId carDisplayId) {
        this.a = i;
        this.b = carDisplayId;
    }

    public static CarRegionId a(CarDisplayId carDisplayId) {
        return new CarRegionId(0, carDisplayId);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CarRegionId) {
            CarRegionId carRegionId = (CarRegionId) obj;
            return this.b.equals(carRegionId.b) && carRegionId.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("CarRegionId{regionId=");
        sb.append(i);
        sb.append(" carDisplayId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.c(parcel, d);
    }
}
