package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wsc  reason: default package */
/* loaded from: classes7.dex */
public class wsc implements wpu {
    private static final dcqe A = dcqe.c("wsc");
    private static final long B = TimeUnit.HOURS.toMillis(1);
    private static final wqn C = new wqn(Collections.emptySet(), Collections.emptyList());
    private static final dcdc<aegg> D = dcdc.h(aegg.b, zut.a, aegg.c);
    public static final /* synthetic */ int z = 0;
    private final eeu E;
    private final jmn F;
    private final vtn G;
    private final wqj H;
    private final wkf I;
    private final btvo J;
    private final xiy K;
    private final xib L;
    private final befw M;
    private final cjbq N;
    @dzsi
    private final dnqh O;
    private final Boolean P;
    @dzsi
    private final akqi Q;
    private String R;
    @dzsi
    private String S;
    @dzsi
    private qdi V;
    @dzsi
    private wqh W;
    public final boolean a;
    @dzsi
    private dopk ac;
    private final cjbh ad;
    private final jam af;
    private final jam ag;
    private final cqba ah;
    @dzsi
    private final wij ai;
    private final wry aj;
    public final wro b;
    @dzsi
    public ckcq c;
    public final Context d;
    public final Activity e;
    public final btrm f;
    public final xcs g;
    public final dxio<qbt> h;
    public final ivf i;
    public final akqi j;
    public final wrc k;
    public wqn m;
    public final wqq n;
    @dzsi
    public cryz<dopk> u;
    @dzsi
    public final bxbd v;
    @dzsi
    public final dro w;
    @dzsi
    public akqq x;
    public ilo y;
    public cjtd l = cjtd.b;
    @dzsi
    private xiv U = null;
    @dzsi
    private acrm X = null;
    @dzsi
    private dvvo Y = null;
    public ckkl o = ckkl.NOT_LOADED;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    private boolean Z = true;
    private boolean aa = false;
    public boolean t = false;
    private boolean ab = false;
    private final cqaw ae = new wrw(this);

