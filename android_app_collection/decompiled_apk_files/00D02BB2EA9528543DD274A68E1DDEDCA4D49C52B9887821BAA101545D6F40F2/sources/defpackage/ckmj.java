package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: ckmj  reason: default package */
/* loaded from: classes4.dex */
public final class ckmj implements ckmm {
    private final dxio<dkiy> a;
    private final dzsj<duxm> b;
    private final cqat c;
    private final dzsj<cwsy> d;
    private final ConcurrentHashMap<cwsv, Long> e = new ConcurrentHashMap<>();

    public ckmj(dzsj<cwsy> dzsjVar, dxio<dkiy> dxioVar, dzsj<duxm> dzsjVar2, cqat cqatVar) {
        this.a = dxioVar;
        this.b = dzsjVar2;
        this.c = cqatVar;
        this.d = dzsjVar;
    }

    private final void y(String str, @dzsi dzze dzzeVar) {
        if (this.a.a().J || this.a.a().I || this.b.a().i > 0.0f) {
            if (dzzeVar != null) {
                a().c(str, dzzeVar);
            } else {
                a().a.r(str);
            }
        }
    }

    @Override // defpackage.ckmm
    public final cwsy a() {
        return this.d.a();
    }

    @Override // defpackage.ckmm
    public final void b() {
        a().a.l();
        a().a.e();
    }

    @Override // defpackage.ckmm
    public final void c(final CronetEngine cronetEngine) {
        dbsk.s(cronetEngine);
        if (cwti.b == null) {
            synchronized (cwti.a) {
                if (cwti.b == null) {
                    cwti.b = new cwti();
                }
            }
        }
        final cwti cwtiVar = cwti.b;
        cwsy b = cwsy.b();
        cwtl.a(b.a.d(new Runnable(cwtiVar, cronetEngine) { // from class: cwtg
            private final cwti a;
            private final CronetEngine b;

            {
                this.a = cwtiVar;
                this.b = cronetEngine;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cwti cwtiVar2 = this.a;
                CronetEngine cronetEngine2 = this.b;
                if (!cwsy.b().m()) {
                    return;
                }
                synchronized (cwtiVar2.d) {
                    if (cwtiVar2.e == null) {
                        cwsz cwszVar = cwsy.b().a;
                        if (cwszVar.c(new cwud(cwtiVar2) { // from class: cwth
                            private final cwti a;

                            {
                                this.a = cwtiVar2;
                            }

                            @Override // defpackage.cwud
                            public final void Sz() {
                                cwti cwtiVar3 = this.a;
                                synchronized (cwtiVar3.d) {
                                    if (cwtiVar3.e != null) {
                                        cwtiVar3.e.removeRequestFinishedListener(cwtiVar3.c);
                                    }
                                }
                            }
                        })) {
                            cwtiVar2.e = (ExperimentalCronetEngine) cronetEngine2;
                            cwtiVar2.c = new cxav(cwszVar.a().a());
                            cwtiVar2.e.addRequestFinishedListener(cwtiVar2.c);
                        }
                    } else {
                        cwtiVar2.e.equals(cronetEngine2);
                    }
                }
            }
        }));
    }

    @Override // defpackage.ckmm
    @Deprecated
    public final void d(String str) {
        y(str, null);
    }

    @Override // defpackage.ckmm
    public final void e(cwsv cwsvVar) {
        y(cwsvVar.a, null);
    }

    @Override // defpackage.ckmm
    public final void f(cwsv cwsvVar, dzze dzzeVar) {
        y(cwsvVar.a, dzzeVar);
    }

    @Override // defpackage.ckmm
    public final void g(cwsv cwsvVar) {
        y(cwsvVar.a, null);
    }

    @Override // defpackage.ckmm
    public final void h(cwsv cwsvVar, eacm eacmVar) {
        String str = cwsvVar.a;
        dzzb bZ = dzzc.c.bZ();
        if (eacmVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzzc dzzcVar = (dzzc) bZ.b;
            eacmVar.getClass();
            dzzcVar.b = eacmVar;
            dzzcVar.a |= 4;
        }
        dzzd dzzdVar = (dzzd) dzze.a.bZ();
        dzzdVar.k(dzzc.d, bZ.bK());
        y(str, (dzze) dzzdVar.bK());
    }

    @Override // defpackage.ckmm
    public final void i(cwsv cwsvVar) {
        if (this.a.a().J) {
            String str = cwsvVar.a;
            cwsy.b().a.f(cwsv.d(cwsvVar));
        }
    }

    @Override // defpackage.ckmm
    public final void j(cwsv cwsvVar, @dzsi dzze dzzeVar) {
        if (this.a.a().J) {
            String str = cwsvVar.a;
            cwsy.b().a.x(cwsv.d(cwsvVar), dzzeVar);
        }
    }

    @Override // defpackage.ckmm
    public final void k(cwsv cwsvVar) {
        if (this.a.a().J) {
            cwsy.b().a.g(cwsv.d(cwsvVar));
        }
    }

    @Override // defpackage.ckmm
    public final void l(cwsv cwsvVar) {
        cwsy.b().a.t(cwsv.d(cwsvVar));
    }

    @Override // defpackage.ckmm
    public final void m(cwsv cwsvVar, dzze dzzeVar) {
        cwsy.b().a.u(cwsv.d(cwsvVar), dzzeVar);
    }

    @Override // defpackage.ckmm
    public final void n(cwsv cwsvVar) {
        cwsy.b().a.q(cwsv.d(cwsvVar));
    }

    @Override // defpackage.ckmm
    public final void o(cwsv cwsvVar, dzze dzzeVar) {
        a().f(cwsvVar, cwsvVar, dzzeVar);
    }

    @Override // defpackage.ckmm
    public final synchronized void p(cwsv cwsvVar) {
        a().a.v(cwsy.n(cwsvVar), 1);
    }

    @Override // defpackage.ckmm
    public final void q(cwsv cwsvVar) {
        a().e(cwsvVar);
    }

    @Override // defpackage.ckmm
    public final void r(cwsv cwsvVar) {
        a().g(cwsvVar);
    }

    @Override // defpackage.ckmm
    public final void s(cwsv cwsvVar) {
        a().j(cwsvVar);
    }

    @Override // defpackage.ckmm
    public final void t(cwsv cwsvVar) {
        a().k(cwsvVar);
    }

    @Override // defpackage.ckmm
    public final void u(cwsv cwsvVar, dzze dzzeVar) {
        a().a.n(cwsy.n(cwsvVar), true, dzzeVar);
    }

    @Override // defpackage.ckmm
    public final void v(cwsv cwsvVar) {
        a().l(cwsvVar);
    }

    @Override // defpackage.ckmm
    public final void w(cwsv cwsvVar) {
        long b = this.c.b();
        ConcurrentHashMap<cwsv, Long> concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(b);
        Long putIfAbsent = concurrentHashMap.putIfAbsent(cwsvVar, valueOf);
        if (putIfAbsent == null) {
            e(cwsvVar);
        } else if (b - putIfAbsent.longValue() < 60000 || !this.e.replace(cwsvVar, putIfAbsent, valueOf)) {
        } else {
            e(cwsvVar);
        }
    }

    @Override // defpackage.ckmm
    public final void x() {
    }
}
