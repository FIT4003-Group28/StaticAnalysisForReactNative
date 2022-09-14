package c.a.a.v.k;
/* loaded from: classes.dex */
public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2528a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.v.j.b f2529b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.b f2530c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.l f2531d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2532e;

    public k(String str, c.a.a.v.j.b bVar, c.a.a.v.j.b bVar2, c.a.a.v.j.l lVar, boolean z) {
        this.f2528a = str;
        this.f2529b = bVar;
        this.f2530c = bVar2;
        this.f2531d = lVar;
        this.f2532e = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.q(gVar, aVar, this);
    }

    public c.a.a.v.j.b a() {
        return this.f2529b;
    }

    public String b() {
        return this.f2528a;
    }

    public c.a.a.v.j.b c() {
        return this.f2530c;
    }

    public c.a.a.v.j.l d() {
        return this.f2531d;
    }

    public boolean e() {
        return this.f2532e;
    }
}
