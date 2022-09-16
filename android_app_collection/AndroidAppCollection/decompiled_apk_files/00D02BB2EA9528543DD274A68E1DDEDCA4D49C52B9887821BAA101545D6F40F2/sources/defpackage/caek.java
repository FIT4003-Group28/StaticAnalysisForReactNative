package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: caek  reason: default package */
/* loaded from: classes4.dex */
public class caek implements cagd, caex {
    private static final dcdc<dwkv> j;
    private cafy L;
    private cafy M;
    private cafy N;
    private cafy O;
    @dzsi
    private caen P;
    @dzsi
    private cagg Q;
    @dzsi
    private bzyw R;
    private final boolean S;
    public final dzsj<blpp> a;
    public final dzsj<bsvm> b;
    public final dzsj<caym> c;
    public final bvjj d;
    @dzsi
    String f;
    final caej h;
    @dzsi
    bvxh i;
    private final gn k;
    private final cafi l;
    private final cqqw m;
    private final dzsj<cady> n;
    private final dzsj<cabt> o;
    private final dzsj<caeo> p;
    private final dzsj<caeq> q;
    private final dzsj<caez> r;
    private final Resources s;
    private final bvrb t;
    private final dzsj<cjnx> u;
    private final btrm v;
    private final cabg w;
    private final cbqg x;
    private final cabc y;
    private final chnm z;
    @dzsi
    private String C = null;
    @dzsi
    private String D = null;
    private final List<cadx> B = new ArrayList();
    public final HashMap<String, cadx> e = new HashMap<>();
    private List<dwkv> E = j;
    private final List<blvu> F = new ArrayList();
    private boolean H = true;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private cqtv A = cqrp.d(dcyn.a);
    @dzsi
    private Runnable G = null;
    @dzsi
    String g = null;

    static {
        dwks bZ = dwkv.d.bZ();
        dwku dwkuVar = dwku.LOCATION_HISTORY_PROMO;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwkv dwkvVar = (dwkv) bZ.b;
        dwkvVar.b = dwkuVar.l;
        dwkvVar.a |= 1;
        dwkv bK = bZ.bK();
        dwks bZ2 = dwkv.d.bZ();
        dwku dwkuVar2 = dwku.CONTRIBUTIONS_SHORTCUT_PROMO;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwkv dwkvVar2 = (dwkv) bZ2.b;
        dwkvVar2.b = dwkuVar2.l;
        dwkvVar2.a |= 1;
        dwkv bK2 = bZ2.bK();
        dwks bZ3 = dwkv.d.bZ();
        dwku dwkuVar3 = dwku.UGC_TASK_SET;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwkv dwkvVar3 = (dwkv) bZ3.b;
        dwkvVar3.b = dwkuVar3.l;
        dwkvVar3.a |= 1;
        dwkv bK3 = bZ3.bK();
        dwks bZ4 = dwkv.d.bZ();
        dwku dwkuVar4 = dwku.PHOTO_ENTRY_POINT;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwkv dwkvVar4 = (dwkv) bZ4.b;
        dwkvVar4.b = dwkuVar4.l;
        dwkvVar4.a |= 1;
        dwkv bK4 = bZ4.bK();
        dwks bZ5 = dwkv.d.bZ();
        dwku dwkuVar5 = dwku.RIDDLER_PROMO;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwkv dwkvVar5 = (dwkv) bZ5.b;
        dwkvVar5.b = dwkuVar5.l;
        dwkvVar5.a |= 1;
        dwkv bK5 = bZ5.bK();
        dwks bZ6 = dwkv.d.bZ();
        dwku dwkuVar6 = dwku.ADD_EVENTS_PROMO;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwkv dwkvVar6 = (dwkv) bZ6.b;
        dwkvVar6.b = dwkuVar6.l;
        dwkvVar6.a |= 1;
        dwkv bK6 = bZ6.bK();
        dwks bZ7 = dwkv.d.bZ();
        dwku dwkuVar7 = dwku.SERVICE_AREA_BUSINESS_PROMO;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dwkv dwkvVar7 = (dwkv) bZ7.b;
        dwkvVar7.b = dwkuVar7.l;
        dwkvVar7.a |= 1;
        dwkv bK7 = bZ7.bK();
        dwks bZ8 = dwkv.d.bZ();
        dwku dwkuVar8 = dwku.TODO_LIST_ITEM;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dwkv dwkvVar8 = (dwkv) bZ8.b;
        dwkvVar8.b = dwkuVar8.l;
        dwkvVar8.a |= 1;
        j = dcdc.m(bK, bK2, bK3, bK4, bK5, bK6, bK7, bZ8.bK());
    }

