package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aoou  reason: default package */
/* loaded from: classes2.dex */
public final class aoou extends anns implements anrs, nxd {
    public anpf a;
    public bwqv ad;
    public apkv ae;
    public angz af;
    public aoqc ag;
    public apjv ah;
    public cqkj ai;
    public efg aj;
    public akpm ak;
    public jkf al;
    public aplg am;
    public angu<aogb, aoge> an;
    public aoqb ao;
    private angt<aogb, aoge> ap;
    private apku aq;
    private anqs ar;
    private egq as;
    private jbk at;
    private gek au;
    private aooi av;
    private cqkf<aopu> aw;
    private cqkf<aopu> ax;
    public apjy b;
    public cqat c;
    public angp d;
    public angv e;
    public aotw f;
    public gfq g;

    @dzsi
    private static <T extends Serializable> T i(bwqv bwqvVar, Class<T> cls, Bundle bundle, String str) {
        try {
            return (T) bwqvVar.d(cls, bundle, str);
        } catch (IOException e) {
            e.getMessage();
            return null;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aopu> cqkfVar = this.aw;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<aopu> cqkfVar2 = this.ax;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof ilo) {
            this.ao.v((ilo) obj, dnqm.c);
        } else if (obj instanceof dvyw) {
            aoqb aoqbVar = this.ao;
            ily ilyVar = new ily();
            ilyVar.E((dvyw) obj);
            ilo d = ilyVar.d();
            dnql bZ = dnqm.c.bZ();
            dnry dnryVar = dnry.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqm dnqmVar = (dnqm) bZ.b;
            dnryVar.getClass();
            dnqmVar.b = dnryVar;
            dnqmVar.a = 2;
            aoqbVar.v(d, bZ.bK());
        } else if (obj instanceof aogy) {
            this.ao.w((aogy) obj);
            this.ao.p(false);
            this.ao.e();
        } else if (!(obj instanceof aneh)) {
        } else {
            this.ao.u(((aneh) obj).a());
            this.af.a(this.ao.b());
            gga ggaVar = this.aE;
            if (ggaVar == null) {
                return;
            }
            if (ggaVar.K() instanceof ancv) {
                gn gnVar = this.A;
                dbsk.s(gnVar);
                gnVar.f();
            }
            if (!(ggaVar.K() instanceof aorz)) {
                return;
            }
            gn gnVar2 = this.A;
            dbsk.s(gnVar2);
            gnVar2.f();
        }
    }

