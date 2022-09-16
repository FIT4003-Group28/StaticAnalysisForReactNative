package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        com.google.android.gms.common.d[] dVarArr = null;
        com.google.android.gms.common.d[] dVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    i = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.x.b.k(parcel, a2);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    iBinder = com.google.android.gms.common.internal.x.b.j(parcel, a2);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.x.b.b(parcel, a2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = com.google.android.gms.common.internal.x.b.a(parcel, a2);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.x.b.a(parcel, a2, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
                case 10:
                    dVarArr = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.x.b.b(parcel, a2, com.google.android.gms.common.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.x.b.b(parcel, a2, com.google.android.gms.common.d.CREATOR);
                    break;
                case 12:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new g(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i) {
        return new g[i];
    }
}
