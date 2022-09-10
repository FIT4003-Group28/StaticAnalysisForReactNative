package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
/* compiled from: PG */
/* renamed from: cmrz  reason: default package */
/* loaded from: classes5.dex */
public final class cmrz extends cla implements IInterface {
    public cmrz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void e(cmry cmryVar, Account account, String str, Bundle bundle) {
        Parcel a = a();
        clc.f(a, cmryVar);
        clc.e(a, account);
        a.writeString(str);
        clc.e(a, bundle);
        Sk(1, a);
    }

    public final void f(cnrt cnrtVar, ClearTokenRequest clearTokenRequest) {
        Parcel a = a();
        clc.f(a, cnrtVar);
        clc.e(a, clearTokenRequest);
        Sk(2, a);
    }

    public final void g(cmru cmruVar, String str) {
        Parcel a = a();
        clc.f(a, cmruVar);
        a.writeString(str);
        Sk(3, a);
    }

    public final void h(cmrw cmrwVar, GetAccountsRequest getAccountsRequest) {
        Parcel a = a();
        clc.f(a, cmrwVar);
        clc.e(a, getAccountsRequest);
        Sk(5, a);
    }
}
