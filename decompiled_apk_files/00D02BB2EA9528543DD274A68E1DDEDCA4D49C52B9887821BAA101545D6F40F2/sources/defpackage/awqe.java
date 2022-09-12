package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awqe  reason: default package */
/* loaded from: classes3.dex */
public final class awqe extends ges implements gfn {
    private static final dcqe aw = dcqe.c("awqe");
    public cqkj a;
    @dzsi
    private awug aA;
    @dzsi
    private cqkf<awtt> aB;
    @dzsi
    private ilo aC;
    @dzsi
    private arad aO;
    @dzsi
    private bxbd aP;
    @dzsi
    private aneh aQ;
    @dzsi
    private bbuf aR;
    private final awuf aS = new awqc(this);
    private final alht aT = new awqd(this);
    public akox ad;
    public hwe ae;
    public iqm af;
    public dzsj<awre> ag;
    public arab ah;
    public cqat ai;
    public bwqv aj;
    public jmx ak;
    public efc al;
    public jkf am;
    public alhv an;
    public dxio<afwp> ao;
    public awtx ap;
    @dzsi
    cqkf<izl> aq;
    @dzsi
    public awtn ar;
    @dzsi
    public iql as;
    @dzsi
    gek at;
    public boolean au;
    public bdwl av;
    @dzsi
    private View ax;
    @dzsi
    private View ay;
    @dzsi
    private begc az;
    public cqhn b;
    public cqhu c;
    public efg d;
    public dzsj<ixr> e;
    public awuh f;
    public bxbe g;

    private final arad aJ(awtn awtnVar, bnic bnicVar) {
        arad d = this.ah.d(dqvj.WALK);
        d.a(new awpt(H(), awtnVar));
        d.b(bnicVar);
        return d;
    }

    private final iql aR(akqq akqqVar) {
        iqm iqmVar = this.af;
        iqm.a(this, 1);
        akox a = iqmVar.a.a();
        iqm.a(a, 2);
        hwe a2 = iqmVar.b.a();
        iqm.a(a2, 3);
        Executor a3 = iqmVar.c.a();
        iqm.a(a3, 4);
        jkj a4 = iqmVar.d.a();
        iqm.a(a4, 5);
        gll a5 = iqmVar.e.a();
        iqm.a(a5, 6);
        Activity activity = (Activity) ((dxjd) iqmVar.f).a;
        iqm.a(activity, 7);
        dxio a6 = ((dxjh) iqmVar.g).a();
        iqm.a(a6, 8);
        cjyb a7 = iqmVar.h.a();
        iqm.a(a7, 9);
        iql iqlVar = new iql(this, a, a2, a3, a4, a5, activity, a6, a7);
        iqlVar.d(akqqVar, false);
        iqlVar.a(false);
        return iqlVar;
    }

    private final void w(bbuf bbufVar) {
        ArrayList arrayList = new ArrayList(bbufVar.a().size());
        for (bbtm bbtmVar : bbufVar.a()) {
            arrayList.add(bbtmVar.a());
        }
        awtm i = this.ar.i();
        i.b(this.ai.b());
        i.g(arrayList);
        awtn k = i.k();
        g(k);
        this.ag.a().i(k);
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((awqf) btsx.b(awqf.class, this)).cq(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aB.e(null);
        this.aB = null;
        this.az.a();
        cqkf<izl> cqkfVar = this.aq;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ax = null;
        this.ay = null;
        this.az = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof aneh) {
            this.aQ = (aneh) obj;
            this.at.c = jjn.COLLAPSED;
            this.aA.v(false);
            this.as = aR(this.aQ.a());
        } else if (!(obj instanceof bbuf)) {
        } else {
            if (this.aD) {
                w((bbuf) obj);
            } else {
                this.aR = (bbuf) obj;
            }
        }
    }

    @Override // defpackage.gfn
    public final boolean a() {
        return this.au;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jjn jjnVar = this.at.c;
        if (jjnVar != null) {
            this.aA.v(jjnVar.b());
        }
        cqkf<awtt> e = this.a.e(new awso());
        this.aB = e;
        e.e(this.aA);
        this.ax = this.aB.c();
        cqkf<izl> c = this.a.c(new gyf(), null);
        this.aq = c;
        c.e(this.aA.A());
        begc a = this.av.a(ibm.x());
        this.az = a;
        a.c(this.ap);
        this.ay = ((bdwk) this.az).a;
        return null;
    }

    public final void g(awtn awtnVar) {
        if (!awtnVar.c().equals(this.ar.c())) {
            this.aO.d();
            this.aO = aJ(awtnVar, this.aA.z());
            if (this.aD) {
                this.aO.c();
                this.aO.f();
            }
            iql iqlVar = this.as;
            if (iqlVar != null) {
                iqlVar.d(awtnVar.c(), false);
            }
        }
        this.ar = awtnVar;
        this.aA.w(awtnVar);
        cqkx.p(this.aA);
        if (this.aD) {
            this.ae.a(null, akra.f(this.ar.c()));
        }
    }

