package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaceExtendedDetailsEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceExtendedDetailsEntity> CREATOR = new copq();
    public final List<Integer> a;
    public final String b;
    public final Uri c;
    public final float d;
    public final int e;

    public PlaceExtendedDetailsEntity(List<Integer> list, String str, Uri uri, float f, int i) {
        this.a = Collections.unmodifiableList(list);
        this.b = str;
        this.c = uri;
        this.d = f;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.r(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.u(parcel, 3, this.c, i);
        cnwn.i(parcel, 4, this.d);
        cnwn.g(parcel, 5, this.e);
        cnwn.c(parcel, d);
    }
}
