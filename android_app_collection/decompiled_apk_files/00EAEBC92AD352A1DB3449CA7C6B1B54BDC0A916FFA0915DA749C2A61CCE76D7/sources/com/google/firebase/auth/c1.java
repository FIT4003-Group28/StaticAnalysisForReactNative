package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public final class c1 implements Parcelable.Creator<a1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        k3 k3Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    k3Var = (k3) com.google.android.gms.common.internal.x.b.a(parcel, a2, k3.CREATOR);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new a1(str, str2, str3, k3Var, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a1[] newArray(int i) {
        return new a1[i];
    }
}
