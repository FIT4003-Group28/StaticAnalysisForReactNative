package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements coof {
    public static final Parcelable.Creator<PlaceLikelihoodEntity> CREATOR = new copr();
    public final PlaceEntity a;
    public final float b;

    public PlaceLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.a = placeEntity;
        this.b = f;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihoodEntity)) {
            return false;
        }
        PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
        return this.a.equals(placeLikelihoodEntity.a) && this.b == placeLikelihoodEntity.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("place", this.a);
        b.a("likelihood", Float.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.i(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
