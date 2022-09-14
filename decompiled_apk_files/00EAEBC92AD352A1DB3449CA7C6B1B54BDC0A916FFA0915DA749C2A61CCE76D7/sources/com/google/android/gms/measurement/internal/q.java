package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                bundle = com.google.android.gms.common.internal.x.b.a(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new o(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i) {
        return new o[i];
    }
}