    public caek(dzsj<cady> dzsjVar, dzsj<cabt> dzsjVar2, dzsj<caeo> dzsjVar3, dzsj<caeq> dzsjVar4, dzsj<caez> dzsjVar5, dzsj<blpp> dzsjVar6, dzsj<cjnx> dzsjVar7, dzsj<bsvm> dzsjVar8, dzsj<caym> dzsjVar9, Resources resources, btrm btrmVar, bvrb bvrbVar, bvjj bvjjVar, cabg cabgVar, btvo btvoVar, cbqg cbqgVar, gga ggaVar, cafi cafiVar, chnm chnmVar, cqqw cqqwVar, cabc cabcVar) {
        this.n = dzsjVar;
        this.o = dzsjVar2;
        this.p = dzsjVar3;
        this.q = dzsjVar4;
        this.r = dzsjVar5;
        this.a = dzsjVar6;
        this.b = dzsjVar8;
        this.c = dzsjVar9;
        this.u = dzsjVar7;
        this.s = resources;
        this.t = bvrbVar;
        this.v = btrmVar;
        this.w = cabgVar;
        this.x = cbqgVar;
        this.k = ggaVar.g();
        this.l = cafiVar;
        this.z = chnmVar;
        this.y = cabcVar;
        this.m = cqqwVar;
        this.d = bvjjVar;
        caej caejVar = new caej(this);
        this.h = caejVar;
        dceq a = dcet.a();
        a.b(bqje.class, new caem(0, bqje.class, caejVar, bvrj.UI_THREAD));
        a.b(blpj.class, new caem(1, blpj.class, caejVar, bvrj.UI_THREAD));
        btrmVar.g(caejVar, a.a());
        this.S = btvoVar.getEnableFeatureParameters().bb;
    }

    private final synchronized boolean ag() {
        return this.B.isEmpty();
    }

    private final boolean ah() {
        dehn<Boolean> d = this.u.a().d();
        return !d.isDone() || ((Boolean) deha.s(d)).booleanValue();
    }

    private final boolean ai() {
        return !this.I && ag() && this.H;
    }

    private final boolean aj() {
        return this.I && ag() && this.H;
    }

    public synchronized List<cadx> A() {
        return dcdc.r(this.B);
    }

    @dzsi
    public cafy B() {
        return this.P;
    }

