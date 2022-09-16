package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator<m0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                j2 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new m0(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m0[] newArray(int i) {
        return new m0[i];
    }
}
