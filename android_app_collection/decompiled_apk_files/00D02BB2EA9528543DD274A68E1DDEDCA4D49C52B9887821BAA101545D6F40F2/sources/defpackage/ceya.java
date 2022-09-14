package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ceya  reason: default package */
/* loaded from: classes4.dex */
public class ceya implements cetg {
    public static final /* synthetic */ int l = 0;
    private static final bqjh m;
    private static final dnqh n;
    public final bkpi a;
    public final bqji b;
    public final bwrs<ilo> c;
    public final cebm d;
    public final ixf e;
    public final boolean f;
    public final dbsg<djck> g;
    public final bwrs<cdjd> h;
    public final cecz i;
    public cebl j;
    public ixe k;
    private final Activity o;
    private final cexu p;
    private final blmp q;
    @dzsi
    private cext r;
    private final cebr s;
    private final ceys t;
    private final drkr u;
    @dzsi
    private jay v;
    private int w = -1;
    private final bwrr<cdjd> x;

    static {
        bqjf r = bqjh.r();
        r.n(chbv.NEVER_SHOW);
        m = r.o();
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        n = bZ.bK();
    }

    public ceya(Activity activity, final bkpi bkpiVar, final bqji bqjiVar, ceda cedaVar, cexu cexuVar, cebm cebmVar, ixf ixfVar, blmp blmpVar, cebr cebrVar, ceys ceysVar, bwqv bwqvVar, cdjd cdjdVar, drkr drkrVar, final boolean z, dbsg<drfs> dbsgVar) {
        dbsg<djck> dbsgVar2;
        ilo iloVar;
        bwrr<cdjd> bwrrVar = new bwrr(this) { // from class: cexv
            private final ceya a;

            {
                this.a = this;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                final ceya ceyaVar = this.a;
                cdjd cdjdVar2 = (cdjd) obj;
                cdjd c = ceyaVar.h.c();
                dbsk.s(c);
                cecz ceczVar = ceyaVar.i;
                ilo c2 = ceyaVar.c.c();
                dbsk.s(c2);
                ceczVar.v(c, "", c2.n(), ceyaVar.g, false, false);
                ceyaVar.j = ceyaVar.d.a(ceyaVar.c, c, new cebe(ceyaVar) { // from class: cexz
                    private final ceya a;

                    {
                        this.a = ceyaVar;
                    }

                    @Override // defpackage.cebe
                    public final void a() {
                        ceya ceyaVar2 = this.a;
                        ceya.n(ceyaVar2.a, ceyaVar2.b, ceyaVar2.c, ceyaVar2.h, ceyaVar2.f, ceyaVar2.g, cjqm.a);
                    }
                });
                ceyaVar.k = ceyaVar.e.b(ceyaVar.c, c, cdjk.PROFILE, ceyaVar.f);
                cqkx.p(ceyaVar);
            }
        };
        this.x = bwrrVar;
        this.o = activity;
        this.a = bkpiVar;
        this.b = bqjiVar;
        this.p = cexuVar;
        this.d = cebmVar;
        this.e = ixfVar;
        this.q = blmpVar;
        this.s = cebrVar;
        this.f = z;
        this.t = ceysVar;
        bwrs<cdjd> a = bwrs.a(cdjdVar);
        this.h = a;
        this.u = drkrVar;
        if (!dbsgVar.a() || dbsgVar.b().a != 1) {
            dbsgVar2 = dbpy.a;
        } else {
            djcj bZ = djck.i.bZ();
            drfs b = dbsgVar.b();
            drdk drdkVar = b.a == 1 ? (drdk) b.b : drdk.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djck djckVar = (djck) bZ.b;
            drdkVar.getClass();
            djckVar.b = drdkVar;
            djckVar.a |= 1;
            dbsgVar2 = dbsg.i(bZ.bK());
        }
        this.g = dbsgVar2;
        bwqvVar.f(a, bwrrVar, false);
        drdg drdgVar = drkrVar.a;
        drdgVar = drdgVar == null ? drdg.q : drdgVar;
        dvya bZ2 = dvyw.bv.bZ();
        String str = drdgVar.g;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar = (dvyw) bZ2.b;
        str.getClass();
        dvywVar.a |= 16;
        dvywVar.i = str;
        dhjy bZ3 = dhjz.e.bZ();
        dpum dpumVar = drdgVar.f;
        double d = (dpumVar == null ? dpum.d : dpumVar).b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ3.b;
        dhjzVar.a |= 2;
        dhjzVar.c = d;
        dpum dpumVar2 = drdgVar.f;
        double d2 = (dpumVar2 == null ? dpum.d : dpumVar2).c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ3.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = d2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar2 = (dvyw) bZ2.b;
        dhjz bK = bZ3.bK();
        bK.getClass();
        dvywVar2.e = bK;
        dvywVar2.a |= 1;
        String str2 = drdgVar.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar3 = (dvyw) bZ2.b;
        str2.getClass();
        int i = dvywVar3.a | 4;
        dvywVar3.a = i;
        dvywVar3.g = str2;
        String str3 = drdgVar.o;
        str3.getClass();
        dvywVar3.a = i | ImageMetadata.SHADING_MODE;
        dvywVar3.y = str3;
        dvyx bZ4 = dvyy.e.bZ();
        drdf drdfVar = drdgVar.k;
        String str4 = (drdfVar == null ? drdf.b : drdfVar).a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dvyy dvyyVar = (dvyy) bZ4.b;
        str4.getClass();
        dvyyVar.a |= 2;
        dvyyVar.c = str4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar4 = (dvyw) bZ2.b;
        dvyy bK2 = bZ4.bK();
        bK2.getClass();
        dvywVar4.aT = bK2;
        dvywVar4.c |= 1073741824;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyw dvywVar5 = (dvyw) bZ2.b;
        dvywVar5.c |= 16777216;
        dvywVar5.aM = true;
        for (drdd drddVar : drdgVar.m) {
            bZ2.c(drddVar.b);
        }
        ily ilyVar = new ily();
        ilyVar.E(bZ2.bK());
        ilyVar.H(drkrVar.b);
        ilyVar.c = true;
        ilyVar.q = drkrVar.c;
        if (cebu.a(cdjdVar)) {
            iloVar = ilyVar.d();
        } else {
            final docg h = cdjdVar.h();
            ilyVar.c(new dbrn(h) { // from class: ilu
                private final docg a;

                {
                    this.a = h;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    docg docgVar = this.a;
                    dmbp dmbpVar = (dmbp) obj;
                    dmas dmasVar = ((dmbq) dmbpVar.b).b;
                    if (dmasVar == null) {
                        dmasVar = dmas.f;
                    }
                    dsqp dsqpVar = (dsqp) dmasVar.cu(5);
                    dsqpVar.bC(dmasVar);
                    dmar dmarVar = (dmar) dsqpVar;
                    dmbv bZ5 = dmbw.d.bZ();
                    dmbc d3 = cdpy.d(docgVar, 2);
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dmbw dmbwVar = (dmbw) bZ5.b;
                    d3.getClass();
                    dmbwVar.b = d3;
                    dmbwVar.a |= 1;
                    if (dmarVar.c) {
                        dmarVar.bF();
                        dmarVar.c = false;
                    }
                    dmas dmasVar2 = (dmas) dmarVar.b;
                    dmbw bK3 = bZ5.bK();
                    bK3.getClass();
                    dmasVar2.b();
                    dmasVar2.b.add(bK3);
                    if (dmbpVar.c) {
                        dmbpVar.bF();
                        dmbpVar.c = false;
                    }
                    dmbq dmbqVar = (dmbq) dmbpVar.b;
                    dmas bK4 = dmarVar.bK();
                    bK4.getClass();
                    dmbqVar.b = bK4;
                    dmbqVar.a |= 1;
                    return dmbpVar;
                }
            });
            docn b2 = ilyVar.b();
            if (b2.c) {
                b2.bF();
                b2.c = false;
            }
            doco docoVar = (doco) b2.b;
            doco docoVar2 = doco.k;
            h.getClass();
            docoVar.b();
            docoVar.b.add(h);
            ilyVar.b.m = b2.bK();
            ilo d3 = ilyVar.d();
            if (z) {
                d3.bt(h);
            }
            iloVar = d3;
        }
        final bwrs<ilo> a2 = bwrs.a(iloVar);
        this.c = a2;
        cecz a3 = cedaVar.a(cjtd.a(dtxl.fw), new cjcs(this) { // from class: cexw
            private final ceya a;

            {
                this.a = this;
            }

            @Override // defpackage.cjcs
            public final void a(boolean z2) {
                bwrs<cdjd> bwrsVar = this.a.h;
                cdjd c = bwrsVar.c();
                dbsk.s(c);
                bwrsVar.d(c.e(z2));
            }
        }, false);
        this.i = a3;
        a3.v(cdjdVar, "", iloVar.n(), this.g, false, false);
        this.j = cebmVar.a(a2, cdjdVar, new cebe(this, bkpiVar, bqjiVar, a2, z) { // from class: cexx
            private final ceya a;
            private final bkpi b;
            private final bqji c;
            private final bwrs d;
            private final boolean e;

            {
                this.a = this;
                this.b = bkpiVar;
                this.c = bqjiVar;
                this.d = a2;
                this.e = z;
            }

            @Override // defpackage.cebe
            public final void a() {
                ceya ceyaVar = this.a;
                ceya.n(this.b, this.c, this.d, ceyaVar.h, this.e, ceyaVar.g, cjqm.a);
            }
        });
        this.k = ixfVar.b(a2, cdjdVar, cdjk.PROFILE, z);
    }

