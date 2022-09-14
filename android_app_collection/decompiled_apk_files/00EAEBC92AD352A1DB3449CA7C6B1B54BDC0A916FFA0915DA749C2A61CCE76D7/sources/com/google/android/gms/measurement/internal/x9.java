package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x9 implements Parcelable.Creator<y9> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y9 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        Long l = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 3:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 4:
                    l = com.google.android.gms.common.internal.x.b.m(parcel, a2);
                    break;
                case 5:
                    f2 = com.google.android.gms.common.internal.x.b.i(parcel, a2);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 7:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 8:
                    d2 = com.google.android.gms.common.internal.x.b.g(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new y9(i, str, j, l, f2, str2, str3, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y9[] newArray(int i) {
        return new y9[i];
    }
}
