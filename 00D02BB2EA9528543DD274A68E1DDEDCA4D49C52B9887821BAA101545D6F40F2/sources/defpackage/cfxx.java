package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cfxx  reason: default package */
/* loaded from: classes4.dex */
public final class cfxx extends AppCompatTextView {
    private static final TimeInterpolator b = new AccelerateDecelerateInterpolator();
    private final Paint c;
    private final ValueAnimator d;
    private final ValueAnimator e;
    private final RectF f;
    private final int g;
    private final int h;
    private final int i;
    private boolean j;
    private int k;

    public cfxx(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(cfxx.class, cqmpVarArr);
    }

    private final void b() {
        if (!this.j) {
            this.d.cancel();
            this.e.setFloatValues(((Float) this.d.getAnimatedValue()).floatValue(), 0.0f);
            this.e.start();
        } else if (this.d.isStarted()) {
        } else {
            this.d.start();
            this.e.end();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.cancel();
        this.e.cancel();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        float floatValue = ((Float) this.d.getAnimatedValue()).floatValue();
        float floatValue2 = this.j ? floatValue : ((Float) this.e.getAnimatedValue()).floatValue();
        this.c.setColor(getCurrentTextColor());
        this.c.setAlpha((int) (paint.getAlpha() * 0.2f * floatValue2));
        int width = getWidth();
        RectF rectF = this.f;
        if (od.s(this) == 1) {
            float f2 = width;
            f = f2 - (floatValue * f2);
        } else {
            f = width * floatValue;
        }
        rectF.right = f;
        RectF rectF2 = this.f;
        float f3 = this.k;
        canvas.drawRoundRect(rectF2, f3, f3, this.c);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.h;
        this.f.bottom = i2 - this.i;
        this.f.left = od.s(this) == 1 ? i : 0.0f;
        if (i2 >= i5) {
            i2 = this.g;
        }
        this.k = i2;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        boolean z = charSequence == null;
        boolean z2 = this.j;
        this.j = z;
        if (z2 != z && od.ak(this)) {
            b();
        }
        super.setText(charSequence, bufferType);
    }

    public cfxx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cfxx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Paint(3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.05f, 1.0f);
        this.d = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.e = ofFloat2;
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f = rectF;
        this.j = true;
        this.k = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.h = (int) TypedValue.applyDimension(2, 20.0f, displayMetrics);
        this.g = (int) TypedValue.applyDimension(2, 2.0f, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(2, 2.5f, displayMetrics);
        this.i = applyDimension;
        rectF.top = applyDimension;
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: cfxv
            private final cfxx a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.invalidate();
            }
        });
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: cfxw
            private final cfxx a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.invalidate();
            }
        });
        ofFloat.setInterpolator(b);
    }
}
