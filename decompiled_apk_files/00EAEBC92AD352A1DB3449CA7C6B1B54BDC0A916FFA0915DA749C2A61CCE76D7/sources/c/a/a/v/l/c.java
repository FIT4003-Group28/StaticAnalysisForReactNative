package c.a.a.v.l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c.a.a.l;
import c.a.a.t.c.p;
/* loaded from: classes.dex */
public class c extends a {
    private final Paint w;
    private final Rect x;
    private final Rect y;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c.a.a.g gVar, d dVar) {
        super(gVar, dVar);
        this.w = new c.a.a.t.a(3);
        this.x = new Rect();
        this.y = new Rect();
    }

    private Bitmap e() {
        return this.n.a(this.o.k());
    }

    @Override // c.a.a.v.l.a, c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        Bitmap e2 = e();
        if (e2 != null) {
            rectF.set(0.0f, 0.0f, e2.getWidth() * c.a.a.y.h.a(), e2.getHeight() * c.a.a.y.h.a());
            this.m.mapRect(rectF);
        }
    }

    @Override // c.a.a.v.l.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        super.a((c) t, (c.a.a.z.c<c>) cVar);
        if (t == l.B) {
            this.z = cVar == null ? null : new p(cVar);
        }
    }

    @Override // c.a.a.v.l.a
    public void b(Canvas canvas, Matrix matrix, int i) {
        Bitmap e2 = e();
        if (e2 == null || e2.isRecycled()) {
            return;
        }
        float a2 = c.a.a.y.h.a();
        this.w.setAlpha(i);
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.z;
        if (aVar != null) {
            this.w.setColorFilter(aVar.mo102f());
        }
        canvas.save();
        canvas.concat(matrix);
        this.x.set(0, 0, e2.getWidth(), e2.getHeight());
        this.y.set(0, 0, (int) (e2.getWidth() * a2), (int) (e2.getHeight() * a2));
        canvas.drawBitmap(e2, this.x, this.y, this.w);
        canvas.restore();
    }
}
