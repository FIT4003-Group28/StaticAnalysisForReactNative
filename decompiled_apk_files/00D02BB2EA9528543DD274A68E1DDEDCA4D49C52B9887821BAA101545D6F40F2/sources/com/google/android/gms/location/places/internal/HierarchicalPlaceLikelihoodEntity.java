package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HierarchicalPlaceLikelihoodEntity extends AbstractSafeParcelable implements cntw {
    public static final Parcelable.Creator<HierarchicalPlaceLikelihoodEntity> CREATOR;
    public final PlaceEntity a;
    public final float b;
    final float c;
    final int d;
    final List<String> e;

    static {
        Collections.emptyList();
        CREATOR = new copb();
    }

    public HierarchicalPlaceLikelihoodEntity(PlaceEntity placeEntity, float f, float f2, int i, List<String> list) {
        this.a = placeEntity;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = list;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HierarchicalPlaceLikelihoodEntity)) {
            return false;
        }
        HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) obj;
        return this.a.equals(hierarchicalPlaceLikelihoodEntity.a) && this.b == hierarchicalPlaceLikelihoodEntity.b && this.c == hierarchicalPlaceLikelihoodEntity.c && this.d == hierarchicalPlaceLikelihoodEntity.d && this.e.equals(hierarchicalPlaceLikelihoodEntity.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("place", this.a);
        b.a("likelihood", Float.valueOf(this.b));
        b.a("hierarchyLikelihood", Float.valueOf(this.c));
        b.a("hierarchyLevel", Integer.valueOf(this.d));
        b.a("containedPlaceIds", this.e.toString());
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.i(parcel, 2, this.b);
        cnwn.i(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.w(parcel, 5, this.e);
        cnwn.c(parcel, d);
    }
}
