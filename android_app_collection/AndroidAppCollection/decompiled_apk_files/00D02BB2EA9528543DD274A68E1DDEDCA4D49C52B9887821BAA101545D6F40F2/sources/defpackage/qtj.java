package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qtj  reason: default package */
/* loaded from: classes7.dex */
public final class qtj implements qut {
    private static final dcqe i = dcqe.c("qtj");
    public final qsw a;
    public final dxio<cqhn> b;
    public final qur c;
    @dzsi
    public qvm d;
    @dzsi
    public mw<Integer> e;
    @dzsi
    public final Runnable f;
    private final Executor j;
    private final aedv k;
    private final cqkj l;
    private final qtx m;
    @dzsi
    private qva n;
    private final btrm o;
    private final btvo p;
    @dzsi
    private cryz<dbsg<Runnable>> q;
    @dzsi
    private cqkf<qvm> r;
    @dzsi
    private cqkf<?> s;
    private final qxa t;
    private final acyp v;
    private final rbp w;
    @dzsi
    private rbo x;
    public final List<mw<Integer>> g = new ArrayList();
    private final qti u = new qti(this);
    public boolean h = false;
    private final aeds y = new qtd(this);
    private final degu<dbsg<Runnable>> z = new qte(this);
    private final View.OnLayoutChangeListener A = new qtf(this);
    private final View.OnLayoutChangeListener B = new qtg(this);
    private final View.OnLayoutChangeListener C = new qth(this);

    public qtj(Executor executor, aedv aedvVar, cqkj cqkjVar, qsw qswVar, qtx qtxVar, dxio<cqhn> dxioVar, btrm btrmVar, btvo btvoVar, qxa qxaVar, acyp acypVar, rbp rbpVar, qur qurVar, @dzsi Runnable runnable) {
        this.j = executor;
        this.k = aedvVar;
        this.l = cqkjVar;
        this.a = qswVar;
        this.m = qtxVar;
        this.b = dxioVar;
        this.o = btrmVar;
        this.p = btvoVar;
        this.t = qxaVar;
        this.v = acypVar;
        this.c = qurVar;
        this.f = runnable;
        this.w = rbpVar;
    }

    private final void r(@dzsi dndr dndrVar, @dzsi domy domyVar) {
        quy k = k();
        qup l = l();
        if (k == null || l == null) {
            bvoo.h("Cannot create a manual directive when opened from a notification", new Object[0]);
            return;
        }
        if (dndrVar == null) {
            dndrVar = l.a();
        }
        if (domyVar == null) {
            domyVar = l.b();
        }
        deha.q(this.a.b(quw.c(dndrVar, domyVar), k, null, dbpy.a), new qtc(), this.j);
    }

    @Override // defpackage.qut
    public final void a(@dzsi ViewGroup viewGroup, @dzsi qvm qvmVar, @dzsi mw<Integer> mwVar, @dzsi mw<Integer> mwVar2) {
        cqkf<qvm> cqkfVar;
        this.e = mwVar;
        if (mwVar2 != null) {
            this.g.add(mwVar2);
        }
        cqkf<?> d = this.k.d(viewGroup);
        this.s = d;
        d.c().addOnLayoutChangeListener(this.C);
        if (qvmVar != null) {
            this.d = qvmVar;
            this.r = this.l.e(new qyx());
            if (this.v.f()) {
                rbp rbpVar = this.w;
                View.OnLayoutChangeListener onLayoutChangeListener = this.B;
                ixq a = rbpVar.a.a();
                rbp.a(a, 1);
                rbp.a(qvmVar, 2);
                rbp.a(onLayoutChangeListener, 3);
                rbo rboVar = new rbo(a, qvmVar, onLayoutChangeListener);
                this.x = rboVar;
                rboVar.ap();
            }
        }
        if (this.n != null) {
            n();
            qva qvaVar = this.n;
            dbsk.s(qvaVar);
            final rip ripVar = (rip) qvaVar;
            mw<Integer> mwVar3 = ripVar.e == null ? null : new mw(ripVar) { // from class: rio
                private final rip a;

                {
                    this.a = ripVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    rkq rkqVar = this.a.e;
                    dbsk.s(rkqVar);
                    rkqVar.g(((Integer) obj).intValue());
                }
            };
            if (mwVar3 != null) {
                this.g.add(mwVar3);
            }
            if (this.g.isEmpty() || (cqkfVar = this.r) == null) {
                return;
            }
            cqkfVar.c().addOnLayoutChangeListener(this.A);
        }
    }

