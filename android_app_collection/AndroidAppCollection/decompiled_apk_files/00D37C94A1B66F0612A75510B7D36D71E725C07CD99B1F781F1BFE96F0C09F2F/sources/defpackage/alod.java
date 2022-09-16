package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alod  reason: default package */
/* loaded from: classes.dex */
public class alod extends FrameLayout {
    private static final View.OnTouchListener e = new gia(6);
    public int a;
    public final float b;
    public alnz c;
    public alny d;
    private final float f;
    private ColorStateList g;
    private PorterDuff.Mode h;

    /* JADX INFO: Access modifiers changed from: protected */
    public alod(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        alny alnyVar = this.d;
        if (alnyVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = alnyVar.a.e.getRootWindowInsets()) != null) {
            alnyVar.a.j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            alnyVar.a.i();
        }
        lj.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        alny alnyVar = this.d;
        if (alnyVar != null) {
            aloe aloeVar = alnyVar.a;
            alok a = alok.a();
            alnw alnwVar = aloeVar.m;
            synchronized (a.a) {
                z = true;
                if (!a.g(alnwVar) && !a.h(alnwVar)) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            aloe.a.post(new alnx(alnyVar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        alnz alnzVar = this.c;
        if (alnzVar != null) {
            aloe aloeVar = alnzVar.a;
            aloeVar.e.c = null;
            aloeVar.h();
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = iy.l(drawable.mutate());
            drawable.setTintList(this.g);
            drawable.setTintMode(this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable l = iy.l(getBackground().mutate());
            l.setTintList(colorStateList);
            l.setTintMode(this.h);
            if (l == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(l);
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable l = iy.l(getBackground().mutate());
            l.setTintMode(mode);
            if (l == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alod(Context context, AttributeSet attributeSet) {
        super(alqt.a(context, attributeSet, 0, 0), attributeSet);
        Drawable l;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, alof.a);
        if (obtainStyledAttributes.hasValue(6)) {
            lj.S(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.a = obtainStyledAttributes.getInt(2, 0);
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.f = f;
        setBackgroundTintList(almu.f(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(amyv.u(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(amxp.z(almu.k(this, R.attr.colorSurface), almu.k(this, R.attr.colorOnSurface), f));
            if (this.g != null) {
                l = iy.l(gradientDrawable);
                l.setTintList(this.g);
            } else {
                l = iy.l(gradientDrawable);
            }
            lj.O(this, l);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : e);
        super.setOnClickListener(onClickListener);
    }
}
