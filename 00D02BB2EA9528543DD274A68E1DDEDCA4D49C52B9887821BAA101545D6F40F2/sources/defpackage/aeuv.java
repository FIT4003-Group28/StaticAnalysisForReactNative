package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aeuv  reason: default package */
/* loaded from: classes2.dex */
public class aeuv extends ges implements gfo {
    public aext a;
    public bvrb ad;
    public btrm ae;
    public aeun af;
    public apkf ag;
    public boolean ah;
    @dzsi
    public dehn<aeuk> ai;
    @dzsi
    public aeuk aj;
    @dzsi
    public GmmLocation ak;
    private final aeuu al = new aeuu(this);
    private final aerz am = new aerz(this) { // from class: aeur
        private final aeuv a;

        {
            this.a = this;
        }

        @Override // defpackage.aerz
        public final void a(aeui aeuiVar) {
            this.a.i();
        }
    };
    private cqkf<aexp> an;
    @dzsi
    private aexs ao;
    private boolean ap;
    @dzsi
    private aliw aq;
    public cqkj b;
    public efg c;
    public araj d;
    public dxio<ahwf> e;
    public aesb f;
    public akpm g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        if (this.ah) {
            View view = this.P;
            if (view != null) {
                view.postOnAnimationDelayed(new aeus(this), 600L);
            } else {
                this.e.a().l();
            }
        }
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.ap = bundle != null;
        cqkf<aexp> c = this.b.c(new aexn(), null);
        this.an = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        if (this.aD) {
            J().g().f();
        }
    }

    public final void i() {
        aexs aexsVar = this.ao;
        dbsk.s(aexsVar);
        aexsVar.z(q());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.eL;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        dehn<aeuk> dehnVar = this.ai;
        if (dehnVar != null && dehnVar.isDone() && !this.ai.isCancelled()) {
            this.aj = (aeuk) deha.s(this.ai);
        }
        btrm btrmVar = this.ae;
        aeuu aeuuVar = this.al;
        dceq a = dcet.a();
        a.b(alhl.class, new aeuw(0, alhl.class, aeuuVar));
        a.b(alhy.class, new aeuw(1, alhy.class, aeuuVar));
        a.b(ardp.class, new aeuw(2, ardp.class, aeuuVar));
        a.b(amqo.class, new aeuw(amqo.class, aeuuVar, bvrj.UI_THREAD));
        btrmVar.g(aeuuVar, a.a());
        aext aextVar = this.a;
        aexv q = q();
        gga a2 = aextVar.a.a();
        aext.a(a2, 1);
        araj a3 = aextVar.b.a();
        aext.a(a3, 2);
        awre a4 = aextVar.c.a();
        aext.a(a4, 3);
        ache a5 = aextVar.d.a();
        aext.a(a5, 4);
        aesb a6 = aextVar.e.a();
        aext.a(a6, 5);
        begg a7 = aextVar.f.a();
        aext.a(a7, 6);
        bvjj a8 = aextVar.g.a();
        aext.a(a8, 7);
        dzsj<akfa> dzsjVar = aextVar.h;
        bwqv a9 = aextVar.i.a();
        aext.a(a9, 9);
        cjqy a10 = aextVar.j.a();
        aext.a(a10, 10);
        btvo a11 = aextVar.k.a();
        aext.a(a11, 11);
        dbsg<ddv> a12 = aextVar.l.a();
        aext.a(a12, 12);
        cqhn a13 = aextVar.m.a();
        aext.a(a13, 13);
        aext.a(this, 14);
        aext.a(q, 15);
        aexs aexsVar = new aexs(a2, a3, a4, a5, a6, a7, a8, dzsjVar, a9, a10, a11, a12, a13, this, q);
        this.ao = aexsVar;
        this.an.e(aexsVar);
        egf a14 = egf.a();
        a14.l(false);
        aliw J = this.g.J();
        this.aq = J;
        if (J != null) {
            J.a(false);
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.y(true);
        egjVar.f(false);
        egjVar.e(this);
        egjVar.A(a14);
        if (!this.ap) {
            egjVar.x(new aeuq(this.g, this.d.m().f()));
        }
        this.c.a(egjVar.a());
        this.f.o(this.am);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.p(this.am);
        aliw aliwVar = this.aq;
        if (aliwVar != null) {
            aliwVar.a(true);
        }
        dehn<aeuk> dehnVar = this.ai;
        if (dehnVar != null && !dehnVar.isCancelled()) {
            this.ai.cancel(false);
        }
        this.ai = null;
        this.ae.a(this.al);
        this.an.e(null);
        super.u();
    }

    final aexv q() {
        akra akraVar;
        aeuo aeuoVar = new aeuo();
        aeuk aeukVar = this.aj;
        if (aeukVar != null) {
            aeuoVar.a = aeukVar;
        } else {
            GmmLocation gmmLocation = this.ak;
            if (gmmLocation != null && (akraVar = gmmLocation.h) != null && akraVar.k() != dcyn.a && akraVar.o() != dcyn.a) {
                aeuoVar.a = aeuk.d("", "", bij.a(akraVar.k(), akraVar.o()));
            }
        }
        if (this.f.s()) {
            ilo h = this.f.B().h();
            if (h == null) {
                h = null;
            } else {
                String b = this.ag.b(h.h(), h.n());
                if (b != null) {
                    ily g = h.g();
                    g.F(b);
                    h = g.d();
                }
            }
            if (h != null) {
                aeuoVar.b = h;
            }
        }
        return new aeup(aeuoVar.a, aeuoVar.b);
    }
}
