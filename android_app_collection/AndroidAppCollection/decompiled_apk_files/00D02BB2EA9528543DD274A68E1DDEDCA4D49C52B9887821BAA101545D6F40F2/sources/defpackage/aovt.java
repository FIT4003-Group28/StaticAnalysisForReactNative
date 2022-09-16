package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aovt  reason: default package */
/* loaded from: classes2.dex */
public final class aovt extends anns implements aovg, anuv, egq, aoyk {
    private static final dcqe aU = dcqe.c("aovt");
    public acyp a;
    public cqkf<anvb> aA;
    public anhy aB;
    @dzsi
    public bwrs<aoyg> aO;
    @dzsi
    public bwrs<aoyg> aP;
    public View aT;
    private anqs aV;
    private cqkf<apht> aW;
    private apjb aX;
    private cqkf<apfx> aY;
    private cqkf<aphs> aZ;
    public cqhu ad;
    public cqkj ae;
    public apjc af;
    public apgr ag;
    public anvk ah;
    public aotx ai;
    public aowy aj;
    public aoxq ak;
    public aoxv al;
    public jmz am;
    public angv an;
    public bwqv ao;
    public jkf ap;
    public gga aq;
    public apjy ar;
    public anqq as;
    public aoug at;
    public btrm au;
    public bvjj av;
    public gek aw;
    public anle ax;
    public apgq ay;
    public anvj az;
    public aovf<eapy, aogo> b;
    private cqkf<jam> ba;
    @dzsi
    private bwrs<aoyg> bc;
    private dcdn<aoxp, bwrs<aoyg>> bd;
    private anva be;
    private apke bf;
    private aphh bg;
    private apkj bh;
    @dzsi
    private aovr bi;
    private anqp bj;
    private View bk;
    @dzsi
    private aouf bl;
    @dzsi
    private View bm;
    public aovf<aogb, aoge> c;
    public cqat d;
    public dxio<araj> e;
    public dxio<efg> f;
    public cqhn g;
    private boolean bb = true;
    public dbsg<eapd> aC = dbpy.a;
    public aowo aQ = aowo.RECENT;
    public Boolean aR = false;
    public aoxr aS = aoxr.LAST_VISIT_TIME;
    private final aowx bn = new aowx(this) { // from class: aovh
        private final aovt a;

        {
            this.a = this;
        }

        @Override // defpackage.aowx
        public final void a(aoxt aoxtVar) {
            aovt aovtVar = this.a;
            aoxv aoxvVar = aovtVar.al;
            dbsk.s(aoxvVar);
            bwrs<aoyg> a = aoxvVar.a(aoyj.g(aoxtVar.a()));
            gga ggaVar = aovtVar.aq;
            dbsk.s(ggaVar);
            bwqv bwqvVar = aovtVar.ao;
            dbsk.s(bwqvVar);
            ggaVar.D(apdh.g(bwqvVar, a));
        }
    };
    private final aowx bo = new aowx(this) { // from class: aovi
        private final aovt a;

        {
            this.a = this;
        }

        @Override // defpackage.aowx
        public final void a(aoxt aoxtVar) {
            aovt aovtVar = this.a;
            bwrs a = bwrs.a(aoxtVar);
            gga ggaVar = aovtVar.aq;
            dbsk.s(ggaVar);
            bwqv bwqvVar = aovtVar.ao;
            dbsk.s(bwqvVar);
            bwrs<aoyg> bwrsVar = aovtVar.aO;
            dbsk.s(bwrsVar);
            bwrs<aoyg> bwrsVar2 = aovtVar.aP;
            dbsk.s(bwrsVar2);
            ggaVar.D(aowf.g(bwqvVar, a, bwrsVar, bwrsVar2));
        }
    };

