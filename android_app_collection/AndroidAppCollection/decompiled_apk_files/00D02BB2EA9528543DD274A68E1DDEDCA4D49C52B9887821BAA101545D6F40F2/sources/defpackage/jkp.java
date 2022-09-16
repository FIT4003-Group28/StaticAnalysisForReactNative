package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: jkp  reason: default package */
/* loaded from: classes7.dex */
public final class jkp extends TextView {
    private int a;
    private int b;

    public jkp(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jkp.class, cqmpVarArr);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.a;
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        super.setMaxLines(i3);
        super.onMeasure(i, i2);
        int lineCount = getLineCount();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int min = Math.min(lineCount, i3);
        Rect rect = new Rect();
        while (min > 0) {
            int i4 = min - 1;
            getLineBounds(i4, rect);
            if (rect.bottom <= measuredHeight) {
                break;
            }
            min = i4;
        }
        int i5 = this.b;
        if (i5 > 0 && min < i5) {
            min = 0;
        }
        if (min != i3) {
            super.setMaxLines(min);
            super.onMeasure(i, i2);
        }
    }

    public void setMaxDisplayLines(int i) {
        this.a = i;
    }

    public void setMinDisplayLines(int i) {
        this.b = i;
    }

    public jkp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jkp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
