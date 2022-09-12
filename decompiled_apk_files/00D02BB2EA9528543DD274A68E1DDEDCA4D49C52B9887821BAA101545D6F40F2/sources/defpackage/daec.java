package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: daec  reason: default package */
/* loaded from: classes.dex */
final class daec extends daeg {
    private final daee a;
    private final float b;
    private final float d;

    public daec(daee daeeVar, float f, float f2) {
        this.a = daeeVar;
        this.b = f;
        this.d = f2;
    }

    @Override // defpackage.daeg
    public final void a(Matrix matrix, dadh dadhVar, int i, Canvas canvas) {
        daee daeeVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(daeeVar.b - this.d, daeeVar.a - this.b), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.b, this.d);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        dadh.g[0] = dadhVar.f;
        dadh.g[1] = dadhVar.e;
        dadh.g[2] = dadhVar.d;
        dadhVar.c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, dadh.g, dadh.h, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, dadhVar.c);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        daee daeeVar = this.a;
        return (float) Math.toDegrees(Math.atan((daeeVar.b - this.d) / (daeeVar.a - this.b)));
    }
}
