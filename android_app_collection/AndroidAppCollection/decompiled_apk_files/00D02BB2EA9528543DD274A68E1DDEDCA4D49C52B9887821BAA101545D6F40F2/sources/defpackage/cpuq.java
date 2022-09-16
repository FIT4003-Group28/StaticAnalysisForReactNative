package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpuq  reason: default package */
/* loaded from: classes5.dex */
public final class cpuq implements cpum {
    private final RectF a = new RectF();
    private final cpus b;

    public cpuq(cpus cpusVar) {
        cpwl.a(cpusVar);
        this.b = cpusVar;
    }

    private static boolean g(Paint paint) {
        return paint.getStyle() == Paint.Style.STROKE || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }

    private static boolean h(Paint paint) {
        return paint.getStyle() == Paint.Style.FILL || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }

    private static void i(Paint paint, float f, float f2) {
        paint.setStrokeWidth(Math.min(paint.getStrokeWidth(), Math.abs(f - f2)));
    }

    private static float j(Paint paint) {
        if (g(paint)) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static float k(float f, float f2, float f3) {
        float abs = Math.abs(f - f2);
        if (abs < f3) {
            float f4 = f3 - abs;
            return f3 - ((float) Math.sqrt((f3 * f3) - (f4 * f4)));
        }
        return 0.0f;
    }

    @Override // defpackage.cpum
    public final void a(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
        this.b.a(paint);
        i(paint, f, f2);
        float j = j(paint);
        canvas.save();
        float f6 = f4 + f3;
        canvas.clipRect(f3, Math.min(f, f2), f6, Math.max(f, f2));
        this.a.set(rectF);
        RectF rectF2 = this.a;
        rectF2.left += j;
        rectF2.right -= j;
        if (f >= f2) {
            rectF2.top += j;
        } else {
            rectF2.bottom -= j;
        }
        canvas.drawRoundRect(this.a, f5, f5, paint);
        if (g(paint)) {
            float copySign = f2 + Math.copySign(j, f - f2);
            float k = k(copySign, f > f2 ? this.a.top : this.a.bottom, f5);
            canvas.drawLine(f3 + k, copySign, f6 - k, copySign, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.cpum
    public final void b(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.b.a(paint);
        i(paint, f, f2);
        float j = j(paint);
        if (h(paint)) {
            canvas.drawRect(f3 + j, Math.min(f, f2) + j, (f3 + f4) - j, Math.max(f, f2) - j, paint);
            return;
        }
        float copySign = Math.copySign(j, f - f2);
        float f5 = f3 + j;
        canvas.drawLine(f5, f, f5, f2, paint);
        float f6 = f2 + copySign;
        float f7 = f3 + f4;
        canvas.drawLine(f3, f6, f7, f6, paint);
        float f8 = f7 - j;
        canvas.drawLine(f8, f2, f8, f, paint);
    }

    @Override // defpackage.cpum
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.b.a(paint);
        i(paint, f, f2);
        float j = j(paint);
        if (h(paint)) {
            canvas.drawRect(Math.min(f, f2) + j, f3 + j, Math.max(f, f2) - j, (f3 + f4) - j, paint);
            return;
        }
        float copySign = Math.copySign(j, f - f2);
        float f5 = f3 + j;
        canvas.drawLine(f, f5, f2, f5, paint);
        float f6 = f2 + copySign;
        float f7 = f3 + f4;
        canvas.drawLine(f6, f3, f6, f7, paint);
        float f8 = f7 - j;
        canvas.drawLine(f2, f8, f, f8, paint);
    }

    @Override // defpackage.cpum
    public final void d(Canvas canvas, float f, float f2, float f3, float f4, float f5, RectF rectF, Paint paint) {
        this.b.a(paint);
        i(paint, f, f2);
        float j = j(paint);
        canvas.save();
        float f6 = f4 + f3;
        canvas.clipRect(Math.min(f, f2), f3, Math.max(f, f2), f6);
        this.a.set(rectF);
        RectF rectF2 = this.a;
        rectF2.top += j;
        rectF2.bottom -= j;
        if (f >= f2) {
            rectF2.left += j;
        } else {
            rectF2.right -= j;
        }
        canvas.drawRoundRect(this.a, f5, f5, paint);
        if (g(paint)) {
            float copySign = f2 + Math.copySign(j, f - f2);
            float k = k(copySign, f > f2 ? this.a.left : this.a.right, f5);
            canvas.drawLine(copySign, f3 + k, copySign, f6 - k, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.cpum
    public final void e(Canvas canvas, float f, float f2, float f3, Paint paint) {
        canvas.drawLine(f2, f, f2 + f3, f, paint);
    }

    @Override // defpackage.cpum
    public final void f(Canvas canvas, float f, float f2, float f3, Paint paint) {
        canvas.drawLine(f, f2, f, f2 + f3, paint);
    }
}
