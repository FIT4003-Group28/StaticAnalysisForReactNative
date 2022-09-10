package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aomr  reason: default package */
/* loaded from: classes2.dex */
public final class aomr extends anns {
    private static final dcqe ao = dcqe.c("aomr");
    public cqkf<aomh> a;
    public aotx ad;
    public apkh ae;
    public aoml af;
    public ansy ag;
    public efg ah;
    public cqkj ai;
    public jkf aj;
    public anhg ak;
    public aplg al;
    public cqhn am;
    public aomk an;
    private cqkf<aobh> ap;
    private angu<aogb, aoge> aq;
    private aomp ar;
    private aomg as;
    private apke at;
    private anqs au;
    private apkj av;
    private gek aw;
    public apjy b;
    public cqat c;
    public angv d;
    public gfq e;
    public btrm f;
    public bwqv g;

    private final void i() {
        gfq.k(this);
        this.d.e();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aomh> cqkfVar = this.a;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<aobh> cqkfVar2 = this.ap;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof anhf) {
            anhf anhfVar = (anhf) obj;
            if (anhfVar.a().a()) {
                g(anhfVar.a().b());
            } else {
                gfq.l(this);
            }
        } else if (obj instanceof dvyw) {
            if (!this.an.k().a()) {
                return;
            }
            this.an.k().b().t((dvyw) obj);
        } else if (obj instanceof anhd) {
            anhd anhdVar = (anhd) obj;
            final dwfl a = anhdVar.a();
            if (!this.an.k().a()) {
                bvoo.h("ReceiptActionRequest received but there is no selected segment", new Object[0]);
                i();
                return;
            }
            dbsg r = dcbg.b(this.an.k().b().v()).r(new dbsl(a) { // from class: aomm
                private final dwfl a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    dwfl dwflVar = this.a;
                    dwfl dwflVar2 = ((dvan) obj2).b;
                    if (dwflVar2 == null) {
                        dwflVar2 = dwfl.w;
                    }
                    return dwflVar2.q.equals(dwflVar.q);
                }
            });
            if (!r.a()) {
                bvoo.h("Can't find receipt associated with media key: %s", a.q);
                i();
                return;
            }
            anhg anhgVar = this.ak;
            dqfz dqfzVar = ((dvan) r.b()).c;
            if (dqfzVar == null) {
                dqfzVar = dqfz.g;
            }
            anhgVar.t(anhdVar, dqfzVar.b, this);
        } else if (obj instanceof anhb) {
            gfq.k(this);
        } else if (!(obj instanceof bbuf)) {
        } else {
            bbuf bbufVar = (bbuf) obj;
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<aomh> c = this.ai.c(new aomz(), viewGroup);
        this.a = c;
        c.e(this.an);
        cqkf<aobh> c2 = this.ag.g().c(new aobg(), viewGroup);
        this.ap = c2;
        c2.e(this.an.c());
        return this.a.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.b.a();
        return true;
    }

    public final void g(aoha aohaVar) {
        this.an.n(aohaVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        aoge aogeVar;
        super.l(bundle);
        aoha aohaVar = (aoha) this.o.getSerializable("selected-segment");
        if (bundle != null) {
            if (bundle.containsKey("selected-segment")) {
                aohaVar = (aoha) bundle.getSerializable("selected-segment");
            }
            if (bundle.containsKey("selected-day-data")) {
                try {
                    aogeVar = (aoge) this.g.d(aoge.class, bundle, "selected-day-data");
                } catch (IOException e) {
                    bvoo.h("Error reading storage: %s", e);
                    aogeVar = null;
                }
                if (aogeVar != null) {
                    aogeVar.g();
                    this.d.g(aogeVar);
                }
            }
        }
        aoha aohaVar2 = aohaVar;
        this.aq = this.d.a(aohaVar2.a());
        this.as = new aomq(this);
        aoml aomlVar = this.af;
        angu<aogb, aoge> anguVar = this.aq;
        aoml.a(anguVar, 1);
        aoml.a(aohaVar2, 2);
        aolt a = aomlVar.a.a();
        aoml.a(a, 3);
        aobn a2 = aomlVar.b.a();
        aoml.a(a2, 4);
        aoog a3 = aomlVar.c.a();
        aoml.a(a3, 5);
        apjv a4 = aomlVar.d.a();
        aoml.a(a4, 6);
        cjqy a5 = aomlVar.e.a();
        aoml.a(a5, 7);
        this.an = new aomk(anguVar, aohaVar2, a, a2, a3, a4, a5);
        this.au = new anqs(this.an, this.c);
        this.ar = new aomp(this, this.e);
        this.at = new apke(this, this.ad, this.an);
        this.av = new apkj();
        this.aw = new gek(J(), this, this.aj);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        jjk a = jjk.a(this.al, this.av, new aomo(this), this.at);
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.at(null);
        egjVar.r(this.ap.c());
        egjVar.q(aobf.d(this.an.c(), this.ap.c()));
        egjVar.t(a);
        egjVar.Y(true);
        egjVar.w(null);
        egjVar.J(new egq(this) { // from class: aomn
            private final aomr a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.ad.c();
            }
        });
        egjVar.ay(this.P, R.id.header);
        egjVar.ai(this.aw.a(jjn.EXPANDED));
        egjVar.aj(egn.ONE_THIRD_EXPANDED_MAP);
        egf h = egf.h();
        h.h = this.au.a();
        egjVar.A(h);
        this.ah.a(egjVar.a());
        this.an.l(this.as);
        this.aq.c(this.ar);
        apki.c(this.f, this.ae);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        dbsg<aoha> j = this.an.j();
        if (j.a()) {
            j.b();
            bundle.putSerializable("selected-segment", j.b());
        }
        angs<aoge> b = this.aq.b();
        if (b.e()) {
            aoge f = b.f();
            f.g();
            this.g.c(bundle, "selected-day-data", f);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.d();
        this.aq.d(this.ar);
        this.an.m(this.as);
        apki.b(this.f, this.ae);
        super.u();
    }
}
