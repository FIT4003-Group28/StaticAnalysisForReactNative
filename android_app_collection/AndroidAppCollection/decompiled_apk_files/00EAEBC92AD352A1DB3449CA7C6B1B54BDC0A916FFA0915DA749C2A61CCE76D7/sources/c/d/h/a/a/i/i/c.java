package c.d.h.a.a.i.i;

import c.d.h.a.a.i.h;
/* loaded from: classes.dex */
public class c extends c.d.j.l.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.time.b f2955a;

    /* renamed from: b  reason: collision with root package name */
    private final h f2956b;

    public c(com.facebook.common.time.b bVar, h hVar) {
        this.f2955a = bVar;
        this.f2956b = hVar;
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, Object obj, String str, boolean z) {
        this.f2956b.g(this.f2955a.now());
        this.f2956b.a(cVar);
        this.f2956b.a(obj);
        this.f2956b.b(str);
        this.f2956b.a(z);
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, Throwable th, boolean z) {
        this.f2956b.f(this.f2955a.now());
        this.f2956b.a(cVar);
        this.f2956b.b(str);
        this.f2956b.a(z);
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, boolean z) {
        this.f2956b.f(this.f2955a.now());
        this.f2956b.a(cVar);
        this.f2956b.b(str);
        this.f2956b.a(z);
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void b(String str) {
        this.f2956b.f(this.f2955a.now());
        this.f2956b.b(str);
    }
}
