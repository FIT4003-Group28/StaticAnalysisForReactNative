package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: bdyd  reason: default package */
/* loaded from: classes3.dex */
public final class bdyd {
    public final bnjo a;
    public final brrq b;
    public final bdwp c;
    public final iqt d;
    public final dxio<iqr> e;
    public final dxio<iqu> f;
    public final iqo g;
    public final iql h;
    public final bhlk i;
    public final begx j;
    public final jkf k;
    public final iqs l;
    public boolean m;
    private final btrm n;
    private final begc o;
    private final bego p;
    private arad q;
    @dzsi
    private Parcelable r;
    private boolean s;
    private iln t;
    private boolean u;

    public bdyd(brrr brrrVar, btrm btrmVar, begc begcVar, iqt iqtVar, dxio<iqr> dxioVar, dxio<iqu> dxioVar2, iqo iqoVar, iql iqlVar, bdwp bdwpVar, bnjo bnjoVar, Runnable runnable, bhlk bhlkVar, begx begxVar, jkf jkfVar, iqs iqsVar, bego begoVar) {
        this.n = btrmVar;
        this.o = begcVar;
        this.d = iqtVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = iqoVar;
        this.h = iqlVar;
        this.c = bdwpVar;
        this.a = bnjoVar;
        bniu ap = bnjoVar.ap();
        brvv a = brrrVar.a.a();
        brrr.a(a, 1);
        cqkj a2 = brrrVar.b.a();
        brrr.a(a2, 2);
        brrr.a(brrrVar.c.a(), 3);
        bwqv a3 = brrrVar.d.a();
        brrr.a(a3, 4);
        brrr.a(runnable, 5);
        brrr.a(ap, 6);
        this.b = new brrq(a, a2, a3, runnable, ap);
        this.i = bhlkVar;
        this.j = begxVar;
        this.k = jkfVar;
        this.l = iqsVar;
        this.p = begoVar;
    }

    public final void a(bwrs<ilo> bwrsVar, boolean z, boolean z2, arad aradVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.u = this.p.a(c);
        this.m = this.p.c(c);
        this.r = null;
        this.s = false;
        this.q = aradVar;
        this.c.setVisibility(0);
        this.a.ao(!z);
        aradVar.a(c);
        if (this.a.ap() != null) {
            aradVar.b(this.a.ap());
        }
        this.c.g(bwrsVar, z2);
        this.t = c.be();
        brrq brrqVar = this.b;
        bwrs<ilo> bwrsVar2 = brrqVar.c;
        if (bwrsVar2 != bwrsVar && brrqVar.e) {
            if (bwrsVar2 != null) {
                bwqv.t(bwrsVar2, brrqVar.f);
            }
            brrqVar.c = bwrsVar;
            brrqVar.a.g(brrqVar.c, brrqVar.f);
        } else {
            brrqVar.c = bwrsVar;
            bruz bruzVar = brrqVar.d;
            if (bruzVar != null) {
                bruzVar.QR(brrqVar.c);
            }
        }
        bnjo bnjoVar = this.a;
        bruz b = this.b.b(null);
        bdyk bdykVar = (bdyk) bnjoVar;
        bdykVar.d.aO(b);
        bdykVar.e.T(b);
        bdykVar.f.x(b);
        bdykVar.g.P(b);
        bhlk bhlkVar = this.i;
        bwrs<ilo> bwrsVar3 = bhlkVar.g;
        if (bwrsVar3 != null) {
            bwqv.t(bwrsVar3, bhlkVar.i);
        }
        bhlkVar.g = bwrsVar;
        bhlkVar.b.g(bhlkVar.g, bhlkVar.i);
        begx begxVar = this.j;
        bwrs<ilo> bwrsVar4 = begxVar.e;
        if (bwrsVar4 != null) {
            bwqv.t(bwrsVar4, begxVar.g);
        }
        begxVar.e = bwrsVar;
        begxVar.a.g(begxVar.e, begxVar.g);
    }

    public final void b() {
        this.c.l.e(this.a);
        if (this.a.i() != null) {
            this.o.c(this.a.i());
        }
        Parcelable parcelable = this.r;
        if (parcelable != null) {
            ((RecyclerView) cqkx.e(this.c, bfzt.a, RecyclerView.class)).l.C(parcelable);
            this.r = null;
        }
    }

    public final void c() {
        this.o.a();
        this.r = ((RecyclerView) cqkx.e(this.c, bfzt.a, RecyclerView.class)).l.B();
        bfia bfiaVar = this.c.j;
        if (bfiaVar != null) {
            bfiaVar.a.Ps(0.0f);
            cqkx.p(bfiaVar.a);
        }
        bnhy O = this.a.O();
        if (O != null) {
            O.g().a();
        }
        this.c.l.e(null);
    }

    public final View d() {
        return ((bdwk) this.o).a;
    }

    public final void e() {
        arad aradVar = this.q;
        if (aradVar != null) {
            aradVar.c();
        }
        bhlk bhlkVar = this.i;
        btrm btrmVar = bhlkVar.c;
        dceq a = dcet.a();
        a.b(alhl.class, new bhll(0, alhl.class, bhlkVar, bvrj.UI_THREAD));
        a.b(alhw.class, new bhll(1, alhw.class, bhlkVar, bvrj.UI_THREAD));
        btrmVar.g(bhlkVar, a.a());
        if (this.u) {
            btrm btrmVar2 = this.n;
            dceq a2 = dcet.a();
            a2.b(alhl.class, new bdyf(0, alhl.class, this, bvrj.UI_THREAD));
            a2.b(alhx.class, new bdyf(1, alhx.class, this, bvrj.UI_THREAD));
            btrmVar2.g(this, a2.a());
        }
        this.a.E();
    }

    public final void f() {
        arad aradVar = this.q;
        if (aradVar != null && aradVar.e()) {
            this.q.d();
        }
        this.d.b();
        this.h.e = null;
        this.e.a().b();
        this.f.a().a();
        bhlk bhlkVar = this.i;
        bhlkVar.c.a(bhlkVar);
        if (this.u) {
            this.n.a(this);
        }
        this.a.D();
        dbsg<AutoCompleteTextView> e = bkdb.e(this.c);
        if (e.a()) {
            e.b().clearFocus();
        }
    }

    public final void g(ilo iloVar, boolean z) {
        arad aradVar;
        this.u = this.p.a(iloVar);
        this.m = this.p.c(iloVar);
        this.c.b(this.g.a);
        arad aradVar2 = this.q;
        if (aradVar2 != null) {
            aradVar2.a(iloVar);
        }
        if (z && !this.s && (aradVar = this.q) != null) {
            this.s = true;
            aradVar.f();
        }
        if (this.t != iloVar.be()) {
            iln be = iloVar.be();
            this.t = be;
            jbk K = this.a.K(be);
            if (K == null) {
                return;
            }
            this.o.c(K);
        }
    }

    public final void h() {
        this.h.d = true;
    }
}
