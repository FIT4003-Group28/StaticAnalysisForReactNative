package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                i2 = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            } else if (a3 == 2) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.x.b.a(parcel, a2, PendingIntent.CREATOR);
            } else if (a3 != 1000) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new Status(i, i2, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
