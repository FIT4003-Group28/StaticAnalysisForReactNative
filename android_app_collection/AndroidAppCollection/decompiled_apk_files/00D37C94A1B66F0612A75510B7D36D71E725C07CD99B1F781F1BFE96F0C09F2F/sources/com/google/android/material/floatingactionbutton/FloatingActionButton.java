package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class FloatingActionButton extends allm implements aljx, alnn, ajb {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final uf m;
    private final aljy n;
    private alkr o;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class BaseBehavior extends ajc {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alkv.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean t(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ajf) {
                return ((ajf) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean u(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((ajf) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!u(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            alkz.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.e()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean w(View view, FloatingActionButton floatingActionButton) {
            if (!u(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ajf) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.ajc
        public final void a(ajf ajfVar) {
            if (ajfVar.h == 0) {
                ajfVar.h = 80;
            }
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!t(view2)) {
                return false;
            } else {
                w(view2, floatingActionButton);
                return false;
            }
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List h = coordinatorLayout.h(floatingActionButton);
            int size = h.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) h.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (t(view2) && w(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.l(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            ajf ajfVar = (ajf) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ajfVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= ajfVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ajfVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ajfVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                lj.E(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            lj.D(floatingActionButton, i2);
            return true;
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    private static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return i;
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException();
            }
            return size;
        }
        return Math.min(i, size);
    }

    private final alkr j() {
        if (this.o == null) {
            this.o = new alkt(this, new alkg(this));
        }
        return this.o;
    }

    @Override // defpackage.ajb
    public final ajc a() {
        return new Behavior();
    }

    @Override // defpackage.alnn
    public final void b(alnc alncVar) {
        j().h(alncVar);
    }

    public final int c() {
        return h(this.i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        alkr j = j();
        getDrawableState();
        if (Build.VERSION.SDK_INT == 21) {
            alkt alktVar = (alkt) j;
            if (!alktVar.x.isEnabled()) {
                alktVar.x.setElevation(0.0f);
                alktVar.x.setTranslationZ(0.0f);
                return;
            }
            alktVar.x.setElevation(alktVar.n);
            if (alktVar.x.isPressed()) {
                alktVar.x.setTranslationZ(alktVar.p);
            } else if (alktVar.x.isFocused() || alktVar.x.isHovered()) {
                alktVar.x.setTranslationZ(alktVar.o);
            } else {
                alktVar.x.setTranslationZ(0.0f);
            }
        }
    }

    final void e() {
        alkr j = j();
        if (j.x.getVisibility() == 0) {
            if (j.w == 1) {
                return;
            }
        } else if (j.w != 2) {
            return;
        }
        Animator animator = j.r;
        if (animator != null) {
            animator.cancel();
        }
        if (j.m()) {
            alhy alhyVar = j.t;
            AnimatorSet b = alhyVar != null ? j.b(alhyVar, 0.0f, 0.0f, 0.0f) : j.c(0.0f, 0.4f, 0.4f);
            b.addListener(new alkh(j));
            b.start();
            return;
        }
        j.x.g(4, false);
    }

    final void f() {
        alkr j = j();
        if (j.x.getVisibility() != 0) {
            if (j.w == 2) {
                return;
            }
        } else if (j.w != 1) {
            return;
        }
        Animator animator = j.r;
        if (animator != null) {
            animator.cancel();
        }
        alhy alhyVar = j.s;
        if (!j.m()) {
            j.x.g(0, false);
            j.x.setAlpha(1.0f);
            j.x.setScaleY(1.0f);
            j.x.setScaleX(1.0f);
            j.g(1.0f);
            return;
        }
        if (j.x.getVisibility() != 0) {
            float f = 0.0f;
            j.x.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = j.x;
            if (alhyVar == null) {
                f = 0.4f;
            }
            floatingActionButton.setScaleY(f);
            j.x.setScaleX(f);
            j.g(f);
        }
        alhy alhyVar2 = j.s;
        AnimatorSet b = alhyVar2 != null ? j.b(alhyVar2, 1.0f, 1.0f, 1.0f) : j.c(1.0f, 1.0f, 1.0f);
        b.addListener(new alki(j));
        b.start();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alkr j = j();
        almx almxVar = j.i;
        if (almxVar != null) {
            almu.d(j.x, almxVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        alkr j = j();
        j.x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = j.y;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int c = c();
        this.a = (c - this.k) / 2;
        j().j();
        int min = Math.min(i(c, i), i(c, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        aljy aljyVar = this.n;
        Bundle bundle = (Bundle) extendableSavedState.a.get("expandableWidgetHelper");
        hz.g(bundle);
        aljyVar.b = bundle.getBoolean("expanded", false);
        aljyVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (!aljyVar.b) {
            return;
        }
        ViewParent parent = aljyVar.a.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        ((CoordinatorLayout) parent).i(aljyVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        agd agdVar = extendableSavedState.a;
        aljy aljyVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", aljyVar.b);
        bundle.putInt("expandedComponentIdHint", aljyVar.c);
        agdVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            if (lj.al(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            alkr j = j();
            almx almxVar = j.i;
            if (almxVar != null) {
                almxVar.setTintList(colorStateList);
            }
            alka alkaVar = j.k;
            if (alkaVar == null) {
                return;
            }
            alkaVar.b(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            almx almxVar = j().i;
            if (almxVar == null) {
                return;
            }
            almxVar.setTintMode(mode);
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        j().k(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j().i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.c(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        iy.m(drawable);
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        j();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        j();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(alqt.a(context, attributeSet, i, 2132084201), attributeSet, i);
        boolean z;
        alhy alhyVar;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = alli.a(context2, attributeSet, alkv.b, i, 2132084201, new int[0]);
        this.e = almu.f(context2, a, 1);
        this.f = amyv.u(a.getInt(2, -1), null);
        this.g = almu.f(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.k = a.getDimensionPixelSize(10, 0);
        alhy a2 = alhy.a(context2, a, 15);
        alhy a3 = alhy.a(context2, a, 8);
        alnc a4 = alnc.c(context2, attributeSet, i, 2132084201, alnc.a).a();
        boolean z2 = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        uf ufVar = new uf(this);
        this.m = ufVar;
        ufVar.b(attributeSet, i);
        this.n = new aljy(this);
        j().h(a4);
        alkr j = j();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        alkt alktVar = (alkt) j;
        alnc alncVar = alktVar.h;
        hz.g(alncVar);
        alktVar.i = new alks(alncVar);
        alktVar.i.setTintList(colorStateList);
        if (mode != null) {
            alktVar.i.setTintMode(mode);
        }
        alktVar.i.j(alktVar.x.getContext());
        if (i2 > 0) {
            Context context3 = alktVar.x.getContext();
            alnc alncVar2 = alktVar.h;
            hz.g(alncVar2);
            alka alkaVar = new alka(alncVar2);
            int d = ake.d(context3, R.color.design_fab_stroke_top_outer_color);
            int d2 = ake.d(context3, R.color.design_fab_stroke_top_inner_color);
            z = z2;
            int d3 = ake.d(context3, R.color.design_fab_stroke_end_inner_color);
            alhyVar = a3;
            int d4 = ake.d(context3, R.color.design_fab_stroke_end_outer_color);
            alkaVar.c = d;
            alkaVar.d = d2;
            alkaVar.e = d3;
            alkaVar.f = d4;
            float f = i2;
            if (alkaVar.b != f) {
                alkaVar.b = f;
                alkaVar.a.setStrokeWidth(f * 1.3333f);
                alkaVar.g = true;
                alkaVar.invalidateSelf();
            }
            alkaVar.b(colorStateList);
            alktVar.k = alkaVar;
            alka alkaVar2 = alktVar.k;
            hz.g(alkaVar2);
            almx almxVar = alktVar.i;
            hz.g(almxVar);
            drawable2 = new LayerDrawable(new Drawable[]{alkaVar2, almxVar});
            drawable = null;
        } else {
            z = z2;
            alhyVar = a3;
            drawable = null;
            alktVar.k = null;
            drawable2 = alktVar.i;
        }
        alktVar.j = new RippleDrawable(almo.b(colorStateList2), drawable2, drawable);
        alktVar.l = alktVar.j;
        j().q = dimensionPixelSize;
        alkr j2 = j();
        if (j2.n != dimension) {
            j2.n = dimension;
            j2.f(dimension, j2.o, j2.p);
        }
        alkr j3 = j();
        if (j3.o != dimension2) {
            j3.o = dimension2;
            j3.f(j3.n, dimension2, j3.p);
        }
        alkr j4 = j();
        if (j4.p != dimension3) {
            j4.p = dimension3;
            j4.f(j4.n, j4.o, dimension3);
        }
        alkr j5 = j();
        int i3 = this.k;
        if (j5.v != i3) {
            j5.v = i3;
            j5.i();
        }
        j().s = a2;
        j().t = alhyVar;
        j().m = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
