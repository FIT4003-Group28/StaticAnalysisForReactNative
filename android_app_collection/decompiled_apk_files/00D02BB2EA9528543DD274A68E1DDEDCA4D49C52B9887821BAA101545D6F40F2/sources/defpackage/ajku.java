package defpackage;

import java.util.HashSet;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ajku  reason: default package */
/* loaded from: classes2.dex */
public final class ajku {
    public final btvo a;
    public final dxio<cqat> b;
    public final dxio<bvjj> c;
    public final dxio<ajsj> d;
    public final bvrb e;
    public final ajjn f;
    public ajlj g;
    public dbsg<bvpk> h;
    private final dxio<ajjt> i;
    private final dxio<ailb<aile>> j;
    @dzsi
    private final ahwo k;
    private final dxio<ajln> l;
    private final dxio<ajmq> m;
    private final dxio<ajnm> n;
    private final aijc o;
    private final akas p;
    private final dehn<Void> q;
    private final aijb r = new ajkq(this);
    private final aila s = new ajkr(this);

    /* JADX WARN: Multi-variable type inference failed */
    public ajku(dxio<ajjt> dxioVar, btvo btvoVar, dxio<cqat> dxioVar2, dxio<ailb<aile>> dxioVar3, ailf ailfVar, @dzsi ahwo ahwoVar, final btrm btrmVar, dxio<bvjj> dxioVar4, dxio<ajln> dxioVar5, dxio<ajsj> dxioVar6, dxio<ajmq> dxioVar7, dxio<ajnm> dxioVar8, aijc aijcVar, bvrb bvrbVar, ajjn ajjnVar, akas akasVar) {
        this.i = dxioVar;
        this.a = btvoVar;
        this.b = dxioVar2;
        this.j = dxioVar3;
        this.k = ahwoVar;
        this.c = dxioVar4;
        this.l = dxioVar5;
        this.d = dxioVar6;
        this.m = dxioVar7;
        this.n = dxioVar8;
        this.o = aijcVar;
        this.e = bvrbVar;
        this.f = ajjnVar;
        this.p = akasVar;
        ajju ajjuVar = new ajju();
        ajjuVar.c(dcmr.a);
        ajjuVar.i(dcax.a);
        ajjuVar.h(dcmn.a);
        ajjuVar.b = 2;
        ajjuVar.g(4);
        ajjuVar.a = new eapd(0L);
        ajjuVar.e(btvoVar.getLocationSharingParameters());
        this.g = ajjuVar.b();
        this.h = dbpy.a;
        final deig d = deig.d();
        this.q = d;
        if (bvrj.UI_THREAD.b()) {
            b(btrmVar);
        } else {
            bvrbVar.h().execute(new Runnable(this, btrmVar) { // from class: ajki
                private final ajku a;
                private final btrm b;

                {
                    this.a = this;
                    this.b = btrmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            });
        }
        deha.k(c(), ((aiiv) ailfVar).l, aijcVar.a()).b(new Callable(this, d) { // from class: ajkj
            private final ajku a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ajku ajkuVar = this.a;
                deig deigVar = this.b;
                ajkuVar.e(ajkuVar.g.g(), true);
                deigVar.j(null);
                return true;
            }
        }, bvrbVar.h());
    }

    public final dehn<Void> a() {
        return deha.o(this.q);
    }

    public final void b(btrm btrmVar) {
        this.j.a().c(this.s);
        ajkt ajktVar = new ajkt(this);
        dceq a = dcet.a();
        a.b(gds.class, new ajlk(0, gds.class, ajktVar, bvrj.UI_THREAD));
        a.b(btvr.class, new ajlk(1, btvr.class, ajktVar, bvrj.UI_THREAD));
        btrmVar.g(ajktVar, a.a());
        this.o.g(this.r);
    }

