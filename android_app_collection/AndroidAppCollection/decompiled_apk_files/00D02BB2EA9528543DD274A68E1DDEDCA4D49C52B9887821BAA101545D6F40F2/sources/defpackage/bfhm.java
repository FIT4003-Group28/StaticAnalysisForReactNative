package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ViewAnimator;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfhm  reason: default package */
/* loaded from: classes3.dex */
public class bfhm implements bfgt, bega {
    private final bexz A;
    private final bfaq B;
    private final bhiy C;
    private final bhhf D;
    private final bhat E;
    private final ckqf F;
    private izl G;
    @dzsi
    private bnhz I;
    private bike J;
    @dzsi
    private acmv K;
    @dzsi
    private bkeq L;
    private final beey M;
    @dzsi
    private beev N;
    private bfgs O;
    private final cjqy R;
    private final begg S;
    private final biko U;
    private final bfha V;
    private final bego W;
    private final bfgq X;
    private final boolean Y;
    @dzsi
    private cys Z;
    public final dzsj<bbdv> a;
    private final cyt aa;
    @dzsi
    private jaz ab;
    @dzsi
    private final begi ac;
    public ilo b;
    public bwrs<ilo> c;
    @dzsi
    public bruz d;
    @dzsi
    public Runnable g;
    private final Resources h;
    private final gga i;
    private final bwqv j;
    private final ania k;
    private final btvo l;
    private final bmfg m;
    private final View.OnClickListener n;
    private final bfgv o;
    private final bker p;
    private final iqs q;
    private final bfgx r;
    private final bmgu s;
    @dzsi
    private bmgs t;
    private boolean u;
    private boolean v;
    private final boolean w;
    private final bfcz x;
    private final boolean y;
    private final boolean z;
    private jjn H = jjn.COLLAPSED;
    private Boolean P = false;
    private dbsg<String> Q = dbpy.a;
    private akqi ad = akqi.a;
    public boolean e = true;
    @dzsi
    private String ae = null;
    private boolean af = false;
    final bwrr<ilo> f = new bfhj(this);

    public bfhm(boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener, @dzsi begi begiVar, gga ggaVar, dzsj<akfa> dzsjVar, bvjj bvjjVar, bwqv bwqvVar, iqs iqsVar, dzsj<bbdv> dzsjVar2, ania aniaVar, btvo btvoVar, bmfg bmfgVar, bfhx bfhxVar, cqhn cqhnVar, cqhu cqhuVar, bker bkerVar, cwy cwyVar, beez beezVar, bfgx bfgxVar, bmgu bmguVar, bfcz bfczVar, beya beyaVar, bfaq bfaqVar, bhiz bhizVar, bhhf bhhfVar, bhat bhatVar, cjqy cjqyVar, cjqq cjqqVar, begg beggVar, biko bikoVar, bfha bfhaVar, bego begoVar, bfgq bfgqVar, beew beewVar, cyt cytVar) {
        this.h = ggaVar.getResources();
        this.i = ggaVar;
        this.j = bwqvVar;
        this.q = iqsVar;
        this.a = dzsjVar2;
        this.k = aniaVar;
        this.l = btvoVar;
        this.m = bmfgVar;
        this.n = onClickListener;
        this.o = bfhxVar;
        this.p = bkerVar;
        this.M = beezVar.a(beex.PLACESHEET_HEADER);
        this.r = bfgxVar;
        this.s = bmguVar;
        this.O = bfgxVar.a(null);
        this.x = bfczVar;
        this.A = beyaVar.a(null);
        this.B = bfaqVar;
        this.y = z2;
        this.z = z3;
        this.C = bhizVar.a(true);
        this.D = bhhfVar;
        this.E = bhatVar;
        this.F = new bfhk(this, cjqqVar);
        this.R = cjqyVar;
        this.S = beggVar;
        this.U = bikoVar;
        this.V = bfhaVar;
        this.W = begoVar;
        this.X = bfgqVar;
        this.aa = cytVar;
        if (begoVar.e()) {
            bego a = beewVar.a.a();
            beew.a(a);
            this.N = new beev(a, 500);
        }
        this.w = bmfg.a();
        this.Y = bvjjVar.o(bvjk.hO, dzsjVar.a().j(), false);
        this.ac = begiVar;
    }

