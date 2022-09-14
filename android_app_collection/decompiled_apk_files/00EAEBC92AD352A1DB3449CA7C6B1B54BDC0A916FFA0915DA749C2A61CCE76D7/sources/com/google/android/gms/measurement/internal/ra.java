package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ra implements Parcelable.Creator<oa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oa createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        y9 y9Var = null;
        String str3 = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 2:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 4:
                    y9Var = (y9) com.google.android.gms.common.internal.x.b.a(parcel, a2, y9.CREATOR);
                    break;
                case 5:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 7:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 8:
                    pVar = (p) com.google.android.gms.common.internal.x.b.a(parcel, a2, p.CREATOR);
                    break;
                case 9:
                    j2 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 10:
                    pVar2 = (p) com.google.android.gms.common.internal.x.b.a(parcel, a2, p.CREATOR);
                    break;
                case 11:
                    j3 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 12:
                    pVar3 = (p) com.google.android.gms.common.internal.x.b.a(parcel, a2, p.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new oa(str, str2, y9Var, j, z, str3, pVar, j2, pVar2, j3, pVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oa[] newArray(int i) {
        return new oa[i];
    }
}
