package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acrt  reason: default package */
/* loaded from: classes2.dex */
public final class acrt implements cpum {
    public final ValueAnimator a;
    public float b;
    public boolean c;
    private final int d;
    private final int e;
    private final int f;
    private final int[] g;
    private final ArgbEvaluator h;
    private final cpum i = cpup.a();

    public acrt(Resources resources) {
        int color = resources.getColor(R.color.live_busyness_bar);
        this.d = color;
        int color2 = resources.getColor(R.color.live_busyness_accent_top);
        this.f = color2;
        int color3 = resources.getColor(R.color.live_busyness_accent_bottom);
        this.e = color3;
        this.h = new ArgbEvaluator();
        this.g = new int[]{color3, color2, color, color};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.a = ofFloat;
    }

    @Override // defpackage.cpum
    public final void a(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
        if (this.c) {
            float height = rectF.height();
            float f6 = f2 - ((height + height) * this.b);
            paint.setShader(new LinearGradient(0.0f, f6 + (height * 3.0f), 0.0f, f6, this.g, (float[]) null, Shader.TileMode.CLAMP));
        } else {
            float min = Math.min(1.0f, (1.0f - this.b) * 1.5f);
            paint.setShader(new LinearGradient(0.0f, f, 0.0f, f2, ((Integer) this.h.evaluate(min, Integer.valueOf(this.e), Integer.valueOf(this.d))).intValue(), ((Integer) this.h.evaluate(min, Integer.valueOf(this.f), Integer.valueOf(this.d))).intValue(), Shader.TileMode.CLAMP));
        }
        this.i.a(canvas, f, f2, f3, f4, f5, rectF, paint);
    }

    @Override // defpackage.cpum
    public final void b(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // defpackage.cpum
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // defpackage.cpum
    public final void d(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
    }

    @Override // defpackage.cpum
    public final void e(Canvas canvas, float f, float f2, float f3, Paint paint) {
    }

    @Override // defpackage.cpum
    public final void f(Canvas canvas, float f, float f2, float f3, Paint paint) {
    }
}
