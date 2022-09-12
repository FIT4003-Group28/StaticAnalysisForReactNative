package defpackage;

import android.app.Application;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avcr  reason: default package */
/* loaded from: classes2.dex */
public final class avcr implements avcm {
    public final btrm a;
    public final dxio<aver> b;
    public final bvkx c;
    @dzsi
    public awce d;
    public avzg e;
    public final avbv f;
    public final avfg g;
    public final avap h;
    public final awiw i;
    public final avzs j;
    public final crzm<avzg> k;
    public final Executor l;
    @dzsi
    private awdd m;
    private final crzo<avzg> n;
    private final avrw o;
    private final avki p;
    private final dbty<awcy> q = new avcp(this);
    private final dbty<awcd> r = new avcq(this);

    public avcr(btrm btrmVar, bvkx bvkxVar, dxio dxioVar, avet avetVar, avbw avbwVar, avfh avfhVar, avaq avaqVar, avsm avsmVar, awiw awiwVar, awaa awaaVar, Executor executor) {
        this.a = btrmVar;
        this.c = bvkxVar;
        this.b = dxioVar;
        crzo<avzg> crzoVar = new crzo<>();
        this.n = crzoVar;
        this.e = avsmVar.c();
        this.l = executor;
        this.i = awiwVar;
        avrw avrwVar = new avrw(crzoVar.a);
        this.o = avrwVar;
        avzg c = avsmVar.c();
        avfe avfeVar = (avfe) avetVar;
        avfeVar.v.a();
        Application application = avfeVar.a;
        bvjj bvjjVar = avfeVar.c;
        dxio<btvo> dxioVar2 = avfeVar.b;
        avbp avbpVar = avfeVar.d;
        dxio<aver> dxioVar3 = avfeVar.r;
        awar awarVar = avfeVar.e;
        dehn<avgx> dehnVar = avfeVar.k;
        avzh avzhVar = avfeVar.f;
        avpt<dlrl> avptVar = avfeVar.g;
        awmf awmfVar = avfeVar.h;
        dehp dehpVar = avfeVar.i;
        dehp dehpVar2 = avfeVar.j;
        avkd avkdVar = avfeVar.l;
        avfd avfdVar = new avfd(bvjjVar, dxioVar2, dxioVar3, dehnVar, avzhVar, avptVar, awmfVar, dehpVar, dehpVar2, c, avfeVar.m, avfeVar.n, avfeVar.o, avfeVar.p, avfeVar.q, avfeVar.u, avrwVar, avfeVar.s, avfeVar.t);
        if (avfdVar.p == null) {
            avfdVar.p = new aveu(avfdVar);
            avpt<dlrl> avptVar2 = avfdVar.f;
            avptVar2.a.put(avfdVar.p, avptVar2);
        }
        if (avfdVar.o == null) {
            avfc avfcVar = new avfc(avfdVar);
            avfdVar.g.f().e(avfcVar, avfdVar.i);
            avfdVar.o = avfcVar;
        }
        this.p = avfdVar;
        ckcw a = avbwVar.a.a();
        avbw.a(a, 1);
        Executor a2 = avbwVar.b.a();
        avbw.a(a2, 2);
        avzm a3 = avbwVar.c.a();
        avbw.a(a3, 3);
        avzo a4 = avbwVar.d.a();
        avbw.a(a4, 4);
        avbw.a(avfdVar, 5);
        this.f = new avbv(a, a2, a3, a4, avfdVar);
        btrm a5 = avfhVar.a.a();
        avfh.a(a5, 1);
        avfh.a(avfdVar, 2);
        this.g = new avfg(a5, avfdVar);
        crzn<avzg> crznVar = crzoVar.a;
        crzm<avkc> a6 = awaaVar.a.a();
        awaa.a(a6, 1);
        awar a7 = awaaVar.b.a();
        awaa.a(a7, 2);
        Executor a8 = awaaVar.c.a();
        awaa.a(a8, 3);
        Executor a9 = awaaVar.d.a();
        awaa.a(a9, 4);
        avjm a10 = awaaVar.e.a();
        awaa.a(a10, 5);
        awaa.a(avfdVar, 6);
        awaa.a(crznVar, 7);
        this.j = new avzz(a6, a7, a8, a9, a10, avfdVar, crznVar);
        crzn<avzg> crznVar2 = crzoVar.a;
        avku a11 = avaqVar.a.a();
        avaq.a(a11, 1);
        avll a12 = avaqVar.b.a();
        avaq.a(a12, 2);
        avkp a13 = avaqVar.c.a();
        avaq.a(a13, 3);
        crzm<avkq> a14 = avaqVar.d.a();
        avaq.a(a14, 4);
        Executor a15 = avaqVar.e.a();
        avaq.a(a15, 5);
        avoj a16 = avaqVar.f.a();
        avaq.a(a16, 6);
        avaq.a(avfdVar, 7);
        avaq.a(crznVar2, 8);
        this.h = new avap(a11, a12, a13, a14, a15, a16, avfdVar, crznVar2);
        this.k = avsmVar.b();
    }

