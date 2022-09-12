package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator<NearbyAlertFilter> CREATOR = new cony();
    final List<String> a;
    final List<Integer> b;
    final String c;
    final boolean d;
    final Set<String> e;
    final Set<Integer> f;

    public NearbyAlertFilter(List<String> list, List<Integer> list2, String str, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = z;
        this.e = a(list);
        this.f = a(list2);
    }

    public static NearbyAlertFilter b(Collection<Integer> collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (Integer num : collection) {
                if (num != null) {
                    arrayList.add(num);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place type to match results with.");
            }
            return new NearbyAlertFilter(null, arrayList, null, false);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place types to match results with.");
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertFilter)) {
            return false;
        }
        NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
        return (this.c != null || nearbyAlertFilter.c == null) && this.f.equals(nearbyAlertFilter.f) && this.e.equals(nearbyAlertFilter.e) && ((str = this.c) == null || str.equals(nearbyAlertFilter.c)) && this.d == nearbyAlertFilter.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.e, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        if (!this.f.isEmpty()) {
            b.a("types", this.f);
        }
        if (!this.e.isEmpty()) {
            b.a("placeIds", this.e);
        }
        String str = this.c;
        if (str != null) {
            b.a("chainName", str);
        }
        b.a("Beacon required: ", Boolean.valueOf(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.w(parcel, 1, this.a);
        cnwn.r(parcel, 2, this.b);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.e(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
