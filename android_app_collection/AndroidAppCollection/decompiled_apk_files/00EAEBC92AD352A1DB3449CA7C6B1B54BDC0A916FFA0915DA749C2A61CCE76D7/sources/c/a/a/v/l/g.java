package c.a.a.v.l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c.a.a.l;
import c.a.a.t.c.p;
/* loaded from: classes.dex */
public class g extends a {
    private final d A;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> B;
    private final RectF w;
    private final Paint x;
    private final float[] y;
    private final Path z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c.a.a.g gVar, d dVar) {
        super(gVar, dVar);
        this.w = new RectF();
        this.x = new c.a.a.t.a();
        this.y = new float[8];
        this.z = new Path();
        this.A = dVar;
        this.x.setAlpha(0);
        this.x.setStyle(Paint.Style.FILL);
        this.x.setColor(dVar.m());
    }

    @Override // c.a.a.v.l.a, c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.w.set(0.0f, 0.0f, this.A.o(), this.A.n());
        this.m.mapRect(this.w);
        rectF.set(this.w);
    }

    @Override // c.a.a.v.l.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        super.a((g) t, (c.a.a.z.c<g>) cVar);
        if (t == l.B) {
            this.B = cVar == null ? null : new p(cVar);
        }
    }

    @Override // c.a.a.v.l.a
    public void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.A.m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.u.c() == null ? 100 : this.u.c().mo102f().intValue())) / 100.0f) * 255.0f);
        this.x.setAlpha(intValue);
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.B;
        if (aVar != null) {
            this.x.setColorFilter(aVar.mo102f());
        }
        if (intValue <= 0) {
            return;
        }
        float[] fArr = this.y;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.A.o();
        float[] fArr2 = this.y;
        fArr2[3] = 0.0f;
        fArr2[4] = this.A.o();
        this.y[5] = this.A.n();
        float[] fArr3 = this.y;
        fArr3[6] = 0.0f;
        fArr3[7] = this.A.n();
        matrix.mapPoints(this.y);
        this.z.reset();
        Path path = this.z;
        float[] fArr4 = this.y;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.z;
        float[] fArr5 = this.y;
        path2.lineTo(fArr5[2], fArr5[3]);
        Path path3 = this.z;
        float[] fArr6 = this.y;
        path3.lineTo(fArr6[4], fArr6[5]);
        Path path4 = this.z;
        float[] fArr7 = this.y;
        path4.lineTo(fArr7[6], fArr7[7]);
        Path path5 = this.z;
        float[] fArr8 = this.y;
        path5.lineTo(fArr8[0], fArr8[1]);
        this.z.close();
        canvas.drawPath(this.z, this.x);
    }
}
