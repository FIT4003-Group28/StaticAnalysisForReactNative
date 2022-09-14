package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 3:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 4:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 8:
                    str6 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 9:
                    i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 10:
                    str7 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new e(str, str2, str3, str4, z, str5, z2, str6, i, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i) {
        return new e[i];
    }
}
