package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new c0(str, str2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int i) {
        return new c0[i];
    }
}
