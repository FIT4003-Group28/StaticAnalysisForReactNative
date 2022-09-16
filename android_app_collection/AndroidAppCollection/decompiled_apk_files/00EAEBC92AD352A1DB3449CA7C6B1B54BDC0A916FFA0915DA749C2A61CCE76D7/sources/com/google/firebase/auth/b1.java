package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n0;
/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator<n0.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0.a createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            com.google.android.gms.common.internal.x.b.a(a2);
            com.google.android.gms.common.internal.x.b.o(parcel, a2);
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new n0.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0.a[] newArray(int i) {
        return new n0.a[i];
    }
}
