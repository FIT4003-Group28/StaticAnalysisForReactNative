package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnju  reason: default package */
/* loaded from: classes3.dex */
public class bnju implements jba {
    private static final dcqe b = dcqe.c("bnju");
    private static final int[] c = {R.drawable.guide_no_image_blue, R.drawable.guide_no_image_green, R.drawable.guide_no_image_yellow};
    private final boolean A;
    private final long B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    @dzsi
    private final amsz G;
    @dzsi
    private final bydq H;
    @dzsi
    private final GmmLocation I;
    @dzsi
    private String M;
    @dzsi
    private String N;
    @dzsi
    private final cjtd O;
    @dzsi
    private bikf P;
    @dzsi
    private bfub R;
    @dzsi
    private acmv S;
    @dzsi
    private List<bevm> U;
    private final cjta V;
    @dzsi
    private String W;
    private final bvsl X;
    private List<jbi> Y;
    private final aeqg Z;
    @dzsi
    private aeqf aa;
    private final dzsj<bfkv> ab;
    private final bfkm ac;
    @dzsi
    private final dwfl ad;
    @dzsi
    private final cqtd ae;
    @dzsi
    private cys af;
    private final cyt ag;
    private final dzsj<bbdv> ah;
    private final cqhu ai;
    private final cqhn aj;
    private final bnjf ak;
    private final bnje al;
    private List<jaz> am;
    private final bmef an;
    private final bhhf ao;
    private final bhiz ap;
    @dzsi
    private bhiy aq;
    private final cjqy ar;
    private akqi as;
    private final dxio<afha> at;
    private final bmdq au;
    private final bmds av;
    private final Activity d;
    private final btvo e;
    private final cqat f;
    private final dzsj<biko> g;
    private final dzsj<qbt> h;
    private final dzsj<brba> i;
    private final dzsj<axwy> j;
    private final dzsj<axwp> k;
    private final dzsj<begg> l;
    private final dzsj<axyp> m;
    private axyo n;
    private final dzsj<beuq> o;
    private ilo p;
    private final bvsx q;
    @dzsi
    private final bnjt s;
    private final int t;
    private final begh u;
    private final boolean v;
    @dzsi
    private CharSequence w;
    private final boolean x;
    private final boolean y;
    private final boolean z;
    private String r = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private String Q = "";

