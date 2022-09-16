package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aknr  reason: default package */
/* loaded from: classes.dex */
public class aknr extends aknb implements View.OnClickListener, aklw, akkp, acth {
    static final long af = TimeUnit.SECONDS.toMillis(2);
    public ajmy aA;
    public aaun aB;
    public ces aC;
    public SharedPreferences aD;
    public ajsg aE;
    public ajsk aF;
    public aafo aG;
    public snc aH;
    public zhf aI;
    public aacz aJ;
    private aklx aK;
    private aafo aL;
    private ActivityIndicatorFrameLayout aM;
    private View aN;
    private FloatingActionButton aO;
    private Snackbar aP;
    private Animation aQ;
    private Animation aR;
    private akli aS;
    private ViewTreeObserver.OnGlobalLayoutListener aT;
    private int aU;
    private int aV;
    private Context aW;
    private dt ae;
    public View ag;
    public View ah;
    public AnchorableTopPeekingScrollView ai;
    public ViewGroup aj;
    public RecyclerView ak;
    public RecyclerView al;
    public aknq am;
    public final Runnable an = new Runnable() { // from class: aknf
        @Override // java.lang.Runnable
        public final void run() {
            aknr aknrVar = aknr.this;
            aknrVar.al.E.t(new akne(aknrVar));
        }
    };
    public akpj ao;
    public aknz ap;
    public axnm aq;
    public axnm ar;
    public Handler as;
    public Executor at;
    public ajgz au;
    public acti av;
    public yzj aw;
    public yni ax;
    public ScheduledExecutorService ay;
    public ankw az;

