package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, alnn {
    private static final int[] b = {16842911};
    private static final int[] c = {16842912};
    private final aljs d;
    private final LinkedHashSet e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final String a() {
        return (true != c() ? Button.class : CompoundButton.class).getName();
    }

    private final void d() {
        if (h()) {
            setCompoundDrawablesRelative(this.h, null, null, null);
        } else if (g()) {
            setCompoundDrawablesRelative(null, null, this.h, null);
        } else if (!i()) {
        } else {
            setCompoundDrawablesRelative(null, this.h, null, null);
        }
    }

    private final void e(boolean z) {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = iy.l(drawable).mutate();
            this.h = mutate;
            mutate.setTintList(this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                this.h.setTintMode(mode);
            }
            int i = this.i;
            if (i == 0) {
                i = this.h.getIntrinsicWidth();
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i3 = this.j;
            int i4 = this.k;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.h.setVisible(true, z);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            if ((!h() || drawable3 == this.h) && ((!g() || drawable5 == this.h) && (!i() || drawable4 == this.h))) {
                return;
            }
            d();
            return;
        }
        d();
    }

    private final void f(int i, int i2) {
        if (this.h == null || getLayout() == null) {
            return;
        }
        if (h() || g()) {
            this.k = 0;
            int i3 = this.o;
            boolean z = true;
            if (i3 == 1 || i3 == 3) {
                this.j = 0;
                e(false);
                return;
            }
            int i4 = this.i;
            if (i4 == 0) {
                i4 = this.h.getIntrinsicWidth();
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = (((((i - Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth())) - lj.h(this)) - i4) - this.l) - lj.i(this)) / 2;
            boolean z2 = lj.e(this) == 1;
            if (this.o != 4) {
                z = false;
            }
            if (z2 != z) {
                min = -min;
            }
            if (this.j == min) {
                return;
            }
            this.j = min;
            e(false);
        } else if (!i()) {
        } else {
            this.j = 0;
            if (this.o == 16) {
                this.k = 0;
                e(false);
                return;
            }
            int i5 = this.i;
            if (i5 == 0) {
                i5 = this.h.getIntrinsicHeight();
            }
            TextPaint paint2 = getPaint();
            String charSequence2 = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            Rect rect = new Rect();
            paint2.getTextBounds(charSequence2, 0, charSequence2.length(), rect);
            int min2 = (((((i2 - Math.min(rect.height(), getLayout().getHeight())) - getPaddingTop()) - i5) - this.l) - getPaddingBottom()) / 2;
            if (this.k == min2) {
                return;
            }
            this.k = min2;
            e(false);
        }
    }

    private final boolean g() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    private final boolean h() {
        int i = this.o;
        return i == 1 || i == 2;
    }

    private final boolean i() {
        int i = this.o;
        return i == 16 || i == 32;
    }

    private final boolean j() {
        aljs aljsVar = this.d;
        return aljsVar != null && !aljsVar.n;
    }

    public final boolean c() {
        aljs aljsVar = this.d;
        return aljsVar != null && aljsVar.o;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return j() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return j() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final ColorStateList getSupportBackgroundTintList() {
        return j() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return j() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (j()) {
            almu.d(this, this.d.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (c()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aljs aljsVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (aljsVar = this.d) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = aljsVar.m;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(aljsVar.c, aljsVar.e, i6 - aljsVar.d, i5 - aljsVar.f);
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
        savedState.a = this.m;
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f(i, i2);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (j()) {
            aljs aljsVar = this.d;
            if (aljsVar.a() == null) {
                return;
            }
            aljsVar.a().setTint(i);
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (j()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.c();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? po.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!c() || !isEnabled() || this.m == z) {
            return;
        }
        this.m = z;
        refreshDrawableState();
        if (this.n) {
            return;
        }
        this.n = true;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aljr) it.next()).a();
        }
        this.n = false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (j()) {
            this.d.a().k(f);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!j()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        aljs aljsVar = this.d;
        if (aljsVar.j == colorStateList) {
            return;
        }
        aljsVar.j = colorStateList;
        if (aljsVar.a() == null) {
            return;
        }
        aljsVar.a().setTintList(aljsVar.j);
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!j()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        aljs aljsVar = this.d;
        if (aljsVar.i == mode) {
            return;
        }
        aljsVar.i = mode;
        if (aljsVar.a() == null || aljsVar.i == null) {
            return;
        }
        aljsVar.a().setTintMode(aljsVar.i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    @Override // defpackage.alnn
    public final void b(alnc alncVar) {
        if (j()) {
            this.d.d(alncVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aljh(2);
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
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
        super(alqt.a(context, attributeSet, i, 2132084376), attributeSet, i);
        this.e = new LinkedHashSet();
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray a = alli.a(context2, attributeSet, aljt.a, i, 2132084376, new int[0]);
        this.l = a.getDimensionPixelSize(12, 0);
        this.f = amyv.u(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.g = almu.f(getContext(), a, 14);
        this.h = almu.h(getContext(), a, 10);
        this.o = a.getInteger(11, 1);
        this.i = a.getDimensionPixelSize(13, 0);
        aljs aljsVar = new aljs(this, alnc.b(context2, attributeSet, i, 2132084376).a());
        this.d = aljsVar;
        aljsVar.c = a.getDimensionPixelOffset(1, 0);
        aljsVar.d = a.getDimensionPixelOffset(2, 0);
        aljsVar.e = a.getDimensionPixelOffset(3, 0);
        aljsVar.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            aljsVar.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            alnb d = aljsVar.b.d();
            d.d(f);
            d.e(f);
            d.c(f);
            d.b(f);
            aljsVar.d(d.a());
        }
        aljsVar.h = a.getDimensionPixelSize(20, 0);
        aljsVar.i = amyv.u(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aljsVar.j = almu.f(aljsVar.a.getContext(), a, 6);
        aljsVar.k = almu.f(aljsVar.a.getContext(), a, 19);
        aljsVar.l = almu.f(aljsVar.a.getContext(), a, 16);
        aljsVar.o = a.getBoolean(5, false);
        aljsVar.q = a.getDimensionPixelSize(9, 0);
        int i2 = lj.i(aljsVar.a);
        int paddingTop = aljsVar.a.getPaddingTop();
        int h = lj.h(aljsVar.a);
        int paddingBottom = aljsVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            aljsVar.c();
        } else {
            MaterialButton materialButton = aljsVar.a;
            almx almxVar = new almx(aljsVar.b);
            almxVar.j(aljsVar.a.getContext());
            almxVar.setTintList(aljsVar.j);
            PorterDuff.Mode mode = aljsVar.i;
            if (mode != null) {
                almxVar.setTintMode(mode);
            }
            int i3 = aljsVar.h;
            ColorStateList colorStateList = aljsVar.k;
            almxVar.r(i3);
            almxVar.q(colorStateList);
            almx almxVar2 = new almx(aljsVar.b);
            almxVar2.setTint(0);
            almxVar2.p(aljsVar.h, 0);
            aljsVar.m = new almx(aljsVar.b);
            aljsVar.m.setTint(-1);
            aljsVar.p = new RippleDrawable(almo.b(aljsVar.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{almxVar2, almxVar}), aljsVar.c, aljsVar.e, aljsVar.d, aljsVar.f), aljsVar.m);
            super.setBackgroundDrawable(aljsVar.p);
            almx a2 = aljsVar.a();
            if (a2 != null) {
                a2.k(aljsVar.q);
            }
        }
        lj.Y(aljsVar.a, i2 + aljsVar.c, paddingTop + aljsVar.e, h + aljsVar.d, paddingBottom + aljsVar.f);
        a.recycle();
        setCompoundDrawablePadding(this.l);
        e(this.h != null);
    }
}