    private final cjtd aP(ddho ddhoVar) {
        ilo iloVar;
        cjta c = cjtd.c(this.b.bZ());
        c.d = ddhoVar;
        if (!l().booleanValue() && B().booleanValue()) {
            ddji bZ = ddjj.c.bZ();
            String e = dbsj.e(this.b.bK());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ.b;
            e.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = e;
            c.k(bZ.bK());
        }
        if (this.l.getPromotedPlacesParameters().a && (iloVar = this.b) != null && !dbsd.a(iloVar.ai(), akqi.a)) {
            c.g = decs.a(this.b.ai().c);
        }
        return c.a();
    }

    private final bkeq aQ() {
        if (this.L == null) {
            this.L = this.p.a(C(), true, null);
        }
        return this.L;
    }

    private final boolean aR() {
        return this.a.a().D(this.b) == bbdt.GOOD_STATE;
    }

    private final boolean aS() {
        return this.a.a().G(this.b) && !this.D.b(this.c);
    }

    private final boolean aT() {
        return this.l.getEnableFeatureParameters().aJ;
    }

    @Override // defpackage.bfgt
    public CharSequence A() {
        return this.b.an() ? this.i.getString(R.string.PLACE_PERMANENTLY_CLOSED) : "";
    }

    @Override // defpackage.bfgt
    public Boolean B() {
        return Boolean.valueOf(this.b.aM());
    }

    @Override // defpackage.bfgt
    public acmv C() {
        if (this.K == null) {
            if (this.l.getAdsParameters().l) {
                String string = this.i.getString(R.string.AD);
                this.i.getResources();
                this.K = acpd.a(string);
            } else {
                String string2 = this.i.getString(R.string.AD);
                int a = dujv.a(this.l.getAdsParameters().b);
                if (a == 0) {
                    a = 1;
                }
                this.K = acpd.b(string2, a, this.i.getResources());
            }
        }
        acmv acmvVar = this.K;
        dbsk.s(acmvVar);
        return acmvVar;
    }

