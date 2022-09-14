package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s1 implements Parcelable.Creator<m0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
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
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 6:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new m0(str, str2, z, str3, z2, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m0[] newArray(int i) {
        return new m0[i];
    }
}
