package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultTabsBar extends yyd implements bpn {
    private LayoutInflater a;
    private int b;
    public Rect c;
    public Paint d;
    public int e;
    public yzh f;
    private int g;
    private int m;
    private int n;
    private float o;
    private int p;
    private int q;
    private ColorStateList r;

    public DefaultTabsBar(Context context) {
        super(context);
        d(context, null);
    }

    private final void d(Context context, AttributeSet attributeSet) {
        this.a = LayoutInflater.from(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yzz.g);
        this.p = obtainStyledAttributes.getDimensionPixelSize(4, zew.i(displayMetrics, 48));
        h(obtainStyledAttributes.getColorStateList(1));
        this.q = obtainStyledAttributes.getDimensionPixelSize(3, zew.i(displayMetrics, 2));
        int color = obtainStyledAttributes.getColor(2, resources.getColor(17170443));
        this.b = obtainStyledAttributes.getResourceId(5, R.layout.tabs_bar_text_tab);
        this.g = obtainStyledAttributes.getResourceId(6, R.id.text);
        this.m = obtainStyledAttributes.getResourceId(0, R.layout.tabs_bar_image_tab);
        obtainStyledAttributes.recycle();
        this.c = new Rect();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.d.setColor(color);
        setFillViewport(true);
    }

    @Override // defpackage.bpn
    public final void a(int i) {
    }

    @Override // defpackage.bpn
    public final void b(int i, float f, int i2) {
        o(i, f, true);
    }

    @Override // defpackage.bpn
    public final void c(int i) {
        m(i, false);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.h && j() != 0) {
            View k = k(this.n);
            int left = k.getLeft();
            int right = k.getRight();
            int i = lj.e(this) == 1 ? this.n - 1 : this.n + 1;
            if (this.o > 0.0f && i >= 0 && i < j()) {
                View k2 = k(i);
                left += Math.round((k2.getLeft() - left) * this.o);
                right += Math.round((k2.getRight() - right) * this.o);
            }
            canvas.drawRect(left, this.c.top, right, this.c.bottom, this.d);
        }
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(View view, ColorStateList colorStateList) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateList);
        }
    }

    public final View f(int i, boolean z, CharSequence charSequence) {
        ImageView imageView = (ImageView) this.a.inflate(this.m, (ViewGroup) this.h, false);
        imageView.setImageResource(i);
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            e(imageView, colorStateList);
        }
        imageView.setContentDescription(charSequence);
        q(imageView);
        zag.u(imageView, z, this.e, this.f);
        return imageView;
    }

    public final View g(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        View inflate = this.a.inflate(this.b, (ViewGroup) this.h, false);
        TextView textView = (TextView) inflate.findViewById(this.g);
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            e(textView, colorStateList);
        }
        textView.setText(charSequence);
        inflate.setContentDescription(charSequence2);
        zag.u(inflate, z, this.e, this.f);
        q(inflate);
        return inflate;
    }

    public final void h(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.r = colorStateList;
        for (int i = 0; i < j(); i++) {
            View k = k(i);
            View findViewById = k.findViewById(this.g);
            if (findViewById == null) {
                findViewById = k.findViewById(R.id.image);
            }
            e(findViewById, this.r);
        }
    }

    @Override // defpackage.yyd
    protected final void i(int i, boolean z) {
        View k;
        if (i < 0 || i >= j() || (k = k(i)) == null) {
            return;
        }
        k.setActivated(z);
        k.setSelected(z);
        zag.u(k, false, this.e, this.f);
    }

    @Override // defpackage.yyd
    public final void lb() {
        super.lb();
        this.n = 0;
        this.o = 0.0f;
    }

    public final void o(int i, float f, boolean z) {
        View k;
        this.n = i;
        this.o = f;
        invalidate(this.c);
        if (!z || (k = k(i)) == null) {
            return;
        }
        scrollTo((k.getLeft() + ((int) (k.getWidth() * f))) - (i != 0 ? this.p : (int) (this.p * f)), 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.c.set(0, i5 - this.q, i3 - i, i5);
    }

    public final void p(CharSequence charSequence, CharSequence charSequence2) {
        g(charSequence, charSequence2, false);
    }

    protected final void q(View view) {
        n(view, true);
        if (j() == 1) {
            m(0, false);
            o(this.i, 0.0f, false);
        }
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }
}
