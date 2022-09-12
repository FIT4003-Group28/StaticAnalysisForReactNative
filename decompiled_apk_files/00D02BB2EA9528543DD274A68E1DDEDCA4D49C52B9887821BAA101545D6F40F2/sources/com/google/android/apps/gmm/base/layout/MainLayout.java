package com.google.android.apps.gmm.base.layout;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.gmm.base.views.floorpicker.FloorPickerView;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.gmm.map.ui.CompassButtonView;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes.dex */
public class MainLayout extends gkk implements SharedPreferences.OnSharedPreferenceChangeListener, jkh, jkd, gci {
    public static final dcqe a = dcqe.c("com.google.android.apps.gmm.base.layout.MainLayout");
    public cpv A;
    public final gkj<ViewGroup> B;
    public final gkj<ViewGroup> C;
    public final gkj<ViewGroup> D;
    public final gkj<ViewGroup> E;
    public View F;
    public final gkj<ViewGroup> G;
    public final gkj<ViewGroup> H;
    public boolean I;
    public final gkj<ExpandingScrollView> J;
    public final gkj<FrameLayout> K;
    public final gkj<View> L;
    public final gkj<View> M;
    public final gkj<FrameLayout> N;
    public final gkj<FrameLayout> O;
    public final gkj<ViewGroup> P;
    public final gkj<FrameLayout> Q;
    public final gkj<FrameLayout> R;
    public final gkj<View> S;
    public final gkj<View> T;
    public final gkj<ViewGroup> U;
    public final gkj<View> V;
    public final gkj<ViewGroup> W;
    public jjn aA;
    public jjn aB;
    gik aC;
    gik aD;
    public boolean aE;
    public boolean aF;
    public cqkf<?> aG;
    public cqkf<jbq> aH;
    public cqkf<jar> aI;
    public cqkf<bxaz> aJ;
    public cqkf<jar> aK;
    public MapViewContainer aL;
    public int aM;
    private final gkj<MapViewContainer> aO;
    private final gkj<ViewGroup> aP;
    private final gkj<FrameLayout> aQ;
    private final gkj<View> aR;
    private final gkj<ImageView> aS;
    private final gkj<ViewGroup> aT;
    private final gkj<LinearLayout> aU;
    private final gkj<FrameLayout> aV;
    private final gkj<FrameLayout> aW;
    private final gkj<View> aX;
    private final Animation aY;
    private final Animation aZ;
    public final gkj<ViewGroup> aa;
    public acyu ab;
    public final acyt ac;
    public boolean ad;
    public glg ae;
    public egk af;
    public gkq ag;
    public egr ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public ddho ar;
    public glh as;
    public WeakReference<egu> at;
    cqkq<izc> au;
    public izs av;
    public bxaz aw;
    public AnimatorSet ax;
    public gkd ay;
    public float az;
    public bvjj b;
    private final gkj<View> ba;
    private final dcdc<gkj<?>> bb;
    private final int[] bc;
    private final gkj<ViewGroup> bd;
    private final glf be;
    private int bf;
    private ivy bg;
    private final cjxz bh;
    private boolean bi;
    private final gjz bj;
    private final alsp bk;
    private cqkf<jar> bl;
    public dxio<acyr> c;
    public dxio<bego> d;
    public gga e;
    public hwd f;
    public dxio<btvo> g;
    public dxio<araj> h;
    public dxio<akzh> i;
    public akox j;
    public cqkj k;
    public btrm l;
    public cjqy m;
    public cjyb n;
    public alsq o;
    public cqhu p;
    public acyp q;
    public cjqq r;
    public Executor s;
    public eeu t;
    public efg u;
    public efc v;
    public dxio<glk> w;
    public alhv x;
    public cjmt y;
    public dxio<ine> z;

