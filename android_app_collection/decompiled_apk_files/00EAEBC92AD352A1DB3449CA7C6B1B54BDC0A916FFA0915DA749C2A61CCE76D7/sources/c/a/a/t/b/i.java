package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class i extends a {
    private final String o;
    private final boolean p;
    private final a.e.d<LinearGradient> q;
    private final a.e.d<RadialGradient> r;
    private final RectF s;
    private final c.a.a.v.k.f t;
    private final int u;
    private final c.a.a.t.c.a<c.a.a.v.k.c, c.a.a.v.k.c> v;
    private final c.a.a.t.c.a<PointF, PointF> w;
    private final c.a.a.t.c.a<PointF, PointF> x;
    private c.a.a.t.c.p y;

    public i(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.e eVar) {
        super(gVar, aVar, eVar.a().a(), eVar.f().a(), eVar.h(), eVar.j(), eVar.l(), eVar.g(), eVar.b());
        this.q = new a.e.d<>();
        this.r = new a.e.d<>();
        this.s = new RectF();
        this.o = eVar.i();
        this.t = eVar.e();
        this.p = eVar.m();
        this.u = (int) (gVar.e().c() / 32.0f);
        this.v = eVar.d().mo104a();
        this.v.a(this);
        aVar.a(this.v);
        this.w = eVar.k().mo104a();
        this.w.a(this);
        aVar.a(this.w);
        this.x = eVar.c().mo104a();
        this.x.a(this);
        aVar.a(this.x);
    }

    private int[] a(int[] iArr) {
        c.a.a.t.c.p pVar = this.y;
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
        int round = Math.round(this.w.e() * this.u);
        int round2 = Math.round(this.x.e() * this.u);
        int round3 = Math.round(this.v.e() * this.u);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient c() {
        long b2 = b();
        LinearGradient c2 = this.q.c(b2);
        if (c2 != null) {
            return c2;
        }
        PointF mo102f = this.w.mo102f();
        PointF mo102f2 = this.x.mo102f();
        c.a.a.v.k.c mo102f3 = this.v.mo102f();
        int[] a2 = a(mo102f3.a());
        float[] b3 = mo102f3.b();
        RectF rectF = this.s;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + mo102f.x);
        RectF rectF2 = this.s;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + mo102f.y);
        RectF rectF3 = this.s;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + mo102f2.x);
        RectF rectF4 = this.s;
        LinearGradient linearGradient = new LinearGradient(width, height, width2, (int) (rectF4.top + (rectF4.height() / 2.0f) + mo102f2.y), a2, b3, Shader.TileMode.CLAMP);
        this.q.c(b2, linearGradient);
        return linearGradient;
    }

    private RadialGradient d() {
        long b2 = b();
        RadialGradient c2 = this.r.c(b2);
        if (c2 != null) {
            return c2;
        }
        PointF mo102f = this.w.mo102f();
        PointF mo102f2 = this.x.mo102f();
        c.a.a.v.k.c mo102f3 = this.v.mo102f();
        int[] a2 = a(mo102f3.a());
        float[] b3 = mo102f3.b();
        RectF rectF = this.s;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + mo102f.x);
        RectF rectF2 = this.s;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + mo102f.y);
        RectF rectF3 = this.s;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + mo102f2.x);
        RectF rectF4 = this.s;
        RadialGradient radialGradient = new RadialGradient(width, height, (float) Math.hypot(width2 - width, ((int) ((rectF4.top + (rectF4.height() / 2.0f)) + mo102f2.y)) - height), a2, b3, Shader.TileMode.CLAMP);
        this.r.c(b2, radialGradient);
        return radialGradient;
    }

    @Override // c.a.a.t.b.a, c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.p) {
            return;
        }
        a(this.s, matrix, false);
        this.i.setShader(this.t == c.a.a.v.k.f.LINEAR ? c() : d());
        super.a(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.a.t.b.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        super.a((i) t, (c.a.a.z.c<i>) cVar);
        if (t == c.a.a.l.C) {
            if (cVar != null) {
                this.y = new c.a.a.t.c.p(cVar);
                this.y.a(this);
                this.f2308f.a(this.y);
                return;
            }
            c.a.a.t.c.p pVar = this.y;
            if (pVar != null) {
                this.f2308f.b(pVar);
            }
            this.y = null;
        }
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.o;
    }
}
