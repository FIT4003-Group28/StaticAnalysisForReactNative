package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: sfy  reason: default package */
/* loaded from: classes7.dex */
public class sfy extends sbv implements sax {
    private boolean A;
    private boolean B;
    private boolean C;
    private double D;
    private final degu<dvwm> E;
    private final degu<qec> F;
    public final List<saw> a;
    public final akox b;
    public final gft c;
    public final gll d;
    public final vtn e;
    public final ckcw f;
    public final gga g;
    public boolean h;
    private final Context i;
    private final qds j;
    private final btrm k;
    private final dehq l;
    private final hwe m;
    private final sfw n;
    private final vyd o;
    private final sfx p;
    private final rzz q;
    private rzr r;
    private final btvo s;
    private final qed t;
    @dzsi
    private saw u;
    @dzsi
    private akqq v;
    @dzsi
    private dopk w;
    @dzsi
    private yyo x;
    @dzsi
    private dehn<dvwm> y;
    @dzsi
    private dehn<akqq> z;

    public sfy(Application application, sff sffVar, cqhn cqhnVar, vtn vtnVar, gll gllVar, akox akoxVar, hwe hweVar, qed qedVar, vyd vydVar, cqhu cqhuVar, qds qdsVar, btrm btrmVar, dehq dehqVar, rzz rzzVar, rzs rzsVar, ckcw ckcwVar, btvo btvoVar, gga ggaVar, @dzsi akqq akqqVar, @dzsi dopk dopkVar, String str, final sfw sfwVar, gft gftVar) {
        super(str, application.getString(R.string.COMMUTE_SETUP_STATION_PICKER_SELECT_BUTTON), new View.OnClickListener(sfwVar) { // from class: sfg
            private final sfw a;

            {
                this.a = sfwVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gga ggaVar2 = ((rod) this.a).a.aE;
                dbsk.s(ggaVar2);
                ggaVar2.g().f();
            }
        });
        this.a = new ArrayList();
        this.p = new sfx(this);
        this.A = true;
        this.B = false;
        this.C = false;
        this.h = false;
        this.D = 150.0d;
        this.E = new sfu(this);
        this.F = new sfv(this);
        this.i = application;
        this.e = vtnVar;
        this.j = qdsVar;
        this.k = btrmVar;
        this.l = dehqVar;
        this.d = gllVar;
        this.b = akoxVar;
        this.m = hweVar;
        this.v = akqqVar;
        this.w = dopkVar;
        this.o = vydVar;
        this.n = sfwVar;
        this.c = gftVar;
        this.q = rzzVar;
        this.f = ckcwVar;
        this.t = qedVar;
        this.s = btvoVar;
        this.g = ggaVar;
    }

    private final void I(akqq akqqVar, dbsg<Float> dbsgVar) {
        akox akoxVar = this.b;
        akoxVar.p(akyt.j(akqqVar, dbsgVar.c(Float.valueOf(akoxVar.l().k())).floatValue(), this.d.b()));
    }

    private final double J(akzh akzhVar) {
        if (!P()) {
            return 150.0d;
        }
        Rect b = this.d.b();
        double f = akyx.f(akzhVar);
        double min = Math.min(Math.abs(b.height()), Math.abs(b.width()));
        Double.isNaN(min);
        return min / f;
    }

    private final void K(boolean z) {
        this.h = false;
        if (!z) {
            F().b();
        }
    }

    private final void L() {
        this.j.b();
        dehn<akqq> dehnVar = this.z;
        if (dehnVar != null) {
            dehnVar.cancel(true);
            this.z = null;
        }
        this.C = false;
        dehn<dvwm> dehnVar2 = this.y;
        if (dehnVar2 != null) {
            dehnVar2.cancel(true);
            this.y = null;
        }
        this.B = false;
        this.t.b();
    }

    private final void M(akqi akqiVar, ckem ckemVar, @dzsi degu<dopk> deguVar) {
        String o = akqiVar.o();
        for (saw sawVar : this.a) {
            if (dbsd.a(o, sawVar.g().d)) {
                K(false);
                B(sawVar);
                w();
                C();
                if (deguVar == null) {
                    return;
                }
                deguVar.b(sawVar.g());
                return;
            }
        }
        L();
        N(akqiVar, new sfs(this, ckemVar, deguVar));
    }

    private final void N(akqi akqiVar, @dzsi degu<dopk> deguVar) {
        qdp p = qdq.p();
        p.f(akqiVar);
        p.j(1);
        p.h(2);
        qdq a = p.a();
        K(false);
        this.C = true;
        cqkx.p(this);
        this.j.a(a, true, new sft(this, deguVar));
    }

