package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: afvj  reason: default package */
/* loaded from: classes.dex */
public final class afvj implements Runnable {
    public final zdt a;
    private final Activity b;
    private final Account c;
    private final String d;

    public afvj(Activity activity, Account account, String str, zdt zdtVar) {
        this.b = activity;
        this.c = account;
        this.d = str;
        this.a = zdtVar;
    }

    public static ayoc a(final Activity activity, final Account account, String str) {
        final AccountManager accountManager = AccountManager.get(activity);
        String valueOf = String.valueOf(Uri.encode(str));
        final String concat = valueOf.length() != 0 ? "weblogin:continue=".concat(valueOf) : new String("weblogin:continue=");
        return ayoc.i(new ayoe() { // from class: afvf
            @Override // defpackage.ayoe
            public final void a(azam azamVar) {
                Activity activity2 = activity;
                String str2 = concat;
                AccountManager accountManager2 = accountManager;
                Account account2 = account;
                ylr.b();
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    "Getting authToken for authTokenType = ".concat(valueOf2);
                }
                final AccountManagerFuture<Bundle> authToken = accountManager2.getAuthToken(account2, str2, (Bundle) null, activity2, (AccountManagerCallback<Bundle>) null, (Handler) null);
                ayqi.f(azamVar, banl.n(new aypv() { // from class: afvg
                    @Override // defpackage.aypv
                    public final void a() {
                        authToken.cancel(true);
                    }
                }));
                azamVar.c(authToken.getResult());
            }
        }).m(aaga.f).w(aaku.m).r(zwb.k).l(fzb.n).o(aaga.e).k(new ayqb() { // from class: afvh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                accountManager.invalidateAuthToken(account.type, (String) obj);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        final String str = (String) a(this.b, this.c, this.d).W();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.runOnUiThread(new Runnable() { // from class: afvi
            @Override // java.lang.Runnable
            public final void run() {
                afvj afvjVar = afvj.this;
                afvjVar.a.a(str);
            }
        });
    }
}
