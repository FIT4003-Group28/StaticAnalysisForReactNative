package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tsa  reason: default package */
/* loaded from: classes7.dex */
public final class tsa extends ges implements egq, ssr {
    public Executor a;
    @dzsi
    private abx aA;
    private boolean aB = false;
    public trs ad;
    public tur ae;
    public udk af;
    public udp ag;
    public tkm ah;
    public udw ai;
    public tsd aj;
    public jkf ak;
    public dxio<afwp> al;
    public trw am;
    public cjmt an;
    public btrm ao;
    @dzsi
    public ucm ap;
    @dzsi
    public ucr aq;
    public dbsg<trv> ar;
    @dzsi
    private cqkf<tjg> as;
    @dzsi
    private cqkf<ubt> at;
    @dzsi
    private cqkf<ubu> au;
    @dzsi
    private cqkf<ubp> av;
    @dzsi
    private cqkf<jar> aw;
    @dzsi
    private ubx ax;
    @dzsi
    private udo ay;
    @dzsi
    private crzp<trv> az;
    public efg b;
    public cqkj c;
    public tib d;
    public ucn e;
    public ucs f;
    public uby g;

    private final void aJ() {
        dbsg<RecyclerView> aR = aR();
        if (!aR.a()) {
            return;
        }
        aR.b().k();
        this.aA = null;
    }

    private final dbsg<RecyclerView> aR() {
        cqkf cqkfVar = q() ? this.au : this.at;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        return c == null ? dbpy.a : dbsg.j((RecyclerView) c.findViewById(R.id.directions_group_list));
    }

