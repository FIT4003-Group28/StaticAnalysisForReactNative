package c.a.a.t.b;

import android.graphics.Path;
import android.graphics.PointF;
import c.a.a.t.c.a;
import c.a.a.v.k.q;
import java.util.List;
/* loaded from: classes.dex */
public class f implements n, a.InterfaceC0064a, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f2323b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.g f2324c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.t.c.a<?, PointF> f2325d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.t.c.a<?, PointF> f2326e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.v.k.a f2327f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2329h;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2322a = new Path();

    /* renamed from: g  reason: collision with root package name */
    private b f2328g = new b();

    public f(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.a aVar2) {
        this.f2323b = aVar2.a();
        this.f2324c = gVar;
        this.f2325d = aVar2.c().mo104a();
        this.f2326e = aVar2.b().mo104a();
        this.f2327f = aVar2;
        aVar.a(this.f2325d);
        aVar.a(this.f2326e);
        this.f2325d.a(this);
        this.f2326e.a(this);
    }

    private void c() {
        this.f2329h = false;
        this.f2324c.invalidateSelf();
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
        c.a.a.t.c.a<?, PointF> aVar;
        if (t == c.a.a.l.f2285g) {
            aVar = this.f2325d;
        } else if (t != c.a.a.l.j) {
            return;
        } else {
            aVar = this.f2326e;
        }
        aVar.a((c.a.a.z.c<PointF>) cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f() == q.a.SIMULTANEOUSLY) {
                    this.f2328g.a(tVar);
                    tVar.a(this);
                }
            }
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        if (this.f2329h) {
            return this.f2322a;
        }
        this.f2322a.reset();
        if (!this.f2327f.d()) {
            PointF mo102f = this.f2325d.mo102f();
            float f2 = mo102f.x / 2.0f;
            float f3 = mo102f.y / 2.0f;
            float f4 = f2 * 0.55228f;
            float f5 = 0.55228f * f3;
            this.f2322a.reset();
            if (this.f2327f.e()) {
                float f6 = -f3;
                this.f2322a.moveTo(0.0f, f6);
                float f7 = 0.0f - f4;
                float f8 = -f2;
                float f9 = 0.0f - f5;
                this.f2322a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
                float f10 = f5 + 0.0f;
                this.f2322a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
                float f11 = f4 + 0.0f;
                this.f2322a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
                this.f2322a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
            } else {
                float f12 = -f3;
                this.f2322a.moveTo(0.0f, f12);
                float f13 = f4 + 0.0f;
                float f14 = 0.0f - f5;
                this.f2322a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
                float f15 = f5 + 0.0f;
                this.f2322a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
                float f16 = 0.0f - f4;
                float f17 = -f2;
                this.f2322a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
                this.f2322a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
            }
            PointF mo102f2 = this.f2326e.mo102f();
            this.f2322a.offset(mo102f2.x, mo102f2.y);
            this.f2322a.close();
            this.f2328g.a(this.f2322a);
        }
        this.f2329h = true;
        return this.f2322a;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2323b;
    }
}
