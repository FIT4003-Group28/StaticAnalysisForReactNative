package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
/* compiled from: PG */
/* renamed from: cozi  reason: default package */
/* loaded from: classes5.dex */
public final class cozi extends cnuw<cozg> implements coza {
    private final boolean a;
    private final cnum t;
    private final Bundle u;
    private final Integer v;

    public cozi(Context context, Looper looper, cnum cnumVar, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.a = true;
        this.t = cnumVar;
        this.u = bundle;
        this.v = cnumVar.i;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12451000;
    }

    @Override // defpackage.coza
    public final void d(cozf cozfVar) {
        try {
            try {
                Account account = this.t.a;
                if (account == null) {
                    account = new Account(GoogleApiClient.DEFAULT_ACCOUNT, "com.google");
                }
                GoogleSignInAccount c = GoogleApiClient.DEFAULT_ACCOUNT.equals(account.name) ? cmuh.a(this.c).c() : null;
                Integer num = this.v;
                cnwc.a(num);
                ((cozg) L()).f(new SignInRequest(1, new ResolveAccountRequest(2, account, num.intValue(), c)), cozfVar);
            } catch (RemoteException unused) {
                cozfVar.b(new SignInResponse(1, new ConnectionResult(8, null), null));
            }
        } catch (RemoteException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof cozg ? (cozg) queryLocalInterface : new cozg(iBinder);
    }

    @Override // defpackage.coza
    public final void f() {
        try {
            Integer num = this.v;
            cnwc.a(num);
            ((cozg) L()).e(num.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.coza
    public final void g() {
        n(new cnuf(this));
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        if (!this.c.getPackageName().equals(this.t.e)) {
            this.u.putString("com.google.android.gms.signin.internal.realClientPackageName", this.t.e);
        }
        return this.u;
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final boolean j() {
        return this.a;
    }

    @Override // defpackage.coza
    public final void m(cnvj cnvjVar, boolean z) {
        try {
            Integer num = this.v;
            cnwc.a(num);
            ((cozg) L()).g(cnvjVar, num.intValue(), z);
        } catch (RemoteException unused) {
        }
    }
}