    private final void w(boolean z) {
        tsc f;
        int height;
        egf c = egf.c();
        c.h = tkl.a(((trv) ((dbsu) this.ar).a).e());
        egj egjVar = new egj(this);
        View view = null;
        egjVar.w(null);
        egjVar.A(c);
        egjVar.J(this);
        egjVar.K(jjn.FULLY_EXPANDED);
        int i = 0;
        egjVar.ar(false);
        egjVar.an();
        egjVar.k(true);
        egjVar.c(this.al.a().e());
        egjVar.ar(false);
        egjVar.U();
        cqkf<jar> cqkfVar = this.aw;
        if (cqkfVar != null) {
            udo udoVar = this.ay;
            dbsk.s(udoVar);
            cqkfVar.e(udoVar);
            egjVar.b(this.aw.c());
            egjVar.d(true);
        }
        cqkf<ubp> cqkfVar2 = this.av;
        if (cqkfVar2 != null) {
            ubx ubxVar = this.ax;
            dbsk.s(ubxVar);
            cqkfVar2.e(ubxVar);
            egjVar.aw(this.av.c(), false);
        }
        if (q()) {
            cqkf<ubu> cqkfVar3 = this.au;
            dbsk.s(cqkfVar3);
            ucr ucrVar = this.aq;
            dbsk.s(ucrVar);
            cqkfVar3.e(ucrVar);
            tib tibVar = this.d;
            dbsk.s(tibVar);
            tibVar.b(false);
            dbsg<Integer> b = this.aj.b(false);
            if (b.a()) {
                this.ae.b(tuq.c(b.b().intValue(), true));
            }
            cqkf<ubt> cqkfVar4 = this.at;
            dbsk.s(cqkfVar4);
            cqkfVar4.f();
            cqkf<tjg> cqkfVar5 = this.as;
            dbsk.s(cqkfVar5);
            cqkfVar5.f();
            cqkf<ubu> cqkfVar6 = this.au;
            dbsk.s(cqkfVar6);
            egjVar.ae((glg) cqkfVar6.c(), 2);
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
            egjVar.ag(null);
            egjVar.F(null);
        } else {
            cqkf<ubu> cqkfVar7 = this.au;
            dbsk.s(cqkfVar7);
            cqkfVar7.f();
            cqkf<tjg> cqkfVar8 = this.as;
            if (cqkfVar8 != null) {
                cqkfVar8.e(this.d.a());
                egjVar.G(this.as.c(), 6);
            }
            cqkf<ubt> cqkfVar9 = this.at;
            if (cqkfVar9 != null) {
                ucm ucmVar = this.ap;
                dbsk.s(ucmVar);
                cqkfVar9.e(ucmVar);
                cqkf<ubu> cqkfVar10 = this.au;
                dbsk.s(cqkfVar10);
                cqkfVar10.f();
                if (((trv) ((dbsu) this.ar).a).g().a()) {
                    tsd tsdVar = this.aj;
                    uco b2 = ((trv) ((dbsu) this.ar).a).g().b();
                    cqkf<?> cqkfVar11 = tsdVar.c;
                    View c2 = cqkfVar11 != null ? cqkfVar11.c() : null;
                    if (c2 != null) {
                        view = c2.findViewById(R.id.result_list_error_layout);
                    }
                    if (view == null || b2.equals(uco.NO_CONNECTION)) {
                        f = tsc.f(jjn.FULLY_EXPANDED, jkc.q, dbpy.a, 0, dbpy.a);
                    } else {
                        view.measure(View.MeasureSpec.makeMeasureSpec(tsdVar.a.getDisplayMetrics().widthPixels, 1073741824), 0);
                        f = tsc.f(jjn.EXPANDED, jkc.p, dbsg.i(Integer.valueOf(view.getMeasuredHeight())), 0, dbpy.a);
                    }
                } else {
                    tsd tsdVar2 = this.aj;
                    int g = (int) (tsdVar2.g() - (tsdVar2.h() * 0.17f));
                    cqkf<?> cqkfVar12 = tsdVar2.c;
                    if (cqkfVar12 != null) {
                        view = cqkfVar12.c();
                    }
                    if (view == null) {
                        f = tsc.f(tsdVar2.c(false), tsd.d(false, false), dbpy.a, tsdVar2.e(), dbpy.a);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tsdVar2.a.getDisplayMetrics().widthPixels, 1073741824);
                        ViewGroup viewGroup = (ViewGroup) view;
                        viewGroup.measure(makeMeasureSpec, 0);
                        viewGroup.layout(0, 0, tsdVar2.a.getDisplayMetrics().widthPixels, g);
                        cqhu cqhuVar = tsdVar2.b;
                        dcdc<View> e = cqhu.e(view, txb.a);
                        if (viewGroup.getMeasuredHeight() <= g) {
                            f = tsc.f(tsdVar2.c(true), tsd.d(true, true), dbsg.i(Integer.valueOf(viewGroup.getMeasuredHeight())), tsdVar2.e(), dbsg.i(Integer.valueOf(e.size())));
                        } else {
                            int f2 = tsdVar2.f();
                            int size = e.size();
                            int i2 = 0;
                            int i3 = 0;
                            boolean z2 = false;
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                View view2 = e.get(i2);
                                view2.measure(makeMeasureSpec, i);
                                Rect rect = new Rect();
                                view2.getDrawingRect(rect);
                                viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                                int i6 = rect.top;
                                if (i6 <= g && (height = ((int) (view2.getHeight() * 0.25f)) + i6) <= g) {
                                    i4 = ((int) (view2.getHeight() * 0.5f)) + i6;
                                    if (i4 > g) {
                                        f2 = height;
                                        break;
                                    } else if (view2.getHeight() + i6 > g) {
                                        f2 = i4;
                                        z2 = true;
                                        break;
                                    } else {
                                        i2++;
                                        f2 = i6;
                                        i5 = i3;
                                        i = 0;
                                        z2 = true;
                                        i3++;
                                    }
                                }
                            }
                            f2 = i4;
                            i3 = i5;
                            f = tsc.f(tsdVar2.c(z2), tsd.d(z2, false), z2 ? dbsg.i(Integer.valueOf(f2)) : dbpy.a, tsdVar2.e(), tsdVar2.c(z2).c(jjn.EXPANDED) ? tsdVar2.b(true) : dbsg.i(Integer.valueOf(i3)));
                        }
                    }
                }
                trr trrVar = (trr) f;
                if (trrVar.e.a()) {
                    this.ae.b(tuq.c(trrVar.e.b().intValue(), trrVar.a.c(jjn.EXPANDED)));
                }
                cqkf<ubt> cqkfVar13 = this.at;
                dbsk.s(cqkfVar13);
                egjVar.ag(cqkfVar13.c());
                egjVar.al(trrVar.d);
                egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
                egjVar.t(new C0004try(this));
                jkc jkcVar = trrVar.b;
                egjVar.ak(jkcVar, jkcVar);
                dbsg<Integer> dbsgVar = trrVar.c;
                if (dbsgVar.a()) {
                    final int intValue = dbsgVar.b().intValue();
                    egjVar.a.v = new Callable(intValue) { // from class: egi
                        private final int a;

                        {
                            this.a = intValue;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Integer.valueOf(this.a);
                        }
                    };
                }
                if (z) {
                    egjVar.ai(trrVar.a);
                } else {
                    egjVar.ai(this.ak.l().L());
                }
            }
        }
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.as = null;
        this.at = null;
        this.aj.a(null, null);
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        i(eguVar.j);
        this.aB = true;
        if (this.aA != null) {
            aJ();
        }
        dbsg<RecyclerView> aR = aR();
        if (aR.a()) {
            this.aA = new trz(this);
            abx abxVar = this.aA;
            dbsk.s(abxVar);
            aR.b().i(abxVar);
        }
        this.ah.c();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.as = this.c.e(new til());
        this.at = this.c.e(new tua());
        this.au = this.c.e(new tun());
        this.av = this.c.e(new tsw());
        this.aj.a(this.as, this.at);
        if (this.af.a()) {
            this.aw = this.c.e(new udn());
            return null;
        }
        return null;
    }

    @Override // defpackage.ssr
    public final ssq b() {
        return ssq.RESULT_LIST;
    }

    public final void g(trv trvVar, boolean z) {
        this.ar = dbsg.i(trvVar);
        if (trvVar.f()) {
            this.aB = false;
        }
        if (z) {
            trs trsVar = this.ad;
            dbsg<tmd> b = trvVar.b();
            if (!b.a()) {
                trsVar.a.clear();
            } else {
                Iterator<String> it = trsVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (!b.b().h(it.next()).a()) {
                        it.remove();
                    }
                }
            }
            ubx ubxVar = this.ax;
            dbsk.s(ubxVar);
            ubxVar.c(trvVar.b());
            ucm ucmVar = this.ap;
            dbsk.s(ucmVar);
            ucmVar.p(trvVar.b());
            ucm ucmVar2 = this.ap;
            dbsk.s(ucmVar2);
            ucmVar2.o(trvVar.g());
            ubx ubxVar2 = this.ax;
            dbsk.s(ubxVar2);
            ubxVar2.b(trvVar.c());
            ucm ucmVar3 = this.ap;
            dbsk.s(ucmVar3);
            ucmVar3.n(trvVar.c());
            udo udoVar = this.ay;
            if (udoVar != null) {
                udoVar.g(trvVar.f());
                this.ay.h(trvVar.d());
            }
        }
        if (this.ai != null) {
            if (trvVar.b().a() && trvVar.e().a()) {
                udw udwVar = this.ai;
                dbsk.s(udwVar);
                udwVar.a(trvVar.a(), trvVar.b().b());
            } else {
                udw udwVar2 = this.ai;
                dbsk.s(udwVar2);
                udwVar2.d();
            }
        }
        if (this.ah != null) {
            if (trvVar.e().a()) {
                tkm tkmVar = this.ah;
                dbsk.s(tkmVar);
                ((tkh) tkmVar).a(trvVar.a(), trvVar.e().b(), dbpy.a);
            } else {
                tkm tkmVar2 = this.ah;
                dbsk.s(tkmVar2);
                tkmVar2.e();
            }
        }
        if (z) {
            w(!this.aB);
        }
    }

    public final void i(jjn jjnVar) {
        cjmu cjmuVar;
        boolean z = true;
        boolean z2 = jjnVar == jjn.FULLY_EXPANDED;
        if (!q()) {
            cjmt cjmtVar = this.an;
            if (z2) {
                cjmuVar = cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE;
            } else {
                cjmuVar = cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE;
            }
            cjmtVar.k(cjmuVar);
        }
        if (!z2) {
            this.ah.f();
        }
        ucm ucmVar = this.ap;
        if (ucmVar != null) {
            ucmVar.l(z2);
        }
        tib tibVar = this.d;
        if (tibVar != null) {
            if (z2 || q()) {
                z = false;
            }
            tibVar.b(z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            trs trsVar = this.ad;
            String[] stringArray = bundle.getStringArray("GroupExpansionController.groupToExpansionState.keys");
            boolean[] booleanArray = bundle.getBooleanArray("GroupExpansionController.groupToExpansionState.values");
            if (stringArray == null || booleanArray == null || stringArray.length != booleanArray.length) {
                return;
            }
            for (int i = 0; i < stringArray.length; i++) {
                trsVar.a.put(stringArray[i], Boolean.valueOf(booleanArray[i]));
            }
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dbsg<RecyclerView> aR = aR();
        if (aR.a()) {
            aR.b().n(0);
        }
        w(true);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.de;
    }

    public final boolean q() {
        return S() && Rn().getConfiguration().orientation == 2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.ao;
        dceq a = dcet.a();
        a.b(ardp.class, new tsb(ardp.class, this));
        btrmVar.g(this, a.a());
        final trw trwVar = this.am;
        trwVar.g = dbsg.i(trw.c(trwVar.c.a().C().l()));
        trwVar.b(trwVar.g.b());
        trwVar.f = new crzp(trwVar) { // from class: trt
            private final trw a;

            {
                this.a = trwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                trw trwVar2 = this.a;
                btlu c = trw.c((btlu) crzmVar.l());
                if (!trwVar2.g.a() || !btlu.g(c, trwVar2.g.b())) {
                    trwVar2.b(c);
                }
            }
        };
        crzm<btlu> C = trwVar.c.a().C();
        crzp<btlu> crzpVar = trwVar.f;
        dbsk.s(crzpVar);
        C.a(crzpVar, trwVar.e);
        trv l = this.am.a().l();
        dbsk.s(l);
        g(l, false);
        this.d.c(q());
        if (this.af.a()) {
            udp udpVar = this.ag;
            boolean d = l.d();
            boolean f = l.f();
            Activity activity = (Activity) ((dxjd) udpVar.a).a;
            udp.a(activity, 1);
            cqhn a2 = udpVar.b.a();
            udp.a(a2, 2);
            udk a3 = udpVar.c.a();
            udp.a(a3, 3);
            this.ay = new udo(activity, a2, a3, d, f);
        }
        ucn ucnVar = this.e;
        dbsg<tmd> b = l.b();
        dbsg<FetchState> c = l.c();
        Activity activity2 = (Activity) ((dxjd) ucnVar.a).a;
        ucn.a(activity2, 1);
        ubw a4 = ucnVar.b.a();
        ucn.a(a4, 2);
        ucn.a(ucnVar.c.a(), 3);
        uch a5 = ucnVar.d.a();
        ucn.a(a5, 4);
        uck a6 = ucnVar.e.a();
        ucn.a(a6, 5);
        uca a7 = ucnVar.f.a();
        ucn.a(a7, 6);
        ucq a8 = ucnVar.g.a();
        ucn.a(a8, 7);
        tur a9 = ucnVar.h.a();
        ucn.a(a9, 8);
        ucn.a(b, 9);
        ucn.a(c, 10);
        this.ap = new ucm(activity2, a4, a5, a6, a7, a8, a9, b, c);
        ucs ucsVar = this.f;
        tjg a10 = this.d.a();
        ucm ucmVar = this.ap;
        dbsk.s(ucmVar);
        cqhn a11 = ucsVar.a.a();
        ucs.a(a11, 1);
        ucs.a(a10, 2);
        ucs.a(ucmVar, 3);
        this.aq = new ucr(a11, a10, ucmVar);
        uby ubyVar = this.g;
        dbsg<tmd> b2 = l.b();
        dbsg<FetchState> c2 = l.c();
        cqhn a12 = ubyVar.a.a();
        uby.a(a12, 1);
        uby.a(b2, 2);
        uby.a(c2, 3);
        this.ax = new ubx(a12, b2, c2);
        w(true);
        this.az = new crzp(this) { // from class: trx
            private final tsa a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                tsa tsaVar = this.a;
                if (crzmVar.k()) {
                    trv trvVar = (trv) crzmVar.l();
                    dbsk.s(trvVar);
                    tsaVar.g(trvVar, true);
                }
            }
        };
        crzm<trv> a13 = this.am.a();
        crzp<trv> crzpVar2 = this.az;
        dbsk.s(crzpVar2);
        a13.a(crzpVar2, this.a);
        ucm ucmVar2 = this.ap;
        dbsk.s(ucmVar2);
        ucmVar2.j();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        trs trsVar = this.ad;
        String[] strArr = new String[trsVar.a.size()];
        boolean[] zArr = new boolean[trsVar.a.size()];
        int i = 0;
        for (Map.Entry<String, Boolean> entry : trsVar.a.entrySet()) {
            strArr[i] = entry.getKey();
            zArr[i] = entry.getValue().booleanValue();
            i++;
        }
        bundle.putStringArray("GroupExpansionController.groupToExpansionState.keys", strArr);
        bundle.putBooleanArray("GroupExpansionController.groupToExpansionState.values", zArr);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        ucm ucmVar = this.ap;
        if (ucmVar != null) {
            ucmVar.k();
        }
        if (this.az != null) {
            crzm<trv> a = this.am.a();
            crzp<trv> crzpVar = this.az;
            dbsk.s(crzpVar);
            a.c(crzpVar);
            this.az = null;
        }
        trw trwVar = this.am;
        trwVar.h.a();
        if (trwVar.f != null) {
            crzm<btlu> C = trwVar.c.a().C();
            crzp<btlu> crzpVar2 = trwVar.f;
            dbsk.s(crzpVar2);
            C.c(crzpVar2);
            trwVar.f = null;
        }
        this.ah.d();
        this.ai.d();
        this.aB = false;
        cqkf<tjg> cqkfVar = this.as;
        dbsk.s(cqkfVar);
        cqkfVar.f();
        cqkf<ubt> cqkfVar2 = this.at;
        dbsk.s(cqkfVar2);
        cqkfVar2.f();
        cqkf<ubp> cqkfVar3 = this.av;
        dbsk.s(cqkfVar3);
        cqkfVar3.f();
        aJ();
        this.ao.a(this);
        super.u();
    }
}
