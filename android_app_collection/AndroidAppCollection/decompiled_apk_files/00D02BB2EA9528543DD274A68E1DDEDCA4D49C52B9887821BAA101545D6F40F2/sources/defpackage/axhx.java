package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axhx  reason: default package */
/* loaded from: classes3.dex */
final class axhx implements crzp<btlu> {
    final /* synthetic */ axib a;

    public axhx(axib axibVar) {
        this.a = axibVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        synchronized (this.a.s) {
            String l = axib.l(crzmVar.l());
            if (dbsd.a(this.a.t, l)) {
                return;
            }
            axix axixVar = this.a.n;
            axib axibVar = this.a;
            axibVar.t = l;
            axibVar.r.c(l == null ? axid.a : new axic());
            Map<String, axfm> map = this.a.k;
            dbsk.s(map);
            map.clear();
            if (l == null) {
                this.a.n = null;
                this.a.m = null;
            } else {
                axgi axgiVar = this.a.m;
                if (axgiVar == null || !axgiVar.i.equals(l)) {
                    axib axibVar2 = this.a;
                    axgj axgjVar = axibVar2.i;
                    dbsk.s(axgjVar);
                    axibVar2.m = axgjVar.a(l);
                }
                if (this.a.n == null || !this.a.n.b.equals(l)) {
                    axib axibVar3 = this.a;
                    axgi axgiVar2 = axibVar3.m;
                    dbsk.s(axgiVar2);
                    Executor executor = this.a.h;
                    dbsk.s(executor);
                    axibVar3.n = new axix(l, axgiVar2, executor);
                }
            }
            if (axixVar != null && axixVar != this.a.n) {
                for (crzo<axoj> crzoVar : axixVar.c.values()) {
                    crzoVar.a(new axoj(axix.a));
                }
            }
            abfa abfaVar = this.a.l;
            dbsk.s(abfaVar);
            if (abfaVar.v()) {
                axhi axhiVar = this.a.p;
                dbsk.s(axhiVar);
                if (!dbsd.a(l, axhiVar.i)) {
                    this.a.q.c(axgw.a);
                    axib axibVar4 = this.a;
                    axhj axhjVar = axibVar4.j;
                    dbsk.s(axhjVar);
                    axibVar4.p = axhjVar.a(l, this.a.q.SU());
                }
            }
        }
    }
}