    private static boolean aJ(View view) {
        return (view == null || view.getLayoutParams() == null) ? false : true;
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        apzg c = aafr.c(this.m.getByteArray("navigation_endpoint"));
        this.aL = new actk(this.aG, this);
        Resources rh = rh();
        aaun aaunVar = this.aB;
        acti actiVar = this.av;
        yzj yzjVar = this.aw;
        ScheduledExecutorService scheduledExecutorService = this.ay;
        yni yniVar = this.ax;
        ajmy ajmyVar = this.aA;
        atfw atfwVar = this.aJ.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apgv apgvVar = atfwVar.m;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        this.aK = new aklx(c, aaunVar, actiVar, yzjVar, scheduledExecutorService, yniVar, ajmyVar, apgvVar, this.aW, this.aL, this.ao, this, this, this.ap, this.aC, this.au, this.aS, this.aD, this.aE, this.aF, rh.getDimensionPixelSize(R.dimen.share_panel_row_horizontal_padding), rh.getDimensionPixelSize(R.dimen.share_panel_row_first_and_last_vertical_padding), this.at, this.az);
        aknq aknqVar = new aknq(this.aK, this.as);
        this.am = aknqVar;
        aknqVar.a(aknp.PEEK);
        final aklx aklxVar = this.aK;
        aklxVar.n = aklxVar.d.submit(new Callable() { // from class: aklt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aklx aklxVar2 = aklx.this;
                ylr.b();
                return zgt.F(aklxVar2.g.getPackageManager());
            }
        });
        aklxVar.j.a(aklxVar.m);
        aklxVar.e.g(aklxVar);
        aklxVar.l.a(aklxVar);
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint) aklxVar.a.qm(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        if (shareEndpointOuterClass$ShareEntityEndpoint.c.isEmpty()) {
            if (!shareEndpointOuterClass$ShareEntityEndpoint.b.isEmpty()) {
                String str = shareEndpointOuterClass$ShareEntityEndpoint.b;
                aklxVar.e.d(new evu());
                aklxVar.h.b(true);
                aklxVar.b.d(str, apwt.r(aklxVar.b(), aklxVar.f), new aklv(aklxVar), false);
                return;
            }
            throw new IllegalArgumentException("Invalid share entity endpoint provided.");
        }
        aklxVar.h.b(false);
        aklxVar.d(new aauu(shareEndpointOuterClass$ShareEntityEndpoint.c));
    }

    @Override // defpackage.dp
    public void W() {
        super.W();
        aknz aknzVar = this.ap;
        ylr.c();
        aknzVar.b.remove(this);
    }

    @Override // defpackage.dp
    public void Y() {
        super.Y();
        aknz aknzVar = this.ap;
        ylr.c();
        aknzVar.b.add(this);
    }

    @Override // defpackage.akkp
    public final void a(argj argjVar, View view, Object obj) {
        if (this.ae == null) {
            zep.g("Did not show hint tooltip because the share panel fragment was not attached to an activity.");
            return;
        }
        aklc aklcVar = (aklc) this.ar.get();
        aklcVar.b = this.aL;
        if (aklcVar.a(view)) {
            aklcVar.b(argjVar, view, obj);
        } else {
            view.addOnLayoutChangeListener(new akkx(aklcVar, view, argjVar, obj));
        }
    }

    public final void aI(boolean z) {
        int i;
        int height = this.ak.getHeight();
        int childCount = this.al.getChildCount() - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.al.getChildAt(i3);
            if (aJ(childAt)) {
                xw xwVar = this.al.n;
                i2 += xw.bj(childAt);
            }
        }
        View childAt2 = this.al.getChildAt(childCount);
        if (aJ(childAt2)) {
            xw xwVar2 = this.al.n;
            i = xw.bj(childAt2);
        } else {
            i = 0;
        }
        int height2 = this.ag.getHeight() - (((height + i2) + ((int) (i * (true != l() ? 0.5f : 0.7f)))) + this.aV);
        int max = Math.max(height2, this.aU);
        if (z) {
            if (max < this.ai.k || !l()) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(this.ai.k, max);
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                valueAnimator.addUpdateListener(new aknm(this));
                valueAnimator.addListener(new aknn(this));
                valueAnimator.start();
            } else {
                this.am.a(aknp.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
            }
        } else if (max < this.ai.k || !l()) {
            this.ai.h(max);
        }
        if (height2 >= this.aU) {
            this.ai.i(true);
        }
    }

    @Override // defpackage.aklw
    public final void b(boolean z) {
        xo xoVar;
        xo xoVar2 = this.ak.m;
        if ((xoVar2 == null || xoVar2.b() <= 0) && ((xoVar = this.al.m) == null || xoVar.b() <= 0)) {
            if (z) {
                this.aN.setVisibility(0);
            } else {
                this.aN.setVisibility(8);
            }
        } else if (z) {
            ActivityIndicatorFrameLayout activityIndicatorFrameLayout = this.aM;
            activityIndicatorFrameLayout.b = true;
            activityIndicatorFrameLayout.a.start();
            activityIndicatorFrameLayout.invalidate();
        } else {
            ActivityIndicatorFrameLayout activityIndicatorFrameLayout2 = this.aM;
            activityIndicatorFrameLayout2.b = false;
            activityIndicatorFrameLayout2.a.stop();
            activityIndicatorFrameLayout2.invalidate();
        }
    }

    @Override // defpackage.aklw
    public final void d(ajsf ajsfVar, ajsf ajsfVar2) {
        this.aj.setAlpha(0.0f);
        this.aj.setVisibility(0);
        this.aj.setTranslationY(100.0f);
        this.aj.animate().setListener(new aknl(this)).alpha(1.0f).translationY(0.0f).start();
        this.ak.ad(ajsfVar);
        this.al.ad(ajsfVar2);
        this.aj.getViewTreeObserver().addOnGlobalLayoutListener(new akni(this, 2));
    }

    @Override // defpackage.dh
    public final void dismiss() {
        this.ah.animate().alpha(0.0f).setDuration(250L).start();
        this.ai.animate().translationY(this.ag.getHeight()).setDuration(250L).setListener(new aknj(this)).start();
    }

    @Override // defpackage.aklw
    public final void h() {
        dismiss();
    }

    @Override // defpackage.aklw
    public final void i(boolean z) {
        if (z == this.ai.n) {
            return;
        }
        if (z) {
            this.aT = new akni(this, 1);
            this.al.getViewTreeObserver().addOnGlobalLayoutListener(this.aT);
            this.ai.i(true);
            return;
        }
        if (this.aT != null) {
            this.al.getViewTreeObserver().removeOnGlobalLayoutListener(this.aT);
        }
        this.aT = null;
        this.ai.i(false);
    }

    @Override // defpackage.aklw
    public final void k(aabj aabjVar) {
        alwb.f(this.aH, this.aP, aabjVar, af, null, null);
    }

    @Override // defpackage.aklw
    public final boolean l() {
        Context rb = rb();
        if (rb == null) {
            return true;
        }
        int m = zew.m(rb);
        return (m == 3 || m == 4) ? false : true;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ae = mJ();
        mN(2, this.aI.a);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        super.mR();
        aklx aklxVar = this.aK;
        aklxVar.o = true;
        aklxVar.l.d(aklxVar);
        aklxVar.j.c(aklxVar.m);
        for (aklk aklkVar : aklxVar.i) {
            aklkVar.j();
        }
        aklxVar.e.m(aklxVar);
        aklxVar.e.d(new ewd());
        if (aklxVar.a.qn(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            aklxVar.k.e(aaut.t(((ShareEndpointOuterClass$ShareEntityEndpoint) aklxVar.a.qm(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)).b, apwt.r(aklxVar.b(), aklxVar.f)));
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Window window = this.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aW = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.unified_share_panel_fragment, viewGroup, false);
        this.ag = inflate;
        this.ah = inflate.findViewById(R.id.overlay);
        this.ai = (AnchorableTopPeekingScrollView) this.ag.findViewById(R.id.top_peeking_scroll_view);
        this.aM = (ActivityIndicatorFrameLayout) this.ag.findViewById(R.id.progress_linear_bar);
        int dimensionPixelSize = this.ag.getResources().getDimensionPixelSize(R.dimen.share_panel_contents_width);
        if (dimensionPixelSize > 0) {
            zgd.t(this.ai, zgd.r(dimensionPixelSize), ViewGroup.LayoutParams.class);
        }
        this.aN = this.ag.findViewById(R.id.progress_spinner);
        this.aj = (ViewGroup) this.ag.findViewById(R.id.content);
        this.ak = (RecyclerView) this.ag.findViewById(R.id.header);
        this.al = (RecyclerView) this.ag.findViewById(R.id.list);
        this.aO = (FloatingActionButton) this.ag.findViewById(R.id.send_button);
        this.aP = (Snackbar) this.ag.findViewById(R.id.snackbar);
        this.aS = new akli(this.ae, this.ao, this.aA, this.ag.findViewById(R.id.select_message_view), this.ag.findViewById(R.id.message_input_view));
        Resources resources = this.ae.getResources();
        this.aU = 0;
        this.ah.setOnClickListener(this);
        if (l()) {
            this.aU = resources.getDimensionPixelSize(R.dimen.share_panel_peek_amount);
            this.ai.f(Math.max(rb().getResources().getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(R.dimen.share_panel_default_visible_amount), 0));
        } else {
            this.ai.f(rb().getResources().getDisplayMetrics().heightPixels);
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.ai;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView).l = this.ah;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView).m = this.al;
        new ColorDrawable(zhn.j(this.aW, R.attr.ytSeparator).orElse(0)).setBounds(0, 0, 1, 1);
        this.ak.ag(new LinearLayoutManager());
        akng akngVar = new akng(this);
        akngVar.A = false;
        this.al.ag(akngVar);
        this.aO.setOnClickListener(this);
        this.aQ = AnimationUtils.loadAnimation(this.ae, R.anim.fab_in);
        this.aR = AnimationUtils.loadAnimation(this.ae, R.anim.fab_out);
        this.ag.getViewTreeObserver().addOnGlobalLayoutListener(new akni(this));
        this.aj.setVisibility(4);
        this.aV = vgu.b(this.ae);
        return this.ag;
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.av;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ah) {
            dismiss();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (aklk aklkVar : this.aK.i) {
            aklkVar.lC(configuration);
        }
        aknq aknqVar = this.am;
        aknqVar.b.removeAll(Arrays.asList(aknp.PEEK));
        aknqVar.c = false;
        if (l()) {
            this.ai.h(rh().getDimensionPixelSize(R.dimen.share_panel_peek_amount));
        } else {
            this.ag.addOnLayoutChangeListener(new aknk(this, this.ag.getHeight()));
        }
        this.am.a(aknp.PEEK);
        akkr akkrVar = (akkr) this.aq.get();
    }
}
