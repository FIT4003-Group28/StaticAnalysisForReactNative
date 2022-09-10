package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aean  reason: default package */
/* loaded from: classes.dex */
public final class aean implements aeaa {
    public static final dcqe a = dcqe.c("aean");
    public final dehq b;
    private final bvkx f;
    private final ckcw g;
    public final Set<aeaw> c = new aih();
    public final Set<aeal> d = new aih();
    private final Map<aeav, aeam> h = new aif();
    private final Map<aeav, aeak> i = new aif();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public aean(dehq dehqVar, bvkx bvkxVar, ckcw ckcwVar) {
        this.b = dehqVar;
        this.f = bvkxVar;
        this.g = ckcwVar;
    }

    private final synchronized void j() {
        this.c.clear();
    }

    private final synchronized void k() {
        this.d.clear();
        g();
    }

    private final void l(aeav aeavVar, int i) {
        ckgz ckgzVar = aeavVar.f;
        if (ckgzVar != null) {
            ((ckco) this.g.a(ckgzVar)).a(i - 1);
        }
    }

    @Override // defpackage.aeaa
    public final synchronized void a(aeaw aeawVar) {
        this.c.add(aeawVar);
        g();
    }

    @Override // defpackage.aeaa
    public final void b(final aeaw aeawVar, long j, TimeUnit timeUnit) {
        bvqd.a(this.b.d(new Runnable(this, aeawVar) { // from class: aeab
            private final aean a;
            private final aeaw b;

            {
                this.a = this;
                this.b = aeawVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        }, j, timeUnit), this.b);
    }

    @Override // defpackage.aeaa
    public final synchronized void c(aeav aeavVar, boolean z) {
        ckhg ckhgVar = aeavVar.g;
        if (ckhgVar != null) {
            this.i.put(aeavVar, new aeak(((ckcr) this.g.a(ckhgVar)).a(), z));
        }
        if (z) {
            if (this.h.get(aeavVar) == aeam.COMPLETED) {
                l(aeavVar, 2);
            }
        } else if (this.h.get(aeavVar) == aeam.INFLIGHT) {
            l(aeavVar, 3);
        } else if (this.h.get(aeavVar) == aeam.COMPLETED) {
            l(aeavVar, 4);
        } else {
            l(aeavVar, 5);
        }
        this.h.remove(aeavVar);
    }

    @Override // defpackage.aeaa
    public final synchronized void d(aeav aeavVar) {
        if (!this.i.containsKey(aeavVar)) {
            return;
        }
        aeak aeakVar = this.i.get(aeavVar);
        final int i = aeakVar.b ? 2 : 3;
        this.g.b(ckgx.PREFETCH_PAGE_DATA_SOURCE, new ckcx(i) { // from class: aeac
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.ckcx
            public final void a(ddyf ddyfVar) {
                int i2 = this.a;
                if (ddyfVar.c) {
                    ddyfVar.bF();
                    ddyfVar.c = false;
                }
                ddyq ddyqVar = (ddyq) ddyfVar.b;
                ddyq ddyqVar2 = ddyq.K;
                ddyqVar.t = i2 - 1;
                ddyqVar.a |= 8388608;
            }
        });
        aeakVar.a.b();
        this.g.b(ckgx.PREFETCH_PAGE_DATA_SOURCE, aead.a);
        this.i.remove(aeavVar);
    }

    @Override // defpackage.aeaa
    public final void e() {
        j();
        k();
    }

    @Override // defpackage.aeaa
    public final synchronized aeal f() {
        aeal aealVar;
        aealVar = new aeal(this);
        this.d.add(aealVar);
        return aealVar;
    }

    public final synchronized void g() {
        if (!this.d.isEmpty() || this.e.getAndSet(true)) {
            return;
        }
        this.f.k(new Runnable(this) { // from class: aeae
            private final aean a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aean aeanVar = this.a;
                int i = 0;
                aeanVar.e.set(false);
                synchronized (aeanVar) {
                    if (!aeanVar.d.isEmpty()) {
                        return;
                    }
                    aih aihVar = new aih();
                    aih<aeaw> aihVar2 = new aih();
                    synchronized (aeanVar) {
                        for (aeaw aeawVar : aeanVar.c) {
                            int d = aeawVar.d();
                            if (d <= 0) {
                                aihVar.add(aeawVar);
                            } else if (d > i) {
                                aihVar2.clear();
                                aihVar2.add(aeawVar);
                                i = d;
                            } else if (d == i) {
                                aihVar2.add(aeawVar);
                            }
                        }
                    }
                    for (final aeaw aeawVar2 : aihVar2) {
                        aeawVar2.e().c(aeanVar.b).execute(new Runnable(aeanVar, aeawVar2) { // from class: aeaf
                            private final aean a;
                            private final aeaw b;

                            {
                                this.a = aeanVar;
                                this.b = aeawVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                final aean aeanVar2 = this.a;
                                aeaw aeawVar3 = this.b;
                                Executor b = dehx.b(aeanVar2.b);
                                final deig<Boolean> d2 = deig.d();
                                final deig<Void> d3 = deig.d();
                                final aeav b2 = aeawVar3.b();
                                final aeal f = aeanVar2.f();
                                deha.q(d2, new aeaj(aeanVar2, b2, d3, f), b);
                                d3.Pk(new Runnable(aeanVar2, f, d3, d2, b2) { // from class: aeah
                                    private final aean a;
                                    private final deig b;
                                    private final deig c;
                                    private final aeav d;
                                    private final aeal e;

                                    {
                                        this.a = aeanVar2;
                                        this.e = f;
                                        this.b = d3;
                                        this.c = d2;
                                        this.d = b2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        aean aeanVar3 = this.a;
                                        aeal aealVar = this.e;
                                        deig deigVar = this.b;
                                        deig deigVar2 = this.c;
                                        aeav aeavVar = this.d;
                                        if (aealVar.b()) {
                                            aealVar.a();
                                        }
                                        if (deigVar.isCancelled()) {
                                            return;
                                        }
                                        if (!deigVar2.isDone()) {
                                            bvoo.h("Prefetch was marked as completed but never started", new Object[0]);
                                        }
                                        aeanVar3.i(aeavVar);
                                    }
                                }, b);
                                aeawVar3.c(d2, d3);
                            }
                        });
                    }
                    synchronized (aeanVar) {
                        aeanVar.c.removeAll(aihVar2);
                        aeanVar.c.removeAll(aihVar);
                        if (!aeanVar.c.isEmpty()) {
                            final aeal f = aeanVar.f();
                            deha.q(aeanVar.b.e(new Callable(f) { // from class: aeag
                                private final aeal a;

                                {
                                    this.a = f;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    this.a.a();
                                    return null;
                                }
                            }, 100L, TimeUnit.MILLISECONDS), new aeai(f), aeanVar.b);
                        }
                    }
                }
            }
        }, this.b, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    public final synchronized void h(aeav aeavVar) {
        l(aeavVar, 1);
        this.h.put(aeavVar, aeam.INFLIGHT);
    }

    public final synchronized void i(aeav aeavVar) {
        if (this.h.containsKey(aeavVar)) {
            this.h.put(aeavVar, aeam.COMPLETED);
        }
    }
}
