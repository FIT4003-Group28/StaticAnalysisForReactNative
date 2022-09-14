package c.e.a.c.a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f4695a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f4696b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f4697c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f4698d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final m f4699e = new m();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f4700f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private final float[] f4701g = new float[2];

    /* loaded from: classes.dex */
    public interface a {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f4702a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f4703b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f4704c;

        /* renamed from: d  reason: collision with root package name */
        public final a f4705d;

        /* renamed from: e  reason: collision with root package name */
        public final float f4706e;

        b(k kVar, float f2, RectF rectF, a aVar, Path path) {
            this.f4705d = aVar;
            this.f4702a = kVar;
            this.f4706e = f2;
            this.f4704c = rectF;
            this.f4703b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.f4695a[i] = new m();
            this.f4696b[i] = new Matrix();
            this.f4697c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private float a(RectF rectF, int i) {
        float centerX;
        float f2;
        float[] fArr = this.f4700f;
        m[] mVarArr = this.f4695a;
        fArr[0] = mVarArr[i].f4709c;
        fArr[1] = mVarArr[i].f4710d;
        this.f4696b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f2 = this.f4700f[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.f4700f[1];
        }
        return Math.abs(centerX - f2);
    }

    private c a(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.l() : kVar.j() : kVar.c() : kVar.e();
    }

    private void a(int i, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        if (i == 1) {
            f2 = rectF.right;
        } else if (i != 2) {
            f2 = i != 3 ? rectF.right : rectF.left;
            f3 = rectF.top;
            pointF.set(f2, f3);
        } else {
            f2 = rectF.left;
        }
        f3 = rectF.bottom;
        pointF.set(f2, f3);
    }

    private void a(b bVar, int i) {
        this.f4700f[0] = this.f4695a[i].c();
        this.f4700f[1] = this.f4695a[i].d();
        this.f4696b[i].mapPoints(this.f4700f);
        Path path = bVar.f4703b;
        float[] fArr = this.f4700f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f4695a[i].a(this.f4696b[i], bVar.f4703b);
        a aVar = bVar.f4705d;
        if (aVar != null) {
            aVar.b(this.f4695a[i], this.f4696b[i], i);
        }
    }

    private d b(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.k() : kVar.i() : kVar.b() : kVar.d();
    }

    private void b(int i) {
        this.f4700f[0] = this.f4695a[i].a();
        this.f4700f[1] = this.f4695a[i].b();
        this.f4696b[i].mapPoints(this.f4700f);
        float a2 = a(i);
        this.f4697c[i].reset();
        Matrix matrix = this.f4697c[i];
        float[] fArr = this.f4700f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f4697c[i].preRotate(a2);
    }

    private void b(b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f4700f[0] = this.f4695a[i].a();
        this.f4700f[1] = this.f4695a[i].b();
        this.f4696b[i].mapPoints(this.f4700f);
        this.f4701g[0] = this.f4695a[i2].c();
        this.f4701g[1] = this.f4695a[i2].d();
        this.f4696b[i2].mapPoints(this.f4701g);
        float[] fArr = this.f4700f;
        float f2 = fArr[0];
        float[] fArr2 = this.f4701g;
        float max = Math.max(((float) Math.hypot(f2 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float a2 = a(bVar.f4704c, i);
        this.f4699e.b(0.0f, 0.0f);
        c(i, bVar.f4702a).a(max, a2, bVar.f4706e, this.f4699e);
        this.f4699e.a(this.f4697c[i], bVar.f4703b);
        a aVar = bVar.f4705d;
        if (aVar != null) {
            aVar.a(this.f4699e, this.f4697c[i], i);
        }
    }

    private f c(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.g() : kVar.h() : kVar.f() : kVar.a();
    }

    private void c(b bVar, int i) {
        b(i, bVar.f4702a).a(this.f4695a[i], 90.0f, bVar.f4706e, bVar.f4704c, a(i, bVar.f4702a));
        float a2 = a(i);
        this.f4696b[i].reset();
        a(i, bVar.f4704c, this.f4698d);
        Matrix matrix = this.f4696b[i];
        PointF pointF = this.f4698d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f4696b[i].preRotate(a2);
    }

    public void a(k kVar, float f2, RectF rectF, Path path) {
        a(kVar, f2, rectF, null, path);
    }

    public void a(k kVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f2, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            c(bVar, i);
            b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            a(bVar, i2);
            b(bVar, i2);
        }
        path.close();
    }
}
