package com.google.android.apps.gmm.locationsharing.interprocess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ShareCreationPrerequisitesState implements SafeParcelable {
    public static final Parcelable.Creator<ShareCreationPrerequisitesState> CREATOR = new ahzb();
    final int a;
    public final String b;
    public final List<Integer> c;
    public final int d;

    public ShareCreationPrerequisitesState(String str, int i, List<Integer> list) {
        this(str, i, list, 1);
    }

    public ShareCreationPrerequisitesState(String str, int i, List<Integer> list, int i2) {
        this.b = str;
        this.d = i;
        this.c = list;
        this.a = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("version", this.a);
        b.b("obfuscatedGaiaId", this.b);
        b.f("state", this.d);
        b.b("unmetPrerequisites", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.r(parcel, 6, this.c);
        cnwn.g(parcel, 7, this.d);
        cnwn.c(parcel, d);
    }
}
