package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c.a.a.t.c.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h implements e, a.InterfaceC0064a, k {

    /* renamed from: a  reason: collision with root package name */
    private final String f2338a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2339b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.l.a f2340c;

    /* renamed from: d  reason: collision with root package name */
    private final a.e.d<LinearGradient> f2341d = new a.e.d<>();

    /* renamed from: e  reason: collision with root package name */
    private final a.e.d<RadialGradient> f2342e = new a.e.d<>();

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f2343f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    private final Path f2344g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final Paint f2345h = new c.a.a.t.a(1);
    private final RectF i = new RectF();
    private final List<n> j = new ArrayList();
    private final c.a.a.v.k.f k;
    private final c.a.a.t.c.a<c.a.a.v.k.c, c.a.a.v.k.c> l;
    private final c.a.a.t.c.a<Integer, Integer> m;
    private final c.a.a.t.c.a<PointF, PointF> n;
    private final c.a.a.t.c.a<PointF, PointF> o;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> p;
    private c.a.a.t.c.p q;
    private final c.a.a.g r;
    private final int s;

    public h(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.d dVar) {
        this.f2340c = aVar;
        this.f2338a = dVar.e();
        this.f2339b = dVar.h();
        this.r = gVar;
        this.k = dVar.d();
        this.f2344g.setFillType(dVar.b());
        this.s = (int) (gVar.e().c() / 32.0f);
        this.l = dVar.c().mo104a();
        this.l.a(this);
        aVar.a(this.l);
        this.m = dVar.f().mo104a();
        this.m.a(this);
        aVar.a(this.m);
        this.n = dVar.g().mo104a();
        this.n.a(this);
        aVar.a(this.n);
        this.o = dVar.a().mo104a();
        this.o.a(this);
        aVar.a(this.o);
    }

    private int[] a(int[] iArr) {
        c.a.a.t.c.p pVar = this.q;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo102f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int b() {
        int round = Math.round(this.n.e() * this.s);
        int round2 = Math.round(this.o.e() * this.s);
        int round3 = Math.round(this.l.e() * this.s);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient c() {
        long b2 = b();
        LinearGradient c2 = this.f2341d.c(b2);
        if (c2 != null) {
            return c2;
        }
        PointF mo102f = this.n.mo102f();
        PointF mo102f2 = this.o.mo102f();
        c.a.a.v.k.c mo102f3 = this.l.mo102f();
        LinearGradient linearGradient = new LinearGradient(mo102f.x, mo102f.y, mo102f2.x, mo102f2.y, a(mo102f3.a()), mo102f3.b(), Shader.TileMode.CLAMP);
        this.f2341d.c(b2, linearGradient);
        return linearGradient;
    }

    private RadialGradient d() {
        long b2 = b();
        RadialGradient c2 = this.f2342e.c(b2);
        if (c2 != null) {
            return c2;
        }
        PointF mo102f = this.n.mo102f();
        PointF mo102f2 = this.o.mo102f();
        c.a.a.v.k.c mo102f3 = this.l.mo102f();
        int[] a2 = a(mo102f3.a());
        float[] b3 = mo102f3.b();
        float f2 = mo102f.x;
        float f3 = mo102f.y;
        float hypot = (float) Math.hypot(mo102f2.x - f2, mo102f2.y - f3);
        RadialGradient radialGradient = new RadialGradient(f2, f3, hypot <= 0.0f ? 0.001f : hypot, a2, b3, Shader.TileMode.CLAMP);
        this.f2342e.c(b2, radialGradient);
        return radialGradient;
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        this.r.invalidateSelf();
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.f2339b) {
            return;
        }
        c.a.a.c.a("GradientFillContent#draw");
        this.f2344g.reset();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.f2344g.addPath(this.j.get(i2).b(), matrix);
        }
        this.f2344g.computeBounds(this.i, false);
        Shader c2 = this.k == c.a.a.v.k.f.LINEAR ? c() : d();
        this.f2343f.set(matrix);
        c2.setLocalMatrix(this.f2343f);
        this.f2345h.setShader(c2);
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.p;
        if (aVar != null) {
            this.f2345h.setColorFilter(aVar.mo102f());
        }
        this.f2345h.setAlpha(c.a.a.y.g.a((int) ((((i / 255.0f) * this.m.mo102f().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f2344g, this.f2345h);
        c.a.a.c.b("GradientFillContent#draw");
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f2344g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.f2344g.addPath(this.j.get(i).b(), matrix);
        }
        this.f2344g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.v.l.a aVar;
        c.a.a.t.c.a<?, ?> aVar2;
        if (t == c.a.a.l.f2282d) {
            this.m.a((c.a.a.z.c<Integer>) cVar);
            return;
        }
        if (t == c.a.a.l.B) {
            if (cVar == null) {
                this.p = null;
                return;
            }
            this.p = new c.a.a.t.c.p(cVar);
            this.p.a(this);
            aVar = this.f2340c;
            aVar2 = this.p;
        } else if (t != c.a.a.l.C) {
            return;
        } else {
            if (cVar == null) {
                c.a.a.t.c.p pVar = this.q;
                if (pVar != null) {
                    this.f2340c.b(pVar);
                }
                this.q = null;
                return;
            }
            this.q = new c.a.a.t.c.p(cVar);
            this.q.a(this);
            aVar = this.f2340c;
            aVar2 = this.q;
        }
        aVar.a(aVar2);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof n) {
                this.j.add((n) cVar);
            }
        }
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2338a;
    }
}
