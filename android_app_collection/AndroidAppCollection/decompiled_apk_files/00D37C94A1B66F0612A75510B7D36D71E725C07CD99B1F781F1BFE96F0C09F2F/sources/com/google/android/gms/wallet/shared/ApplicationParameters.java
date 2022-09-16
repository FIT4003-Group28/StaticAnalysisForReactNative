package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(19);
    public int a;
    public Account b;
    public Bundle c;
    boolean d;
    public int e;
    public WalletCustomTheme f;
    int g;
    double h;
    double i;
    int j;
    int k;

    public ApplicationParameters() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.a = i;
        this.b = account;
        this.c = bundle;
        this.d = z;
        this.e = i2;
        this.f = walletCustomTheme;
        this.g = i3;
        this.h = d;
        this.i = d2;
        this.j = i4;
        this.k = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.E(parcel, 3, this.b, i);
        tqj.v(parcel, 4, this.c);
        tqj.o(parcel, 5, this.d);
        tqj.s(parcel, 6, this.e);
        tqj.E(parcel, 7, this.f, i);
        tqj.s(parcel, 8, this.g);
        tqj.p(parcel, 9, this.h);
        tqj.p(parcel, 10, this.i);
        tqj.s(parcel, 11, this.j);
        tqj.s(parcel, 12, this.k);
        tqj.n(parcel, m);
    }
}
