package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface m extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends c.e.a.b.d.c.b implements m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0149a extends c.e.a.b.d.c.a implements m {
            C0149a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.m
            public final Account b() {
                Parcel a2 = a(2, f());
                Account account = (Account) c.e.a.b.d.c.c.a(a2, Account.CREATOR);
                a2.recycle();
                return account;
            }
        }

        public static m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof m ? (m) queryLocalInterface : new C0149a(iBinder);
        }
    }

    Account b();
}
