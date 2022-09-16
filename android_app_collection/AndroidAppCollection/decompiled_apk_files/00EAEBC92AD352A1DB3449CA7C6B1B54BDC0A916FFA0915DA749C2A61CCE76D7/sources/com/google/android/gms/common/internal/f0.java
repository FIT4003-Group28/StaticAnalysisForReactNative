package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        Bundle bundle = null;
        com.google.android.gms.common.d[] dVarArr = null;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.x.b.a(a2);
            if (a3 == 1) {
                bundle = com.google.android.gms.common.internal.x.b.a(parcel, a2);
            } else if (a3 != 2) {
                com.google.android.gms.common.internal.x.b.o(parcel, a2);
            } else {
                dVarArr = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.x.b.b(parcel, a2, com.google.android.gms.common.d.CREATOR);
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new e0(bundle, dVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i) {
        return new e0[i];
    }
}
