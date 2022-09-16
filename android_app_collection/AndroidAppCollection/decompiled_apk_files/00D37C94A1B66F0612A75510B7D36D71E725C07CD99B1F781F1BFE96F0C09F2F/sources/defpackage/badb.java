package defpackage;

import J.N;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;
import org.chromium.net.NetError;
/* compiled from: PG */
/* renamed from: badb  reason: default package */
/* loaded from: classes2.dex */
public final class badb implements AccountManagerCallback {
    public final badc a;
    final /* synthetic */ HttpNegotiateAuthenticator b;
    private final /* synthetic */ int c;

    public badb(HttpNegotiateAuthenticator httpNegotiateAuthenticator, badc badcVar) {
        this.b = httpNegotiateAuthenticator;
        this.a = badcVar;
    }

    public badb(HttpNegotiateAuthenticator httpNegotiateAuthenticator, badc badcVar, int i) {
        this.c = i;
        this.b = httpNegotiateAuthenticator;
        this.a = badcVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        if (this.c == 0) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (!bundle.containsKey("intent")) {
                    this.b.processResult(bundle, this.a);
                    return;
                }
                Context context = babj.c;
                context.registerReceiver(new bada(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                bacc.f("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                N.M0s8NeYn(this.a.a, this.b, -9, null);
                return;
            }
        }
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                bacc.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
            } else if (length > 1) {
                bacc.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length));
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
            } else if (this.b.lacksPermission(babj.c, "android.permission.USE_CREDENTIALS", true)) {
                bacc.d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            } else {
                badc badcVar = this.a;
                badcVar.e = accountArr[0];
                badcVar.b.getAuthToken(badcVar.e, badcVar.d, badcVar.c, true, (AccountManagerCallback<Bundle>) new badb(this.b, badcVar), new Handler(ThreadUtils.b()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            bacc.f("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e2);
            N.M0s8NeYn(this.a.a, this.b, -9, null);
        }
    }
}
