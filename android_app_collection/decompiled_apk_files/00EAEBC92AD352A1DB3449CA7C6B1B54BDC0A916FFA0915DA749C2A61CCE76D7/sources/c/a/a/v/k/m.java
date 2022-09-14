package c.a.a.v.k;

import android.graphics.Path;
/* loaded from: classes.dex */
public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2536a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f2537b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2538c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.a f2539d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.j.d f2540e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2541f;

    public m(String str, boolean z, Path.FillType fillType, c.a.a.v.j.a aVar, c.a.a.v.j.d dVar, boolean z2) {
        this.f2538c = str;
        this.f2536a = z;
        this.f2537b = fillType;
        this.f2539d = aVar;
        this.f2540e = dVar;
        this.f2541f = z2;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.g(gVar, aVar, this);
    }

    public c.a.a.v.j.a a() {
        return this.f2539d;
    }

    public Path.FillType b() {
        return this.f2537b;
    }

    public String c() {
        return this.f2538c;
    }

    public c.a.a.v.j.d d() {
        return this.f2540e;
    }

    public boolean e() {
        return this.f2541f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f2536a + '}';
    }
}
