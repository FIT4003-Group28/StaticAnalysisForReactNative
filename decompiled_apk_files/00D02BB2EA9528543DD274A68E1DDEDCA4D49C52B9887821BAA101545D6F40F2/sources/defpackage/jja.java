package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: jja  reason: default package */
/* loaded from: classes7.dex */
public final class jja extends ScrollView {
    private int a;

    public jja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Integer.MAX_VALUE;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jja.class, cqmpVarArr);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.a));
    }

    public void setMaxHeight(int i) {
        this.a = i;
        requestLayout();
    }
}
