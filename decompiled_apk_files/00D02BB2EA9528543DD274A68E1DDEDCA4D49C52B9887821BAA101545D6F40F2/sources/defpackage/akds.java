package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* compiled from: PG */
/* renamed from: akds  reason: default package */
/* loaded from: classes2.dex */
public final class akds implements AccountManagerCallback<Bundle> {
    public final akey a;
    final /* synthetic */ akdv b;

    public akds(akdv akdvVar, akey akeyVar) {
        this.b = akdvVar;
        this.a = akeyVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(final AccountManagerFuture<Bundle> accountManagerFuture) {
        this.b.e.execute(new Runnable(this, accountManagerFuture) { // from class: akdr
            private final akds a;
            private final AccountManagerFuture b;

            {
                this.a = this;
                this.b = accountManagerFuture;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akds akdsVar = this.a;
                try {
                    Bundle bundle = (Bundle) this.b.getResult();
                    String string = bundle.getString("authAccount");
                    String string2 = bundle.getString("accountType");
                    if (string != null && string2 != null) {
                        akdv akdvVar = akdsVar.b;
                        akdsVar.b.b.w(akdsVar.a, true, akdvVar.b.p(akdvVar.d.a(new Account(string, string2)), akdsVar.b.b.t()));
                        return;
                    }
                    akdsVar.b.b.w(akdsVar.a, false, false);
                } catch (UserRecoverableAuthException e) {
                    akdsVar.b.h(e, null, akdsVar.a);
                } catch (Exception e2) {
                    dbue.b(e2);
                    akdsVar.b.b.w(akdsVar.a, false, false);
                }
            }
        });
    }
}
