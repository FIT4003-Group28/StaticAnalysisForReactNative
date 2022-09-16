package c.a.a.t.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c.a.a.t.c.a;
import c.a.a.v.k.q;
import java.util.List;
/* loaded from: classes.dex */
public class p implements a.InterfaceC0064a, k, n {

    /* renamed from: c  reason: collision with root package name */
    private final String f2363c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2364d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.g f2365e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.t.c.a<?, PointF> f2366f;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.t.c.a<?, PointF> f2367g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2368h;
    private boolean j;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2361a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f2362b = new RectF();
    private b i = new b();

    public p(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.j jVar) {
        this.f2363c = jVar.b();
        this.f2364d = jVar.e();
        this.f2365e = gVar;
        this.f2366f = jVar.c().mo104a();
        this.f2367g = jVar.d().mo104a();
        this.f2368h = jVar.a().mo104a();
        aVar.a(this.f2366f);
        aVar.a(this.f2367g);
        aVar.a(this.f2368h);
        this.f2366f.a(this);
        this.f2367g.a(this);
        this.f2368h.a(this);
    }

    private void c() {
        this.j = false;
        this.f2365e.invalidateSelf();
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        c();
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a aVar;
        if (t == c.a.a.l.f2286h) {
            aVar = this.f2367g;
        } else if (t == c.a.a.l.j) {
            aVar = this.f2366f;
        } else if (t != c.a.a.l.i) {
            return;
        } else {
            aVar = this.f2368h;
        }
        aVar.a(cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f() == q.a.SIMULTANEOUSLY) {
                    this.i.a(tVar);
                    tVar.a(this);
                }
            }
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        if (this.j) {
            return this.f2361a;
        }
        this.f2361a.reset();
        if (!this.f2364d) {
            PointF mo102f = this.f2367g.mo102f();
            float f2 = mo102f.x / 2.0f;
            float f3 = mo102f.y / 2.0f;
            c.a.a.t.c.a<?, Float> aVar = this.f2368h;
            float i = aVar == null ? 0.0f : ((c.a.a.t.c.c) aVar).i();
            float min = Math.min(f2, f3);
            if (i > min) {
                i = min;
            }
            PointF mo102f2 = this.f2366f.mo102f();
            this.f2361a.moveTo(mo102f2.x + f2, (mo102f2.y - f3) + i);
            this.f2361a.lineTo(mo102f2.x + f2, (mo102f2.y + f3) - i);
            int i2 = (i > 0.0f ? 1 : (i == 0.0f ? 0 : -1));
            if (i2 > 0) {
                RectF rectF = this.f2362b;
                float f4 = mo102f2.x;
                float f5 = i * 2.0f;
                float f6 = mo102f2.y;
                rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
                this.f2361a.arcTo(this.f2362b, 0.0f, 90.0f, false);
            }
            this.f2361a.lineTo((mo102f2.x - f2) + i, mo102f2.y + f3);
            if (i2 > 0) {
                RectF rectF2 = this.f2362b;
                float f7 = mo102f2.x;
                float f8 = mo102f2.y;
                float f9 = i * 2.0f;
                rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
                this.f2361a.arcTo(this.f2362b, 90.0f, 90.0f, false);
            }
            this.f2361a.lineTo(mo102f2.x - f2, (mo102f2.y - f3) + i);
            if (i2 > 0) {
                RectF rectF3 = this.f2362b;
                float f10 = mo102f2.x;
                float f11 = mo102f2.y;
                float f12 = i * 2.0f;
                rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
                this.f2361a.arcTo(this.f2362b, 180.0f, 90.0f, false);
            }
            this.f2361a.lineTo((mo102f2.x + f2) - i, mo102f2.y - f3);
            if (i2 > 0) {
                RectF rectF4 = this.f2362b;
                float f13 = mo102f2.x;
                float f14 = i * 2.0f;
                float f15 = mo102f2.y;
                rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
                this.f2361a.arcTo(this.f2362b, 270.0f, 90.0f, false);
            }
            this.f2361a.close();
            this.i.a(this.f2361a);
        }
        this.j = true;
        return this.f2361a;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2363c;
    }
}
