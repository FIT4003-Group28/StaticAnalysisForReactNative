package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new cowi();
    public final int a;
    public final String b;

    public SyncStatus(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.c(parcel, d);
    }
}
