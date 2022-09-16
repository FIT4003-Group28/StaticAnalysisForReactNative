package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: alng  reason: default package */
/* loaded from: classes.dex */
final class alng extends alnl {
    private final alni a;

    public alng(alni alniVar) {
        this.a = alniVar;
    }

    @Override // defpackage.alnl
    public final void a(Matrix matrix, almp almpVar, int i, Canvas canvas) {
        alni alniVar = this.a;
        float f = alniVar.e;
        float f2 = alniVar.f;
        RectF rectF = new RectF(alniVar.a, alniVar.b, alniVar.c, alniVar.d);
        Path path = almpVar.k;
        if (f2 < 0.0f) {
            almp.c[0] = 0;
            almp.c[1] = almpVar.j;
            almp.c[2] = almpVar.i;
            almp.c[3] = almpVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            almp.c[0] = 0;
            almp.c[1] = almpVar.h;
            almp.c[2] = almpVar.i;
            almp.c[3] = almpVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        almp.d[1] = f4;
        almp.d[2] = f4 + ((1.0f - f4) / 2.0f);
        almpVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, almp.c, almp.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (f2 >= 0.0f) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, almpVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, almpVar.f);
        canvas.restore();
    }
}
