package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, daei {
    private static final int[] g = {16842911};
    private static final int[] h = {16842912};
    private static final int[] i = {R.attr.state_dragged};
    private final czwn j;
    private boolean k;
    private boolean l;
    private boolean m;
    private czwl n;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private final void l() {
        czwn czwnVar;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (czwnVar = this.j).n) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i2 = bounds.bottom;
        czwnVar.n.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
        czwnVar.n.setBounds(bounds.left, bounds.top, bounds.right, i2);
    }

    @Override // androidx.cardview.widget.CardView
    public final int Sy() {
        return this.j.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public final int b() {
        return this.j.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public final int c() {
        return this.j.b.top;
    }

    @Override // androidx.cardview.widget.CardView
    public final int d() {
        return this.j.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public final float e() {
        return this.j.c.ah();
    }

    public final void h(int i2, int i3, int i4, int i5) {
        super.setContentPadding(i2, i3, i4, i5);
    }

    public final void i(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.l;
    }

    public final boolean j() {
        czwn czwnVar = this.j;
        return czwnVar != null && czwnVar.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dads.f(this, this.j.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (j()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (this.l) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.l);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        czwn czwnVar = this.j;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (czwnVar.o != null) {
            int i4 = czwnVar.e;
            int i5 = czwnVar.f;
            int i6 = (measuredWidth - i4) - i5;
            int i7 = (measuredHeight - i4) - i5;
            if (czwnVar.a.a) {
                float m = czwnVar.m();
                i7 -= (int) Math.ceil(m + m);
                float n = czwnVar.n();
                i6 -= (int) Math.ceil(n + n);
            }
            int i8 = i7;
            int i9 = czwnVar.e;
            int s = od.s(czwnVar.a);
            czwnVar.o.setLayerInset(2, s == 1 ? i9 : i6, czwnVar.e, s == 1 ? i6 : i9, i8);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            czwn czwnVar = this.j;
            if (!czwnVar.q) {
                czwnVar.q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        this.j.b(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.j.e();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.j.c(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.j.r = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.j.j(drawable);
    }

    public void setCheckedIconMargin(int i2) {
        this.j.e = i2;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 != -1) {
            this.j.e = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconResource(int i2) {
        this.j.j(sl.b(getContext(), i2));
    }

    public void setCheckedIconSize(int i2) {
        this.j.f = i2;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 != 0) {
            this.j.f = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        czwn czwnVar = this.j;
        czwnVar.k = colorStateList;
        Drawable drawable = czwnVar.i;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        czwn czwnVar = this.j;
        if (czwnVar != null) {
            Drawable drawable2 = czwnVar.h;
            if (czwnVar.a.isClickable()) {
                drawable = czwnVar.q();
            } else {
                drawable = czwnVar.d;
            }
            czwnVar.h = drawable;
            Drawable drawable3 = czwnVar.h;
            if (drawable2 == drawable3) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || !(czwnVar.a.getForeground() instanceof InsetDrawable)) {
                czwnVar.a.setForeground(czwnVar.l(drawable3));
            } else {
                ((InsetDrawable) czwnVar.a.getForeground()).setDrawable(drawable3);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i2, int i3, int i4, int i5) {
        this.j.d(i2, i3, i4, i5);
    }

    public void setDragged(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            l();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.f();
    }

    public void setOnCheckedChangeListener(czwl czwlVar) {
        this.n = czwlVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.f();
        this.j.h();
    }

    public void setProgress(float f) {
        czwn czwnVar = this.j;
        czwnVar.c.Y(f);
        czwnVar.d.Y(f);
        dadr dadrVar = czwnVar.p;
        if (dadrVar != null) {
            dadrVar.Y(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        czwn czwnVar = this.j;
        czwnVar.k(czwnVar.l.f(f));
        czwnVar.h.invalidateSelf();
        if (czwnVar.p() || czwnVar.o()) {
            czwnVar.h();
        }
        if (czwnVar.p()) {
            czwnVar.f();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.j.i(colorStateList);
    }

    public void setRippleColorResource(int i2) {
        this.j.i(sl.a(getContext(), i2));
    }

    @Override // defpackage.daei
    public void setShapeAppearanceModel(dadx dadxVar) {
        RectF rectF = new RectF();
        rectF.set(this.j.c.getBounds());
        setClipToOutline(dadxVar.g(rectF));
        this.j.k(dadxVar);
    }

    public void setStrokeColor(int i2) {
        this.j.a(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        czwn czwnVar = this.j;
        if (i2 == czwnVar.g) {
            return;
        }
        czwnVar.g = i2;
        czwnVar.g();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.f();
        this.j.h();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!j() || !isEnabled()) {
            return;
        }
        this.l = !this.l;
        refreshDrawableState();
        l();
        czwl czwlVar = this.n;
        if (czwlVar == null) {
            return;
        }
        czwlVar.a();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.j.b(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j.a(colorStateList);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(daib.a(context, attributeSet, i2, 2132018731), attributeSet, i2);
        this.l = false;
        this.m = false;
        this.k = true;
        TypedArray a = daaz.a(getContext(), attributeSet, czwo.b, i2, 2132018731, new int[0]);
        czwn czwnVar = new czwn(this, attributeSet, i2);
        this.j = czwnVar;
        czwnVar.b(((ahx) this.f.a).e);
        czwnVar.d(super.Sy(), super.c(), super.b(), super.d());
        czwnVar.m = dada.a(czwnVar.a.getContext(), a, 10);
        if (czwnVar.m == null) {
            czwnVar.m = ColorStateList.valueOf(-1);
        }
        czwnVar.g = a.getDimensionPixelSize(11, 0);
        boolean z = a.getBoolean(0, false);
        czwnVar.r = z;
        czwnVar.a.setLongClickable(z);
        czwnVar.k = dada.a(czwnVar.a.getContext(), a, 5);
        czwnVar.j(dada.c(czwnVar.a.getContext(), a, 2));
        czwnVar.f = a.getDimensionPixelSize(4, 0);
        czwnVar.e = a.getDimensionPixelSize(3, 0);
        czwnVar.j = dada.a(czwnVar.a.getContext(), a, 6);
        if (czwnVar.j == null) {
            czwnVar.j = ColorStateList.valueOf(dacz.c(czwnVar.a, R.attr.colorControlHighlight));
        }
        czwnVar.c(dada.a(czwnVar.a.getContext(), a, 1));
        czwnVar.r();
        czwnVar.e();
        czwnVar.g();
        super.setBackgroundDrawable(czwnVar.l(czwnVar.c));
        czwnVar.h = czwnVar.a.isClickable() ? czwnVar.q() : czwnVar.d;
        czwnVar.a.setForeground(czwnVar.l(czwnVar.h));
        a.recycle();
    }
}
