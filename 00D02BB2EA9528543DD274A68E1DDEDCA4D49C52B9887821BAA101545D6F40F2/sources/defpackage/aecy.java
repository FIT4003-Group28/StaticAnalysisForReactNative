package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aecy  reason: default package */
/* loaded from: classes.dex */
public final class aecy implements aedv {
    private static final dcep<dktk> u = dcnm.a(dktk.EXPLORE, dktk.INFORMAL_TRANSIT);
    private final dxio<axwy> A;
    private final dxio<cfrt> B;
    private final dxio<dklz> C;
    @dzsi
    private bvpk D;
    private final aecx F;
    private cqkf<aedx> G;
    public final gga a;
    public final bvjj b;
    public final aecn c;
    public final aeeb d;
    public final dxio<afzv> e;
    public final dxio<qbt> f;
    public final dxio<cjot> g;
    public final boolean l;
    public final acyr m;
    public final acyp n;
    public final afzs o;
    public aecm p;
    public dktk t;
    private final cqkj v;
    private final acys w;
    private final bvkx x;
    private final Executor y;
    private final cklq z;
    final List<aedt> h = new ArrayList();
    public final List<aedu> i = new ArrayList();
    public final List<aeds> j = new ArrayList();
    public final Set<fd> k = new aih();
    private boolean E = false;
    public int q = -1;
    public int r = -1;
    public int s = -1;

    public aecy(gga ggaVar, bvjj bvjjVar, aecn aecnVar, cqkj cqkjVar, aeec aeecVar, acys acysVar, bvkx bvkxVar, afzs afzsVar, cklq cklqVar, dxio<afzv> dxioVar, dxio<qbt> dxioVar2, dxio<axwy> dxioVar3, dxio<cjot> dxioVar4, acyp acypVar, acyr acyrVar, ckcw ckcwVar, dxio<cfrt> dxioVar5, Executor executor, dxio<dklz> dxioVar6) {
        dktk dktkVar;
        this.a = ggaVar;
        this.c = aecnVar;
        this.b = bvjjVar;
        this.v = cqkjVar;
        this.w = acysVar;
        this.x = bvkxVar;
        this.y = executor;
        this.B = dxioVar5;
        this.m = acyrVar;
        this.n = acypVar;
        this.o = afzsVar;
        this.z = cklqVar;
        this.f = dxioVar2;
        this.A = dxioVar3;
        this.g = dxioVar4;
        this.e = dxioVar;
        this.C = dxioVar6;
        this.l = acyrVar.c();
        aecx aecxVar = new aecx(this);
        this.F = aecxVar;
        ((ckco) ckcwVar.a(ckfh.aQ)).a(aecxVar.a.size());
        if (u.contains(aecxVar.c)) {
            dktkVar = aecxVar.c;
        } else {
            dktkVar = dktk.EXPLORE;
        }
        this.t = dktkVar;
        dktk dktkVar2 = aecxVar.c;
        dcep<dktk> dcepVar = aecxVar.a;
        aedt aedtVar = new aedt(this) { // from class: aecq
            private final aecy a;

            {
                this.a = this;
            }

            @Override // defpackage.aedt
            public final void a(dktk dktkVar3, boolean z, cjqm cjqmVar) {
                this.a.p(dktkVar3, z, cjqmVar);
            }
        };
        aedu aeduVar = new aedu(this) { // from class: aecr
            private final aecy a;

            {
                this.a = this;
            }

            @Override // defpackage.aedu
            public final void a(dktk dktkVar3) {
                aecy aecyVar = this.a;
                if (dktkVar3 == dktk.FEED && aecyVar.e(dktk.FEED)) {
                    aecyVar.q = aecyVar.e.a().q(aecyVar.a.K());
                }
                if (dktkVar3 == dktk.COMMUTE && aecyVar.e(dktk.COMMUTE)) {
                    aecyVar.r = aecyVar.f.a().L(aecyVar.a.K());
                }
                if (dktkVar3 == dktk.UPDATES && aecyVar.e(dktk.UPDATES)) {
                    aecyVar.s = aecyVar.g.a().f(aecyVar.a.K());
                }
                for (aedu aeduVar2 : aecyVar.i) {
                    aeduVar2.a(dktkVar3);
                }
            }
        };
        aeds aedsVar = new aeds(this) { // from class: aecs
            private final aecy a;

            {
                this.a = this;
            }

            @Override // defpackage.aeds
            public final void a(dktk dktkVar3) {
                for (aeds aedsVar2 : this.a.j) {
                    aedsVar2.a(dktkVar3);
                }
            }
        };
        Activity activity = (Activity) ((dxjd) aeecVar.a).a;
        aeec.a(activity, 1);
        cqhn a = aeecVar.b.a();
        aeec.a(a, 2);
        acyr a2 = aeecVar.c.a();
        aeec.a(a2, 3);
        iwl a3 = aeecVar.d.a();
        aeec.a(a3, 4);
        cjqy a4 = aeecVar.e.a();
        aeec.a(a4, 5);
        cjqq a5 = aeecVar.f.a();
        aeec.a(a5, 6);
        acyp a6 = aeecVar.g.a();
        aeec.a(a6, 7);
        qbv a7 = aeecVar.h.a();
        aeec.a(a7, 8);
        bzmc a8 = aeecVar.i.a();
        aeec.a(a8, 9);
        aeec.a(dktkVar2, 10);
        aeec.a(dcepVar, 11);
        aeec.a(aedtVar, 12);
        aeec.a(aeduVar, 13);
        aeec.a(aedsVar, 14);
        this.d = new aeeb(activity, a, a2, a3, a4, a5, a6, a7, a8, dktkVar2, dcepVar, aedtVar, aeduVar, aedsVar);
    }

