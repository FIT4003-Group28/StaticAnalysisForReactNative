package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_TransformAlphaActionBarColor;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: iou  reason: default package */
/* loaded from: classes3.dex */
public class iou extends ioz implements nhb, ngz, akai, fxi, nha, ydp, imz, ynl {
    public static final /* synthetic */ int cp = 0;
    private static final amvn cq = amvn.t("FEnotifications_inbox", "FEactivity", "FEhistory");
    private static final amvn cr = amvn.s("FEpremium_member_hub", "FEconnections");
    ajpm a;
    public fsl aA;
    public gfr aC;
    gfs aD;
    public aath aE;
    public ite aF;
    public axnm aG;
    public ajmy aH;
    public yzj aI;
    public snc aJ;
    public azqb aK;
    public yni aL;
    public ajyi aM;
    public agca aN;
    public Handler aO;
    public azqb aP;
    public agbz aQ;
    public AppTabsBar aR;
    public ngu aS;
    public nhg aT;
    public nhv aU;
    public nhs aV;
    public nhi aW;
    public ngy aX;
    public nhk aY;
    public nhy aZ;
    public fyg ae;
    public CharSequence af;
    public boolean ag;
    public boolean ah;
    public int aj;
    protected long ak;
    public axnm al;
    public luf am;
    public boolean az;
    public Resources b;
    public fcd bA;
    public acrr bB;
    public azqb bC;
    public ScheduledExecutorService bD;
    public fwx bE;
    public fxh bF;
    public azqb bG;
    public azqb bH;
    public Optional bI;
    public azqb bJ;
    public nfk bK;
    public acvh bL;
    public ezq bM;
    public LayerableFilterEntityController bN;
    public lwb bO;
    public lwm bP;
    public lvz bQ;
    public lyr bR;
    public tdu bS;
    public ajxq bT;
    public akcq bU;
    public akvm bV;
    public gfu bW;
    public lba bX;
    public lct bY;
    public ind bZ;
    public nfz ba;
    public nim bb;
    public fhh bc;
    public aafo bd;
    public azqb be;
    public lve bf;
    public lqi bg;
    public ltk bh;
    public nik bi;
    public yzv bj;
    public ydq bk;
    public aadd bl;
    public InlinePlaybackLifecycleController bm;
    public akar bn;
    public ActiveStateScrollSelectionController bo;
    public akar bp;
    public mbu bq;
    public mbu br;
    public ixr bs;
    public zjb bt;
    public aakt bu;
    public ajsg bv;
    public ioy bw;
    public lox bx;
    public akfw by;
    public jln bz;
    private String cA;
    private low cC;
    private akam cD;
    private aypg cE;
    private boolean cI;
    private boolean cK;
    private ioq cL;
    private boolean cM;
    private ajsm cN;
    private aypg cO;
    private iox cP;
    private Set cQ;
    private acvg cR;
    private long cS;
    private ScheduledFuture cU;
    private ViewGroup cV;
    private String cW;
    public nml ca;
    public mas cb;
    public axnm cc;
    public axwt cd;
    public zex ce;
    public boolean ch;
    public acti ck;
    public lnj cl;
    public aacz cm;
    public sdb cn;
    public aiiv co;
    private inb cs;
    private Context ct;
    private ior cu;
    private ajyk cw;
    private BrowseResponseModel cy;
    private avfo cz;
    protected fsv d;
    protected nij e;
    private final azpx cv = azpq.e().aO();
    public Optional c = Optional.empty();
    private Optional cx = Optional.empty();
    public apzg ai = apzg.a;
    private final List cB = new ArrayList();
    private final aypf cF = new aypf();
    private final List cG = new ArrayList();
    private aypg cH = banl.m();
    private byte[] cJ = new byte[0];
    public ActionBarColor an = hve.i(R.attr.ytBrandBackgroundSolid);
    public ActionBarColor ao = hve.i(R.attr.ytStatusBarBackground);
    public ActionBarColor aw = hve.i(R.attr.ytTextPrimary);
    public ActionBarColor ax = hve.i(R.attr.ytTextSecondary);
    public ActionBarColor ay = hve.i(R.attr.ytIconActiveOther);
    public boolean aB = true;
    private final AtomicBoolean cT = new AtomicBoolean(false);
    public apzg cf = apzg.a;
    public Optional cg = Optional.empty();
    public int ci = 0;
    public int cj = 0;
    private final View.OnLayoutChangeListener cX = new View.OnLayoutChangeListener() { // from class: ine
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            iou iouVar = iou.this;
            iouVar.ci = view.getWidth();
            iouVar.cj = view.getHeight();
        }
    };
    private final fsu cY = new ioo(this, 1);

    private static int bD(Bundle bundle, String str, final Context context) {
        return ((Integer) Optional.ofNullable(bundle.getParcelable(str)).filter(gka.f).map(iob.a).map(new Function() { // from class: iny
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                Context context2 = context;
                int i = iou.cp;
                return Integer.valueOf(((ActionBarColor) obj).la(context2));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElse(0)).intValue();
    }

    private final lcs bE() {
        lcs f;
        luf lufVar = this.am;
        return (lufVar == null || (f = lufVar.f()) == null) ? this.bY.a(this, this.bX.a(null, null), null, oi()) : f;
    }

    private static ngq bF(asos asosVar) {
        ngp a = ngq.a();
        a.d(hve.h(asosVar.e));
        a.e(hve.h(asosVar.f));
        a.b(hve.h(asosVar.b));
        a.f(hve.h(asosVar.c));
        a.c(hve.h(asosVar.e));
        return a.a();
    }

    private final ngq bG() {
        ngp a = ngq.a();
        a.d(this.as.m);
        a.e(this.as.o);
        a.b(this.as.j);
        a.f(this.as.k);
        a.c(this.as.a.d);
        return a.a();
    }

    private final aakw bH() {
        avfo g = this.e.g();
        if (g != null) {
            avfk avfkVar = g.k;
            if (avfkVar == null) {
                avfkVar = avfk.a;
            }
            if ((avfkVar.b & 1) == 0) {
                return null;
            }
            avfk avfkVar2 = g.k;
            if (avfkVar2 == null) {
                avfkVar2 = avfk.a;
            }
            auqh auqhVar = avfkVar2.c;
            if (auqhVar == null) {
                auqhVar = auqh.a;
            }
            return new aakw(auqhVar);
        }
        return null;
    }

    private final acup bI() {
        String c = aaji.c(s());
        if (c == null) {
            return acuo.a(6827);
        }
        asxp asxpVar = this.bl.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (!asxpVar.az || !bU()) {
            if (((c.hashCode() == 714505897 && c.equals("FEred_originals_home")) ? (char) 0 : (char) 65535) == 0) {
                return acuo.a(34388);
            }
            return acuo.a(6827);
        }
        return acuo.a(3854);
    }

    private final Object bJ() {
        return this.cx.map(iob.p).orElse(null);
    }

    private final void bK() {
        lwm lwmVar = this.bP;
        if (lwmVar != null) {
            lwmVar.g();
        }
        this.cF.c();
        aypg aypgVar = this.cE;
        if (aypgVar != null) {
            aypgVar.qr();
        }
        this.bR.f();
        ajzq f = this.e.f();
        if (f != null) {
            f.h();
        }
    }

    private final void bL() {
        atia atiaVar;
        atxm atxmVar;
        atia atiaVar2;
        apzg apzgVar = this.ai;
        oi().e(bI(), acuc.DEFAULT, apzgVar, acty.a(apzgVar, askh.b), acty.a(apzgVar, askh.a));
        oi().n(new acte(acuo.b(22156)));
        luf lufVar = this.am;
        final fsm a = lufVar == null ? null : lufVar.a();
        if (a != null) {
            Optional.ofNullable(oi().c()).map(ioc.a).ifPresent(new Consumer() { // from class: inr
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    fsm.this.n((String) obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
            a.o();
        }
        oi().n(new acte(acuo.b(10349)));
        this.cW = oi().k();
        aruk arukVar = ((okf) this.bJ.get()).e().a;
        if (arukVar != null && (arukVar.b & 16) != 0) {
            oi().D(new acte(arukVar.e.I()));
            if (arukVar.d.size() != 0) {
                for (arul arulVar : arukVar.d) {
                    if (arulVar.b == 123267149) {
                        atiaVar = (atia) arulVar.c;
                    } else {
                        atiaVar = atia.a;
                    }
                    if ((atiaVar.b & 4) != 0) {
                        acti oi = oi();
                        if (arulVar.b == 123267149) {
                            atiaVar2 = (atia) arulVar.c;
                        } else {
                            atiaVar2 = atia.a;
                        }
                        oi.u(new acte(atiaVar2.c), null);
                    }
                    if (arulVar.b == 117866661) {
                        atxmVar = (atxm) arulVar.c;
                    } else {
                        atxmVar = atxm.a;
                    }
                    Collection.EL.stream(atxmVar.b).map(ioc.e).filter(gka.i).map(ioc.g).map(ioc.h).forEach(new ins(this, 7));
                }
            }
        }
        lcs bE = bE();
        if (eog.R(this.bl)) {
            Optional.ofNullable(oi().c()).map(ioc.a).ifPresent(new inv(bE));
            bE.k = bI().a;
        }
        this.ck = oi();
    }

    private final void bM() {
        Optional.ofNullable(this.cU).ifPresent(fyb.r);
        this.cU = null;
    }

    private final void bN(boolean z, Optional optional) {
        boolean k;
        ior iorVar;
        mbt q = q();
        fhg p = p();
        akam akamVar = null;
        if (z && (iorVar = this.cu) != null) {
            akamVar = iorVar.r;
        }
        aakw bH = bH();
        final lwm lwmVar = this.bP;
        if (bH == null || lwmVar == null || p == null || q == null || !bu(q, p)) {
            return;
        }
        acti oi = oi();
        frv frvVar = (frv) this.al.get();
        if (oi == null) {
            oi = acti.l;
        }
        String c = aaji.c(s());
        frvVar.getClass();
        if (akamVar != null) {
            k = lwmVar.p(akamVar, q, oi);
        } else {
            k = lwmVar.k(bH, q, oi);
        }
        if (!k) {
            frvVar.i();
            if (!lxh.f(c) && !lxh.e(c)) {
                return;
            }
            lxh.b(frvVar, lwmVar, q, p, oi, c);
            return;
        }
        fsg a = lxh.a(lwmVar, q, p);
        a.a = c;
        a.e(((Boolean) optional.map(new Function() { // from class: lxf
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(lwm.this.c().contains((String) obj));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElse(false)).booleanValue());
        frvVar.m(a.a());
        lxh.b(frvVar, lwmVar, q, p, oi, c);
    }

    private final void bO(boolean z) {
        mbt q = q();
        fhg p = p();
        if (q == null || p == null) {
            return;
        }
        acti r = r();
        this.cF.c();
        this.cF.d(p.c.I(ikb.m).as(new inf(this)));
        this.cF.d(this.bR.c().as(new inf(this, 6)));
        q.x(new ioi(this, q));
        aakw bH = bH();
        boolean i = this.bR.i();
        akam akamVar = (akam) Optional.ofNullable(this.cu).map(iob.i).orElse(null);
        if (z) {
            if (akamVar != null) {
                this.bR.m(akamVar, q, r);
            }
        } else if (bH != null && lxy.c(bH)) {
            this.bR.l(bH, q, r);
        }
        if (i == this.bR.i()) {
            return;
        }
        bj();
    }

    private final void bP() {
        avfo g = this.e.g();
        if (this.e == null || g == null) {
            return;
        }
        lvz lvzVar = this.bQ;
        avfm avfmVar = g.i;
        if (avfmVar == null) {
            avfmVar = avfm.a;
        }
        if ((avfmVar.b & 64) != 0) {
            avfm avfmVar2 = g.i;
            if (avfmVar2 == null) {
                avfmVar2 = avfm.a;
            }
            avfh avfhVar = avfmVar2.e;
            if (avfhVar == null) {
                avfhVar = avfh.a;
            }
            aunb aunbVar = avfhVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aqtb aqtbVar = (aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer);
            fsq fsqVar = new fsq();
            if (aqtbVar != null) {
                fsqVar.a = aqtbVar;
                if ((avfhVar.b & 2) == 0) {
                    lvzVar.a.c(Optional.empty());
                } else {
                    String str = avfhVar.d;
                    fsqVar.b = str;
                    lvzVar.a.c(Optional.of(str));
                }
                aqtb aqtbVar2 = fsqVar.a;
                if (aqtbVar2 == null) {
                    throw new IllegalStateException("Missing required properties: elementRenderer");
                }
                lvzVar.b = new fsr(aqtbVar2, fsqVar.b);
                bj();
                if (this.cO != null) {
                    return;
                }
                final lvz lvzVar2 = this.bQ;
                this.cO = lvzVar2.a.af(new ayqe() { // from class: lvx
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        final aksb aksbVar = lvz.this.c;
                        aksbVar.getClass();
                        return (ayok) ((Optional) obj).map(new Function() { // from class: lvy
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                return function.getClass();
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj2) {
                                return aksb.this.a.a.I(new nli((String) obj2, 5)).V(ajcg.c);
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                return function.getClass();
                            }
                        }).orElse(ayoi.G());
                    }
                }).as(new inf(this, 5));
                return;
            }
            throw new NullPointerException("Null elementRenderer");
        }
        lvzVar.b = null;
        lvzVar.a.c(Optional.empty());
    }

    private final void bQ(boolean z) {
        if (z) {
            this.cK = this.bu.a();
            nfz nfzVar = this.ba;
            foz fozVar = nfzVar.d;
            if (fozVar != null) {
                fozVar.a = null;
            }
            foz fozVar2 = nfzVar.e;
            if (fozVar2 != null) {
                fozVar2.a = null;
            }
            foz fozVar3 = nfzVar.f;
            if (fozVar3 != null) {
                fozVar3.a = null;
            }
            foz fozVar4 = nfzVar.g;
            if (fozVar4 != null) {
                fozVar4.a = null;
            }
            foz fozVar5 = nfzVar.h;
            if (fozVar5 != null) {
                fozVar5.a = null;
            }
            nfzVar.b.a(null);
            ggi ggiVar = nfzVar.c;
            if (ggiVar != null) {
                ggiVar.a(null);
            }
            for (String str : this.cQ) {
                this.by.g(str);
            }
            this.cQ.clear();
        }
        this.az = false;
        this.cM = false;
        this.e.k();
        ((frv) this.al.get()).g();
        lwm lwmVar = this.bP;
        if (lwmVar != null) {
            lwmVar.g();
        }
        this.cF.c();
        aypg aypgVar = this.cE;
        if (aypgVar != null) {
            aypgVar.qr();
        }
        this.bR.f();
        ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).g();
        fyg fygVar = this.ae;
        fygVar.e();
        fygVar.b();
        fyf fyfVar = fygVar.c;
        fyfVar.a.clear();
        fyfVar.b.clear();
        fygVar.e = null;
        fygVar.f = null;
        Optional.ofNullable(fygVar.i).ifPresent(fyb.b);
        Optional.ofNullable(fygVar.j).ifPresent(fyb.a);
        for (fhg fhgVar : this.cB) {
            fhgVar.b();
        }
        this.cB.clear();
        bj();
    }

    private final void bR() {
        if (!TextUtils.equals(aaji.c(s()), "FEwhat_to_watch")) {
            return;
        }
        bM();
        long d = this.ak - this.aJ.d();
        ScheduledExecutorService scheduledExecutorService = this.bD;
        inn innVar = new inn(this, 3);
        if (d <= 0) {
            d = 0;
        }
        this.cU = scheduledExecutorService.schedule(innVar, d, TimeUnit.MILLISECONDS);
    }

    private final void bS() {
        ngq bG;
        apta aptaVar;
        atep atepVar;
        atep atepVar2;
        asos asosVar;
        atep atepVar3;
        atep atepVar4;
        Object bJ = bJ();
        BrowseResponseModel browseResponseModel = this.cy;
        if (bJ instanceof appd) {
            appd appdVar = (appd) bJ;
            appb appbVar = appdVar.t;
            if (appbVar == null) {
                appbVar = appb.a;
            }
            if (appbVar.b == 66439850) {
                atepVar2 = (atep) appbVar.c;
            } else {
                atepVar2 = atep.a;
            }
            if (atepVar2.c.size() > 0) {
                appb appbVar2 = appdVar.t;
                if (appbVar2 == null) {
                    appbVar2 = appb.a;
                }
                if (appbVar2.b == 66439850) {
                    atepVar3 = (atep) appbVar2.c;
                } else {
                    atepVar3 = atep.a;
                }
                if ((((aten) atepVar3.c.get(0)).b & 1) != 0 && !this.cM) {
                    lve lveVar = this.bf;
                    appb appbVar3 = appdVar.t;
                    if (appbVar3 == null) {
                        appbVar3 = appb.a;
                    }
                    if (appbVar3.b == 66439850) {
                        atepVar4 = (atep) appbVar3.c;
                    } else {
                        atepVar4 = atep.a;
                    }
                    lveVar.c(atepVar4);
                    this.cM = true;
                }
            }
            oa oaVar = this.ap;
            apoy apoyVar = appdVar.g;
            if (apoyVar == null) {
                apoyVar = apoy.a;
            }
            if (apoyVar.b != 131084815) {
                avhn avhnVar = appdVar.h;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                if (!akel.A(avhnVar) || oaVar == null) {
                    bo(by());
                    return;
                }
                if (this.cL == null) {
                    this.cL = new ioq(this);
                }
                ajmy ajmyVar = this.aH;
                avhn avhnVar2 = appdVar.h;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                ajmyVar.l(akel.t(avhnVar2), yit.c(oaVar, this.cL));
                return;
            }
            apoy apoyVar2 = appdVar.g;
            if (apoyVar2 == null) {
                apoyVar2 = apoy.a;
            }
            if (apoyVar2.b == 131084815) {
                asosVar = (asos) apoyVar2.c;
            } else {
                asosVar = asos.a;
            }
            bo(bF(asosVar));
            return;
        }
        if (browseResponseModel != null) {
            arlo arloVar = browseResponseModel.a.d;
            if (arloVar == null) {
                arloVar = arlo.a;
            }
            if (arloVar.b == 361905772) {
                arlo arloVar2 = browseResponseModel.a.d;
                if (arloVar2 == null) {
                    arloVar2 = arlo.a;
                }
                if (arloVar2.b == 361905772) {
                    aptaVar = (apta) arloVar2.c;
                } else {
                    aptaVar = apta.a;
                }
                apsz apszVar = aptaVar.d;
                if (apszVar == null) {
                    apszVar = apsz.a;
                }
                if (apszVar.b == 66439850) {
                    atepVar = (atep) apszVar.c;
                } else {
                    atepVar = atep.a;
                }
                if (atepVar.c.size() > 0 && (((aten) atepVar.c.get(0)).b & 1) != 0 && !this.cM) {
                    this.bf.c(atepVar);
                    this.cM = true;
                }
                bo(bG());
                return;
            }
        }
        if (bJ instanceof aucu) {
            aucu aucuVar = (aucu) bJ;
            if ((aucuVar.b & 256) != 0) {
                asos asosVar2 = aucuVar.l;
                if (asosVar2 == null) {
                    asosVar2 = asos.a;
                }
                bG = bF(asosVar2);
            } else {
                bG = bG();
            }
        } else if (bJ instanceof avkv) {
            avkv avkvVar = (avkv) bJ;
            if (bA() == 3) {
                ngp a = ngq.a();
                a.d(this.as.m);
                a.e(this.as.o);
                ActionBarColor actionBarColor = this.as.j;
                actionBarColor.getClass();
                aqxo.s(true, "alpha value must be between 0 and 255 inclusive, was %s", 179);
                a.b(new AutoValue_ActionBarColor_TransformAlphaActionBarColor(actionBarColor, 179));
                a.f(this.as.k);
                a.c(this.as.m);
                bG = a.a();
            } else {
                ngp a2 = ngq.a();
                a2.d(hve.h(avkvVar.e));
                a2.e(hve.h(avkvVar.f));
                a2.b(hve.h(avkvVar.c));
                a2.f(hve.h(avkvVar.d));
                a2.c(hve.h(avkvVar.e));
                bG = a2.a();
            }
        } else if (bJ instanceof avzy) {
            ngp a3 = ngq.a();
            a3.d(hve.i(R.attr.ytTextPrimary));
            a3.e(hve.i(R.attr.ytTextSecondary));
            a3.b(hve.i(R.attr.ytBrandBackgroundSolid));
            a3.f(hve.i(R.attr.ytIconDisabled));
            a3.c(hve.i(R.attr.ytIconActiveOther));
            bG = a3.a();
        } else {
            bG = bG();
        }
        bo(bG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0496  */
    /* JADX WARN: Type inference failed for: r10v25, types: [lsv] */
    /* JADX WARN: Type inference failed for: r10v26, types: [ltw] */
    /* JADX WARN: Type inference failed for: r10v27, types: [lsv] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [auqa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bT(java.util.List r53, java.lang.Object r54, int r55) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iou.bT(java.util.List, java.lang.Object, int):void");
    }

    private final boolean bU() {
        return akzj.f(aaji.c(s()), "FEwhat_to_watch");
    }

    private final boolean bV() {
        return ((Boolean) this.cx.map(iob.o).orElse(false)).booleanValue();
    }

    private final boolean bW() {
        return zew.y(rg()) && eog.aJ(this.cm) && bU();
    }

    private final ngj bX(BrowseResponseModel browseResponseModel) {
        apta aptaVar;
        auwm auwmVar;
        appd appdVar;
        arlo arloVar = browseResponseModel.a.d;
        if (arloVar == null) {
            arloVar = arlo.a;
        }
        if ((browseResponseModel.a.b & 2) != 0) {
            int i = arloVar.b;
            if (i == 46407682) {
                ngu nguVar = this.aS;
                acti oi = oi();
                if (arloVar.b == 46407682) {
                    appdVar = (appd) arloVar.c;
                } else {
                    appdVar = appd.a;
                }
                appd appdVar2 = appdVar;
                aafo aafoVar = (aafo) nguVar.a.get();
                aafoVar.getClass();
                luy luyVar = (luy) nguVar.b.get();
                luyVar.getClass();
                lva lvaVar = (lva) nguVar.c.get();
                akys akysVar = (akys) nguVar.d.get();
                akysVar.getClass();
                Executor executor = (Executor) nguVar.e.get();
                executor.getClass();
                gte gteVar = (gte) nguVar.f.get();
                gteVar.getClass();
                oi.getClass();
                browseResponseModel.getClass();
                appdVar2.getClass();
                return new ngt(aafoVar, luyVar, lvaVar, akysVar, executor, gteVar, oi, browseResponseModel, appdVar2);
            } else if (i == 50236216) {
                nhi nhiVar = this.aW;
                acti oi2 = oi();
                aafo aafoVar2 = (aafo) nhiVar.a.get();
                aafoVar2.getClass();
                yni yniVar = (yni) nhiVar.b.get();
                yniVar.getClass();
                lya lyaVar = (lya) nhiVar.c.get();
                lyaVar.getClass();
                luy luyVar2 = (luy) nhiVar.d.get();
                luyVar2.getClass();
                oi2.getClass();
                browseResponseModel.getClass();
                return new nhh(aafoVar2, yniVar, lyaVar, luyVar2, (lva) nhiVar.e.get(), oi2, browseResponseModel);
            } else if (i == 156098381) {
                nim nimVar = this.bb;
                acti oi3 = oi();
                aafo aafoVar3 = (aafo) nimVar.a.get();
                aafoVar3.getClass();
                yni yniVar2 = (yni) nimVar.b.get();
                yniVar2.getClass();
                lya lyaVar2 = (lya) nimVar.c.get();
                lyaVar2.getClass();
                luy luyVar3 = (luy) nimVar.d.get();
                luyVar3.getClass();
                oi3.getClass();
                browseResponseModel.getClass();
                return new nil(aafoVar3, yniVar2, lyaVar2, luyVar3, (lva) nimVar.e.get(), oi3, browseResponseModel);
            } else if (i == 53272665) {
                return this.aV.a((aucu) arloVar.c, browseResponseModel);
            } else {
                if (i == 101397128) {
                    nhv nhvVar = this.aU;
                    acti oi4 = oi();
                    if (arloVar.b == 101397128) {
                        auwmVar = (auwm) arloVar.c;
                    } else {
                        auwmVar = auwm.a;
                    }
                    auwm auwmVar2 = auwmVar;
                    aafo aafoVar4 = (aafo) nhvVar.a.get();
                    aafoVar4.getClass();
                    luy luyVar4 = (luy) nhvVar.b.get();
                    luyVar4.getClass();
                    oi4.getClass();
                    browseResponseModel.getClass();
                    auwmVar2.getClass();
                    return new nhu(aafoVar4, luyVar4, (lva) nhvVar.c.get(), oi4, browseResponseModel, auwmVar2);
                } else if (i == 102883021) {
                    ngy ngyVar = this.aX;
                    acti oi5 = oi();
                    aafo aafoVar5 = (aafo) ngyVar.a.get();
                    aafoVar5.getClass();
                    lya lyaVar3 = (lya) ngyVar.b.get();
                    lyaVar3.getClass();
                    yni yniVar3 = (yni) ngyVar.c.get();
                    yniVar3.getClass();
                    luy luyVar5 = (luy) ngyVar.d.get();
                    luyVar5.getClass();
                    oi5.getClass();
                    browseResponseModel.getClass();
                    return new ngx(aafoVar5, lyaVar3, yniVar3, luyVar5, (lva) ngyVar.e.get(), oi5, browseResponseModel);
                } else if (i == 155144651) {
                    arhn arhnVar = (arhn) arloVar.c;
                    arhnVar.getClass();
                    return new ngw(arhnVar);
                } else if (i == 155554693) {
                    nhy nhyVar = this.aZ;
                    avkv avkvVar = (avkv) arloVar.c;
                    lve lveVar = (lve) nhyVar.a.get();
                    lveVar.getClass();
                    avkvVar.getClass();
                    return new nhx(lveVar, avkvVar);
                } else if (i == 126869174) {
                    avam avamVar = (avam) arloVar.c;
                    avamVar.getClass();
                    return new nhw(avamVar);
                } else if (i == 217771576) {
                    aqdc aqdcVar = (aqdc) arloVar.c;
                    aqdcVar.getClass();
                    return new ngv(aqdcVar);
                } else if (i == 188799247) {
                    nhk nhkVar = this.aY;
                    askk askkVar = (askk) arloVar.c;
                    lve lveVar2 = (lve) nhkVar.a.get();
                    lveVar2.getClass();
                    askkVar.getClass();
                    return new nhj(lveVar2, askkVar);
                } else if (i != 361905772) {
                    return null;
                } else {
                    nhg nhgVar = this.aT;
                    acti oi6 = oi();
                    if (arloVar.b == 361905772) {
                        aptaVar = (apta) arloVar.c;
                    } else {
                        aptaVar = apta.a;
                    }
                    apta aptaVar2 = aptaVar;
                    aafo aafoVar6 = (aafo) nhgVar.a.get();
                    aafoVar6.getClass();
                    luy luyVar6 = (luy) nhgVar.b.get();
                    luyVar6.getClass();
                    lva lvaVar2 = (lva) nhgVar.c.get();
                    akys akysVar2 = (akys) nhgVar.d.get();
                    akysVar2.getClass();
                    Executor executor2 = (Executor) nhgVar.e.get();
                    executor2.getClass();
                    gte gteVar2 = (gte) nhgVar.f.get();
                    gteVar2.getClass();
                    ((ajin) nhgVar.g.get()).getClass();
                    oi6.getClass();
                    browseResponseModel.getClass();
                    aptaVar2.getClass();
                    return new nhf(aafoVar6, luyVar6, lvaVar2, akysVar2, executor2, gteVar2, oi6, browseResponseModel, aptaVar2);
                }
            }
        }
        return null;
    }

    private final void bY(ngj ngjVar) {
        this.cx.ifPresent(fyb.p);
        Optional ofNullable = Optional.ofNullable(ngjVar);
        this.cx = ofNullable;
        ofNullable.ifPresent(new ins(this, 6));
    }

    private final void bZ(ngj ngjVar) {
        if (ngjVar != null) {
            this.af = ngjVar.c();
            this.ag = ngjVar.i();
            this.ah = ngjVar.h();
        } else {
            this.af = null;
            this.ag = false;
            this.ah = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Optional.ofNullable(this.O).ifPresent(new ins(this, 1));
        }
    }

    public static final ngq by() {
        ngp a = ngq.a();
        a.d(hve.g(R.color.theme_main_tab_text_color_activated));
        a.e(hve.g(R.color.theme_main_tab_text_color_normal));
        a.b(hve.g(R.color.yt_grey3));
        a.f(hve.g(R.color.yt_grey4));
        a.c(hve.g(R.color.theme_main_tab_text_color_activated));
        return a.a();
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        if (!eog.R(this.bl) || intent == null) {
            return;
        }
        int i3 = 1000;
        if (i == 1000) {
            if (i2 == -1) {
                bE().b(intent);
                return;
            }
            i = 1000;
        }
        if (i != 1000) {
            i3 = i;
        } else if (i2 == 1) {
            String stringExtra = intent.getStringExtra("AssistantCsn");
            String str = this.cW;
            aopa createBuilder = atnp.a.createBuilder();
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            atnpVar.b |= 2;
            atnpVar.d = 22156;
            if (stringExtra != null) {
                createBuilder.copyOnWrite();
                atnp atnpVar2 = (atnp) createBuilder.instance;
                atnpVar2.b = 1 | atnpVar2.b;
                atnpVar2.c = stringExtra;
            }
            if (!str.isEmpty()) {
                createBuilder.copyOnWrite();
                atnp atnpVar3 = (atnp) createBuilder.instance;
                str.getClass();
                atnpVar3.b |= 32;
                atnpVar3.f = str;
            }
            aopc aopcVar = (aopc) this.ai.mo52toBuilder();
            aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
            apzg apzgVar = (apzg) aopcVar.mo39build();
            oi().e(bI(), acuc.DEFAULT, apzgVar, acty.a(apzgVar, askh.b), acty.a(apzgVar, askh.a));
            oi().n(new acte(acuo.b(22156)));
            this.cW = oi().k();
            if (eog.R(this.bl)) {
                bE();
                lcs bE = bE();
                Optional.ofNullable(oi().c()).map(ioc.a).ifPresent(new inv(bE));
                bE.k = bI().a;
            }
        }
        this.bL.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
        super.S(i3, i2, intent);
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        for (fhg fhgVar : this.cB) {
            fhgVar.b();
        }
        this.bR.e();
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        if (!eog.R(this.bl)) {
            return;
        }
        bE().a(i, strArr, iArr);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        this.co.a.d(new ewe());
        super.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1 A[Catch: all -> 0x0256, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:43:0x0134, B:45:0x0138, B:47:0x0140, B:49:0x0147, B:50:0x014c, B:92:0x01fa, B:94:0x020a, B:98:0x0213, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x0164, B:60:0x016e, B:61:0x0170, B:88:0x01c7, B:90:0x01d1, B:91:0x01d3, B:64:0x0185, B:65:0x018a, B:67:0x018e, B:70:0x0198, B:73:0x01a2, B:76:0x01ac, B:99:0x0216, B:102:0x0224, B:103:0x022b, B:105:0x0234, B:107:0x0238, B:109:0x023c, B:111:0x0248, B:112:0x024a, B:7:0x001c, B:9:0x0071, B:10:0x0073, B:12:0x0082, B:14:0x0092, B:16:0x00a0, B:19:0x00ad, B:20:0x00ba, B:22:0x00c9, B:23:0x00cb, B:25:0x00d6, B:27:0x00da, B:28:0x00dc, B:30:0x00e5, B:32:0x00f4, B:33:0x00f7, B:35:0x00fd, B:37:0x0105, B:39:0x0109, B:41:0x010d, B:42:0x012d, B:29:0x00e1), top: B:120:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void aE(defpackage.iol r18) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iou.aE(iol):void");
    }

    public final void aF(boolean z) {
        this.ae.c(z);
    }

    public final void aG(boolean z) {
        aH(this.ai, z);
    }

    public final void aH(apzg apzgVar, boolean z) {
        apzgVar.getClass();
        if (this.O == null) {
            return;
        }
        this.cv.c(ite.p(this.aE.e(), apzgVar, z, this.bt, this.cm, this.bG, this.bH, this.bl));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void aI(boolean r12, boolean r13, long r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iou.aI(boolean, boolean, long):void");
    }

    @Override // defpackage.gbd
    public final fsx aL(fsx fsxVar) {
        return (fsx) ayos.D(fsxVar).E(new inh(this)).E(new inh(this, 1)).E(new inh(this, 2)).U();
    }

    @Override // defpackage.gbd
    public final ayoi aN() {
        return ayoi.O(new Callable() { // from class: inq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                iou iouVar = iou.this;
                final ftg ftgVar = iouVar.bx() ? ftg.DARK : ftg.ACTIVITY_DEFAULT;
                ftf ftfVar = iouVar.bx() ? ftf.DARK : ftf.ACTIVITY_DEFAULT;
                apzg apzgVar = iouVar.ai;
                final boolean z = true;
                if (apzgVar != null && ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEvideo_picker")) {
                    z = false;
                }
                ftd a = fte.a();
                a.b(z);
                a.c(ftfVar);
                ftd ftdVar = (ftd) new Function() { // from class: ioa
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        boolean z2 = z;
                        ftg ftgVar2 = ftgVar;
                        ftd ftdVar2 = (ftd) obj;
                        int i = iou.cp;
                        if (z2) {
                            ftdVar2.d(ftgVar2);
                        }
                        return ftdVar2;
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                }.apply(a);
                ftdVar.getClass();
                return ftdVar.a();
            }
        });
    }

    @Override // defpackage.gbd
    public final CharSequence aP() {
        return this.af;
    }

    @Override // defpackage.gbd
    public final Object aQ() {
        if (this.cI) {
            return null;
        }
        amuk amukVar = (amuk) Collection.EL.stream((List) Optional.ofNullable(this.e).map(iob.t).orElse(amuk.q())).map(iob.s).collect(amsf.a);
        fsv fsvVar = this.d;
        return new ior(amukVar, fsvVar != null ? fsvVar.a() : 0, this.cJ, this.cy, this.af, this.ag, this.ah, this.ak, this.an, this.ao, this.aw, this.ax, this.ay, this.cK, this.cf, this.cg, (akam) Optional.ofNullable(this.cC).map(iob.j).orElse(null), (akam) Optional.ofNullable(this.bP).map(iob.k).orElse(null), this.bR.b(), (amuk) Optional.ofNullable(this.cb).map(iob.l).orElse(amuk.q()), amuk.o(this.cG));
    }

    @Override // defpackage.gbd
    public final String aR() {
        return this.cA;
    }

    @Override // defpackage.gbd, defpackage.gcl
    public final void aS(int i) {
        new ypf(this.X).c().I(ikb.n).V(new inh(this, 4)).I(ikb.p).V(inl.d).as(new v(i, 1));
    }

    @Override // defpackage.gbd
    public final void aT() {
        lwm lwmVar;
        if (!bU() || (lwmVar = this.bP) == null) {
            return;
        }
        lwmVar.o();
    }

    @Override // defpackage.gbd
    public final void aU() {
        aG(true);
    }

    @Override // defpackage.gbd
    public final void aV(Object obj) {
        if (!(obj instanceof ior)) {
            return;
        }
        this.cu = (ior) obj;
    }

    @Override // defpackage.gbd
    public final void aW(boolean z) {
        ajsm ajsmVar;
        fsl fslVar;
        this.aB = z;
        if (!aX() || (ajsmVar = this.cN) == null || (fslVar = this.aA) == null) {
            return;
        }
        if (!this.aB) {
            ajsmVar.remove(fslVar);
        } else if (ajsmVar.contains(fslVar)) {
        } else {
            this.cN.add(0, this.aA);
        }
    }

    final int bA() {
        return fyv.f(s(), this.bl);
    }

    @Override // defpackage.gbd
    public final boolean bb() {
        Boolean bool;
        fsv fsvVar = this.d;
        boolean z = false;
        if (fsvVar == null || !fsvVar.i()) {
            return false;
        }
        this.d.h();
        aqxe aqxeVar = this.cd.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45352464L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352464L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352464L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            Optional.ofNullable(p()).ifPresent(fyb.n);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.b.d == false) goto L7;
     */
    @Override // defpackage.gbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bc() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iou.bc():boolean");
    }

    @Override // defpackage.ngz
    public final void bd() {
        bK();
    }

    @Override // defpackage.nhb
    public final void be() {
        aG(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bf(cff cffVar) {
        String str;
        bL();
        if (!this.ch) {
            zdy a = this.aI.a(cffVar);
            if (cffVar instanceof cev) {
                br();
            } else {
                int i = 2131232477;
                if (!(cffVar instanceof ceq)) {
                    if (1 == a.c) {
                        i = 2131232447;
                    }
                    SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
                    specificNetworkErrorViewLoadingFrameLayout.c.e(a.a);
                    specificNetworkErrorViewLoadingFrameLayout.c.d(true);
                    specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                    specificNetworkErrorViewLoadingFrameLayout.c.c(i);
                    specificNetworkErrorViewLoadingFrameLayout.h(3);
                } else if (((ceq) cffVar).getCause() instanceof IOException) {
                    br();
                } else {
                    SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout2 = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
                    specificNetworkErrorViewLoadingFrameLayout2.c.e(this.b.getString(R.string.auth_error_help_message));
                    specificNetworkErrorViewLoadingFrameLayout2.c.c(2131232477);
                    specificNetworkErrorViewLoadingFrameLayout2.c.d(false);
                    specificNetworkErrorViewLoadingFrameLayout2.c.b(true);
                    specificNetworkErrorViewLoadingFrameLayout2.h(3);
                }
            }
            fyv.g(oi(), a.b);
            str = "Logged VE for an initial request failure.";
        } else {
            str = "Initial request failed.";
        }
        this.co.a.d(new ewb());
        String valueOf = String.valueOf(cffVar);
        StringBuilder sb = new StringBuilder(str.length() + 8 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(" Error: ");
        sb.append(valueOf);
        this.ce.b(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bg(apzg apzgVar) {
        acvg b;
        bQ(true);
        boolean z = false;
        this.cT.set(false);
        bt();
        this.co.a.d(new ewl());
        if (apzgVar == null || !apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint) || !((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c.startsWith("VL")) {
            b = this.bZ.k(PaneDescriptor.b(this)) ? this.bL.b(asny.LATENCY_ACTION_LIBRARY) : null;
        } else {
            b = this.bL.b(asny.LATENCY_ACTION_VIDEO_LIST);
        }
        if (b != null) {
            b.c("br_s");
        }
        this.cR = b;
        if (this.aJ.d() > this.ak) {
            z = true;
        }
        aI(z, true, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bh(iol iolVar) {
        boolean z = iolVar.e;
        this.ch = z;
        if (iolVar.c) {
            if (!z) {
                BrowseResponseModel browseResponseModel = iolVar.b;
                bL();
                this.cJ = (byte[]) Optional.ofNullable(browseResponseModel.d()).orElse(new byte[0]);
                this.bM.a(oi(), browseResponseModel.a);
            }
            this.co.a.d(new ewg());
            acvg acvgVar = this.cR;
            if (acvgVar != null) {
                acvgVar.c(true != iolVar.e ? "br_r" : "br_lrr");
            }
        }
        bQ(false);
        bn(iolVar.b.a);
    }

    protected void bi(akaf akafVar) {
    }

    public final void bj() {
        this.aq = null;
        ((frv) this.al.get()).j();
    }

    public final void bk(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aunb aunbVar = (aunb) it.next();
            if (aunbVar.qn(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer)) {
                this.ca.q((aqvq) aunbVar.qm(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer));
                this.cG.add(aunbVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bl() {
        this.d.e(new ioo(this));
    }

    @Override // defpackage.nha
    public final void bm(Object obj, Object obj2) {
        ajsm ajsmVar = this.cN;
        if (ajsmVar != null) {
            ajsmVar.o(obj, obj2);
        }
    }

    public final void bn(arlt arltVar) {
        aafo aafoVar = this.bd;
        amuf f = amuk.f();
        f.j(arltVar.n);
        f.j(arltVar.o);
        aafoVar.b(f.g());
    }

    public final void bo(ngq ngqVar) {
        this.an = hve.h(ngqVar.c.la(rg()));
        this.ao = hve.h(ngqVar.d.la(rg()));
        this.ay = hve.h(ngqVar.e.la(rg()));
        this.aw = hve.h(ngqVar.a.la(rg()));
        this.ax = hve.h(ngqVar.b.la(rg()));
        bj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bp(apzg apzgVar) {
        apzgVar.getClass();
        this.ai = apzgVar;
    }

    public final void bq() {
        aqgr aqgrVar;
        if (at()) {
            fyg fygVar = this.ae;
            fxz fxzVar = null;
            fxz fxzVar2 = (fxz) this.cx.filter(gka.g).map(iob.m).map(iob.r).orElse(null);
            if (fxzVar2 == null) {
                mbt q = q();
                if (q != null && (aqgrVar = q.b) != null) {
                    fxzVar = new fxx(aqgrVar);
                }
            } else {
                fxzVar = fxzVar2;
            }
            acti oi = oi();
            oi.getClass();
            fygVar.k = oi;
            fygVar.f(fxzVar);
        }
    }

    protected final void br() {
        SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
        specificNetworkErrorViewLoadingFrameLayout.f = this.ck;
        specificNetworkErrorViewLoadingFrameLayout.h(5);
    }

    public final void bs() {
        Optional.ofNullable(this.a).ifPresent(fyb.q);
        this.a = null;
    }

    public final void bt() {
        if (mJ() == null) {
            return;
        }
        this.bT.c(lxy.b(rg()));
    }

    public final boolean bu(ajzq ajzqVar, fhg fhgVar) {
        if (this.bP == null || ajzqVar == null || fhgVar == null) {
            return false;
        }
        if (this.e.i().size() == 1) {
            return true;
        }
        this.e.i().size();
        return false;
    }

    final boolean bv() {
        apzg apzgVar = this.ai;
        if (!TextUtils.equals(aaji.c(apzgVar), "FEactivity") || this.aQ.a("FEactivity") <= 0) {
            if (apzgVar != null && (((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).b & 64) != 0) {
                return true;
            }
            return this.ak != 0 && eog.ad(this.cm) != 0 && TextUtils.equals(aaji.c(s()), "FEwhat_to_watch") && this.aJ.d() > this.ak;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean bw() {
        return this.e != null && !TextUtils.equals("FEactivity", aaji.c(this.ai));
    }

    public final boolean bx() {
        return bA() == 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bz() {
        for (fhg fhgVar : this.cB) {
            fhgVar.c(1);
        }
    }

    @Override // defpackage.fxi
    public final void d(boolean z) {
        Optional.ofNullable(this.bF).ifPresent(new kgs(z, 1));
    }

    @Override // defpackage.ydp
    public final void h() {
        aG(true);
    }

    @Override // defpackage.imz
    public void l() {
        if (n() == 5 || this.ch) {
            ll();
        }
    }

    @Override // defpackage.akai
    public void ll() {
        if (this.O == null) {
            return;
        }
        bK();
        bz();
        this.aO.post(new inn(this));
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return true;
    }

    @Override // defpackage.ydp
    public final void mE() {
        aG(true);
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        asku askuVar;
        Spanned spanned;
        avns avnsVar;
        awim awimVar;
        arag aragVar;
        awim awimVar2;
        arbg arbgVar;
        if (ashnVar != null) {
            iox ioxVar = this.cP;
            if ((ashnVar.b & 2) != 0) {
                ashf ashfVar = ashnVar.d;
                if (ashfVar == null) {
                    ashfVar = ashf.a;
                }
                if (ashfVar.b == 162801955) {
                    arbgVar = (arbg) ashfVar.c;
                } else {
                    arbgVar = arbg.a;
                }
                if (ioxVar.c(arbgVar)) {
                    return;
                }
            }
            ashf ashfVar2 = ashnVar.d;
            if (ashfVar2 == null) {
                ashfVar2 = ashf.a;
            }
            if (ashfVar2.b == 86135402) {
                ashf ashfVar3 = ashnVar.d;
                if (ashfVar3 == null) {
                    ashfVar3 = ashf.a;
                }
                if (ashfVar3.b == 86135402) {
                    askuVar = (asku) ashfVar3.c;
                } else {
                    askuVar = asku.a;
                }
            } else {
                askuVar = null;
            }
            if (askuVar == null) {
                ashf ashfVar4 = ashnVar.d;
                if (ashfVar4 == null) {
                    ashfVar4 = ashf.a;
                }
                if (ashfVar4.b == 62441981) {
                    ashf ashfVar5 = ashnVar.d;
                    if (ashfVar5 == null) {
                        ashfVar5 = ashf.a;
                    }
                    if (ashfVar5.b == 62441981) {
                        awimVar = (awim) ashfVar5.c;
                    } else {
                        awimVar = awim.a;
                    }
                    if ((awimVar.b & 1) != 0) {
                        ashf ashfVar6 = ashnVar.d;
                        if (ashfVar6 == null) {
                            ashfVar6 = ashf.a;
                        }
                        if (ashfVar6.b == 62441981) {
                            awimVar2 = (awim) ashfVar6.c;
                        } else {
                            awimVar2 = awim.a;
                        }
                        aragVar = awimVar2.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    spanned = ajgl.b(aragVar);
                } else {
                    spanned = null;
                }
                if (!TextUtils.isEmpty(spanned)) {
                    ioxVar.a.d(spanned.toString());
                }
                ashf ashfVar7 = ashnVar.d;
                if (ashfVar7 == null) {
                    ashfVar7 = ashf.a;
                }
                if (ashfVar7.b == 127387931) {
                    ashf ashfVar8 = ashnVar.d;
                    if (ashfVar8 == null) {
                        ashfVar8 = ashf.a;
                    }
                    if (ashfVar8.b == 127387931) {
                        avnsVar = (avns) ashfVar8.c;
                    } else {
                        avnsVar = avns.a;
                    }
                } else {
                    avnsVar = null;
                }
                if (avnsVar != null) {
                    ioxVar.c.oi().D(new acte(ashnVar.g.I()));
                    yic yicVar = ioxVar.f;
                    yic.h(avnsVar).qv(this.z, null);
                    return;
                }
            } else {
                if ((ashnVar.b & 16) != 0) {
                    ioxVar.c.oi().D(new acte(ashnVar.g.I()));
                }
                ioxVar.e.b(askuVar, new Pair("overlay_controller_param", new akbi() { // from class: iov
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar) {
                        iou iouVar = iou.this;
                        int i = ((apoj) aopcVar.instance).b;
                        if ((32768 & i) == 0 && (i & 16384) == 0 && (i & 8192) == 0) {
                            iouVar.aG(true);
                        }
                    }
                }));
                return;
            }
        }
        aG(true);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mQ(Bundle bundle) {
        this.cS = SystemClock.elapsedRealtime();
        super.mQ(bundle);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mR() {
        ne neVar;
        super.mR();
        ViewGroup viewGroup = this.cV;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.cX);
            this.cV = null;
        }
        this.c = Optional.empty();
        this.cH.qr();
        this.aF.j();
        fxh fxhVar = this.bF;
        if (fxhVar != null) {
            RecyclerView recyclerView = fxhVar.c;
            if (recyclerView != null && (neVar = fxhVar.d) != null) {
                recyclerView.aG(neVar);
            }
            fxhVar.d = null;
            fxhVar.c = null;
        }
        fwx fwxVar = this.bE;
        if (fwxVar.a.h()) {
            fwxVar.a();
        }
        fwxVar.d = null;
        fwxVar.e = null;
        fwxVar.c = acti.l;
        fwxVar.a.f();
        lwm lwmVar = this.bP;
        if (lwmVar != null) {
            lwmVar.h();
            this.bO.a.remove(this.bP);
        }
        this.cF.c();
        aypg aypgVar = this.cE;
        if (aypgVar != null) {
            aypgVar.qr();
        }
        this.bR.f();
        nij nijVar = this.e;
        if (nijVar != null) {
            nijVar.j();
        }
        aypg aypgVar2 = this.cO;
        if (aypgVar2 != null) {
            ayqi.c((AtomicReference) aypgVar2);
            this.cO = null;
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        this.co.a.d(new ewf());
        super.mS();
        this.aL.g(this.aK.get());
        this.aL.g(this.bz);
        this.aL.g(this.bA);
        long d = this.aJ.d();
        long j = this.ak;
        if (this.cI || d > j || this.cK != this.bu.a()) {
            aG(bv());
        } else {
            aI(false, false, this.ak - d);
            if (this.cT.get()) {
                bR();
            }
        }
        this.aL.h(this, iou.class);
        this.cx.ifPresent(fyb.o);
        nij nijVar = this.e;
        if (nijVar != null) {
            nijVar.n();
        }
        this.aj = 0;
        this.aO.postDelayed(new inn(this, 1), 500L);
        this.aL.g(this.bs);
        bq();
        this.bk.d(this);
        Optional ofNullable = Optional.ofNullable(aaji.c(s()));
        final LayerableFilterEntityController layerableFilterEntityController = this.bN;
        layerableFilterEntityController.getClass();
        ofNullable.ifPresent(new Consumer() { // from class: inw
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                LayerableFilterEntityController.this.b = ampq.j((String) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // defpackage.gbd, defpackage.fxi
    public final void mT() {
        fsv fsvVar = this.d;
        if (fsvVar != null) {
            fsvVar.h();
        }
    }

    @Override // defpackage.dp
    public View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte[] bArr;
        LayoutInflater layoutInflater2;
        this.b = rh();
        apzg c = aafr.c((byte[]) Optional.ofNullable(bundle != null ? bundle : this.m).map(iob.c).orElse(null));
        if ((bundle != null || ((atnp) c.qm(atno.b)).c.isEmpty()) && (bArr = (byte[]) Optional.ofNullable(this.m).map(iob.d).orElse(null)) != null) {
            aopa createBuilder = atnp.a.createBuilder();
            try {
                createBuilder.mo38mergeFrom(bArr, aoos.b());
            } catch (aopx unused) {
            }
            aopc aopcVar = (aopc) c.mo52toBuilder();
            aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
            c = (apzg) aopcVar.mo39build();
        }
        bp(c);
        lwm lwmVar = this.bP;
        if (lwmVar != null) {
            this.bO.a.add(lwmVar);
        }
        if (bx()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(rb(), 2132083889);
            this.ct = contextThemeWrapper;
            layoutInflater2 = layoutInflater.cloneInContext(contextThemeWrapper);
        } else {
            layoutInflater2 = layoutInflater;
        }
        this.aD = this.bW.a();
        if (viewGroup != null) {
            this.cV = viewGroup;
            this.ci = viewGroup.getWidth();
            this.cj = viewGroup.getHeight();
            viewGroup.addOnLayoutChangeListener(this.cX);
        }
        this.c = Optional.of((SpecificNetworkErrorViewLoadingFrameLayout) layoutInflater2.inflate(R.layout.browse_fragment, viewGroup, false));
        this.bE.c((!eog.ay(this.av) || viewGroup == null) ? (FrameLayout) this.c.get() : (FrameLayout) viewGroup, this, this, oi());
        long j = this.cS;
        if (j > 0) {
            this.co.a.d(new ewd(j));
            this.cS = 0L;
        }
        HashSet hashSet = new HashSet();
        this.cQ = hashSet;
        ioy ioyVar = this.bw;
        Context context = (Context) ioyVar.a.get();
        context.getClass();
        yzj yzjVar = (yzj) ioyVar.b.get();
        yzjVar.getClass();
        nfz nfzVar = (nfz) ioyVar.c.get();
        nfzVar.getClass();
        mrx mrxVar = (mrx) ioyVar.d.get();
        mrxVar.getClass();
        HatsController hatsController = (HatsController) ioyVar.e.get();
        hatsController.getClass();
        MealbarPromoController mealbarPromoController = (MealbarPromoController) ioyVar.f.get();
        mealbarPromoController.getClass();
        acth acthVar = (acth) ioyVar.g.get();
        acthVar.getClass();
        akfw akfwVar = (akfw) ioyVar.h.get();
        akfwVar.getClass();
        ((ggs) ioyVar.i.get()).getClass();
        aafo aafoVar = (aafo) ioyVar.j.get();
        aafoVar.getClass();
        ggk ggkVar = (ggk) ioyVar.k.get();
        ggkVar.getClass();
        ezf ezfVar = (ezf) ioyVar.l.get();
        ezfVar.getClass();
        niw niwVar = (niw) ioyVar.m.get();
        niwVar.getClass();
        yic yicVar = (yic) ioyVar.n.get();
        yicVar.getClass();
        this.cP = new iox(context, yzjVar, nfzVar, mrxVar, hatsController, mealbarPromoController, acthVar, akfwVar, aafoVar, ggkVar, ezfVar, hashSet, niwVar, yicVar, null);
        this.cs = new inb(this.aE, this.cP, this.cm, this.bG, this.bl, this.bH, ampq.i((ydu) this.bI.orElse(null)));
        this.ca.t();
        this.cG.clear();
        ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).i(new ios(this));
        this.cw = (bx() ? this.bp : this.bn).a(this.cs, oi());
        this.ag = ((frv) this.al.get()).p();
        int d = ((frv) this.al.get()).d();
        int e = ((frv) this.al.get()).e();
        int color = this.b.getColor(R.color.theme_main_tab_text_color_activated);
        int color2 = this.b.getColor(R.color.theme_main_tab_text_color_normal);
        if (bx()) {
            d = zhn.d(rg(), R.attr.ytBrandBackgroundSolid);
            e = zhn.d(rg(), R.attr.ytStatusBarBackground);
            color = zhn.d(rg(), R.attr.ytTextPrimary);
            color2 = zhn.d(rg(), R.attr.ytTextSecondary);
        }
        oa oaVar = this.ap;
        if (bundle != null && oaVar != null) {
            d = bD(bundle, "instance_action_bar_color", oaVar);
            e = bD(bundle, "instance_status_bar_color", oaVar);
            color = bD(bundle, "instance_activated_text_color", oaVar);
            color2 = bD(bundle, "instance_secondary_text_color", oaVar);
        }
        this.an = hve.h(d);
        this.ao = hve.h(e);
        this.aw = hve.h(color);
        this.ax = hve.h(color2);
        this.ay = this.as.a.d;
        this.e = this.bi.a(oi(), N(R.string.tab_with_new_content));
        this.cH = this.cv.F(new inf(this, 3)).F(new inf(this, 4)).af(new inh(this, 3)).as(new inf(this, 2));
        ior iorVar = this.cu;
        if (iorVar == null || iorVar.a.isEmpty() || bv()) {
            this.cI = true;
        } else {
            bL();
            this.cJ = this.cu.c;
            oi().D(new acte(this.cJ));
            BrowseResponseModel browseResponseModel = this.cu.d;
            this.cy = browseResponseModel;
            ngj bX = browseResponseModel != null ? bX(browseResponseModel) : null;
            if (bX != null) {
                bY(bX);
            }
            bZ(bX);
            ior iorVar2 = this.cu;
            this.af = iorVar2.e;
            this.cD = iorVar2.q;
            bT(iorVar2.a, bJ(), this.cu.b);
            ajzq f = this.e.f();
            if (f != null) {
                f.c();
            }
            ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).f();
            ior iorVar3 = this.cu;
            this.ag = iorVar3.f;
            this.ah = iorVar3.g;
            this.ak = iorVar3.h;
            this.cK = iorVar3.n;
            this.cf = iorVar3.o;
            this.cg = iorVar3.p;
            this.an = (ActionBarColor) Optional.ofNullable(iorVar3.i).orElseGet(ibz.g);
            this.ao = (ActionBarColor) Optional.ofNullable(this.cu.j).orElseGet(ibz.h);
            this.aw = (ActionBarColor) Optional.ofNullable(this.cu.k).orElseGet(ibz.c);
            this.ax = (ActionBarColor) Optional.ofNullable(this.cu.l).orElseGet(ibz.d);
            this.ay = (ActionBarColor) Optional.ofNullable(this.cu.m).orElseGet(ibz.e);
            bS();
            this.cI = false;
            this.cT.set(true);
            this.bK.g((apzg) Optional.ofNullable(this.cy).map(iob.u).filter(gka.h).map(ioc.d).orElse(null));
            bP();
            bN(true, Optional.empty());
            bO(true);
            aypg aypgVar = this.cE;
            if (aypgVar != null) {
                aypgVar.qr();
            }
            this.cE = (aypg) Optional.ofNullable(p()).map(new Function() { // from class: inz
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return function.getClass();
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    return ((fhg) obj).c.I(ikb.m).as(new inf(iou.this, 1));
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return function.getClass();
                }
            }).orElse(banl.m());
            if (bU() && this.cg.isPresent()) {
                Optional.ofNullable(this.bF).ifPresent(new ins(this, 4));
            }
            mas masVar = this.cb;
            if (masVar != null) {
                masVar.c(this.cu.t);
            }
            bk(this.cu.u);
            if (Build.VERSION.SDK_INT >= 28) {
                ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).setAccessibilityPaneTitle(this.af);
            }
        }
        if (!c.qn(BrowseEndpointOuterClass.browseEndpoint)) {
            zep.b("Browse Fragment was given a navigation endpoint without browse data.");
        }
        if (Build.VERSION.SDK_INT < 28) {
            Optional.ofNullable(mJ()).map(iob.f).map(iob.g).ifPresent(fyb.k);
        }
        if (bundle != null) {
            gfs a = this.bW.a();
            if (a != ((gfs) gfs.a(bundle.getInt("PREVIOUS_THEME", -1)).e(a))) {
                this.cI = false;
                asxj asxjVar = this.cm.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (asxjVar.ah) {
                    this.aC.e(a.d);
                }
            }
        }
        return (View) this.c.get();
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        bM();
        this.aL.m(this);
        this.cx.ifPresent(fyb.p);
        nij nijVar = this.e;
        if (nijVar != null) {
            agbz agbzVar = nijVar.b;
            ylr.c();
            agbzVar.b.remove(nijVar);
            ajzq f = nijVar.f();
            if (f != null) {
                f.D();
            }
        }
        bs();
        fsv fsvVar = this.d;
        if (fsvVar != null) {
            fsvVar.g(this.cY);
        }
        ioq ioqVar = this.cL;
        if (ioqVar != null) {
            ioqVar.c();
        }
        this.aL.m(this.bs);
        bp(s());
        this.aL.m(this.aK.get());
        this.aL.m(this.bz);
        this.aL.m(this.bA);
        this.ae.f(null);
        this.bk.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n() {
        return ((Integer) this.c.map(iob.h).orElse(0)).intValue();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fsv fsvVar = this.d;
        if (fsvVar != null) {
            fsvVar.j();
        }
        nij nijVar = this.e;
        if (nijVar != null) {
            for (nii niiVar : nijVar.a) {
                niiVar.c.E(configuration);
                lsv lsvVar = niiVar.d;
                if (lsvVar != null && lsvVar.g) {
                    lsvVar.r(configuration.orientation);
                }
            }
        }
        if (n() == 5 || n() == 6) {
            this.c.ifPresent(new ins(this, 2));
        }
        if (bW()) {
            View view = this.O;
            RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.results) : null;
            if (recyclerView != null) {
                double l = zew.l(rg());
                Double.isNaN(l);
                int i = (int) (l * 0.175d);
                recyclerView.setPadding(i, 0, i, 0);
            }
        }
        if (bU()) {
            Optional.ofNullable(this.bF).ifPresent(new ins(this, 3));
        }
    }

    @Override // defpackage.dp
    public void oz(Bundle bundle) {
        bundle.putByteArray("navigation_endpoint", s().toByteArray());
        bundle.putParcelable("instance_action_bar_color", this.an);
        bundle.putParcelable("instance_status_bar_color", this.ao);
        bundle.putParcelable("instance_activated_text_color", this.aw);
        bundle.putParcelable("instance_secondary_text_color", this.ax);
        bundle.putInt("PREVIOUS_THEME", this.aD.c);
    }

    public final fhg p() {
        int a;
        nij nijVar = this.e;
        if (nijVar == null || (a = nijVar.a()) < 0 || a >= this.cB.size()) {
            return null;
        }
        return (fhg) this.cB.get(a);
    }

    public final mbt q() {
        nij nijVar;
        if (this.d == null || (nijVar = this.e) == null) {
            return null;
        }
        return (mbt) nijVar.f();
    }

    public final acti r() {
        return (acti) Optional.ofNullable(oi()).orElse(acti.l);
    }

    @Override // defpackage.ioz, defpackage.dp
    public Context rb() {
        Context context = this.ct;
        return context != null ? context : super.rb();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final apzg s() {
        avfo g;
        if (!bw() || (g = this.e.g()) == null || (g.b & 2) == 0 || g.equals(this.cz)) {
            return this.ai;
        }
        apzg apzgVar = g.d;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        luf lufVar;
        fsx fsxVar = this.aq;
        if (fsxVar != null || (lufVar = this.am) == null) {
            fsxVar.getClass();
            return fsxVar;
        }
        fsx c = lufVar.c();
        final amvn amvnVar = c.a.c;
        if (this.cx.isPresent()) {
            amvnVar = ((ngj) this.cx.get()).a(amvnVar);
        }
        if (this.az) {
            amvl i = amvn.i();
            i.c((fry) this.be.get());
            i.j(amvnVar);
            amvnVar = i.g();
        }
        if (this.cM) {
            amvl i2 = amvn.i();
            i2.j(this.bf.b());
            i2.j(amvnVar);
            amvnVar = i2.g();
        }
        if (cr.contains(aaji.c(this.ai))) {
            amvnVar = amyg.a;
        }
        final Object obj = null;
        if (bV() && this.cx.isPresent()) {
            obj = ((ngj) this.cx.get()).d();
        }
        final boolean z = false;
        if (obj != null && ((Boolean) this.cx.map(iob.q).orElse(false)).booleanValue()) {
            z = true;
        }
        return (fsx) ayos.D(c).E(new ayqe() { // from class: inj
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                final iou iouVar = iou.this;
                final amvn amvnVar2 = amvnVar;
                fsw a = ((fsx) obj2).a();
                a.m(new ampg() { // from class: inu
                    @Override // defpackage.ampg
                    public final Object apply(Object obj3) {
                        iou iouVar2 = iou.this;
                        amvn amvnVar3 = amvnVar2;
                        frz frzVar = (frz) obj3;
                        frzVar.a = iouVar2.af;
                        frzVar.d(amvnVar3);
                        frzVar.b(iouVar2.ay);
                        return frzVar;
                    }
                });
                return a.a();
            }
        }).E(new inh(this)).E(new inh(this, 1)).E(new ayqe() { // from class: ink
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                iou iouVar = iou.this;
                Object obj3 = obj;
                boolean z2 = z;
                fsw a = ((fsx) obj2).a();
                a.b(iouVar.an);
                a.k(iouVar.ao);
                a.g(iouVar.aw);
                a.i(iouVar.ax);
                a.e = obj3;
                a.f(z2);
                a.c(iouVar.ag);
                a.d(iouVar.ah);
                return a.a();
            }
        }).U();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aucu aucuVar;
        BrowseResponseModel browseResponseModel;
        switch (i) {
            case -1:
                return new Class[]{ggn.class, ggo.class, isw.class, lsk.class, yem.class, abbh.class, ajwz.class};
            case 0:
                ggn ggnVar = (ggn) obj;
                this.cI = true;
                return null;
            case 1:
                ggo ggoVar = (ggo) obj;
                aG(true);
                return null;
            case 2:
                isw iswVar = (isw) obj;
                if (!iswVar.c().h()) {
                    return null;
                }
                lve lveVar = this.bf;
                ateo ateoVar = (ateo) iswVar.c().c();
                atep atepVar = lveVar.c;
                if (atepVar != null && atepVar.c.size() > 0) {
                    aopa mo52toBuilder = lveVar.c.mo52toBuilder();
                    aopa createBuilder = aten.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aten atenVar = (aten) createBuilder.instance;
                    atenVar.c = ateoVar;
                    atenVar.b |= 1;
                    mo52toBuilder.aD(0, createBuilder);
                    lveVar.c((atep) mo52toBuilder.mo39build());
                }
                bj();
                aG(true);
                return null;
            case 3:
                lsk lskVar = (lsk) obj;
                String c = aaji.c(aM());
                if (c == null || !c.equals(lskVar.a())) {
                    return null;
                }
                apzg aM = aM();
                aopa mo52toBuilder2 = ((apnv) aM.qm(BrowseEndpointOuterClass.browseEndpoint)).mo52toBuilder();
                String b = lskVar.b();
                mo52toBuilder2.copyOnWrite();
                apnv apnvVar = (apnv) mo52toBuilder2.instance;
                b.getClass();
                apnvVar.b |= 8;
                apnvVar.e = b;
                aopc aopcVar = (aopc) aM.mo52toBuilder();
                aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) mo52toBuilder2.mo39build());
                apzg apzgVar = (apzg) aopcVar.mo39build();
                PaneDescriptor.b(this).i(apzgVar);
                aH(apzgVar, true);
                return null;
            case 4:
                yem yemVar = (yem) obj;
                aG(true);
                return null;
            case 5:
                abbh abbhVar = (abbh) obj;
                if ((4 & abbhVar.b.b) == 0) {
                    return null;
                }
                Object bJ = bJ();
                asau asauVar = abbhVar.b.d;
                if (asauVar == null) {
                    asauVar = asau.a;
                }
                if (asauVar.b == 53272665) {
                    asau asauVar2 = abbhVar.b.d;
                    if (asauVar2 == null) {
                        asauVar2 = asau.a;
                    }
                    if (asauVar2.b == 53272665) {
                        aucuVar = (aucu) asauVar2.c;
                    } else {
                        aucuVar = aucu.a;
                    }
                } else {
                    aucuVar = null;
                }
                if (aucuVar == null || (browseResponseModel = this.cy) == null) {
                    return null;
                }
                bY(this.aV.a(aucuVar, browseResponseModel));
                if (bJ != null) {
                    bm(bJ, aucuVar);
                }
                bj();
                return null;
            case 6:
                if (((ajwz) obj).a() == ajfy.NEXT) {
                    return null;
                }
                ((frv) this.al.get()).n();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
