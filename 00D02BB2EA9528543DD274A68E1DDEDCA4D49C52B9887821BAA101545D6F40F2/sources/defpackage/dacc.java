package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: dacc  reason: default package */
/* loaded from: classes5.dex */
public final class dacc extends daby {
    private final daco b;
    private final dabi c;
    private float d = 300.0f;
    private float e;
    private float f;

    public dacc(daco dacoVar) {
        this.b = dacoVar;
        this.c = dacoVar.a;
    }

    private static void f(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        canvas.save();
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f4 = ((-f) / 2.0f) + f2;
        float f5 = (f / 2.0f) - f2;
        canvas.drawRect(-f2, f4, 0.0f, f5, paint);
        canvas.save();
        canvas.translate(0.0f, f4);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f5);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }

    @Override // defpackage.daby
    public final int a() {
        return -1;
    }

    @Override // defpackage.daby
    public final int b() {
        return this.c.a;
    }

    @Override // defpackage.daby
    public final void c(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.d = clipBounds.width();
        float f2 = this.c.a;
        canvas.translate(clipBounds.width() / 2.0f, (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - this.c.a) / 2.0f));
        if (this.b.e) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.a.d() && this.b.c == 1) || (this.a.e() && this.b.d == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.a.d() || this.a.e()) {
            canvas.translate(0.0f, (this.c.a * ((-1.0f) + f)) / 2.0f);
        }
        float f3 = this.d;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        dabi dabiVar = this.c;
        this.e = dabiVar.a * f;
        this.f = dabiVar.b * f;
    }

    @Override // defpackage.daby
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.d;
        float f4 = this.f;
        float f5 = ((-f3) / 2.0f) + f4;
        float f6 = f3 - (f4 + f4);
        float f7 = f5 + (f * f6);
        float f8 = f5 + (f6 * f2);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f9 = this.e;
        canvas.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint);
        float f10 = this.f;
        float f11 = -f10;
        RectF rectF = new RectF(f11, f11, f10, f10);
        f(canvas, paint, this.e, this.f, f7, true, rectF);
        f(canvas, paint, this.e, this.f, f8, false, rectF);
    }

    @Override // defpackage.daby
    public final void e(Canvas canvas, Paint paint) {
        int c = czxb.c(this.c.d, this.a.i);
        float f = ((-this.d) / 2.0f) + this.f;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(c);
        float f3 = this.e;
        canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.f;
        float f5 = -f4;
        RectF rectF = new RectF(f5, f5, f4, f4);
        f(canvas, paint, this.e, this.f, f, true, rectF);
        f(canvas, paint, this.e, this.f, f2, false, rectF);
    }
}
