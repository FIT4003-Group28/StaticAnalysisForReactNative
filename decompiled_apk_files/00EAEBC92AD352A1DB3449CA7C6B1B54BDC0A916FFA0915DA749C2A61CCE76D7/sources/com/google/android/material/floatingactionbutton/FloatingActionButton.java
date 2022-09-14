package com.google.android.material.floatingactionbutton;

import a.g.m.u;
import a.g.m.v;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.g;
import androidx.core.widget.l;
import c.e.a.c.a0.n;
import c.e.a.c.k;
import c.e.a.c.l.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.i;
import java.util.List;
@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends i implements u, l, c.e.a.c.u.a, n {

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f8073c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f8074d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f8075e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f8076f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f8077g;

    /* renamed from: h  reason: collision with root package name */
    private int f8078h;
    private int i;
    private int j;
    private int k;
    boolean l;
    final Rect m;
    private final Rect n;
    private final androidx.appcompat.widget.n o;
    private final c.e.a.c.u.c p;
    private com.google.android.material.floatingactionbutton.b q;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f8079a;

        /* renamed from: b  reason: collision with root package name */
        private b f8080b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8081c;

        public BaseBehavior() {
            this.f8081c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.FloatingActionButton_Behavior_Layout);
            this.f8081c = obtainStyledAttributes.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                v.e(floatingActionButton, i);
            }
            if (i2 == 0) {
                return;
            }
            v.d(floatingActionButton, i2);
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.f8081c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8079a == null) {
                this.f8079a = new Rect();
            }
            Rect rect = this.f8079a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a(this.f8080b, false);
                return true;
            }
            floatingActionButton.b(this.f8080b, false);
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.a(this.f8080b, false);
                return true;
            }
            floatingActionButton.b(this.f8080b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void a(CoordinatorLayout.f fVar) {
            if (fVar.f1468h == 0) {
                fVar.f1468h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b(floatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c(floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f8082a;

        a(b bVar) {
            this.f8082a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void a() {
            this.f8082a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void b() {
            this.f8082a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements c.e.a.c.z.b {
        c() {
        }

        @Override // c.e.a.c.z.b
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.j, i2 + FloatingActionButton.this.j, i3 + FloatingActionButton.this.j, i4 + FloatingActionButton.this.j);
        }

        @Override // c.e.a.c.z.b
        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // c.e.a.c.z.b
        public boolean a() {
            return FloatingActionButton.this.l;
        }
    }

    /* loaded from: classes.dex */
    class d<T extends FloatingActionButton> implements b.i {

        /* renamed from: a  reason: collision with root package name */
        private final c.e.a.c.l.k<T> f8085a;

        d(c.e.a.c.l.k<T> kVar) {
            this.f8085a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void a() {
            this.f8085a.a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void b() {
            this.f8085a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f8085a.equals(this.f8085a);
        }

        public int hashCode() {
            return this.f8085a.hashCode();
        }
    }

    private int a(int i) {
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? c.e.a.c.d.design_fab_size_normal : c.e.a.c.d.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? a(1) : a(0);
    }

    private static int a(int i, int i2) {
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

    private b.j c(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private void c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private com.google.android.material.floatingactionbutton.b d() {
        return Build.VERSION.SDK_INT >= 21 ? new com.google.android.material.floatingactionbutton.c(this, new c()) : new com.google.android.material.floatingactionbutton.b(this, new c());
    }

    private void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f8075e;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f8076f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(j.a(colorForState, mode));
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.q == null) {
            this.q = d();
        }
        return this.q;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void a(c.e.a.c.l.k<? extends FloatingActionButton> kVar) {
        getImpl().a(new d(kVar));
    }

    public void a(b bVar) {
        a(bVar, true);
    }

    void a(b bVar, boolean z) {
        getImpl().a(c(bVar), z);
    }

    @Override // c.e.a.c.u.b
    public boolean a() {
        this.p.b();
        throw null;
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (v.I(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            c(rect);
            return true;
        }
        return false;
    }

    public void b(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public void b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c(rect);
    }

    public void b(b bVar) {
        b(bVar, true);
    }

    void b(b bVar, boolean z) {
        getImpl().b(c(bVar), z);
    }

    public boolean b() {
        return getImpl().i();
    }

    public boolean c() {
        return getImpl().j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f8073c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f8074d;
    }

    public float getCompatElevation() {
        return getImpl().b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f();
    }

    public Drawable getContentBackground() {
        return getImpl().a();
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        this.p.a();
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f8077g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f8077g;
    }

    public c.e.a.c.a0.k getShapeAppearanceModel() {
        c.e.a.c.a0.k g2 = getImpl().g();
        g.a(g2);
        return g2;
    }

    public h getShowMotionSpec() {
        return getImpl().h();
    }

    public int getSize() {
        return this.f8078h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return a(this.f8078h);
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        return this.f8075e;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f8076f;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().k();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().l();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().n();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().w();
        int min = Math.min(a(sizeDimension, i), a(sizeDimension, i2));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.e.a.c.b0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.e.a.c.b0.a aVar = (c.e.a.c.b0.a) parcelable;
        super.onRestoreInstanceState(aVar.j());
        c.e.a.c.u.c cVar = this.p;
        Bundle bundle = aVar.f4732d.get("expandableWidgetHelper");
        g.a(bundle);
        cVar.a(bundle);
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        a.e.g<String, Bundle> gVar = new c.e.a.c.b0.a(onSaveInstanceState).f4732d;
        this.p.c();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.n) || this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f8073c != colorStateList) {
            this.f8073c = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f8074d != mode) {
            this.f8074d = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().a(f2);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().b(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().d(f2);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i == this.i) {
                return;
            }
            this.i = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().e(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().c()) {
            getImpl().a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.p.a(i);
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(h.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().v();
            if (this.f8075e == null) {
                return;
            }
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.a(i);
        e();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f8077g != colorStateList) {
            this.f8077g = colorStateList;
            getImpl().b(this.f8077g);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().p();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().p();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().b(z);
    }

    @Override // c.e.a.c.a0.n
    public void setShapeAppearanceModel(c.e.a.c.a0.k kVar) {
        getImpl().a(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(h.a(getContext(), i));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.f8078h) {
            this.f8078h = i;
            requestLayout();
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f8075e != colorStateList) {
            this.f8075e = colorStateList;
            e();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f8076f != mode) {
            this.f8076f = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().q();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().q();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().q();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().m();
        }
    }

    @Override // com.google.android.material.internal.i, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