    public static void n(bkpi bkpiVar, bqji bqjiVar, bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, boolean z, dbsg<djck> dbsgVar, cjqm cjqmVar) {
        cdjd c = bwrsVar2.c();
        dbsk.s(c);
        if ((c.c().b().a() && !c.c().b().b().a().isEmpty()) || !c.c().a().isEmpty()) {
            bkpf e = bkpg.e(cdjk.PROFILE);
            e.d(true);
            e.e(dbsgVar);
            bkpg a = e.a();
            if (z) {
                bkpiVar.g(bwrsVar, bwrsVar2, a);
            } else {
                bkpiVar.f(bwrsVar, bwrsVar2, a);
            }
        } else if (!z) {
        } else {
            bqjf q = m.q();
            if (cjqmVar.a().c("").isEmpty()) {
                q.f(n);
            } else {
                dnqh dnqhVar = n;
                dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
                dsqpVar.bC(dnqhVar);
                dnqg dnqgVar = (dnqg) dsqpVar;
                String b = cjqmVar.a().b();
                if (dnqgVar.c) {
                    dnqgVar.bF();
                    dnqgVar.c = false;
                }
                dnqh dnqhVar2 = (dnqh) dnqgVar.b;
                dnqh dnqhVar3 = dnqh.p;
                b.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b;
                q.f(dnqgVar.bK());
            }
            bqjiVar.b(bwrsVar, q.o());
        }
    }

