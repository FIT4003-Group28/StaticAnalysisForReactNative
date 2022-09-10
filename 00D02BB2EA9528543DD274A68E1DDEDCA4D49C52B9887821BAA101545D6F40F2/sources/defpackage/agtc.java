package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;
/* compiled from: PG */
/* renamed from: agtc  reason: default package */
/* loaded from: classes2.dex */
public final class agtc extends View implements ValueAnimator.AnimatorUpdateListener {
    private final Random a;
    private final Paint b;
    private final ValueAnimator c;
    private final float d;
    private final RectF e;
    private int[] f;
    private int g;

    public agtc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Random();
        this.e = new RectF();
        this.f = new int[0];
        this.g = -1;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(ibm.h().b(context));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c = ofFloat;
        ofFloat.setInterpolator(irf.b);
        ofFloat.addUpdateListener(this);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int min;
        int i = 0;
        if (!this.c.isRunning()) {
            int max = Math.max((getHeight() - getPaddingTop()) - getPaddingBottom(), 0);
            int max2 = Math.max((getWidth() - getPaddingLeft()) - getPaddingRight(), 0);
            int i2 = (int) (max / (this.d * 27.0f));
            this.f = new int[i2];
            this.g = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 < i2 - 1) {
                    this.f[i3] = max2 - this.a.nextInt(max2 / 7);
                } else {
                    this.f[i3] = (max2 / 5) + this.a.nextInt(max2 / 2);
                }
                this.g += this.f[i3];
            }
            this.c.cancel();
            this.c.setDuration((int) ((this.g / (this.d * 450.0f)) * 1000.0f));
            this.c.start();
        }
        int floatValue = (int) (this.g * ((Float) this.c.getAnimatedValue()).floatValue());
        if (floatValue < 0) {
            return;
        }
        boolean d = cjxu.d(this);
        int paddingLeft = !d ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        float f = this.d;
        int i4 = (int) (15.0f * f);
        int i5 = (int) (f * 12.0f);
        while (true) {
            int[] iArr = this.f;
            if (i >= iArr.length || floatValue <= 0) {
                return;
            }
            floatValue -= Math.min(floatValue, iArr[i]);
            if (!d) {
                this.e.set(paddingLeft, paddingTop, min + paddingLeft, paddingTop + i4);
            } else {
                this.e.set(paddingLeft - min, paddingTop, paddingLeft, paddingTop + i4);
            }
            float f2 = i4 / 2.0f;
            canvas.drawRoundRect(this.e, f2, f2, this.b);
            paddingTop += i4 + i5;
            i++;
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.c.cancel();
    }
}
