package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.material.stateful.ExtendableSavedState;
/* compiled from: PG */
/* renamed from: czzp */
/* loaded from: classes5.dex */
public final class czzp extends dabe implements czyw, daei, ajh {
    public int a;
    boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private PorterDuff.Mode h;
    private ColorStateList i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private final xm o;
    private final czyx p;
    private daaa q;

    public czzp(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(czzp czzpVar, Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    private final void g() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList == null) {
            ks.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.h;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(xi.f(colorForState, mode));
    }

    private final int h(int i) {
        int i2 = this.l;
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

    private final daaa j() {
        if (this.q == null) {
            this.q = new daac(this, new czzo(this));
        }
        return this.q;
    }

    @Override // defpackage.ajh
    public final aji<czzp> a() {
        return new FloatingActionButton$Behavior();
    }

    public final int b() {
        return h(this.k);
    }

    public final void d() {
        daaa j = j();
        if (j.B.getVisibility() == 0) {
            if (j.u == 1) {
                return;
            }
        } else if (j.u != 2) {
            return;
        }
        Animator animator = j.o;
        if (animator != null) {
            animator.cancel();
        }
        if (j.v()) {
            czur czurVar = j.q;
            if (czurVar == null) {
                if (j.n == null) {
                    j.n = czur.g(j.B.getContext(), R.animator.design_fab_hide_motion_spec);
                }
                czurVar = j.n;
                nb.b(czurVar);
            }
            AnimatorSet o = j.o(czurVar, 0.0f, 0.0f, 0.0f);
            o.addListener(new czzq(j));
            o.start();
            return;
        }
        j.B.f(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        j().m(getDrawableState());
    }

    public final void e() {
        daaa j = j();
        if (j.B.getVisibility() != 0) {
            if (j.u == 2) {
                return;
            }
        } else if (j.u != 1) {
            return;
        }
        Animator animator = j.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!j.v()) {
            j.B.f(0, false);
            j.B.setAlpha(1.0f);
            j.B.setScaleY(1.0f);
            j.B.setScaleX(1.0f);
            j.h(1.0f);
            return;
        }
        if (j.B.getVisibility() != 0) {
            j.B.setAlpha(0.0f);
            j.B.setScaleY(0.0f);
            j.B.setScaleX(0.0f);
            j.h(0.0f);
        }
        czur czurVar = j.p;
        if (czurVar == null) {
            if (j.m == null) {
                j.m = czur.g(j.B.getContext(), R.animator.design_fab_show_motion_spec);
            }
            czurVar = j.m;
            nb.b(czurVar);
        }
        AnimatorSet o = j.o(czurVar, 1.0f, 1.0f, 1.0f);
        o.addListener(new czzr(j));
        o.start();
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
        j().n();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        daaa j = j();
        dadr dadrVar = j.c;
        if (dadrVar != null) {
            dads.f(j.B, dadrVar);
        }
        if (j.t()) {
            ViewTreeObserver viewTreeObserver = j.B.getViewTreeObserver();
            if (j.C == null) {
                j.C = new czzu(j);
            }
            viewTreeObserver.addOnPreDrawListener(j.C);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        daaa j = j();
        ViewTreeObserver viewTreeObserver = j.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = j.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            j.C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.m) / 2;
        j().q();
        int min = Math.min(i(b, i), i(b, i2));
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
        czyx czyxVar = this.p;
        Bundle bundle = extendableSavedState.a.get("expandableWidgetHelper");
        nb.b(bundle);
        czyxVar.b = bundle.getBoolean("expanded", false);
        czyxVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (!czyxVar.b) {
            return;
        }
        ViewParent parent = czyxVar.a.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        ((CoordinatorLayout) parent).k(czyxVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        aim<String, Bundle> aimVar = extendableSavedState.a;
        czyx czyxVar = this.p;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", czyxVar.b);
        bundle.putInt("expandedComponentIdHint", czyxVar.c);
        aimVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.n;
            if (od.ae(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            daaa j = j();
            dadr dadrVar = j.c;
            if (dadrVar != null) {
                dadrVar.setTintList(colorStateList);
            }
            czzc czzcVar = j.e;
            if (czzcVar == null) {
                return;
            }
            czzcVar.a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            dadr dadrVar = j().c;
            if (dadrVar == null) {
                return;
            }
            dadrVar.setTintMode(mode);
        }
    }

    public void setCompatElevation(float f) {
        j().c(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        j().e(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        j().f(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i == this.l) {
                return;
            }
            this.l = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        j().l(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != j().g) {
            j().g = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.p.c = i;
    }

    public void setHideMotionSpec(czur czurVar) {
        j().q = czurVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(czur.g(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j().g();
            if (this.g == null) {
                return;
            }
            g();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.b(i);
        g();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        j();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        j();
    }

    public void setShadowPaddingEnabled(boolean z) {
        daaa j = j();
        j.h = z;
        j.q();
    }

    @Override // defpackage.daei
    public void setShapeAppearanceModel(dadx dadxVar) {
        j().i(dadxVar);
    }

    public void setShowMotionSpec(czur czurVar) {
        j().p = czurVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(czur.g(getContext(), i));
    }

    public void setSize(int i) {
        this.l = 0;
        if (i != this.k) {
            this.k = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            g();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            g();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        j();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        j();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        j();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.b != z) {
            this.b = z;
            j().p();
        }
    }

    @Override // defpackage.dabe, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public czzp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            j().b(this.i);
        }
    }

    public czzp(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018539), attributeSet, i);
        this.c = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray a = daaz.a(context2, attributeSet, daae.c, i, 2132018539, new int[0]);
        this.e = dada.a(context2, a, 1);
        this.f = dabd.a(a.getInt(2, -1), null);
        this.i = dada.a(context2, a, 15);
        this.k = a.getInt(8, -1);
        this.l = a.getDimensionPixelSize(7, 0);
        this.j = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(5, 0.0f);
        float dimension2 = a.getDimension(12, 0.0f);
        float dimension3 = a.getDimension(14, 0.0f);
        this.b = a.getBoolean(19, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.m = a.getDimensionPixelSize(13, 0);
        czur f = czur.f(context2, a, 18);
        czur f2 = czur.f(context2, a, 11);
        dadx b = dadx.c(context2, attributeSet, i, 2132018539, dadx.a).b();
        boolean z = a.getBoolean(6, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        xm xmVar = new xm(this);
        this.o = xmVar;
        xmVar.a(attributeSet, i);
        this.p = new czyx(this);
        j().i(b);
        j().a(this.e, this.f, this.i, this.j);
        j().l = dimensionPixelSize;
        j().c(dimension);
        j().e(dimension2);
        j().f(dimension3);
        daaa j = j();
        int i2 = this.m;
        if (j.t != i2) {
            j.t = i2;
            j.g();
        }
        j().p = f;
        j().q = f2;
        j().g = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
