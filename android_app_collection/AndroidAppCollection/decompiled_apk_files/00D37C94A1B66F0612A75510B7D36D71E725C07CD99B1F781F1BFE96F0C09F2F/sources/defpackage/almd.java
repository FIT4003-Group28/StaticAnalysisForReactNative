package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: almd  reason: default package */
/* loaded from: classes.dex */
public final class almd {
    final allr a;
    protected almc b;
    private int c = 1;
    private float d;
    private float e;
    private float f;

    public almd(allr allrVar) {
        this.a = allrVar;
    }

    private final void e(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    public final int a() {
        allr allrVar = this.a;
        int i = allrVar.g;
        int i2 = allrVar.h;
        return i + i2 + i2;
    }

    public final void b(Canvas canvas, float f) {
        int i;
        allr allrVar = this.a;
        float f2 = (allrVar.g / 2.0f) + allrVar.h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        allr allrVar2 = this.a;
        this.c = allrVar2.i == 0 ? 1 : -1;
        this.d = allrVar2.a * f;
        this.e = allrVar2.b * f;
        this.f = (allrVar2.g - i) / 2.0f;
        if ((!this.b.g() || this.a.e != 2) && (!this.b.f() || this.a.f != 1)) {
            if ((!this.b.g() || this.a.e != 1) && (!this.b.f() || this.a.f != 2)) {
                return;
            }
            this.f -= ((1.0f - f) * this.a.a) / 2.0f;
            return;
        }
        this.f += ((1.0f - f) * this.a.a) / 2.0f;
    }

    public final void c(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        e(canvas, paint, this.d, this.e, f4);
        e(canvas, paint, this.d, this.e, f4 + f5);
    }

    public final void d(Canvas canvas, Paint paint) {
        int x = amxp.x(this.a.d, this.b.i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(x);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
