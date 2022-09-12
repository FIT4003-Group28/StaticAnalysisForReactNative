package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bhje  reason: default package */
/* loaded from: classes3.dex */
public class bhje {
    private final dxio<afha> a;
    private final akfa b;
    private final AccountManager c;
    private final Activity d;

    public bhje(dxio<afha> dxioVar, akfa akfaVar, Activity activity) {
        this.a = dxioVar;
        this.b = akfaVar;
        this.d = activity;
        this.c = AccountManager.get(activity);
    }

    public final void a(final String str) {
        Account m = this.b.m();
        if (m == null) {
            b(str);
            return;
        }
        String valueOf = String.valueOf(Uri.encode(str));
        this.c.getAuthToken(m, valueOf.length() != 0 ? "weblogin:service=local&continue=".concat(valueOf) : new String("weblogin:service=local&continue="), (Bundle) null, this.d, new AccountManagerCallback(this, str) { // from class: bhjd
            private final bhje a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                this.a.d(this.b, accountManagerFuture);
            }
        }, (Handler) null);
    }

    public final void b(String str) {
        this.a.a().m(str, 2);
    }

    public final void c(Intent intent) {
        this.a.a().o(intent, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(String str, AccountManagerFuture accountManagerFuture) {
        try {
            String string = ((Bundle) accountManagerFuture.getResult()).getString("authtoken");
            if (string != null) {
                b(string);
            } else {
                b(str);
            }
        } catch (AuthenticatorException | IOException unused) {
            b(str);
        } catch (OperationCanceledException unused2) {
            b(str);
        }
    }
}
