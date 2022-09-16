package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vzm  reason: default package */
/* loaded from: classes4.dex */
public abstract class vzm implements afvx {
    private final Context a;
    private final vzw b;

    /* JADX INFO: Access modifiers changed from: protected */
    public vzm(vzw vzwVar, Context context) {
        this.b = vzwVar;
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle c(AccountIdentity accountIdentity) {
        if (accountIdentity.h() || accountIdentity.l() == 3) {
            Bundle bundle = new Bundle();
            bundle.putString("delegatee_user_id", accountIdentity.d());
            if (accountIdentity.h()) {
                bundle.putInt(vzx.DELEGTATION_TYPE, 1);
            }
            if (!accountIdentity.j() && !accountIdentity.f()) {
                return bundle;
            }
            bundle.putInt(vzx.DELEGTATION_TYPE, 3);
            return bundle;
        }
        return null;
    }

    @Override // defpackage.afvx
    public /* bridge */ /* synthetic */ afvv a(afvm afvmVar) {
        throw null;
    }

    @Override // defpackage.afvx
    public /* bridge */ /* synthetic */ void b(afvm afvmVar) {
        throw null;
    }

    public abstract afvv d(AccountIdentity accountIdentity);

    @Deprecated
    public final afvv e(AccountIdentity accountIdentity) {
        return f(new Account(accountIdentity.a(), "com.google"), c(accountIdentity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized afvv f(Account account, Bundle bundle) {
        try {
            try {
                try {
                } catch (UserRecoverableAuthException e) {
                    return k(e);
                }
            } catch (IOException e2) {
                return new afvv(null, null, e2, true);
            }
        } catch (qia e3) {
            qrq.a.d(this.a, e3.a);
            return k(e3);
        } catch (qhr e4) {
            return new afvv(null, null, e4, false);
        }
        return afvv.c(g(account, bundle));
    }

    protected abstract String g(Account account, Bundle bundle);

    public abstract void h(AccountIdentity accountIdentity);

    public abstract void i(Iterable iterable);

    public final void j(Executor executor, final AccountIdentity accountIdentity) {
        if (accountIdentity.g()) {
            return;
        }
        executor.execute(new Runnable() { // from class: vzl
            @Override // java.lang.Runnable
            public final void run() {
                vzm.this.d(accountIdentity);
            }
        });
    }

    private final afvv k(UserRecoverableAuthException userRecoverableAuthException) {
        Intent intent = userRecoverableAuthException.b;
        Intent intent2 = intent == null ? null : new Intent(intent);
        intent2.getClass();
        vzw vzwVar = this.b;
        if (vzwVar != null) {
            vzwVar.a.d(new afvw(intent2, userRecoverableAuthException));
        }
        return new afvv(null, intent2, null, false);
    }
}
