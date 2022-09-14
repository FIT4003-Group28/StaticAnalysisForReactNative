package com.google.android.gms.learning.internal.secagg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PRFInputVectorSpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PRFInputVectorSpecification> CREATOR = new coia();
    public final int a;
    public final int b;
    public final String c;

    public PRFInputVectorSpecification(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.c(parcel, d);
    }
}
