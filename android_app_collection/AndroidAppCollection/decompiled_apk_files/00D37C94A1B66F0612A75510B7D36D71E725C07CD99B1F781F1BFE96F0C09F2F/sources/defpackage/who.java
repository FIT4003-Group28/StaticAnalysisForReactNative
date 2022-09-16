package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: who  reason: default package */
/* loaded from: classes4.dex */
final class who implements AccountManagerCallback {
    private final wgm a;

    public who(wgm wgmVar) {
        this.a = wgmVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        if (!accountManagerFuture.isDone()) {
            Integer.toString(1);
            return;
        }
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle == null) {
                Integer.toString(2);
                return;
            }
            String string = bundle.getString("authAccount");
            if (string == null) {
                Integer.toString(3);
                return;
            }
            wgm wgmVar = this.a;
            wgd.a(wgmVar.b, string, new wgl(wgmVar));
        } catch (AuthenticatorException unused) {
            Integer.toString(4);
        } catch (OperationCanceledException unused2) {
            Integer.toString(5);
        } catch (IOException unused3) {
            Integer.toString(6);
        }
    }
}
