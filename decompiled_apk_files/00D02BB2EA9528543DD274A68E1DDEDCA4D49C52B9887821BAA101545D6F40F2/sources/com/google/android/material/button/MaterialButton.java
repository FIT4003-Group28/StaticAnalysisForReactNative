package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends xd implements Checkable, daei {
    private static final int[] c = {16842911};
    private static final int[] d = {16842912};
    private final czwj e;
    public Drawable f;
    public int g;
    private final LinkedHashSet<czwh> h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final String a() {
        return (true != d() ? Button.class : CompoundButton.class).getName();
    }

    private final void b(int i, int i2) {
        if (this.f == null || getLayout() == null) {
            return;
        }
        if (g() || h()) {
            this.l = 0;
            int i3 = this.p;
            boolean z = true;
            if (i3 == 1 || i3 == 3) {
                this.k = 0;
                e(false);
                return;
            }
            int i4 = this.g;
            if (i4 == 0) {
                i4 = this.f.getIntrinsicWidth();
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = (((((i - Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth())) - od.x(this)) - i4) - this.m) - od.w(this)) / 2;
            boolean z2 = od.s(this) == 1;
            if (this.p != 4) {
                z = false;
            }
            if (z2 != z) {
                min = -min;
            }
            if (this.k == min) {
                return;
            }
            this.k = min;
            e(false);
        } else if (!i()) {
        } else {
            this.k = 0;
            if (this.p == 16) {
                this.l = 0;
                e(false);
                return;
            }
            int i5 = this.g;
            if (i5 == 0) {
                i5 = this.f.getIntrinsicHeight();
            }
            TextPaint paint2 = getPaint();
            String charSequence2 = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            Rect rect = new Rect();
            paint2.getTextBounds(charSequence2, 0, charSequence2.length(), rect);
            int min2 = (((((i2 - Math.min(rect.height(), getLayout().getHeight())) - getPaddingTop()) - i5) - this.m) - getPaddingBottom()) / 2;
            if (this.l == min2) {
                return;
            }
            this.l = min2;
            e(false);
        }
    }

    private final void e(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            Drawable mutate = ks.b(drawable).mutate();
            this.f = mutate;
            mutate.setTintList(this.j);
            PorterDuff.Mode mode = this.i;
            if (mode != null) {
                this.f.setTintMode(mode);
            }
            int i = this.g;
            if (i == 0) {
                i = this.f.getIntrinsicWidth();
            }
            int i2 = this.g;
            if (i2 == 0) {
                i2 = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i3 = this.k;
            int i4 = this.l;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            if ((!g() || drawable3 == this.f) && ((!h() || drawable5 == this.f) && (!i() || drawable4 == this.f))) {
                return;
            }
            f();
            return;
        }
        f();
    }

    private final void f() {
        if (g()) {
            setCompoundDrawablesRelative(this.f, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f, null);
        } else if (!i()) {
        } else {
            setCompoundDrawablesRelative(null, this.f, null, null);
        }
    }

    private final boolean g() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    private final boolean h() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    private final boolean i() {
        int i = this.p;
        return i == 16 || i == 32;
    }

    private final boolean j() {
        czwj czwjVar = this.e;
        return czwjVar != null && !czwjVar.n;
    }

    public final void c(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final boolean d() {
        czwj czwjVar = this.e;
        return czwjVar != null && czwjVar.p;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        aeo aeoVar;
        if (j()) {
            return this.e.j;
        }
        xc xcVar = this.b;
        if (xcVar != null && (aeoVar = xcVar.a) != null) {
            return aeoVar.a;
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        aeo aeoVar;
        if (j()) {
            return this.e.i;
        }
        xc xcVar = this.b;
        if (xcVar != null && (aeoVar = xcVar.a) != null) {
            return aeoVar.b;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (j()) {
            dads.f(this, this.e.d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (d()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.xd, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.n);
    }

    @Override // defpackage.xd, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setChecked(this.n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.xd, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        czwj czwjVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (czwjVar = this.e) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = czwjVar.m;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(czwjVar.c, czwjVar.e, i6 - czwjVar.d, i5 - czwjVar.f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.n;
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b(i, i2);
    }

    @Override // defpackage.xd, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        b(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (j()) {
            czwj czwjVar = this.e;
            if (czwjVar.d() == null) {
                return;
            }
            czwjVar.d().setTint(i);
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.xd, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (j()) {
            if (drawable != getBackground()) {
                this.e.b();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.xd, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? sl.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (j()) {
            this.e.p = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!d() || !isEnabled() || this.n == z) {
            return;
        }
        this.n = z;
        refreshDrawableState();
        if (this.o) {
            return;
        }
        this.o = true;
        Iterator<czwh> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.o = false;
    }

    public void setCornerRadius(int i) {
        if (j()) {
            czwj czwjVar = this.e;
            if (czwjVar.o && czwjVar.g == i) {
                return;
            }
            czwjVar.g = i;
            czwjVar.o = true;
            czwjVar.f(czwjVar.b.f(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (j()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (j()) {
            this.e.d().aa(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f != drawable) {
            this.f = drawable;
            e(true);
            b(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.p != i) {
            this.p = i;
            b(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.m != i) {
            this.m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? sl.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.g == i) {
                return;
            }
            this.g = i;
            e(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(sl.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        czwj czwjVar = this.e;
        czwjVar.g(czwjVar.e, i);
    }

    public void setInsetTop(int i) {
        czwj czwjVar = this.e;
        czwjVar.g(i, czwjVar.f);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (j()) {
            czwj czwjVar = this.e;
            if (czwjVar.l == colorStateList) {
                return;
            }
            czwjVar.l = colorStateList;
            if (!(czwjVar.a.getBackground() instanceof RippleDrawable)) {
                return;
            }
            ((RippleDrawable) czwjVar.a.getBackground()).setColor(dadg.a(colorStateList));
        }
    }

    public void setRippleColorResource(int i) {
        if (j()) {
            setRippleColor(sl.a(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (j()) {
            czwj czwjVar = this.e;
            if (czwjVar.k == colorStateList) {
                return;
            }
            czwjVar.k = colorStateList;
            czwjVar.c();
        }
    }

    public void setStrokeColorResource(int i) {
        if (j()) {
            setStrokeColor(sl.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (j()) {
            czwj czwjVar = this.e;
            if (czwjVar.h == i) {
                return;
            }
            czwjVar.h = i;
            czwjVar.c();
        }
    }

    public void setStrokeWidthResource(int i) {
        if (j()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.xd
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!j()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        czwj czwjVar = this.e;
        if (czwjVar.j == colorStateList) {
            return;
        }
        czwjVar.j = colorStateList;
        if (czwjVar.d() == null) {
            return;
        }
        czwjVar.d().setTintList(czwjVar.j);
    }

    @Override // defpackage.xd
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!j()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        czwj czwjVar = this.e;
        if (czwjVar.i == mode) {
            return;
        }
        czwjVar.i = mode;
        if (czwjVar.d() == null || czwjVar.i == null) {
            return;
        }
        czwjVar.d().setTintMode(czwjVar.i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.n);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    @Override // defpackage.daei
    public void setShapeAppearanceModel(dadx dadxVar) {
        if (j()) {
            this.e.f(dadxVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new czwi();
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt() != 1 ? false : true;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018719), attributeSet, i);
        this.h = new LinkedHashSet<>();
        boolean z = false;
        this.n = false;
        this.o = false;
        Context context2 = getContext();
        TypedArray a = daaz.a(context2, attributeSet, czwk.a, i, 2132018719, new int[0]);
        this.m = a.getDimensionPixelSize(12, 0);
        this.i = dabd.a(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.j = dada.a(getContext(), a, 14);
        this.f = dada.c(getContext(), a, 10);
        this.p = a.getInteger(11, 1);
        this.g = a.getDimensionPixelSize(13, 0);
        czwj czwjVar = new czwj(this, dadx.b(context2, attributeSet, i, 2132018719).b());
        this.e = czwjVar;
        czwjVar.c = a.getDimensionPixelOffset(1, 0);
        czwjVar.d = a.getDimensionPixelOffset(2, 0);
        czwjVar.e = a.getDimensionPixelOffset(3, 0);
        czwjVar.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            czwjVar.g = dimensionPixelSize;
            czwjVar.f(czwjVar.b.f(dimensionPixelSize));
            czwjVar.o = true;
        }
        czwjVar.h = a.getDimensionPixelSize(20, 0);
        czwjVar.i = dabd.a(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        czwjVar.j = dada.a(czwjVar.a.getContext(), a, 6);
        czwjVar.k = dada.a(czwjVar.a.getContext(), a, 19);
        czwjVar.l = dada.a(czwjVar.a.getContext(), a, 16);
        czwjVar.p = a.getBoolean(5, false);
        czwjVar.q = a.getDimensionPixelSize(9, 0);
        int w = od.w(czwjVar.a);
        int paddingTop = czwjVar.a.getPaddingTop();
        int x = od.x(czwjVar.a);
        int paddingBottom = czwjVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            czwjVar.b();
        } else {
            czwjVar.a();
        }
        od.y(czwjVar.a, w + czwjVar.c, paddingTop + czwjVar.e, x + czwjVar.d, paddingBottom + czwjVar.f);
        a.recycle();
        setCompoundDrawablePadding(this.m);
        e(this.f != null ? true : z);
    }
}
