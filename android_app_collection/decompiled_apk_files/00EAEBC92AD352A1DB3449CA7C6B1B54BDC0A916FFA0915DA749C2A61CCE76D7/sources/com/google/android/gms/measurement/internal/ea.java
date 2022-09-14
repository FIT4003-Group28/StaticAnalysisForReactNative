package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ea implements Parcelable.Creator<fa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fa createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 6:
                    j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 7:
                    j2 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 8:
                    str5 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 9:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 10:
                    z2 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 11:
                    j6 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 12:
                    str6 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 13:
                    j3 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 14:
                    j4 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 15:
                    i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 16:
                    z3 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 17:
                    z4 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 18:
                    z5 = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 19:
                    str7 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 20:
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
                case 21:
                    bool = com.google.android.gms.common.internal.x.b.f(parcel, a2);
                    break;
                case 22:
                    j5 = com.google.android.gms.common.internal.x.b.l(parcel, a2);
                    break;
                case 23:
                    arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2);
                    break;
                case 24:
                    str8 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new fa(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fa[] newArray(int i) {
        return new fa[i];
    }
}