    public bnju(Activity activity, btvo btvoVar, cqat cqatVar, ilo iloVar, @dzsi bnjt bnjtVar, int i, @dzsi GmmLocation gmmLocation, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7, boolean z8, boolean z9, @dzsi amsz amszVar, @dzsi bydq bydqVar, dzsj<biko> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<brba> dzsjVar3, dzsj<axwy> dzsjVar4, dzsj<axwp> dzsjVar5, dzsj<begg> dzsjVar6, dzsj<axyp> dzsjVar7, @dzsi cjtd cjtdVar, begh beghVar, bvsl bvslVar, dzsj<beuq> dzsjVar8, dzsj<bfkv> dzsjVar9, @dzsi bfkm bfkmVar, @dzsi dwfl dwflVar, @dzsi cqtd cqtdVar, cyt cytVar, dzsj<bbdv> dzsjVar10, cqhu cqhuVar, cqhn cqhnVar, bnjf bnjfVar, bmef bmefVar, bhhf bhhfVar, aeqg aeqgVar, cjqy cjqyVar, bhiz bhizVar, dxio<afha> dxioVar, bmdq bmdqVar) {
        bfku bfkuVar;
        cjta b2 = cjtd.b();
        b2.d = dtyb.aL;
        this.V = b2;
        this.Y = new ArrayList();
        this.am = dcdc.e();
        this.as = akqi.a;
        this.d = activity;
        this.e = btvoVar;
        this.f = cqatVar;
        this.z = z4;
        this.X = bvslVar;
        this.ai = cqhuVar;
        this.aj = cqhnVar;
        this.q = new bvsx(activity.getResources());
        this.s = bnjtVar;
        this.t = i;
        this.I = gmmLocation;
        this.x = z;
        this.y = z2;
        this.C = z5;
        this.A = z6;
        this.B = j;
        this.D = z7;
        this.E = z8;
        this.F = z9;
        this.g = dzsjVar;
        this.G = amszVar;
        this.H = bydqVar;
        this.h = dzsjVar2;
        this.i = dzsjVar3;
        this.j = dzsjVar4;
        this.k = dzsjVar5;
        this.l = dzsjVar6;
        this.m = dzsjVar7;
        this.O = cjtdVar;
        this.u = beghVar;
        this.o = dzsjVar8;
        this.ab = dzsjVar9;
        if (bfkmVar != null) {
            bfkuVar = bfkmVar;
        } else {
            bfkv a = dzsjVar9.a();
            Activity activity2 = (Activity) ((dxjd) a.a).a;
            bfkv.a(activity2, 1);
            cjqy a2 = a.b.a();
            bfkv.a(a2, 2);
            bhat a3 = a.c.a();
            bfkv.a(a3, 3);
            btvo a4 = a.d.a();
            bfkv.a(a4, 4);
            bbut a5 = a.e.a();
            bfkv.a(a5, 5);
            bflb a6 = a.f.a();
            bfkv.a(a6, 6);
            bwsh a7 = a.g.a();
            bfkv.a(a7, 7);
            bvrb a8 = a.h.a();
            bfkv.a(a8, 8);
            cqhn a9 = a.i.a();
            bfkv.a(a9, 9);
            dxio a10 = ((dxjh) a.j).a();
            bfkv.a(a10, 10);
            bvjj a11 = a.k.a();
            bfkv.a(a11, 11);
            bvpe a12 = a.l.a();
            bfkv.a(a12, 12);
            huc a13 = a.m.a();
            bfkv.a(a13, 13);
            bmdy a14 = a.n.a();
            bfkv.a(a14, 14);
            bmdz a15 = a.o.a();
            bfkv.a(a15, 15);
            bfkuVar = new bfku(activity2, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
        }
        this.ac = bfkuVar;
        this.ad = dwflVar;
        this.ae = cqtdVar;
        this.ag = cytVar;
        this.v = bmdqVar.c();
        this.p = iloVar;
        this.n = dzsjVar7.a().a(iloVar);
        this.ah = dzsjVar10;
        this.ak = bnjfVar;
        bnjc h = bnjd.h();
        h.c(z6);
        h.b(z3);
        h.e(z5);
        h.h(z8);
        h.g(z7);
        bnje a16 = bnjfVar.a(iloVar, h.a());
        this.al = a16;
        this.am = a16.b(1);
        this.an = bmefVar;
        this.ao = bhhfVar;
        this.Z = aeqgVar;
        this.ar = cjqyVar;
        this.ap = bhizVar;
        this.at = dxioVar;
        this.au = bmdqVar;
        bmdr i2 = bmds.i();
        i2.f(true);
        i2.d(true);
        this.av = i2.a();
    }

    private final CharSequence aL(Context context, cqat cqatVar, byee byeeVar) {
        bydq bydqVar = this.H;
        if (bydqVar != null) {
            return bydqVar.a(byeeVar);
        }
        bydl g = bydm.g(context);
        g.b(ibm.S().b(this.d));
        return new bydr(context, cqatVar, g.a()).a(byeeVar);
    }

    private static jic aM(dwfl dwflVar) {
        return new jic(dwflVar.h, jfv.b(dwflVar), 0, 250);
    }

    private static String aN(@dzsi String str, @dzsi String str2) {
        if (!dbsj.d(str)) {
            if (dbsj.d(str2)) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" · ");
            sb.append(str2);
            return sb.toString();
        }
        return dbsj.e(str2);
    }

    private static Boolean aO(ilo iloVar) {
        return Boolean.valueOf(iloVar.bl());
    }

