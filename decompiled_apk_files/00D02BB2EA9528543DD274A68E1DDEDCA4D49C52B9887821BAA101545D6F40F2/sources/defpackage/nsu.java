package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: nsu  reason: default package */
/* loaded from: classes7.dex */
public final class nsu extends ntn {
    private int a;

    public nsu(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode != Integer.MIN_VALUE && mode != 1073741824) || size > this.a) {
            super.onMeasure(i, i2);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // defpackage.ntn, android.widget.LinearLayout
    public /* bridge */ /* synthetic */ void setBaselineAlignedChildIndex(int i) {
        super.setBaselineAlignedChildIndex(i);
    }

    public void setMinWidth(int i) {
        this.a = i;
    }

    public nsu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
