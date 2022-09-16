package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aloi  reason: default package */
/* loaded from: classes.dex */
public final class aloi implements amjm {
    public final alrv a;
    public final Executor b;
    @dzsi
    public amii h;
    @dzsi
    public aktx i;
    private final akpq m;
    private final alog n;
    @dzsi
    private dcdc<amkk> o;
    @dzsi
    private dcdc<dmrt> p;
    @dzsi
    private dcdc<dbsl<dmpn>> q;
    @dzsi
    private dcdc<amhf> r;
    private boolean s;
    public final Set<dbsl<dmpn>> e = dcnm.c();
    public final Set<amhf> g = new HashSet();
    public final Set<aktt> k = new LinkedHashSet();
    public final Set<aktt> l = new LinkedHashSet();
    public final Set<alkx> c = new HashSet();
    public final Set<dmrt> d = new HashSet();
    public final Set<alks> f = new HashSet();
    public final dzjj<aktr> j = new dzjs();

    public aloi(alrv alrvVar, Executor executor, akzh akzhVar, akpq akpqVar) {
        this.a = alrvVar;
        this.b = executor;
        this.m = akpqVar;
        this.n = new alog(akzhVar, this, akpqVar, alrvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(alkx alkxVar) {
        boolean remove;
        synchronized (this) {
            if (alkxVar instanceof alks) {
                remove = this.f.remove(alkxVar);
            } else {
                remove = this.c.remove(alkxVar);
            }
        }
        if (remove) {
            b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        boolean z2;
        amii amiiVar;
        synchronized (this) {
            z2 = this.s;
            if (z) {
                this.o = dcbg.b(this.c).o(alod.a).s(aloe.a).z();
                this.p = dcdc.r(this.d);
                this.r = dcbg.b(this.f).s(alof.a).z();
            }
            this.q = dcdc.r(this.e);
            amiiVar = this.h;
            this.s = amiiVar != null;
        }
        if (amiiVar == null || z2) {
            return;
        }
        amiiVar.k(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        boolean z;
        synchronized (this) {
            amii amiiVar = this.h;
            z = true;
            if (amiiVar != null && ((amiu) amiiVar).s) {
                z = false;
            }
        }
        if (z) {
            c();
        }
    }

    public final void e(aktt akttVar) {
        synchronized (this) {
            if (this.h != null) {
                if (!this.k.contains(akttVar)) {
                    this.h.u(akttVar);
                    this.k.add(akttVar);
                }
            } else {
                this.l.add(akttVar);
            }
        }
    }

    @Override // defpackage.amjm
    public final void g(amjl amjlVar) {
        dcdc<amkk> dcdcVar;
        dcdc<amhf> dcdcVar2;
        dcdc<dbsl<dmpn>> dcdcVar3;
        dcdc<dmrt> dcdcVar4;
        synchronized (this) {
            dcdcVar = this.o;
            dcdcVar2 = this.r;
            dcdcVar3 = this.q;
            dcdcVar4 = this.p;
            this.s = false;
        }
        synchronized (this) {
            if (!this.j.isEmpty()) {
                Iterator a = ((dzjs) this.j).k().a();
                while (a.hasNext()) {
                    dzjh dzjhVar = (dzjh) a.next();
                    int a2 = dzjhVar.a();
                    aktr aktrVar = (aktr) dzjhVar.getValue();
                    if (a2 != 0) {
                        if (aktrVar != null) {
                            amjlVar.d.a(a2, aktrVar);
                        } else if (amjlVar.d.d(a2)) {
                            amjlVar.d.b(a2);
                        }
                    }
                }
            }
        }
        if (dcdcVar != null) {
            amjlVar.b.addAll(dcdcVar);
        }
        if (dcdcVar3 != null) {
            amjlVar.c.addAll(dcdcVar3);
        }
        if (dcdcVar2 != null) {
            amjlVar.e.addAll(dcdcVar2);
        }
        if (dcdcVar4 != null) {
            amjlVar.a.addAll(dcdcVar4);
        }
    }

    @Override // defpackage.amjm
    public final void h(amii amiiVar) {
        synchronized (this) {
            this.h = amiiVar;
            this.s = false;
            for (aktt akttVar : this.l) {
                amiiVar.u(akttVar);
                this.k.add(akttVar);
            }
            this.l.clear();
            this.m.a(this.n);
            this.m.b(this.n);
        }
    }

    @Override // defpackage.amjm
    public final void i(amii amiiVar) {
        synchronized (this) {
            this.m.c(this.n);
            for (aktt akttVar : this.k) {
                amiiVar.v(akttVar);
                this.l.add(akttVar);
            }
            this.k.clear();
            this.s = false;
            this.h = null;
        }
    }

    @Override // defpackage.amjm
    public final boolean k() {
        return false;
    }
}
