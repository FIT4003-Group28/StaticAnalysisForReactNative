package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator<u0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 2) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 4) {
                z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new u0(str, str2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0[] newArray(int i) {
        return new u0[i];
    }
}
