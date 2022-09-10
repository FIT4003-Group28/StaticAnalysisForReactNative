package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bllx  reason: default package */
/* loaded from: classes3.dex */
public class bllx implements bllc, bega, begs {
    private blnh C;
    private cecz D;
    private final blni E;
    private final blln F;
    private cebl G;
    private izm H;
    private bhtu I;
    private final bhuh K;
    private boolean M;
    private final cdjk O;
    public final dxio<bkpi> a;
    private final Activity g;
    private final dxio<akfa> h;
    private final dzsj<bqji> i;
    private final dzsj<cdjj> j;
    private final bwqv k;
    private final ceda l;
    private final ixf m;
    private final blmy n;
    private final cebm o;
    private final blkj p;
    private final cebr q;
    private boolean s;
    private boolean t;
    private boolean u;
    @dzsi
    private Class<? extends bqld> v;
    private final btrm x;
    private boolean y;
    private boolean z;
    private String r = "";
    public bwrs<ilo> b = bwrs.a(null);
    private final bllw w = new bllw(this);
    public bwrs<cdjd> c = bwrs.a(null);
    private boolean A = false;
    private int B = -1;
    String d = "";
    dbsg<djck> e = dbpy.a;
    private cjtd J = cjtd.b;
    public boolean f = false;
    @dzsi
    private Integer N = null;
    private final bwrr<cdjd> L = new bwrr(this) { // from class: bllq
        private final bllx a;

        {
            this.a = this;
        }

        @Override // defpackage.bwrr
        public final void PV(Object obj) {
            bllx bllxVar = this.a;
            cdjd cdjdVar = (cdjd) obj;
            if (bllxVar.f) {
                return;
            }
            bllxVar.H();
            cqkx.p(bllxVar);
        }
    };

    public bllx(Activity activity, cqhn cqhnVar, btvo btvoVar, dxio<akfa> dxioVar, ceda cedaVar, blni blniVar, bllo blloVar, bwqv bwqvVar, dzsj<bqji> dzsjVar, dzsj<cdjj> dzsjVar2, ixf ixfVar, blmy blmyVar, cebm cebmVar, blkj blkjVar, dxio<bkpi> dxioVar2, btrm btrmVar, cebr cebrVar, bhuh bhuhVar, cdjk cdjkVar, ddho ddhoVar) {
        this.l = cedaVar;
        this.E = blniVar;
        this.F = blloVar.a(true, cdjkVar, ddhoVar);
        this.g = activity;
        this.h = dxioVar;
        this.i = dzsjVar;
        this.j = dzsjVar2;
        this.k = bwqvVar;
        this.m = ixfVar;
        this.n = blmyVar;
        this.o = cebmVar;
        this.p = blkjVar;
        this.a = dxioVar2;
        this.x = btrmVar;
        this.K = bhuhVar;
        this.q = cebrVar;
        this.O = cdjkVar;
    }

