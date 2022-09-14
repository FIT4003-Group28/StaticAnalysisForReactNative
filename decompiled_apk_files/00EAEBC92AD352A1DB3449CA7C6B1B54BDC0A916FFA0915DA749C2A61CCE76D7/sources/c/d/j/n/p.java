package c.d.j.n;

import c.d.j.o.c;
/* loaded from: classes.dex */
public class p implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.e f3528a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.e f3529b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.d.f f3530c;

    /* renamed from: d  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3531d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final k0 f3532c;

        /* renamed from: d  reason: collision with root package name */
        private final c.d.j.d.e f3533d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.j.d.e f3534e;

        /* renamed from: f  reason: collision with root package name */
        private final c.d.j.d.f f3535f;

        private b(k<c.d.j.k.d> kVar, k0 k0Var, c.d.j.d.e eVar, c.d.j.d.e eVar2, c.d.j.d.f fVar) {
            super(kVar);
            this.f3532c = k0Var;
            this.f3533d = eVar;
            this.f3534e = eVar2;
            this.f3535f = fVar;
        }

        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (!c.d.j.n.b.b(i) && dVar != null && !c.d.j.n.b.a(i, 10) && dVar.g() != c.d.i.c.f3152b) {
                c.d.j.o.c f2 = this.f3532c.f();
                (f2.b() == c.a.SMALL ? this.f3534e : this.f3533d).a(this.f3535f.c(f2, this.f3532c.b()), dVar);
            }
            c().a(dVar, i);
        }
    }

    public p(c.d.j.d.e eVar, c.d.j.d.e eVar2, c.d.j.d.f fVar, j0<c.d.j.k.d> j0Var) {
        this.f3528a = eVar;
        this.f3529b = eVar2;
        this.f3530c = fVar;
        this.f3531d = j0Var;
    }

    private void b(k<c.d.j.k.d> kVar, k0 k0Var) {
        if (k0Var.h().a() >= c.b.DISK_CACHE.a()) {
            kVar.a(null, 1);
            return;
        }
        if (k0Var.f().r()) {
            kVar = new b(kVar, k0Var, this.f3528a, this.f3529b, this.f3530c);
        }
        this.f3531d.a(kVar, k0Var);
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        b(kVar, k0Var);
    }
}
