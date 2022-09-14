package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            if (com.google.android.gms.common.internal.x.b.a(a2) != 1) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, com.google.firebase.auth.o0.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new o(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i) {
        return new o[i];
    }
}
