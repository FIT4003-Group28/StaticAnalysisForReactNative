package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jft  reason: default package */
/* loaded from: classes.dex */
public final class jft extends FrameLayout {
    private int a;
    private int b;

    public jft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jft.class, cqmpVarArr);
    }

    private static int b(int i, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 0) {
            mode = Integer.MIN_VALUE;
        } else {
            i2 = Math.min(size, i2);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, mode);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(b(i, this.b), b(i2, this.a));
    }

    public void setMaxHeight(int i) {
        this.a = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        this.b = i;
        requestLayout();
    }
}
