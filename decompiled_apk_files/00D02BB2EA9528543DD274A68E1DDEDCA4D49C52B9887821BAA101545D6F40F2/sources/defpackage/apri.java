package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: apri  reason: default package */
/* loaded from: classes2.dex */
public final class apri implements aprv {
    public final ckcw a;
    public final aprz b;
    public btlu c;
    private final dehq d;
    private final cjqy e;
    private final apro f;
    private final apyx g;
    private final akfa h;
    private final apsv i;
    private final ConcurrentHashMap<btlu, crzo<apsi<Set<String>>>> j = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<btlu, crzo<apsi<Set<apsg>>>> k = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<dbsi<btlu, String>, crzo<apsi<dbsg<apsg>>>> l = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<btlu, AtomicBoolean> m = new ConcurrentHashMap<>();
    private final Map<btlu, ckcq> n = new HashMap();
    private aprh o;

    public apri(dehq dehqVar, ckcw ckcwVar, cjqy cjqyVar, apro aproVar, apyx apyxVar, akfa akfaVar, apsv apsvVar, aprz aprzVar) {
        this.d = dehqVar;
        this.a = ckcwVar;
        this.e = cjqyVar;
        this.f = aproVar;
        this.g = apyxVar;
        this.h = akfaVar;
        this.i = apsvVar;
        this.b = aprzVar;
    }

