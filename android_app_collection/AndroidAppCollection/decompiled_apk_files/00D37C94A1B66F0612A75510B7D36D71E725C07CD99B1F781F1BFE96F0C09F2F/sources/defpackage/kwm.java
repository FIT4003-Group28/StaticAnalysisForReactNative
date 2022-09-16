package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.provider.SearchRecentSuggestions;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kwm  reason: default package */
/* loaded from: classes3.dex */
public final class kwm extends kuj implements akgj, kux {
    public axnm a;
    public TextView aB;
    public lcs aC;
    kwj aD;
    kwk aE;
    View aF;
    View aG;
    kuz aH;
    akam aI;
    yzh aJ;
    public oir aK;
    public lya aL;
    public sdb aM;
    private String aN;
    private String aO;
    private String aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private int aT;
    private int aU;
    private LoadingFrameLayout aV;
    private laz aW;
    private RecyclerView aX;
    private boolean aY;
    public lbl ae;
    public fsd af;
    public iwa ag;
    public kun ah;
    public kuv ai;
    public lba aj;
    public lct ak;
    public acvh al;
    public aadd am;
    public afvn an;
    public fpg ao;
    public lvl aw;
    public Executor ax;
    public iwe ay;
    public String az;
    public axnm b;
    public SearchRecentSuggestions c;
    public yni d;
    public azqb e;
    private kwh aZ = null;
    public int aA = -1;

    private final yzh aE() {
        dt mJ;
        if (this.aJ == null && (mJ = mJ()) != null && (mJ instanceof ems)) {
            this.aJ = ((ems) mJ).mD();
        }
        return this.aJ;
    }

    private final void aF() {
        this.aH.d(this.az);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.d.d(new ewx());
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        this.aC.a(i, strArr, iArr);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        super.Y();
        this.ax.execute(new kwg(this));
    }

    @Override // defpackage.gbd
    public final Object aQ() {
        kwl kwlVar = new kwl();
        kwlVar.a = null;
        kuz kuzVar = this.aH;
        if (kuzVar != null) {
            kwlVar.b = kuzVar.pn();
        }
        return kwlVar;
    }

    @Override // defpackage.gbd
    public final String aR() {
        return this.aH.H;
    }

