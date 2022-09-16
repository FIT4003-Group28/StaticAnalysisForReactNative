package com.google.android.apps.youtube.app.watch.panel.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultWatchPanelViewController implements oeu, oaq, oam, oak, oar, ezg, f, nmj {
    private final yni A;
    private final ajmy B;
    private final iug C;
    private final iue D;
    private final airw E;
    private final aypf F;
    private final wmc G;
    private final wmi H;
    private final xiw I;

    /* renamed from: J  reason: collision with root package name */
    private final ecg f154J;
    private final wml K;
    private final wxc L;
    private final fpg M;
    private final feb N;
    private final azqb O;
    private final ocw P;
    private final ocd Q;
    private final oeb R;
    private final ody S;
    private final frr T;
    private final odr U;
    private final axnm V;
    private final ezh W;
    private final nqr X;
    private final ajsg Y;
    private final oek Z;
    public final Activity a;
    private nqj aA;
    private TextView aB;
    private View aC;
    private View aD;
    private View aE;
    private oat aG;
    private ArrayList aH;
    private ocr aI;
    private ArrayList aJ;
    private oea aK;
    private Runnable aL;
    private aypg aM;
    private aypg aN;
    private final tdu aO;
    private final wmk aP;
    private final aacz aQ;
    private final odv aa;
    private final oda ab;
    private final ods ac;
    private final feu ad;
    private final ActiveStateScrollSelectionController ae;
    private final obv af;
    private final nuy ag;
    private final nuj ah;
    private final nug ai;
    private final iuq aj;
    private final emw ak;
    private final nvy al;
    private final aadd am;
    private final axxu an;
    private final axxt ao;
    private final ghu ap;
    private final wkb aq;
    private final oas ar;
    private final ajpa as;
    private final obf at;
    private final gew au;
    private final AdsWebViewCacheController av;
    private final ntt aw;
    private nux ax;
    private nui ay;
    private oej az;
    public final aafo b;
    public final ngi c;
    public final acti d;
    public final nml e;
    public final nnw f;
    public final String g;
    public nun h;
    public nwa i;
    public nuf j;
    public nud k;
    public nmc l;
    public oeg m;
    public CoordinatorLayout n;
    public RecyclerView o;
    public ScrollToTopLinearLayoutManager p;
    public ajzq q;
    public ajxq r;
    public loh s;
    public ocq t;
    public wkh u;
    public gfm v;
    public Configuration x;
    public boolean y;
    public acvg z;
    public ahty w = ahty.NEW;
    private oec aF = new och();

    public DefaultWatchPanelViewController(Activity activity, yni yniVar, ajmy ajmyVar, iue iueVar, iug iugVar, airw airwVar, wmk wmkVar, wmc wmcVar, wmi wmiVar, xiw xiwVar, ecg ecgVar, wml wmlVar, wxc wxcVar, feu feuVar, fpg fpgVar, aafo aafoVar, feb febVar, ngi ngiVar, ezh ezhVar, nug nugVar, ocw ocwVar, oeb oebVar, acti actiVar, frr frrVar, axnm axnmVar, ActiveStateScrollSelectionController activeStateScrollSelectionController, iuq iuqVar, ody odyVar, odr odrVar, ajsg ajsgVar, oek oekVar, odv odvVar, oda odaVar, ods odsVar, nuy nuyVar, nuj nujVar, fqd fqdVar, emw emwVar, nvy nvyVar, aacz aaczVar, aadd aaddVar, wkb wkbVar, ajpa ajpaVar, obf obfVar, ghu ghuVar, gew gewVar, AdsWebViewCacheController adsWebViewCacheController, azqb azqbVar, nml nmlVar, nnw nnwVar, tdu tduVar, ntt nttVar, ocd ocdVar, ahub ahubVar, axxu axxuVar, axxt axxtVar, nqr nqrVar) {
        this.a = activity;
        this.A = yniVar;
        this.B = ajmyVar;
        this.D = iueVar;
        this.C = iugVar;
        this.E = airwVar;
        this.aP = wmkVar;
        this.G = wmcVar;
        this.H = wmiVar;
        this.I = xiwVar;
        this.f154J = ecgVar;
        this.K = wmlVar;
        this.L = wxcVar;
        this.M = fpgVar;
        this.b = aafoVar;
        this.N = febVar;
        this.O = azqbVar;
        this.c = ngiVar;
        this.P = ocwVar;
        this.Q = ocdVar;
        this.R = oebVar;
        this.av = adsWebViewCacheController;
        this.d = actiVar;
        this.T = frrVar;
        this.V = axnmVar;
        this.aj = iuqVar;
        this.ai = nugVar;
        this.f = nnwVar;
        this.e = nmlVar;
        this.S = odyVar;
        this.U = odrVar;
        this.W = ezhVar;
        this.Y = ajsgVar;
        this.Z = oekVar;
        this.aa = odvVar;
        this.ab = odaVar;
        this.ac = odsVar;
        this.ag = nuyVar;
        this.ah = nujVar;
        this.ak = emwVar;
        this.ap = ghuVar;
        this.ae = activeStateScrollSelectionController;
        this.al = nvyVar;
        this.aQ = aaczVar;
        this.am = aaddVar;
        this.an = axxuVar;
        this.ao = axxtVar;
        this.aq = wkbVar;
        this.as = ajpaVar;
        this.ad = feuVar;
        this.at = obfVar;
        this.au = gewVar;
        this.aO = tduVar;
        this.aw = nttVar;
        this.X = nqrVar;
        asxj asxjVar = aaczVar.b().e;
        this.g = (asxjVar == null ? asxj.a : asxjVar).aD;
        ahubVar.c(new ahtz() { // from class: obm
            @Override // defpackage.ahtz
            public final void a(ahty ahtyVar) {
                DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                defaultWatchPanelViewController.w = ahtyVar;
                defaultWatchPanelViewController.t();
            }
        });
        oas oasVar = new oas(fqdVar, this);
        this.ar = oasVar;
        oasVar.c(this);
        oasVar.d(this);
        this.af = new obv(this);
        this.F = new aypf();
        this.aJ = new ArrayList();
        this.aH = new ArrayList();
        this.x = activity.getResources().getConfiguration();
        if (activity instanceof ems) {
            ((ems) activity).getLifecycle().c(this);
        }
    }

    private final void A(fgh fghVar) {
        this.aI.j(fghVar);
        this.u.c();
        this.C.b();
        this.aB.setVisibility(8);
        ArrayList arrayList = this.aH;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).c();
        }
        if (!eog.aE(this.aQ)) {
            this.e.t();
        }
        this.av.g();
        this.aG.a();
        this.aF.d();
        this.aK.a.r();
    }

    private final void v(LoadingFrameLayout loadingFrameLayout) {
        this.aH.add(loadingFrameLayout);
    }

    private final void x(WatchNextResponseModel watchNextResponseModel) {
        this.p.c = false;
        aakw aakwVar = watchNextResponseModel.e;
        if (aakwVar != null) {
            this.q.L(aakwVar, null);
            ArrayList arrayList = this.aH;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((LoadingFrameLayout) arrayList.get(i)).a();
            }
        }
        r();
    }

    private final void y(akgj akgjVar) {
        ArrayList arrayList = this.aH;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).f(akgjVar);
        }
        ArrayList arrayList2 = this.aJ;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((odu) arrayList2.get(i2)).a = akgjVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [ezg, adwm, nwa, xgn] */
    @Override // defpackage.oar
    public final void e(int i, int i2) {
        if (i2 == 3) {
            aypf aypfVar = this.F;
            wkh wkhVar = this.u;
            airw airwVar = this.E;
            this.A.g(wkhVar);
            aypfVar.g(wkhVar.g(airwVar));
            if (eog.aq(this.aQ)) {
                this.F.g(this.S.g(this.E));
            } else {
                this.A.g(this.S);
            }
            this.A.g(this.ak);
            this.F.d(this.E.V().C(oav.d).aa(new obh(this, 1), npy.n));
            ecg ecgVar = this.f154J;
            wrb wrbVar = ecgVar.a;
            ecf ecfVar = ecgVar.b;
            ecf ecfVar2 = wrbVar.b;
            if (ecfVar2 != null && !akzj.f(ecfVar2, ecfVar)) {
                wwf wwfVar = wrbVar.a;
                wwf.a(null, "Received mismatching registration request for adsEngagementPanelApi");
            }
            wrbVar.b = ecfVar;
            wml wmlVar = this.K;
            wlt wltVar = wmlVar.a;
            if (wltVar != null) {
                wrc wrcVar = wmlVar.b;
                wlt wltVar2 = wrcVar.b;
                if (wltVar2 != null && !akzj.f(wltVar2, wltVar)) {
                    wwf wwfVar2 = wrcVar.a;
                    wwf.a(null, "Received mismatching registration request for companionApi");
                }
                wrcVar.b = wltVar;
            }
            this.G.c = this.d;
            z();
        } else if (i2 == 1) {
            z();
            i2 = 1;
        }
        if (i == 3) {
            this.F.c();
            this.A.m(this.u);
            if (!eog.aq(this.aQ)) {
                this.A.m(this.S);
            }
            this.A.m(this.ak);
            ?? r0 = this.i;
            if (r0 != 0) {
                nvp nvpVar = (nvp) r0;
                if (nvpVar.C) {
                    nvpVar.C = false;
                    if (eog.aq(nvpVar.D)) {
                        nvpVar.o.c();
                    } else {
                        nvpVar.q.m(nvpVar.r);
                    }
                    nvpVar.l.k(r0);
                    nwf nwfVar = nvpVar.j;
                    if (eog.aq(nwfVar.k)) {
                        nwfVar.i.c();
                    } else {
                        nwfVar.j.m(nwfVar);
                    }
                    if (nvpVar.w) {
                        nvpVar.g.removeCallbacks(nvpVar.s);
                        nvpVar.g.setSelected(false);
                    }
                    nvpVar.p.c();
                    nvpVar.k.c(r0);
                    nvpVar.m.j(r0);
                }
            }
            ecg ecgVar2 = this.f154J;
            wrb wrbVar2 = ecgVar2.a;
            ecf ecfVar3 = ecgVar2.b;
            ecf ecfVar4 = wrbVar2.b;
            if (ecfVar4 != null && !akzj.f(ecfVar4, ecfVar3)) {
                wwf wwfVar3 = wrbVar2.a;
                wwf.a(null, "Received mismatching unregistration request for adsEngagementPanelApi");
            }
            wrbVar2.b = null;
            wml wmlVar2 = this.K;
            wlt wltVar3 = wmlVar2.a;
            if (wltVar3 != null) {
                wrc wrcVar2 = wmlVar2.b;
                wlt wltVar4 = wrcVar2.b;
                if (wltVar4 != null && !akzj.f(wltVar4, wltVar3)) {
                    wwf wwfVar4 = wrcVar2.a;
                    wwf.a(null, "Received mismatching unregistration request for companionApi");
                }
                wrcVar2.b = null;
            }
        }
        boolean h = oas.h(i2);
        if (oas.h(i) != h) {
            if (!h) {
                this.W.j(this);
            } else {
                this.W.i(this);
                h(this.a.getResources().getConfiguration());
                pa(this.W.g());
                wke wkeVar = this.u.b;
                if (wkeVar != null) {
                    wkeVar.a();
                }
            }
        }
        boolean f = oas.f(i2);
        if (oas.f(i) != f) {
            if (!f) {
                this.C.b();
                this.u.c();
                for (wux wuxVar : this.H.a) {
                    wuxVar.a = null;
                }
                this.ak.a();
                oda odaVar = this.ab;
                odaVar.a();
                odaVar.b = null;
                this.aG.a();
                oan oanVar = this.ar.a;
                if (oanVar != null) {
                    this.T.d(oanVar.h.c());
                }
                if (!this.W.g().b()) {
                    return;
                }
                this.aj.W();
                return;
            }
            wmi wmiVar = this.H;
            ody odyVar = this.S;
            for (wux wuxVar2 : wmiVar.a) {
                wuxVar2.a = odyVar;
            }
            wkb wkbVar = this.aq;
            wkh wkhVar2 = this.u;
            wkhVar2.getClass();
            wkbVar.a = wkhVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    @Override // defpackage.oam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.oan r8, int r9) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController.g(oan, int):void");
    }

    @Override // defpackage.oaq
    public final void h(Configuration configuration) {
        this.x = configuration;
        r();
        this.q.E(configuration);
        this.r.c(j(configuration));
        this.aF.b(configuration);
        oat oatVar = this.aG;
        oatVar.e = elk.k(configuration.orientation);
        oatVar.b();
    }

    public final int i(Configuration configuration) {
        if (u(configuration)) {
            return 1;
        }
        return this.a.getResources().getInteger(R.integer.grid_shelf_num_columns);
    }

    public final int j(Configuration configuration) {
        if (u(configuration)) {
            return 1;
        }
        return this.a.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
    }

    @Override // defpackage.oeu
    public final int k() {
        if (this.aH.isEmpty()) {
            afus.b(1, 25, "Missing LoadingFrameLayout in DefaultWatchPanelViewController.");
            return 0;
        }
        return ((LoadingFrameLayout) this.aH.get(0)).e;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.oeu
    public final oan l() {
        return this.ar.a;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.ar.e(null);
        this.q.j();
        this.K.a = null;
        apyVar.getLifecycle().e(this);
        aypg aypgVar = this.aM;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.aM = null;
        }
        aypg aypgVar2 = this.aN;
        if (aypgVar2 != null) {
            azof.f((AtomicReference) aypgVar2);
            this.aN = null;
        }
        ocq ocqVar = this.t;
        if (ocqVar != null) {
            ocqVar.d.c();
        }
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.ae;
        if (activeStateScrollSelectionController != null) {
            activeStateScrollSelectionController.h(null);
        }
        ocr ocrVar = this.aI;
        if (ocrVar != null) {
            ocrVar.d();
        }
        if (this.aA != null) {
            this.e.g().b(this.aA);
        }
    }

    @Override // defpackage.oeu
    public final oeu m(View view, ViewGroup viewGroup, frt frtVar, ajc ajcVar, nun nunVar, nvz nvzVar) {
        int i;
        Boolean bool;
        Boolean bool2;
        RelativeLayout relativeLayout;
        LayoutInflater from = LayoutInflater.from(this.a);
        this.n = (CoordinatorLayout) from.inflate(R.layout.watch_panel, viewGroup, false);
        nwa a = nvzVar != null ? this.al.a(nvzVar) : null;
        this.i = a;
        if (a != null) {
            this.ar.d(a);
            this.ar.c(this.i);
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.n.findViewById(R.id.video_info_loading_layout);
        v(loadingFrameLayout);
        this.aJ.add(this.aa.a(loadingFrameLayout, false));
        this.aB = (TextView) loadingFrameLayout.d.b.findViewById(R.id.title);
        this.o = (RecyclerView) loadingFrameLayout.findViewById(R.id.watch_list);
        from.getContext();
        ScrollToTopLinearLayoutManager scrollToTopLinearLayoutManager = new ScrollToTopLinearLayoutManager();
        this.p = scrollToTopLinearLayoutManager;
        this.o.ag(scrollToTopLinearLayoutManager);
        this.ae.k(loadingFrameLayout);
        this.aC = this.n.findViewById(R.id.set_bar);
        this.aD = this.n.findViewById(R.id.set_content);
        this.aE = this.n.findViewById(R.id.playlist_entry_point_container);
        if ((view instanceof NextGenWatchLayout) && !eog.aE(this.aQ)) {
            aqxe aqxeVar = this.ao.a.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            if (aqxeVar.a(45354984L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45354984L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45354984L);
                bool2 = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
            } else {
                bool2 = false;
            }
            if (bool2.booleanValue()) {
                relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.engagement_panel_lower_view, (ViewGroup) null);
                NextGenWatchLayout nextGenWatchLayout = (NextGenWatchLayout) view;
                ((ViewGroup) nextGenWatchLayout.v.get()).addView(relativeLayout);
                nextGenWatchLayout.x = relativeLayout;
            } else {
                relativeLayout = null;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.engagement_panel_root_view, (ViewGroup) null);
            ((NextGenWatchLayout) view).u(relativeLayout2);
            this.e.j(relativeLayout2, relativeLayout);
            this.e.g().a(this.af);
            this.e.u(this);
        }
        ocj d = ohn.d(new yye(this.n.findViewById(R.id.scrim)));
        d.a(this.e);
        oeg oegVar = new oeg(loadingFrameLayout, this.aC, this.aD, this.aE, this.e, d, this.X, this.aQ);
        this.m = oegVar;
        this.Z.a(oegVar);
        this.m.a(this.Z.a);
        wkh wkhVar = new wkh(this.a, this.B, this.I, this.L, new ArrayList(), new ArrayList());
        this.u = wkhVar;
        this.K.a = wkhVar;
        ods odsVar = this.ac;
        int i2 = 0;
        while (true) {
            afy afyVar = odsVar.b;
            if (i2 >= afyVar.b) {
                break;
            }
            wkhVar.b((wkd) afyVar.b(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            afy afyVar2 = odsVar.a;
            if (i3 >= afyVar2.b) {
                break;
            }
            wkhVar.a.add((wkg) afyVar2.b(i3));
            i3++;
        }
        wkhVar.b(new lzf(wkhVar.i, wkhVar.j, wkhVar.h, wkhVar.k));
        ajsa ajsaVar = (ajsa) this.O.get();
        ajsaVar.f(fkh.class, new fki(this.a, this.aq, this.aP));
        this.r = new ajxq(j(this.a.getResources().getConfiguration()));
        obq obqVar = new obq(this, this.a);
        this.s = obqVar;
        obqVar.c(i(this.a.getResources().getConfiguration()));
        odr odrVar = this.U;
        ajxq ajxqVar = this.r;
        loh lohVar = this.s;
        Context context = (Context) odrVar.a.get();
        context.getClass();
        iue iueVar = (iue) odrVar.b.get();
        iueVar.getClass();
        yni yniVar = (yni) odrVar.c.get();
        yniVar.getClass();
        ajyi ajyiVar = (ajyi) odrVar.d.get();
        ajyiVar.getClass();
        yzj yzjVar = (yzj) odrVar.e.get();
        yzjVar.getClass();
        acti actiVar = (acti) odrVar.f.get();
        actiVar.getClass();
        azqb azqbVar = odrVar.g;
        azqb azqbVar2 = odrVar.h;
        azqb azqbVar3 = odrVar.i;
        odm odmVar = (odm) odrVar.j.get();
        odmVar.getClass();
        xmm xmmVar = (xmm) odrVar.k.get();
        xmmVar.getClass();
        lok lokVar = (lok) odrVar.l.get();
        lokVar.getClass();
        lnn lnnVar = (lnn) odrVar.m.get();
        lnnVar.getClass();
        ajin ajinVar = (ajin) odrVar.n.get();
        ajinVar.getClass();
        ajin ajinVar2 = (ajin) odrVar.o.get();
        ajinVar2.getClass();
        ampq ampqVar = (ampq) odrVar.p.get();
        ampqVar.getClass();
        ajxqVar.getClass();
        lohVar.getClass();
        odq odqVar = new odq(context, iueVar, yniVar, ajyiVar, yzjVar, actiVar, azqbVar, azqbVar2, azqbVar3, odmVar, xmmVar, lokVar, lnnVar, ajinVar, ajinVar2, ampqVar, ajxqVar, lohVar);
        this.D.c = ampq.i(this.e);
        gew gewVar = this.au;
        ajpa ajpaVar = this.as;
        RecyclerView recyclerView = this.o;
        iue iueVar2 = this.D;
        acti actiVar2 = this.d;
        akai akaiVar = akai.Ws;
        ajzs ajzsVar = ajzs.d;
        ajkb ajkbVar = ajkb.WATCH;
        tdu tduVar = this.aO;
        Activity activity = this.a;
        fhj a2 = fhk.a();
        a2.a = this.ae;
        fhk a3 = a2.a();
        ajsg ajsgVar = (ajsg) gewVar.a.get();
        ajsgVar.getClass();
        ajyx ajyxVar = (ajyx) gewVar.b.get();
        ajyxVar.getClass();
        yni yniVar2 = (yni) gewVar.c.get();
        yniVar2.getClass();
        yzj yzjVar2 = (yzj) gewVar.d.get();
        yzjVar2.getClass();
        ((aacz) gewVar.e.get()).getClass();
        aadd aaddVar = (aadd) gewVar.f.get();
        aaddVar.getClass();
        swq swqVar = (swq) gewVar.g.get();
        swqVar.getClass();
        ((teb) gewVar.h.get()).getClass();
        ajjr ajjrVar = (ajjr) gewVar.i.get();
        ajjrVar.getClass();
        azqb azqbVar4 = gewVar.j;
        aynx aynxVar = (aynx) gewVar.k.get();
        aynxVar.getClass();
        eci eciVar = (eci) gewVar.l.get();
        eciVar.getClass();
        recyclerView.getClass();
        actiVar2.getClass();
        ajsaVar.getClass();
        ajkbVar.getClass();
        tduVar.getClass();
        gev gevVar = new gev(ajsgVar, ajyxVar, yniVar2, yzjVar2, aaddVar, swqVar, ajjrVar, azqbVar4, aynxVar, eciVar, null, ajpaVar, recyclerView, iueVar2, odqVar, actiVar2, ajsaVar, akaiVar, ajzsVar, 0, ajkbVar, tduVar, ajkj.a, activity, a3, new ArrayDeque());
        this.q = gevVar;
        hhw.l(gevVar);
        this.q.u(ezv.i());
        this.q.u(new obr(this));
        this.q.u(new kxi(2));
        this.q.u(new obr(this, 1));
        this.o.aE(this.ac.c.a);
        ajsm ajsmVar = this.S.a;
        this.q.J(ajsmVar);
        ajsmVar.lT(new obs(this, ajsmVar));
        this.u.f.add(this.S);
        this.q.r = this.aF;
        if (TextUtils.isEmpty(this.g)) {
            ocx ocxVar = new ocx(this.m);
            ocw ocwVar = this.P;
            oeg oegVar2 = this.m;
            View view2 = this.aC;
            View view3 = this.aD;
            acti b = this.d.b(ocxVar);
            Activity activity2 = (Activity) ocwVar.a.get();
            activity2.getClass();
            ocz oczVar = (ocz) ocwVar.b.get();
            oczVar.getClass();
            oer oerVar = (oer) ocwVar.c.get();
            oerVar.getClass();
            aacz aaczVar = (aacz) ocwVar.d.get();
            aaczVar.getClass();
            oek oekVar = (oek) ocwVar.e.get();
            oekVar.getClass();
            oei oeiVar = (oei) ocwVar.f.get();
            oeiVar.getClass();
            aadd aaddVar2 = (aadd) ocwVar.g.get();
            aaddVar2.getClass();
            oegVar2.getClass();
            view2.getClass();
            view3.getClass();
            b.getClass();
            this.aI = new ocv(activity2, oczVar, oerVar, aaczVar, oekVar, oeiVar, aaddVar2, oegVar2, view2, view3, b);
            ocxVar.b(new acuk() { // from class: obl
                @Override // defpackage.acuk
                public final void a() {
                    DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                    defaultWatchPanelViewController.r();
                    defaultWatchPanelViewController.c.a(defaultWatchPanelViewController.d);
                }
            });
        } else {
            ocd ocdVar = this.Q;
            oeg oegVar3 = this.m;
            View view4 = this.aE;
            String str = this.g;
            aafo aafoVar = (aafo) ocdVar.a.get();
            aafoVar.getClass();
            ocn ocnVar = (ocn) ocdVar.b.get();
            ocnVar.getClass();
            azqb azqbVar5 = ocdVar.c;
            azqb azqbVar6 = ocdVar.d;
            ocz oczVar2 = (ocz) ocdVar.e.get();
            oczVar2.getClass();
            acti actiVar3 = (acti) ocdVar.f.get();
            actiVar3.getClass();
            nml nmlVar = (nml) ocdVar.g.get();
            nmlVar.getClass();
            ezh ezhVar = (ezh) ocdVar.h.get();
            ezhVar.getClass();
            ghs ghsVar = (ghs) ocdVar.i.get();
            ghsVar.getClass();
            ahub ahubVar = (ahub) ocdVar.j.get();
            ahubVar.getClass();
            acud acudVar = (acud) ocdVar.k.get();
            acudVar.getClass();
            oegVar3.getClass();
            view4.getClass();
            str.getClass();
            this.aI = new occ(aafoVar, ocnVar, azqbVar5, azqbVar6, oczVar2, actiVar3, nmlVar, ezhVar, ghsVar, ahubVar, acudVar, oegVar3, view4, str);
            this.t = new ocq(this.aE, this.e);
        }
        oat oatVar = new oat(this.a.getResources().getDimensionPixelSize(R.dimen.autonav_scroll_cancel_padding), this.e, this.ar, this.W, this.m, this.S, this.ad, this.o, this.q);
        this.aG = oatVar;
        oatVar.d.aE(oatVar);
        oatVar.b.d(oatVar);
        if (oas.h(oatVar.b.b)) {
            oatVar.c.i(oatVar);
        }
        oatVar.a.g().a(oatVar);
        oeb oebVar = this.R;
        Activity activity3 = this.a;
        ViewStub viewStub = (ViewStub) this.n.findViewById(R.id.info_cards_drawer);
        oas oasVar = this.ar;
        Activity activity4 = (Activity) oebVar.a.get();
        activity4.getClass();
        aaar aaarVar = (aaar) oebVar.b.get();
        aaarVar.getClass();
        aaan aaanVar = (aaan) oebVar.c.get();
        aaanVar.getClass();
        viewStub.getClass();
        oasVar.getClass();
        this.aK = new oea(activity4, aaarVar, aaanVar, activity3, viewStub, oasVar);
        this.aM = this.aw.a.C(oav.c).n().Z(new obh(this));
        if (frtVar != null) {
            if (frtVar.d()) {
                q((ViewGroup) ((fqo) frtVar).a);
            } else {
                frtVar.b(new frs() { // from class: obg
                    @Override // defpackage.frs
                    public final void a(View view5) {
                        DefaultWatchPanelViewController.this.q((ViewGroup) view5);
                    }
                });
            }
        }
        if (ajcVar != null) {
            int childCount = this.n.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = this.n.getChildAt(childCount);
                if (childAt.getLayoutParams() instanceof ajf) {
                    ((ajf) childAt.getLayoutParams()).b(ajcVar);
                }
            }
        }
        if (nunVar != null) {
            this.h = nunVar;
            adoa adoaVar = (adoa) this.ag.a.get();
            adoaVar.getClass();
            this.ax = new nux(adoaVar, nunVar);
            nuj nujVar = this.ah;
            ezh ezhVar2 = (ezh) nujVar.a.get();
            ezhVar2.getClass();
            gck gckVar = (gck) nujVar.b.get();
            gckVar.getClass();
            view.getClass();
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.flexy_minimum_metadata_view_height);
            i = R.id.set_bar;
            this.ay = new nui(ezhVar2, gckVar, view, dimensionPixelOffset, nunVar);
            this.ar.d(this.ax);
            this.ar.c(this.ax);
            this.ar.d(this.ay);
            nug nugVar = this.ai;
            fdo fdoVar = (fdo) nugVar.a.get();
            fdoVar.getClass();
            xgp xgpVar = (xgp) nugVar.b.get();
            xgpVar.getClass();
            PlaybackLifecycleMonitor playbackLifecycleMonitor = (PlaybackLifecycleMonitor) nugVar.c.get();
            playbackLifecycleMonitor.getClass();
            aacz aaczVar2 = (aacz) nugVar.d.get();
            aaczVar2.getClass();
            final nuw nuwVar = (nuw) nunVar;
            nuf nufVar = new nuf(fdoVar, xgpVar, playbackLifecycleMonitor, aaczVar2, nuwVar);
            this.j = nufVar;
            this.ar.d(nufVar);
            this.ar.c(this.j);
            nuwVar.g = new gfo(view);
            aqxe aqxeVar2 = this.an.b.b().C;
            if (aqxeVar2 == null) {
                aqxeVar2 = aqxe.a;
            }
            if (!aqxeVar2.a(45352688L)) {
                bool = false;
            } else {
                aoqp aoqpVar2 = aqxeVar2.b;
                if (!aoqpVar2.containsKey(45352688L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45352688L);
                bool = Boolean.valueOf(aqxfVar2.b == 1 ? ((Boolean) aqxfVar2.c).booleanValue() : false);
            }
            if (bool.booleanValue()) {
                final int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_entry_point_height);
                this.aN = this.m.c.n().Z(new ayqb() { // from class: obp
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        nuw nuwVar2 = nuw.this;
                        int i4 = dimensionPixelSize;
                        if (true != ((Boolean) obj).booleanValue()) {
                            i4 = 0;
                        }
                        if (nuwVar2.n == i4) {
                            return;
                        }
                        nuwVar2.n = i4;
                        nuwVar2.D(nuwVar2.p, nuwVar2.o);
                        nuwVar2.F(nuwVar2.c.isRunning() ? nuwVar2.p / nuwVar2.q : nuwVar2.i, true, false);
                    }
                });
            }
            nud nudVar = new nud(nunVar, this.aQ);
            this.k = nudVar;
            this.ar.c(nudVar);
            this.aA = new nqj() { // from class: obj
                @Override // defpackage.nqj
                public final void g(nmc nmcVar) {
                    DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                    nud nudVar2 = defaultWatchPanelViewController.k;
                    nudVar2.b = nmcVar;
                    nudVar2.b();
                    nuf nufVar2 = defaultWatchPanelViewController.j;
                    boolean z = false;
                    if (nmcVar != null && nmcVar.l() != null && !TextUtils.isEmpty(defaultWatchPanelViewController.g) && defaultWatchPanelViewController.g.equals(ntr.d(nmcVar.l()))) {
                        z = true;
                    }
                    nufVar2.b = z;
                }
            };
            this.e.g().a(this.aA);
            oej oejVar = new oej() { // from class: obk
                @Override // defpackage.oej
                public final void a(boolean z) {
                    nud nudVar2 = DefaultWatchPanelViewController.this.k;
                    nudVar2.a = z;
                    nudVar2.b();
                }
            };
            this.az = oejVar;
            this.Z.a(oejVar);
        } else {
            i = R.id.set_bar;
        }
        this.v = new gfm((StickyHeaderContainer) this.n.findViewById(R.id.sticky_header_container), (xo) this.q.f, new odo(((ajwb) this.q).e));
        if (Build.VERSION.SDK_INT >= 22) {
            this.o.setAccessibilityTraversalAfter(i);
        }
        return this;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // defpackage.oeu
    public final void p(oan oanVar) {
        this.ar.e(oanVar);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!this.W.g().b()) {
            abja abjaVar = (abja) this.V.get();
            if (abjaVar.e != null) {
                ((abiq) abjaVar.a.get()).w(abjaVar.e.b());
                ((abhz) abjaVar.b.get()).c(abjaVar.e.a());
            }
        }
        r();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.oak
    public final void pg(oan oanVar, oan oanVar2) {
        fgh fghVar = null;
        if (oanVar != null) {
            this.T.d(oanVar.h.c());
            oanVar.j(this);
            oanVar.i((this.aH.isEmpty() || ((LoadingFrameLayout) this.aH.get(0)).e != 2 || this.p.J() <= 0) ? null : this.q.p());
        }
        if (oanVar2 != null) {
            oanVar2.g(this);
        }
        if (oanVar2 != null) {
            fghVar = oanVar2.h;
        }
        A(fghVar);
        g(oanVar2, 127);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.ViewGroup r16) {
        /*
            r15 = this;
            r0 = r15
            r9 = r16
            if (r9 != 0) goto L6
            return
        L6:
            android.app.Activity r1 = r0.a
            r2 = 2130970600(0x7f0407e8, float:1.7549915E38)
            j$.util.OptionalInt r1 = defpackage.zhn.j(r1, r2)
            r10 = 0
            int r1 = r1.orElse(r10)
            r9.setBackgroundColor(r1)
            r11 = r9
            com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r11 = (com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout) r11
            odv r1 = r0.aa
            r12 = 1
            odu r13 = r1.a(r11, r12)
            obf r1 = r0.at
            r2 = 2131431981(0x7f0b122d, float:1.8485707E38)
            android.view.View r2 = r11.findViewById(r2)
            android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
            azqb r5 = r0.O
            ajsg r6 = r0.Y
            acti r7 = r0.d
            ajzq r8 = r0.q
            obe r14 = new obe
            azqb r1 = r1.a
            java.lang.Object r1 = r1.get()
            r4 = r1
            odn r4 = (defpackage.odn) r4
            r4.getClass()
            r2.getClass()
            r5.getClass()
            r7.getClass()
            r8.getClass()
            android.support.v7.widget.LinearLayoutManager r3 = new android.support.v7.widget.LinearLayoutManager
            r2.getContext()
            r3.<init>()
            r1 = r14
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.aF = r14
            oas r1 = r0.ar
            oan r1 = r1.a
            if (r1 != 0) goto L68
            r11.e()
            goto Lc7
        L68:
            aikd r2 = r1.f
            if (r2 == 0) goto L90
            boolean r1 = defpackage.oan.k(r2)
            if (r1 == 0) goto L7d
            feb r1 = r0.N
            r1.getClass()
            obn r3 = new obn
            r3.<init>(r1)
            goto L87
        L7d:
            feb r1 = r0.N
            r1.getClass()
            obn r3 = new obn
            r3.<init>(r1, r12)
        L87:
            r11.f(r3)
            r13.a = r3
            r13.a(r2)
            goto Lc7
        L90:
            java.util.ArrayList r2 = r0.aH
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L99
            goto La8
        L99:
            java.util.ArrayList r2 = r0.aH
            java.lang.Object r2 = r2.get(r10)
            com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r2 = (com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout) r2
            int r2 = r2.e
            if (r2 == r12) goto Lb0
            r3 = 2
            if (r2 == r3) goto Lac
        La8:
            r11.e()
            goto Lb3
        Lac:
            r11.a()
            goto Lb3
        Lb0:
            r11.c()
        Lb3:
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r2 = r1.c()
            if (r2 == 0) goto Lbe
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r1 = r1.c()
            goto Lc2
        Lbe:
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r1 = r1.b()
        Lc2:
            oec r2 = r0.aF
            r2.c(r1)
        Lc7:
            r15.v(r11)
            java.util.ArrayList r1 = r0.aJ
            r1.add(r13)
            android.content.res.Configuration r1 = r0.x
            if (r1 == 0) goto Ld8
            oec r2 = r0.aF
            r2.b(r1)
        Ld8:
            ajzq r1 = r0.q
            if (r1 == 0) goto Le0
            oec r2 = r0.aF
            r1.r = r2
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController.q(android.view.ViewGroup):void");
    }

    public final void r() {
        this.M.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r6, defpackage.acuv r7) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController.s(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel, acuv):void");
    }

    public final void t() {
        if (this.aL == null || !this.w.a(ahty.LOGGED_ATTACH_WATCH_NEXT)) {
            return;
        }
        this.aL.run();
        this.aL = null;
    }

    public final boolean u(Configuration configuration) {
        return zew.y(this.a) && configuration.orientation == 2 && !this.y;
    }

    @Override // defpackage.nqy
    public final void w(boolean z, zar zarVar) {
        if (z) {
            this.m.g(8, zarVar);
        } else {
            this.m.d(8, zarVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ezg, adwm, nwa, xgn] */
    private final void z() {
        boolean z;
        ?? r1 = this.i;
        if (r1 != 0) {
            final nvp nvpVar = (nvp) r1;
            if (!nvpVar.C) {
                nvpVar.C = true;
                if (eog.aq(nvpVar.D)) {
                    nvpVar.o.c();
                    nvpVar.o.g(nvpVar.r.g(nvpVar.n));
                } else {
                    nvpVar.q.g(nvpVar.r);
                }
                nvpVar.l.b(r1);
                nwf nwfVar = nvpVar.j;
                if (eog.aq(nwfVar.k)) {
                    nwfVar.i.c();
                    nwfVar.i.g(nwfVar.g(nwfVar.h));
                } else {
                    nwfVar.j.g(nwfVar);
                }
                nvpVar.p.d(nvpVar.n.G().f.Z(new nvi(nvpVar, 1)));
                nvpVar.p.d(aynx.sn(nvpVar.u, nvpVar.t, nvpVar.v, img.k).n().aa(new nvi(nvpVar), npy.i));
                nvpVar.p.d(aynx.e(nvpVar.n.G().i, nvpVar.t, new aypx() { // from class: nvh
                    @Override // defpackage.aypx
                    public final Object a(Object obj, Object obj2) {
                        int i;
                        nvp nvpVar2 = nvp.this;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        switch (((ahia) obj).a()) {
                            case 2:
                            case 5:
                                i = 1;
                                break;
                            case 3:
                            case 4:
                            case 6:
                                i = nvpVar2.c(false, booleanValue);
                                break;
                            case 7:
                                i = 3;
                                break;
                            case 8:
                                i = 2;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        return Integer.valueOf(i);
                    }
                }).n().aa(new nvi(nvpVar, 2), npy.i));
                nvpVar.k.a(r1);
                nvpVar.m.i(r1);
            }
            nvp nvpVar2 = (nvp) this.i;
            if (!TextUtils.isEmpty(nvpVar2.g.getText()) || ((airr) nvpVar2.c.get()).o() == null) {
                return;
            }
            airr airrVar = (airr) nvpVar2.c.get();
            ajbf o = airrVar.o();
            PlayerResponseModel c = o.c();
            if (c != null) {
                nvpVar2.j.nS(o.b(), 0L, TimeUnit.SECONDS.toMillis(c.a()), o.a());
                nvpVar2.f(c.A());
                if (nvpVar2.x.j == 2) {
                    nvpVar2.h.b(c.z());
                }
                z = c.I();
            } else {
                z = false;
            }
            nvpVar2.i.e(nvpVar2.c(airrVar.d(), z));
        }
    }
}
