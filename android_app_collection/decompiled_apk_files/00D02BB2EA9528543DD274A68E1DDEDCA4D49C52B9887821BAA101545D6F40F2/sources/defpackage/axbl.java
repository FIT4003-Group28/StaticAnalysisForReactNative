package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: axbl  reason: default package */
/* loaded from: classes.dex */
public final class axbl implements axbd {
    private static final dcqe k = dcqe.c("axbl");
    public final bwrh<axds> a;
    public final cqat b;
    public final ckcw c;
    public final dxio<akfa> d;
    public final awyu e;
    public final axbw f;
    public final Application g;
    @dzsi
    public axds i;
    private final axca l;
    private final bvjj m;
    private final btvo n;
    private final Executor o;
    private bwrg<axds> t;
    private final Map<String, bwrg<axds>> p = new HashMap();
    public final Set<String> h = new HashSet();
    private final List<dbsz<axds>> q = new ArrayList();
    public int j = 1;
    private final AtomicBoolean s = new AtomicBoolean();
    private final String r = bvom.a(Locale.getDefault());

    public axbl(bwrh bwrhVar, Application application, cqat cqatVar, ckcw ckcwVar, dxio dxioVar, bvjj bvjjVar, awyu awyuVar, axca axcaVar, btvo btvoVar, axbw axbwVar, final irv irvVar, Executor executor) {
        this.a = bwrhVar;
        this.b = cqatVar;
        this.c = ckcwVar;
        this.d = dxioVar;
        this.m = bvjjVar;
        this.e = awyuVar;
        this.l = axcaVar;
        this.n = btvoVar;
        this.f = axbwVar;
        this.g = application;
        this.o = executor;
        final bvqg bvqgVar = axbi.a;
        irvVar.a.Pk(new Runnable(irvVar, bvqgVar) { // from class: iru
            private final irv a;
            private final bvqg b;

            {
                this.a = irvVar;
                this.b = bvqgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.NU((bcl) deha.s(this.a.a));
            }
        }, irvVar.b);
    }

