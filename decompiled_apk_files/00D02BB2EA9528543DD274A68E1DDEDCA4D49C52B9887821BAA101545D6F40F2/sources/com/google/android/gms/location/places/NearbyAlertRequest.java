package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.filament.R;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NearbyAlertRequest> CREATOR = new conz();
    public final int a;
    public final int b;
    public final NearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public int f;

    public NearbyAlertRequest(int i, int i2, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i3, int i4) {
        this.f = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
        this.a = i;
        this.b = i2;
        if (nearbyAlertFilter != null) {
            this.c = nearbyAlertFilter;
        } else {
            NearbyAlertFilter nearbyAlertFilter2 = null;
            if (placeFilter != null) {
                Set<String> set = placeFilter.f;
                if (set == null || set.isEmpty()) {
                    Set<Integer> set2 = placeFilter.e;
                    if (set2 != null && !set2.isEmpty()) {
                        nearbyAlertFilter2 = NearbyAlertFilter.b(placeFilter.e);
                    }
                } else {
                    Set<String> set3 = placeFilter.f;
                    if (set3 != null) {
                        ArrayList arrayList = new ArrayList(set3.size());
                        for (String str : set3) {
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(str);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place ID to match results with.");
                        }
                        this.c = new NearbyAlertFilter(arrayList, null, null, false);
                    } else {
                        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place IDs to match results with.");
                    }
                }
            }
            this.c = nearbyAlertFilter2;
        }
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertRequest)) {
            return false;
        }
        NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
        return this.a == nearbyAlertRequest.a && this.b == nearbyAlertRequest.b && cnvv.a(this.c, nearbyAlertRequest.c) && this.f == nearbyAlertRequest.f && this.e == nearbyAlertRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("transitionTypes", Integer.valueOf(this.a));
        b.a("loiteringTimeMillis", Integer.valueOf(this.b));
        b.a("nearbyAlertFilter", this.c);
        b.a("priority", Integer.valueOf(this.f));
        b.a("radiusType", Integer.valueOf(this.e));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.u(parcel, 4, this.c, i);
        cnwn.e(parcel, 5, this.d);
        cnwn.g(parcel, 6, this.e);
        cnwn.g(parcel, 7, this.f);
        cnwn.c(parcel, d);
    }
}
