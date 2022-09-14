package c.d.j.n;

import java.util.Map;
/* loaded from: classes.dex */
public class h0 implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> f3452a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.f f3453b;

    /* renamed from: c  reason: collision with root package name */
    private final j0<c.d.d.h.a<c.d.j.k.b>> f3454c;

    /* loaded from: classes.dex */
    public static class a extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: c  reason: collision with root package name */
        private final c.d.b.a.d f3455c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3456d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> f3457e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f3458f;

        public a(k<c.d.d.h.a<c.d.j.k.b>> kVar, c.d.b.a.d dVar, boolean z, c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> pVar, boolean z2) {
            super(kVar);
            this.f3455c = dVar;
            this.f3456d = z;
            this.f3457e = pVar;
            this.f3458f = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            c.d.d.h.a<c.d.j.k.b> aVar2 = null;
            if (aVar == null) {
                if (!b.a(i)) {
                    return;
                }
                c().a(null, i);
            } else if (b.b(i) && !this.f3456d) {
            } else {
                if (this.f3458f) {
                    aVar2 = this.f3457e.a(this.f3455c, aVar);
                }
                try {
                    c().a(1.0f);
                    k<c.d.d.h.a<c.d.j.k.b>> c2 = c();
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    c2.a(aVar, i);
                } finally {
                    c.d.d.h.a.b(aVar2);
                }
            }
        }
    }

    public h0(c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> pVar, c.d.j.d.f fVar, j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        this.f3452a = pVar;
        this.f3453b = fVar;
        this.f3454c = j0Var;
    }

    protected String a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        m0 e2 = k0Var.e();
        String a2 = k0Var.a();
        c.d.j.o.c f2 = k0Var.f();
        Object b2 = k0Var.b();
        c.d.j.o.e f3 = f2.f();
        if (f3 == null || f3.a() == null) {
            this.f3454c.a(kVar, k0Var);
            return;
        }
        e2.a(a2, a());
        c.d.b.a.d b3 = this.f3453b.b(f2, b2);
        c.d.d.h.a<c.d.j.k.b> aVar = this.f3452a.get(b3);
        Map<String, String> map = null;
        if (aVar == null) {
            a aVar2 = new a(kVar, b3, f3 instanceof c.d.j.o.f, this.f3452a, k0Var.f().s());
            String a3 = a();
            if (e2.a(a2)) {
                map = c.d.d.d.f.a("cached_value_found", "false");
            }
            e2.a(a2, a3, map);
            this.f3454c.a(aVar2, k0Var);
            return;
        }
        String a4 = a();
        if (e2.a(a2)) {
            map = c.d.d.d.f.a("cached_value_found", "true");
        }
        e2.a(a2, a4, map);
        e2.a(a2, "PostprocessedBitmapMemoryCacheProducer", true);
        kVar.a(1.0f);
        kVar.a(aVar, 1);
        aVar.close();
    }
}