    private final void L(bwrs<ilo> bwrsVar, boolean z) {
        String string;
        bwrs<ilo> bwrsVar2;
        cdjd cdjdVar;
        blmx blmxVar;
        btlu j;
        this.A = z;
        this.b = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.s = true;
        this.t = this.p.b(bwrsVar);
        this.z = c.br();
        boolean br = c.br();
        cdjd c2 = this.c.c();
        dbsk.s(c2);
        this.u = !cebu.c(c2) && this.t;
        Resources resources = this.g.getResources();
        if (this.z) {
            string = resources.getString(R.string.EDIT_REVIEW_AND_POST);
        } else if (br) {
            string = resources.getString(R.string.SEE_DRAFT_REVIEW_AND_POST);
        } else {
            string = O(c2) ? resources.getString(R.string.YOUR_REVIEW_ADD_TEXT) : "";
        }
        this.r = string;
        cjta b = cjtd.b();
        b.g(c2.a().h().c(""));
        b.d = p().booleanValue() ? dtxy.ml : dtxy.mK;
        this.J = b.a();
        if (cebu.c(c2) && (j = this.h.a().j()) != null && btlu.i(j).equals(btlt.GOOGLE)) {
            String v = j.v();
            String str = j.i;
            if (v != null || str != null) {
                dnpp bZ = dnpq.g.bZ();
                if (v != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnpq dnpqVar = (dnpq) bZ.b;
                    v.getClass();
                    dnpqVar.a |= 8;
                    dnpqVar.d = v;
                }
                if (str != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnpq dnpqVar2 = (dnpq) bZ.b;
                    str.getClass();
                    dnpqVar2.a |= 16;
                    dnpqVar2.e = str;
                }
                docg h = c2.h();
                dsqp dsqpVar = (dsqp) h.cu(5);
                dsqpVar.bC(h);
                docc doccVar = (docc) dsqpVar;
                dnpq bK = bZ.bK();
                if (doccVar.c) {
                    doccVar.bF();
                    doccVar.c = false;
                }
                docg docgVar = (docg) doccVar.b;
                docg docgVar2 = docg.M;
                bK.getClass();
                docgVar.m = bK;
                docgVar.a |= 16;
                c2 = cdrr.r(doccVar.bK(), c2.a().c());
                this.c.d(c2);
                this.s = false;
            }
        }
        cdjd cdjdVar2 = c2;
        bwrs<ilo> bwrsVar3 = this.b;
        boolean z2 = this.u;
        blnh blnhVar = this.C;
        if (blnhVar != null) {
            blnhVar.A(this.x);
        }
        this.C = this.E.a(this.g);
        if (z2) {
            blmy blmyVar = this.n;
            cdja c3 = cdjdVar2.a().c();
            blmy.a(this, 1);
            blmy.a(bwrsVar3, 2);
            blmy.a(c3, 3);
            Activity activity = (Activity) ((dxjd) blmyVar.a).a;
            blmy.a(activity, 4);
            eeu a = blmyVar.b.a();
            blmy.a(a, 5);
            cjqy a2 = blmyVar.c.a();
            blmy.a(a2, 6);
            dxio a3 = ((dxjh) blmyVar.d).a();
            blmy.a(a3, 7);
            bvrb a4 = blmyVar.e.a();
            blmy.a(a4, 8);
            btvo a5 = blmyVar.f.a();
            blmy.a(a5, 9);
            cpv a6 = blmyVar.g.a();
            blmy.a(a6, 10);
            cebr a7 = blmyVar.h.a();
            blmy.a(a7, 11);
            dxio a8 = ((dxjh) blmyVar.i).a();
            blmy.a(a8, 12);
            bwrsVar2 = bwrsVar3;
            cdjdVar = cdjdVar2;
            blmxVar = new blmx(this, bwrsVar3, c3, activity, a, a2, a3, a4, a5, a6, a7, a8);
        } else {
            bwrsVar2 = bwrsVar3;
            cdjdVar = cdjdVar2;
            blmxVar = null;
        }
        blnh blnhVar2 = this.C;
        ilo c4 = bwrsVar2.c();
        dbsk.s(c4);
        blnhVar2.x(c4, cdjdVar, true, blmxVar);
        if (this.y) {
            this.C.z(this.x);
        }
        boolean z3 = this.A;
        boolean z4 = !z3 && !l().booleanValue();
        cecz a9 = this.l.a(null, bllr.a, false);
        this.D = a9;
        a9.v(cdjdVar, this.d, "", this.e, z3, z4);
        this.F.r(this.b);
        this.H = this.m.b(this.b, cdjdVar, this.O, true);
        this.G = this.o.a(this.b, cdjdVar, new cebe(this) { // from class: blls
            private final bllx a;

            {
                this.a = this;
            }

            @Override // defpackage.cebe
            public final void a() {
                this.a.o();
            }
        });
        H();
    }

    private final void M() {
        if (this.M) {
            return;
        }
        this.k.f(this.c, this.L, false);
        this.M = true;
    }