    @Override // defpackage.anrs
    public final aogb a() {
        return this.an.a();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<aopu> c = this.ai.c(new aopt(), viewGroup);
        this.aw = c;
        c.e(this.ao);
        cqkf<aopu> c2 = this.ai.c(new aool(), viewGroup);
        this.ax = c2;
        c2.e(this.ao);
        return this.aw.c();
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        dbsg<akqq> q = this.ao.q();
        if (!q.a()) {
            return null;
        }
        aorw aorwVar = new aorw(this, this.ak, q.b());
        if (aorwVar.a(dthbVar)) {
            return aorwVar;
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.b.a();
        return true;
    }

    public final void g() {
        egj egjVar = new egj(this);
        egjVar.k(false);
        View view = null;
        egjVar.at(null);
        egjVar.r(this.aq.a());
        egjVar.t(jjk.a(this.f.e, this.aq, this.am));
        egjVar.J(this.as);
        egjVar.Y(true);
        egjVar.w(null);
        egjVar.M(this.f.h);
        egjVar.ay(this.P, R.id.header);
        if (this.ao.h().booleanValue()) {
            view = this.ax.c();
        }
        egjVar.av(view);
        egjVar.ai(this.au.a(jjn.EXPANDED));
        egf h = egf.h();
        h.h = this.ar.a();
        egjVar.A(h);
        this.aj.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        aogy aogyVar;
        dnqm dnqmVar;
        super.l(bundle);
        aogb aogbVar = (aogb) this.o.getSerializable("initial-day-identifier");
        anho anhoVar = (anho) this.o.getSerializable("initial-duration");
        boolean z = this.o.getBoolean("duration-auto-select-enabled", true);
        if (this.o.containsKey("token-identifier")) {
            dbsgVar = dbsg.j(this.o.getString("token-identifier"));
        } else {
            dbsgVar = dbpy.a;
        }
        dbsg dbsgVar3 = dbsgVar;
        if (this.o.containsKey("original-segment")) {
            dbsgVar2 = dbsg.i((dvay) ((bvrt) this.o.getSerializable("original-segment")).e((dssr) dvay.u.cu(7), dvay.u));
        } else {
            dbsgVar2 = dbpy.a;
        }
        if (bundle != null) {
            aoge aogeVar = (aoge) i(this.ad, aoge.class, bundle, "day-details");
            if (aogeVar != null) {
                this.e.g(aogeVar);
            }
            if (bundle.containsKey("duration-auto-select-enabled")) {
                z = bundle.getBoolean("duration-auto-select-enabled");
            }
        }
        iyl iylVar = new iyl(this.ah.a().b());
        this.at = iylVar;
        this.aq = this.ae.a(iylVar);
        angu<aogb, aoge> a = this.e.a(aogbVar);
        this.an = a;
        aoqc aoqcVar = this.ag;
        Runnable a2 = aosb.a(this, this.ad, this);
        aooq aooqVar = new aooq(this);
        Runnable runnable = new Runnable(this) { // from class: aoon
            private final aoou a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aoou aoouVar = this.a;
                dbsg<akqq> q = aoouVar.ao.q();
                if (!q.a()) {
                    return;
                }
                aoouVar.a.a(q.b(), aoouVar);
            }
        };
        aoor aoorVar = new aoor(this);
        aoqc.a(a, 1);
        aoqc.a(dbsgVar3, 2);
        aoqc.a(a2, 3);
        aoqc.a(aooqVar, 4);
        aoqc.a(runnable, 5);
        aoqc.a(aoorVar, 6);
        aoqc.a(dbsgVar2, 7);
        ff ffVar = (ff) ((dxjd) aoqcVar.a).a;
        aoqc.a(ffVar, 8);
        angp a3 = aoqcVar.b.a();
        aoqc.a(a3, 9);
        aotw a4 = aoqcVar.c.a();
        aoqc.a(a4, 10);
        anqv a5 = aoqcVar.d.a();
        aoqc.a(a5, 11);
        anqx a6 = aoqcVar.e.a();
        aoqc.a(a6, 12);
        ansb a7 = aoqcVar.f.a();
        aoqc.a(a7, 13);
        anru a8 = aoqcVar.g.a();
        aoqc.a(a8, 14);
        anpw a9 = aoqcVar.h.a();
        aoqc.a(a9, 15);
        boolean z2 = z;
        this.ao = new aoqb(a, dbsgVar3, a2, aooqVar, runnable, aoorVar, dbsgVar2, ffVar, a3, a4, a5, a6, a7, a8, a9);
        if (bundle != null) {
            ilo iloVar = (ilo) i(this.ad, ilo.class, bundle, "placemark");
            if (this.o.containsKey("edit-interaction-metadata-key")) {
                dnqmVar = (dnqm) ((bvrt) this.o.getSerializable("edit-interaction-metadata-key")).e((dssr) dnqm.c.cu(7), dnqm.c);
            } else {
                dnqmVar = dnqm.c;
            }
            if (iloVar != null && dnqmVar != null) {
                this.ao.v(iloVar, dnqmVar);
            }
            aogyVar = (aogy) i(this.ad, aogy.class, bundle, "duration");
        } else {
            aogyVar = null;
        }
        if (aogyVar != null) {
            this.ao.w(aogyVar);
        }
        this.ao.t(dbsg.j(anhoVar));
        this.ao.p(z2);
        this.as = new aoop(this);
        this.ar = new anqs(this, this.c);
        this.ap = new aoos(this, this.af, this.e, this.ao, new Runnable(this) { // from class: aoom
            private final aoou a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aoou aoouVar = this.a;
                new Handler().post(new Runnable(aoouVar) { // from class: aooo
                    private final aoou a;

                    {
                        this.a = aoouVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        gfq.m(this.a);
                    }
                });
            }
        });
        this.av = new aooi(J(), this, this.ao);
        this.au = new gek(J(), this, this.al);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.bz;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        g();
        this.an.c(this.ap);
        this.d.a(this.av);
        this.aq.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        angs<aoge> b = this.an.b();
        if (b.e()) {
            this.ad.c(bundle, "day-details", b.f());
        }
        dbsg<ilo> r = this.ao.r();
        if (r.a()) {
            this.ad.c(bundle, "placemark", r.b());
            bundle.putSerializable("edit-interaction-metadata-key", bvrt.b(this.ao.a.o()));
        }
        dbsg<aogy> s = this.ao.s();
        if (s.a()) {
            this.ad.c(bundle, "duration", s.b());
        }
        bundle.putBoolean("duration-auto-select-enabled", this.ao.m().booleanValue());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.an.d(this.ap);
        this.d.b(this.av);
        this.aq.c();
        aotw aotwVar = this.f;
        if (aotwVar.j) {
            aotwVar.e();
            aotwVar.c();
            aotwVar.c.a().ac(aotwVar.f);
            aotwVar.j = false;
        }
        super.u();
    }
}
