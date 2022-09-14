package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: jgb  reason: default package */
/* loaded from: classes7.dex */
public final class jgb extends LinearLayout {
    private int a;
    private int b;
    private int c;

    public jgb(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgb.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Integer num) {
        return cqjv.j(iug.MAX_LINES_IN_TOTAL, num);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(iug.MAX_LINES_IN_TOTAL, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> d(Integer num) {
        return cqjv.j(iug.MAX_LINES_PER_VIEW, num);
    }

    private final void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cpj.b);
            setMaxLinesInTotal(obtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
            setMaxLinesPerView(obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            obtainStyledAttributes.recycle();
        }
        setOrientation(1);
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof TextView)) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        TextView textView = (TextView) view;
        textView.setMaxLines(Math.min(Math.max(this.b, textView.getMaxLines()), this.c));
        super.measureChildWithMargins(view, i, i2, i3, i4);
        int i5 = this.c;
        if (i5 == Integer.MAX_VALUE) {
            return;
        }
        this.c = Math.max(i5 - textView.getLineCount(), 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.c = this.a;
        super.onMeasure(i, i2);
    }

    public void setMaxLinesInTotal(int i) {
        if (this.a == i || i <= 0) {
            return;
        }
        this.a = i;
        requestLayout();
    }

    public void setMaxLinesPerView(int i) {
        if (this.b == i || i <= 0) {
            return;
        }
        this.b = i;
        requestLayout();
    }

    public jgb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        e(attributeSet);
    }

    public jgb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        e(attributeSet);
    }
}
