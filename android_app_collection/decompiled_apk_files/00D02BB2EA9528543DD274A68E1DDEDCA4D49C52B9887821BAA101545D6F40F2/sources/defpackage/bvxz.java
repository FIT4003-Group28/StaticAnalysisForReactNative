package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvxz  reason: default package */
/* loaded from: classes4.dex */
public class bvxz {
    public static final /* synthetic */ int c = 0;
    private static final long d = TimeUnit.HOURS.toMillis(6);
    @dzsi
    public Account a;
    public long b;
    private final AccountManager e;
    private final Activity f;
    private final Executor g;
    private final Executor h;
    private final akfa i;
    private final dzsj<bvyc> j;
    private final dzsj<bwqv> k;

    public bvxz(Activity activity, final akfa akfaVar, Executor executor, Executor executor2, dzsj<bvyc> dzsjVar, dzsj<bwqv> dzsjVar2) {
        this.i = akfaVar;
        this.e = AccountManager.get(activity);
        this.f = activity;
        this.g = executor;
        this.h = executor2;
        this.j = dzsjVar;
        this.k = dzsjVar2;
        final bwqv a = dzsjVar2.a();
        final bwrj bwrjVar = bwrj.AUTH_TOKEN_RECENCY;
        final dssr dssrVar = (dssr) bvyb.d.cu(7);
        final deig d2 = deig.d();
        a.b.a().b(new Runnable(a, d2, bwrjVar, dssrVar) { // from class: bwqo
            private final bwqv a;
            private final deig b;
            private final bwrj c;
            private final dssr d;

            {
                this.a = a;
                this.b = d2;
                this.c = bwrjVar;
                this.d = dssrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.j(this.a.j(this.c, this.d));
            }
        }, bvrj.GMM_STORAGE);
        deha.q(d2, bvqj.b(new bvqg(this, akfaVar) { // from class: bvxv
            private final bvxz a;
            private final akfa b;

            {
                this.a = this;
                this.b = akfaVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                Account m;
                bvxz bvxzVar = this.a;
                akfa akfaVar2 = this.b;
                bvyb bvybVar = (bvyb) obj;
                if (bvybVar != null && bvxzVar.a == null && bvxzVar.b == 0 && (m = akfaVar2.m()) != null && m.hashCode() == bvybVar.c) {
                    bvxzVar.b = bvybVar.b;
                    bvxzVar.a = m;
                }
            }
        }), executor);
    }

    private static long d() {
        return new Date().getTime();
    }

    @dzsi
    public final AccountManagerFuture<Bundle> a(String str) {
        Account m = this.i.m();
        String valueOf = String.valueOf(Uri.encode(str));
        String concat = valueOf.length() != 0 ? "weblogin:service=local&continue=".concat(valueOf) : new String("weblogin:service=local&continue=");
        if (m != null) {
            return this.e.getAuthToken(m, concat, (Bundle) null, this.f, (AccountManagerCallback<Bundle>) null, (Handler) null);
        }
        return null;
    }

    public final boolean b(String str, bvxy bvxyVar) {
        Account account = this.a;
        if (account != null && account.equals(this.i.m()) && d() - this.b <= d) {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (!dbsj.d(cookie)) {
                for (String str2 : cookie.split(";")) {
                    String[] split = str2.split("=");
                    if (split.length == 2 && split[0].replace(" ", "").equals("SID")) {
                        bvxyVar.a(str);
                        return true;
                    }
                }
            }
        }
        this.j.a().a();
        this.a = this.i.m();
        this.b = d();
        bvya bZ = bvyb.d.bZ();
        long j = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvyb bvybVar = (bvyb) bZ.b;
        bvybVar.a = 1 | bvybVar.a;
        bvybVar.b = j;
        Account account2 = this.a;
        if (account2 != null) {
            int hashCode = account2.hashCode();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvyb bvybVar2 = (bvyb) bZ.b;
            bvybVar2.a = 2 | bvybVar2.a;
            bvybVar2.c = hashCode;
        }
        this.k.a().s(bwrj.AUTH_TOKEN_RECENCY, bZ.bK());
        AccountManagerFuture<Bundle> a = a(str);
        if (a == null) {
            bvxyVar.a(null);
            return false;
        }
        this.h.execute(new bvxx(this, a, bvxyVar));
        return false;
    }

    public final void c(final bvxy bvxyVar, @dzsi final String str) {
        this.g.execute(new Runnable(bvxyVar, str) { // from class: bvxw
            private final bvxy a;
            private final String b;

            {
                this.a = bvxyVar;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvxy bvxyVar2 = this.a;
                String str2 = this.b;
                int i = bvxz.c;
                bvxyVar2.a(str2);
            }
        });
    }
}
