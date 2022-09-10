package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: avel  reason: default package */
/* loaded from: classes2.dex */
public final class avel implements avke {
    public static final eaow q = eaow.a(7);
    public final cqat a;
    public final awfh b;
    public final avpn c;
    public final dxio<awkw> d;
    public final dxio<avfn> e;
    public final avol f;
    public final dehn<avrx> g;
    public final dehq h;
    public final Executor i;
    public final dxio<avar> j;
    public final avzo k;
    public final avzr l;
    public final avzm m;
    public final awhl n;
    public final avpz o;
    public crzp<Boolean> p;
    private final Executor r;
    private final crzp<Boolean> s;
    private final dxio<avrw> t;
    @dzsi
    private ScheduledFuture<?> u = null;
    @dzsi
    private ScheduledFuture<?> v = null;

    public avel(awfh awfhVar, cqat cqatVar, final dxio<avas> dxioVar, final dxio<avbf> dxioVar2, avpn avpnVar, dxio<awkw> dxioVar3, final dxio<avfo> dxioVar4, dehq dehqVar, Executor executor, dehq dehqVar2, final avhd avhdVar, avpo avpoVar, avzo avzoVar, avzm avzmVar, avzr avzrVar, awhl awhlVar, avpz avpzVar, dxio<avrw> dxioVar5, final avol avolVar) {
        this.a = cqatVar;
        this.b = awfhVar;
        this.c = avpnVar;
        this.d = dxioVar3;
        this.e = btsp.b(new dbty(dxioVar4, dxioVar2, avhdVar, avolVar) { // from class: avcs
            private final dxio a;
            private final dxio b;
            private final avhd c;
            private final avol d;

            {
                this.a = dxioVar4;
                this.b = dxioVar2;
                this.c = avhdVar;
                this.d = avolVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar6 = this.a;
                dxio dxioVar7 = this.b;
                avhd avhdVar2 = this.c;
                avol avolVar2 = this.d;
                eaow eaowVar = avel.q;
                avfo avfoVar = (avfo) dxioVar6.a();
                avbf avbfVar = (avbf) dxioVar7.a();
                btvo a = avbfVar.a.a();
                avbf.a(a, 1);
                avba a2 = avbfVar.b.a();
                avbf.a(a2, 2);
                avop a3 = avbfVar.c.a();
                avbf.a(a3, 3);
                avbz a4 = avbfVar.d.a();
                avbf.a(a4, 4);
                avtr a5 = avbfVar.e.a();
                avbf.a(a5, 5);
                avll a6 = avbfVar.f.a();
                avbf.a(a6, 6);
                awhs a7 = avbfVar.g.a();
                avbf.a(a7, 7);
                Executor a8 = avbfVar.h.a();
                avbf.a(a8, 8);
                Executor a9 = avbfVar.i.a();
                avbf.a(a9, 9);
                dehq a10 = avbfVar.j.a();
                avbf.a(a10, 10);
                avki a11 = avbfVar.k.a();
                avbf.a(a11, 11);
                avjl a12 = avbfVar.l.a();
                avbf.a(a12, 12);
                dxio a13 = ((dxjh) avbfVar.m).a();
                avbf.a(a13, 13);
                cjqy a14 = avbfVar.n.a();
                avbf.a(a14, 14);
                avtv a15 = avbfVar.o.a();
                avbf.a(a15, 15);
                avbf.a(avhdVar2, 16);
                avbf.a(avolVar2, 17);
                avbe avbeVar = new avbe(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, avhdVar2, avolVar2);
                bvow a16 = avfoVar.b.a();
                avfo.a(a16, 2);
                avra a17 = avfoVar.c.a();
                avfo.a(a17, 3);
                cjqy a18 = avfoVar.d.a();
                avfo.a(a18, 4);
                avtt a19 = avfoVar.e.a();
                avfo.a(a19, 5);
                Executor a20 = avfoVar.f.a();
                avfo.a(a20, 6);
                avgs a21 = avfoVar.g.a();
                avfo.a(a21, 7);
                avfo.a(avbeVar, 8);
                avfo.a(avhdVar2, 9);
                avfo.a(avolVar2, 10);
                return new avfn(avfoVar.a.a(), a16, a17, a18, a19, a20, a21, avbeVar, avhdVar2, avolVar2);
            }
        });
        this.j = btsp.b(new dbty(this, dxioVar, avolVar) { // from class: avdb
            private final avel a;
            private final dxio b;
            private final avol c;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = avolVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                avel avelVar = this.a;
                dxio dxioVar6 = this.b;
                avol avolVar2 = this.c;
                avas avasVar = (avas) dxioVar6.a();
                avze a = avolVar2.instance.a();
                avfn a2 = avelVar.e.a();
                cqat a3 = avasVar.a.a();
                avas.a(a3, 1);
                awkw a4 = avasVar.b.a();
                avas.a(a4, 2);
                avas.a(avasVar.c.a(), 3);
                avas.a(avasVar.d.a(), 4);
                avas.a(a, 5);
                avas.a(a2, 6);
                return new avar(a3, a4, a2);
            }
        });
        this.k = avzoVar;
        this.m = avzmVar;
        this.l = avzrVar;
        this.f = avolVar;
        this.g = avolVar.instance.e();
        this.h = dehqVar;
        this.r = executor;
        this.i = dehqVar2;
        this.n = awhlVar;
        this.o = avpzVar;
        this.t = dxioVar5;
        final WeakReference weakReference = new WeakReference(avhdVar);
        crzp<Boolean> crzpVar = new crzp(weakReference) { // from class: avdl
            private final WeakReference a;

            {
                this.a = weakReference;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                avhd avhdVar2;
                WeakReference weakReference2 = this.a;
                if (!Boolean.TRUE.equals(crzmVar.l()) || (avhdVar2 = (avhd) weakReference2.get()) == null) {
                    return;
                }
                avhdVar2.d();
            }
        };
        this.s = crzpVar;
        avpoVar.a().b(crzpVar, dehqVar);
    }

    public static avei m(avid avidVar) {
        return new avei(avidVar);
    }

    public final avze a() {
        return this.f.j();
    }

    public final void b(final List<dspd> list) {
        if (k()) {
            return;
        }
        this.g.Pk(new Runnable(this, list) { // from class: avef
            private final avel a;
            private final List b;

            {
                this.a = this;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dlrq b;
                avel avelVar = this.a;
                List<dspd> list2 = this.b;
                avfn a = avelVar.e.a();
                avbe avbeVar = a.a;
                avol avolVar = a.c;
                dlpm bZ = dlpn.b.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlpn dlpnVar = (dlpn) bZ.b;
                dsrj<dspd> dsrjVar = dlpnVar.a;
                if (!dsrjVar.a()) {
                    dlpnVar.a = dsqw.cl(dsrjVar);
                }
                dsod.bv(list2, dlpnVar.a);
                try {
                    b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.v(avolVar.b, bZ.bK().bS()));
                } catch (Exception e) {
                    avolVar.a("deleteRegions", e);
                    b = avol.b();
                }
                avbeVar.a(b);
                if (a.b != null) {
                    for (dspd dspdVar : list2) {
                        a.b.d(dspdVar);
                    }
                }
            }
        }, this.i);
    }

    public final void c() {
        if (k()) {
            return;
        }
        this.g.Pk(new Runnable(this) { // from class: avct
            private final avel a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dlrq b;
                avfn a = this.a.e.a();
                a.f.e();
                avbe avbeVar = a.a;
                avol avolVar = a.c;
                try {
                    b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.g(avolVar.b));
                } catch (Exception e) {
                    avolVar.a("cancelUpdate", e);
                    b = avol.b();
                }
                avbeVar.a(b);
            }
        }, this.i);
    }

    public final void d(final dluy dluyVar) {
        if (k()) {
            return;
        }
        this.g.Pk(new Runnable(this, dluyVar) { // from class: avcv
            private final avel a;
            private final dluy b;

            {
                this.a = this;
                this.b = dluyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dlsu dlsuVar;
                avel avelVar = this.a;
                dluy dluyVar2 = this.b;
                avfn a = avelVar.e.a();
                avol avolVar = a.c;
                try {
                    dlsuVar = (dlsu) dsqw.cq(dlsu.c, avolVar.c.p(avolVar.b, dluyVar2));
                } catch (Exception e) {
                    avolVar.a("optimizeIfNeeded", e);
                    dlsuVar = dlsu.c;
                }
                if ((dlsuVar.a & 1) != 0) {
                    cjqy cjqyVar = a.g;
                    cjtk[] cjtkVarArr = new cjtk[1];
                    avtt avttVar = a.h;
                    ddpk ddpkVar = dlsuVar.b;
                    if (ddpkVar == null) {
                        ddpkVar = ddpk.a;
                    }
                    dbsg<ddlp> G = a.g.G();
                    cqat a2 = avttVar.a.a();
                    avtt.a(a2, 1);
                    avtt.a(ddpkVar, 2);
                    avtt.a(G, 3);
                    cjtkVarArr[0] = new avts(a2, ddpkVar, G);
                    cjqyVar.u(cjtkVarArr);
                }
            }
        }, this.r);
    }

    public final dlrj e(dlsw dlswVar) {
        return this.f.f(dlswVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List<dltm> f() {
        dlrj dlrjVar = this.f;
        try {
            byte[] K = dlrjVar.c.K(dlrjVar.b);
            if (K != null) {
                dlrjVar = (dlrj) dsqw.cq(dlrj.e, K);
            } else {
                bvoo.h("Unexpected null InfrastructureState", new Object[0]);
                dlrjVar.d.d();
                dlrjVar = dlrj.e;
            }
        } catch (Exception e) {
            dlrjVar.a("getInfrastructureStateWithAllOwners", e);
            dlrjVar = dlrj.e;
        }
        return dlrjVar.b;
    }

    public final List<dltm> g(dlsw dlswVar) {
        return e(dlswVar).b;
    }

    public final dehn<dlrj> h(final dlsw dlswVar) {
        return deew.h(this.g, new dbrn(this, dlswVar) { // from class: avda
            private final avel a;
            private final dlsw b;

            {
                this.a = this;
                this.b = dlswVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avrx avrxVar = (avrx) obj;
                return this.a.e(this.b);
            }
        }, this.h);
    }

    public final synchronized void i(@dzsi ScheduledFuture<?> scheduledFuture) {
        ScheduledFuture<?> scheduledFuture2 = this.u;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.u = scheduledFuture;
    }

    public final synchronized void j(@dzsi ScheduledFuture<?> scheduledFuture) {
        ScheduledFuture<?> scheduledFuture2 = this.v;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.v = scheduledFuture;
    }

    public final boolean k() {
        return dbsd.a(a(), avze.a) || this.t.a().a();
    }

    public final boolean l(dlsw dlswVar) {
        if (k()) {
            return true;
        }
        avze a = a();
        return !a.c().equals(avzd.MULTI_OWNER) && !dbsd.a(dlswVar.b, a.d());
    }
}
