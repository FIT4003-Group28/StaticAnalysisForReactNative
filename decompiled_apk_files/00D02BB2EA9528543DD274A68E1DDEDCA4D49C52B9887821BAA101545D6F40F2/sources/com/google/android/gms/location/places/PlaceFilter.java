package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class PlaceFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator<PlaceFilter> CREATOR = new cooe();
    final List<Integer> a;
    final boolean b;
    final List<UserDataType> c;
    final List<String> d;
    public final Set<Integer> e;
    public final Set<String> f;
    private final Set<UserDataType> g;

    static {
        new PlaceFilter();
    }

    public PlaceFilter() {
        this(Collections.emptyList(), false, Collections.emptyList(), Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.e.equals(placeFilter.e) && this.b == placeFilter.b && this.g.equals(placeFilter.g) && this.f.equals(placeFilter.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Boolean.valueOf(this.b), this.g, this.f});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        if (!this.e.isEmpty()) {
            b.a("types", this.e);
        }
        b.a("requireOpenNow", Boolean.valueOf(this.b));
        if (!this.f.isEmpty()) {
            b.a("placeIds", this.f);
        }
        if (!this.g.isEmpty()) {
            b.a("requestedUserDataTypes", this.g);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.r(parcel, 1, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.y(parcel, 4, this.c);
        cnwn.w(parcel, 6, this.d);
        cnwn.c(parcel, d);
    }

    public PlaceFilter(List<Integer> list, boolean z, List<String> list2, List<UserDataType> list3) {
        this.a = list;
        this.b = z;
        this.c = list3;
        this.d = list2;
        this.e = a(list);
        this.g = a(list3);
        this.f = a(list2);
    }
}
