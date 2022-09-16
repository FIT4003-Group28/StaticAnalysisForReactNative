package c.a.a.v.k;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2511a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2512b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.b f2513c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.m<PointF, PointF> f2514d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.j.b f2515e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.v.j.b f2516f;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.v.j.b f2517g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.v.j.b f2518h;
    private final c.a.a.v.j.b i;
    private final boolean j;

    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f2522b;

        a(int i) {
            this.f2522b = i;
        }

        public static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.f2522b == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, c.a.a.v.j.b bVar, c.a.a.v.j.m<PointF, PointF> mVar, c.a.a.v.j.b bVar2, c.a.a.v.j.b bVar3, c.a.a.v.j.b bVar4, c.a.a.v.j.b bVar5, c.a.a.v.j.b bVar6, boolean z) {
        this.f2511a = str;
        this.f2512b = aVar;
        this.f2513c = bVar;
        this.f2514d = mVar;
        this.f2515e = bVar2;
        this.f2516f = bVar3;
        this.f2517g = bVar4;
        this.f2518h = bVar5;
        this.i = bVar6;
        this.j = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.o(gVar, aVar, this);
    }

    public c.a.a.v.j.b a() {
        return this.f2516f;
    }

    public c.a.a.v.j.b b() {
        return this.f2518h;
    }

    public String c() {
        return this.f2511a;
    }

    public c.a.a.v.j.b d() {
        return this.f2517g;
    }

    public c.a.a.v.j.b e() {
        return this.i;
    }

    public c.a.a.v.j.b f() {
        return this.f2513c;
    }

    public c.a.a.v.j.m<PointF, PointF> g() {
        return this.f2514d;
    }

    public c.a.a.v.j.b h() {
        return this.f2515e;
    }

    public a i() {
        return this.f2512b;
    }

    public boolean j() {
        return this.j;
    }
}