    private final synchronized void k(@dzsi final Runnable runnable) {
        this.j = 2;
        ((ckhe) this.f.a.a(ckih.d)).a();
        final boolean m = this.m.m(bvjk.O, false);
        this.d.a().l().Pk(new Runnable(this, m, runnable) { // from class: axbj
            private final axbl a;
            private final boolean b;
            private final Runnable c;

            {
                this.a = this;
                this.b = m;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bwrg<axds> f;
                final axbl axblVar = this.a;
                boolean z = this.b;
                final Runnable runnable2 = this.c;
                if (z) {
                    f = axblVar.j(axblVar.d.a().j());
                } else {
                    f = axblVar.f();
                }
                final dbsz dbszVar = new dbsz(axblVar, f, runnable2) { // from class: axbk
                    private final axbl a;
                    private final bwrg b;
                    private final Runnable c;

                    {
                        this.a = axblVar;
                        this.b = f;
                        this.c = runnable2;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        axds axdsVar;
                        awvv<?>[] a;
                        awvv<?>[] a2;
                        axbl axblVar2 = this.a;
                        bwrg bwrgVar = this.b;
                        Runnable runnable3 = this.c;
                        bwrf bwrfVar = (bwrf) obj;
                        synchronized (axblVar2) {
                            if (bwrfVar != null) {
                                try {
                                    axdsVar = (axds) bwrfVar.a;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } else {
                                axdsVar = null;
                            }
                            axblVar2.i = axdsVar;
                            axblVar2.i();
                            axblVar2.g();
                            axds axdsVar2 = axblVar2.i;
                            if (axdsVar2 != null) {
                                axbw.c(axdsVar2);
                                if (axdsVar2.bE == -1) {
                                    axdsVar2.bE = dsst.a.b(axdsVar2).e(axdsVar2);
                                }
                                for (awvv<?> awvvVar : awvv.a()) {
                                    awvvVar.b();
                                    awwy.a(awvvVar).a(axdsVar2);
                                    awwx a3 = awwy.a(awvvVar);
                                    int a4 = a3.a(axdsVar2);
                                    for (int i = 0; i < a4; i++) {
                                        a3.j(axdsVar2, i).cb();
                                    }
                                }
                            }
                            axbw axbwVar = axblVar2.f;
                            axds axdsVar3 = axblVar2.i;
                            long d = bwrgVar.d();
                            if (axdsVar3 == null) {
                                axdsVar3 = axds.ac;
                            }
                            ((ckco) axbwVar.a.a(ckih.g)).a(axbw.c(axdsVar3));
                            ((ckcp) axbwVar.a.a(ckih.f)).a(d);
                            for (awvv<?> awvvVar2 : awvv.a()) {
                                ckcw ckcwVar = axbwVar.a;
                                if (ckih.i.containsKey(awvvVar2)) {
                                    ((ckco) ckcwVar.a(ckih.i.get(awvvVar2))).a(awwy.a(awvvVar2).a(axdsVar3));
                                } else {
                                    throw new UnsupportedOperationException(String.format("No cache item count metric for content type %s", awvvVar2));
                                }
                            }
                            axblVar2.j = 3;
                            ((ckhe) axblVar2.f.a.a(ckih.d)).c();
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                            axblVar2.h();
                        }
                        bwrfVar.a((ckco) axblVar2.c.a(ckih.a));
                    }
                };
                f.b.execute(new Runnable(f, dbszVar) { // from class: bwrd
                    private final bwrg a;
                    private final dbsz b;

                    {
                        this.a = f;
                        this.b = dbszVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.NU(this.a.i());
                    }
                });
            }
        }, this.o);
    }

    private static String l(@dzsi btlu btluVar) {
        return dbsj.e(btlu.h(btluVar));
    }

    private final void m(@dzsi btlu btluVar) {
        axds a = this.e.a(this.i, (int) TimeUnit.MILLISECONDS.toSeconds(this.b.b()), dcep.M(awvv.a()));
        synchronized (this.h) {
            if (a == null) {
                j(btluVar).g();
            } else {
                j(btluVar).e(n(btluVar, a));
            }
            this.h.remove(l(btluVar));
        }
        if (!this.m.m(bvjk.O, false)) {
            f().g();
            this.m.S(bvjk.O, true);
        }
    }

    private final axds n(@dzsi btlu btluVar, axds axdsVar) {
        dsqp dsqpVar = (dsqp) axdsVar.cu(5);
        dsqpVar.bC(axdsVar);
        axdr axdrVar = (axdr) dsqpVar;
        int e = this.n.getPassiveAssistParameters().e();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar2 = (axds) axdrVar.b;
        axds axdsVar3 = axds.ac;
        axdsVar2.a |= 1;
        axdsVar2.b = e;
        dkut d = this.n.getPassiveAssistParameters().d();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar4 = (axds) axdrVar.b;
        d.getClass();
        axdsVar4.c = d;
        axdsVar4.a |= 2;
        String l = l(btluVar);
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar5 = (axds) axdrVar.b;
        l.getClass();
        int i = axdsVar5.a | 4;
        axdsVar5.a = i;
        axdsVar5.d = l;
        String str = this.r;
        str.getClass();
        axdsVar5.a = i | 8;
        axdsVar5.e = str;
        return axdrVar.bK();
    }

    @Override // defpackage.axbd
    public final void a(dbsz<axds> dbszVar) {
        int i;
        synchronized (this) {
            c(null);
            i = this.j;
            if (i != 3) {
                this.q.add(dbszVar);
            }
        }
        if (i == 3) {
            i();
            dbszVar.NU(this.i);
        }
    }

    @Override // defpackage.axbd
    public final synchronized void b(dviw dviwVar, @dzsi dviq dviqVar, @dzsi btlu btluVar, int i) {
        if (this.j != 3) {
            bvoo.h("Data store is not initialized yet when calling mergeIn().", new Object[0]);
        }
        i();
        btlu j = this.d.a().j();
        if (btlu.g(btluVar, j)) {
            if (this.i == null) {
                this.i = n(j, axds.ac);
            }
            this.i = this.l.a(this.i, dviwVar, dviqVar, i);
            for (dviv dvivVar : dviwVar.a) {
                axca axcaVar = this.l;
                axds axdsVar = this.i;
                dviw dviwVar2 = dvivVar.a;
                if (dviwVar2 == null) {
                    dviwVar2 = dviw.aa;
                }
                this.i = axcaVar.a(axdsVar, dviwVar2, dviqVar, i);
            }
        }
        m(j);
    }

    @Override // defpackage.axbd
    public final void c(@dzsi Runnable runnable) {
        if (!this.s.compareAndSet(false, true)) {
            return;
        }
        k(runnable);
    }

    @Override // defpackage.axbd
    public final synchronized boolean d() {
        return this.j == 3;
    }

    @Override // defpackage.axbd
    public final void e(List<awvv<?>> list) {
        axdr axdrVar;
        axds axdsVar = this.i;
        if (axdsVar == null) {
            axdrVar = axds.ac.bZ();
        } else {
            dsqp dsqpVar = (dsqp) axdsVar.cu(5);
            dsqpVar.bC(axdsVar);
            axdrVar = (axdr) dsqpVar;
        }
        for (awvv<?> awvvVar : list) {
            awwy.a(awvvVar).f(axdrVar);
        }
        this.i = axdrVar.bK();
        m(this.d.a().j());
    }

    public final bwrg<axds> f() {
        if (this.t == null) {
            this.t = this.a.a((dssr) axds.ac.cu(7), bwre.PERSISTENT_FILE, "saved_passive_assist_cache.data");
        }
        return this.t;
    }

    public final synchronized void g() {
        if (this.n.getPassiveAssistParameters().g().c) {
            this.i = null;
        }
    }

    public final synchronized void h() {
        if (this.q.isEmpty()) {
            return;
        }
        for (dbsz<axds> dbszVar : this.q) {
            dbszVar.NU(this.i);
        }
        this.q.clear();
    }

    public final synchronized void i() {
        awvv<?>[] a;
        axds axdsVar = this.i;
        if (axdsVar == null) {
            return;
        }
        btlu j = this.d.a().j();
        if (!axdsVar.d.equals(l(j))) {
            this.i = null;
            bwrg<axds> j2 = j(j);
            if (j2.b()) {
                ((ckco) this.c.a(ckih.b)).a(ckig.a(4));
                this.i = j2.i().a;
                i();
                return;
            }
            ((ckco) this.c.a(ckih.b)).a(ckig.a(1));
        } else if (axdsVar.e.equals(this.r)) {
            if ((axdsVar.a & 1) != 0 && axdsVar.b >= this.n.getPassiveAssistParameters().e()) {
                dkut d = this.n.getPassiveAssistParameters().d();
                axds axdsVar2 = this.i;
                if (axdsVar2 == null) {
                    return;
                }
                dsqp dsqpVar = (dsqp) axdsVar2.cu(5);
                dsqpVar.bC(axdsVar2);
                axdr axdrVar = (axdr) dsqpVar;
                for (awvv<?> awvvVar : awvv.a()) {
                    awwx a2 = awwy.a(awvvVar);
                    dkut dkutVar = ((axds) axdrVar.b).c;
                    if (dkutVar == null) {
                        dkutVar = dkut.X;
                    }
                    if (a2.b(dkutVar) < a2.b(d)) {
                        a2.f(axdrVar);
                        ((ckco) this.c.a(ckih.c)).a(awvvVar.O.an);
                    }
                }
                if (axdrVar.c) {
                    axdrVar.bF();
                    axdrVar.c = false;
                }
                axds axdsVar3 = (axds) axdrVar.b;
                d.getClass();
                axdsVar3.c = d;
                axdsVar3.a |= 2;
                this.i = axdrVar.bK();
                return;
            }
            this.i = null;
            ((ckco) this.c.a(ckih.b)).a(ckig.a(3));
        } else {
            this.i = null;
            ((ckco) this.c.a(ckih.b)).a(ckig.a(2));
        }
    }

    public final bwrg<axds> j(@dzsi btlu btluVar) {
        String l = l(btluVar);
        if (this.p.containsKey(l)) {
            return this.p.get(l);
        }
        StringBuilder sb = new StringBuilder(l.length() + 26);
        sb.append("passive_assist/");
        sb.append(l);
        sb.append("_cache.data");
        bwrg<axds> a = this.a.a((dssr) axds.ac.cu(7), bwre.PERSISTENT_FILE, sb.toString());
        this.p.put(l, a);
        return a;
    }
}
