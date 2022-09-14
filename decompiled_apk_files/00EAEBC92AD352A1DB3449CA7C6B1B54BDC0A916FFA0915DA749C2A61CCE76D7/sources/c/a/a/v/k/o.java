package c.a.a.v.k;

import c.a.a.t.b.r;
/* loaded from: classes.dex */
public class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2545a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2546b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.h f2547c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2548d;

    public o(String str, int i, c.a.a.v.j.h hVar, boolean z) {
        this.f2545a = str;
        this.f2546b = i;
        this.f2547c = hVar;
        this.f2548d = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new r(gVar, aVar, this);
    }

    public String a() {
        return this.f2545a;
    }

    public c.a.a.v.j.h b() {
        return this.f2547c;
    }

    public boolean c() {
        return this.f2548d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f2545a + ", index=" + this.f2546b + '}';
    }
}
