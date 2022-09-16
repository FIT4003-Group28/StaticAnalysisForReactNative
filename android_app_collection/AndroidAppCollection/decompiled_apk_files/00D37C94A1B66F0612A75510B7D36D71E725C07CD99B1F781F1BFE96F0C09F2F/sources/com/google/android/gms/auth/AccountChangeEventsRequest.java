package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(10);
    final int a;
    public int b;
    @Deprecated
    public String c;
    Account d;

    public AccountChangeEventsRequest() {
        this.a = 1;
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.E(parcel, 4, this.d, i);
        tqj.n(parcel, m);
    }
}