    private static boolean p(cdjd cdjdVar, cebr cebrVar) {
        return cebrVar.a() && cebu.a(cdjdVar);
    }

    @Override // defpackage.cetg
    public ceta a() {
        dbsg<jbe> i;
        jay a;
        if (this.r == null) {
            drdg drdgVar = this.u.a;
            if (drdgVar == null) {
                drdgVar = drdg.q;
            }
            String str = drdgVar.g;
            cdjd c = this.h.c();
            dbsk.s(c);
            String str2 = (String) c.a().b().h(cexy.a).c("");
            if (dkyd.THUMBS_UP_HELPFUL.equals(this.k.i()) || dkyd.YES_OR_NO_PROMPT.equals(this.k.i())) {
                i = dbsg.i(this.k.c());
            } else {
                i = dbpy.a;
            }
            if (this.f) {
                ceys ceysVar = this.t;
                boolean p = p(c, this.s);
                bwrs<ilo> bwrsVar = this.c;
                ceys.a(c, 1);
                ceys.a(bwrsVar, 3);
                ceys.a(str, 4);
                ceys.a(str2, 5);
                Activity activity = (Activity) ((dxjd) ceysVar.a).a;
                ceys.a(activity, 6);
                bqji a2 = ceysVar.b.a();
                ceys.a(a2, 7);
                cdjj a3 = ceysVar.c.a();
                ceys.a(a3, 8);
                cqkj a4 = ceysVar.d.a();
                ceys.a(a4, 9);
                a = new ceyr(c, p, bwrsVar, str, str2, activity, a2, a3, a4);
            } else {
                a = this.q.a(c, str, i, this.c);
            }
            this.v = a;
            a.c(o());
            this.r = this.p.a(this.c, this.h, this.v, p(c, this.s));
        }
        return this.r;
    }

    @Override // defpackage.cetg
    public Boolean b() {
        cdjd c = this.h.c();
        dbsk.s(c);
        return Boolean.valueOf(p(c, this.s));
    }

    @Override // defpackage.cetg
    public Boolean c() {
        cdjd c = this.h.c();
        dbsk.s(c);
        cdiz c2 = c.c();
        boolean z = false;
        if (!c2.e().a() && !c2.b().a() && !c2.a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cetg
    public oxt d() {
        return this.i;
    }

    @Override // defpackage.cetg
    public cebg e() {
        return this.j;
    }

    @Override // defpackage.cetg
    public izm f() {
        return this.k;
    }

    @Override // defpackage.cetg
    public Boolean g() {
        cdjd c = this.h.c();
        dbsk.s(c);
        return Boolean.valueOf(c.b().e() > 0);
    }

    @Override // defpackage.cetg
    public String h() {
        cdjd c = this.h.c();
        dbsk.s(c);
        long e = c.b().e();
        return this.o.getResources().getQuantityString(R.plurals.REVIEW_CARD_VIEWS_COUNT, decl.b(e), Long.valueOf(e));
    }

    @Override // defpackage.cetg
    public cqkl i(cjqm cjqmVar) {
        n(this.a, this.b, this.c, this.h, this.f, this.g, cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.cetg
    public cjtd j() {
        return cjtd.a(dtxl.fw);
    }

    @Override // defpackage.cetg
    public cjtd k() {
        return cjtd.a(dtxl.fq);
    }

    @Override // defpackage.cetg
    public void l(int i) {
        this.w = i;
        this.k.m(i);
        cext cextVar = this.r;
        if (cextVar != null) {
            cextVar.r(i);
        }
        jay jayVar = this.v;
        if (jayVar != null) {
            jayVar.c(i);
        }
        this.j.e(i);
    }

    public void m(bkpe bkpeVar) {
        cdjd c = this.h.c();
        dbsk.s(c);
        cdjd c2 = bkpeVar.c(c, this.c);
        if (!c2.equals(c)) {
            this.h.d(c2);
        }
        cext cextVar = this.r;
        if (cextVar != null) {
            cextVar.t(bkpeVar);
        }
    }

    public int o() {
        return this.w;
    }
}
