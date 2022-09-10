package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class PlaceUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceUserData> CREATOR = new coqa();
    public final String a;
    public final String b;
    public final List<PlaceAlias> c;

    public PlaceUserData(String str, String str2, List<PlaceAlias> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceUserData)) {
            return false;
        }
        PlaceUserData placeUserData = (PlaceUserData) obj;
        return this.a.equals(placeUserData.a) && this.b.equals(placeUserData.b) && this.c.equals(placeUserData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("accountName", this.a);
        b.a("placeId", this.b);
        b.a("placeAliases", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.y(parcel, 6, this.c);
        cnwn.c(parcel, d);
    }
}
