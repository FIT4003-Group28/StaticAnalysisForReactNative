package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class PlaceAlias extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceAlias> CREATOR = new copy();
    public final String a;

    static {
        new PlaceAlias("Home");
        new PlaceAlias("Work");
    }

    public PlaceAlias(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceAlias) {
            return cnvv.a(this.a, ((PlaceAlias) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("alias", this.a);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.c(parcel, d);
    }
}
