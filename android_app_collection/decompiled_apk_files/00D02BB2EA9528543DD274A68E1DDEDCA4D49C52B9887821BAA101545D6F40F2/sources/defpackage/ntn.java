package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ntn  reason: default package */
/* loaded from: classes7.dex */
class ntn extends LinearLayout {
    private int a;

    public ntn(Context context) {
        super(context);
        this.a = -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        int baselineAlignedChildIndex = getBaselineAlignedChildIndex();
        if (baselineAlignedChildIndex < 0 || baselineAlignedChildIndex >= getChildCount() || getChildAt(baselineAlignedChildIndex).getBaseline() != -1) {
            return super.getBaseline();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        setBaselineAlignedChildIndex(this.a);
    }

    @Override // android.widget.LinearLayout
    public void setBaselineAlignedChildIndex(int i) {
        this.a = i;
        if (getChildCount() > this.a) {
            int baselineAlignedChildIndex = getBaselineAlignedChildIndex();
            int i2 = this.a;
            if (baselineAlignedChildIndex == i2) {
                return;
            }
            super.setBaselineAlignedChildIndex(i2);
        }
    }

    public ntn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }
}
