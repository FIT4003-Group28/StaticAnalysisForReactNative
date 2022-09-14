package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.a1;
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        k0 k0Var = null;
        c0 c0Var = null;
        a1 a1Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                k0Var = (k0) com.google.android.gms.common.internal.x.b.a(parcel, a2, k0.CREATOR);
            } else if (a3 == 2) {
                c0Var = (c0) com.google.android.gms.common.internal.x.b.a(parcel, a2, c0.CREATOR);
            } else if (a3 != 3) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                a1Var = (a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, a1.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new e0(k0Var, c0Var, a1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i) {
        return new e0[i];
    }
}
