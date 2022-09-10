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
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dafe  reason: default package */
/* loaded from: classes5.dex */
public class dafe extends FrameLayout {
    private static final View.OnTouchListener e = new dafd();
    public int a;
    public final float b;
    public daez c;
    public daey d;
    private final float f;
    private ColorStateList g;
    private PorterDuff.Mode h;

    /* JADX INFO: Access modifiers changed from: protected */
    public dafe(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        daey daeyVar = this.d;
        if (daeyVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = daeyVar.a.e.getRootWindowInsets()) != null) {
            daeyVar.a.k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            daeyVar.a.a();
        }
        od.L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        daey daeyVar = this.d;
        if (daeyVar != null) {
            daff daffVar = daeyVar.a;
            dafn a = dafn.a();
            daew daewVar = daffVar.m;
            synchronized (a.a) {
                z = true;
                if (!a.g(daewVar) && !a.h(daewVar)) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            daff.b.post(new daex(daeyVar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        daez daezVar = this.c;
        if (daezVar != null) {
            daff daffVar = daezVar.a;
            daffVar.e.c = null;
            daffVar.g();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = ks.b(drawable.mutate());
            drawable.setTintList(this.g);
            drawable.setTintMode(this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable b = ks.b(getBackground().mutate());
            b.setTintList(colorStateList);
            b.setTintMode(this.h);
            if (b == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(b);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable b = ks.b(getBackground().mutate());
            b.setTintMode(mode);
            if (b == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dafe(Context context, AttributeSet attributeSet) {
        super(daib.a(context, attributeSet, 0, 0), attributeSet);
        Drawable b;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, dafh.a);
        if (obtainStyledAttributes.hasValue(6)) {
            od.F(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.a = obtainStyledAttributes.getInt(2, 0);
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.f = f;
        setBackgroundTintList(dada.a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(dabd.a(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(czxb.b(dacz.c(this, R.attr.colorSurface), dacz.c(this, R.attr.colorOnSurface), f));
            if (this.g != null) {
                b = ks.b(gradientDrawable);
                b.setTintList(this.g);
            } else {
                b = ks.b(gradientDrawable);
            }
            od.U(this, b);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : e);
        super.setOnClickListener(onClickListener);
    }
}
