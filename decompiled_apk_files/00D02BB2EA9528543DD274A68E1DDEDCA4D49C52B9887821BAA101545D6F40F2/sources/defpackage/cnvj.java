package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnvj  reason: default package */
/* loaded from: classes5.dex */
public final class cnvj extends cla implements IInterface {
    public cnvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account e() {
        Parcel Si = Si(2, a());
        Account account = (Account) clc.d(Si, Account.CREATOR);
        Si.recycle();
        return account;
    }
}
