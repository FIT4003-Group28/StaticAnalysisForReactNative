package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajhz  reason: default package */
/* loaded from: classes.dex */
public final class ajhz extends ajir {
    public axnm ae;
    public srr af;
    public int ai;
    public dci aj;
    public String ak;
    FrameLayout al;
    RelativeLayout am;
    public Dialog an;
    ViewGroup ao;
    private List ar;
    private dci as;
    private ajhy at;
    private acti au;
    private Object av;
    private final aypf aq = new aypf();
    boolean ag = false;
    public boolean ah = true;
    public int ap = 1;

    public static void aJ(ajhz ajhzVar, tcs tcsVar, acti actiVar) {
        ajjf ajjfVar;
        ajhzVar.au = actiVar;
        if (tcsVar != null) {
            Object obj = tcsVar.d;
            if (!(obj instanceof ajjf) || (ajjfVar = (ajjf) obj) == null) {
                return;
            }
            ajhzVar.av = ajjfVar.a;
        }
    }

    public static final int aK(WindowInsets windowInsets) {
        int i = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
        int i2 = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    private static RelativeLayout aN(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return relativeLayout;
    }

    private final dci aO(awnn awnnVar, Context context) {
        dci dciVar = new dci(context);
        cyv cyvVar = dciVar.t;
        swq swqVar = (swq) this.ae.get();
        tcz a = tda.a();
        a.a = dciVar;
        a.f(false);
        a.l = amuk.r(ajjh.c(this.av));
        tda a2 = a.a();
        byte[] byteArray = awnnVar.toByteArray();
        acti actiVar = this.au;
        czf c = ComponentTree.c(dciVar.t, swqVar.a(cyvVar, a2, byteArray, actiVar != null ? ajjk.v(actiVar) : null, this.aq));
        c.d = false;
        dciVar.G(c.a());
        return dciVar;
    }

    private static void aP(dci dciVar) {
        if (dciVar != null) {
            dciVar.E();
            dciVar.K();
            dciVar.G(null);
        }
    }

    public final RelativeLayout aE(Context context) {
        RelativeLayout aN = aN(context);
        ajhy ajhyVar = new ajhy(context);
        ajhyVar.az();
        ajhyVar.ag(new LinearLayoutManager());
        ajhyVar.ad(new ajib((swq) this.ae.get(), this.ar, this.au, this.av));
        ajhyVar.setVerticalFadingEdgeEnabled(true);
        this.at = ajhyVar;
        aN.addView(ajhyVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        dci dciVar = this.as;
        if (dciVar == null || this.at == null) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(3, dciVar.getId());
            ajhy ajhyVar2 = this.at;
            if (ajhyVar2 != null) {
                ajhyVar2.setPadding(0, 48, 0, 0);
            }
            ajhy ajhyVar3 = this.at;
            if (ajhyVar3 != null) {
                ajhyVar3.setClipToPadding(false);
            }
            ajhy ajhyVar4 = this.at;
            if (ajhyVar4 != null) {
                ajhyVar4.setFadingEdgeLength(48);
            }
        }
        ajhy ajhyVar5 = this.at;
        if (ajhyVar5 != null) {
            ajhyVar5.setLayoutParams(layoutParams);
        }
        dci dciVar2 = this.as;
        if (dciVar2 != null) {
            aN.addView(dciVar2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(10);
            layoutParams2.setMargins(0, 0, 0, -48);
            dci dciVar3 = this.as;
            if (dciVar3 != null) {
                dciVar3.setLayoutParams(layoutParams2);
            }
        }
        aN.setBackgroundColor(zhn.d(context, R.attr.ytBrandBackgroundSolid));
        return aN;
    }

    public final void aF(Dialog dialog, Activity activity) {
        int i;
        if (dialog == null) {
            return;
        }
        BottomSheetBehavior a = ((aljo) dialog).a();
        AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility");
        if (!this.ah || accessibilityManager.isEnabled()) {
            a.E(3);
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        dci dciVar = this.as;
        ajhy ajhyVar = this.at;
        if (ajhyVar == null) {
            i = 0;
        } else if (dciVar == null) {
            i = ajhyVar.getMeasuredHeight();
        } else {
            i = dciVar.getMeasuredHeight() + ajhyVar.getMeasuredHeight();
        }
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i2 = (int) (d * 0.6d);
        if (i > i2) {
            a.D(i2);
        } else {
            a.D(i);
        }
    }

    public final void aG() {
        RelativeLayout relativeLayout;
        ViewGroup viewGroup = this.ao;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        FrameLayout frameLayout = this.al;
        if (frameLayout != null && (relativeLayout = this.am) != null) {
            frameLayout.removeView(relativeLayout);
        }
        this.at = null;
        this.as = null;
        this.aj = null;
        this.al = null;
        this.am = null;
    }

    public final void aH(awsy awsyVar, Activity activity) {
        if ((awsyVar.c & 2) != 0) {
            awnn awnnVar = awsyVar.e;
            if (awnnVar == null) {
                awnnVar = awnn.a;
            }
            this.aj = aO(awnnVar, activity);
        }
        if ((awsyVar.c & 1) != 0) {
            awnn awnnVar2 = awsyVar.d;
            if (awnnVar2 == null) {
                awnnVar2 = awnn.a;
            }
            dci aO = aO(awnnVar2, activity);
            this.as = aO;
            aO.setId(View.generateViewId());
        }
        this.ar = awsyVar.f;
    }

    public final void aI(final Activity activity) {
        FrameLayout frameLayout;
        final Dialog dialog = this.an;
        if (this.aj != null && dialog != null) {
            FrameLayout frameLayout2 = (FrameLayout) dialog.findViewById(R.id.container);
            frameLayout2.setImportantForAccessibility(2);
            frameLayout2.setFocusable(false);
            dci dciVar = this.aj;
            if (dciVar != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                RelativeLayout aN = aN(activity);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                dci dciVar2 = this.aj;
                if (dciVar2 != null) {
                    dciVar2.setLayoutParams(layoutParams2);
                    aN.addView(this.aj);
                }
                aN.setLayoutParams(layoutParams);
                aN.setBackgroundColor(zhn.d(activity, R.attr.ytBrandBackgroundSolid));
                frameLayout2.addView(aN);
                dciVar.post(new Runnable() { // from class: ajhv
                    @Override // java.lang.Runnable
                    public final void run() {
                        dci dciVar3;
                        ajhz ajhzVar = ajhz.this;
                        Dialog dialog2 = dialog;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) dialog2.findViewById(R.id.coordinator);
                        FrameLayout frameLayout3 = (FrameLayout) dialog2.findViewById(R.id.container);
                        if (coordinatorLayout == null || (dciVar3 = ajhzVar.aj) == null) {
                            return;
                        }
                        zgd.t(coordinatorLayout, zgd.e(dciVar3.getMeasuredHeight()), ViewGroup.MarginLayoutParams.class);
                        frameLayout3.requestLayout();
                    }
                });
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ajhu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ajhz.this.dismiss();
                }
            });
        }
        ajhy ajhyVar = this.at;
        if (ajhyVar != null && dialog != null) {
            ajhyVar.post(new Runnable() { // from class: ajhw
                @Override // java.lang.Runnable
                public final void run() {
                    ajhz.this.aF(dialog, activity);
                }
            });
        }
        if (this.aj != null || this.as != null || !this.ar.isEmpty() || dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.container)) == null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        ProgressBar progressBar = new ProgressBar(activity);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        relativeLayout.addView(progressBar, layoutParams3);
        frameLayout.addView(relativeLayout);
        this.am = relativeLayout;
        this.al = frameLayout;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        RelativeLayout relativeLayout;
        srr srrVar = this.af;
        if ((srrVar instanceof ajhr) && this.au != null) {
            ajhr ajhrVar = (ajhr) srrVar;
            acti actiVar = ajhrVar.c;
            if (actiVar != null) {
                actiVar.t();
            }
            ajhrVar.c = null;
        }
        super.mR();
        aP(this.as);
        aP(this.aj);
        this.aq.c();
        FrameLayout frameLayout = this.al;
        if (frameLayout != null && (relativeLayout = this.am) != null) {
            frameLayout.removeView(relativeLayout);
        }
        this.al = null;
        this.am = null;
        aG();
        this.an = null;
        this.ao = null;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dt mJ = mJ();
        mJ.getClass();
        Bundle bundle2 = this.m;
        if (bundle2 == null || (!bundle2.containsKey("COMMAND_BOTTOM_SHEET_FRAGMENT_KEY") && !bundle2.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY"))) {
            throw new IllegalStateException("No valid arguments provided.");
        }
        if (bundle2.containsKey("COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY")) {
            try {
                aH((awsy) aphq.i(bundle2, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", awsy.a, aoos.b()), mJ);
            } catch (aopx e) {
                throw new IllegalStateException("Error decoding UpdateActionSheetCommand", e);
            }
        } else if (bundle2.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.ar = Collections.singletonList((awnn) aphq.i(bundle2, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", awnn.a, aoos.b()));
            } catch (aopx e2) {
                throw new IllegalStateException("Error decoding Element", e2);
            }
        } else {
            try {
                awsq awsqVar = (awsq) aphq.i(bundle2, "COMMAND_BOTTOM_SHEET_FRAGMENT_KEY", awsq.a, aoos.b());
                int i = awsqVar.c;
                if ((i & 4) != 0) {
                    this.ak = awsqVar.g;
                }
                if ((i & 2) != 0) {
                    awnn awnnVar = awsqVar.e;
                    if (awnnVar == null) {
                        awnnVar = awnn.a;
                    }
                    this.aj = aO(awnnVar, mJ);
                }
                if ((awsqVar.c & 1) != 0) {
                    awnn awnnVar2 = awsqVar.d;
                    if (awnnVar2 == null) {
                        awnnVar2 = awnn.a;
                    }
                    dci aO = aO(awnnVar2, mJ);
                    this.as = aO;
                    aO.setId(View.generateViewId());
                }
                this.ar = awsqVar.f;
            } catch (aopx e3) {
                throw new IllegalStateException("Error decoding ShowActionSheetCommand", e3);
            }
        }
        srr srrVar = this.af;
        if ((srrVar instanceof ajhr) && bundle != null) {
            ajhr ajhrVar = (ajhr) srrVar;
            WeakReference weakReference = ajhrVar.b;
            if (weakReference != null) {
                weakReference.clear();
            }
            ajhrVar.b = new WeakReference(this);
        }
        FrameLayout frameLayout = new FrameLayout(mJ);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.addView(aE(mJ));
        this.ao = frameLayout;
        return frameLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r5.orientation == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r5.orientation == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
        dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
        r5 = mJ();
        r5.getClass();
        aF(r4.d, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 != 3) goto L12;
     */
    @Override // defpackage.dp, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            int r0 = r4.ap
            int r1 = r0 + (-1)
            if (r0 == 0) goto L31
            r0 = 0
            r2 = 1
            if (r1 == r2) goto L19
            r3 = 2
            if (r1 == r3) goto L14
            r5 = 3
            if (r1 == r5) goto L20
            goto L24
        L14:
            int r5 = r5.orientation
            if (r5 != r3) goto L1e
            goto L1d
        L19:
            int r5 = r5.orientation
            if (r5 != r2) goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L24
        L20:
            r4.dismiss()
            return
        L24:
            dt r5 = r4.mJ()
            r5.getClass()
            android.app.Dialog r0 = r4.d
            r4.aF(r0, r5)
            return
        L31:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhz.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // defpackage.aljp, defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        View decorView;
        final View findViewById;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final dt mJ = mJ();
        mJ.getClass();
        aljo aljoVar = new aljo(mJ, 2132083897);
        this.an = aljoVar;
        aljoVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ajhs
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ajhz ajhzVar = ajhz.this;
                Activity activity = mJ;
                if (activity.isDestroyed() || activity.isFinishing()) {
                    return;
                }
                ajhzVar.aI(activity);
            }
        });
        Window window = aljoVar.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            if (Build.VERSION.SDK_INT >= 30 && (decorView = window.getDecorView()) != null && (findViewById = decorView.findViewById(16908290)) != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()) != null) {
                decorView.setWindowInsetsAnimationCallback(new ajhx(this, marginLayoutParams.bottomMargin, findViewById, decorView, marginLayoutParams));
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ajht
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ajhz ajhzVar = ajhz.this;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        View view2 = findViewById;
                        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                        if (ajhzVar.ag) {
                            return view.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), insets.bottom));
                        }
                        marginLayoutParams2.bottomMargin = 0;
                        view2.setLayoutParams(marginLayoutParams2);
                        return view.onApplyWindowInsets(windowInsets);
                    }
                });
            }
        }
        int k = zew.k(mJ);
        if (this.ai > 0 && k >= 600) {
            aljoVar.a().d = zew.i(mJ.getResources().getDisplayMetrics(), Math.min(this.ai, k));
        }
        return aljoVar;
    }
}