    public static dktk s(bvjj bvjjVar, Set<dktk> set) {
        dktk b = dktk.b(bvjjVar.s(bvjk.L, dktk.EXPLORE.o));
        return (b == null || !set.contains(b)) ? dktk.EXPLORE : b;
    }

    private final boolean t() {
        gn g = this.a.g();
        return g != null && g.j() == 0;
    }

    @Override // defpackage.aedv
    public final void a() {
        if (this.p == null) {
            this.p = this.c.a(this);
        }
        dktk dktkVar = null;
        if (!this.E && !this.l) {
            aecm aecmVar = this.p;
            if (aecmVar.k.isEmpty()) {
                dccx F = dcdc.F();
                aedh aedhVar = aecmVar.d;
                cqat a = aedhVar.a.a();
                aedh.a(a, 1);
                btvo a2 = aedhVar.b.a();
                aedh.a(a2, 2);
                bvjj a3 = aedhVar.c.a();
                aedh.a(a3, 3);
                aedh.a(aecmVar, 4);
                F.g(new aedg(a, a2, a3, aecmVar));
                aecmVar.k = F.f();
            }
            dcdc<aecl> dcdcVar = aecmVar.k;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).d(aecmVar.a());
            }
            aecg d = aecm.d(aecmVar.a);
            if (d != null && (dktkVar = dktk.b(d.b)) == null) {
                dktkVar = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
        }
        this.E = false;
        aecx aecxVar = this.F;
        if (dktkVar == null || !e(dktkVar)) {
            dktkVar = s(this.b, this.F.b);
        }
        aecxVar.c = dktkVar;
        this.w.i(this.F.c);
        this.d.b(this.F.c);
        p(this.F.c, true, cjqm.a);
    }

    @Override // defpackage.aedv
    public final void b(fd fdVar) {
        if (!this.k.isEmpty()) {
            this.k.add(fdVar);
            return;
        }
        this.k.add(fdVar);
        bvpk a = bvpk.a(new Runnable(this) { // from class: aect
            private final aecy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aecy aecyVar = this.a;
                if (aecyVar.k.isEmpty()) {
                    return;
                }
                if (aecyVar.p == null) {
                    aecyVar.p = aecyVar.c.a(aecyVar);
                }
                aecm aecmVar = aecyVar.p;
                if (aecmVar.n) {
                    return;
                }
                if (aecmVar.l.isEmpty()) {
                    dccx F = dcdc.F();
                    if (aecmVar.i.a().aj) {
                        dxio a2 = ((dxjh) aecmVar.b.a).a();
                        aedf.a(a2, 1);
                        aedf.a(aecmVar, 2);
                        F.g(new aede(a2, aecmVar));
                    }
                    if (aecmVar.h.b()) {
                        aedc aedcVar = aecmVar.c;
                        dxio a3 = ((dxjh) aedcVar.a).a();
                        aedc.a(a3, 1);
                        afzu a4 = aedcVar.b.a();
                        aedc.a(a4, 2);
                        afzs a5 = aedcVar.c.a();
                        aedc.a(a5, 3);
                        Executor a6 = aedcVar.d.a();
                        aedc.a(a6, 4);
                        aedc.a(aecmVar, 5);
                        F.g(new aedb(a3, a4, a5, a6, aecmVar));
                    }
                    if (aecmVar.j.a()) {
                        aedr aedrVar = aecmVar.e;
                        dxio a7 = ((dxjh) aedrVar.a).a();
                        aedr.a(a7, 1);
                        afzu a8 = aedrVar.b.a();
                        aedr.a(a8, 2);
                        dxio a9 = ((dxjh) aedrVar.c).a();
                        aedr.a(a9, 3);
                        auql a10 = aedrVar.d.a();
                        aedr.a(a10, 4);
                        auom a11 = aedrVar.e.a();
                        aedr.a(a11, 5);
                        Executor a12 = aedrVar.f.a();
                        aedr.a(a12, 6);
                        Executor a13 = aedrVar.g.a();
                        aedr.a(a13, 7);
                        aedr.a(aecmVar, 8);
                        F.g(new aedq(a7, a8, a9, a10, a11, a12, a13, aecmVar));
                    }
                    if (aecmVar.j.d()) {
                        wdt a14 = aecmVar.f.a.a();
                        aedj.a(a14, 1);
                        aedj.a(aecmVar, 2);
                        F.g(new aedi(a14, aecmVar));
                    }
                    aecmVar.l = F.f();
                }
                dcdc<aecl> dcdcVar = aecmVar.k;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    dcdcVar.get(i).b();
                }
                dcdc<aeck> dcdcVar2 = aecmVar.l;
                int size2 = dcdcVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dcdcVar2.get(i2).b();
                }
                aecmVar.n = true;
            }
        });
        this.D = a;
        this.x.k(a, this.y, bvkw.ON_FIRST_TRANSITION_COMPLETE);
    }

    @Override // defpackage.aedv
    public final void c(fd fdVar) {
        this.k.remove(fdVar);
        if (!this.k.isEmpty()) {
            return;
        }
        bvpk bvpkVar = this.D;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        aecm aecmVar = this.p;
        if (aecmVar == null || !aecmVar.n) {
            return;
        }
        dcdc<aecl> dcdcVar = aecmVar.k;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).c();
        }
        dcdc<aeck> dcdcVar2 = aecmVar.l;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dcdcVar2.get(i2).c();
        }
        aecmVar.n = false;
    }

    @Override // defpackage.aedv
    public final cqkf<?> d(@dzsi ViewGroup viewGroup) {
        cqkf<aedx> cqkfVar = this.G;
        if (cqkfVar == null || viewGroup != null || cqkfVar.d() == null || !this.C.a().n) {
            cqkf<aedx> c = this.v.c(new aece(), viewGroup);
            this.G = c;
            c.e(this.d);
        }
        return this.G;
    }

    @Override // defpackage.aedv
    public final boolean e(dktk dktkVar) {
        return this.F.a.contains(dktkVar);
    }

    @Override // defpackage.aedv
    public final dktk f() {
        return this.d.g();
    }

    @Override // defpackage.aedv
    public final void g(dktk dktkVar) {
        if (dktkVar != f() && e(dktkVar)) {
            this.d.c(dktkVar, cjqm.a);
        }
    }

    @Override // defpackage.aedv
    public final void h(boolean z) {
        if (this.p == null) {
            this.p = this.c.a(this);
        }
        aecm aecmVar = this.p;
        if (aecmVar.m == z) {
            return;
        }
        aecmVar.m = z;
        if (!z) {
            return;
        }
        aecmVar.c(aecmVar.a());
    }

    @Override // defpackage.aedv
    public final void i(aedt aedtVar) {
        this.h.add(aedtVar);
    }

    @Override // defpackage.aedv
    public final void j(aedu aeduVar) {
        this.i.add(aeduVar);
    }

    @Override // defpackage.aedv
    public final void k(aeds aedsVar) {
        this.j.add(aedsVar);
    }

    @Override // defpackage.aedv
    public final void l(aedt aedtVar) {
        this.h.remove(aedtVar);
    }

    @Override // defpackage.aedv
    public final void m(aedu aeduVar) {
        this.i.remove(aeduVar);
    }

    @Override // defpackage.aedv
    public final void n(aeds aedsVar) {
        this.j.remove(aedsVar);
    }

    public final void o(dktk dktkVar, boolean z) {
        this.d.d(dktkVar, z);
    }

    public final void p(dktk dktkVar, boolean z, cjqm cjqmVar) {
        acxc acxcVar;
        acxb acxbVar;
        if (!e(dktkVar)) {
            return;
        }
        dcep<dktk> dcepVar = u;
        if (dcepVar.contains(dktkVar)) {
            this.t = dktkVar;
        }
        if (!z) {
            if (dcep.D(dktk.EXPLORE, dktk.INFORMAL_TRANSIT, dktk.TRANSPORTATION).contains(dktkVar)) {
                this.b.W(bvjk.L, dktkVar.o);
            }
            if (this.F.b.contains(dktkVar) && (acxbVar = (acxcVar = (acxc) this.w).b) != null && !acxbVar.a()) {
                acxcVar.m(5);
            }
        }
        if (dcepVar.contains(dktkVar)) {
            if (!(this.a.J(gfu.ACTIVITY_FRAGMENT) instanceof acyf)) {
                if (this.l && !q(dktkVar)) {
                    this.y.execute(new Runnable(this) { // from class: aecu
                        private final aecy a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.D(new acyf());
                        }
                    });
                } else {
                    this.E = true;
                    this.y.execute(new Runnable(this) { // from class: aecv
                        private final aecy a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.w();
                        }
                    });
                }
            }
        } else if (!this.l || !q(dktkVar)) {
            if (dktkVar == dktk.FEED) {
                this.e.a().p(this.q);
            } else if (dktkVar == dktk.COMMUTE) {
                if (cjqmVar.a().a()) {
                    this.f.a().K(this.r, cjqmVar);
                } else {
                    this.f.a().J(this.r);
                }
            } else if (dktkVar == dktk.SAVED_LISTS) {
                this.z.a(ckls.SAVED_BOTTOM_TAB_CLICKED);
                this.A.a().p();
            } else if (dktkVar == dktk.UPDATES) {
                this.z.a(ckls.UPDATES_BOTTOM_TAB_CLICKED);
                this.g.a().e(this.s);
            } else if (dktkVar == dktk.CONTRIBUTE) {
                this.z.a(ckls.CONTRIBUTE_BOTTOM_TAB_CLICKED);
                this.B.a().a();
            } else if (dktkVar == dktk.TRANSPORTATION) {
                this.z.a(ckls.GO_BOTTOM_TAB_CLICKED);
                this.f.a().N();
            }
            h(true);
        } else {
            this.y.execute(new Runnable(this) { // from class: aecw
                private final aecy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.w();
                }
            });
            h(true);
        }
        for (aedt aedtVar : this.h) {
            aedtVar.a(dktkVar, z, cjqmVar);
        }
    }

    final boolean q(dktk dktkVar) {
        return this.F.c == dktkVar && t();
    }

    @Override // defpackage.aedv
    public final void r(ggg gggVar, dktk dktkVar) {
        if (!this.l || !q(dktkVar)) {
            if (!t()) {
                this.a.F(gggVar, true);
                return;
            } else {
                this.a.D(gggVar);
                return;
            }
        }
        gz b = this.a.g().b();
        b.y((fd) gggVar, gfu.ACTIVITY_FRAGMENT.c);
        b.f();
    }
}
