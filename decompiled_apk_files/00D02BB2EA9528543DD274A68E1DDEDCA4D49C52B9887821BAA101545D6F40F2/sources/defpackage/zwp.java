package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: zwp  reason: default package */
/* loaded from: classes7.dex */
public final class zwp implements cpum {
    private static final cqrp a = cqrp.d(50.0d);
    private final Context b;
    private final ValueAnimator c;
    private final cpum d = cpup.a();
    private final float[] e = new float[3];
    private final int[] f = new int[2];
    private final ArgbEvaluator g = new ArgbEvaluator();
    private final int h;

    public zwp(Context context, int i, ValueAnimator valueAnimator) {
        this.b = context;
        this.h = i;
        this.c = valueAnimator;
    }

    private final void g(float f, float f2, Paint paint, boolean z) {
        float floatValue = ((Float) this.c.getAnimatedValue()).floatValue();
        int color = paint.getColor();
        kc.d(color, this.e);
        float[] fArr = this.e;
        fArr[2] = 1.0f - ((1.0f - fArr[2]) * 0.8f);
        int f3 = kc.f(kc.e(fArr), Color.alpha(color));
        if (floatValue < 0.6d) {
            float f4 = floatValue / 0.6f;
            if (z) {
                f4 = 1.0f - f4;
            }
            float a2 = a.a(this.b);
            float f5 = a2 + a2;
            float f6 = f + f5;
            float f7 = f6 + (((f2 - f5) - f6) * f4);
            this.f[0] = kc.f(true != z ? color : f3, 255);
            int[] iArr = this.f;
            if (true != z) {
                color = f3;
            }
            iArr[1] = kc.f(color, 255);
            paint.setShader(new LinearGradient(0.0f, f7, 0.0f, f7 + a2, this.f, (float[]) null, Shader.TileMode.CLAMP));
            return;
        }
        paint.setColor(((Integer) this.g.evaluate((floatValue - 0.6f) / 0.4f, Integer.valueOf(f3), Integer.valueOf(color))).intValue());
    }

    @Override // defpackage.cpum
    public final void a(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
        int i = this.h - 1;
        if (i == 2) {
            g(f, f2, paint, false);
        } else if (i == 3) {
            g(f, f2, paint, true);
        }
        this.d.a(canvas, f, f2, f3, f4, f5, rectF, paint);
    }

    @Override // defpackage.cpum
    public final void b(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.d.b(canvas, f, f2, f3, f4, paint);
    }

    @Override // defpackage.cpum
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.d.c(canvas, f, f2, f3, f4, paint);
    }

    @Override // defpackage.cpum
    public final void d(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
        this.d.d(canvas, f, f2, f3, f4, f5, rectF, paint);
    }

    @Override // defpackage.cpum
    public final void e(Canvas canvas, float f, float f2, float f3, Paint paint) {
        this.d.e(canvas, f, f2, f3, paint);
    }

    @Override // defpackage.cpum
    public final void f(Canvas canvas, float f, float f2, float f3, Paint paint) {
        this.d.f(canvas, f, f2, f3, paint);
    }
}
