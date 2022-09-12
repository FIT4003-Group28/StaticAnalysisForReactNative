package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: jlb  reason: default package */
/* loaded from: classes7.dex */
public final class jlb extends TextView {
    @dzsi
    private CharSequence a;
    @dzsi
    private CharSequence b;

    public jlb(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jlb.class, cqmpVarArr);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout layout;
        int lineCount;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            super.setText(charSequence);
        }
        super.onMeasure(i, i2);
        if (length() != 0 && (layout = getLayout()) != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            super.setText(this.a);
            super.onMeasure(i, i2);
        }
    }

    public void setOriginalText(@dzsi CharSequence charSequence) {
        this.b = charSequence;
        super.setText(charSequence);
    }

    public void setShortText(@dzsi CharSequence charSequence) {
        this.a = charSequence;
        forceLayout();
    }

    public jlb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jlb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
