package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MaxHeightScrollView extends ScrollView {
    private int a;

    public MaxHeightScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.a;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.a = i;
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
