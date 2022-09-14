package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c.a.a.t.c.a;
import c.a.a.v.k.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0064a, k, e {

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.g f2307e;

    /* renamed from: f  reason: collision with root package name */
    protected final c.a.a.v.l.a f2308f;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f2310h;
    private final c.a.a.t.c.a<?, Float> j;
    private final c.a.a.t.c.a<?, Integer> k;
    private final List<c.a.a.t.c.a<?, Float>> l;
    private final c.a.a.t.c.a<?, Float> m;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> n;

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f2303a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f2304b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f2305c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f2306d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f2309g = new ArrayList();
    final Paint i = new c.a.a.t.a(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<n> f2311a;

        /* renamed from: b  reason: collision with root package name */
        private final t f2312b;

        private b(t tVar) {
            this.f2311a = new ArrayList();
            this.f2312b = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c.a.a.g gVar, c.a.a.v.l.a aVar, Paint.Cap cap, Paint.Join join, float f2, c.a.a.v.j.d dVar, c.a.a.v.j.b bVar, List<c.a.a.v.j.b> list, c.a.a.v.j.b bVar2) {
        this.f2307e = gVar;
        this.f2308f = aVar;
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(cap);
        this.i.setStrokeJoin(join);
        this.i.setStrokeMiter(f2);
        this.k = dVar.mo104a();
        this.j = bVar.mo104a();
        this.m = bVar2 == null ? null : bVar2.mo104a();
        this.l = new ArrayList(list.size());
        this.f2310h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).mo104a());
        }
        aVar.a(this.k);
        aVar.a(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aVar.a(this.l.get(i2));
        }
        c.a.a.t.c.a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        c.a.a.t.c.a<?, Float> aVar3 = this.m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    private void a(Canvas canvas, b bVar, Matrix matrix) {
        float f2;
        c.a.a.c.a("StrokeContent#applyTrimPath");
        if (bVar.f2312b == null) {
            c.a.a.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f2304b.reset();
        for (int size = bVar.f2311a.size() - 1; size >= 0; size--) {
            this.f2304b.addPath(((n) bVar.f2311a.get(size)).b(), matrix);
        }
        this.f2303a.setPath(this.f2304b, false);
        float length = this.f2303a.getLength();
        while (this.f2303a.nextContour()) {
            length += this.f2303a.getLength();
        }
        float floatValue = (bVar.f2312b.d().mo102f().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f2312b.e().mo102f().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f2312b.c().mo102f().floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = bVar.f2311a.size() - 1; size2 >= 0; size2--) {
            this.f2305c.set(((n) bVar.f2311a.get(size2)).b());
            this.f2305c.transform(matrix);
            this.f2303a.setPath(this.f2305c, false);
            float length2 = this.f2303a.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    f2 = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f4 = Math.min(f5 / length2, 1.0f);
                    c.a.a.y.h.a(this.f2305c, f2, f4, 0.0f);
                    canvas.drawPath(this.f2305c, this.i);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    f2 = floatValue2 < f3 ? 0.0f : (floatValue2 - f3) / length2;
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    c.a.a.y.h.a(this.f2305c, f2, f4, 0.0f);
                }
                canvas.drawPath(this.f2305c, this.i);
            }
            f3 += length2;
        }
        c.a.a.c.b("StrokeContent#applyTrimPath");
    }

    private void a(Matrix matrix) {
        c.a.a.c.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            c.a.a.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float a2 = c.a.a.y.h.a(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.f2310h[i] = this.l.get(i).mo102f().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f2310h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f2310h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f2310h;
            fArr3[i] = fArr3[i] * a2;
        }
        c.a.a.t.c.a<?, Float> aVar = this.m;
        this.i.setPathEffect(new DashPathEffect(this.f2310h, aVar == null ? 0.0f : aVar.mo102f().floatValue()));
        c.a.a.c.b("StrokeContent#applyDashPattern");
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        this.f2307e.invalidateSelf();
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.a.a.c.a("StrokeContent#draw");
        if (c.a.a.y.h.b(matrix)) {
            c.a.a.c.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(c.a.a.y.g.a((int) ((((i / 255.0f) * ((c.a.a.t.c.e) this.k).i()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((c.a.a.t.c.c) this.j).i() * c.a.a.y.h.a(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            c.a.a.c.b("StrokeContent#draw");
            return;
        }
        a(matrix);
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.n;
        if (aVar != null) {
            this.i.setColorFilter(aVar.mo102f());
        }
        for (int i2 = 0; i2 < this.f2309g.size(); i2++) {
            b bVar = this.f2309g.get(i2);
            if (bVar.f2312b != null) {
                a(canvas, bVar, matrix);
            } else {
                c.a.a.c.a("StrokeContent#buildPath");
                this.f2304b.reset();
                for (int size = bVar.f2311a.size() - 1; size >= 0; size--) {
                    this.f2304b.addPath(((n) bVar.f2311a.get(size)).b(), matrix);
                }
                c.a.a.c.b("StrokeContent#buildPath");
                c.a.a.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f2304b, this.i);
                c.a.a.c.b("StrokeContent#drawPath");
            }
        }
        c.a.a.c.b("StrokeContent#draw");
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        c.a.a.c.a("StrokeContent#getBounds");
        this.f2304b.reset();
        for (int i = 0; i < this.f2309g.size(); i++) {
            b bVar = this.f2309g.get(i);
            for (int i2 = 0; i2 < bVar.f2311a.size(); i2++) {
                this.f2304b.addPath(((n) bVar.f2311a.get(i2)).b(), matrix);
            }
        }
        this.f2304b.computeBounds(this.f2306d, false);
        float i3 = ((c.a.a.t.c.c) this.j).i();
        RectF rectF2 = this.f2306d;
        float f2 = i3 / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f2306d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        c.a.a.c.b("StrokeContent#getBounds");
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a aVar;
        if (t == c.a.a.l.f2282d) {
            aVar = this.k;
        } else if (t != c.a.a.l.o) {
            if (t != c.a.a.l.B) {
                return;
            }
            if (cVar == null) {
                this.n = null;
                return;
            }
            this.n = new c.a.a.t.c.p(cVar);
            this.n.a(this);
            this.f2308f.a(this.n);
            return;
        } else {
            aVar = this.j;
        }
        aVar.a(cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.f() == q.a.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.a(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.f() == q.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f2309g.add(bVar);
                    }
                    bVar = new b(tVar3);
                    tVar3.a(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(tVar);
                }
                bVar.f2311a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f2309g.add(bVar);
        }
    }
}
