package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d1 implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 2) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 4) {
                str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new j(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
