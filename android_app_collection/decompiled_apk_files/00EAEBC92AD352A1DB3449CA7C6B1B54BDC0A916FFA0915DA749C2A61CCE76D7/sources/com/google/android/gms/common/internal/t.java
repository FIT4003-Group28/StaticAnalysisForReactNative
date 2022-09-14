package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public class t extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<t> CREATOR = new c0();

    /* renamed from: b  reason: collision with root package name */
    private final int f7052b;

    /* renamed from: c  reason: collision with root package name */
    private final Account f7053c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7054d;

    /* renamed from: e  reason: collision with root package name */
    private final GoogleSignInAccount f7055e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f7052b = i;
        this.f7053c = account;
        this.f7054d = i2;
        this.f7055e = googleSignInAccount;
    }

    public t(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account q() {
        return this.f7053c;
    }

    public int r() {
        return this.f7054d;
    }

    public GoogleSignInAccount s() {
        return this.f7055e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7052b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) q(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, r());
        com.google.android.gms.common.internal.x.c.a(parcel, 4, (Parcelable) s(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
