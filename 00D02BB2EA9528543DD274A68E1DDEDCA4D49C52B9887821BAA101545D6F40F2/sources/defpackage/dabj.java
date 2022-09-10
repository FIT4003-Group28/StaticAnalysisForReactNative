package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: dabj  reason: default package */
/* loaded from: classes5.dex */
public final class dabj extends daby {
    private final dabr b;
    private final dabi c;
    private int d = 1;
    private float e;
    private float f;
    private float g;

    public dabj(dabr dabrVar) {
        this.b = dabrVar;
        this.c = dabrVar.a;
    }

    private final int f() {
        dabr dabrVar = this.b;
        int i = dabrVar.b;
        int i2 = this.c.a;
        int i3 = dabrVar.c;
        return i + i + i2 + i3 + i3;
    }

    private final void g(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        float f4 = true != z ? 1.0f : -1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        canvas.drawRect((this.g - f5) + f2, Math.min(0.0f, this.d * f6), (this.g + f5) - f2, Math.max(0.0f, f6 * this.d), paint);
        canvas.translate((this.g - f5) + f2, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * this.d, true, paint);
        canvas.translate(f - (f2 + f2), 0.0f);
        canvas.drawArc(rectF, 0.0f, f4 * 90.0f * this.d, true, paint);
        canvas.restore();
    }

    @Override // defpackage.daby
    public final int a() {
        return f();
    }

    @Override // defpackage.daby
    public final int b() {
        return f();
    }

    @Override // defpackage.daby
    public final void c(Canvas canvas, float f) {
        dabr dabrVar;
        dabr dabrVar2 = this.b;
        int i = dabrVar2.b + (this.c.a / 2) + dabrVar2.c;
        float f2 = i;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        int i2 = -i;
        canvas.clipRect(i2, i2, i, i);
        this.d = 1 != this.b.d ? 1 : -1;
        dabi dabiVar = this.c;
        this.e = dabiVar.a * f;
        this.f = dabiVar.b * f;
        this.g = dabrVar.b;
        if ((!this.a.d() || this.b.e != 2) && (!this.a.e() || this.b.f != 1)) {
            if ((!this.a.d() || this.b.e != 1) && (!this.a.e() || this.b.f != 2)) {
                return;
            }
            this.g -= ((1.0f - f) * this.c.a) / 2.0f;
            return;
        }
        this.g += ((1.0f - f) * this.c.a) / 2.0f;
    }

    @Override // defpackage.daby
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.e);
        float f3 = this.d;
        float f4 = f * 360.0f * f3;
        if (f2 < f) {
            f2 += 1.0f;
        }
        float f5 = (f2 - f) * 360.0f * f3;
        float f6 = this.g;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.f <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f8 = this.f;
        float f9 = -f8;
        RectF rectF = new RectF(f9, f9, f8, f8);
        g(canvas, paint, this.e, this.f, f4, true, rectF);
        g(canvas, paint, this.e, this.f, f4 + f5, false, rectF);
    }

    @Override // defpackage.daby
    public final void e(Canvas canvas, Paint paint) {
        int c = czxb.c(this.c.d, this.a.i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(c);
        paint.setStrokeWidth(this.e);
        float f = this.g;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
