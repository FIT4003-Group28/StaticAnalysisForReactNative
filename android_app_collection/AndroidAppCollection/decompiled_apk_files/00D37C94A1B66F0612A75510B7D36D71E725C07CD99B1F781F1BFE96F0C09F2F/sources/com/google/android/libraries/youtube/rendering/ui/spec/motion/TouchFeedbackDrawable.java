package com.google.android.libraries.youtube.rendering.ui.spec.motion;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TouchFeedbackDrawable extends Drawable {
    public akek a;
    private final Drawable b;
    private boolean c;
    private boolean d;
    private boolean e;
    private aked f;

    public TouchFeedbackDrawable() {
        this(null);
        b();
    }

    public /* synthetic */ TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable, akel akelVar) {
        this(i, i2, i3, drawable);
    }

    public static int a(Resources resources, Resources.Theme theme) {
        return zhn.k(resources, theme, R.attr.ytTouchResponse).orElse(0);
    }

    private final void b() {
        this.f = new aked(null);
        this.e = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        akek akekVar = this.a;
        int a = a(theme.getResources(), theme);
        akekVar.a.setColor(a);
        akekVar.b.setColor(a);
        akekVar.setAlpha(0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        int color;
        if (theme != null) {
            obtainAttributes = theme.obtainStyledAttributes(attributeSet, akeg.a, 0, 0);
        } else {
            obtainAttributes = resources.obtainAttributes(attributeSet, akeg.a);
        }
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        boolean hasValue = obtainAttributes.hasValue(0);
        this.d = !hasValue;
        if (hasValue || theme == null) {
            color = obtainAttributes.getColor(0, 0);
        } else {
            color = a(resources, theme);
        }
        int i = zew.i(resources.getDisplayMetrics(), 1);
        int dimensionPixelSize = obtainAttributes.getDimensionPixelSize(1, 0);
        if (obtainAttributes.getInt(2, 0) == 1) {
            this.a = new akek(color, i, -1);
        } else {
            this.a = new akek(color, i, dimensionPixelSize);
        }
        obtainAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            onStateChange = onStateChange || this.b.setState(iArr);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842919) {
                z2 = true;
            }
        }
        boolean z3 = z && z2;
        if (this.e != z3) {
            this.e = z3;
            if (!z3) {
                ValueAnimator ofInt = ValueAnimator.ofInt(26, 0);
                ofInt.addUpdateListener(new akeh(this));
                ofInt.setInterpolator(akef.a);
                ofInt.setDuration(400L);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(26, 0);
                ofInt2.addUpdateListener(new akeh(this, 2));
                ofInt2.setInterpolator(akef.b);
                ofInt2.setDuration(400L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofInt, ofInt2);
                this.f.b(animatorSet);
            } else {
                ValueAnimator ofInt3 = ValueAnimator.ofInt(0, 26);
                ofInt3.addUpdateListener(new akeh(this, 1));
                ofInt3.setInterpolator(akef.a);
                ofInt3.setDuration(100L);
                ofInt3.addListener(new akei(this));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(ofInt3);
                this.f.a(animatorSet2);
            }
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    private TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable) {
        this(drawable);
        this.a = new akek(i, i2, i3);
        this.c = i3 == -2;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.a.setBounds(rect);
    }

    private TouchFeedbackDrawable(Drawable drawable) {
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(getCallback());
        }
    }
}
