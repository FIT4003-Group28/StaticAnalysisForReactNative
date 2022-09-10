package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: jkr  reason: default package */
/* loaded from: classes7.dex */
public final class jkr extends AppCompatTextView {
    private static final cqkv b = new jks();
    private final Rect c;
    private int d;

    public jkr(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jkr.class, cqmpVarArr);
    }

    public static <V extends cqkp> cqnf<V> b(Integer num) {
        return cqjv.i(jkq.a, num, b);
    }

    private final int c(int i) {
        float lineSpacingExtra;
        getLineBounds(i, this.c);
        float f = this.c.bottom - this.c.top;
        int i2 = 0;
        if (i == 0) {
            i2 = -getLayout().getTopPadding();
            i = 0;
        }
        float f2 = f - i2;
        if (i == getLineCount() - 1) {
            lineSpacingExtra = f2 - getLayout().getBottomPadding();
        } else {
            lineSpacingExtra = (f2 - getLineSpacingExtra()) / getLineSpacingMultiplier();
        }
        return this.c.top + i2 + ((int) (lineSpacingExtra / 2.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final int getBaseline() {
        if (getLayout() == null) {
            return super.getBaseline();
        }
        int i = this.d;
        if (i < 0 || i >= getLineCount()) {
            return c(0);
        }
        return c(this.d);
    }

    public void setAlignmentLine(int i) {
        this.d = i;
    }

    public jkr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jkr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = 0;
    }
}