    @dzsi
    private final bwrs<aoyg> bp(@dzsi Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        try {
            return (bwrs) this.ao.d(bwrs.class, bundle, str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bq(boolean z) {
        if (!this.aD) {
            return;
        }
        anhq j = this.aB.j();
        j.e(anhu.NO);
        this.aB = j.k();
        this.bm = null;
        this.bl = null;
        if (!z) {
            return;
        }
        aU(this.ap.l().L());
    }

    private final List<bwrs<aoyg>> br() {
        return dcdc.q(dcbg.d(dcdc.h(this.aO, this.aP, this.bc), this.bd.values()));
    }

    private final void bs() {
        aovr aovrVar = this.bi;
        if (aovrVar != null) {
            this.au.a(aovrVar);
            this.bi = null;
        }
        this.az.o(this.be);
        this.b.c();
        this.c.c();
    }

    public static aowo w(anhw anhwVar) {
        aowo aowoVar = aowo.DAY;
        anhw anhwVar2 = anhw.NOTHING;
        switch (anhwVar.ordinal()) {
            case 0:
            case 3:
                return aowo.RECENT;
            case 1:
            case 2:
                return aowo.DAY;
            case 4:
                return aowo.CITIES;
            case 5:
                return aowo.COUNTRIES;
            case 6:
            case 7:
                String valueOf = String.valueOf(anhwVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append(valueOf);
                sb.append(" should be handled in OneTimeline");
                throw new AssertionError(sb.toString());
            default:
                throw new AssertionError("unreachable");
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<anvb> cqkfVar = this.aA;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<apfx> cqkfVar2 = this.aY;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        cqkf<apht> cqkfVar3 = this.aW;
        if (cqkfVar3 != null) {
            cqkfVar3.e(null);
        }
        cqkf<aphs> cqkfVar4 = this.aZ;
        if (cqkfVar4 != null) {
            cqkfVar4.e(null);
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        aoxr aoxrVar;
        if (!(obj instanceof aoxr) || (aoxrVar = (aoxr) obj) == this.aS) {
            return;
        }
        this.aS = aoxrVar;
        this.aR = true;
        aX(true, this.ap.l().L());
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        dbsg dbsgVar;
        bwrs<aoyg> bwrsVar;
        if (!this.aD) {
            return;
        }
        if (this.aT != null) {
            if (this.ap.l().L() != jjn.FULLY_EXPANDED) {
                apkj.a(this.aT);
            }
            View view = this.aT;
            view.getViewTreeObserver().addOnPreDrawListener(new aovq(this, view));
        }
        if (this.aQ == aowo.DAY) {
            this.ai.c();
            anqp anqpVar = this.bj;
            if (anqpVar != null) {
                aovr aovrVar = new aovr(anqpVar);
                this.bi = aovrVar;
                btrm btrmVar = this.au;
                dceq a = dcet.a();
                a.b(alhw.class, new aovu(0, alhw.class, aovrVar, bvrj.UI_THREAD));
                a.b(cjnw.class, new aovu(1, cjnw.class, aovrVar, bvrj.UI_THREAD));
                btrmVar.g(aovrVar, a.a());
            }
            this.az.n(this.be);
            this.b.d();
            this.c.d();
        } else if (this.aQ == aowo.DAY) {
        } else {
            if (this.aQ == aowo.RECENT && this.aO == null) {
                return;
            }
            if (this.aQ == aowo.CITIES && this.aP == null) {
                return;
            }
            if (this.aQ == aowo.COUNTRIES && this.bc == null) {
                return;
            }
            if (this.aQ == aowo.RECENT && (bwrsVar = this.aO) != null) {
                aowy aowyVar = this.aj;
                aoyg c = bwrsVar.c();
                dbsk.s(c);
                aowyVar.j(c.c(), 3, this.aj.p);
            } else if (this.aQ == aowo.CITIES) {
                bwrs<aoyg> bwrsVar2 = this.aP;
                if (bwrsVar2 != null) {
                    aowy aowyVar2 = this.aj;
                    aoyg c2 = bwrsVar2.c();
                    dbsk.s(c2);
                    aowyVar2.j(c2.d(), 3, this.bn);
                }
            } else {
                bwrs<aoyg> bwrsVar3 = this.bc;
                if (bwrsVar3 != null) {
                    aowy aowyVar3 = this.aj;
                    aoyg c3 = bwrsVar3.c();
                    dbsk.s(c3);
                    aowyVar3.j(c3.d(), 3, this.bo);
                }
            }
            aowy aowyVar4 = this.aj;
            aowo aowoVar = this.aQ;
            if (aowyVar4.f.d() && aowyVar4.f.a() != null) {
                dbsgVar = dbsg.i(aowyVar4.f.a().B());
            } else {
                dbsgVar = dbpy.a;
            }
            Rect b = aowyVar4.e.b();
            if (b.isEmpty()) {
                return;
            }
            b.set(b.left + aowyVar4.o, b.top + aowyVar4.o, b.right - aowyVar4.o, b.bottom);
            int f = aowy.f(aowoVar);
            if (dbsgVar.a()) {
                float f2 = f;
                if (f2 > aowyVar4.c.n().k) {
                    aowyVar4.c.p(akyt.m((akqq) dbsgVar.b(), f2, b));
                    return;
                }
            }
            akox akoxVar = aowyVar4.c;
            akoxVar.p(akyt.m(akoxVar.n().i, f, b));
        }
    }

    public final void aJ(boolean z) {
        if (this.aO == null || z) {
            this.aO = this.al.a(aoyj.f());
        }
        if (this.aP == null || this.bc == null || z) {
            aoxu b = this.al.b();
            this.aP = b.a();
            this.bc = b.b();
        }
        if (this.bd == null || z) {
            dcdg p = dcdn.p();
            dcpd<aoxp> it = this.ak.a().iterator();
            while (it.hasNext()) {
                aoxp next = it.next();
                p.f(next, this.al.a(aoyj.h(aoyi.BY_LAST_VISIT_TIME_DESCENDING, 3, dbsg.i(next), dbpy.a)));
            }
            this.bd = p.b();
        }
        for (bwrs<aoyg> bwrsVar : br()) {
            bwqv bwqvVar = this.ao;
            dbsk.s(bwrsVar);
            bwqvVar.g(bwrsVar, new bwrr(this) { // from class: aovk
                private final aovt a;

                {
                    this.a = this;
                }

                @Override // defpackage.bwrr
                public final void PV(Object obj) {
                    aovt aovtVar = this.a;
                    aoyg aoygVar = (aoyg) obj;
                    dbsk.s(aoygVar);
                    if (aoygVar.b().a()) {
                        aovtVar.aV();
                    } else {
                        aovtVar.aX(false, aovtVar.ap.l().L());
                    }
                }
            });
        }
    }

    @Override // defpackage.aoyk
    public final void aR() {
        aZ(apew.w(this.aS, dcdc.g(aoxr.LAST_VISIT_TIME, aoxr.ALPHABETICALLY)));
    }

    @Override // defpackage.aoyk
    public final Boolean aS() {
        return this.aR;
    }

    @Override // defpackage.aoyk
    public final aoxr aT() {
        return this.aS;
    }

    public final void aU(jjn jjnVar) {
        cqkf cqkfVar;
        if (!this.aD) {
            return;
        }
        if (this.aQ == aowo.DAY) {
            cqkfVar = this.aA;
        } else {
            cqkfVar = aphf.b(br()).a() ? this.ba : this.bb ? this.aZ : this.aW;
        }
        this.aT = cqkfVar.c();
        dccx F = dcdc.F();
        F.g(this.bh);
        F.g(this.bg);
        if (this.aQ == aowo.DAY) {
            F.g(this.bf);
            anqp anqpVar = this.bj;
            if (anqpVar != null) {
                F.g(new aovs(anqpVar));
            }
        }
        Callable<Integer> callable = new Callable(this) { // from class: aovm
            private final aovt a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int height;
                aovt aovtVar = this.a;
                View view = aovtVar.aT;
                View findViewById = view == null ? null : view.findViewById(R.id.header);
                if (findViewById == null) {
                    height = aozr.a.e(aovtVar.aq);
                } else {
                    height = findViewById.getHeight();
                }
                return Integer.valueOf(height);
            }
        };
        egj egjVar = new egj(this);
        egjVar.k(this.aQ != aowo.DAY);
        egjVar.az(this.aT, callable);
        egjVar.aj(egn.HALF_EXPANDED_MAP);
        egjVar.ai(jjnVar);
        egjVar.w(null);
        egjVar.G(this.aY.c(), 6);
        egjVar.C(aozr.l(this.aY, this.ad));
        egjVar.t(new jjk(F.f()));
        egf a = egf.a();
        a.l(false);
        a.q();
        egjVar.A(a);
        egjVar.ar(false);
        egjVar.U();
        egjVar.ao(true);
        egjVar.J(this);
        if (this.aQ == aowo.DAY) {
            egjVar.d(true);
            egjVar.b(this.bk);
        }
        View view = this.bm;
        if (view != null) {
            egjVar.av(view);
        }
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.f.a().a(egjVar.a());
    }

    public final void aV() {
        if (!this.aD) {
            return;
        }
        dbsg<aowm> b = aphf.b(br());
        dbsk.l(b.a());
        gga ggaVar = this.aq;
        this.ba.e(aphf.a(b.b(), ggaVar, ggaVar.getString(R.string.TROUBLE_LOADING_PLACES), this.aq.getString(R.string.GENERIC_TRY_AGAIN), new aphe(this) { // from class: aovn
            private final aovt a;

            {
                this.a = this;
            }

            @Override // defpackage.aphe
            public final void a() {
                aovt aovtVar = this.a;
                aovtVar.aJ(true);
                aovtVar.aU(aovtVar.ap.l().L());
            }
        }));
        aU(this.ap.l().L());
    }

    public final void aX(boolean z, jjn jjnVar) {
        if (!this.aD || this.aQ == aowo.DAY) {
            return;
        }
        boolean z2 = false;
        if (this.bd != null && dcft.k(br(), aovl.a)) {
            z2 = true;
        }
        boolean z3 = !z2;
        boolean z4 = this.bb;
        if (z3 != z4) {
            this.bb = z3;
        } else if (!z) {
            return;
        } else {
            z3 = z4;
        }
        if (z3) {
            cqkf<aphs> cqkfVar = this.aZ;
            aowo aowoVar = this.aQ;
            if (aowoVar != null) {
                cqkfVar.e(new apiz(aowoVar));
                this.aj.c(dcdc.e(), this.aj.p);
            } else {
                StringBuilder sb = new StringBuilder(93);
                sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
                sb.append(1);
                throw new NullPointerException(sb.toString());
            }
        } else if (!aphf.b(br()).a()) {
            apjc apjcVar = this.af;
            bwrs<aoyg> bwrsVar = this.aO;
            dbsk.s(bwrsVar);
            bwrs<aoyg> bwrsVar2 = this.aP;
            dbsk.s(bwrsVar2);
            bwrs<aoyg> bwrsVar3 = this.bc;
            dbsk.s(bwrsVar3);
            dcdn<aoxp, bwrs<aoyg>> dcdnVar = this.bd;
            apii a = apjcVar.a.a();
            apjc.a(a, 1);
            apip a2 = apjcVar.b.a();
            apjc.a(a2, 2);
            apjg a3 = apjcVar.c.a();
            apjc.a(a3, 3);
            apjc.a(this, 4);
            apjc.a(bwrsVar, 5);
            apjc.a(bwrsVar2, 6);
            apjc.a(bwrsVar3, 7);
            apjc.a(dcdnVar, 8);
            apjc.a(this, 9);
            apjb apjbVar = new apjb(a, a2, a3, this, bwrsVar, bwrsVar2, bwrsVar3, dcdnVar, this);
            this.aX = apjbVar;
            this.aW.e(apjbVar);
        } else {
            aV();
            return;
        }
        aU(jjnVar);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<anvb> c = this.ae.c(new anuz(false), viewGroup);
        this.aA = c;
        c.e(this.az);
        this.aZ = this.ae.c(new apad(), viewGroup);
        this.ba = this.ae.c(new aozp(), viewGroup);
        this.aW = this.ae.c(new aozy(), viewGroup);
        this.aY = this.ae.c(new apfg(), viewGroup);
        apgr apgrVar = this.ag;
        apjr q = this.az.q();
        apjs r = this.az.r();
        apjt s = this.az.s();
        gga a = apgrVar.a.a();
        apgr.a(a, 1);
        cqhn a2 = apgrVar.b.a();
        apgr.a(a2, 2);
        cqhu a3 = apgrVar.c.a();
        apgr.a(a3, 3);
        cjqy a4 = apgrVar.d.a();
        apgr.a(a4, 4);
        apjz a5 = apgrVar.e.a();
        apgr.a(a5, 5);
        apjv a6 = apgrVar.f.a();
        apgr.a(a6, 6);
        anhg a7 = apgrVar.g.a();
        apgr.a(a7, 7);
        aphc a8 = apgrVar.h.a();
        apgr.a(a8, 8);
        apgk a9 = apgrVar.i.a();
        apgr.a(a9, 9);
        aniz a10 = apgrVar.j.a();
        apgr.a(a10, 10);
        cpv a11 = apgrVar.k.a();
        apgr.a(a11, 11);
        apgr.a(this, 12);
        apgr.a(q, 13);
        apgr.a(r, 14);
        apgr.a(s, 15);
        apgq apgqVar = new apgq(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, this, q, r, s);
        this.ay = apgqVar;
        this.aY.e(apgqVar);
        if (this.bl != null) {
            cqkf c2 = this.ae.c(new auzt(), null);
            c2.e(this.bl);
            this.bm = c2.c();
        }
        if (this.bj != null) {
            cqkf c3 = this.ae.c(new anql(), null);
            c3.e(this.bj);
            this.bk = c3.c();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        super.aj(bundle);
        if (this.aV == null) {
            this.aV = new anqs(this.az, this.d);
        }
        this.be = new anva(this.ai, this.aV, this.e.a().m(), this.ay);
    }

    @Override // defpackage.aovg
    public final void b(aowo aowoVar) {
        jjn jjnVar;
        if (this.aQ == aowoVar) {
            return;
        }
        bq(false);
        aowo aowoVar2 = this.aQ;
        this.aQ = aowoVar;
        if (aowoVar == aowo.DAY) {
            this.aj.c(dcdc.e(), this.aj.p);
            this.aj.b();
            gek gekVar = this.aw;
            if (this.aC.a()) {
                jjnVar = jjn.FULLY_EXPANDED;
            } else {
                jjnVar = jjn.EXPANDED;
            }
            aU(gekVar.a(jjnVar));
        } else if (aowoVar2 == aowo.DAY) {
            this.ai.d();
            bs();
            this.aj.a();
            aX(true, this.ap.l().L());
        } else {
            apjb apjbVar = this.aX;
            if (apjbVar != null) {
                apjbVar.Z(this.aQ.ordinal());
            }
            aX(true, this.ap.l().L());
        }
        apgq apgqVar = this.ay;
        if (apgqVar == null) {
            return;
        }
        cqkx.p(apgqVar);
    }

    public final dbsg<View> bn(View view) {
        return anuz.e(view, this.az.m());
    }

    @Override // defpackage.aovg
    public final aowo c() {
        return this.aQ;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.ay.j()) {
            return true;
        }
        this.ar.a();
        return true;
    }

    @Override // defpackage.anuv
    public final void g() {
        this.az.j();
    }

    @Override // defpackage.anuv
    public final void i() {
        this.az.i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Boolean bool;
        aoge aogeVar;
        super.l(bundle);
        this.aB = anhy.q((aoum) dsuv.c((bundle == null || !bundle.containsKey("params")) ? this.o : bundle, "params", aoum.k, dsqa.c()));
        anqp a = this.as.a();
        this.bj = a;
        a.o();
        aoxr aoxrVar = null;
        if (bundle != null && bundle.containsKey("selected_day_data")) {
            try {
                aogeVar = (aoge) this.ao.d(aoge.class, bundle, "selected_day_data");
            } catch (IOException unused) {
                aogeVar = null;
            }
            if (aogeVar != null) {
                this.an.g(aogeVar);
            }
        }
        if (bundle != null && bundle.containsKey("show_current_sort_by")) {
            try {
                bool = (Boolean) this.ao.d(Boolean.class, bundle, "show_current_sort_by");
            } catch (IOException unused2) {
                bool = null;
            }
            if (bool != null) {
                this.aR = bool;
            }
        }
        if (bundle != null && bundle.containsKey("sort_by")) {
            try {
                aoxrVar = (aoxr) this.ao.d(aoxr.class, bundle, "sort_by");
            } catch (IOException unused3) {
            }
            if (aoxrVar != null) {
                this.aS = aoxrVar;
            }
        }
        this.aO = bp(bundle, "all_visited_places_list_ref");
        this.aP = bp(bundle, "all_cities_list_ref");
        this.bc = bp(bundle, "all_countries_list_ref");
        if (bundle != null && bundle.containsKey("category_to_list_refs")) {
            try {
                this.bd = (dcdn) this.ao.d(dcdn.class, bundle, "category_to_list_refs");
            } catch (IOException unused4) {
            }
        }
        this.aQ = w(this.aB.a());
        if (aouf.k(this.av, this.aB.c())) {
            if (this.aQ != aowo.DAY) {
                bvoo.h("Notifications opt-out banner is support only on DAY tab", new Object[0]);
            } else {
                this.bl = this.at.a(new aovp(this), this.aB.c());
            }
        }
        aJ(false);
        this.az = this.ah.a(this.bl, this.aB.i(), true);
        this.bf = new apke(this, this.ai, this.az);
        this.bg = new aphh(this.aq);
        if (this.aQ == aowo.DAY) {
            eapd e = this.aB.e();
            if (e != null) {
                this.aC = dbsg.i(e);
            }
            eapg g = this.aB.g();
            if (g != null) {
                this.az.k(aogb.f(g));
            }
        }
        this.bh = new apkj();
    }

    @Override // defpackage.anuv
    public final void q(aogb aogbVar) {
        b(aowo.DAY);
        this.az.k(aogbVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        jjn jjnVar;
        super.s();
        if (this.aQ != aowo.DAY) {
            if (dcft.j(br(), new dbsl(this) { // from class: aovj
                private final aovt a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.al.g((bwrs) obj);
                }
            })) {
                aJ(true);
            }
            this.aj.a();
            aX(true, this.aw.a(jjn.EXPANDED));
        } else {
            gek gekVar = this.aw;
            if (this.aC.a()) {
                jjnVar = jjn.FULLY_EXPANDED;
            } else {
                jjnVar = jjn.EXPANDED;
            }
            aU(gekVar.a(jjnVar));
        }
        this.ax.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        anhq j = this.aB.j();
        j.b(this.az.a().m());
        dsuv.d(bundle, "params", j.k().r());
        angs<aoge> p = this.az.p();
        if (p.e()) {
            p.f().g();
            this.ao.c(bundle, "selected_day_data", p.f());
        }
        this.ao.c(bundle, "sort_by", this.aS);
        this.ao.c(bundle, "show_current_sort_by", this.aR);
        this.ao.c(bundle, "all_visited_places_list_ref", this.aO);
        this.ao.c(bundle, "category_to_list_refs", this.bd);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.aw.c = this.ap.l().L();
        if (this.aQ == aowo.DAY) {
            this.ai.d();
            bs();
            dbsg<View> bn = bn(this.aA.c());
            if (bn.a()) {
                this.am.a(bn.b());
            }
        } else {
            this.aj.b();
        }
        this.ax.b();
        super.u();
    }
}
