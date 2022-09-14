package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        o oVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 2) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                oVar = (o) com.google.android.gms.common.internal.x.b.a(parcel, a2, o.CREATOR);
            } else if (a3 == 4) {
                str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                j = com.google.android.gms.common.internal.x.b.l(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new p(str, oVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i) {
        return new p[i];
    }
}