    @Override // defpackage.qut
    public final void b() {
        cqkf<qvm> cqkfVar;
        qvm qvmVar = this.d;
        if (qvmVar != null && (cqkfVar = this.r) != null) {
            cqkfVar.e(qvmVar);
        }
        this.k.b(this.c.Ny());
        this.k.g(dktk.COMMUTE);
        this.k.k(this.y);
        qxa qxaVar = this.t;
        quy k = k();
        if (k != null) {
            qxd qxdVar = qxaVar.a;
            if (qxdVar.c.isEmpty()) {
                dcdg p = dcdn.p();
                p.f(qxc.EDIT_ICON, qxdVar.b(String.format("https://www.gstatic.com/images/icons/material/system_gm/1x/%s.png", "edit_gm_grey_48dp")));
                p.f(qxc.HOME_ICON, qxdVar.b(String.format("https://www.gstatic.com/images/icons/material/system_gm/1x/%s.png", "home_googblue_48dp")));
                p.f(qxc.WORK_ICON, qxdVar.b(String.format("https://www.gstatic.com/images/icons/material/system_gm/1x/%s.png", "work_outline_googblue_48dp")));
                p.f(qxc.TEXT, qxdVar.c().c(xbb.b(qxdVar.b.getResources().getColor(R.color.qu_daynight_grey_600), 8)));
                p.f(qxc.BACKGROUND, qxdVar.a.aj().aE().c(xbb.a(5, 3)));
                qxc qxcVar = qxc.SPACER;
                dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                dmoo dmooVar = (dmoo) dmop.h.bZ();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar = (dmop) dmooVar.b;
                dmopVar.a |= 1;
                dmopVar.b = 0;
                dmpq bZ = dmpv.s.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmpv dmpvVar = (dmpv) bZ.b;
                dmpvVar.a |= 1;
                dmpvVar.b = -16777216;
                dmoa bZ2 = dmob.g.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmob dmobVar = (dmob) bZ2.b;
                int i2 = dmobVar.a | 4;
                dmobVar.a = i2;
                dmobVar.d = 100;
                dmobVar.a = i2 | 1;
                dmobVar.b = 11;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmpv dmpvVar2 = (dmpv) bZ.b;
                dmob bK = bZ2.bK();
                bK.getClass();
                dmpvVar2.e = bK;
                dmpvVar2.a |= 4;
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                dmpv bK2 = bZ.bK();
                bK2.getClass();
                dmopVar2.d = bK2;
                dmopVar2.a |= 4;
                dmqtVar.a(dmooVar);
                p.f(qxcVar, qxdVar.c().c((dmqx) dmqtVar.bK()));
                qxdVar.c = p.b();
            }
            qxaVar.a();
            aktc b = qxaVar.b(k.d());
            aktc b2 = qxaVar.b(k.e());
            dccx F = dcdc.F();
            if (b != null) {
                F.g(b);
            }
            if (b2 != null) {
                F.g(b2);
            }
            qxaVar.c = F.f();
        }
        btrm btrmVar = this.o;
        qti qtiVar = this.u;
        dceq a = dcet.a();
        a.b(azre.class, new qtl(azre.class, qtiVar, bvrj.UI_THREAD));
        btrmVar.g(qtiVar, a.a());
        p();
        this.h = true;
    }

    @Override // defpackage.qut
    public final void c() {
        this.h = false;
        cqkf<qvm> cqkfVar = this.r;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.k.c(this.c.Ny());
        this.k.n(this.y);
        qxa qxaVar = this.t;
        qxaVar.a();
        qxd qxdVar = qxaVar.a;
        dcpd<aktg> it = qxdVar.c.values().iterator();
        while (it.hasNext()) {
            qxdVar.c().j(it.next());
        }
        qxdVar.c = dcmn.a;
        cryz<dbsg<Runnable>> cryzVar = this.q;
        if (cryzVar != null) {
            cryzVar.c();
            this.q = null;
        }
        this.o.a(this.u);
    }

