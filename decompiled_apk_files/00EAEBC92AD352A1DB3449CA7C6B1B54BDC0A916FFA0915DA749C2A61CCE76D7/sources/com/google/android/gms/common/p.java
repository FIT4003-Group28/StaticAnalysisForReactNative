package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new d(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
