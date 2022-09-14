package c.e.a.c.a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f4707a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f4708b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f4709c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f4710d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f4711e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4712f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f4713g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f4714h = new ArrayList();

    /* loaded from: classes.dex */
    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f4715b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f4716c;

        a(m mVar, List list, Matrix matrix) {
            this.f4715b = list;
            this.f4716c = matrix;
        }

        @Override // c.e.a.c.a0.m.g
        public void a(Matrix matrix, c.e.a.c.z.a aVar, int i, Canvas canvas) {
            for (g gVar : this.f4715b) {
                gVar.a(this.f4716c, aVar, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f4717b;

        public b(d dVar) {
            this.f4717b = dVar;
        }

        @Override // c.e.a.c.a0.m.g
        public void a(Matrix matrix, c.e.a.c.z.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f4717b.b(), this.f4717b.f(), this.f4717b.c(), this.f4717b.a()), i, this.f4717b.d(), this.f4717b.e());
        }
    }

    /* loaded from: classes.dex */
    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f4718b;

        /* renamed from: c  reason: collision with root package name */
        private final float f4719c;

        /* renamed from: d  reason: collision with root package name */
        private final float f4720d;

        public c(e eVar, float f2, float f3) {
            this.f4718b = eVar;
            this.f4719c = f2;
            this.f4720d = f3;
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.f4718b.f4729c - this.f4720d) / (this.f4718b.f4728b - this.f4719c)));
        }

        @Override // c.e.a.c.a0.m.g
        public void a(Matrix matrix, c.e.a.c.z.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f4718b.f4729c - this.f4720d, this.f4718b.f4728b - this.f4719c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4719c, this.f4720d);
            matrix2.preRotate(a());
            aVar.a(canvas, matrix2, rectF, i);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f4721h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4722b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f4723c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f4724d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f4725e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4726f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f4727g;

        public d(float f2, float f3, float f4, float f5) {
            b(f2);
            f(f3);
            c(f4);
            a(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float a() {
            return this.f4725e;
        }

        private void a(float f2) {
            this.f4725e = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float b() {
            return this.f4722b;
        }

        private void b(float f2) {
            this.f4722b = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float c() {
            return this.f4724d;
        }

        private void c(float f2) {
            this.f4724d = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float d() {
            return this.f4726f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(float f2) {
            this.f4726f = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float e() {
            return this.f4727g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(float f2) {
            this.f4727g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float f() {
            return this.f4723c;
        }

        private void f(float f2) {
            this.f4723c = f2;
        }

        @Override // c.e.a.c.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4730a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4721h.set(b(), f(), c(), a());
            path.arcTo(f4721h, d(), e(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f4728b;

        /* renamed from: c  reason: collision with root package name */
        private float f4729c;

        @Override // c.e.a.c.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4730a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4728b, this.f4729c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f4730a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f4731a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, c.e.a.c.z.a aVar, int i, Canvas canvas);

        public final void a(c.e.a.c.z.a aVar, int i, Canvas canvas) {
            a(f4731a, aVar, i, canvas);
        }
    }

    public m() {
        b(0.0f, 0.0f);
    }

    private void a(float f2) {
        if (e() == f2) {
            return;
        }
        float e2 = ((f2 - e()) + 360.0f) % 360.0f;
        if (e2 > 180.0f) {
            return;
        }
        d dVar = new d(a(), b(), a(), b());
        dVar.d(e());
        dVar.e(e2);
        this.f4714h.add(new b(dVar));
        b(f2);
    }

    private void a(g gVar, float f2, float f3) {
        a(f2);
        this.f4714h.add(gVar);
        b(f3);
    }

    private void b(float f2) {
        this.f4711e = f2;
    }

    private void c(float f2) {
        this.f4712f = f2;
    }

    private void d(float f2) {
        this.f4709c = f2;
    }

    private float e() {
        return this.f4711e;
    }

    private void e(float f2) {
        this.f4710d = f2;
    }

    private float f() {
        return this.f4712f;
    }

    private void f(float f2) {
        this.f4707a = f2;
    }

    private void g(float f2) {
        this.f4708b = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f4709c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(Matrix matrix) {
        a(f());
        return new a(this, new ArrayList(this.f4714h), matrix);
    }

    public void a(float f2, float f3) {
        e eVar = new e();
        eVar.f4728b = f2;
        eVar.f4729c = f3;
        this.f4713g.add(eVar);
        c cVar = new c(eVar, a(), b());
        a(cVar, cVar.a() + 270.0f, cVar.a() + 270.0f);
        d(f2);
        e(f3);
    }

    public void a(float f2, float f3, float f4, float f5) {
        f(f2);
        g(f3);
        d(f2);
        e(f3);
        b(f4);
        c((f4 + f5) % 360.0f);
        this.f4713g.clear();
        this.f4714h.clear();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.d(f6);
        dVar.e(f7);
        this.f4713g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        a(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        d(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        e(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.f4713g.size();
        for (int i = 0; i < size; i++) {
            this.f4713g.get(i).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f4710d;
    }

    public void b(float f2, float f3) {
        a(f2, f3, 270.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f4707a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f4708b;
    }
}
