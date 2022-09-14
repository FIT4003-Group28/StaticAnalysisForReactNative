package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.m;
/* loaded from: classes.dex */
public class g extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<g> CREATOR = new g0();

    /* renamed from: b  reason: collision with root package name */
    private final int f7009b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7010c;

    /* renamed from: d  reason: collision with root package name */
    private int f7011d;

    /* renamed from: e  reason: collision with root package name */
    String f7012e;

    /* renamed from: f  reason: collision with root package name */
    IBinder f7013f;

    /* renamed from: g  reason: collision with root package name */
    Scope[] f7014g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f7015h;
    Account i;
    com.google.android.gms.common.d[] j;
    com.google.android.gms.common.d[] k;
    private boolean l;

    public g(int i) {
        this.f7009b = 4;
        this.f7011d = com.google.android.gms.common.f.f6957a;
        this.f7010c = i;
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.d[] dVarArr, com.google.android.gms.common.d[] dVarArr2, boolean z) {
        this.f7009b = i;
        this.f7010c = i2;
        this.f7011d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f7012e = "com.google.android.gms";
        } else {
            this.f7012e = str;
        }
        if (i < 2) {
            this.i = iBinder != null ? a.a(m.a.a(iBinder)) : null;
        } else {
            this.f7013f = iBinder;
            this.i = account;
        }
        this.f7014g = scopeArr;
        this.f7015h = bundle;
        this.j = dVarArr;
        this.k = dVarArr2;
        this.l = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7009b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7010c);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f7011d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7012e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f7013f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, (Parcelable[]) this.f7014g, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f7015h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, (Parcelable) this.i, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, (Parcelable[]) this.j, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, (Parcelable[]) this.k, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, this.l);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
