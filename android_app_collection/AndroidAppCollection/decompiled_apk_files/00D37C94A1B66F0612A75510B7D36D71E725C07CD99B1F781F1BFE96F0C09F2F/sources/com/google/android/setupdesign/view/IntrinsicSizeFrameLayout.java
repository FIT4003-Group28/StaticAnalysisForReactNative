package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class IntrinsicSizeFrameLayout extends FrameLayout {
    private int a;
    private int b;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        b(context, null, 0);
    }

    private final int a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        }
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), 1073741824) : i;
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alwr.l, i, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (!aqgn.l()) {
            return;
        }
        if (alwg.f(context).l(alwe.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT)) {
            this.a = (int) alwg.f(context).a(context, alwe.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT);
        }
        if (!alwg.f(context).l(alwe.CONFIG_CARD_VIEW_INTRINSIC_WIDTH)) {
            return;
        }
        this.b = (int) alwg.f(context).a(context, alwe.CONFIG_CARD_VIEW_INTRINSIC_WIDTH);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(a(i, this.b), a(i2, this.a));
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (aqgn.l() && this.a == 0 && this.b == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        b(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        b(context, attributeSet, i);
    }
}
