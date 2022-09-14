package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.a1;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<q0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        ArrayList arrayList = null;
        t0 t0Var = null;
        String str = null;
        a1 a1Var = null;
        k0 k0Var = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, com.google.firebase.auth.o0.CREATOR);
            } else if (a3 == 2) {
                t0Var = (t0) com.google.android.gms.common.internal.x.b.a(parcel, a2, t0.CREATOR);
            } else if (a3 == 3) {
                str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
            } else if (a3 == 4) {
                a1Var = (a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, a1.CREATOR);
            } else if (a3 != 5) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                k0Var = (k0) com.google.android.gms.common.internal.x.b.a(parcel, a2, k0.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new q0(arrayList, t0Var, str, a1Var, k0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q0[] newArray(int i) {
        return new q0[i];
    }
}
