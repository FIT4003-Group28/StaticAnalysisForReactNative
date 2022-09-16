package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        IBinder iBinder = null;
        com.google.android.gms.common.b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 2) {
                iBinder = com.google.android.gms.common.internal.x.b.j(parcel, a2);
            } else if (a3 == 3) {
                bVar = (com.google.android.gms.common.b) com.google.android.gms.common.internal.x.b.a(parcel, a2, com.google.android.gms.common.b.CREATOR);
            } else if (a3 == 4) {
                z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new u(i, iBinder, bVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i) {
        return new u[i];
    }
}