    private final void N() {
        if (!this.M) {
            return;
        }
        bwqv.t(this.c, this.L);
        this.M = false;
    }

    private static boolean O(cdjd cdjdVar) {
        return ((String) cdjdVar.c().b().h(bllu.a).c("")).isEmpty();
    }

    @Override // defpackage.bllc
    public Boolean A() {
        return D();
    }

    @Override // defpackage.bllc
    public cjtd B() {
        cjta c = cjtd.c(this.J);
        c.d = dtxy.mo;
        return c.a();
    }

    @Override // defpackage.bllc
    public String C(cdja cdjaVar) {
        ilo c = this.b.c();
        dbuh.d(c);
        cdja cdjaVar2 = cdja.UNKNOWN;
        if (cdjaVar.ordinal() == 2) {
            return c.bs().i;
        }
        return K().a().g();
    }

    @Override // defpackage.bllc
    public Boolean D() {
        boolean z = true;
        if (this.q.a()) {
            this.O.equals(cdjk.PLACESHEET_REVIEWS);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bllc
    public int E() {
        return this.B;
    }

    public void F(bwrs<ilo> bwrsVar, cdjd cdjdVar) {
        this.f = true;
        if (!dbsd.a(this.c.c(), cdjdVar)) {
            N();
            this.c.d(cdjdVar);
            M();
        }
        L(bwrsVar, false);
        this.f = false;
    }

    public void G(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, String str, dbsg<djck> dbsgVar) {
        this.f = true;
        if (!dbsd.a(this.c, bwrsVar2)) {
            N();
            this.c = bwrsVar2;
            M();
        }
        this.d = str;
        this.e = dbsgVar;
        L(bwrsVar, true);
        this.f = false;
    }

    public final void H() {
        final cdjd c;
        ilo c2 = this.b.c();
        if (c2 == null || (c = this.c.c()) == null) {
            return;
        }
        this.I = this.K.a(c, c2.bf(), this.A, this.b, new cjcs(this, c) { // from class: bllt
            private final bllx a;
            private final cdjd b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // defpackage.cjcs
            public final void a(boolean z) {
                this.a.c.d(this.b.f(z));
            }
        });
    }

    public void I(@dzsi Class<? extends bqld> cls) {
        this.F.t(cls);
        this.v = cls;
    }

    @Override // defpackage.bllc
    /* renamed from: J */
    public blln r() {
        return this.F;
    }

    final cdjd K() {
        cdjd c = this.c.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public blkw a() {
        blnh blnhVar = this.C;
        if (blnhVar != null) {
            return blnhVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public cebx b() {
        cecz ceczVar = this.D;
        if (ceczVar != null) {
            return ceczVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public izm c() {
        izm izmVar = this.H;
        if (izmVar != null) {
            return izmVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public bhtu d() {
        bhtu bhtuVar = this.I;
        if (bhtuVar != null) {
            return bhtuVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    public String e() {
        return K().a().a().c("");
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bllx)) {
            return false;
        }
        bllx bllxVar = (bllx) obj;
        return dbsd.a(a(), bllxVar.a()) && dbsd.a(b(), bllxVar.b()) && dbsd.a(d(), bllxVar.d()) && dbsd.a(f(), bllxVar.f());
    }

    @Override // defpackage.blla
    public cebg f() {
        cebl ceblVar = this.G;
        if (ceblVar != null) {
            return ceblVar;
        }
        throw new IllegalStateException("setPlacemark() must be called before viewmodel is used");
    }

    @Override // defpackage.blla
    @dzsi
    public cjtd g() {
        return this.J;
    }

    @Override // defpackage.blla
    public Boolean h() {
        return Boolean.valueOf(this.s);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), d(), f()});
    }

    @Override // defpackage.blla
    public String i() {
        return this.r;
    }

    @Override // defpackage.blla
    public cqkl j() {
        if (this.b.c() == null || this.D == null) {
            return cqkl.a;
        }
        if (p().booleanValue()) {
            cdje e = cdjf.e();
            e.c(chbv.NEVER_SHOW);
            cdjd c = this.c.c();
            dbsk.s(c);
            ((cdit) e).b = c;
            this.j.a().a(this.b, e.a());
        } else {
            bqjf r = bqjh.r();
            r.f(bzwi.c(blpk.PLACE_PAGE));
            ((bqir) r).e = this.v;
            r.n(chbv.NEVER_SHOW);
            this.i.a().b(this.b, r.o());
        }
        return cqkl.a;
    }

    @Override // defpackage.blla
    @dzsi
    public cjtd k() {
        ilo c = this.b.c();
        if (c == null) {
            return null;
        }
        cjta c2 = cjtd.c(c.a());
        c2.d = dtxy.eW;
        return c2.a();
    }

    @Override // defpackage.blla
    public Boolean l() {
        return Boolean.valueOf(!this.A);
    }

    @Override // defpackage.blla, defpackage.begs
    public void m(btrm btrmVar) {
        this.F.m(btrmVar);
        blnh blnhVar = this.C;
        if (blnhVar != null) {
            blnhVar.z(btrmVar);
        }
        if (!this.y) {
            bllw bllwVar = this.w;
            dceq a = dcet.a();
            a.b(bqje.class, new bllz(bqje.class, bllwVar, bvrj.UI_THREAD));
            btrmVar.g(bllwVar, a.a());
            this.y = true;
        }
    }

    @Override // defpackage.blla, defpackage.begs
    public void n(btrm btrmVar) {
        this.F.n(btrmVar);
        blnh blnhVar = this.C;
        if (blnhVar != null) {
            blnhVar.A(btrmVar);
        }
        if (this.y) {
            btrmVar.a(this.w);
            this.y = false;
        }
    }

    @Override // defpackage.blla
    public cqkl o() {
        if (!l().booleanValue()) {
            return cqkl.a;
        }
        if (!this.u || this.b.c() == null) {
            return cqkl.a;
        }
        cdjd c = this.c.c();
        if (c == null) {
            return cqkl.a;
        }
        if (this.z) {
            return j();
        }
        if (O(c)) {
            return j();
        }
        this.a.a().g(this.b, this.c, bkpg.f(this.O));
        return cqkl.a;
    }

    @Override // defpackage.blla
    public Boolean p() {
        cdjd c = this.c.c();
        boolean z = false;
        if (c != null && cebu.a(c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blla
    public void q(int i) {
        this.B = i;
        c().m(i);
        cebl ceblVar = this.G;
        if (ceblVar != null) {
            ceblVar.e(i);
        }
    }

    @Override // defpackage.bllc
    public Boolean s() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dbsg<cdjd> dbsgVar;
        cdrr q;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (A().booleanValue()) {
            dbsgVar = ((cdqb) c.bn()).b.c().d(((cdqb) c.bn()).b.b());
        } else {
            dbsgVar = dbpy.a;
        }
        if (c.br()) {
            q = cdrr.q(c.bs(), dqgr.DRAFT);
        } else {
            q = cdrr.q(c.bq(), dqgr.PUBLISHED);
        }
        F(bwrsVar, dbsgVar.c(q));
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bllc
    public String v() {
        return this.g.getString(R.string.YOUR_REVIEW);
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.bllc
    public void x(int i) {
        this.N = Integer.valueOf(i);
    }

    @Override // defpackage.bllc
    @dzsi
    public Integer y() {
        return this.N;
    }

    @Override // defpackage.bllc
    public View.OnClickListener z() {
        return new View.OnClickListener(this) { // from class: bllv
            private final bllx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bllx bllxVar = this.a;
                if (!bllxVar.l().booleanValue() || bllxVar.b == null) {
                    return;
                }
                bllxVar.a.a().c(bllxVar.b);
            }
        };
    }
}
