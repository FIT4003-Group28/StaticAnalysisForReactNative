package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: amhs  reason: default package */
/* loaded from: classes.dex */
public final class amhs implements axon {
    private volatile Object a;
    private final Object b = new Object();
    private final dp c;

    public amhs(dp dpVar) {
        this.c = dpVar;
    }

    public static final void a(dp dpVar, AccountId accountId) {
        int a = accountId.a();
        aqxo.A(a >= 0, "AccountId is invalid: %s", a);
        awwc.o(dpVar);
        if (dpVar.m == null) {
            dpVar.ae(new Bundle());
        }
        dpVar.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", a);
    }

    @Override // defpackage.axon
    public final Object lI() {
        Object obj;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.c.M().getClass();
                    aqxo.B(this.c.M() instanceof axon, "Sting Fragments must be attached to an @Sting Activity. Found: %s", this.c.M().getClass());
                    Bundle bundle = this.c.m;
                    if (bundle != null) {
                        aqxo.q(!bundle.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
                    }
                    Bundle bundle2 = this.c.m;
                    AccountId accountId = null;
                    if (bundle2 != null && bundle2.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        accountId = AccountId.b(bundle2.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    accountId.getClass();
                    if (((amhq) awwc.u(this.c.M(), amhq.class)).kD().a.h()) {
                        ampq jt = ((amhr) awwc.u(this.c.M(), amhr.class)).jt();
                        if (accountId == null) {
                            accountId = (AccountId) ((ampv) jt).a;
                            if (accountId.a() != -1) {
                                a(this.c, accountId);
                            }
                        } else {
                            aqxo.z(true, "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            if (((AccountId) ((ampv) jt).a).a() != -1) {
                                aqxo.E(((AccountId) ((ampv) jt).a).equals(accountId), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", ((ampv) jt).a, accountId);
                            }
                        }
                    }
                    amhb jo = ((amho) awwc.u(this.c.M(), amho.class)).jo();
                    synchronized (jo.a) {
                        if (!jo.b.containsKey(accountId)) {
                            jo.b.put(accountId, jo.a(accountId));
                        }
                        obj = jo.b.get(accountId);
                    }
                    dwz h = ((amhp) awwc.u(obj, amhp.class)).h();
                    h.b = this.c;
                    axzl.n(h.b, dp.class);
                    this.a = new ean(h.a, h.e);
                }
            }
        }
        return this.a;
    }
}
