package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
/* compiled from: PG */
/* renamed from: jkv  reason: default package */
/* loaded from: classes7.dex */
public final class jkv extends AppCompatTextView {
    public static final jku b = jkt.a;
    private jku c;
    private float d;
    private final TextPaint e;

    public jkv(Context context) {
        super(context);
        this.c = b;
        this.d = -1.0f;
        this.e = new TextPaint();
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, jku> cqlcVar) {
        return cqjv.f(iug.WIDTH_CONSTRAINT_CALLBACK, cqlcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 1073741824) {
                super.onMeasure(i, i2);
                return;
            }
            mode = 1073741824;
        }
        int i4 = Integer.MAX_VALUE;
        if (this.d > 0.0f) {
            this.e.set(getPaint());
            this.e.setTextSize(this.d);
            int ceil = ((int) Math.ceil(Layout.getDesiredWidth(getText(), this.e))) + getPaddingLeft() + getPaddingRight();
            Paint.FontMetrics fontMetrics = this.e.getFontMetrics();
            i4 = ((int) Math.ceil(fontMetrics.bottom - fontMetrics.top)) + getPaddingTop() + getPaddingBottom();
            i3 = ceil;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int a = this.c.a();
        if (mode == Integer.MIN_VALUE) {
            a = Math.min(a, size);
        }
        int min = Math.min(i4, size2);
        int min2 = Math.min(i3, a);
        if (mode != 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(min2, 1073741824);
        }
        if (mode2 != 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxTextSize(float f, int i) {
        this.d = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
    }

    public void setWidthConstraintCallback(jku jkuVar) {
        this.c = jkuVar;
    }

    public jkv(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = b;
        this.d = -1.0f;
        this.e = new TextPaint();
    }

    public jkv(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = b;
        this.d = -1.0f;
        this.e = new TextPaint();
    }
}
