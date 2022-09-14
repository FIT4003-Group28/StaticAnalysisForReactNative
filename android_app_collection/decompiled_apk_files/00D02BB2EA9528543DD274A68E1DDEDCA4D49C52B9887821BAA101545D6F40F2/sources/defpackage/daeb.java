package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: daeb  reason: default package */
/* loaded from: classes.dex */
final class daeb extends daeg {
    private final daed a;

    public daeb(daed daedVar) {
        this.a = daedVar;
    }

    @Override // defpackage.daeg
    public final void a(Matrix matrix, dadh dadhVar, int i, Canvas canvas) {
        daed daedVar = this.a;
        float f = daedVar.e;
        float f2 = daedVar.f;
        RectF rectF = new RectF(daedVar.a, daedVar.b, daedVar.c, daedVar.d);
        Path path = dadhVar.k;
        if (f2 < 0.0f) {
            dadh.i[0] = 0;
            dadh.i[1] = dadhVar.f;
            dadh.i[2] = dadhVar.e;
            dadh.i[3] = dadhVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            dadh.i[0] = 0;
            dadh.i[1] = dadhVar.d;
            dadh.i[2] = dadhVar.e;
            dadh.i[3] = dadhVar.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        dadh.j[1] = f4;
        dadh.j[2] = f4 + ((1.0f - f4) / 2.0f);
        dadhVar.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, dadh.i, dadh.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (f2 >= 0.0f) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, dadhVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, dadhVar.b);
        canvas.restore();
    }
}
