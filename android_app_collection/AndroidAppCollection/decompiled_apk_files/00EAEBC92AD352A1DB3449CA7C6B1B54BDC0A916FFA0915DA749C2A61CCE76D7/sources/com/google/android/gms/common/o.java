package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 2) {
                i2 = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.x.b.a(parcel, a2, PendingIntent.CREATOR);
            } else if (a3 != 4) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new b(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
