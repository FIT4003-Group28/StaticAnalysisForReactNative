package c.a.a.v.k;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2523a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.v.j.m<PointF, PointF> f2524b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.f f2525c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.b f2526d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2527e;

    public j(String str, c.a.a.v.j.m<PointF, PointF> mVar, c.a.a.v.j.f fVar, c.a.a.v.j.b bVar, boolean z) {
        this.f2523a = str;
        this.f2524b = mVar;
        this.f2525c = fVar;
        this.f2526d = bVar;
        this.f2527e = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.p(gVar, aVar, this);
    }

    public c.a.a.v.j.b a() {
        return this.f2526d;
    }

    public String b() {
        return this.f2523a;
    }

    public c.a.a.v.j.m<PointF, PointF> c() {
        return this.f2524b;
    }

    public c.a.a.v.j.f d() {
        return this.f2525c;
    }

    public boolean e() {
        return this.f2527e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f2524b + ", size=" + this.f2525c + '}';
    }
}