    public final dehn<Void> c() {
        final deig d = deig.d();
        this.e.b(new Runnable(this, d) { // from class: ajkk
            private final ajku a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajku ajkuVar = this.a;
                final deig deigVar = this.b;
                final dcep K = dcep.K(ajkuVar.d.a().g());
                ajkuVar.e.b(new Runnable(ajkuVar, K, deigVar) { // from class: ajkp
                    private final ajku a;
                    private final dcep b;
                    private final deig c;

                    {
                        this.a = ajkuVar;
                        this.b = K;
                        this.c = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajku ajkuVar2 = this.a;
                        dcep<btlu> dcepVar = this.b;
                        deig deigVar2 = this.c;
                        ajli g = ajkuVar2.g.g();
                        g.c(dcepVar);
                        ajkuVar2.d(g);
                        deigVar2.j(null);
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    public final void d(ajli ajliVar) {
        e(ajliVar, false);
    }

    public final void e(ajli ajliVar, boolean z) {
        dbsg<eaow> dbsgVar;
        bvrj.UI_THREAD.c();
        eapd eapdVar = new eapd(this.b.a().b());
        dcdz j = dced.j();
        if (this.o.b()) {
            dcpd<btlu> it = ajliVar.a().iterator();
            while (it.hasNext()) {
                btlu next = it.next();
                j.g(next, this.o.c(next));
            }
        }
        ajliVar.i(j.f());
        dcdg p = dcdn.p();
        dcpd<btlu> it2 = ajliVar.a().iterator();
        while (it2.hasNext()) {
            btlu next2 = it2.next();
            dbsg<aile> b = this.j.a().b(dbsg.i(next2));
            if (b.a()) {
                p.f(next2, b.b());
            }
        }
        ajliVar.h(p.b());
        ajliVar.f(eapdVar);
        ajlj b2 = ajliVar.b();
        dcep<btlu> k = this.g.k();
        HashSet hashSet = new HashSet(b2.k());
        hashSet.removeAll(k);
        dcep<btlu> K = dcep.K(hashSet);
        if (!K.isEmpty()) {
            ajln a = this.l.a();
            ckgz ckgzVar = ckgd.e;
            for (btlu btluVar : K) {
                a.a(btluVar, ckgzVar);
            }
            ajmq a2 = this.m.a();
            dqyy dqyyVar = b2.f().M;
            if (dqyyVar == null) {
                dqyyVar = dqyy.c;
            }
            dqyy dqyyVar2 = dqyyVar;
            dqza dqzaVar = b2.f().J;
            if (dqzaVar == null) {
                dqzaVar = dqza.c;
            }
            dqza dqzaVar2 = dqzaVar;
            dqzg dqzgVar = b2.f().N;
            if (dqzgVar == null) {
                dqzgVar = dqzg.c;
            }
            bvqd.a(a2.c(dqyyVar2, dqzaVar2, dqzgVar, K, dcep.B(dqym.APP_FOREGROUNDED), dbpy.a), this.e.h());
        }
        this.g = b2;
        dcep<btlu> i = b2.i(eapdVar);
        dcep<btlu> j2 = this.g.j(eapdVar);
        ahwo ahwoVar = this.k;
        if (ahwoVar != null) {
            dcft.o(i, ajkl.a);
            ahwoVar.b();
            ahwo ahwoVar2 = this.k;
            dcft.o(j2, ajkm.a);
            ahwoVar2.b();
        }
        if (j2.isEmpty()) {
            this.c.a().ai(bvjk.jD, dumt.NOT_SHARING);
        } else if (i.isEmpty()) {
            this.c.a().ai(bvjk.jD, dumt.SHARING_BUT_NOT_REPORTING);
        } else {
            this.c.a().ai(bvjk.jD, dumt.SHARING_AND_REPORTING);
        }
        dcdc r = dcdc.r(dcnm.p(j2, i));
        if (!r.isEmpty()) {
            akas.b(r);
        }
        if (this.q.isDone() || z) {
            f(eapdVar);
            bvrj.UI_THREAD.c();
            ajlj ajljVar = this.g;
            this.c.a();
            dbsg<eaow> o = ajljVar.o(eapdVar);
            if (o.a()) {
                this.i.a().a(o.b());
            } else {
                this.i.a().b();
            }
            bvrj.UI_THREAD.c();
            ajlj ajljVar2 = this.g;
            this.c.a();
            dkof dkofVar = ajljVar2.f().q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            if (dkofVar.m) {
                dbsgVar = dbpy.a;
            } else if (ajljVar2.i(eapdVar).isEmpty()) {
                dbsgVar = dbpy.a;
            } else {
                dbsg m = dcft.m(ajljVar2.n(), ajlb.a);
                if (!m.a()) {
                    dbsgVar = dbpy.a;
                } else {
                    if ((((dqzk) m.b()).a & 1) != 0) {
                        dqzi dqziVar = ((dqzk) m.b()).d;
                        if (dqziVar == null) {
                            dqziVar = dqzi.c;
                        }
                        if ((dqziVar.a & 1) != 0) {
                            dqzi dqziVar2 = ((dqzk) m.b()).d;
                            if (dqziVar2 == null) {
                                dqziVar2 = dqzi.c;
                            }
                            dbsgVar = dbsg.i(eaow.e(dqziVar2.b));
                        }
                    }
                    dbsgVar = dbpy.a;
                }
            }
            ajjn ajjnVar = this.f;
            dehn<Void> dehnVar = this.q;
            if (ajjnVar.f == null) {
                ajjnVar.f = dehnVar;
            }
            ajjnVar.h = dbsgVar;
            if (!ajjnVar.h.a() || ajjnVar.g.a()) {
                if (ajjnVar.h.a() || !ajjnVar.g.a()) {
                    return;
                }
                ajjnVar.b.a(ajjnVar.g.b());
                ajjnVar.g = dbpy.a;
                return;
            }
            ajjnVar.g = dbsg.i(new ajjm(ajjnVar));
            btrm btrmVar = ajjnVar.b;
            ajjm b3 = ajjnVar.g.b();
            dceq a3 = dcet.a();
            a3.b(crhp.class, new ajjo(0, crhp.class, b3, bvrj.UI_THREAD));
            a3.b(crhq.class, new ajjo(1, crhq.class, b3, bvrj.UI_THREAD));
            a3.b(crmk.class, new ajjo(2, crmk.class, b3, bvrj.UI_THREAD));
            a3.b(crmj.class, new ajjo(3, crmj.class, b3, bvrj.UI_THREAD));
            a3.b(crmh.class, new ajjo(4, crmh.class, b3, bvrj.UI_THREAD));
            btrmVar.g(b3, a3.a());
        }
    }

    public final void f(eapd eapdVar) {
        bvrj.UI_THREAD.c();
        if (this.h.a()) {
            this.h.b().b();
            this.h = dbpy.a;
        }
        ajlj ajljVar = this.g;
        this.c.a();
        dbsg<ajni> p = ajljVar.p(eapdVar);
        this.n.a().a(p);
        if (p.a()) {
            eaow eaowVar = new eaow(new eapd(this.b.a().b()), p.b().b());
            bvpk a = bvpk.a(new Runnable(this) { // from class: ajkn
                private final ajku a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajku ajkuVar = this.a;
                    ajkuVar.f(new eapd(ajkuVar.b.a().b()));
                }
            });
            this.h = dbsg.i(a);
            this.e.a(a, bvrj.UI_THREAD, eaowVar.b);
        }
    }

    public final void g(int i) {
        bvrj.UI_THREAD.c();
        if (this.g.d() == i) {
            return;
        }
        ahwo ahwoVar = this.k;
        if (ahwoVar != null) {
            ajjt.d(this.g.d());
            ahwoVar.b();
        }
        ajli g = this.g.g();
        g.g(i);
        d(g);
    }

    public final void h(int i) {
        bvrj.UI_THREAD.c();
        int h = this.g.h();
        if (h != 0) {
            if (h == i) {
                return;
            }
            ajli g = this.g.g();
            g.d(i);
            d(g);
            return;
        }
        throw null;
    }
}