    @Override // defpackage.avcm
    public final dbty<awcy> a() {
        return this.q;
    }

    @Override // defpackage.avcm
    public final dbty<awcd> b() {
        return this.r;
    }

    @Override // defpackage.avcm
    public final synchronized avij c() {
        return this.p;
    }

    @Override // defpackage.avcm
    public final synchronized avki d() {
        return this.p;
    }

    @Override // defpackage.avcm
    public final synchronized avjl e() {
        return this.p;
    }

    @Override // defpackage.avcm
    public final synchronized avzs f() {
        return this.j;
    }

    @Override // defpackage.avcm
    public final crzm<avzg> g() {
        return this.n.a;
    }

    @Override // defpackage.avcm
    public final avrw h() {
        return this.o;
    }

    public final awdd i() {
        awdd awddVar = this.m;
        if (awddVar != null) {
            return awddVar;
        }
        awdd b = this.b.a().b(this.e.b(), this.e.a());
        this.m = b;
        b.h();
        return this.m;
    }

    public final synchronized void j(crzm<avzg> crzmVar) {
        avzg avzgVar = this.e;
        avzg l = crzmVar.l();
        dbsk.s(l);
        this.e = l;
        if (l.equals(avzgVar)) {
            return;
        }
        if (!avzgVar.b().equals(this.e.b())) {
            awdd awddVar = this.m;
            if (awddVar != null) {
                awddVar.i();
                this.m = null;
            }
            this.d = null;
        }
        avki avkiVar = this.p;
        avzg avzgVar2 = this.e;
        synchronized (((avfd) avkiVar).n) {
            final avfa M = ((avfd) avkiVar).M();
            if (!((avag) M).b.equals(avzgVar2)) {
                boolean z = !((avag) M).b.b().equals(avzgVar2.b());
                avfa e = avfa.e(z ? new avfb((avfd) avkiVar, avzgVar2) : ((avag) M).a, avzgVar2);
                synchronized (((avfd) avkiVar).l) {
                    ((avfd) avkiVar).m = e;
                }
                if (z) {
                    dbsk.a(!((avag) M).b.b().equals(((avag) e).b.b()));
                    final avel b = ((avag) M).a.b();
                    if (b != null) {
                        b.c();
                        final avel c = e.c();
                        final dlsw d = e.d();
                        bvqj.c(((avfd) avkiVar).d, new bvqg(b, c, d) { // from class: avex
                            private final avel a;
                            private final avel b;
                            private final dlsw c;

                            {
                                this.a = b;
                                this.b = c;
                                this.c = d;
                            }

                            @Override // defpackage.bvqg
                            public final void NU(Object obj) {
                                avel avelVar = this.a;
                                avel avelVar2 = this.b;
                                dlsw dlswVar = this.c;
                                avgx avgxVar = (avgx) obj;
                                if (avgxVar != null) {
                                    avze a = avelVar.a();
                                    avze a2 = avelVar2.a();
                                    if (avze.a.equals(a) || avze.a.equals(a2) || avgxVar.c.a().a() || a.e() == a2.e() || !dbsd.a(a.c(), a2.c()) || !dbsd.a(a.d(), a2.d())) {
                                        return;
                                    }
                                    avelVar.g.Pk(new Runnable(avelVar, new avgt(avgxVar, avelVar2, dlswVar, avelVar)) { // from class: avdo
                                        private final avel a;
                                        private final avgt b;

                                        {
                                            this.a = avelVar;
                                            this.b = r2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final dlrb dlrbVar;
                                            avel avelVar3 = this.a;
                                            avgt avgtVar = this.b;
                                            avol avolVar = avelVar3.f;
                                            try {
                                                dlrbVar = (dlrb) dsqw.cq(dlrb.b, avolVar.c.A(avolVar.b));
                                            } catch (Exception e2) {
                                                avolVar.a("exportRegionDefinitions", e2);
                                                dlrbVar = dlrb.b;
                                            }
                                            final avgx avgxVar2 = avgtVar.a;
                                            final avel avelVar4 = avgtVar.b;
                                            final dlsw dlswVar2 = avgtVar.c;
                                            final avel avelVar5 = avgtVar.d;
                                            if (dlrbVar.a.size() == 0) {
                                                return;
                                            }
                                            final dlrb dlrbVar2 = dlrbVar;
                                            final avej avejVar = new avej(avgxVar2, dlrbVar2, avelVar4, dlswVar2, avelVar5) { // from class: avgu
                                                private final avgx a;
                                                private final dlrb b;
                                                private final avel c;
                                                private final dlsw d;
                                                private final avel e;

                                                {
                                                    this.a = avgxVar2;
                                                    this.b = dlrbVar2;
                                                    this.c = avelVar4;
                                                    this.d = dlswVar2;
                                                    this.e = avelVar5;
                                                }

                                                @Override // defpackage.avej
                                                public final void a(dlqx dlqxVar) {
                                                    final avgx avgxVar3 = this.a;
                                                    dlrb dlrbVar3 = this.b;
                                                    avel avelVar6 = this.c;
                                                    final dlsw dlswVar3 = this.d;
                                                    avel avelVar7 = this.e;
                                                    avkc l2 = avgxVar3.b.l();
                                                    dbsk.s(l2);
                                                    int c2 = l2.c();
                                                    int i = dlqxVar.c;
                                                    dlrbVar3.a.size();
                                                    avelVar6.a();
                                                    if (c2 == 1) {
                                                        deha.q(deew.h(avelVar6.g, new dbrn(avelVar6, dlswVar3) { // from class: avcz
                                                            private final avel a;
                                                            private final dlsw b;

                                                            {
                                                                this.a = avelVar6;
                                                                this.b = dlswVar3;
                                                            }

                                                            @Override // defpackage.dbrn
                                                            public final Object a(Object obj2) {
                                                                avrx avrxVar = (avrx) obj2;
                                                                return this.a.g(this.b);
                                                            }
                                                        }, avelVar6.h), bvqj.b(new bvqg(avgxVar3, dlswVar3) { // from class: avgv
                                                            private final avgx a;
                                                            private final dlsw b;

                                                            {
                                                                this.a = avgxVar3;
                                                                this.b = dlswVar3;
                                                            }

                                                            @Override // defpackage.bvqg
                                                            public final void NU(Object obj2) {
                                                                avgx avgxVar4 = this.a;
                                                                dlsw dlswVar4 = this.b;
                                                                if (!((List) obj2).isEmpty()) {
                                                                    avgxVar4.a.a(dlswVar4.b, false, null);
                                                                }
                                                            }
                                                        }), avgxVar3.d);
                                                    }
                                                    avelVar7.b(dcbg.b(dlrbVar3.a).s(avgw.a).z());
                                                }
                                            };
                                            if (avelVar4.k()) {
                                                avejVar.a(dlqx.d);
                                            } else {
                                                avelVar4.g.Pk(new Runnable(avelVar4, avejVar, dlrbVar) { // from class: avdp
                                                    private final avel a;
                                                    private final avej b;
                                                    private final dlrb c;

                                                    {
                                                        this.a = avelVar4;
                                                        this.b = avejVar;
                                                        this.c = dlrbVar;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        dlqx bK;
                                                        avel avelVar6 = this.a;
                                                        avej avejVar2 = this.b;
                                                        dlrb dlrbVar3 = this.c;
                                                        avol avolVar2 = avelVar6.f;
                                                        try {
                                                            bK = (dlqx) dsqw.cq(dlqx.d, avolVar2.c.B(avolVar2.b, dlrbVar3.bS()));
                                                        } catch (Exception e3) {
                                                            avolVar2.a("importRegionDefinitions", e3);
                                                            dlqv bZ = dlqx.d.bZ();
                                                            if (bZ.c) {
                                                                bZ.bF();
                                                                bZ.c = false;
                                                            }
                                                            dlqx dlqxVar = (dlqx) bZ.b;
                                                            dlqxVar.b = 0;
                                                            dlqxVar.a |= 1;
                                                            bK = bZ.bK();
                                                        }
                                                        avejVar2.a(bK);
                                                    }
                                                }, avelVar4.i);
                                            }
                                        }
                                    }, avelVar.i);
                                }
                            }
                        }, ((avfd) avkiVar).h);
                    }
                    ((avfd) avkiVar).a(e, ((avfd) avkiVar).g.e());
                }
                dlsw d2 = e.d();
                avel c2 = e.c();
                if (c2.a().equals(avze.a) || ((avfd) avkiVar).j.a()) {
                    ((avfd) avkiVar).a.S(bvjk.bK, false);
                } else {
                    deha.q(c2.h(d2), new avez((avfd) avkiVar), ((avfd) avkiVar).h);
                }
                if (((avfd) avkiVar).e != null && !((avag) M).b.b().equals(avze.a) && !dbsd.a(((avag) M).b.a().a(), ((avag) e).b.a().a())) {
                    ((avfd) avkiVar).e.b();
                }
                avfd.L(e);
                if (((avfd) avkiVar).b.a().getOfflineMapsParameters().F && avzj.d(M.d()) && !avze.a.equals(((avag) e).b.b()) && !avzj.d(e.d()) && !((avfd) avkiVar).j.a()) {
                    ((avfd) avkiVar).h.execute(new Runnable(M) { // from class: avew
                        private final avfa a;

                        {
                            this.a = M;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            avfa avfaVar = this.a;
                            avel c3 = avfaVar.c();
                            dlsw d3 = avfaVar.d();
                            if (c3.k()) {
                                return;
                            }
                            c3.g.Pk(new Runnable(c3, d3) { // from class: aveg
                                private final avel a;
                                private final dlsw b;

                                {
                                    this.a = c3;
                                    this.b = d3;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dlrq b2;
                                    avel avelVar = this.a;
                                    dlsw dlswVar = this.b;
                                    avfn a = avelVar.e.a();
                                    if (a.b != null) {
                                        for (dltm dltmVar : a.c.f(dlswVar).b) {
                                            a.b.d(dltmVar.b);
                                        }
                                    }
                                    avbe avbeVar = a.a;
                                    avol avolVar = a.c;
                                    try {
                                        b2 = (dlrq) dsqw.cq(dlrq.q, avolVar.c.F(avolVar.b, dlswVar.bS()));
                                    } catch (Exception e2) {
                                        avolVar.a("deleteOwner", e2);
                                        b2 = avol.b();
                                    }
                                    avbeVar.a(b2);
                                }
                            }, c3.i);
                        }
                    });
                }
            }
        }
        this.n.a(this.e);
    }
}