    private final void O(akqq akqqVar, double d) {
        this.v = akqqVar;
        this.D = Math.max(d, 150.0d);
        y();
    }

    private final boolean P() {
        return this.s.getCommuteSetupParameters().l;
    }

    public final sfe A(dopk dopkVar, boolean z, ckem ckemVar) {
        jhk w = sht.w(dopkVar);
        cqkn cqknVar = new cqkn(this) { // from class: sfi
            private final sfy a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                sfy sfyVar = this.a;
                saw sawVar = (saw) cqkpVar;
                if (!sawVar.c().booleanValue()) {
                    sfyVar.B(sawVar);
                    sfyVar.C();
                    sfyVar.r();
                }
            }
        };
        Context context = this.i;
        String str = dopkVar.b;
        ArrayList arrayList = new ArrayList();
        for (doph dophVar : dopkVar.e) {
            for (dooo doooVar : dophVar.d) {
                for (dpce dpceVar : doooVar.c) {
                    String r = alcf.r(Collections.singleton(dpceVar));
                    if (r == null) {
                        r = alcf.k(dpceVar);
                    }
                    if (r != null) {
                        arrayList.add(r);
                    }
                }
            }
        }
        String join = TextUtils.join(this.i.getString(R.string.TRANSIT_ROUTE_STEP_SEPARATOR), arrayList);
        sff.a(context, 1);
        sff.a(str, 2);
        sff.a(join, 3);
        sff.a(cqknVar, 7);
        sff.a(dopkVar, 8);
        sff.a(ckemVar, 9);
        return new sfe(context, str, join, false, z, w, cqknVar, dopkVar, ckemVar);
    }

    public final void B(@dzsi saw sawVar) {
        this.u = sawVar;
        Iterator<saw> it = this.a.iterator();
        while (it.hasNext()) {
            saw next = it.next();
            next.d(next == sawVar);
        }
        cqkx.p(this);
    }

    public void C() {
        saw sawVar = this.u;
        if (sawVar != null) {
            dopk g = sawVar.g();
            hwe hweVar = this.m;
            akqi b = akqi.b(g.d);
            dnoh dnohVar = g.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            double d = dnohVar.b;
            dnoh dnohVar2 = g.g;
            if (dnohVar2 == null) {
                dnohVar2 = dnoh.d;
            }
            hweVar.a(b, akra.e(d, dnohVar2.c));
        }
    }

    public final void D(List<dopk> list, ckem ckemVar) {
        int i;
        ((ckco) this.f.a(ckeo.i)).a(ckel.a(true != list.isEmpty() ? 1 : 4));
        saw sawVar = this.u;
        if (sawVar != null) {
            i = this.a.indexOf(sawVar);
        } else {
            sawVar = null;
            i = 0;
        }
        this.u = null;
        this.a.clear();
        for (dopk dopkVar : list) {
            if (sawVar == null || !sawVar.g().d.equals(dopkVar.d)) {
                this.a.add(A(dopkVar, true, ckemVar));
            }
        }
        if (sawVar != null) {
            sfe A = A(sawVar.g(), sawVar.h().booleanValue(), sawVar.j());
            this.a.add(Math.max(0, Math.min(i, this.a.size())), A);
            this.u = A;
            B(A);
            w();
        }
        this.B = false;
        cqkx.p(this);
    }

    public final void E(Throwable th) {
        if (th instanceof CancellationException) {
            ((ckco) this.f.a(ckeo.i)).a(ckel.a(3));
            return;
        }
        ((ckco) this.f.a(ckeo.i)).a(ckel.a(2));
        this.B = false;
        F().a(new Runnable(this) { // from class: sfj
            private final sfy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.y();
            }
        });
        cqkx.p(this);
    }

    public final rzr F() {
        if (this.r == null) {
            this.r = rzs.a(new rzq(this) { // from class: sfk
                private final sfy a;

                {
                    this.a = this;
                }

                @Override // defpackage.rzq
                public final void a() {
                    sfy sfyVar = this.a;
                    sfyVar.h = true;
                    cqkx.p(sfyVar);
                }
            });
        }
        return this.r;
    }

    public final void G(dopk dopkVar, ckem ckemVar) {
        ((ckco) this.f.a(ckeo.M)).a(ckemVar.f);
        rod rodVar = (rod) this.n;
        rof rofVar = rodVar.a;
        rofVar.Nw(new rma(dopkVar, rofVar.ag, rofVar.ah));
        gga ggaVar = rodVar.a.aE;
        dbsk.s(ggaVar);
        ggaVar.g().f();
    }

    @Override // defpackage.saj
    public void b() {
        dopk dopkVar = this.w;
        if (this.b != null && dopkVar != null) {
            this.u = A(dopkVar, false, ckem.PRESELECTED);
            dnoh dnohVar = dopkVar.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            this.v = akqq.e(dnohVar);
            this.w = null;
            C();
        }
        yyo yyoVar = new yyo(new Runnable(this) { // from class: sfh
            private final sfy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akqq akqqVar;
                sfy sfyVar = this.a;
                if (((ges) sfyVar.c).aD) {
                    alrh ak = sfyVar.b.ak();
                    if (ak == null || (akqqVar = ak.a(new Point(sfyVar.d.b().centerX(), sfyVar.d.b().centerY()))) == null) {
                        akqqVar = sfyVar.b.l().p().i;
                    }
                    sfyVar.z(akqqVar, sfyVar.s());
                }
            }
        }, this.l);
        this.x = yyoVar;
        btrm btrmVar = this.k;
        dceq a = dcet.a();
        a.b(alhl.class, new yyp(0, alhl.class, yyoVar, bvrj.UI_THREAD));
        a.b(alhx.class, new yyp(1, alhx.class, yyoVar, bvrj.UI_THREAD));
        btrmVar.g(yyoVar, a.a());
        btrm btrmVar2 = this.k;
        sfx sfxVar = this.p;
        dceq a2 = dcet.a();
        a2.b(alho.class, new sga(alho.class, sfxVar, bvrj.UI_THREAD));
        btrmVar2.g(sfxVar, a2.a());
    }

    @Override // defpackage.saj
    public void c() {
        this.k.a(this.p);
        yyo yyoVar = this.x;
        if (yyoVar != null) {
            this.k.a(yyoVar);
            this.x.a();
            this.x = null;
        }
        L();
        this.m.c();
    }

    @Override // defpackage.saj
    public Boolean d() {
        boolean z = true;
        if (!this.B && !this.C) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.sbv, defpackage.saj
    public Boolean e() {
        return Boolean.valueOf(this.u != null);
    }

    @Override // defpackage.saj
    public cqkl f() {
        saw sawVar = this.u;
        dbsk.s(sawVar);
        if (sawVar.h().booleanValue()) {
            akqi f = akqi.f(sawVar.g().d);
            if (f == null) {
                return cqkl.a;
            }
            L();
            N(f, new sfm(this, sawVar));
        } else {
            G(sawVar.g(), sawVar.j());
        }
        return cqkl.a;
    }

    @Override // defpackage.saj
    public cjtd g() {
        return cjtd.a(dtxl.da);
    }

    @Override // defpackage.sax
    public List<saw> j() {
        return this.a;
    }

    @Override // defpackage.sax
    public cqkl k() {
        sfw sfwVar = this.n;
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.SEARCH);
        bxkoVar.g(this.i.getString(R.string.COMMUTE_SETUP_STATION_PICKER_SEARCH));
        bxkoVar.q(false);
        bxkoVar.s(false);
        bxkoVar.j = false;
        bxkoVar.f = false;
        rod rodVar = (rod) sfwVar;
        rof rofVar = rodVar.a;
        rodVar.a.aZ(bxel.bt(rofVar.ad, bxkoVar, rofVar));
        return cqkl.a;
    }

    @Override // defpackage.sax
    public cjtd l() {
        return cjtd.a(dtxl.dd);
    }

    @Override // defpackage.sax
    public cjtd m() {
        return cjtd.a(dtxl.db);
    }

    @Override // defpackage.sax
    public cjtd n() {
        return cjtd.a(dtxl.dc);
    }

    @Override // defpackage.sax
    public Boolean o() {
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.sax
    public Boolean p() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.sax
    public cqkl q() {
        K(true);
        cqkx.p(this);
        F().c();
        return cqkl.a;
    }

    public void r() {
        saw sawVar = this.u;
        if (sawVar != null) {
            dnoh dnohVar = sawVar.g().g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            I(akqq.e(dnohVar), dbpy.a);
            return;
        }
        akqq akqqVar = this.v;
        if (akqqVar == null || this.b == null) {
            return;
        }
        I(akqqVar, dbsg.i(Float.valueOf(14.0f)));
    }

    public final double s() {
        return J(this.b.l());
    }

    public void t() {
        akqq akqqVar = this.v;
        akox akoxVar = this.b;
        if (akoxVar == null || akqqVar == null) {
            return;
        }
        akzh l = akoxVar.l();
        alaa b = alad.b(l.p());
        if (this.b.o(b)) {
            l.o(b.a());
        }
        O(akqqVar, J(l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [dehn] */
    public void u(bxmh bxmhVar) {
        akqi akqiVar;
        akqi akqiVar2;
        dehn dehnVar;
        deig deigVar;
        dhjz dhjzVar = null;
        B(null);
        rod rodVar = (rod) this.n;
        if (rodVar.a.ae.e(rof.class)) {
            gfq.k(rodVar.a);
        }
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        if ((dwjjVar.a & 32) != 0) {
            dvzj dvzjVar = dwjjVar.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            akqiVar = akqi.f(dvzjVar.b);
        } else {
            akqiVar = null;
        }
        int a = dxbg.a(dxbpVar.s);
        if (a == 0 || a != 2 || akqiVar == null) {
            L();
            K(false);
            this.C = true;
            cqkx.p(this);
            rzz rzzVar = this.q;
            dwjj dwjjVar2 = bxmhVar.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            if ((dwjjVar2.a & 32) != 0) {
                dvzj dvzjVar2 = dwjjVar2.g;
                if (dvzjVar2 == null) {
                    dvzjVar2 = dvzj.y;
                }
                akqiVar2 = akqi.f(dvzjVar2.b);
                dvzj dvzjVar3 = dwjjVar2.g;
                if (dvzjVar3 == null) {
                    dvzjVar3 = dvzj.y;
                }
                if ((dvzjVar3.a & 4) != 0) {
                    dhjz dhjzVar2 = dvzjVar2.d;
                    if (dhjzVar2 == null) {
                        dhjzVar2 = dhjz.e;
                    }
                    dhjzVar = dhjzVar2;
                }
            } else {
                akqiVar2 = null;
            }
            if (dhjzVar != null) {
                deigVar = deha.a(akqq.j(dhjzVar));
            } else {
                deig d = deig.d();
                String str = dxbpVar2.b;
                ily ilyVar = new ily();
                if (akqiVar2 != null) {
                    ilyVar.j(akqiVar2);
                }
                if (str != null) {
                    ilyVar.u = str;
                }
                ilo d2 = ilyVar.d();
                if (dbsd.a(d2.ai(), akqi.a) && dbsj.d(d2.y())) {
                    bvoo.h("No featureID or query available to fetch placemark", new Object[0]);
                    dehnVar = deha.b(new IllegalArgumentException("No featureID or query available to fetch placemark"));
                } else {
                    deig d3 = deig.d();
                    befu p = befv.p();
                    p.j(bwrs.a(d2));
                    rzzVar.b.f(new rzx(d3), p.m());
                    dehnVar = d3;
                }
                deha.q(dehnVar, new rzw(d), dege.a);
                deigVar = d;
            }
            this.z = deigVar;
            deha.q(deigVar, new sfp(this), dege.a);
            return;
        }
        M(akqiVar, ckem.SUGGEST, new sfo(this, bxmhVar));
    }

    public void v() {
        C();
        r();
        if (this.a.isEmpty() && !d().booleanValue()) {
            t();
        }
        this.A = false;
        cqkx.p(this);
    }

    public final void w() {
        int indexOf = this.a.indexOf(this.u);
        if (indexOf != -1) {
            for (View view : cqkx.n(this)) {
                View a = cqhu.a(view, rzf.a);
                if (a instanceof RecyclerView) {
                    ((RecyclerView) a).n(indexOf);
                }
            }
        }
    }

    public final void x(alho alhoVar) {
        alap alapVar;
        akqi akqiVar;
        alaq alaqVar = alhoVar.a;
        if ((alaqVar instanceof alap) && (akqiVar = (alapVar = (alap) alaqVar).g) != null && alapVar.m) {
            this.m.c();
            B(null);
            M(akqiVar, ckem.MAPS_POI, new sfr(this, alhoVar));
        }
    }

    public final void y() {
        akqq akqqVar = this.v;
        if (akqqVar == null) {
            return;
        }
        L();
        K(false);
        this.B = true;
        cqkx.p(this);
        if (P()) {
            qed qedVar = this.t;
            qdz f = qea.f();
            ((qbd) f).a = akqqVar;
            f.b(this.D);
            f.c(djqr.DEFAULT_RANKING_STRATEGY);
            qedVar.a(f.a(), this.F);
            return;
        }
        dehn<dvwm> a = this.o.a(this.b.aa(), akqqVar);
        this.y = a;
        deha.q(a, this.E, dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(akqq akqqVar, double d) {
        if (akqq.v(this.v, akqqVar, 200.0d)) {
            double d2 = 150.0d;
            if (d > 150.0d) {
                d2 = d;
            }
            double d3 = this.D;
            if (Math.abs((d2 - d3) / d3) <= 0.1d) {
                return;
            }
        }
        O(akqqVar, d);
    }
}
