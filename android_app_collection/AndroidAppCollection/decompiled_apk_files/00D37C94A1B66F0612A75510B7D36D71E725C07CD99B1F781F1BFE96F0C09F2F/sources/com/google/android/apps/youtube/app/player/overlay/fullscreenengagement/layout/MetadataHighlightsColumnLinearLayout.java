package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MetadataHighlightsColumnLinearLayout extends LinearLayout {
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MetadataHighlightsColumnLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_column_margin);
        this.a = dimensionPixelSize + dimensionPixelSize;
        a(context.obtainStyledAttributes(attributeSet, klv.a, 0, 0));
    }

    private final void a(TypedArray typedArray) {
        int[] iArr = klv.a;
        this.b = typedArray.getInteger(2, 1);
        this.d = akf.c(typedArray.getInteger(0, 1), 1, this.b);
        this.c = typedArray.getDimensionPixelSize(1, 0);
        typedArray.recycle();
    }

    public final void b(int i) {
        if (this.e != i) {
            this.e = i;
            a(getContext().obtainStyledAttributes(this.e, klv.a));
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int marginStart = ((ViewGroup.MarginLayoutParams) getLayoutParams()).getMarginStart();
        int marginEnd = ((ViewGroup.MarginLayoutParams) getLayoutParams()).getMarginEnd();
        int i3 = this.b;
        int i4 = this.a;
        int i5 = (size + (marginStart + marginEnd)) - (i3 * i4);
        int i6 = this.d;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((((i5 - this.c) / i3) * i6) + ((i6 - 1) * i4), 1073741824), i2);
    }
}