    public static ddij k(dbsg<akqi> dbsgVar, dbsg<String> dbsgVar2) {
        ddii bZ = ddij.e.bZ();
        if (dbsgVar2.a()) {
            String b = dbsgVar2.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddij ddijVar = (ddij) bZ.b;
            b.getClass();
            ddijVar.a |= 2;
            ddijVar.c = b;
        }
        dtbk g = ((akqi) ((dbsu) dbsgVar).a).g();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddij ddijVar2 = (ddij) bZ.b;
        g.getClass();
        ddijVar2.d = g;
        ddijVar2.a |= 4;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.g.b()) {
            return;
        }
        if (this.o != null) {
            return;
        }
        this.o = new aprh(this);
        crzm<btlu> C = this.h.C();
        aprh aprhVar = this.o;
        dbsk.s(aprhVar);
        C.d(aprhVar, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.o != null) {
            crzm<btlu> C = this.h.C();
            aprh aprhVar = this.o;
            dbsk.s(aprhVar);
            C.c(aprhVar);
            this.o = null;
        }
    }

    @Override // defpackage.aprv
    public final crzm<apsi<Set<String>>> c(final btlu btluVar) {
        if (!this.g.b()) {
            return new crzo().a;
        }
        this.j.putIfAbsent(btluVar, new crzo<>());
        this.d.execute(new Runnable(this, btluVar) { // from class: aprc
            private final apri a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b);
            }
        });
        crzo<apsi<Set<String>>> crzoVar = this.j.get(btluVar);
        dbsk.s(crzoVar);
        return crzoVar.a;
    }

    @Override // defpackage.aprv
    public final Set<String> d(btlu btluVar) {
        if (!this.g.b()) {
            return dcmr.a;
        }
        return this.i.a(btluVar);
    }

    @Override // defpackage.aprv
    public final crzm<apsi<dbsg<apsg>>> e(String str, final btlu btluVar) {
        if (!this.g.b()) {
            return new crzo().a;
        }
        this.l.putIfAbsent(dbsi.a(btluVar, str), new crzo<>());
        this.d.execute(new Runnable(this, btluVar) { // from class: aprd
            private final apri a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b);
            }
        });
        crzo<apsi<dbsg<apsg>>> crzoVar = this.l.get(dbsi.a(btluVar, str));
        dbsk.s(crzoVar);
        return crzoVar.a;
    }

    @Override // defpackage.aprv
    public final crzm<apsi<Set<apsg>>> f(final btlu btluVar) {
        if (!this.g.b()) {
            return new crzo().a;
        }
        this.k.putIfAbsent(btluVar, new crzo<>());
        this.d.execute(new Runnable(this, btluVar) { // from class: apre
            private final apri a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b);
            }
        });
        crzo<apsi<Set<apsg>>> crzoVar = this.k.get(btluVar);
        dbsk.s(crzoVar);
        return crzoVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(btlu btluVar) {
        if (i(btluVar)) {
            long currentTimeMillis = System.currentTimeMillis();
            apsv apsvVar = this.i;
            if (currentTimeMillis <= new eapd(apsvVar.c.x(apsv.a, btluVar, 0L)).e(eaow.d(apsvVar.b.getBusinessMessagingParameters().V)).a) {
                l(3, btluVar);
                return;
            }
            this.m.putIfAbsent(btluVar, new AtomicBoolean(false));
            if (!this.m.get(btluVar).compareAndSet(false, true)) {
                return;
            }
            ckcq a = ((ckcr) this.a.a(ckgp.l)).a();
            a.a();
            this.n.put(btluVar, a);
            l(1, btluVar);
            apro aproVar = this.f;
            deha.q(deew.h(aproVar.b(btluVar).c(apro.b), new aprk(), aproVar.e), new aprf(this, btluVar), this.d);
        }
    }

    public final void h(List<ilo> list, btlu btluVar) {
        apsv apsvVar = this.i;
        dcen N = dcep.N();
        for (ilo iloVar : list) {
            apsw bZ = apsx.e.bZ();
            String cQ = iloVar.cQ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cQ.getClass();
            ((apsx) bZ.b).a = cQ;
            String B = iloVar.B();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            B.getClass();
            ((apsx) bZ.b).c = B;
            String n = iloVar.n();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            n.getClass();
            ((apsx) bZ.b).b = n;
            String cP = iloVar.cP();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cP.getClass();
            ((apsx) bZ.b).d = cP;
            if (!bZ.bK().equals(apsvVar.c.N(apsv.c(iloVar.cQ()), btluVar, (dssr) apsx.e.cu(7), null))) {
                bvjj bvjjVar = apsvVar.c;
                bvjk c = apsv.c(iloVar.cQ());
                apsw bZ2 = apsx.e.bZ();
                String cQ2 = iloVar.cQ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cQ2.getClass();
                ((apsx) bZ2.b).a = cQ2;
                String B2 = iloVar.B();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                B2.getClass();
                ((apsx) bZ2.b).c = B2;
                String n2 = iloVar.n();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                n2.getClass();
                ((apsx) bZ2.b).b = n2;
                String cP2 = iloVar.cP();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cP2.getClass();
                ((apsx) bZ2.b).d = cP2;
                bvjjVar.am(c, btluVar, bZ2.bK());
            }
            N.b(iloVar.cQ());
        }
        dcep f = N.f();
        dcpd it = dcnm.p(dcep.K(apsvVar.c.E(bvjk.jt, btluVar, dcmr.a)), dcep.K(f)).iterator();
        while (it.hasNext()) {
            apsvVar.c.Q(apsv.c((String) it.next()), btluVar);
        }
        apsvVar.c.ag(bvjk.jt, btluVar, f);
        l(3, btluVar);
        apsv apsvVar2 = this.i;
        apsvVar2.c.aa(apsv.a, btluVar, System.currentTimeMillis());
        m(btluVar);
    }

    public final boolean i(btlu btluVar) {
        return this.g.b() && btluVar != null && btluVar.l();
    }

    public final void j(ddda dddaVar, dcdc<ddij> dcdcVar) {
        cjqy cjqyVar = this.e;
        cjst d = cjsu.d();
        d.d(dddaVar);
        cjry e = cjrz.e();
        e.b(ddcu.l);
        ddzf bZ = ddzg.t.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        ddzgVar.b();
        dsod.bv(dcdcVar, ddzgVar.r);
        ((cjrn) e).a = bZ.bK();
        d.f(e.a());
        cjqyVar.l(d.e());
    }

    public final void l(int i, btlu btluVar) {
        Set<String> a = this.i.a(btluVar);
        if (this.j.containsKey(btluVar)) {
            this.j.get(btluVar).b(apsi.c(i, a));
        }
        if (this.k.containsKey(btluVar)) {
            dcen N = dcep.N();
            for (String str : a) {
                dbsg<apsg> b = this.i.b(str, btluVar);
                if (b.a()) {
                    N.b(b.b());
                }
            }
            this.k.get(btluVar).b(apsi.c(i, N.f()));
        }
        for (dbsi<btlu, String> dbsiVar : this.l.keySet()) {
            if (dbsiVar.a.equals(btluVar)) {
                dbsg<apsg> b2 = this.i.b(dbsiVar.b, btluVar);
                crzo<apsi<dbsg<apsg>>> crzoVar = this.l.get(dbsiVar);
                dbsk.s(crzoVar);
                crzoVar.b(apsi.c(i, b2));
            }
        }
    }

    public final void m(btlu btluVar) {
        if (this.n.containsKey(btluVar)) {
            ckcq ckcqVar = this.n.get(btluVar);
            dbsk.s(ckcqVar);
            ckcqVar.b();
            this.n.remove(btluVar);
        }
        if (this.m.containsKey(btluVar)) {
            AtomicBoolean atomicBoolean = this.m.get(btluVar);
            dbsk.s(atomicBoolean);
            atomicBoolean.set(false);
        }
    }
}
