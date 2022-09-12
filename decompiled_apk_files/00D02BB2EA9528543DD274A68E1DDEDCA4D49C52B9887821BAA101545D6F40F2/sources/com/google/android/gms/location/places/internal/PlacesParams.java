package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlacesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlacesParams> CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    static {
        new PlacesParams("com.google.android.gms", Locale.getDefault().toLanguageTag(), null, null, cnmq.b, 0);
        CREATOR = new copw();
    }

    public PlacesParams(String str, String str2, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(str, locale.toLanguageTag(), str2, null, cnmq.b, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PlacesParams)) {
            PlacesParams placesParams = (PlacesParams) obj;
            if (this.e == placesParams.e && this.f == placesParams.f && this.b.equals(placesParams.b) && this.a.equals(placesParams.a) && cnvv.a(this.c, placesParams.c) && cnvv.a(this.d, placesParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("clientPackageName", this.a);
        b.a("locale", this.b);
        b.a("accountName", this.c);
        b.a("gCoreClientName", this.d);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.g(parcel, 6, this.e);
        cnwn.g(parcel, 7, this.f);
        cnwn.c(parcel, d);
    }
}
