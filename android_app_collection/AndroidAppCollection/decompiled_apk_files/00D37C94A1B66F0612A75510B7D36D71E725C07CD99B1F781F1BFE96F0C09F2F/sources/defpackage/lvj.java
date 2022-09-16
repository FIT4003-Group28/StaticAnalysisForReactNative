package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: lvj  reason: default package */
/* loaded from: classes3.dex */
public final class lvj extends lud implements ValueAnimator.AnimatorUpdateListener {
    public final AppTabsBar c;
    public final ConstraintLayout d;
    public final luf e;
    public final alip f;
    public final lvu g;
    public final kwa h;
    public final aadd i;
    public final lud j;
    public final aacz k;
    private final ValueAnimator l;
    private final AnimatorListenerAdapter m;
    private final AnimatorListenerAdapter n;
    private final MainScrollingViewBehavior o;
    private final gbq p;

    public lvj(Context context, lvu lvuVar, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, axnm axnmVar, MainCollapsingToolbarLayout mainCollapsingToolbarLayout, MainScrollingViewBehavior mainScrollingViewBehavior, azqb azqbVar, luf lufVar, aacz aaczVar, kwa kwaVar, aadd aaddVar, gbq gbqVar, lud ludVar) {
        super(context, axnmVar);
        AppBarLayout.Behavior behavior;
        this.g = lvuVar;
        this.c = appTabsBar;
        this.f = mainCollapsingToolbarLayout;
        this.d = constraintLayout;
        this.o = mainScrollingViewBehavior;
        this.e = lufVar;
        yzh yzhVar = (yzh) azqbVar.get();
        if (appTabsBar.f != yzhVar) {
            appTabsBar.f = yzhVar;
            appTabsBar.invalidate();
        }
        appTabsBar.d(appTabsBar.a, appTabsBar.b);
        this.h = kwaVar;
        this.k = aaczVar;
        this.i = aaddVar;
        this.p = gbqVar;
        this.j = ludVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        if (Build.VERSION.SDK_INT >= 22) {
            ofFloat.setCurrentFraction(1.0f);
        } else {
            ofFloat.setCurrentPlayTime(250L);
        }
        ofFloat.addUpdateListener(this);
        this.m = new lvg(this);
        this.n = new lvh(this);
        ajf ajfVar = (ajf) ((lvo) axnmVar).a.getLayoutParams();
        ajc ajcVar = ajfVar.a;
        if (ajcVar instanceof AppBarLayout.Behavior) {
            behavior = (AppBarLayout.Behavior) ajcVar;
        } else {
            behavior = new AppBarLayout.Behavior();
            ajfVar.b(behavior);
        }
        ((AppBarLayout.BaseBehavior) behavior).b = new alif(this);
    }

    private final int n(ActionBarColor actionBarColor) {
        return actionBarColor.la(this.a);
    }

    private final boolean o() {
        gbd e = this.p.e();
        return !(e instanceof gcm) || !((gcm) e).f();
    }

    private final boolean p() {
        return this.c.j() > 1;
    }

    @Override // defpackage.lud
    protected final int a() {
        return this.g.c();
    }

    @Override // defpackage.lud
    protected final ViewGroup c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final void e() {
        if (((ViewGroup) this.d.getParent()) != d()) {
            super.e();
            ((alii) this.d.getLayoutParams()).a = 0;
            this.l.cancel();
        }
    }

    @Override // defpackage.lud
    protected final void f() {
        this.l.addListener(this.n);
        this.l.removeListener(this.m);
        this.l.reverse();
    }

    @Override // defpackage.lud
    public final void h(fsx fsxVar) {
        ActionBarColor actionBarColor = fsxVar.m;
        ActionBarColor actionBarColor2 = fsxVar.o;
        ActionBarColor actionBarColor3 = fsxVar.p;
        AppTabsBar appTabsBar = this.c;
        appTabsBar.d.setColor(n(actionBarColor));
        appTabsBar.invalidate(((DefaultTabsBar) appTabsBar).c);
        this.c.d(n(actionBarColor), n(actionBarColor2));
        AppTabsBar appTabsBar2 = this.c;
        appTabsBar2.e = n(actionBarColor3);
        appTabsBar2.invalidate();
        int n = n(fsxVar.j) | (-16777216);
        if (this.g.t()) {
            this.d.setBackgroundColor(n);
        } else {
            this.d.setBackground(null);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final void i() {
        this.l.addListener(this.m);
        this.l.removeListener(this.n);
        this.l.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final boolean j() {
        if (o()) {
            if (p()) {
                return true;
            }
            if (!zdg.e(this.a) && this.e.h() == 1 && !zew.y(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final void k(boolean z) {
        this.o.a = z;
    }

    public final void l() {
        d().m(false, false);
        this.g.s();
        k(true);
        this.f.requestLayout();
    }

    public final void m() {
        ConstraintLayout constraintLayout = this.d;
        boolean z = false;
        if (o() && p()) {
            z = true;
        }
        zag.o(constraintLayout, z);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d.getLayoutParams() == null) {
            return;
        }
        float animatedFraction = this.l.getAnimatedFraction();
        zgd.t(this.d, zgd.h((int) (this.g.c() * animatedFraction)), ViewGroup.LayoutParams.class);
        this.d.setAlpha(animatedFraction);
        if (animatedFraction == 0.0f) {
            zdg.d(d());
        } else if (animatedFraction != 1.0f) {
        } else {
            zdg.d(this.d);
        }
    }
}
