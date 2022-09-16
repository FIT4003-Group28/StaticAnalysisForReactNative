package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxhe  reason: default package */
/* loaded from: classes5.dex */
public final class cxhe implements cxgn {
    public final cxgg a;
    private final Object b = new Object();
    private final Map<Account, cxgm> c = new HashMap();
    private final cxhd d;

    public cxhe(cxhd cxhdVar) {
        dbsk.s(cxhdVar);
        this.d = cxhdVar;
        this.a = cxgg.a(cxhdVar.c(), cxhdVar.d());
    }

    @Override // defpackage.cxgn
    public final cxgm a(Account account) {
        cxgm cxgmVar;
        synchronized (this.b) {
            if (!this.c.containsKey(account)) {
                this.c.put(account, new cxgz(new cxid(new cxim((dslk) dsll.d(this.d.b().a(dsmw.j)).g(dexa.a, dexa.c(account.name)), this.d.c().getPackageName()), this.d.e(), this.d.a(), Math.min(this.d.a() / 2, 60000L), this.d.f()), cxih.a(this.d.g(), new csnj(), this.d.f(), this.a), cxgl.a(this.a, 3011, this.d.g(), account, csnl.a(this.d.e(), account.toString(), (int) this.d.f().b())), this.d.e(), this.d.f()));
            }
            cxgmVar = this.c.get(account);
        }
        return cxgmVar;
    }
}