    @Override // defpackage.qut
    public final void d() {
        cqkf<qvm> cqkfVar = this.r;
        if (cqkfVar != null) {
            cqkfVar.c().removeOnLayoutChangeListener(this.A);
        }
        this.r = null;
        this.d = null;
        this.e = null;
        cqkf<?> cqkfVar2 = this.s;
        dbsk.s(cqkfVar2);
        cqkfVar2.c().removeOnLayoutChangeListener(this.C);
        cqkf<?> cqkfVar3 = this.s;
        dbsk.s(cqkfVar3);
        cqkfVar3.e(null);
        this.s = null;
    }

    @Override // defpackage.qut
    public final void e(egj egjVar) {
        egjVar.av(h());
        if (!this.v.f()) {
            cqkf<qvm> cqkfVar = this.r;
            if (cqkfVar == null) {
                return;
            }
            egjVar.F(cqkfVar.c());
            return;
        }
        qzg qzgVar = new qzg();
        rbo rboVar = this.x;
        dbsk.s(rboVar);
        egjVar.V(qzgVar, rboVar);
        egjVar.Z();
        egjVar.F(null);
        egjVar.ap(4);
    }

    @Override // defpackage.qut
    @dzsi
    public final View f() {
        dbsk.m(this.r != null, "Should be called only after onCreateView");
        cqkf<qvm> cqkfVar = this.r;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.qut
    @dzsi
    public final View g() {
        return null;
    }

    @Override // defpackage.qut
    public final View h() {
        dbsk.m(this.s != null, "Should be called only after onCreateView");
        cqkf<?> cqkfVar = this.s;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.qut
    public final void i(azva azvaVar) {
        r(azvaVar.a, null);
    }

    @Override // defpackage.qut
    public final void j(domy domyVar) {
        r(null, domyVar);
    }

    @Override // defpackage.qut
    @dzsi
    public final quy k() {
        return this.c.aJ();
    }

    @Override // defpackage.qut
    @dzsi
    public final qup l() {
        return this.c.w();
    }

    @Override // defpackage.qut
    public final void m(qva qvaVar) {
        this.n = qvaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    @Override // defpackage.qut
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rjz n() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtj.n():rjz");
    }

    @Override // defpackage.qut
    public final boolean o() {
        dktt dkttVar = this.p.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        return dkttVar.t;
    }

    public final void p() {
        dehn g;
        final quy k = k();
        if (k == null) {
            return;
        }
        qup w = this.c.w();
        if (w != null) {
            qsw qswVar = this.a;
            qup d = qswVar.d(k);
            if ((dbsd.a(d.a(), w.a()) && dbsd.a(d.b(), w.b()) && !dbsd.a(d.c(), w.c())) || (!eaow.e(qswVar.b.e() - w.e()).q(qsw.a) && !d.equals(w))) {
                g = deew.h(this.a.a(), qsz.a, dege.a);
                cryz<dbsg<Runnable>> cryzVar = new cryz<>(this.z);
                this.q = cryzVar;
                deha.q(g, cryzVar, this.j);
            }
        }
        qtx qtxVar = this.m;
        g = deew.g(deew.h(qtxVar.a(), new dbrn(k) { // from class: qtv
            private final quy a;

            {
                this.a = k;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Boolean.valueOf(!this.a.equals((quy) obj));
            }
        }, qtxVar.a), new defg(this) { // from class: qta
            private final qtj a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                qtj qtjVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return deha.a(dbpy.a);
                }
                return deew.h(qtjVar.a.a(), qtb.a, dege.a);
            }
        }, this.j);
        cryz<dbsg<Runnable>> cryzVar2 = new cryz<>(this.z);
        this.q = cryzVar2;
        deha.q(g, cryzVar2, this.j);
    }
}
