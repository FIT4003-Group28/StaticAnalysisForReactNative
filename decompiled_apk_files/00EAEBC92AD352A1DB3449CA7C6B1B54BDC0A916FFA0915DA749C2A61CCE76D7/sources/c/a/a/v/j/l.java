package c.a.a.v.j;

import android.graphics.PointF;
import c.a.a.t.c.o;
/* loaded from: classes.dex */
public class l implements c.a.a.t.b.m, c.a.a.v.k.b {

    /* renamed from: a  reason: collision with root package name */
    private final e f2459a;

    /* renamed from: b  reason: collision with root package name */
    private final m<PointF, PointF> f2460b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2461c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2462d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2463e;

    /* renamed from: f  reason: collision with root package name */
    private final b f2464f;

    /* renamed from: g  reason: collision with root package name */
    private final b f2465g;

    /* renamed from: h  reason: collision with root package name */
    private final b f2466h;
    private final b i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public l(e eVar, m<PointF, PointF> mVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f2459a = eVar;
        this.f2460b = mVar;
        this.f2461c = gVar;
        this.f2462d = bVar;
        this.f2463e = dVar;
        this.f2466h = bVar2;
        this.i = bVar3;
        this.f2464f = bVar4;
        this.f2465g = bVar5;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return null;
    }

    public o a() {
        return new o(this);
    }

    public e b() {
        return this.f2459a;
    }

    public b c() {
        return this.i;
    }

    public d d() {
        return this.f2463e;
    }

    public m<PointF, PointF> e() {
        return this.f2460b;
    }

    public b f() {
        return this.f2462d;
    }

    public g g() {
        return this.f2461c;
    }

    public b h() {
        return this.f2464f;
    }

    public b i() {
        return this.f2465g;
    }

    public b j() {
        return this.f2466h;
    }
}
