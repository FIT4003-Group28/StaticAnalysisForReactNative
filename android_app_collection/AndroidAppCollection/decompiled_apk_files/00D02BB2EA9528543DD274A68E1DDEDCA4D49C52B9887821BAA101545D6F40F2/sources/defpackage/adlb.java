package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: adlb  reason: default package */
/* loaded from: classes2.dex */
public final class adlb extends FrameLayout {
    public adlb(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * ((((size / f) - 1.0f) / 5.0f) + 1.0f)), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