    @Override // defpackage.gbd
    public final void aV(Object obj) {
        if (!(obj instanceof kwl)) {
            return;
        }
        kwl kwlVar = (kwl) obj;
        Object obj2 = kwlVar.a;
        this.aI = kwlVar.b;
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.aq == null) {
            fsw a = this.as.a();
            if (eog.C(this.am)) {
                kuz kuzVar = this.aH;
                if ((kuzVar instanceof OnlineSearchController) && ((OnlineSearchController) kuzVar).s != null) {
                    boolean z = false;
                    if (this.aQ && this.aS) {
                        z = true;
                    }
                    this.aR = z;
                    fso fsoVar = new fso();
                    fsoVar.a = Boolean.valueOf(this.aR);
                    RecyclerView recyclerView = this.aX;
                    if (recyclerView != null) {
                        fsoVar.b = recyclerView;
                        Boolean bool = fsoVar.a;
                        if (bool == null || fsoVar.b == null) {
                            StringBuilder sb = new StringBuilder();
                            if (fsoVar.a == null) {
                                sb.append(" chipApplied");
                            }
                            if (fsoVar.b == null) {
                                sb.append(" resultsRecyclerView");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        a.c = new fsp(bool.booleanValue(), fsoVar.b);
                    } else {
                        throw new NullPointerException("Null resultsRecyclerView");
                    }
                }
            }
            a.m(new ampg() { // from class: kwf
                /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
                @Override // defpackage.ampg
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r17) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.kwf.apply(java.lang.Object):java.lang.Object");
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mR() {
        super.mR();
        this.aH.a();
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        this.ao.c();
        this.af.d(this.az);
        if (this.aY) {
            aF();
        }
        this.aY = false;
        this.aH.I = this;
        if (ap()) {
            final eo F = F();
            final String str = kvc.ae;
            final er erVar = new er() { // from class: kwb
                @Override // defpackage.er
                public final void a(String str2, Bundle bundle) {
                    kwm kwmVar = kwm.this;
                    if (str2.equals(kvc.ae)) {
                        ampq aE = kvc.aE(bundle);
                        if (!aE.h()) {
                            return;
                        }
                        auwg auwgVar = (auwg) aE.c();
                        kuz kuzVar = kwmVar.aH;
                        String str3 = kwmVar.az;
                        if (!auwgVar.equals(kuzVar.E)) {
                            kuzVar.E = auwgVar;
                            kuzVar.D = null;
                            kuzVar.d(str3);
                        }
                        kwmVar.r();
                    }
                }
            };
            final l lVar = this.X;
            if (lVar.b == apt.DESTROYED) {
                return;
            }
            j jVar = new j() { // from class: android.support.v4.app.FragmentManager$5
                @Override // defpackage.j
                public final void a(apy apyVar, aps apsVar) {
                    Bundle bundle;
                    if (apsVar == aps.ON_START && (bundle = (Bundle) eo.this.g.get(str)) != null) {
                        erVar.a(str, bundle);
                        eo.this.g.remove(str);
                    }
                    if (apsVar == aps.ON_DESTROY) {
                        lVar.e(this);
                        eo.this.h.remove(str);
                    }
                }
            };
            lVar.c(jVar);
            el elVar = (el) F.h.put(str, new el(lVar, erVar, jVar));
            if (elVar == null) {
                return;
            }
            elVar.a.e(elVar.c);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        final kwm kwmVar = this;
        View inflate = layoutInflater.inflate(R.layout.search_results_fragment, viewGroup, false);
        kwmVar.aF = inflate;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        kwmVar.aV = loadingFrameLayout;
        loadingFrameLayout.f(kwmVar);
        kwmVar.aX = (RecyclerView) kwmVar.aV.findViewById(R.id.results);
        if (eog.C(kwmVar.am)) {
            kwmVar.aZ = new kwh(kwmVar);
        }
        Bundle bundle3 = kwmVar.m;
        Bundle bundle4 = bundle != null ? bundle : bundle3;
        if (bundle4 != bundle3 && bundle3 != null && bundle3.containsKey("navigation_endpoint_interaction_logging_extension")) {
            bundle4.putByteArray("navigation_endpoint_interaction_logging_extension", bundle3.getByteArray("navigation_endpoint_interaction_logging_extension"));
        }
        if (bundle3 != null && bundle3.containsKey("search_cache_key")) {
            kwmVar.aN = bundle3.getString("search_cache_key");
        }
        kwmVar.aD = new kwj(kwmVar);
        kwmVar.aE = new kwk(kwmVar, kwmVar.ap, kwmVar.aL);
        if (kwmVar.aH != null) {
            bundle2 = bundle4;
        } else if (kwmVar.aM.a) {
            kun kunVar = kwmVar.ah;
            RecyclerView recyclerView = kwmVar.aX;
            LoadingFrameLayout loadingFrameLayout2 = kwmVar.aV;
            dt mJ = mJ();
            acti oi = oi();
            akam akamVar = kwmVar.aI;
            azqb azqbVar = kunVar.a;
            aios aiosVar = (aios) kunVar.b.get();
            aiosVar.getClass();
            txl txlVar = (txl) kunVar.c.get();
            txlVar.getClass();
            azqb azqbVar2 = kunVar.d;
            ajsg ajsgVar = (ajsg) kunVar.e.get();
            ajsgVar.getClass();
            Executor executor = (Executor) kunVar.f.get();
            executor.getClass();
            yzj yzjVar = (yzj) kunVar.g.get();
            yzjVar.getClass();
            aacz aaczVar = (aacz) kunVar.h.get();
            aaczVar.getClass();
            aadd aaddVar = (aadd) kunVar.i.get();
            aaddVar.getClass();
            azqb azqbVar3 = kunVar.j;
            jlh jlhVar = (jlh) kunVar.k.get();
            mht mhtVar = (mht) kunVar.l.get();
            fbw fbwVar = (fbw) kunVar.m.get();
            bundle2 = bundle4;
            fbwVar.getClass();
            recyclerView.getClass();
            loadingFrameLayout2.getClass();
            mJ.getClass();
            oi.getClass();
            kum kumVar = new kum(azqbVar, aiosVar, txlVar, azqbVar2, ajsgVar, executor, yzjVar, aaczVar, aaddVar, azqbVar3, jlhVar, mhtVar, fbwVar, recyclerView, loadingFrameLayout2, mJ, oi, bundle2, akamVar, null, null);
            kwmVar = this;
            kwmVar.aH = kumVar;
        } else {
            bundle2 = bundle4;
            kuv kuvVar = kwmVar.ai;
            RecyclerView recyclerView2 = kwmVar.aX;
            LoadingFrameLayout loadingFrameLayout3 = kwmVar.aV;
            dt mJ2 = mJ();
            acti oi2 = oi();
            kwj kwjVar = kwmVar.aD;
            kwk kwkVar = kwmVar.aE;
            kwh kwhVar = kwmVar.aZ;
            akam akamVar2 = kwmVar.aI;
            ((afwu) kuvVar.a.get()).getClass();
            azqb azqbVar4 = kuvVar.b;
            azqb azqbVar5 = kuvVar.c;
            mbu mbuVar = (mbu) kuvVar.d.get();
            mbuVar.getClass();
            ((Handler) kuvVar.g.get()).getClass();
            abcg abcgVar = (abcg) kuvVar.h.get();
            abcgVar.getClass();
            HatsController hatsController = (HatsController) kuvVar.i.get();
            hatsController.getClass();
            MealbarPromoController mealbarPromoController = (MealbarPromoController) kuvVar.j.get();
            mealbarPromoController.getClass();
            akfw akfwVar = (akfw) kuvVar.k.get();
            akfwVar.getClass();
            akhf akhfVar = (akhf) kuvVar.l.get();
            akhfVar.getClass();
            akhi akhiVar = (akhi) kuvVar.m.get();
            akhiVar.getClass();
            yni yniVar = (yni) kuvVar.n.get();
            yniVar.getClass();
            yzj yzjVar2 = (yzj) kuvVar.o.get();
            yzjVar2.getClass();
            fsd fsdVar = (fsd) kuvVar.p.get();
            fsdVar.getClass();
            lbl lblVar = (lbl) kuvVar.q.get();
            lblVar.getClass();
            aacz aaczVar2 = (aacz) kuvVar.r.get();
            aaczVar2.getClass();
            aadd aaddVar2 = (aadd) kuvVar.s.get();
            aaddVar2.getClass();
            axnm axnmVar = ((axoz) kuvVar.t).get();
            axnmVar.getClass();
            ajmy ajmyVar = (ajmy) kuvVar.u.get();
            ajmyVar.getClass();
            akcq akcqVar = (akcq) kuvVar.v.get();
            akcqVar.getClass();
            acvh acvhVar = (acvh) kuvVar.w.get();
            acvhVar.getClass();
            lay layVar = (lay) kuvVar.x.get();
            layVar.getClass();
            tdu tduVar = (tdu) kuvVar.y.get();
            tduVar.getClass();
            aafo aafoVar = (aafo) kuvVar.z.get();
            aafoVar.getClass();
            akvm akvmVar = (akvm) kuvVar.A.get();
            akvmVar.getClass();
            kza kzaVar = (kza) kuvVar.B.get();
            ajsg ajsgVar2 = (ajsg) kuvVar.C.get();
            ajsgVar2.getClass();
            azqb azqbVar6 = kuvVar.D;
            nml nmlVar = (nml) kuvVar.E.get();
            nmlVar.getClass();
            axxo axxoVar = (axxo) kuvVar.F.get();
            axxoVar.getClass();
            recyclerView2.getClass();
            loadingFrameLayout3.getClass();
            mJ2.getClass();
            oi2.getClass();
            OnlineSearchController onlineSearchController = new OnlineSearchController(azqbVar5, mbuVar, (lpj) kuvVar.e.get(), (lpr) kuvVar.f.get(), abcgVar, hatsController, mealbarPromoController, akfwVar, akhfVar, akhiVar, yniVar, yzjVar2, fsdVar, lblVar, aaczVar2, aaddVar2, axnmVar, ajmyVar, akcqVar, acvhVar, layVar, tduVar, aafoVar, akvmVar, kzaVar, ajsgVar2, azqbVar6, nmlVar, axxoVar, recyclerView2, loadingFrameLayout3, mJ2, oi2, kwjVar, kwkVar, kwhVar, bundle2, akamVar2);
            kwmVar = this;
            kwmVar.aH = onlineSearchController;
            kwmVar.X.c(onlineSearchController);
        }
        if (kwmVar.az == null && bundle2 != null) {
            String string = bundle2.getString("search_query");
            boolean z = bundle2.getBoolean("search_filter_chip_clicked");
            String trim = amps.d(string).trim();
            kwmVar.az = trim;
            kwmVar.aQ = z;
            if (!TextUtils.isEmpty(trim)) {
                TextView textView = kwmVar.aB;
                if (textView != null) {
                    textView.setText(kwmVar.az);
                }
                fsd fsdVar2 = kwmVar.af;
                if (fsdVar2 != null) {
                    fsdVar2.d(kwmVar.az);
                }
                if (kwmVar.ae.b() && !kwmVar.an.c().g()) {
                    aaxb aaxbVar = (aaxb) kwmVar.e.get();
                    aawz a = aaxbVar.a();
                    a.i();
                    ylx.k(aaxbVar.b(a), kwmVar.ax, jou.p, new ylw() { // from class: kwe
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj) {
                            kwm kwmVar2 = kwm.this;
                            if (!((aruu) obj).d) {
                                kwmVar2.c.saveRecentQuery(kwmVar2.az, null);
                            }
                        }
                    });
                }
                if (at()) {
                    aF();
                } else {
                    kwmVar.aY = true;
                }
            }
            kwmVar.aS = bundle2.getBoolean("search_filter_chip_applied");
            kwmVar.aT = bundle2.getInt("search_filter_chip_count");
            kwmVar.aU = bundle2.getInt("search_chip_bar_selected_position");
        }
        apzg apzgVar = kwmVar.aH.C;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar != null && apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
            auoy auoyVar = (auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint);
            kwmVar.aO = auoyVar.d;
            kwmVar.aP = auoyVar.f;
        }
        laz a2 = kwmVar.aj.a(kwmVar.aO, kwmVar.aP);
        kwmVar.aW = a2;
        kwmVar.aC = kwmVar.ak.a(kwmVar, a2, kwmVar.aO, oi());
        View a3 = kwmVar.aw.a(LayoutInflater.from(kwmVar.ap.getSupportActionBar().b()));
        kwmVar.aG = a3;
        TextView textView2 = (TextView) a3.findViewById(R.id.search_query);
        kwmVar.aB = textView2;
        textView2.setText(kwmVar.az);
        if (eog.bd(kwmVar.av)) {
            kwmVar.aB.setOnTouchListener(new View.OnTouchListener() { // from class: kwd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    kwm kwmVar2 = kwm.this;
                    if (motionEvent.getActionMasked() == 0) {
                        kwmVar2.aA = kwmVar2.aB.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
                        return false;
                    } else if (motionEvent.getAction() != 1) {
                        return false;
                    } else {
                        kwmVar2.aB.performClick();
                        return true;
                    }
                }
            });
            kwmVar.aB.setOnClickListener(new kwc(kwmVar, 1));
        } else {
            kwmVar.aB.setOnClickListener(new kwc(kwmVar));
        }
        a3.findViewById(R.id.search_clear).setOnClickListener(new kwc(kwmVar, 2));
        View findViewById = a3.findViewById(R.id.voice_search);
        if (findViewById != null && kwmVar.aC.e()) {
            findViewById.setOnClickListener(new kwc(kwmVar, 3));
        }
        return kwmVar.aF;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.aH.I = null;
        this.af.d("");
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aH.c(configuration);
        this.ax.execute(new kwg(this));
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("search_cache_key", this.aN);
        bundle.putString("search_query", this.az);
        bundle.putBoolean("search_filter_chip_applied", this.aS);
        bundle.putBoolean("search_filter_chip_clicked", this.aQ);
        bundle.putInt("search_filter_chip_count", this.aT);
        bundle.putInt("search_chip_bar_selected_position", this.aU);
        kuz kuzVar = this.aH;
        if (kuzVar != null) {
            kuzVar.k(bundle);
        }
    }

    @Override // defpackage.akgj
    public final void qX() {
        aF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        kwj kwjVar;
        if (this.aH.E == null || (kwjVar = this.aD) == null || kwjVar.a == null || !ap()) {
            return;
        }
        if (!this.aH.o().isEmpty()) {
            kwj kwjVar2 = this.aD;
            MenuItem menuItem = kwjVar2.a;
            kwjVar2.a(aE(), rh().getColor(R.color.yt_material_blue_500));
            return;
        }
        kwj kwjVar3 = this.aD;
        MenuItem menuItem2 = kwjVar3.a;
        kwjVar3.a(aE(), hve.i(R.attr.ytTextPrimary).la(rb()));
    }

    public final void s() {
        auwg auwgVar = this.aH.E;
        if (auwgVar == null || auwgVar.b.size() <= 0 || !ap()) {
            return;
        }
        kvc.aG(F(), this.aH.E);
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        int i3 = 1000;
        if (i == 1000) {
            if (i2 == -1) {
                this.aC.b(intent);
                return;
            }
            i = 1000;
        }
        if (i != 1000) {
            i3 = i;
        } else if (i2 == 1 && eog.A(this.am)) {
            this.aH.b(intent.getStringExtra("AssistantCsn"), oi().k());
        }
        this.al.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
        super.S(i3, i2, intent);
    }
}