    public final void i(@dzsi ilo iloVar) {
        this.aC = iloVar;
        this.aP.l(iloVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        this.au = bundle2.getBoolean("created_from_map_tap");
        awtr awtrVar = (awtr) bvrs.e(bundle2, awtr.class, (dssr) awtr.l.cu(7));
        awtn k = awtrVar == null ? null : awtn.m(awtrVar).k();
        this.ar = k;
        if (k == null) {
            bvoo.i(new RuntimeException());
            J().g().e();
        }
        this.aP = this.g.a(dtxy.h);
        awuh awuhVar = this.f;
        awtn awtnVar = this.ar;
        awuf awufVar = this.aS;
        awuh.a(awtnVar, 1);
        awuh.a(awufVar, 2);
        awuh.a(this, 3);
        gga a = awuhVar.a.a();
        awuh.a(a, 4);
        cqkj a2 = awuhVar.b.a();
        awuh.a(a2, 5);
        dzsj<awre> dzsjVar = awuhVar.c;
        dxio a3 = ((dxjh) awuhVar.d).a();
        awuh.a(a3, 7);
        dzsj<bwft> dzsjVar2 = awuhVar.e;
        bniv a4 = awuhVar.f.a();
        awuh.a(a4, 9);
        cqat a5 = awuhVar.g.a();
        awuh.a(a5, 10);
        jkf a6 = awuhVar.h.a();
        awuh.a(a6, 11);
        cjqy a7 = awuhVar.i.a();
        awuh.a(a7, 12);
        awtj a8 = awuhVar.j.a();
        awuh.a(a8, 13);
        bniy a9 = awuhVar.k.a();
        awuh.a(a9, 14);
        this.aA = new awug(awtnVar, awufVar, this, a, a2, dzsjVar, a3, dzsjVar2, a4, a5, a6, a7, a8, a9);
        try {
            this.aC = (ilo) this.aj.d(ilo.class, this.o, "placemark");
        } catch (IOException e) {
            bvoo.h("Failed to get placemark from bundle %s", e);
        }
        this.aP.l(this.aC);
        this.as = aR(this.ar.c());
        this.aO = aJ(this.ar, this.aA.z());
        this.at = new gek(J(), this, this.am);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        awug awugVar = this.aA;
        if (awugVar != null) {
            awugVar.x(0.0f);
            cqkx.p(this.aA);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aO.c();
        this.aO.f();
        if (this.aQ != null) {
            awtm i = this.ar.i();
            i.h(this.aQ.a());
            i.e(null);
            i.b(this.ai.b());
            i.j(this.ar.p() ? 2 : this.ar.j());
            awtn k = i.k();
            i(null);
            g(k);
            this.ag.a().i(k);
            this.aQ = null;
        } else {
            awtn awtnVar = this.ar;
            if (awtnVar != null) {
                this.ae.a(null, akra.f(awtnVar.c()));
            }
        }
        bbuf bbufVar = this.aR;
        if (bbufVar != null) {
            w(bbufVar);
            this.aR = null;
        }
        jjn jjnVar = this.at.c;
        if (jjnVar == null) {
            jjnVar = jjn.COLLAPSED;
        }
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.ay(this.ax, R.id.header);
        egjVar.ai(jjnVar);
        egjVar.k(true);
        egjVar.Q(null);
        egjVar.G(this.ay, 5);
        egjVar.aw(this.aq.c(), false);
        egjVar.as(this.aP);
        jjn jjnVar2 = this.at.c;
        egjVar.t(new awqg(this.ax, this.aA, this.ap, jjnVar2 == null || !jjnVar2.b(), this, this.as));
        egjVar.J(new egq(this) { // from class: awqb
            private final awqe a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                awqe awqeVar = this.a;
                awqeVar.as.e(eguVar.j, 250);
                awqeVar.at.c();
            }
        });
        egjVar.B(false);
        egjVar.f(true);
        egjVar.ak(jkc.c, jkc.l);
        egu c = this.al.c();
        ixr a = this.e.a();
        if (c != null) {
            egjVar.S(c.as);
            izs izsVar = c.c;
            if (izsVar != null && !TextUtils.isEmpty(izsVar.d())) {
                a.I(izsVar.d().toString());
            }
        }
        egjVar.V(new hqv(), a);
        egjVar.c(this.ao.a().e());
        egf a2 = egf.a();
        a2.n = false;
        egjVar.A(a2);
        this.d.a(egjVar.a());
        this.an.b(this.aT);
        this.as.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        awtn awtnVar = this.ar;
        if (awtnVar != null) {
            bvrs.l(bundle, awtnVar.n());
        }
        ilo iloVar = this.aC;
        if (iloVar != null) {
            this.aj.c(bundle, "placemark", iloVar);
        }
        bundle.putBoolean("created_from_map_tap", this.au);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.an.c(this.aT);
        this.as.c();
        this.aO.d();
        super.u();
    }
}
