package com.google.android.material.bottomappbar;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.c.a0.h;
import c.e.a.c.l.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int Q;
    private final c.e.a.c.a0.g R;
    private Animator S;
    private Animator T;
    private int U;
    private int V;
    private boolean W;
    private int a0;
    private ArrayList<f> b0;
    private boolean c0;
    private Behavior d0;
    private int e0;
    AnimatorListenerAdapter f0;
    k<FloatingActionButton> g0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        private final Rect f7907e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<BottomAppBar> f7908f;

        /* renamed from: g  reason: collision with root package name */
        private int f7909g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f7910h;

        /* loaded from: classes.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f7908f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.b(Behavior.this.f7907e);
                int height = Behavior.this.f7907e.height();
                bottomAppBar.b(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f7909g != 0) {
                    return;
                }
                int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(c.e.a.c.d.mtrl_bottomappbar_fab_bottom_margin);
                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
            }
        }

        public Behavior() {
            this.f7910h = new a();
            this.f7907e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7910h = new a();
            this.f7907e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f7908f = new WeakReference<>(bottomAppBar);
            View p = bottomAppBar.p();
            if (p != null && !v.I(p)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) p.getLayoutParams();
                fVar.f1464d = 49;
                this.f7909g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (p instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) p;
                    floatingActionButton.addOnLayoutChangeListener(this.f7910h);
                    bottomAppBar.a(floatingActionButton);
                }
                bottomAppBar.s();
            }
            coordinatorLayout.c(bottomAppBar, i);
            return super.a(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7913a;

        /* loaded from: classes.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m();
            }
        }

        b(int i) {
            this.f7913a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.c(this.f7913a));
            floatingActionButton.b(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m();
            BottomAppBar.this.T = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f7918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f7919c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7920d;

        d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f7918b = actionMenuView;
            this.f7919c = i;
            this.f7920d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7917a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f7917a) {
                BottomAppBar.this.b(this.f7918b, this.f7919c, this.f7920d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f0.onAnimationStart(animator);
            FloatingActionButton o = BottomAppBar.this.o();
            if (o != null) {
                o.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f7923d;

        /* renamed from: e  reason: collision with root package name */
        boolean f7924e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public g mo266createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: createFromParcel */
            public g mo267createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public g[] mo268newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7923d = parcel.readInt();
            this.f7924e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7923d);
            parcel.writeInt(this.f7924e ? 1 : 0);
        }
    }

    private void a(int i, boolean z) {
        if (!v.I(this)) {
            return;
        }
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!q()) {
            i = 0;
            z = false;
        }
        a(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.T = animatorSet;
        this.T.addListener(new c());
        this.T.start();
    }

    private void a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - a(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() >= 1.0f) {
                return;
            }
            list.add(ofFloat);
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
        ofFloat2.addListener(new d(actionMenuView, i, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playSequentially(ofFloat2, ofFloat);
        list.add(animatorSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.a(this.f0);
        floatingActionButton.b(new e());
        floatingActionButton.a(this.g0);
    }

    private void b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o(), "translationX", c(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX(a(actionMenuView, i, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float c(int i) {
        int i2 = 1;
        boolean z = v.p(this) == 1;
        if (i == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) - this.Q;
            if (z) {
                i2 = -1;
            }
            return measuredWidth * i2;
        }
        return 0.0f;
    }

    private void d(int i) {
        if (this.U == i || !v.I(this)) {
            return;
        }
        Animator animator = this.S;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.V == 1) {
            b(i, arrayList);
        } else {
            a(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.S = animatorSet;
        this.S.addListener(new a());
        this.S.start();
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return c(this.U);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().a();
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.R.k().h();
    }

    private void l() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ArrayList<f> arrayList;
        int i = this.a0 - 1;
        this.a0 = i;
        if (i != 0 || (arrayList = this.b0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ArrayList<f> arrayList;
        int i = this.a0;
        this.a0 = i + 1;
        if (i != 0 || (arrayList = this.b0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton o() {
        View p = p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View p() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.c(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.p():android.view.View");
    }

    private boolean q() {
        FloatingActionButton o = o();
        return o != null && o.c();
    }

    private void r() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!q()) {
                b(actionMenuView, 0, false);
            } else {
                b(actionMenuView, this.U, this.c0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        getTopEdgeTreatment().e(getFabTranslationX());
        View p = p();
        this.R.b((!this.c0 || !q()) ? 0.0f : 1.0f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    protected int a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = v.p(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f893a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    protected void a(int i, List<Animator> list) {
        FloatingActionButton o = o();
        if (o == null || o.b()) {
            return;
        }
        n();
        o.a(new b(i));
    }

    boolean b(int i) {
        float f2 = i;
        if (f2 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().d(f2);
            this.R.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.R.l();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* renamed from: getBehavior  reason: collision with other method in class */
    public Behavior mo265getBehavior() {
        if (this.d0 == null) {
            this.d0 = new Behavior();
        }
        return this.d0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().a();
    }

    public int getFabAlignmentMode() {
        return this.U;
    }

    public int getFabAnimationMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().c();
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this, this.R);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            l();
            s();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.j());
        this.U = gVar.f7923d;
        this.c0 = gVar.f7924e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f7923d = this.U;
        gVar.f7924e = this.c0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a(this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().a(f2);
            this.R.invalidateSelf();
            s();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.R.a(f2);
        mo265getBehavior().a((Behavior) this, this.R.j() - this.R.i());
    }

    public void setFabAlignmentMode(int i) {
        d(i);
        a(i, this.c0);
        this.U = i;
    }

    public void setFabAnimationMode(int i) {
        this.V = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().b(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().c(f2);
            this.R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