    @Override // defpackage.bfgt
    public Boolean D() {
        boolean z = false;
        if (l().booleanValue() && this.b.cF()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public void E(View view) {
        this.X.a(view);
    }

    @Override // defpackage.bfgt
    public cjtd F() {
        return this.X.d;
    }

    @Override // defpackage.bfgt
    public cjtd G() {
        if (l().booleanValue()) {
            return aP(dtxy.iA);
        }
        if (this.H == jjn.COLLAPSED) {
            return aP(dtxy.hG);
        }
        return cjtd.c;
    }

    @Override // defpackage.bfgt
    public Boolean H() {
        return Boolean.valueOf(this.b.cX() == 2);
    }

    @Override // defpackage.bfgt
    public Boolean I() {
        boolean z = false;
        if ((aC().booleanValue() && H().booleanValue()) || (this.Y && this.b.cX() != 1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean J() {
        return Boolean.valueOf(this.b.j());
    }

    @Override // defpackage.bfgt
    public Boolean K() {
        ilo iloVar = this.b;
        boolean z = false;
        if (iloVar.h && iloVar.j()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean L() {
        return this.P;
    }

    @Override // defpackage.bfgt
    public Boolean M() {
        return Boolean.valueOf(this.b.bd());
    }

    @Override // defpackage.bfgt
    public bfgv N() {
        return this.o;
    }

    @Override // defpackage.bfgt
    public Boolean O() {
        boolean z = false;
        if (!this.b.cE()) {
            return false;
        }
        cut cD = this.b.cD();
        if (cD != null && cD.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean P() {
        beey beeyVar = this.M;
        boolean z = false;
        if (beeyVar != null && beeyVar.w().booleanValue() && this.M.A() && !this.M.p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public beer Q() {
        return this.b.cE() ? aQ() : this.M;
    }

    @Override // defpackage.bfgt
    @dzsi
    public cyg R() {
        return this.Z;
    }

    @Override // defpackage.bfgt
    public izl S() {
        return this.G;
    }

    @Override // defpackage.bfgt
    public Boolean T() {
        boolean z = false;
        if (aT() && aR() && !this.D.b(this.c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean U() {
        boolean z = false;
        if (aT() && this.a.a().G(this.b) && !this.D.b(this.c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean V() {
        boolean z = true;
        if (!this.b.s && this.a.a().D(this.b) != bbdt.LOW_CONFIDENCE) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Integer W() {
        return (Integer) this.b.cH().h(bfhh.a).c(0);
    }

    @Override // defpackage.bfgt
    public cqkl X() {
        this.a.a().e(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bfgt
    public cjtd Y() {
        ddho ddhoVar;
        if (!aS()) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        if (V().booleanValue()) {
            ddhoVar = dtxy.kY;
        } else {
            ddhoVar = aR() ? dtxy.kX : dtxy.kZ;
        }
        b.d = ddhoVar;
        if (!aT()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        this.a.a().I(this.b, b);
        return b.a();
    }

    @Override // defpackage.bfgt
    public Boolean Z() {
        boolean z = false;
        if (d().booleanValue() && !h().booleanValue() && aD().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    @dzsi
    public String a() {
        if (!this.k.a() || !this.b.bl()) {
            if (this.b.bi()) {
                return this.b.bh();
            }
            return dbsj.f(this.b.q());
        }
        ilo iloVar = this.b;
        List<azvo> list = iloVar.F;
        return axxz.a(this.i, iloVar.p, iloVar.bh(), list, list.get(0).t());
    }

    public String aA() {
        return this.b.n();
    }

    public Boolean aB() {
        return Boolean.valueOf(this.b.o());
    }

    public Boolean aC() {
        return Boolean.valueOf(this.b.be() == iln.STATION);
    }

    public Boolean aD() {
        return Boolean.valueOf(this.b.cB());
    }

    @dzsi
    public bees aE() {
        return this.N;
    }

    public void aF(izl izlVar) {
        this.G = izlVar;
    }

    public void aG(Boolean bool) {
        this.P = bool;
    }

    public void aH() {
        bwrs<ilo> bwrsVar = this.c;
        if (bwrsVar != null) {
            this.j.g(bwrsVar, this.f);
        }
    }

    public void aI() {
        bwrs<ilo> bwrsVar = this.c;
        if (bwrsVar != null) {
            bwqv.t(bwrsVar, this.f);
        }
        aN();
    }

    @Override // defpackage.bfgt
    /* renamed from: aJ */
    public bfcz an() {
        return this.x;
    }

    @dzsi
    public bfch aK() {
        return this.x.o();
    }

    @dzsi
    public bfch aL() {
        return this.x.p();
    }

    public cqkl aM(View view) {
        View a;
        if (l().booleanValue() && (a = cqhu.a(view, bfzt.k)) != null) {
            this.x.q(a);
        }
        return cqkl.a;
    }

    public final void aN() {
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
            this.g = null;
        }
    }

    public void aO(@dzsi bruz bruzVar) {
        this.d = bruzVar;
    }

    @Override // defpackage.bfgt
    public Boolean aa() {
        boolean z = false;
        if (J().booleanValue() && !K().booleanValue() && L().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean ab() {
        boolean z = true;
        if (!e().booleanValue() && !I().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean ac() {
        return Boolean.valueOf(this.Q.a());
    }

    @Override // defpackage.bfgt
    public String ad() {
        return this.Q.c("");
    }

    @Override // defpackage.bfgt
    @dzsi
    public jic ae() {
        String str;
        if (!al().booleanValue() || (str = this.ae) == null) {
            return null;
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, 0, 0);
    }

    @Override // defpackage.bfgt
    @dzsi
    public jic af() {
        if (!ak().booleanValue()) {
            return null;
        }
        return new jic(this.b.cP(), ckqc.FIFE_MERGE, 0, this.F);
    }

    @Override // defpackage.bfgt
    public String ag() {
        if (ah().booleanValue()) {
            return this.h.getString(R.string.MERCHANT_LOGO_IMAGE_DESCRIPTION);
        }
        return this.h.getString(R.string.MERCHANT_LOGO_IMAGE);
    }

    @Override // defpackage.bfgt
    public Boolean ah() {
        return Boolean.valueOf(this.S.i(bege.ABOUT));
    }

    @Override // defpackage.bfgt
    public cqkl ai() {
        if (ah().booleanValue()) {
            this.S.k(bege.ABOUT);
        }
        return cqkl.a;
    }

    @Override // defpackage.bfgt
    @dzsi
    public cjtd aj() {
        if (ah().booleanValue()) {
            cjta c = cjtd.c(this.b.a());
            c.d = dtxy.iO;
            return c.a();
        }
        return null;
    }

    @Override // defpackage.bfgt
    public Boolean ak() {
        boolean z = false;
        if (ae() == null && this.e && !this.b.cP().isEmpty()) {
            dvxg dvxgVar = this.b.bf().x;
            if (dvxgVar == null) {
                dvxgVar = dvxg.b;
            }
            if (dvxgVar.a) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean al() {
        return Boolean.valueOf(this.af);
    }

    @Override // defpackage.bfgt
    public bfgs am() {
        return this.O;
    }

    @Override // defpackage.bfgt
    public Boolean ao() {
        boolean z = false;
        if (this.A.a() && this.x.w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    @dzsi
    public bruz ap() {
        return this.d;
    }

    @Override // defpackage.bfgt
    public Boolean aq() {
        return Boolean.valueOf(this.W.a(this.b));
    }

    @Override // defpackage.bfgt
    @dzsi
    public bhiq ar() {
        if (this.D.b(this.c) && !this.E.a()) {
            this.C.t(this.c);
            return this.C;
        }
        return null;
    }

    @Override // defpackage.bfgt
    public cjtd as() {
        return this.D.e(this.b, dtxv.cs);
    }

    @Override // defpackage.bfgt
    public String at() {
        String a = a();
        if (dbsj.d(a)) {
            return "";
        }
        if (this.d == null) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        bruz bruzVar = this.d;
        dbsk.s(bruzVar);
        aeqd G = bruzVar.G();
        if (G != null && G.b() != null) {
            aeqk b = G.b();
            dbsk.s(b);
            arrayList.add(b.b());
            String a2 = G.a();
            if (!dbsj.d(a2)) {
                dbsk.s(a2);
                arrayList.add(a2);
            }
        }
        return dbrz.e(", ").g(arrayList);
    }

    @Override // defpackage.bfgt
    @dzsi
    public jaz au() {
        return this.ab;
    }

    @Override // defpackage.bfgt
    @dzsi
    public aeqd av() {
        bruz bruzVar = this.d;
        if (bruzVar == null) {
            return null;
        }
        aeqd G = bruzVar.G();
        if (bruzVar.F().intValue() == 1 && G.b() != null) {
            return G;
        }
        return null;
    }

    public void aw(bnhz bnhzVar) {
        this.I = bnhzVar;
    }

    public void ax(bfau bfauVar) {
        if (this.B.a()) {
            this.x.s(bfauVar);
        }
    }

    public void ay(jjn jjnVar) {
        View o;
        ViewAnimator viewAnimator;
        this.H = jjnVar;
        if (l().booleanValue() && this.g == null && (o = cqkx.o(this)) != null && (viewAnimator = (ViewAnimator) cqkx.e(o, bfzt.d, ViewAnimator.class)) != null) {
            final Animation inAnimation = viewAnimator.getInAnimation();
            this.g = new Runnable(inAnimation) { // from class: bfhi
                private final Animation a;

                {
                    this.a = inAnimation;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.setAnimationListener(null);
                }
            };
            inAnimation.setAnimationListener(new bfhl(this, viewAnimator));
        }
        bfch aK = aK();
        if (aK != null) {
            aK.h(jjnVar);
        }
        bfch aL = aL();
        if (aL != null) {
            aL.h(jjnVar);
        }
        if (jjnVar != jjn.HIDDEN) {
            this.X.d();
        }
    }

    public Boolean az() {
        boolean z = true;
        if (this.b.bi()) {
            return true;
        }
        if (!this.k.a() || !this.b.bl()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    @dzsi
    public cqtd b() {
        return bfha.c(this.I, this.l);
    }

    @Override // defpackage.bfgt
    @dzsi
    public String c() {
        return bfha.b(this.I, this.l);
    }

    @Override // defpackage.bfgt
    public Boolean d() {
        return Boolean.valueOf(this.b.f);
    }

    @Override // defpackage.bfgt
    public Boolean e() {
        return Boolean.valueOf(!dbsj.d(f()));
    }

    @Override // defpackage.bfgt
    public String f() {
        return aehv.a(this.h, this.b.bT()).c(this.b.ar());
    }

    @Override // defpackage.bfgt
    public Boolean g() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.bfgt
    public Boolean h() {
        boolean z = false;
        if (!J().booleanValue() && !dbsj.d(this.J.a())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public String i() {
        if (!dbsj.d(this.J.a())) {
            String a = this.J.a();
            dbsk.s(a);
            return a;
        }
        return "";
    }

    @Override // defpackage.bfgt
    public Integer j() {
        return Integer.valueOf(!dbsj.d(this.J.a()) ? this.J.b() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bfgt
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String k(boolean r7) {
        /*
            r6 = this;
            bfha r7 = r6.V
            ilo r0 = r6.b
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r7 = r1
            goto L5b
        L9:
            java.lang.String r2 = r0.ab()
            boolean r3 = defpackage.dbsj.d(r2)
            if (r3 == 0) goto L15
            r7 = r1
            goto L49
        L15:
            dgbg r3 = r0.ac()
            cqat r4 = r7.a
            boolean r3 = defpackage.bfdq.a(r3, r4)
            if (r3 == 0) goto L2b
            android.content.res.Resources r3 = r7.b
            r4 = 2131957413(0x7f1316a5, float:1.955141E38)
            java.lang.String r3 = r3.getString(r4)
            goto L2d
        L2b:
            java.lang.String r3 = ""
        L2d:
            android.content.res.Resources r7 = r7.b
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r5 = 2131956361(0x7f131289, float:1.9549276E38)
            java.lang.String r5 = r7.getString(r5)
            r4[r2] = r5
            r2 = 2
            r4[r2] = r3
            r2 = 2131957414(0x7f1316a6, float:1.9551411E38)
            java.lang.String r7 = r7.getString(r2, r4)
        L49:
            if (r7 == 0) goto L4c
            goto L7
        L4c:
            dbsg r7 = r0.bS()
            boolean r7 = r7.a()
            if (r7 == 0) goto L57
            goto L7
        L57:
            java.lang.String r7 = r0.Z()
        L5b:
            boolean r0 = defpackage.dbsj.d(r7)
            if (r0 == 0) goto L62
            goto L78
        L62:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = " · "
            int r1 = r7.length()
            if (r1 == 0) goto L73
            java.lang.String r1 = r0.concat(r7)
            goto L78
        L73:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfhm.k(boolean):java.lang.String");
    }

    @Override // defpackage.bfgt
    public Boolean l() {
        return Boolean.valueOf(this.H.b());
    }

    @Override // defpackage.bfgt
    public Boolean m() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.bfgt
    public Boolean n() {
        return bfha.e(this.H);
    }

    @Override // defpackage.bfgt
    public Boolean o() {
        boolean z = false;
        if (aB().booleanValue() && this.b.aM()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    public Boolean p() {
        boolean z = false;
        if (!v().booleanValue()) {
            return false;
        }
        if (az().booleanValue()) {
            return true;
        }
        if (!this.b.u().booleanValue() && !dbsj.d(this.b.s())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgt
    @dzsi
    public bmgs q() {
        return this.t;
    }

    @Override // defpackage.bfgt
    public Boolean r() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.bfgt
    public Boolean s() {
        return Boolean.valueOf(this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bega
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.bwrs<defpackage.ilo> r6) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfhm.t(bwrs):void");
    }

    @Override // defpackage.bega
    public void u() {
        if (this.A.a()) {
            this.x.u();
        }
        this.Q = dbpy.a;
        this.X.c();
        this.u = false;
        this.v = false;
        this.t = null;
        beev beevVar = this.N;
        if (beevVar != null) {
            beevVar.k(null, null);
        }
        this.Z = null;
        this.ab = null;
        this.ae = null;
        this.af = false;
    }

    @Override // defpackage.bfgt
    public Boolean v() {
        boolean z = false;
        if (aB().booleanValue() && !this.b.aM()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }

    @Override // defpackage.bfgt
    public String x() {
        if (az().booleanValue()) {
            if (!dbsj.d(this.b.s())) {
                return this.h.getString(R.string.LOCAL_LANGUAGE_AND_TRANSLATED_NAME, this.b.s(), this.b.n());
            }
            return this.b.n();
        } else if (this.b.u().booleanValue() || dbsj.d(this.b.s())) {
            return aA();
        } else {
            return this.b.s();
        }
    }

    @Override // defpackage.bfgt
    public View.OnClickListener y() {
        return this.X.e(this.n);
    }

    @Override // defpackage.bfgt
    public Boolean z() {
        return Boolean.valueOf(this.b.an());
    }
}
