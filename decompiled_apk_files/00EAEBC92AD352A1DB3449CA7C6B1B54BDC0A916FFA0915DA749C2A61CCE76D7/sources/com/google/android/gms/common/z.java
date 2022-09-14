package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                iBinder = com.google.android.gms.common.internal.x.b.j(parcel, a2);
            } else if (a3 == 3) {
                z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            } else if (a3 != 4) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new y(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i) {
        return new y[i];
    }
}