    public wsc(Activity activity, eeu eeuVar, ivg ivgVar, cqhn cqhnVar, btrm btrmVar, ckcw ckcwVar, xcs xcsVar, cqba cqbaVar, jmn jmnVar, dxio dxioVar, vtn vtnVar, wqj wqjVar, wqr wqrVar, wkg wkgVar, btvo btvoVar, xiy xiyVar, wrc wrcVar, xib xibVar, befw befwVar, cjbh cjbhVar, cjbt cjbtVar, wrp wrpVar, akqi akqiVar, akqi akqiVar2, List list, qdi qdiVar, String str, boolean z2, bxbd bxbdVar, dro droVar, wij wijVar, dnqh dnqhVar) {
        this.V = null;
        wry wryVar = new wry(this);
        this.aj = wryVar;
        this.af = new wrz(this);
        this.ag = new wsa(this);
        dbsk.s(activity);
        this.d = activity;
        dbsk.s(activity);
        this.e = activity;
        dbsk.s(eeuVar);
        this.E = eeuVar;
        dbsk.s(cqhnVar);
        this.f = btrmVar;
        this.g = xcsVar;
        this.ah = cqbaVar;
        this.F = jmnVar;
        dbsk.s(dxioVar);
        this.h = dxioVar;
        dbsk.s(vtnVar);
        this.G = vtnVar;
        this.i = ivgVar.a(this);
        dbsk.s(wqjVar);
        this.H = wqjVar;
        this.k = wrcVar;
        this.L = xibVar;
        this.Q = akqiVar2;
        this.I = wkgVar.a(akqiVar, list);
        this.J = btvoVar;
        dbsk.s(xiyVar);
        this.K = xiyVar;
        this.M = befwVar;
        this.c = ((ckcr) ckcwVar.a(ckkm.b)).a();
        this.V = qdiVar;
        this.j = akqiVar;
        this.R = str;
        ily ilyVar = new ily();
        ilyVar.f = false;
        ilyVar.D();
        ilyVar.j(akqiVar);
        ilyVar.o(true);
        ilyVar.j = true;
        ilyVar.F(str);
        ilo d = ilyVar.d();
        this.y = d;
        Activity activity2 = (Activity) ((dxjd) wrpVar.a).a;
        wrp.a(activity2, 1);
        dxio a = ((dxjh) wrpVar.b).a();
        wrp.a(a, 2);
        begg a2 = wrpVar.c.a();
        wrp.a(a2, 3);
        axwy a3 = wrpVar.d.a();
        wrp.a(a3, 4);
        dxio a4 = ((dxjh) wrpVar.e).a();
        wrp.a(a4, 5);
        vtn a5 = wrpVar.f.a();
        wrp.a(a5, 6);
        btvo a6 = wrpVar.g.a();
        wrp.a(a6, 7);
        axyp a7 = wrpVar.h.a();
        wrp.a(a7, 8);
        wrp.a(d, 9);
        wrp.a(akqiVar, 10);
        wrp.a(str, 11);
        this.b = new wro(activity2, a, a2, a3, a4, a5, a6, a7, d, akqiVar, str, z2);
        this.v = bxbdVar;
        this.w = droVar;
        this.ai = wijVar;
        this.O = dnqhVar;
        this.m = C;
        this.a = btvoVar.getTransitPagesParameters().g;
        Application a8 = wqrVar.a.a();
        wqr.a(a8, 1);
        eeu a9 = wqrVar.b.a();
        wqr.a(a9, 2);
        wqr.a(wqrVar.c.a(), 3);
        vtn a10 = wqrVar.d.a();
        wqr.a(a10, 4);
        cpv a11 = wqrVar.e.a();
        wqr.a(a11, 5);
        this.n = new wqq(a8, a9, a10, a11, wryVar);
        this.P = Boolean.valueOf(btvoVar.getTransitPagesParameters().f);
        this.ad = cjbhVar;
        this.N = cjbtVar.a(new cjbr(this) { // from class: wrq
            private final wsc a;

            {
                this.a = this;
            }

            @Override // defpackage.cjbr
            public final didr a() {
                return this.a.S();
            }
        }, new dbty(this) { // from class: wrr
            private final wsc a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.R();
            }
        });
    }

    private final void V() {
        cryz<dopk> cryzVar = this.u;
        if (cryzVar != null) {
            cryzVar.c();
            this.u = null;
        }
    }

    private final void W(@dzsi akqq akqqVar) {
        akqq akqqVar2 = this.x;
        if (akqqVar2 == null || !akqqVar2.equals(akqqVar)) {
            if (akqqVar != null) {
                this.x = akqqVar;
                ily g = this.y.g();
                g.q(akqqVar);
                ilo d = g.d();
                this.y = d;
                this.b.b(d);
                cqkx.p(this);
            }
            befu p = befv.p();
            p.j(bwrs.a(this.y));
            ((befp) p).a = this.O;
            this.M.f(new wrx(this, akqqVar), p.m());
        }
    }

    @Override // defpackage.wpu
    public ehz B() {
        return new ehz();
    }

    @Override // defpackage.wpu
    public Boolean C() {
        return Boolean.valueOf(this.J.getTransitPagesParameters().F);
    }

    @Override // defpackage.wpu
    public cjbq D() {
        return this.N;
    }

    @Override // defpackage.wpu
    public Boolean E() {
        boolean z2 = false;
        if (!n().booleanValue() && !this.b.a().isEmpty()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.wpu
    public wpt F() {
        return this.b;
    }

    public void G(@dzsi dopk dopkVar) {
        V();
        if (dopkVar != null) {
            this.c = null;
            J(dopkVar, null, false);
            cqkx.p(this);
        }
    }

    public void H() {
        if (this.a) {
            wrc wrcVar = this.k;
            wrcVar.b.d().i(wrcVar.g);
            wrcVar.d.m(5);
            this.k.a(r(), false);
        }
        this.ah.a(this.ae);
    }

    public final void I(boolean z2) {
        wsp wspVar = this.n.e;
        V();
        this.u = new cryz<>(new wsb(this, wspVar.f()));
        wkf wkfVar = this.I;
        Set<akqi> e = wspVar.e();
        cryz<dopk> cryzVar = this.u;
        dbsk.s(cryzVar);
        wkfVar.c(wkfVar.b(e, null, false, z2, true), cryzVar);
    }

    public final void J(dopk dopkVar, @dzsi Set<qdi> set, boolean z2) {
        this.o = U(ckkl.LOADED_STATION);
        albv.f(this.G, dopkVar);
        this.R = dopkVar.b;
        this.S = dopkVar.c;
        if (this.r) {
            this.k.d(dopkVar);
        }
        dcen N = dcep.N();
        for (doph dophVar : dopkVar.e) {
            for (dooo doooVar : dophVar.d) {
                N.b(qdi.b(doooVar));
            }
        }
        this.m = new wqn(N.f(), dcdc.e());
        qdi qdiVar = this.V;
        wqq wqqVar = this.n;
        dsrj<doph> dsrjVar = dopkVar.e;
        Context context = wqqVar.b;
        vtn vtnVar = wqqVar.c;
        cqkn<wpo> cqknVar = wqqVar.i;
        HashSet hashSet = new HashSet();
        dccx F = dcdc.F();
        int i = 0;
        for (doph dophVar2 : dsrjVar) {
            jhk jhkVar = (jhk) dcft.r(xkg.e(dophVar2), null);
            int i2 = i;
            for (dooo doooVar2 : dophVar2.d) {
                if (hashSet.add(qdi.b(doooVar2))) {
                    dccx dccxVar = F;
                    cqkn<wpo> cqknVar2 = cqknVar;
                    dccxVar.g(new wqs(context, new zsf(vtnVar, doooVar2.c, jhkVar, null, null, akqi.b(doooVar2.b), null, cjtd.b), dopkVar, akqi.b(doooVar2.b), i2, cqknVar2));
                    i2++;
                    cqknVar = cqknVar2;
                    F = dccxVar;
                    hashSet = hashSet;
                    vtnVar = vtnVar;
                }
            }
            i = i2;
        }
        wqqVar.f = dcdc.r(F.f());
        wqqVar.g = dcdc.r(wqqVar.f);
        wqqVar.e.d();
        if (qdiVar != null) {
            for (wqs wqsVar : wqqVar.f) {
                if (wqsVar.a.equals(qdiVar)) {
                    wqqVar.e.b(wqsVar.b, wqsVar.a);
                    break;
                }
            }
        }
        wqqVar.f();
        wqqVar.h();
        wqqVar.h = wse.a(dopkVar);
        this.V = null;
        this.Z = !this.n.a().isEmpty();
        N(dopkVar, set == null ? this.n.e.f() : set, z2);
        dcep<dozz> t = xkg.t(dopkVar);
        if (t.isEmpty()) {
            this.U = null;
        } else {
            this.U = this.K.a(dcdc.r(GmmNotice.g(t)), this.R, cjtd.a(dtyc.eF));
        }
        this.l = wse.a(dopkVar);
        this.q = true;
        this.ac = dopkVar;
        dnoh dnohVar = dopkVar.g;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        W(akqq.e(dnohVar));
        this.b.c(dopkVar);
    }

    public boolean K(dvvo dvvoVar) {
        if (!this.P.booleanValue() || (dvvoVar.a & 2) == 0) {
            if (this.X == null) {
                return false;
            }
            this.Y = null;
            this.X = null;
            return true;
        }
        if (this.X == null) {
            this.X = new acrm(this.d);
        }
        this.Y = dvvoVar;
        acrm acrmVar = this.X;
        dvvs dvvsVar = dvvoVar.d;
        if (dvvsVar == null) {
            dvvsVar = dvvs.g;
        }
        acrmVar.d(dvvsVar, true, dvvoVar.c);
        return true;
    }

    public void L() {
        this.r = true;
        dopk dopkVar = this.ac;
        if (dopkVar != null && (dopkVar.a & 8) != 0) {
            this.k.d(dopkVar);
            return;
        }
        akqq akqqVar = this.x;
        if (akqqVar == null) {
            return;
        }
        this.k.e(this.j, akqqVar);
    }

    public void M(boolean z2) {
        if (z2 != this.aa) {
            this.aa = z2;
            cqkx.p(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    public final void N(dopk dopkVar, Set<qdi> set, boolean z2) {
        int i;
        doom doomVar;
        int i2;
        xmw xmwVar;
        dopk dopkVar2 = dopkVar;
        if (!this.Z) {
            this.m = C;
            return;
        }
        ArrayList arrayList = new ArrayList();
        wqj wqjVar = this.H;
        wqn wqnVar = this.m;
        akqi akqiVar = this.Q;
        wqi wqiVar = new wqi();
        wqi wqiVar2 = new wqi();
        Iterator<doom> it = dopkVar2.f.iterator();
        while (it.hasNext()) {
            doom next = it.next();
            List<jhk> d = xkg.d(next);
            jhk jhkVar = d.size() == 1 ? d.get(0) : null;
            List<jhk> f = xkg.f(next);
            jhk jhkVar2 = f.size() == 1 ? f.get(0) : null;
            wqiVar.a = Long.MAX_VALUE;
            wqiVar.b = Long.MIN_VALUE;
            wqiVar.c = 0;
            for (dooo doooVar : next.c) {
                akqi b = akqi.b(xkg.w(dopkVar2, doooVar));
                String v = xkg.v(dopkVar2, doooVar);
                dooj b2 = dooj.b(next.f);
                if (b2 == null) {
                    b2 = dooj.UNKNOWN;
                }
                dooj doojVar = b2;
                zsf zsfVar = new zsf(wqjVar.b, doooVar.c, jhkVar, jhkVar2, null, akqi.b(doooVar.b), null, cjtd.b);
                zvb e = zsfVar.e();
                if (e != null) {
                    qdi a = qdi.a(e.c());
                    if (set == null || set.contains(a)) {
                        if ((doooVar.a & 2) == 0) {
                            Iterator<dpce> it2 = doooVar.c.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = -12417548;
                                    break;
                                }
                                dpce next2 = it2.next();
                                doul doulVar = next2.c;
                                if (doulVar == null) {
                                    doulVar = doul.f;
                                }
                                if ((doulVar.a & 4) != 0) {
                                    doul doulVar2 = next2.c;
                                    if (doulVar2 == null) {
                                        doulVar2 = doul.f;
                                    }
                                    i = bzlw.a(doulVar2.d);
                                }
                            }
                        } else {
                            i = doooVar.d | (-16777216);
                        }
                        int i3 = i == -1 ? -12417548 : i;
                        Iterator<doog> it3 = doooVar.e.iterator();
                        while (it3.hasNext()) {
                            doog next3 = it3.next();
                            for (dood doodVar : xkg.r(wqjVar.a, next3)) {
                                if (dopkVar2.s.size() > 0) {
                                    xmv g = xmw.g();
                                    g.b(i3);
                                    drhd drhdVar = doodVar.k;
                                    if (drhdVar == null) {
                                        drhdVar = drhd.c;
                                    }
                                    doomVar = next;
                                    xms xmsVar = (xms) g;
                                    xmsVar.a = wqj.b(drhdVar, dopkVar2);
                                    drhd drhdVar2 = doodVar.k;
                                    if (drhdVar2 == null) {
                                        drhdVar2 = drhd.c;
                                    }
                                    xmsVar.b = wqj.a(drhdVar2, dopkVar2);
                                    drhd drhdVar3 = doodVar.l;
                                    if (drhdVar3 == null) {
                                        drhdVar3 = drhd.c;
                                    }
                                    xmsVar.c = wqj.b(drhdVar3, dopkVar2);
                                    drhd drhdVar4 = doodVar.l;
                                    if (drhdVar4 == null) {
                                        drhdVar4 = drhd.c;
                                    }
                                    xmsVar.d = wqj.a(drhdVar4, dopkVar2);
                                    xmwVar = g.a();
                                    i2 = i3;
                                } else {
                                    doomVar = next;
                                    if (wqnVar != null) {
                                        i2 = i3;
                                        final int X = wsl.X(zsfVar.f(), next3.b, b, doodVar.b == 1 ? (dooa) doodVar.c : dooa.m);
                                        dbsg m = dcft.m(wqnVar.b, new dbsl(X) { // from class: wql
                                            private final int a;

                                            {
                                                this.a = X;
                                            }

                                            @Override // defpackage.dbsl
                                            public final boolean a(Object obj) {
                                                return ((wpv) obj).A() == this.a;
                                            }
                                        });
                                        if (m.a()) {
                                            xmwVar = ((wpv) m.b()).P();
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                    xmwVar = null;
                                }
                                wsm wsmVar = wqjVar.c;
                                dnoh dnohVar = dopkVar2.g;
                                if (dnohVar == null) {
                                    dnohVar = dnoh.d;
                                }
                                wqi wqiVar3 = wqiVar2;
                                akqi akqiVar2 = b;
                                doom doomVar2 = doomVar;
                                doog doogVar = next3;
                                int i4 = i2;
                                wqj wqjVar2 = wqjVar;
                                wqi wqiVar4 = wqiVar;
                                akqi akqiVar3 = akqiVar;
                                arrayList.add(wsmVar.a(b, v, dnohVar, akqiVar, doojVar, zsfVar, dool.LONG, next3.b, Long.valueOf(dopkVar2.o), wsk.RELEVANCY_FROM_ANCHOR_TIME, Collections.singletonList(doodVar), akqiVar == null ? dtyc.eO : dtyc.cA, akqiVar == null ? dtyc.eQ : dtyc.cz, null, arrayList.size(), xmwVar, true, true, xkg.u(dopkVar)));
                                dooa dooaVar = doodVar.b == 1 ? (dooa) doodVar.c : dooa.m;
                                dgaw dgawVar = dooaVar.c;
                                if (dgawVar == null) {
                                    dgawVar = dgaw.g;
                                }
                                long j = dgawVar.b;
                                wqiVar4.a = Math.min(wqiVar4.a, j);
                                wqiVar4.b = Math.max(wqiVar4.b, j);
                                wqiVar4.c++;
                                wqiVar4.d = 1 == ((dooaVar.a & 1) | (wqiVar4.d ? 1 : 0));
                                dopkVar2 = dopkVar;
                                wqiVar = wqiVar4;
                                i3 = i4;
                                next = doomVar2;
                                b = akqiVar2;
                                next3 = doogVar;
                                wqiVar2 = wqiVar3;
                                wqjVar = wqjVar2;
                                akqiVar = akqiVar3;
                            }
                            dopkVar2 = dopkVar;
                        }
                    }
                }
                dopkVar2 = dopkVar;
            }
            wqj wqjVar3 = wqjVar;
            wqi wqiVar5 = wqiVar2;
            wqi wqiVar6 = wqiVar;
            akqi akqiVar4 = akqiVar;
            wqiVar5.a = Math.min(wqiVar5.a, wqiVar6.a);
            int i5 = wqiVar5.c;
            int i6 = wqiVar6.c;
            wqiVar5.b = i5 == i6 ? Math.min(wqiVar5.b, wqiVar6.b) : i5 > i6 ? wqiVar5.b : wqiVar6.b;
            wqiVar5.c = Math.max(wqiVar5.c, wqiVar6.c);
            wqiVar5.d |= wqiVar6.d;
            wqiVar2 = wqiVar5;
            wqiVar = wqiVar6;
            wqjVar = wqjVar3;
            akqiVar = akqiVar4;
            dopkVar2 = dopkVar;
        }
        wqi wqiVar7 = wqiVar2;
        wso.a(arrayList);
        eapd b3 = vxs.b(wqiVar7.b);
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            eapr ab = ((wpv) arrayList.get(i7)).ab();
            if (ab != null && ab.w(b3)) {
                arrayList.subList(i7, arrayList.size()).clear();
                break;
            }
            i7++;
        }
        arrayList.size();
        this.W = new wqh(wqiVar7);
        wqn wqnVar2 = this.m;
        ArrayList arrayList2 = arrayList;
        if (wqnVar2.a(set)) {
            wpv wpvVar = (wpv) dcft.r(wqnVar2.b(set), null);
            final eapr eapdVar = (wpvVar == null || !wpvVar.ad().booleanValue()) ? new eapd(0L) : wpvVar.ab() == null ? new eapd(0L) : wpvVar.ab();
            arrayList2 = dcft.i(arrayList, new dbsl(eapdVar) { // from class: wqm
                private final eapr a;

                {
                    this.a = eapdVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    eapr eaprVar = this.a;
                    eapr ab2 = ((wpv) obj).ab();
                    return ab2 == null || !ab2.x(eaprVar);
                }
            });
        }
        this.m = new wqn(set, arrayList2);
        if (!this.a) {
            return;
        }
        this.ab |= this.k.a(r(), z2);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.x = false;
        a.d = ibq.E();
        a.a = this.R;
        a.f(this.F);
        String str = this.S;
        if (str != null) {
            a.b = str;
        }
        a.q = cqta.f();
        if (!this.aa) {
            a.e = vos.c();
            return a.b();
        }
        if (this.Q == null) {
            if (this.Y != null) {
                String string = this.d.getString(R.string.TRANSIT_STATION_BUSYNESS_ACTION_MENU_ITEM);
                jhm a2 = jhm.a();
                a2.a = string;
                a2.d(new View.OnClickListener(this) { // from class: wrv
                    private final wsc a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                    }
                });
                a2.c = cqrt.g(2131232829, ibm.p());
                a2.h = 0;
                a.c(a2.c());
            }
            final wro wroVar = this.b;
            ArrayList arrayList = new ArrayList();
            if (wroVar.d) {
                String string2 = wroVar.a.getString(R.string.TRANSIT_STATION_MORE_INFO_ACTION_MENU_ITEM);
                String string3 = wroVar.a.getString(R.string.TRANSIT_STATION_MORE_INFO_MENU_ITEM, wroVar.f);
                jhm a3 = jhm.a();
                a3.a = string2;
                a3.b = string3;
                a3.d(new View.OnClickListener(wroVar) { // from class: wrf
                    private final wro a;

                    {
                        this.a = wroVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.i();
                    }
                });
                a3.c = cqrt.i(vyt.j, ibm.p());
                a3.h = 0;
                a3.f = cjqg.o(wroVar.h, dtyc.fa);
                arrayList.add(a3.c());
            }
            String string4 = wroVar.a.getString(R.string.TRANSIT_STATION_DIRECTIONS_ACTION_MENU_ITEM);
            String string5 = wroVar.a.getString(R.string.TRANSIT_STATION_DIRECTIONS_MENU_ITEM, wroVar.f);
            jhm a4 = jhm.a();
            a4.a = string4;
            a4.b = string5;
            a4.d(new View.OnClickListener(wroVar) { // from class: wrd
                private final wro a;

                {
                    this.a = wroVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.h();
                }
            });
            a4.c = cqrt.i(vyt.i, ibm.p());
            a4.h = 0;
            a4.f = cjqg.o(wroVar.h, dtyc.eU);
            arrayList.add(a4.c());
            if (wroVar.d && wroVar.b.getTransitPagesParameters().u && wroVar.g.aj() != null) {
                axyo a5 = wroVar.c.a(wroVar.g);
                CharSequence a6 = a5.e().a(wroVar.a);
                cqsn f = a5.f();
                Context context = wroVar.a;
                CharSequence charSequence = ((cqsh) f).a;
                jhm a7 = jhm.a();
                a7.a = a6;
                a7.b = charSequence;
                a7.d(new View.OnClickListener(wroVar) { // from class: wre
                    private final wro a;

                    {
                        this.a = wroVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.j();
                    }
                });
                a7.c = cqrt.i(a5.c(), ibm.p());
                a7.h = 0;
                a7.f = cjqg.o(wroVar.h, dtyc.fe);
                arrayList.add(a7.c());
            }
            if (wroVar.e() && wroVar.f()) {
                String string6 = wroVar.a.getString(R.string.TRANSIT_STATION_CREATE_SHORTCUT_ACTION_MENU_ITEM);
                String string7 = wroVar.a.getString(R.string.TRANSIT_STATION_CREATE_SHORTCUT_MENU_ITEM, wroVar.f);
                jhm a8 = jhm.a();
                a8.a = string6;
                a8.b = string7;
                a8.d(new View.OnClickListener(wroVar) { // from class: wrh
                    private final wro a;

                    {
                        this.a = wroVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                    }
                });
                a8.c = cqrt.i(vyt.l, ibm.p());
                a8.h = 0;
                a8.f = cjqg.o(wroVar.h, dtyc.eM);
                arrayList.add(a8.c());
            }
            if (wroVar.d()) {
                String string8 = wroVar.a.getString(R.string.TRANSIT_STATION_SCHEMATIC_MAP_ACTION_MENU_ITEM);
                String string9 = wroVar.a.getString(R.string.TRANSIT_STATION_SCHEMATIC_MAP_MENU_ITEM, wroVar.f);
                jhm a9 = jhm.a();
                a9.a = string8;
                a9.b = string9;
                a9.d(new View.OnClickListener(wroVar) { // from class: wrg
                    private final wro a;

                    {
                        this.a = wroVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.g();
                    }
                });
                a9.c = cqrt.i(vyt.k, ibm.p());
                a9.h = 0;
                a9.f = cjqg.o(wroVar.h, dtyc.fg);
                arrayList.add(a9.c());
            }
            a.d(arrayList);
        }
        return a.b();
    }

    public ckkl O() {
        return this.o;
    }

    @Override // defpackage.wpu
    /* renamed from: P */
    public dcdc<aegg> A() {
        return D;
    }

    public void Q() {
        if (this.p) {
            this.f.b(pfp.b(this.y));
        }
        V();
        wrc wrcVar = this.k;
        for (akte akteVar : wrcVar.h.K()) {
            wrcVar.b.c().a(akteVar);
        }
        wrcVar.h.p();
        for (aktd aktdVar : wrcVar.k.values()) {
            wrcVar.b.d().e(aktdVar);
        }
        wrcVar.i.p();
        wrcVar.k.clear();
        wrcVar.j.p();
        wrcVar.c.e();
        if (wrcVar.d.i()) {
            wrcVar.d.j();
        }
        wsu wsuVar = wrcVar.e;
        for (int i = 0; i < wsuVar.c.size(); i++) {
            akvz e = wsuVar.a.e();
            SparseArray<aktg> sparseArray = wsuVar.c;
            e.j(sparseArray.get(sparseArray.keyAt(i)));
        }
        wsuVar.c.clear();
        wst wstVar = wrcVar.f;
        wstVar.b = null;
        wstVar.c.clear();
        wstVar.a();
        wrcVar.b.d().j(wrcVar.g);
        this.ah.h(this.ae);
    }

    public Boolean R() {
        boolean z2 = false;
        if (v().booleanValue() && this.ad.a() && this.ac != null) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public didr S() {
        ddxx c;
        dido bZ = didr.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didr didrVar = (didr) bZ.b;
        didrVar.c = 1;
        didrVar.a |= 2;
        didt bZ2 = didu.d.bZ();
        String str = this.R;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        didu diduVar = (didu) bZ2.b;
        str.getClass();
        diduVar.a |= 1;
        diduVar.b = str;
        String o = this.j.o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        didu diduVar2 = (didu) bZ2.b;
        o.getClass();
        diduVar2.a |= 2;
        diduVar2.c = o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didr didrVar2 = (didr) bZ.b;
        didu bK = bZ2.bK();
        bK.getClass();
        didrVar2.d = bK;
        didrVar2.a |= 4;
        dcbg s = dcbg.b(this.n.e.e()).s(wru.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didr didrVar3 = (didr) bZ.b;
        didrVar3.b();
        dsod.bv(s, didrVar3.e);
        dopk dopkVar = this.ac;
        if (dopkVar != null && (c = cjrx.c(dopkVar.n)) != null) {
            ddxz ddxzVar = c.i;
            if (ddxzVar == null) {
                ddxzVar = ddxz.d;
            }
            String b = cjra.b(ddxzVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            didr didrVar4 = (didr) bZ.b;
            b.getClass();
            didrVar4.a = 1 | didrVar4.a;
            didrVar4.b = b;
        }
        return bZ.bK();
    }

    public void T(Throwable th) {
        this.c = null;
        if (!(th instanceof qdr)) {
            this.s = true;
            bxbd bxbdVar = this.v;
            if (bxbdVar != null) {
                bxbdVar.l(null);
            }
        } else {
            W(null);
        }
        this.o = U(ckkl.FAILED_TO_LOAD_STATION);
        this.u = null;
        cqkx.p(this);
    }

    public final ckkl U(ckkl ckklVar) {
        ckkl ckklVar2 = ckkl.NOT_LOADED;
        int ordinal = this.o.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ckklVar.equals(ckkl.NOT_LOADED) ? ckkl.FAILED_TO_LOAD_STATION : ckklVar;
            } else if (ordinal == 2) {
                return ckkl.LOADED_STATION;
            } else {
                bvoo.h("Invalid state transition.", new Object[0]);
                return ckkl.NOT_LOADED;
            }
        }
        return ckklVar;
    }

    @Override // defpackage.izy
    public cqkl b() {
        if (this.E.b() && !g().booleanValue()) {
            if (!this.q) {
                V();
                cryz<dopk> cryzVar = new cryz<>(new wsb(this));
                this.u = cryzVar;
                this.I.a(null, this.a, true, cryzVar);
            } else {
                I(this.ab);
            }
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.i.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.i.c();
    }

    @Override // defpackage.izy
    public long e() {
        wqh wqhVar = this.W;
        if (wqhVar == null) {
            return B;
        }
        if (!this.a || !this.k.d.c()) {
            if (wqhVar.c) {
                return TimeUnit.SECONDS.toMillis(this.J.getTransitPagesParameters().a);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = wqhVar.a.a;
            long j2 = B;
            return (j <= currentTimeMillis + j2 && wqhVar.b.a >= currentTimeMillis - j2) ? TimeUnit.SECONDS.toMillis(this.J.getTransitPagesParameters().a) : j2;
        }
        return TimeUnit.SECONDS.toMillis(this.J.getTransitPagesParameters().b);
    }

    @Override // defpackage.wpu
    public Boolean f() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.wpu
    public Boolean g() {
        return Boolean.valueOf(this.I.d());
    }

    @Override // defpackage.wpu
    public Boolean h() {
        boolean z2 = true;
        if (!ckkl.LOADED_STATION.equals(this.o) && !ckkl.FAILED_TO_LOAD_STATION.equals(this.o)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.wpu
    public String i() {
        return this.R;
    }

    @Override // defpackage.wpu
    @dzsi
    public String j() {
        return this.S;
    }

    @Override // defpackage.wpu
    @dzsi
    public acqx k() {
        if (this.P.booleanValue()) {
            return this.X;
        }
        return null;
    }

    @Override // defpackage.wpu
    public cqkl l() {
        if (this.Y == null) {
            return cqkl.a;
        }
        qcf d = qcg.d();
        d.d(this.R);
        dvvo dvvoVar = this.Y;
        dbsk.s(dvvoVar);
        d.b(dvvoVar);
        d.c(this.y.al());
        this.h.a().H(d.a());
        return cqkl.a;
    }

    @Override // defpackage.wpu
    public Boolean m() {
        return Boolean.valueOf(this.Z);
    }

    @Override // defpackage.wpu
    public Boolean n() {
        return Boolean.valueOf(this.Q != null);
    }

    @Override // defpackage.wpu
    public Boolean o() {
        boolean z2 = false;
        if (this.s && !g().booleanValue()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.wpu
    public jam p() {
        return this.af;
    }

    @Override // defpackage.wpu
    public jam q() {
        return this.ag;
    }

    @Override // defpackage.wpu
    public Iterable<wpv> r() {
        Set<qdi> f = this.n.e.f();
        if (this.m.a(f)) {
            return this.m.b(f);
        }
        return Collections.emptyList();
    }

    @Override // defpackage.wpu
    public Iterable<wpv> s() {
        return dcft.i(r(), wrs.a);
    }

    @Override // defpackage.wpu
    public Iterable<wpv> t() {
        cqkf<wpu> cqkfVar;
        if (this.t) {
            this.t = false;
            wij wijVar = this.ai;
            if (wijVar != null && (cqkfVar = wijVar.a.aj) != null) {
                ((zut) cqkfVar.c()).n();
            }
        }
        return dcft.i(r(), wrt.a);
    }

    @Override // defpackage.wpu
    public Iterable<xia> u() {
        return this.L.a(t(), dtyc.eN);
    }

    @Override // defpackage.wpu
    public Boolean v() {
        return Boolean.valueOf(this.aa);
    }

    @Override // defpackage.wpu
    public wpn w() {
        return this.n;
    }

    @Override // defpackage.wpu
    public Boolean x() {
        boolean z2 = false;
        if (h().booleanValue() && !g().booleanValue() && this.Z && this.n.d().booleanValue()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.wpu
    @dzsi
    public xiv y() {
        return this.U;
    }

    @Override // defpackage.wpu
    public cjtd z() {
        return this.l;
    }
}
