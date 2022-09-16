package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ActivityAccountState implements f {
    public final amav a;
    public final boolean b;
    private final aoos h;
    private final amhb i;
    private final amhu j;
    private final List g = new ArrayList();
    public Object c = null;
    public int d = -1;
    public ambp e = ambp.a;
    public int f = 0;

    public ActivityAccountState(amhu amhuVar, amav amavVar, aoos aoosVar, amhb amhbVar) {
        this.j = amhuVar;
        this.a = amavVar;
        this.h = aoosVar;
        Boolean bool = false;
        this.b = bool.booleanValue();
        this.i = amhbVar;
        amhuVar.getLifecycle().c(this);
        amhuVar.getSavedStateRegistry().b("tiktok_activity_account_state_saved_instance_state", new bli() { // from class: ambf
            @Override // defpackage.bli
            public final Bundle a() {
                ActivityAccountState activityAccountState = ActivityAccountState.this;
                Bundle bundle = new Bundle();
                bundle.putInt("state_account_id", activityAccountState.d);
                aphq.m(bundle, "state_account_info", activityAccountState.e);
                bundle.putInt("state_account_state", activityAccountState.f);
                bundle.putBoolean("tiktok_accounts_disabled", activityAccountState.b);
                return bundle;
            }
        });
    }

    private static void o(eo eoVar) {
        eoVar.af(1);
        List<dp> m = eoVar.m();
        if (m == null || m.isEmpty()) {
            return;
        }
        ex l = eoVar.l();
        for (dp dpVar : m) {
            if (!(dpVar instanceof axon) || !(((axon) dpVar).lI() instanceof ambg)) {
                eo mL = dpVar.mL();
                mL.ab();
                o(mL);
            } else {
                l.m(dpVar);
            }
        }
        if (l.j()) {
            return;
        }
        l.x();
        l.d();
    }

    public final int g() {
        uwp.f();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        o(this.j.b());
    }

    public final void i() {
        this.j.b().ab();
    }

    public final boolean j() {
        uwp.f();
        return this.d != -1;
    }

    public final boolean k(int i, ambp ambpVar, int i2) {
        ambpVar.getClass();
        uwp.f();
        int i3 = this.d;
        int i4 = this.f;
        if (i != i3 || i2 != i4) {
            i();
        }
        if (i != i3 || (i2 != i4 && this.f != 0)) {
            h();
        }
        if (i != i3) {
            this.d = i;
            amhb amhbVar = this.i;
            AccountId b = AccountId.b(i);
            synchronized (amhbVar.a) {
                Set b2 = amhbVar.b();
                if (!b2.isEmpty()) {
                    AccountId accountId = (AccountId) arey.t(b2);
                    synchronized (amhbVar.a) {
                        aqxo.y(amhbVar.b.containsKey(accountId));
                        amhbVar.b.remove(accountId);
                        amgx a = amhbVar.c.b.a(accountId);
                        synchronized (a.f) {
                            x xVar = a.a;
                            HashSet<String> hashSet = new HashSet(xVar.b.keySet());
                            hashSet.addAll(xVar.c.keySet());
                            hashSet.addAll(xVar.d.keySet());
                            for (String str : hashSet) {
                                x xVar2 = a.a;
                                xVar2.b.remove(str);
                                if (((w) xVar2.d.remove(str)) == null) {
                                    a.a.c.remove(str);
                                } else {
                                    throw null;
                                }
                            }
                            a.g = null;
                        }
                    }
                }
                amhbVar.b.put(b, amhbVar.a(b));
            }
        }
        if (this.f == 0) {
            for (ambh ambhVar : this.g) {
                ambhVar.a();
            }
        }
        this.e = ambpVar;
        this.f = i2;
        return (i == i3 && i2 == i4) ? false : true;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l() {
        k(-1, ambp.a, 0);
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        Bundle a = this.j.getSavedStateRegistry().c ? this.j.getSavedStateRegistry().a("tiktok_activity_account_state_saved_instance_state") : null;
        if (a != null) {
            if (!this.b && a.getBoolean("tiktok_accounts_disabled")) {
                return;
            }
            this.d = a.getInt("state_account_id", -1);
            try {
                this.e = (ambp) aphq.i(a, "state_account_info", ambp.a, this.h);
                int i = a.getInt("state_account_state", 0);
                this.f = i;
                if (i == 0) {
                    return;
                }
                if (i == 1) {
                    this.a.d();
                } else if (i == 2) {
                    this.a.b(AccountId.b(this.d), this.e);
                } else if (i == 3) {
                    this.a.c();
                } else {
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
            } catch (aopx e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m(Throwable th) {
        th.getClass();
        k(-1, ambp.a, 3);
        this.a.c();
        amav amavVar = this.a;
        amlp l = amna.l("onAccountError");
        try {
            amzs it = ((amyg) amavVar.a).iterator();
            while (it.hasNext()) {
                ((amau) it.next()).b(th);
            }
            Iterator it2 = amavVar.b.iterator();
            while (it2.hasNext()) {
                ((amau) it2.next()).b(th);
            }
            l.close();
        } catch (Throwable th2) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void n() {
        if (k(-1, ambp.a, 1)) {
            this.a.d();
            amav amavVar = this.a;
            amlp l = amna.l("onAccountLoading");
            try {
                amzs it = ((amyg) amavVar.a).iterator();
                while (it.hasNext()) {
                    ((amau) it.next()).c();
                }
                Iterator it2 = amavVar.b.iterator();
                while (it2.hasNext()) {
                    ((amau) it2.next()).c();
                }
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

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
