package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ShrinkingItem extends FrameLayout {
    private float a;

    public ShrinkingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        float f = this.a;
        if (f != 1.0f) {
            measuredHeight = Math.round(f * measuredHeight);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), measuredHeight);
    }

    public void setAnimatedHeightFraction(float f) {
        this.a = f;
        requestLayout();
    }

    public ShrinkingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
    }
}