    static {
        TimeUnit.SECONDS.toMillis(1L);
    }

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aO = aq(R.id.map_frame);
        gkj<ViewGroup> aq = aq(R.id.fullscreens_group);
        this.B = aq;
        this.C = aq(R.id.header_container);
        this.D = aq(R.id.custom_header_container);
        this.aP = aq(R.id.compass_container);
        this.E = aq(R.id.footer_container);
        this.G = aq(R.id.bottommapoverlay_container);
        this.H = aq(R.id.secondary_bottommapoverlay_container);
        gkj<ExpandingScrollView> aq2 = aq(R.id.expandingscrollview_container);
        this.J = aq2;
        gkj<FrameLayout> aq3 = aq(R.id.custom_slider_container);
        this.aQ = aq3;
        gkj<View> aq4 = aq(R.id.scalebar_widget);
        aq4.d = false;
        this.aR = aq4;
        gkj<ImageView> aq5 = aq(R.id.watermark_image);
        this.aS = aq5;
        gkj<FrameLayout> aq6 = aq(R.id.qu_sv_entrypoint_container);
        this.K = aq6;
        gkj<View> aq7 = aq(R.id.indoor_content_stub);
        this.L = aq7;
        this.M = aq(R.id.floating_crosshairs);
        this.aT = aq(R.id.tutorial_container);
        this.N = aq(R.id.on_map_action_button);
        gkj<LinearLayout> aq8 = aq(R.id.on_map_secondary_action_button_container);
        this.aU = aq8;
        this.O = aq(R.id.ar_view_action_button_container);
        gkj<ViewGroup> aq9 = aq(R.id.search_omnibox_container);
        this.P = aq9;
        this.Q = aq(R.id.below_search_omnibox_container);
        this.R = aq(R.id.on_map_refresh_action_container);
        gkj<FrameLayout> aq10 = aq(R.id.satellite_button);
        this.aV = aq10;
        this.aW = aq(R.id.footer_fab_container);
        gkj<View> aq11 = aq(R.id.map_copyright_content);
        this.aX = aq11;
        this.S = aq(R.id.side_panel_shadow);
        this.T = aq(R.id.mapmask_image);
        this.U = aq(R.id.map_overlay);
        this.ba = aq(R.id.omnibox_background_map_mask);
        this.V = aq(R.id.fullsheet_background_mask);
        this.W = aq(R.id.bottom_sheet_placeholder);
        aq(R.id.ads_tutorial_container);
        this.bb = dcdc.l(aq7, aq4, aq11, aq10, aq6, aq8, aq5);
        this.aa = aq(R.id.home_bottom_sheet_container);
        this.bc = new int[2];
        this.ab = null;
        this.ac = new gjl(this);
        this.ad = false;
        this.bd = aq(R.id.side_panel_container);
        this.ae = null;
        this.be = new glf(this) { // from class: git
            private final MainLayout a;

            {
                this.a = this;
            }

            @Override // defpackage.glf
            public final void a() {
                MainLayout mainLayout = this.a;
                mainLayout.w();
                mainLayout.x();
            }
        };
        this.ag = null;
        this.aM = 2;
        this.bf = 0;
        this.ar = dtyi.O;
        cjxz cjxzVar = new cjxz();
        cjxzVar.c();
        this.bh = cjxzVar;
        this.bi = false;
        this.az = 0.0f;
        this.aC = null;
        this.aD = null;
        this.aE = false;
        this.bj = new gjz(this);
        this.bk = new gkb(this);
        ((gkf) bttc.a(gkf.class, this)).ws(this);
        this.as = new glh(aq2, aq3, this.p);
        this.aY = AnimationUtils.loadAnimation(context, R.animator.floor_picker_fade_in);
        this.aZ = AnimationUtils.loadAnimation(context, R.animator.floor_picker_fade_out);
        this.ak = !S() && T();
        setMotionEventSplittingEnabled(false);
        aq.e = aq9;
        aq9.f = aq;
    }

    public static int B(egu eguVar, int i, int i2) {
        if (eguVar.at) {
            return 0;
        }
        return i2 == 0 ? com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMinor : Math.min((int) (((Math.abs(i) / i2) + 1.0f) * 300.0f), 2000) / 3;
    }

    private final void aA(int i, int i2, int i3) {
        dcdc<gkj<?>> dcdcVar = this.bb;
        int size = dcdcVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            gkj<?> gkjVar = dcdcVar.get(i4);
            if (gkjVar == this.K) {
                gkjVar.b.setVisibility(i3);
            } else if (gkjVar == this.L) {
                p();
            } else if (gkjVar == this.aS && i == 0) {
                boolean T = T();
                egu c = this.v.c();
                int i5 = 8;
                if ((c == null || !c.d().y) && (T || (!this.g.a().getSatelliteParameters().b ? !(i2 == 0 || i3 == 0) : !(i2 == 0 && i3 == 0)))) {
                    i5 = 0;
                }
                gkjVar.b.setVisibility(i5);
            } else if (gkjVar == this.aV) {
                gkjVar.b.setVisibility(i2);
            } else {
                gkjVar.b.setVisibility(i);
            }
        }
    }

    private static void aB(View view, Animation animation, Animation.AnimationListener animationListener) {
        if (view.getAnimation() != null) {
            view.getAnimation().cancel();
        }
        animation.setAnimationListener(animationListener);
        view.startAnimation(animation);
    }

    private static View aC(ViewGroup viewGroup) {
        return viewGroup.getChildAt(1);
    }

    private final boolean aD() {
        return this.ae != null && !S();
    }

    private final boolean aE() {
        hwd hwdVar = this.f;
        return hwdVar != null && (hwdVar.k() instanceof SurfaceView);
    }

    private static boolean aF(View view) {
        if (view instanceof SurfaceView) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (aF(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void aG() {
        this.bi = false;
        this.bh.b();
    }

    private final int aH() {
        cqkf<?> cqkfVar = this.aG;
        View view = null;
        View c = cqkfVar == null ? null : cqkfVar.c();
        if (c != null) {
            view = c.findViewById(R.id.search_omnibox_flexible_alert);
        }
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    private final boolean aI() {
        jjn jjnVar;
        egu ah = ah();
        if (ah == null) {
            return false;
        }
        return !aL() || (jjnVar = this.aB) == null || !jjnVar.c(ah.f);
    }

    private final void aJ() {
        egu ah = ah();
        int i = 0;
        boolean z = T() && !S() && ah != null && ah.aE != 1;
        this.T.b.setAlpha(1.0f);
        View view = this.T.b;
        if (true != z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void aK() {
        View view;
        egu ah = ah();
        if (ah == null || (view = ah.E) == null) {
            this.U.b.setVisibility(8);
            return;
        }
        if (view != this.U.b.getChildAt(0)) {
            this.U.b.removeAllViews();
            this.U.b.addView(view);
        }
        this.U.b.setBottom(getMeasuredHeight() - this.as.a().U());
        this.U.b.setVisibility(0);
    }

    private final boolean aL() {
        glh glhVar = this.as;
        return glhVar != null && glhVar.d(ah());
    }

    private final dcdc<View> aM() {
        dccx F = dcdc.F();
        F.g(this.aU.b);
        F.g(this.aV.b);
        F.g(this.N.b);
        F.g(this.K.b);
        F.g(this.O.b);
        ViewGroup u = u();
        u.getChildCount();
        for (int i = 0; i < u.getChildCount(); i++) {
            F.g(u.getChildAt(i));
        }
        F.g(t());
        F.g(this.G.b);
        return F.f();
    }

    private final void aN(jjn jjnVar) {
        egu ah = ah();
        aliw aliwVar = ah == null ? null : ah.au;
        if (ah == null || aliwVar == null || ((aljk) aliwVar).l) {
            aliw J = this.j.J();
            if (J != null) {
                egu ah2 = ah();
                boolean z = false;
                if (!aL() || !jjnVar.b() || this.an || (ah2 != null && !ah2.d)) {
                    z = true;
                }
                J.a(z);
            }
            Z();
        }
    }

    private static void aO(List<View> list, int i) {
        for (View view : list) {
            if (view != null) {
                view.setImportantForAccessibility(i);
            }
        }
    }

    private static int aP(boolean z) {
        return z ? 0 : 4;
    }

    private final boolean aQ() {
        int i;
        egu ah = ah();
        if (ah == null || (i = ah.ab) == -1) {
            return ay();
        }
        return i == 2;
    }

    private final int aR() {
        return jmj.a(getContext(), 4);
    }

    private final int[] aS(View view) {
        view.getLocationInWindow(r0);
        int i = r0[0];
        int[] iArr = this.bc;
        int[] iArr2 = {i - iArr[0], iArr2[1] - iArr[1]};
        return iArr2;
    }

    private final Animator aT(View view, boolean z, int i) {
        ObjectAnimator ofFloat;
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                ofFloat = i + (-1) != 0 ? ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(view, "translationY", -view.getBottom(), 0.0f);
            } else if (i - 1 != 0) {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
            }
        } else {
            ofFloat = i + (-1) != 0 ? ObjectAnimator.ofFloat(view, "alpha", 0.0f) : ObjectAnimator.ofFloat(view, "translationY", -view.getBottom());
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gis
            private final MainLayout a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.v();
            }
        });
        ofFloat.addListener(new gjq(z, view));
        return ofFloat;
    }

    public static void an(ViewGroup viewGroup, View view) {
        if (viewGroup.getChildAt(0) == view) {
            return;
        }
        viewGroup.removeAllViews();
        if (view == null) {
            return;
        }
        viewGroup.addView(view);
    }

    private final int at(boolean z) {
        int g;
        egu ah = ah();
        View view = null;
        egk egkVar = ah != null ? ah.ac : null;
        if (egkVar != null) {
            view = egkVar.a;
        }
        if (view != null) {
            g = aS(view)[1];
        } else if (ah == null || ah.L == null) {
            boolean z2 = (ah == null || ah.K == null) ? false : true;
            boolean z3 = (ah == null || ah.N == null) ? false : true;
            boolean z4 = (ah == null || ah.c == null) ? false : true;
            int[] iArr = new int[3];
            iArr[0] = (!z2 || this.ao || z4) ? 0 : au(this.C, z);
            iArr[1] = (!z3 || this.ap || z4) ? 0 : au(this.D, z);
            iArr[2] = (!z4 || !S()) ? 0 : au(this.P, z);
            g = decl.g(iArr);
        } else {
            g = aw(ah);
        }
        int max = Math.max(g, e());
        return (!W() || this.b.s(bvjk.kx, 0) <= 0) ? max : max + getResources().getDimensionPixelSize(R.dimen.assistive_shortcuts_compass_top_offset) + cqrp.d(4.0d).e(getContext());
    }

    private static int au(gkj<ViewGroup> gkjVar, boolean z) {
        return gkjVar.c.bottom + (z ? (int) gkjVar.b.getTranslationY() : 0);
    }

    private final void av(int i, int i2, int i3) {
        glh glhVar = this.as;
        if (true == this.an) {
            i = i3;
        }
        glhVar.j().a(i, i2);
    }

    private static int aw(egu eguVar) {
        dbty<Integer> dbtyVar;
        if (eguVar.aF == 8 || (dbtyVar = eguVar.L) == null) {
            return 0;
        }
        return dbtyVar.a().intValue();
    }

    private final int ax() {
        egu ah = ah();
        View view = ah == null ? null : ah.K;
        if (ah == null || view == null) {
            bvoo.h("current transition does not have a header view", new Object[0]);
            return 0;
        } else if (ah.L != null) {
            return aw(ah);
        } else {
            return view.getMeasuredHeight();
        }
    }

    private final boolean ay() {
        jjn jjnVar;
        if (!aL() || this.aB == null || this.an) {
            return true;
        }
        egu ah = ah();
        if (ah == null) {
            jjnVar = jjn.COLLAPSED;
        } else {
            jjnVar = ah.h;
        }
        return !this.aB.c(jjnVar);
    }

    private static boolean az(egu eguVar) {
        return (eguVar == null || eguVar.N == null) ? false : true;
    }

    public static boolean l(egu eguVar) {
        return (eguVar.n == null && eguVar.p == null) ? false : true;
    }

    public final Animator A(egu eguVar, final acyu acyuVar, acyu acyuVar2) {
        int c = acyuVar.c() - acyuVar.u();
        int B = B(eguVar, c, this.aa.c.height());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, c);
        ofFloat.setInterpolator(irf.b);
        ofFloat.setDuration(B);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, acyuVar) { // from class: giq
            private final MainLayout a;
            private final acyu b;

            {
                this.a = this;
                this.b = acyuVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MainLayout mainLayout = this.a;
                this.b.o().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mainLayout.D();
            }
        });
        ofFloat.addListener(new gjg(this, acyuVar, acyuVar2, eguVar));
        return ofFloat;
    }

    public final void C() {
        acyu acyuVar = this.ab;
        if (acyuVar == null) {
            return;
        }
        this.aD = null;
        this.aa.b.removeView(acyuVar.o());
        acyuVar.m(this.ac);
        this.ab = null;
        D();
    }

    public final void D() {
        View view = this.ba.b;
        egu ah = ah();
        acyu acyuVar = this.ab;
        izs izsVar = ah == null ? null : ah.c;
        if (ah == null || acyuVar == null || izsVar == null || acyuVar.o().getHeight() < this.aa.c.height()) {
            if (view.getVisibility() == 4) {
                return;
            }
            view.setVisibility(4);
            return;
        }
        int c = (this.aa.c.bottom - acyuVar.c()) + ((int) acyuVar.o().getTranslationY());
        int a2 = jmj.a(getContext(), 48);
        int i = this.P.c.bottom;
        if (c > i + a2) {
            if (view.getVisibility() != 4) {
                view.setVisibility(4);
            }
            izsVar.r(1.0f);
            return;
        }
        float f = (c - i) / a2;
        float f2 = 1.0f - f;
        if (view.getVisibility() != 0) {
            view.setBackgroundColor(ibm.b().b(getContext()));
            view.setVisibility(0);
        }
        view.setAlpha(f2);
        izsVar.r(f);
    }

    public final void E(glg glgVar) {
        glgVar.b(this.be);
        this.bd.b.addView(glgVar.d());
        this.bd.b.setVisibility(0);
        this.ae = glgVar;
    }

    public final void F() {
        glg glgVar = this.ae;
        if (glgVar == null) {
            return;
        }
        this.bd.b.removeView(glgVar.d());
        this.bd.b.setVisibility(8);
        glgVar.c(this.be);
        this.ae = null;
    }

    public final boolean G(View view) {
        ViewGroup K = K();
        if (I() != view) {
            ViewGroup viewGroup = this.B.b;
            viewGroup.getChildAt(0).bringToFront();
            viewGroup.invalidate();
            viewGroup.requestLayout();
            K.removeAllViews();
            if (view == null) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            K.addView(view, new LinearLayout.LayoutParams(-1, -1));
            return true;
        }
        return false;
    }

    public final EditText H() {
        ViewGroup viewGroup;
        gkj<ViewGroup> gkjVar = this.P;
        if (gkjVar == null || (viewGroup = gkjVar.b) == null) {
            return null;
        }
        dbsg<EditText> d = hqv.d(viewGroup);
        if (d.a()) {
            return d.b();
        }
        return null;
    }

    public final View I() {
        return J().getChildAt(0);
    }

    public final ViewGroup J() {
        return (ViewGroup) this.B.b.getChildAt(1);
    }

    public final ViewGroup K() {
        return (ViewGroup) this.B.b.getChildAt(0);
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        egu ah;
        aG();
        if (jjnVar2 != this.aB) {
            this.aB = jjnVar2;
            aa(true);
        }
        if (jjnVar == jjn.FULLY_EXPANDED) {
            setAllowLayoutDuringAnimation(true);
            this.aA = jjnVar2;
            R();
            setAllowLayoutDuringAnimation(false);
        } else if (jjnVar == jjn.COLLAPSED && jjnVar2.b()) {
            this.l.b(gkc.a);
        }
        aN(jjnVar2);
        View j = this.as.a().j();
        if (j == null) {
            return;
        }
        jke b = this.as.b();
        View i = b == null ? null : b.i();
        if (i == null || (ah = ah()) == null || !l(ah)) {
            return;
        }
        if (j instanceof begb) {
            ((begb) j).e(i, jjnVar, jjnVar2);
        } else {
            this.A.g(i, jjnVar, jjnVar2, getContext().getString(R.string.ACCESSIBILITY_CARD_COLLAPSED), getContext().getString(R.string.ACCESSIBILITY_CARD_EXPANDED), false);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        if (this.bi) {
            aG();
        }
        this.bi = true;
        this.n.c(this.bh);
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        aG();
    }

    @Override // defpackage.gci
    public final void NN() {
        boolean a2 = gct.a(getContext().getResources().getConfiguration());
        int i = a2 ? R.drawable.generic_above_shadow_nightmode : R.drawable.generic_above_shadow;
        View view = this.F;
        dbsk.s(view);
        view.setBackgroundResource(i);
        jke b = this.as.b();
        if (b != null) {
            b.g();
        }
        acyu acyuVar = this.ab;
        if (acyuVar != null) {
            acyuVar.a();
        }
        this.S.b.setBackgroundResource(true != a2 ? R.drawable.generic_end_shadow : R.drawable.generic_end_shadow_nightmode);
        this.V.b.setBackgroundColor(ibm.b().b(getContext()));
        this.W.b.setBackground(ibk.b().a(getContext()));
    }

    @Override // defpackage.jkh
    public final void O() {
        aK();
        ab();
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        setAllowLayoutDuringAnimation(true);
        this.aA = jjnVar;
        R();
        aK();
        setAllowLayoutDuringAnimation(false);
        izs izsVar = this.av;
        if (izsVar != null) {
            int aH = aH();
            ExpandingScrollView expandingScrollView = this.J.b;
            int C = expandingScrollView.C(jjnVar);
            izsVar.ad(aH, expandingScrollView.C(jjn.FULLY_EXPANDED) - (((expandingScrollView.C(jjnVar == jjn.HIDDEN ? jjn.COLLAPSED : expandingScrollView.D(jjnVar)) - C) * f) + C));
        }
        if (jjnVar == jjn.HIDDEN && f == 0.0f) {
            glh glhVar = this.as;
            if (glhVar.h && jkjVar == glhVar.b.b) {
                glhVar.h = false;
                glhVar.g();
            }
        }
        if (this.bi) {
            if (f > 0.0f) {
                jjnVar = jkjVar.D(jjnVar);
            }
            if (jjnVar != this.aB) {
                this.aB = jjnVar;
                aa(true);
            }
        }
        ab();
    }

    public final Rect Q() {
        Rect ak = ak(1, true);
        al(ak);
        return ak;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (((defpackage.ggb) r5).a() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
        if (r4.m().l().C(defpackage.jjn.FULLY_EXPANDED) >= r1.getHeight()) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.layout.MainLayout.R():void");
    }

    public final boolean S() {
        return getContext().getResources().getConfiguration().orientation == 1;
    }

    public final boolean T() {
        return btpf.b(getContext());
    }

    public final boolean U() {
        egu ah = ah();
        return (ah == null || ah.y == null) ? false : true;
    }

    public final boolean V() {
        if (!this.al || !U()) {
            return this.an && aL();
        }
        return true;
    }

    public final boolean W() {
        egu ah = ah();
        return (this.c.a().d() || this.d.a().a.a().ab()) && ah != null && ah.av != null && S();
    }

    public final void X() {
        Y(J());
    }

    public final void Y(View view) {
        if (ah() == null) {
            return;
        }
        if (this.al) {
            cjxu.c(view, getResources().getDimensionPixelOffset(R.dimen.tablet_landscape_side_sheet_width));
        } else {
            cjxu.c(view, -1);
        }
    }

    @Override // defpackage.jkd
    public final boolean a() {
        egu ah = ah();
        return ah != null && ah.e;
    }

    public final void aa(boolean z) {
        egu ah = ah();
        if (ah == null) {
            return;
        }
        AnimatorSet animatorSet = this.ax;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.ax = null;
        }
        ArrayList f = dchl.f(3);
        if (ah.K != null) {
            f.add(aT(this.C.b, m(this.aB, ah), 1));
        }
        if (ah.c != null) {
            f.add(aT(this.P.b, aI(), 1));
        }
        f.add(aT(af(), aQ(), 2));
        if (ah.g != null) {
            f.add(aT(this.R.b, ay(), 1));
        }
        if (ah.av != null) {
            f.add(aT(this.Q.b, ay(), 1));
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.ax = animatorSet2;
            animatorSet2.playTogether(f);
            this.ax.addListener(new gjp(this));
            this.ax.start();
            return;
        }
        int size = f.size();
        for (int i = 0; i < size; i++) {
            ((Animator) f.get(i)).end();
        }
    }

    public final void ab() {
        dbty<Integer> dbtyVar;
        float a2;
        int[] iArr;
        float f;
        if (this.ad) {
            return;
        }
        float h = h();
        dcdc<gkj<?>> dcdcVar = this.bb;
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t = dcdcVar.get(i2).b;
            if (!(t instanceof ViewStub)) {
                t.setTranslationY(-h);
            }
        }
        egu ah = ah();
        if ((ah == null ? null : ah.L) == null) {
            this.G.b.setTranslationY(-h);
        } else {
            this.G.b.setTranslationY(-Math.min((getHeight() - dbtyVar.a().intValue()) - this.G.b.getHeight(), h));
        }
        this.N.b.setAlpha(true != (ah != null && ah.ag != null && !this.as.c()) ? 0.0f : 1.0f);
        int aR = aR();
        if (this.as.e() || !this.as.c() || this.an) {
            if (this.N.b.getVisibility() == 0) {
                this.N.b.setTranslationY(-h);
                a2 = (this.N.c.height() - aR) * this.N.b.getScaleY();
            } else if (this.G.b.getVisibility() == 0) {
                a2 = this.G.b.getHeight();
            } else if (this.aW.b.getVisibility() == 0) {
                a2 = jmj.a(getContext(), 64) / 2.0f;
            }
            h += a2;
        } else {
            jkj a3 = this.as.a();
            jjn jjnVar = jjn.HIDDEN;
            float min = Math.min(this.as.a().U() / this.as.a().C(jjn.COLLAPSED), 1.0f);
            float C = a3.C(jjn.COLLAPSED) * min;
            Context context = getContext();
            if (jjnVar == jjn.HIDDEN) {
                int a4 = jmj.a(context, 64);
                float f2 = (-a4) / 2.0f;
                btpf c = btpf.c(context);
                f = (!c.e || !c.f) ? Math.min((-(a4 + gwu.a().NR(context))) + (min * a3.C(jjn.COLLAPSED)), f2) : min * f2;
            } else {
                f = (-jmj.a(context, 64)) / 2.0f;
            }
            h = Math.max(h, (C - f) - aR);
        }
        float f3 = -h;
        this.aU.b.setTranslationY(f3);
        this.O.b.setTranslationY(f3);
        FrameLayout frameLayout = this.O.b;
        frameLayout.getLocationOnScreen(new int[2]);
        if (iArr[1] - this.P.c.bottom <= getContext().getResources().getDisplayMetrics().density * 30.0f || !this.aF) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        g();
        s(ah);
        Z();
    }

    public final boolean ac(egu eguVar) {
        return eguVar.az && this.q.g();
    }

    public final cjmu ad(egu eguVar) {
        return (!this.ak || !eguVar.D || !this.q.c()) ? eguVar.J : cjmu.TRANSLUCENT_WHITE_BG_DARK_ICONS_DM_AWARE;
    }

    public final MapViewContainer ae() {
        return this.aO.b;
    }

    public final ViewGroup af() {
        return this.aP.b;
    }

    public final ImageView ag() {
        return this.aS.b;
    }

    public final egu ah() {
        WeakReference<egu> weakReference = this.at;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final ValueAnimator aj(int i) {
        ViewGroup viewGroup = this.C.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.az, 0.0f);
        ofFloat.addUpdateListener(new gjt(this, i, viewGroup));
        ofFloat.addListener(new gju(viewGroup));
        return ofFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect ak(int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.layout.MainLayout.ak(int, boolean):android.graphics.Rect");
    }

    public final void al(Rect rect) {
        int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(R.dimen.map_visiblerect_padding);
        int i = dimensionPixelOffset + dimensionPixelOffset;
        int width = rect.width() > i ? dimensionPixelOffset : rect.width() / 2;
        if (rect.height() <= i) {
            dimensionPixelOffset = rect.height() / 2;
        }
        rect.inset(width, dimensionPixelOffset);
    }

    public final void am(ViewGroup viewGroup, View view) {
        LinearLayout.LayoutParams layoutParams;
        egu ah = ah();
        if (ah == null || ah.aH != 2) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        View aC = aC(viewGroup);
        if (aC != null) {
            if (aC == view && aC.getLayoutParams().equals(layoutParams)) {
                return;
            }
            viewGroup.removeView(aC);
        }
        if (view != null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public final void ap(jkh jkhVar) {
        glh glhVar = this.as;
        glhVar.a.remove(jkhVar);
        jke b = glhVar.b();
        dbsk.s(b);
        b.G(jkhVar);
    }

    @Override // defpackage.jkd
    public final void b(boolean z) {
        if (!z) {
            return;
        }
        cjta b = cjtd.b();
        ddho ddhoVar = this.ar;
        b.d = ddhoVar;
        if (!dbsd.a(ddhoVar, dtyb.bj)) {
            ddqc bZ = ddqk.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar = (ddqk) bZ.b;
            ddqkVar.c = 1;
            ddqkVar.a |= 2;
            int s = cjqg.s(jjn.EXPANDED);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar2 = (ddqk) bZ.b;
            ddqkVar2.e = s - 1;
            ddqkVar2.a |= 8;
            int s2 = cjqg.s(jjn.COLLAPSED);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar3 = (ddqk) bZ.b;
            ddqkVar3.d = s2 - 1;
            ddqkVar3.a |= 4;
            b.n(bZ.bK());
        }
        this.m.j(this.r.f(this).d(b.a()), b.a());
    }

    public final void c(jkh jkhVar) {
        glh glhVar = this.as;
        glhVar.a.add(jkhVar);
        jke b = glhVar.b();
        dbsk.s(b);
        b.F(jkhVar);
    }

    final int d() {
        return ((Integer) dbsg.j(this.as.b()).h(giu.a).c(0)).intValue();
    }

    public final int e() {
        return this.y.g();
    }

    public final void f() {
        dehn<akox> n;
        akyy akyyVar;
        hwd hwdVar = this.f;
        if (hwdVar == null || (n = hwdVar.n()) == null || !n.isDone() || ((akox) deha.s(n)).k() == null || (akyyVar = this.i.a().b) == null) {
            return;
        }
        akyyVar.b(Q(), ak(1, true));
        akyyVar.f();
        LinearLayout linearLayout = this.aU.b;
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (linearLayout.getVisibility() == 0 && childAt.getVisibility() == 0) {
                float x = childAt.getX() + linearLayout.getX();
                float y = childAt.getY() + linearLayout.getY();
                akyyVar.g(new amkz(x, y, childAt.getWidth() + x, childAt.getHeight() + y));
            }
        }
    }

    public final void g() {
        gkj<FrameLayout> gkjVar;
        int top;
        View view = this.L.b;
        if ((view instanceof ViewStub) || view.getVisibility() != 0) {
            return;
        }
        Resources resources = getResources();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = 0;
        if (this.aV.b.getVisibility() == 0 || this.g.a().getSatelliteParameters().b) {
            gkjVar = this.aV;
            top = gkjVar.b.getTop();
        } else if (this.K.b.getVisibility() == 0) {
            gkjVar = this.K;
            top = gkjVar.b.getBottom();
        } else {
            gkjVar = null;
            top = 0;
        }
        gkj<ViewGroup> gkjVar2 = this.D;
        int height = gkjVar2 != null ? gkjVar2.c.height() : 0;
        if (gkjVar != null) {
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.padding_medium);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.padding_large);
            this.L.b(measuredWidth, Integer.MIN_VALUE, Math.max((((gkjVar.c.top + ((int) gkjVar.b.getTranslationY())) - this.P.c.bottom) - (dimensionPixelOffset2 + dimensionPixelOffset2)) - height, gkjVar.c.height()), Integer.MIN_VALUE);
            this.L.e(dimensionPixelOffset, (top - this.L.c.height()) - dimensionPixelOffset2, measuredWidth, bvox.a(this));
        } else {
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.layers_watermark_margin);
            if (ag().getVisibility() == 0) {
                i = ag().getMeasuredHeight();
            }
            int i2 = measuredHeight - i;
            int i3 = dimensionPixelOffset3 + dimensionPixelOffset3;
            this.L.b(measuredWidth, Integer.MIN_VALUE, (((i2 - Math.max(this.P.c.bottom, this.C.c.bottom)) - ((int) h())) - i3) - height, Integer.MIN_VALUE);
            gkj<View> gkjVar3 = this.L;
            gkjVar3.e(dimensionPixelOffset3, (i2 - gkjVar3.c.height()) - i3, measuredWidth, bvox.a(this));
        }
        this.L.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (aE()) {
            region.setEmpty();
            return true;
        }
        return super.gatherTransparentRegion(region);
    }

    public final float h() {
        float f;
        float min;
        int min2;
        egu ah = ah();
        ViewGroup viewGroup = this.E.b;
        float height = (this.aq || viewGroup.getVisibility() != 0) ? 0.0f : (getHeight() - viewGroup.getTop()) - viewGroup.getTranslationY();
        if (this.an || !this.as.d(ah)) {
            f = 0.0f;
        } else {
            jkj a2 = this.as.a();
            if (ah == null) {
                min2 = a2.U();
            } else {
                min2 = Math.min(a2.U(), a2.C(ah.h));
            }
            f = min2 + d();
        }
        acyu acyuVar = this.ab;
        ViewGroup viewGroup2 = this.W.b;
        boolean z = ah != null && ac(ah);
        if (acyuVar == null) {
            min = 0.0f;
        } else {
            boolean z2 = (ah == null || ah.V == -1) ? false : true;
            int u = acyuVar.u();
            if (!z2) {
                min = u;
            } else if (viewGroup2.getVisibility() != 0 || !z) {
                min = Math.min(acyuVar.c() - acyuVar.o().getTranslationY(), Math.max(u, ah.V));
            } else {
                min = viewGroup2.getMeasuredHeight() - viewGroup2.getY();
            }
        }
        return dece.b(0.0f, height, f, min);
    }

    public final int i() {
        return j(false);
    }

    public final int j(boolean z) {
        egu ah = ah();
        if (ah == null || ah.L == null) {
            int height = this.P.b.getHeight();
            if (z) {
                height += this.Q.b.getHeight();
            }
            return decl.g(height, this.D.b.getHeight(), this.C.b.getHeight());
        }
        return aw(ah);
    }

    public final int k() {
        float a2;
        float width = getWidth();
        egu ah = ah();
        if (ah == null) {
            a2 = egn.ONE_THIRD_EXPANDED_MAP.a(width);
        } else {
            a2 = ah.m.a(width);
        }
        int i = (int) a2;
        egu ah2 = ah();
        int e = hps.e(getContext());
        if (ah2 != null && ah2.f.c(jjn.COLLAPSED) && this.P.c.height() > e) {
            i += this.P.c.height() - e;
        }
        return getHeight() - i;
    }

    public final boolean m(jjn jjnVar, egu eguVar) {
        int i;
        if (eguVar.K == null || (i = eguVar.aF) == 0) {
            return false;
        }
        if ((this.ao && i == 2) || i == 6 || i == 5 || i == 8) {
            return true;
        }
        boolean z = i == 4;
        egu ah = ah();
        return z == (jjnVar != null && ((jjnVar != null && ah != null && jjnVar.c(ah.f)) || (this.an && aL())));
    }

    public final cqkf<jar> n(cqkf<jar> cqkfVar, ViewGroup viewGroup, cqiw<jar> cqiwVar) {
        if (cqkfVar != null) {
            if (cqkfVar.j().equals(cqiwVar)) {
                return cqkfVar;
            }
            cqkfVar.i();
        }
        cqkf<jar> e = this.k.e(cqiwVar);
        viewGroup.addView(e.c());
        return e;
    }

    public final void o(egu eguVar) {
        int i = 8;
        int i2 = true != eguVar.c() ? 8 : 0;
        int i3 = true != eguVar.g(getContext(), this.g.a().getSatelliteParameters()) ? 8 : 0;
        if (true == eguVar.f()) {
            i = 0;
        }
        aA(i2, i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        cxdy e = bvmo.e("MainLayout::onAttachedToWindow");
        try {
            super.onAttachedToWindow();
            btrm btrmVar = this.l;
            gjz gjzVar = this.bj;
            dceq a2 = dcet.a();
            a2.b(jgs.class, new gkg(jgs.class, gjzVar, bvrj.UI_THREAD));
            btrmVar.g(gjzVar, a2.a());
            this.o.a(this.bk);
            ivy ivyVar = this.bg;
            if (ivyVar != null) {
                ivz.b(this.l, ivyVar);
            }
            this.b.f(this);
            c(this);
            this.as.h(this);
            if (this.w.a().f()) {
                deha.q(this.w.a().j(), new gjn(this), dege.a);
            }
            NN();
        } finally {
            bvmo.f(e);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gkq gkqVar = this.ag;
        if (gkqVar != null && gkqVar.g) {
            final MainLayout mainLayout = gkqVar.b;
            mainLayout.getClass();
            Runnable runnable = new Runnable(mainLayout) { // from class: gkm
                private final MainLayout a;

                {
                    this.a = mainLayout;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            };
            if (!gkqVar.h()) {
                gkqVar.d(runnable);
            }
        }
        egu ah = ah();
        s(ah);
        int i = 0;
        boolean z = !S() && T();
        if (this.ak == z) {
            return;
        }
        this.ak = z;
        if (ah == null || !z || !ah.D) {
            this.al = false;
            this.am = false;
            this.an = false;
            this.ao = false;
            this.ap = false;
            this.aq = false;
        } else {
            this.al = ah.y != null;
            this.am = ah.c != null;
            this.an = l(ah);
            this.ao = ah.K != null;
            this.ap = ah.N != null;
            this.aq = ah.P != null && !ah.aA;
        }
        if (ah != null && this.q.c()) {
            this.y.k(ad(ah));
        }
        X();
        R();
        w();
        x();
        ab();
        aJ();
        aK();
        View view = this.S.b;
        if (true != V()) {
            i = 8;
        }
        view.setVisibility(i);
        aN(this.as.a().L());
        aa(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ap(this);
        this.as.l(this);
        this.b.g(this);
        ivy ivyVar = this.bg;
        if (ivyVar != null) {
            this.l.a(ivyVar);
        }
        this.l.a(this.bj);
        this.o.b(this.bk);
        this.x.e();
        this.aL = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.gkk, android.view.View
    public final void onFinishInflate() {
        cxdy e = bvmo.e("MainLayout::onFinishInflate");
        try {
            super.onFinishInflate();
            aJ();
            this.B.b.setVisibility(0);
            this.J.b.setShouldUseRoundedCornersShadow(false);
            if (T()) {
                this.T.b.setOnClickListener(new gjr(this));
            }
            this.b.m(bvjk.aw, false);
            this.b.m(bvjk.ay, false);
            this.b.m(bvjk.az, false);
            R();
            this.aC = new gik(ae(), aM(), ViewConfiguration.get(getContext()).getScaledTouchSlop());
            glh glhVar = this.as;
            dbsk.s(glhVar.c.b);
            dbsk.s(glhVar.b.b);
            glhVar.i();
            if (!T() && this.ag == null) {
                this.ag = new gkq(this, this.l, this.m, this.x, new gij(this, this.y));
            }
            this.F = this.E.b.findViewById(R.id.footer_container_above_shadow);
            this.E.b.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: giv
                private final MainLayout a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MainLayout mainLayout = this.a;
                    if (i6 != i2) {
                        mainLayout.ab();
                    }
                }
            });
        } finally {
            bvmo.f(e);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gik gikVar;
        gik gikVar2 = this.aD;
        if (gikVar2 == null || !gikVar2.a(motionEvent)) {
            return ay() && (gikVar = this.aC) != null && gikVar.a(motionEvent);
        }
        return true;
    }

    @Override // defpackage.gkk, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cxdy e = bvmo.e("MainLayout::onLayout");
        try {
            gkk.as();
            for (gkj<?> gkjVar : this.aN.values()) {
                if (gkjVar.b != 0) {
                    gkjVar.f();
                }
            }
            View findViewById = this.e.findViewById(R.id.mainmap_container);
            if (findViewById != null) {
                findViewById.getLocationInWindow(this.bc);
            }
            v();
            if (z) {
                ab();
            }
            egu ah = ah();
            if (ah == null) {
                return;
            }
            boolean contains = ah.k.d(ah.j).contains(jjn.EXPANDED);
            boolean contains2 = ah.l.d(ah.j).contains(jjn.EXPANDED);
            if (!S() ? !contains2 : !contains) {
                return;
            }
            int i5 = 1;
            if (true == ah.i) {
                i5 = 2;
            }
            if (i5 - 1 == 0) {
                jke b = this.as.b();
                dbsk.s(b);
                b.setTwoThirdsHeight(k());
            } else {
                int i6 = bfki.d(getContext().getResources()).c;
                jke b2 = this.as.b();
                dbsk.s(b2);
                b2.setTwoThirdsHeight(getHeight() - i6);
            }
        } finally {
            bvmo.f(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0342, code lost:
        if (r26.an != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034f, code lost:
        if (r8.f != defpackage.jjn.FULLY_EXPANDED) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0351, code lost:
        r0 = r26.P.c.height() - aH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03a3, code lost:
        if (r8 < 0) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0302 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0327 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033c A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0362 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0377 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0382 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b3 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c3 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a8 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0513 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x054e A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0573 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ce A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05d8 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e3 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0604 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x062c A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0635 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c2 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020f A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0236 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023f A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0249 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025f A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d8 A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ea A[Catch: all -> 0x06e8, TryCatch #0 {all -> 0x06e8, blocks: (B:13:0x007a, B:15:0x00a2, B:16:0x00ab, B:18:0x00c0, B:20:0x00d3, B:22:0x00db, B:35:0x0120, B:37:0x0125, B:39:0x0138, B:44:0x014f, B:46:0x016a, B:48:0x016e, B:50:0x0176, B:54:0x019c, B:56:0x01aa, B:58:0x01bd, B:60:0x01d0, B:62:0x01e7, B:65:0x0228, B:66:0x0229, B:68:0x0236, B:71:0x0249, B:73:0x0253, B:76:0x025f, B:77:0x0264, B:80:0x028b, B:84:0x0295, B:85:0x02a2, B:89:0x02ac, B:91:0x02d8, B:103:0x030f, B:105:0x0327, B:108:0x032c, B:110:0x0330, B:121:0x0344, B:128:0x0362, B:129:0x0367, B:131:0x0377, B:136:0x0382, B:138:0x038c, B:140:0x03a1, B:143:0x03a6, B:145:0x03b3, B:146:0x03b7, B:148:0x03c3, B:150:0x03d0, B:152:0x03e9, B:154:0x03ef, B:156:0x03f5, B:158:0x0407, B:159:0x041a, B:161:0x042a, B:162:0x0442, B:163:0x0450, B:165:0x04a8, B:166:0x04df, B:168:0x0513, B:170:0x0522, B:177:0x0555, B:179:0x0573, B:181:0x057f, B:183:0x05ce, B:186:0x05e3, B:187:0x05f8, B:189:0x0604, B:190:0x0619, B:192:0x062c, B:199:0x064f, B:203:0x06a3, B:205:0x06c2, B:206:0x06d6, B:193:0x0635, B:195:0x063d, B:197:0x0643, B:184:0x05d8, B:173:0x054e, B:176:0x0553, B:139:0x0397, B:133:0x037c, B:117:0x033c, B:119:0x0340, B:123:0x034b, B:125:0x0351, B:94:0x02de, B:96:0x02ea, B:98:0x02f6, B:100:0x0302, B:102:0x030e, B:69:0x023f, B:63:0x01f1, B:64:0x020f, B:57:0x01b4, B:51:0x018f, B:53:0x0199, B:43:0x0146, B:38:0x0132, B:25:0x00e7, B:27:0x00eb, B:29:0x00f7, B:30:0x0101, B:32:0x0105, B:33:0x010f, B:19:0x00ca), top: B:216:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.layout.MainLayout.onMeasure(int, int):void");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (bvjk.aw.toString().equals(str)) {
            sharedPreferences.getBoolean(str, false);
        }
        if (bvjk.ay.toString().equals(str)) {
            sharedPreferences.getBoolean(str, false);
        }
        if (bvjk.az.toString().equals(str)) {
            sharedPreferences.getBoolean(str, false);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gik gikVar;
        gik gikVar2 = this.aD;
        if (gikVar2 == null || !gikVar2.a(motionEvent)) {
            return ay() && (gikVar = this.aC) != null && gikVar.c(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [T extends android.view.View, android.view.View, java.lang.Object] */
    public final void p() {
        alsq alsqVar = this.o;
        if (alsqVar == null) {
            return;
        }
        alts g = alsqVar.g();
        altu h = this.o.h(g);
        int visibility = this.L.b.getVisibility();
        int i = 8;
        boolean z = true;
        int i2 = true != (this.L.b instanceof ViewStub) ? visibility : 8;
        int i3 = true != ivy.j(g) ? 8 : 0;
        if (T() || !this.as.a().L().b()) {
            i = i3;
        }
        if (i2 == i3 && visibility == i) {
            z = false;
        }
        if (i == 0) {
            if (this.L.b instanceof ViewStub) {
                cxdy e = bvmo.e("MainLayout::createFloorPickerListViewModel");
                try {
                    gkj<View> gkjVar = this.L;
                    ?? inflate = ((ViewStub) this.e.findViewById(R.id.indoor_content_stub)).inflate();
                    dbsk.s(inflate);
                    gkjVar.b = inflate;
                    w();
                    ab();
                    this.au = new gjo(this);
                    ivy ivyVar = new ivy(this.e, this.o, this.h, this.au);
                    this.au.a(ivyVar);
                    ivz.b(this.l, ivyVar);
                    this.bg = ivyVar;
                } finally {
                    bvmo.f(e);
                }
            }
            FloorPickerView floorPickerView = (FloorPickerView) this.L.b;
            cqkj cqkjVar = this.k;
            if (floorPickerView.a == null) {
                floorPickerView.a = cqkjVar.c(new gxk(), floorPickerView);
            }
        }
        if (visibility != 0 && i == 0) {
            aB(this.L.b, this.aY, new gjx(this, g, h));
        } else if (visibility != 0 || i == 0) {
            if (this.L.b instanceof ViewStub) {
                return;
            }
            q(g, h);
            if (!z) {
                return;
            }
            requestLayout();
        } else {
            aB(this.L.b, this.aZ, new gjy(this, g, h));
        }
    }

    public final void q(alts altsVar, altu altuVar) {
        ivy ivyVar = this.bg;
        if (ivyVar != null) {
            ivyVar.e(altsVar, altuVar);
        }
    }

    public final void r(jar jarVar) {
        if (this.bl == null && jarVar != null) {
            this.bl = this.k.a(new gvs(), this.aW.b);
        }
        cqkf<jar> cqkfVar = this.bl;
        if (cqkfVar != null) {
            cqkfVar.e(jarVar);
            this.aW.b.setVisibility(jarVar != null ? 0 : 8);
        }
    }

    public final void s(egu eguVar) {
        int dimensionPixelOffset;
        int NR;
        if (eguVar == null) {
            return;
        }
        dcdc<View> h = eguVar.h();
        CompassButtonView t = t();
        boolean a2 = bvox.a(this);
        cjxf cjxfVar = eguVar.ae;
        int e = cjxh.c(cjxfVar).e(getContext());
        if (cjxfVar != null) {
            if (cjxfVar == cjxf.SMALL) {
                t.setCompassSize(cjxf.MOD_SMALL);
            } else {
                t.setCompassSize(cjxfVar);
            }
        }
        if (t.f == cjxf.MOD_SMALL) {
            dimensionPixelOffset = getResources().getDimensionPixelSize(R.dimen.compass_button_mod_top_margin);
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.compass_button_larger_padding);
        }
        if (eguVar.af) {
            NR = gwu.d().NR(getContext());
        } else {
            NR = gwu.b().NR(getContext());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e, e);
        layoutParams.gravity = true != a2 ? 5 : 3;
        boolean z = false;
        layoutParams.rightMargin = true != a2 ? NR : 0;
        if (true != a2) {
            NR = 0;
        }
        layoutParams.leftMargin = NR;
        if (true == h.isEmpty()) {
            dimensionPixelOffset = 0;
        }
        layoutParams.topMargin = dimensionPixelOffset;
        layoutParams.bottomMargin = 0;
        t.setLayoutParams(layoutParams);
        ViewGroup[] viewGroupArr = {this.N.b, this.aU.b, this.O.b};
        int i = Integer.MAX_VALUE;
        boolean z2 = false;
        for (int i2 = 0; i2 < 3; i2++) {
            ViewGroup viewGroup = viewGroupArr[i2];
            if (viewGroup.getVisibility() == 0) {
                i = Math.min(viewGroup.getTop() + ((int) viewGroup.getTranslationY()), i);
                z2 = true;
            }
        }
        ViewGroup u = u();
        boolean aQ = aQ();
        if (z2) {
            t.i(i <= this.aP.b.getBottom() + ((int) this.aP.b.getTranslationY()));
            if (i > this.aP.b.getTop() + ((int) this.aP.b.getTranslationY()) + u.getBottom() + ((int) u.getTranslationY())) {
                z = true;
            }
            aQ &= z;
        } else {
            t.i(false);
        }
        gkd gkdVar = this.ay;
        if (gkdVar != null) {
            gig gigVar = (gig) gkdVar;
            if (gigVar.b != aQ) {
                gigVar.a.cancel();
            }
        }
        float f = true != aQ ? 0.0f : 1.0f;
        if (this.ay != null || u.getAlpha() == f) {
            return;
        }
        Animator aT = aT(u, aQ, 2);
        aT.addListener(new gjb(this));
        gig gigVar2 = new gig(aT, aQ);
        this.ay = gigVar2;
        gigVar2.a.start();
    }

    public void setAllowLayoutDuringAnimation(boolean z) {
        int i = this.bf;
        int i2 = 1;
        if (true != z) {
            i2 = -1;
        }
        int i3 = i + i2;
        this.bf = i3;
        if (i3 < 0) {
            bvoo.f(new RuntimeException());
        }
    }

    final CompassButtonView t() {
        ViewGroup viewGroup = this.aP.b;
        return (CompassButtonView) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
    }

    public final ViewGroup u() {
        return (ViewGroup) this.aP.b.findViewById(R.id.above_compass_container);
    }

    public final void v() {
        gkq gkqVar = this.ag;
        if (gkqVar == null || !gkqVar.g) {
            int top = this.aP.b.getTop();
            this.aP.b.setTranslationY(at(true) - top);
        }
        g();
    }

    public final void w() {
        float f;
        egu ah = ah();
        boolean z = false;
        if (ah != null && l(ah)) {
            z = true;
        }
        if ((!this.al || ah == null || ah.y == null) && (!this.an || !z)) {
            if (aD()) {
                glg glgVar = this.ae;
                dbsk.s(glgVar);
                int a2 = glgVar.a();
                if (bvox.a(this)) {
                    a2 = -a2;
                }
                f = glgVar.d().getTranslationX() + a2;
            } else {
                f = 0.0f;
            }
        } else {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.tablet_landscape_side_sheet_width);
            if (bvox.a(this)) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            f = dimensionPixelOffset;
        }
        this.aX.b.setTranslationX(f);
        this.aV.b.setTranslationX(f);
        View view = this.L.b;
        if (!(view instanceof ViewStub)) {
            view.setTranslationX(f);
        }
    }

    public final void x() {
        float f;
        if (aD()) {
            glg glgVar = this.ae;
            dbsk.s(glgVar);
            int a2 = glgVar.a();
            float translationX = glgVar.d().getTranslationX();
            f = bvox.a(this) ? (-(a2 - translationX)) / 2.0f : (a2 + translationX) / 2.0f;
        } else {
            f = 0.0f;
        }
        this.aS.b.setTranslationX(f);
    }

    public final egr y(egr egrVar) {
        return ((!T() || S()) && egrVar != null) ? egrVar : egr.a;
    }

    public final void z(acyu acyuVar, egu eguVar) {
        this.ab = acyuVar;
        acyuVar.l(this.ac);
        this.aa.b.addView(acyuVar.o());
        acyuVar.o().setTranslationY(0.0f);
        ao(eguVar);
    }

    public final void ao(egu eguVar) {
        View view = eguVar.P;
        acyu acyuVar = this.ab;
        View o = acyuVar == null ? null : acyuVar.o();
        if (view == null || o == null || Build.VERSION.SDK_INT >= 29) {
            this.aD = null;
        } else {
            this.aD = new gik(o, dcdc.f(view), ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
    }

    public final void ai(int i, boolean z) {
        View view;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            view = this.C.b;
        } else if (i2 == 3) {
            view = this.Q.b;
        } else if (z) {
            view = this.Q.b;
        } else {
            view = this.P.b;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild(this.J.b) == indexOfChild + 1 && indexOfChild(this.aQ.b) == indexOfChild + 2) {
            return;
        }
        removeView(this.J.b);
        removeView(this.aQ.b);
        addView(this.J.b, indexOfChild(view) + 1);
        addView(this.aQ.b, indexOfChild(view) + 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
        if ((r11 + r14.getWidth()) > r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (r11 < r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.layout.MainLayout.Z():void");
    }
}
