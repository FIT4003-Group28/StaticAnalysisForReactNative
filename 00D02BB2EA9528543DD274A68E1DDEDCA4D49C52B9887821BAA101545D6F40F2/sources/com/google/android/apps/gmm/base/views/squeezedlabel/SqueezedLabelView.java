package com.google.android.apps.gmm.base.views.squeezedlabel;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SqueezedLabelView extends TextView {
    public float a;
    private float b;
    private float c;
    private int d;
    private float e;
    private int f;

    public SqueezedLabelView(Context context) {
        super(context);
        this.d = -1;
        g();
    }

    public static <T extends cqkp> cqnf<T> a(Float f) {
        return cqjv.j(iug.MIN_SCALE_X, f);
    }

    public static <T extends cqkp> cqnf<T> b(cqtv cqtvVar) {
        return cqjv.j(iug.MIN_TEXT_SIZE, cqtvVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return new cqmh(SqueezedLabelView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> d(cqtv cqtvVar) {
        return cqjv.j(iug.DESIRED_TEXT_SIZE, cqtvVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> c = c(a(Float.valueOf(1.0f)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END));
        c.f(cqmpVarArr);
        return c;
    }

    private final void g() {
        this.b = 0.7f;
        float applyDimension = TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.c = applyDimension;
        this.a = 1.0f;
        setTextSize(0, applyDimension);
    }

    private final void h() {
        this.e = -1.0f;
        this.f = -1;
    }

    public final void f(int i) {
        this.f = i;
        float textSize = getTextSize();
        float f = this.c;
        if (textSize != f) {
            super.setTextSize(0, f);
        }
        if (getTextScaleX() != 1.0f) {
            super.setTextScaleX(1.0f);
        }
        CharSequence text = getText();
        if (getTransformationMethod() != null) {
            text = getTransformationMethod().getTransformation(text, this);
        }
        float desiredWidth = Layout.getDesiredWidth(text, getPaint());
        this.e = desiredWidth;
        float f2 = i;
        if (desiredWidth > f2) {
            super.setTextScaleX(Math.max(this.b, (f2 / desiredWidth) - 0.01f));
            float desiredWidth2 = Layout.getDesiredWidth(text, getPaint());
            while (desiredWidth2 > f2) {
                float max = (int) Math.max(this.a, (f2 / desiredWidth2) * getTextSize());
                super.setTextSize(0, max);
                if (max == this.a) {
                    return;
                }
                desiredWidth2 = Layout.getDesiredWidth(text, getPaint());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.d;
        if (i3 > 0 && mode != 0 && size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            size = i3;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (mode == 0) {
            f(Integer.MAX_VALUE);
        } else if (this.e < 0.0f || this.f != paddingLeft) {
            f(paddingLeft);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        h();
        requestLayout();
        invalidate();
    }

    public void setDesiredTextSize(float f) {
        float max = Math.max(1.0f, f);
        if (max != this.c) {
            this.c = max;
            h();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i != this.d) {
            this.d = i;
            h();
        }
    }

    public void setMinScaleX(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (max != this.b) {
            this.b = max;
            h();
            requestLayout();
            invalidate();
        }
    }

    public void setMinTextSize(float f) {
        float max = Math.max(1.0f, f);
        if (max != this.a) {
            this.a = max;
            h();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setDesiredTextSize(getTextSize());
    }

    @Override // android.widget.TextView
    public void setTextScaleX(float f) {
        super.setTextScaleX(f);
        h();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        h();
    }

    public SqueezedLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        g();
    }
}