    @dzsi
    public cafy C() {
        if (this.g != null) {
            if (this.N == null) {
                this.N = new cach(cqrt.g(2131231724, irg.a()), ibm.x(), cjtd.a(dtyd.bG), this.s.getString(R.string.ANSWER_QUESTIONS), this.s.getString(R.string.SIMPLE_YES_NO_QUESTIONS), new Runnable(this) { // from class: caed
                    private final caek a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        caek caekVar = this.a;
                        if (caekVar.i != null) {
                            bvxh bvxhVar = caekVar.i;
                            dbsk.s(bvxhVar);
                            caekVar.a.a().j(bvxhVar, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_PREFETCH);
                        } else {
                            String str = caekVar.g;
                            dbsk.s(str);
                            caekVar.a.a().i(str, 1, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_NONPREFETCH);
                        }
                        caekVar.i = null;
                        caekVar.Z();
                    }
                });
            }
            return this.N;
        }
        return null;
    }

    @dzsi
    public cafy D() {
        if (!this.x.a() || ai()) {
            return null;
        }
        if (this.O == null) {
            this.O = new cach(cqrt.g(2131231615, irg.a()), ibm.x(), cjtd.a(dtyd.bn), this.s.getString(R.string.UGC_EVENTS_ADD_EVENT), this.s.getString(R.string.EVENT_CREATION_SUBTITLE_TEXT), new Runnable(this) { // from class: caee
                private final caek a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.a().a();
                }
            });
        }
        return this.O;
    }

    @dzsi
    public cafy E() {
        if (ah() || ai()) {
            return null;
        }
        if (this.M == null) {
            this.M = new cach(cqrt.g(2131232845, irg.a()), ibm.x(), cjtd.a(dtyd.bq), this.s.getString(R.string.GET_SUGGESTIONS), this.s.getString(R.string.MAPS_ACTIVITY_OOBE_TURN_ON_LOCATION_HISTORY), new Runnable(this) { // from class: caeg
                private final caek a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.a().j();
                }
            });
        }
        return this.M;
    }

    @dzsi
    public cafy F() {
        if (this.d.m(bvjk.gP, false) || !this.w.b() || !this.J || this.w.c()) {
            return null;
        }
        if (this.L == null) {
            cqtd f = cqrt.f(R.mipmap.ic_contributions_shortcut);
            cjtd a = cjtd.a(dtyd.bp);
            cjtd a2 = cjtd.a(dtyd.bo);
            String string = this.s.getString(R.string.GET_BACK_HERE_WITH_ONE_TAP);
            String string2 = this.s.getString(R.string.ADD_SHORTCUT_TO_HOME_SCREEN);
            final cabg cabgVar = this.w;
            cabgVar.getClass();
            this.L = new cabu(f, 50.0d, a, a2, string, string2, new Runnable(cabgVar) { // from class: caeh
                private final cabg a;

                {
                    this.a = cabgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            }, new Runnable(this) { // from class: caei
                private final caek a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    caek caekVar = this.a;
                    caekVar.d.S(bvjk.gP, true);
                    caekVar.Z();
                }
            });
        }
        return this.L;
    }

    @dzsi
    public cafy G() {
        if (!this.z.n()) {
            return null;
        }
        return this.o.a();
    }

    public List<cagg> H() {
        ArrayList arrayList = new ArrayList();
        cagg caggVar = this.Q;
        if (caggVar != null) {
            arrayList.add(caggVar);
        }
        return arrayList;
    }

    public void I(String str) {
        this.f = str;
    }

    public void J() {
        this.v.a(this.h);
    }

    public cadx K(dwmk dwmkVar) {
        cady a = this.n.a();
        String str = this.f;
        Activity activity = (Activity) ((dxjd) a.a).a;
        cady.a(activity, 1);
        dzsj<akfa> dzsjVar = a.b;
        bvrb a2 = a.c.a();
        cady.a(a2, 3);
        dzsj<begg> dzsjVar2 = a.d;
        dzsj<anhg> dzsjVar3 = a.e;
        dzsj<bbut> dzsjVar4 = a.f;
        dzsj<bqji> dzsjVar5 = a.g;
        dxio a3 = ((dxjh) a.h).a();
        cady.a(a3, 8);
        anhk a4 = a.i.a();
        cady.a(a4, 9);
        Resources a5 = a.j.a();
        cady.a(a5, 10);
        bunb a6 = a.k.a();
        cady.a(a6, 11);
        bvjj a7 = a.l.a();
        cady.a(a7, 12);
        bzqa a8 = a.m.a();
        cady.a(a8, 13);
        ania a9 = a.n.a();
        cady.a(a9, 14);
        bmdv a10 = a.o.a();
        cady.a(a10, 15);
        cjqy a11 = a.p.a();
        cady.a(a11, 16);
        btvo a12 = a.q.a();
        cady.a(a12, 17);
        cqhn a13 = a.r.a();
        cady.a(a13, 18);
        caga a14 = a.s.a();
        cady.a(a14, 19);
        auhi a15 = a.t.a();
        cady.a(a15, 20);
        aujx a16 = a.u.a();
        cady.a(a16, 21);
        cafz a17 = a.v.a();
        cady.a(a17, 22);
        bbtk a18 = a.w.a();
        cady.a(a18, 23);
        caeb a19 = a.x.a();
        cady.a(a19, 24);
        cpv a20 = a.y.a();
        cady.a(a20, 25);
        cady.a(dwmkVar, 27);
        cady.a(this, 28);
        return new cadx(activity, dzsjVar, a2, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, str, dwmkVar, this);
    }

    public synchronized void L(cadx cadxVar) {
        this.B.add(cadxVar);
        this.e.put(cadxVar.u(), cadxVar);
    }

    public void M(dwrz dwrzVar) {
        if (dwrzVar.a.size() <= 0) {
            this.Q = null;
            return;
        }
        caeq a = this.q.a();
        caes a2 = a.a.a();
        caeq.a(a2, 1);
        Activity activity = (Activity) ((dxjd) a.b).a;
        caeq.a(activity, 2);
        caeq.a(dwrzVar, 3);
        caeq.a(this, 4);
        this.Q = new caep(a2, activity, dwrzVar, this);
    }

    public synchronized void N() {
        this.B.clear();
        this.e.clear();
        this.F.clear();
    }

    public synchronized void O(String str) {
        if (this.e.containsKey(str)) {
            P(this.e.get(str));
        }
    }

    public void P(cadx cadxVar) {
        synchronized (this) {
            Q(cadxVar);
        }
        Z();
    }

    public final synchronized void Q(cadx cadxVar) {
        this.B.remove(cadxVar);
        this.e.remove(cadxVar.u());
    }

    public void R(boolean z) {
        this.H = z;
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        Runnable runnable;
        if (!(cqiwVar instanceof oag) || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
    }

    public void S(boolean z) {
        this.I = z;
    }

    public void T(boolean z) {
        this.J = z;
    }

    public void U(boolean z) {
        this.K = z;
    }

    public void V(Runnable runnable) {
        this.G = runnable;
    }

    public void W(dvlu dvluVar) {
        if (dvluVar.b <= 0) {
            this.P = null;
            return;
        }
        caen caenVar = this.P;
        if (caenVar != null) {
            caenVar.a = dvluVar;
            return;
        }
        caeo a = this.p.a();
        String str = this.f;
        dzsj<cdfx> dzsjVar = a.a;
        dzsj<chnm> dzsjVar2 = a.b;
        Resources a2 = a.c.a();
        caeo.a(a2, 3);
        btvo a3 = a.d.a();
        caeo.a(a3, 4);
        caeo.a(dvluVar, 5);
        this.P = new caen(dzsjVar, dzsjVar2, a2, a3, dvluVar, str);
    }

    public void X(final String str) {
        if (this.g == null) {
            this.g = str;
            this.t.b(new Runnable(this, str) { // from class: caec
                private final caek a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    caek caekVar = this.a;
                    caekVar.i = caekVar.a.a().f(this.b, 1, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_PREFETCH);
                }
            }, bvrj.UI_THREAD);
        }
    }

    public void Y(cqtv cqtvVar) {
        this.A = cqtvVar;
        cqkx.p(this);
    }

    public final void Z() {
        this.t.b(new Runnable(this) { // from class: caef
            private final caek a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        }, bvrj.UI_THREAD);
    }

    public Boolean a() {
        return false;
    }

    public Boolean aa() {
        return false;
    }

    public void ab(List<dwkv> list) {
        if (!list.isEmpty()) {
            this.E = dcdc.r(list);
        }
    }

    public List<dwkv> ac() {
        return this.E;
    }

    @Override // defpackage.cagd
    public boolean ad() {
        return this.E != j;
    }

    public Boolean ae() {
        return Boolean.valueOf(this.S);
    }

    @Override // defpackage.cagd
    public List<cqix<?>> af() {
        cadz cadzVar = new cadz(this);
        List<dwkv> ac = ac();
        cqiv cqivVar = new cqiv();
        cqivVar.a(new cajj(), cadzVar.b);
        if (cadzVar.b.p().booleanValue()) {
            bzxg bzxgVar = new bzxg();
            bzyw q = cadzVar.b.q();
            dbsk.s(q);
            cqivVar.a(bzxgVar, q);
        }
        cqiv cqivVar2 = new cqiv();
        for (dwkv dwkvVar : ac) {
            dwku dwkuVar = dwku.UNKNOWN_COMPONENT;
            dwku b = dwku.b(dwkvVar.b);
            if (b == null) {
                b = dwku.UNKNOWN_COMPONENT;
            }
            switch (b.ordinal()) {
                case 1:
                    if (!cadzVar.c.isEmpty()) {
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (cadzVar.b.B() != null) {
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (!cadzVar.d.isEmpty()) {
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (cadzVar.b.F() != null) {
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (cadzVar.b.E() != null) {
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (cadzVar.b.C() != null) {
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (cadzVar.b.D() != null) {
                        break;
                    } else {
                        continue;
                    }
                case 8:
                default:
                    Object[] objArr = new Object[1];
                    dwku b2 = dwku.b(dwkvVar.b);
                    if (b2 == null) {
                        b2 = dwku.UNKNOWN_COMPONENT;
                    }
                    objArr[0] = b2;
                    bvoo.h("Unsupported ranking component: %s", objArr);
                    continue;
                case 9:
                case 10:
                    if (cadzVar.b.G() != null) {
                        break;
                    } else {
                        continue;
                    }
            }
            if (cadzVar.b.ad()) {
                dwku b3 = dwku.b(dwkvVar.b);
                if (b3 == null) {
                    b3 = dwku.UNKNOWN_COMPONENT;
                }
                if (b3 != dwku.TODO_LIST_ITEM && cadzVar.g) {
                    cadzVar.a(dwkvVar, cqivVar2);
                }
            }
            if (!cqivVar2.a.isEmpty()) {
                cqivVar.a(new carq(), new cacm(cqivVar2.a));
                cqivVar2 = new cqiv();
            }
            dwku b4 = dwku.b(dwkvVar.b);
            if (b4 == null) {
                b4 = dwku.UNKNOWN_COMPONENT;
            }
            int ordinal = b4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 6 && ordinal != 7 && ordinal != 9 && ordinal != 10) {
                            cadzVar.c(cqivVar);
                        }
                    } else if (cadzVar.d.isEmpty() || !cadzVar.d.get(0).d().booleanValue()) {
                        cadzVar.c(cqivVar);
                    } else {
                        cadzVar.e = true;
                    }
                }
                if (cadzVar.b.ad()) {
                    cadzVar.c(cqivVar);
                } else {
                    cadzVar.e = true;
                    if (!cadzVar.f) {
                        cqivVar.c(new casb());
                        cadzVar.f = true;
                    }
                }
            } else {
                cadzVar.e = true;
                cadzVar.b(cqivVar);
            }
            cadzVar.a(dwkvVar, cqivVar);
        }
        if (!cqivVar2.a.isEmpty()) {
            cqivVar.a(new carq(), new cacm(cqivVar2.a));
        }
        cadzVar.b(cqivVar);
        if (cadzVar.b.b().booleanValue()) {
            cqivVar.c(new oag());
        }
        return cqivVar.a;
    }

    @Override // defpackage.cafe
    public Boolean b() {
        boolean z = false;
        if (this.H && !this.I) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    @dzsi
    public cjyo c() {
        return null;
    }

    @Override // defpackage.cagd
    public Boolean d() {
        return Boolean.valueOf(!ag());
    }

    @Override // defpackage.cafe
    public dkcp e() {
        return dkcp.CONTRIBUTE;
    }

    @Override // defpackage.cagd
    public Boolean g() {
        boolean z = false;
        if (ag() && !this.H) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    public cqqw h() {
        return this.m;
    }

    @Override // defpackage.cagd
    public Boolean i() {
        boolean z = false;
        if (aj() && ah()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    public cqtv j() {
        return this.A;
    }

    @Override // defpackage.cafe
    public Boolean k() {
        return false;
    }

    @Override // defpackage.cagd
    public Boolean l() {
        boolean z = false;
        if (y().isEmpty() || ai()) {
            return false;
        }
        if (!aj() || ah()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    public Boolean m() {
        return false;
    }

    @Override // defpackage.cafe
    @dzsi
    public cafd n() {
        return null;
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw o() {
        return null;
    }

    @Override // defpackage.cafe
    public Boolean p() {
        boolean z = false;
        if (this.l.q() && this.y.equals(cabc.AS_PUBLIC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw q() {
        if (p().booleanValue()) {
            if (this.R == null) {
                this.R = this.r.a().a(this);
            }
            return this.R;
        }
        return null;
    }

    @Override // defpackage.caex
    public void r() {
        this.k.e();
    }

    @Override // defpackage.cafe
    public Boolean s() {
        return false;
    }

    @Override // defpackage.cafe
    public cjtd t() {
        return cjtd.a(dtyd.bm);
    }

    @Override // defpackage.cafe
    @dzsi
    public cbro u() {
        return null;
    }

    @Override // defpackage.cagd
    public Boolean v() {
        return Boolean.valueOf(!this.K);
    }

    public void w(@dzsi String str) {
        this.C = str;
    }

    public void x(@dzsi String str) {
        this.D = str;
    }

    @Override // defpackage.cagd
    public String y() {
        String str = this.C;
        return str != null ? str : this.s.getString(R.string.SUGGESTED_PLACES_TO_REVIEW);
    }

    @Override // defpackage.cagd
    public String z() {
        String str = this.D;
        return str != null ? str : this.s.getString(R.string.PLACES_FROM_LOCATION_HISTORY);
    }
}
