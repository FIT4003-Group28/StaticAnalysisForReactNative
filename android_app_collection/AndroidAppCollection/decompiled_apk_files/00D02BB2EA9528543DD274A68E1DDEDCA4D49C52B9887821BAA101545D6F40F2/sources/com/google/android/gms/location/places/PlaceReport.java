package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new cooi();
    final int a;
    public final String b;
    public final String c;
    public final String d;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return cnvv.a(this.b, placeReport.b) && cnvv.a(this.c, placeReport.c) && cnvv.a(this.d, placeReport.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("placeId", this.b);
        b.a("tag", this.c);
        if (!"unknown".equals(this.d)) {
            b.a("source", this.d);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.c(parcel, d);
    }
}
