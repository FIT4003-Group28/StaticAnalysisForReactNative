package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl$AccountControllerLifecycleObserver;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: alzt  reason: default package */
/* loaded from: classes.dex */
public final class alzt extends alzn {
    public static final amzy a = amzy.l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");
    public final ambk b;
    public final ActivityAccountState c;
    public final amfh d;
    public final ambe e;
    public final amag f;
    public final boolean g;
    public final boolean h;
    public final aoos i;
    public final amfi j = new alzp(this);
    public ambj k;
    public alzu l;
    public boolean m;
    public boolean n;
    public ankt o;
    public final amhu p;
    private final amav q;

    public alzt(amhu amhuVar, final ambk ambkVar, ActivityAccountState activityAccountState, amfh amfhVar, amav amavVar, ambe ambeVar, amag amagVar, aoos aoosVar, ampq ampqVar) {
        this.p = amhuVar;
        this.b = ambkVar;
        this.c = activityAccountState;
        this.d = amfhVar;
        this.q = amavVar;
        this.e = ambeVar;
        this.f = amagVar;
        this.i = aoosVar;
        boolean z = false;
        Boolean bool = false;
        this.g = bool.booleanValue();
        this.h = ((Boolean) ampqVar.e(bool)).booleanValue();
        Object obj = activityAccountState.c;
        aqxo.y((obj == null || obj == this) ? true : z);
        activityAccountState.c = this;
        amhuVar.getLifecycle().c(new TracedDefaultLifecycleObserver(new AccountControllerImpl$AccountControllerLifecycleObserver(this)));
        amhuVar.getSavedStateRegistry().b("tiktok_account_controller_saved_instance_state", new bli() { // from class: alzo
            @Override // defpackage.bli
            public final Bundle a() {
                alzt alztVar = alzt.this;
                ambk ambkVar2 = ambkVar;
                Bundle bundle = new Bundle();
                bundle.putBoolean("state_pending_op", alztVar.m);
                aphq.m(bundle, "state_latest_operation", alztVar.l);
                boolean z2 = true;
                if (!alztVar.n && ambkVar2.e()) {
                    z2 = false;
                }
                bundle.putBoolean("state_do_not_revalidate", z2);
                bundle.putBoolean("tiktok_accounts_disabled", alztVar.g);
                return bundle;
            }
        });
    }

    private final alzu l(AccountId accountId) {
        int i = this.l.c;
        int i2 = i == Integer.MAX_VALUE ? 0 : i + 1;
        aopa createBuilder = alzu.a.createBuilder();
        createBuilder.copyOnWrite();
        alzu alzuVar = (alzu) createBuilder.instance;
        alzuVar.b |= 1;
        alzuVar.c = i2;
        if (accountId != null) {
            int i3 = ((AutoValue_AccountId) accountId).a;
            createBuilder.copyOnWrite();
            alzu alzuVar2 = (alzu) createBuilder.instance;
            alzuVar2.b |= 2;
            alzuVar2.d = i3;
        }
        alzu alzuVar3 = (alzu) createBuilder.mo39build();
        this.l = alzuVar3;
        return alzuVar3;
    }

    @Override // defpackage.alzn
    public final alzn a(ambj ambjVar) {
        f();
        aqxo.z(this.k == null, "Config can be set once, in the constructor only.");
        this.k = ambjVar;
        return this;
    }

    @Override // defpackage.alzn
    public final void b(amuk amukVar) {
        amukVar.getClass();
        aqxo.y(!amukVar.isEmpty());
        amlp l = amna.l("Switch Account With Custom Selectors");
        try {
            h(d(amukVar));
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.alzn
    public final void c(amau amauVar) {
        f();
        amav amavVar = this.q;
        amavVar.b.add(amauVar);
        Collections.shuffle(amavVar.b, amavVar.c);
    }

    public final ankt d(amuk amukVar) {
        amaq a2 = amaq.a(this.b.a());
        this.n = false;
        final ambe ambeVar = this.e;
        final ankt a3 = ambeVar.a(a2, amukVar);
        final Intent a4 = this.b.a();
        return anii.i(a3, ammo.c(new anir() { // from class: amax
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                AccountId accountId;
                AccountActionResult accountActionResult = (AccountActionResult) obj;
                return (accountActionResult.c != null || (accountId = accountActionResult.a) == null) ? a3 : ambe.this.c(accountId, a4);
            }
        }), anjk.a);
    }

    public final ankt e() {
        if (!this.n) {
            return anlz.q(null);
        }
        this.n = false;
        amlp l = amna.l("Revalidate Account");
        try {
            int g = this.c.g();
            if (g != -1) {
                AccountId b = AccountId.b(g);
                ankt c = this.e.c(b, this.b.a());
                l.a(c);
                i(b, c);
                l.close();
                return c;
            }
            ankt q = anlz.q(null);
            l.close();
            return q;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void f() {
        aqxo.z(!this.g, "Attempted to use the account controller when accounts are disabled");
    }

    public final void g() {
        this.m = false;
        if (!this.c.j()) {
            this.n = false;
        }
    }

    public final void h(ankt anktVar) {
        if (!anktVar.isDone()) {
            this.c.n();
            i(null, anktVar);
            return;
        }
        this.c.l();
        try {
            this.j.b(aphq.k(l(null)), (AccountActionResult) anlz.y(anktVar));
        } catch (ExecutionException e) {
            this.j.a(aphq.k(l(null)), e.getCause());
        }
    }

    public final void i(AccountId accountId, ankt anktVar) {
        alzu l = l(accountId);
        this.m = true;
        try {
            this.d.h(new amfg(anktVar), new amff(aphq.k(l)), this.j);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void j() {
        if (this.m) {
            return;
        }
        e();
    }

    public final void k(AccountId accountId) {
        amlp l = amna.l("Switch Account");
        try {
            this.n = false;
            ankt c = this.e.c(accountId, this.b.a());
            if (!c.isDone() && ((AutoValue_AccountId) accountId).a != this.c.g()) {
                this.c.n();
            }
            l.a(c);
            i(accountId, c);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