    private static String aP(ilo iloVar, Activity activity) {
        if (aO(iloVar).booleanValue()) {
            return iloVar.B();
        }
        return aehv.a(activity.getResources(), iloVar.bT()).c(iloVar.aq());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aQ() {
        /*
            r7 = this;
            java.lang.Boolean r0 = r7.V()
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L37
            amsz r0 = r7.G
            boolean r0 = r0.c()
            if (r0 != 0) goto L37
            amsz r0 = r7.G
            amvh r0 = r0.d()
            if (r0 == 0) goto L37
            akqq r0 = r0.e
            if (r0 == 0) goto L30
            amvs r2 = new amvs
            r2.<init>()
            double r3 = r0.a
            double r5 = r0.b
            r2.v(r3, r5)
            com.google.android.apps.gmm.map.model.location.GmmLocation r0 = r2.d()
            goto L39
        L30:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "The waypoint adjacent to the search waypoint has null latLng"
            defpackage.bvoo.h(r2, r0)
        L37:
            com.google.android.apps.gmm.map.model.location.GmmLocation r0 = r7.I
        L39:
            ilo r2 = r7.p
            akqq r2 = r2.aj()
            bvsl r3 = r7.X
            java.lang.String r0 = defpackage.isl.a(r0, r2, r3)
            r7.M = r0
            java.lang.Boolean r0 = r7.Y()
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L5c
            java.lang.Boolean r0 = r7.P()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5d
        L5c:
            r1 = 1
        L5d:
            if (r2 == r1) goto L62
            java.lang.String r0 = ""
            goto L64
        L62:
            java.lang.String r0 = " · "
        L64:
            java.lang.String r1 = r7.M
            boolean r1 = defpackage.dbsj.d(r1)
            if (r1 != 0) goto L85
            java.lang.String r1 = r7.M
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L7d
            java.lang.String r0 = r0.concat(r1)
            goto L83
        L7d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L83:
            r7.N = r0
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnju.aQ():void");
    }

    private final Boolean aR() {
        return Boolean.valueOf(!Float.isNaN(j().floatValue()));
    }

    private final boolean aS() {
        return V().booleanValue() && this.G.d == amvi.ATTACH_PARKING;
    }

    private final String aT() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        String w = w();
        if (!dbsj.d(w)) {
            arrayList.add(w);
        }
        return dbrz.e(", ").g(arrayList);
    }

    private final boolean aU() {
        return this.ah.a().D(this.p) == bbdt.GOOD_STATE;
    }

    private final boolean aV() {
        return this.e.getEnableFeatureParameters().aJ && this.e.getEnableFeatureParameters().aK;
    }

    @Override // defpackage.jba
    public String A() {
        return this.d.getString(R.string.ACCESSIBILITY_PLACE_CALL, new Object[]{aT()});
    }

    @Override // defpackage.jba
    public cqkl B(cjqm cjqmVar) {
        bmdq bmdqVar = this.au;
        bwrs<ilo> a = bwrs.a(this.p);
        bmdr h = this.av.h();
        h.e(cjqmVar);
        bmdqVar.a(a, h.a());
        return cqkl.a;
    }

    @Override // defpackage.jba
    public cjtd C(cjtd cjtdVar) {
        return this.au.d(cjtdVar, this.p, this.av);
    }

    @Override // defpackage.jba
    public Boolean D() {
        boolean z = false;
        if (!this.p.bc() && !this.p.bd() && !aS()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public String E() {
        return ((cqsh) this.n.f()).a.toString();
    }

    @Override // defpackage.jba
    public String F() {
        String str;
        String g = g();
        if (aS()) {
            if (dbsj.d(g)) {
                return this.d.getString(R.string.ACCESSIBILITY_ADD_PARKING);
            }
            return this.d.getString(R.string.ACCESSIBILITY_ADD_PARKING_LONG, new Object[]{g});
        } else if (V().booleanValue()) {
            if (dbsj.d(g)) {
                return this.d.getString(R.string.ACCESSIBILITY_ADD_STOP);
            }
            return this.d.getString(R.string.ACCESSIBILITY_ADD_STOP_LONG, new Object[]{g});
        } else if (!this.p.ba()) {
            return this.d.getString(R.string.ACCESSIBILITY_DIRECTIONS_TO, new Object[]{aT()});
        } else {
            Activity activity = this.d;
            Object[] objArr = new Object[1];
            ArrayList arrayList = new ArrayList();
            arrayList.add(g());
            ArrayList<String> arrayList2 = new ArrayList();
            for (doph dophVar : this.p.bP().e) {
                for (dooo doooVar : dophVar.d) {
                    for (dpce dpceVar : doooVar.c) {
                        douj doujVar = dpceVar.d;
                        if (doujVar == null) {
                            doujVar = douj.h;
                        }
                        if ((doujVar.a & 4) != 0) {
                            douj doujVar2 = dpceVar.d;
                            if (doujVar2 == null) {
                                doujVar2 = douj.h;
                            }
                            str = doujVar2.e;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            doul doulVar = dpceVar.c;
                            if (doulVar == null) {
                                doulVar = doul.f;
                            }
                            arrayList2.add(doulVar.b);
                        } else {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            for (String str2 : arrayList2) {
                if (!dbsj.d(str2)) {
                    arrayList.add(str2);
                }
            }
            objArr[0] = dbrz.e(", ").g(arrayList);
            return activity.getString(R.string.ACCESSIBILITY_DIRECTIONS_TO, objArr);
        }
    }

    @Override // defpackage.jba
    public cqkl G() {
        if (V().booleanValue()) {
            this.i.a().F(this.p.d(), null);
        } else {
            dwal bZ = dwao.R.bZ();
            dphm bZ2 = dphq.m.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dphq dphqVar = (dphq) bZ2.b;
            dphqVar.c = 2;
            dphqVar.a = 2 | dphqVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwao dwaoVar = (dwao) bZ.b;
            dphq bK = bZ2.bK();
            bK.getClass();
            dwaoVar.e = bK;
            dwaoVar.a |= 1;
            qcw x = qcx.x();
            x.u(this.p.d());
            x.w(bZ.bK());
            this.h.a().m(x.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.jba
    public cqkl H() {
        begj begjVar = new begj();
        begjVar.b(this.p);
        begjVar.I = false;
        begjVar.D = true;
        begjVar.F = true;
        begjVar.n = true;
        begjVar.a = begi.BASE_MAP_POI;
        this.l.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.jba
    public cqkl I() {
        begj begjVar = new begj();
        begjVar.b(this.p);
        begjVar.I = false;
        begjVar.D = true;
        begjVar.F = true;
        begjVar.n = true;
        begjVar.a = begi.SEARCH_LIST_RESULT;
        this.i.a().J(this.p, begjVar);
        return cqkl.a;
    }

    @Override // defpackage.jba
    public Boolean J() {
        boolean z = false;
        if (this.p.cF() || this.p.aP() || (this.p.aM() && !this.p.aN())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public cqtv K() {
        return cqrp.d(this.e.getAdsParameters().l ? 3.0d : 8.0d);
    }

    @Override // defpackage.jba
    public Boolean L() {
        return Boolean.valueOf(this.p.aM());
    }

    @Override // defpackage.jba
    public Boolean M() {
        return Boolean.valueOf(this.p.aN());
    }

    @Override // defpackage.jba
    public Boolean N() {
        return Boolean.valueOf(this.p.cF());
    }

    @Override // defpackage.jba
    public acmv O() {
        if (this.S == null) {
            if (this.e.getAdsParameters().l) {
                String string = this.d.getString(R.string.AD);
                this.d.getResources();
                this.S = acpd.a(string);
            } else {
                String string2 = this.d.getString(R.string.AD);
                int a = dujv.a(this.e.getAdsParameters().b);
                if (a == 0) {
                    a = 1;
                }
                this.S = acpd.b(string2, a, this.d.getResources());
            }
        }
        return this.S;
    }

    @Override // defpackage.jba
    public Boolean P() {
        boolean z = true;
        if (!aO(this.p).booleanValue() && !aS() && this.p.be() != iln.GEOCODE && !this.u.a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    @dzsi
    public bfub Q() {
        return this.R;
    }

    @Override // defpackage.jba
    @dzsi
    public List<bevm> R() {
        return this.U;
    }

    @Override // defpackage.jba
    public Boolean S() {
        boolean z = false;
        if (aS() && this.p.D()) {
            dpzi E = this.p.E();
            dbsk.s(E);
            if ((E.a & 8) != 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public String T() {
        dvxz dvxzVar = this.p.h().s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        String str = dvxzVar.b;
        String g = g();
        if (g != null && g.toLowerCase().contains(str.toLowerCase())) {
            str = null;
        }
        return aN(this.W, str);
    }

    @Override // defpackage.jba
    public String U() {
        return this.K;
    }

    @Override // defpackage.jba
    public Boolean V() {
        return Boolean.valueOf(this.G != null);
    }

    @Override // defpackage.jba
    public Boolean W() {
        return Boolean.valueOf(!this.am.isEmpty());
    }

    @Override // defpackage.jba
    public List<jaz> X() {
        return this.am;
    }

    @Override // defpackage.jba
    public Boolean Y() {
        boolean z = true;
        if (aR().booleanValue() && !this.u.a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public Boolean Z() {
        boolean z = true;
        if (aR().booleanValue() && !dbsj.d(o()) && !this.u.a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    public CharSequence aA() {
        byee al = this.p.al();
        if (al.g(this.f).e()) {
            Activity activity = this.d;
            cqat cqatVar = this.f;
            bydl g = bydm.g(activity.getBaseContext());
            g.b(ibm.I().b(this.d));
            g.c(ibm.M().b(this.d));
            return new bydu(activity, cqatVar, g.a()).a(al);
        }
        return az();
    }

    public boolean aB() {
        return this.E;
    }

    public Boolean aC() {
        boolean z = false;
        if (!this.u.e && this.p.bM() && this.D) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean aD() {
        return Boolean.valueOf(this.A);
    }

    public Float aE() {
        return (Float) this.p.cH().h(bnjq.a).c(Float.valueOf(0.0f));
    }

    @dzsi
    public docg aF() {
        if (this.p.bp()) {
            return this.p.bq();
        }
        return null;
    }

    public cjtd aG() {
        return this.V.a();
    }

    public ilo aH() {
        return this.p;
    }

    public boolean aI() {
        if (ac().booleanValue()) {
            for (View view : cqkx.n(this)) {
                View a = cqhu.a(view, a);
                if (a != null) {
                    this.ah.a().K(a, this.p);
                    return true;
                }
            }
        }
        return false;
    }

    public String aJ() {
        return this.p.cP();
    }

    public bnjs aK() {
        bnjs bnjsVar = new bnjs(this.d, this.e, this.f, this.X, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.o, this.ab, this.ag, this.ah, this.aj, this.ai, this.ak, this.an, this.ao, this.Z, this.ar, this.ap, this.at, this.au, this.p);
        bnjsVar.a = this.s;
        bnjsVar.b = this.t;
        bnjsVar.c = this.I;
        bnjsVar.d = this.x;
        bnjsVar.e = this.y;
        bnjsVar.j = this.A;
        bnjsVar.k = this.B;
        bnjsVar.h = this.C;
        bnjsVar.l = this.G;
        bnjsVar.n = this.O;
        bnjsVar.o = this.u;
        bnjsVar.r = this.ac;
        bnjsVar.c(Boolean.valueOf(this.E));
        bnjsVar.p = this.ad;
        return bnjsVar;
    }

    @Override // defpackage.jba
    public Boolean aa() {
        boolean z = true;
        if (!dbsj.d(t()) && (!V().booleanValue() || !this.G.c())) {
            begh beghVar = this.u;
            if (!beghVar.a && !beghVar.b && !aw().booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public Integer ab() {
        return Integer.valueOf(this.t);
    }

    @Override // defpackage.jba
    public Boolean ac() {
        boolean z = false;
        if (aV() && aU() && !ao().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public cjtd ad() {
        if (!aU() || ao().booleanValue()) {
            return cjtd.b;
        }
        cjta b2 = cjtd.b();
        b2.d = dtyb.bp;
        if (!aV()) {
            b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        this.ah.a().I(this.p, b2);
        return b2.a();
    }

    @Override // defpackage.jba
    public Integer ae() {
        return (Integer) this.p.cH().h(bnjp.a).c(0);
    }

    @Override // defpackage.jba
    public String af() {
        return NumberFormat.getPercentInstance().format(aE());
    }

    @Override // defpackage.jba
    public Boolean ag() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.jba
    public bfkm ah() {
        bfkm bfkmVar = this.ac;
        if (bfkmVar instanceof bfkr) {
            bfkr bfkrVar = (bfkr) bfkmVar;
            dwfl dwflVar = this.ad;
            if (dwflVar != null) {
                bfkrVar.H(dwflVar.g, null, dcdc.f(dwflVar));
            } else {
                bfkrVar.t(this.p);
            }
        }
        return this.ac;
    }

    @Override // defpackage.jba
    public jaz ai() {
        return this.al.c().a();
    }

    @Override // defpackage.jba
    @dzsi
    public cyg aj() {
        return this.af;
    }

    @Override // defpackage.jba
    @dzsi
    public String ak() {
        bikf bikfVar = this.P;
        dbsk.s(bikfVar);
        return bikfVar.a();
    }

    @Override // defpackage.jba
    @dzsi
    public String al() {
        bikf bikfVar = this.P;
        dbsk.s(bikfVar);
        String c2 = bikfVar.c();
        if (!dbsj.d(c2)) {
            String valueOf = String.valueOf(c2);
            return valueOf.length() != 0 ? " · ".concat(valueOf) : new String(" · ");
        }
        return c2;
    }

    @Override // defpackage.jba
    public cjtd am() {
        cjta b2 = cjtd.b();
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = this.p.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b2.s(bZ.bK());
        b2.d = dtyb.br;
        return b2.a();
    }

    @Override // defpackage.jba
    public cjtd an() {
        cjta b2 = cjtd.b();
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = this.p.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b2.s(bZ.bK());
        b2.d = dtyb.bq;
        return b2.a();
    }

    @Override // defpackage.jba
    public Boolean ao() {
        return Boolean.valueOf(this.aq != null);
    }

    @Override // defpackage.jba
    @dzsi
    public bhiq ap() {
        return this.aq;
    }

    @Override // defpackage.jba
    @dzsi
    public aeqj aq() {
        aeqd f = f();
        if (f != null) {
            return f.d();
        }
        return null;
    }

    @Override // defpackage.jba
    public Boolean ar() {
        aeqd f = f();
        boolean z = false;
        if (f != null && f.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public Boolean as() {
        boolean z = false;
        if (this.F && !dbsj.d(this.L)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public CharSequence at() {
        return this.L;
    }

    public void au(ilo iloVar) {
        List<jbi> f;
        String n;
        String string;
        int a;
        List<dngk> list;
        cys cysVar;
        this.S = null;
        this.w = null;
        this.af = null;
        this.U = null;
        this.M = null;
        this.N = null;
        if (!iloVar.aV()) {
            f = Collections.emptyList();
        } else {
            dccx F = dcdc.F();
            for (String str : iloVar.A()) {
                F.g(new bnjr(str));
            }
            f = F.f();
        }
        this.Y = f;
        bmee a2 = this.an.a(iloVar, this.u);
        if (!dbsj.d(a2.d.a())) {
            n = a2.d.a();
        } else if (!dbsj.d(a2.e.a())) {
            n = a2.e.a();
        } else {
            n = a2.b.n();
        }
        int i = a2.c.f;
        if (i > 0) {
            n = a2.a.getString(R.string.NUMBERED_PLACE_TITLE, new Object[]{Integer.valueOf(i), alp.a().b(n)});
        }
        this.J = n;
        this.r = iloVar.bD();
        this.p = iloVar;
        this.n = this.m.a().a(iloVar);
        String bC = iloVar.bC();
        if (!dbsj.d(bC)) {
            this.Q = bC;
        } else {
            this.Q = "";
        }
        ikz ikzVar = iloVar.d;
        cut cD = iloVar.cD();
        if (!iloVar.aM() || ikzVar == null || ikzVar.l == null) {
            if (iloVar.cF() && cD != null) {
                djie djieVar = cD.b;
                if (djieVar == null) {
                    djieVar = djie.k;
                }
                if ((djieVar.a & 32) != 0) {
                    dqmr b2 = ctz.b(cD);
                    cys a3 = this.ag.a();
                    this.af = a3;
                    a3.f(b2);
                }
            }
            this.af = null;
        } else {
            cys a4 = this.ag.a();
            this.af = a4;
            a4.f(ikzVar.l);
            String n2 = iloVar.n();
            String str2 = ikzVar.f;
            if (!dbsj.d(str2) && !dbsj.d(n2) && (cysVar = this.af) != null) {
                cysVar.h(this.d.getString(R.string.WHY_THIS_AD_SPEAKABLE_TEXT, new Object[]{str2, n2}));
            }
        }
        this.P = this.g.a().a(iloVar, this.d);
        if (this.x && iloVar.bV()) {
            this.R = new bfue(iloVar.bU());
        } else {
            this.R = null;
        }
        if (this.o.a().a()) {
            dnjf ad = iloVar.ad();
            if (ad == null || (a = dnje.a(ad.a)) == 0 || a != 2 || ad.b.size() != 1) {
                this.K = aP(iloVar, this.d);
            } else {
                this.U = new ArrayList();
                this.V.g(ad.c);
                if (ad.b.get(0).c.size() <= 6) {
                    list = ad.b.get(0).c;
                } else {
                    list = ad.b.get(0).c.subList(0, 6);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    List<bevm> list2 = this.U;
                    dbsk.s(list2);
                    list2.add(new bevm(list.get(i2), this.d, i2, this.o.a().c(), false, null, ad.c, dtxo.an, dtxo.ap, dtxo.ao));
                }
                this.K = "";
            }
        } else {
            this.K = aP(iloVar, this.d);
            this.U = null;
        }
        if (S().booleanValue()) {
            Activity activity = this.d;
            dpzi E = iloVar.E();
            dbsk.s(E);
            int i3 = E.d;
            if (i3 < TimeUnit.MINUTES.toSeconds(1L)) {
                string = activity.getString(R.string.PARKING_WALKING_TIME_ADDITION_LESS_THAN_ONE);
            } else {
                string = activity.getString(R.string.PARKING_WALKING_TIME_ADDITION_GREATER_THAN_ONE, bvtb.e(activity.getResources(), i3, bvsz.ABBREVIATED));
            }
            this.W = string;
        } else {
            this.W = null;
        }
        this.al.a(iloVar);
        this.am = this.al.b(1);
        if (!this.ao.a(iloVar)) {
            this.aq = null;
        } else {
            bhiy bhiyVar = this.aq;
            if (bhiyVar == null) {
                bhiy a5 = this.ap.a(false);
                this.aq = a5;
                a5.t(bwrs.a(iloVar));
            } else {
                bhiyVar.t(bwrs.a(iloVar));
            }
        }
        if (aU() && !ao().booleanValue() && !iloVar.ai().equals(this.as)) {
            cjqy cjqyVar = this.ar;
            cjsx i4 = cjsy.i();
            i4.b(ddda.eI);
            cjqyVar.k(i4.a());
            this.as = iloVar.ai();
        }
        String a6 = bnhr.a(this.d.getResources(), this.p.h().T);
        if (!a6.isEmpty()) {
            this.L = a6;
        }
    }

    public Boolean av() {
        return Boolean.valueOf(this.D);
    }

    public Boolean aw() {
        return Boolean.valueOf(this.p.ap());
    }

    public Boolean ax() {
        boolean z = false;
        if (!this.u.d && !dbsj.d(this.r)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public String ay() {
        return this.u.d ? "" : this.r;
    }

    public CharSequence az() {
        if (this.w == null) {
            this.w = aL(this.d, this.f, this.p.al());
        }
        return this.w;
    }

    @Override // defpackage.jba
    @dzsi
    public cjtd b() {
        return this.O;
    }

    @Override // defpackage.jba
    public Boolean c() {
        boolean z = false;
        if (!this.u.c) {
            if (this.ad != null) {
                return true;
            }
            if (this.p.bJ() != null && (this.p.bJ().a & 128) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.jba
    public jic d() {
        jic e = e();
        if (e != null) {
            return e;
        }
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        cqtd cqtdVar = this.ae;
        if (cqtdVar == null) {
            cqtdVar = cqrt.f(c[this.t % 3]);
        }
        return new jic((String) null, ckqcVar, cqtdVar, 250);
    }

    @Override // defpackage.jba
    @dzsi
    public jic e() {
        if (!c().booleanValue()) {
            return null;
        }
        dwfl dwflVar = this.ad;
        if (dwflVar != null) {
            return aM(dwflVar);
        }
        return aM(this.p.bJ());
    }

    @Override // defpackage.jba
    @dzsi
    public aeqd f() {
        if (this.aa == null) {
            this.aa = this.Z.a(this.p, null, null);
        }
        if (this.aa.i()) {
            return this.aa;
        }
        return null;
    }

    @Override // defpackage.jba
    public String g() {
        return this.J;
    }

    @Override // defpackage.jba
    public String h() {
        String str = this.p.h().aR;
        if (dbsj.d(str)) {
            if (!this.u.d && !dbsj.d(this.Q)) {
                return this.Q;
            }
            return ax().booleanValue() ? ay() : s();
        }
        return str;
    }

    @Override // defpackage.jba
    @dzsi
    public String i() {
        if (this.E) {
            return null;
        }
        return this.u.d ? "" : this.Q;
    }

    @Override // defpackage.jba
    public Float j() {
        return Float.valueOf(this.p.af());
    }

    @Override // defpackage.jba
    public String k() {
        Float j = j();
        return Float.isNaN(j.floatValue()) ? "" : String.format(Locale.getDefault(), "%.1f", j);
    }

    @Override // defpackage.jba
    public Integer l() {
        return Integer.valueOf(this.p.X());
    }

    @Override // defpackage.jba
    public String m() {
        int X = this.p.X();
        return X > 0 ? this.d.getResources().getQuantityString(true != aR().booleanValue() ? R.plurals.REVIEW_COUNT_LONG : R.plurals.REVIEW_COUNT_SHORT, X, Integer.valueOf(X)) : this.d.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.jba
    @dzsi
    public String n() {
        int X = this.p.X();
        if (!aR().booleanValue() || X <= 0) {
            return null;
        }
        return this.d.getResources().getQuantityString(R.plurals.REVIEW_COUNT_LONG, X, Integer.valueOf(X));
    }

    @Override // defpackage.jba
    public String o() {
        if (c().booleanValue()) {
            return this.p.Y();
        }
        return this.p.Z();
    }

    @Override // defpackage.jba
    public String p() {
        if (dbsj.d(o())) {
            return "";
        }
        String valueOf = String.valueOf(o());
        return valueOf.length() != 0 ? " · ".concat(valueOf) : new String(" · ");
    }

    @Override // defpackage.jba
    public Boolean q() {
        return Boolean.valueOf(this.s != null);
    }

    @Override // defpackage.jba
    public cqkl r(cjqm cjqmVar) {
        bnjt bnjtVar = this.s;
        if (bnjtVar != null) {
            bnjtVar.a(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jba
    public String s() {
        return this.K;
    }

    @Override // defpackage.jba
    public String t() {
        if (this.M == null) {
            aQ();
        }
        return dbsj.e(this.M);
    }

    @Override // defpackage.jba
    public String u() {
        if (this.N == null) {
            aQ();
        }
        return dbsj.e(this.N);
    }

    @Override // defpackage.jba
    public Boolean v() {
        if (this.w == null) {
            this.w = aL(this.d, this.f, this.p.al());
        }
        CharSequence charSequence = this.w;
        dbsk.s(charSequence);
        boolean z = false;
        if (charSequence.length() > 0 && !this.x) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jba
    public String w() {
        dvxz dvxzVar = this.p.h().s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        return dvxzVar.c;
    }

    @Override // defpackage.jba
    public String x() {
        String w = w();
        dvxz dvxzVar = this.p.h().s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        String str = dvxzVar.d;
        if (!dbsj.d(w)) {
            if (dbsj.d(str)) {
                return w;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 2 + String.valueOf(str).length());
            sb.append(w);
            sb.append(", ");
            sb.append(str);
            return sb.toString();
        }
        return dbsj.e(str);
    }

    @Override // defpackage.jba
    public CharSequence y() {
        String str;
        String s = s();
        if (this.u.b || !this.Y.isEmpty()) {
            str = "";
        } else {
            dvxz dvxzVar = this.p.h().s;
            if (dvxzVar == null) {
                dvxzVar = dvxz.h;
            }
            str = dvxzVar.b;
        }
        return this.q.a(aN(s, str)).c();
    }

    @Override // defpackage.jba
    public Boolean z() {
        boolean z = false;
        if (this.v && !dbsj.d(this.p.I())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
