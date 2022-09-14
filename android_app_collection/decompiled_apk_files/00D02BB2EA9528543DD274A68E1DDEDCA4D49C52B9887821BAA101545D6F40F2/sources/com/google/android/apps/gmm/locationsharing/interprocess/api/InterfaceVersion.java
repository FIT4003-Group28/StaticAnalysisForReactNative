package com.google.android.apps.gmm.locationsharing.interprocess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InterfaceVersion implements SafeParcelable {
    public static final Parcelable.Creator<InterfaceVersion> CREATOR = new ahyz();
    final int a;
    public final int b;

    public InterfaceVersion(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("parcelableVersion", this.a);
        b.f("interfaceVersion", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
