package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: alnh  reason: default package */
/* loaded from: classes.dex */
final class alnh extends alnl {
    private final alnj a;
    private final float b;
    private final float d;

    public alnh(alnj alnjVar, float f, float f2) {
        this.a = alnjVar;
        this.b = f;
        this.d = f2;
    }

    @Override // defpackage.alnl
    public final void a(Matrix matrix, almp almpVar, int i, Canvas canvas) {
        alnj alnjVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(alnjVar.b - this.d, alnjVar.a - this.b), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.b, this.d);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        almp.a[0] = almpVar.j;
        almp.a[1] = almpVar.i;
        almp.a[2] = almpVar.h;
        almpVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, almp.a, almp.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, almpVar.g);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        alnj alnjVar = this.a;
        return (float) Math.toDegrees(Math.atan((alnjVar.b - this.d) / (alnjVar.a - this.b)));
    }
}
