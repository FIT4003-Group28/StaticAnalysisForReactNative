package c.a.a.v.k;

import android.graphics.Path;
/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f2475a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f2476b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.c f2477c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.d f2478d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.j.f f2479e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.v.j.f f2480f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2481g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2482h;

    public d(String str, f fVar, Path.FillType fillType, c.a.a.v.j.c cVar, c.a.a.v.j.d dVar, c.a.a.v.j.f fVar2, c.a.a.v.j.f fVar3, c.a.a.v.j.b bVar, c.a.a.v.j.b bVar2, boolean z) {
        this.f2475a = fVar;
        this.f2476b = fillType;
        this.f2477c = cVar;
        this.f2478d = dVar;
        this.f2479e = fVar2;
        this.f2480f = fVar3;
        this.f2481g = str;
        this.f2482h = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.h(gVar, aVar, this);
    }

    public c.a.a.v.j.f a() {
        return this.f2480f;
    }

    public Path.FillType b() {
        return this.f2476b;
    }

    public c.a.a.v.j.c c() {
        return this.f2477c;
    }

    public f d() {
        return this.f2475a;
    }

    public String e() {
        return this.f2481g;
    }

    public c.a.a.v.j.d f() {
        return this.f2478d;
    }

    public c.a.a.v.j.f g() {
        return this.f2479e;
    }

    public boolean h() {
        return this.f2482h;
    }
}
