package c.d.j.n;

import c.d.j.o.c;
import java.util.Map;
/* loaded from: classes.dex */
public class r implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.p<c.d.b.a.d, c.d.d.g.g> f3541a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.f f3542b;

    /* renamed from: c  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3543c;

    /* loaded from: classes.dex */
    private static class a extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final c.d.j.d.p<c.d.b.a.d, c.d.d.g.g> f3544c;

        /* renamed from: d  reason: collision with root package name */
        private final c.d.b.a.d f3545d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f3546e;

        public a(k<c.d.j.k.d> kVar, c.d.j.d.p<c.d.b.a.d, c.d.d.g.g> pVar, c.d.b.a.d dVar, boolean z) {
            super(kVar);
            this.f3544c = pVar;
            this.f3545d = dVar;
            this.f3546e = z;
        }

        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            boolean c2;
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!b.b(i) && dVar != null && !b.a(i, 10) && dVar.g() != c.d.i.c.f3152b) {
                    c.d.d.h.a<c.d.d.g.g> b2 = dVar.b();
                    if (b2 != null) {
                        c.d.d.h.a<c.d.d.g.g> aVar = null;
                        if (this.f3546e) {
                            aVar = this.f3544c.a(this.f3545d, b2);
                        }
                        c.d.d.h.a.b(b2);
                        if (aVar != null) {
                            c.d.j.k.d dVar2 = new c.d.j.k.d(aVar);
                            dVar2.a(dVar);
                            c.d.d.h.a.b(aVar);
                            c().a(1.0f);
                            c().a(dVar2, i);
                            c.d.j.k.d.c(dVar2);
                            if (!c2) {
                                return;
                            }
                            return;
                        }
                    }
                    c().a(dVar, i);
                    if (!c.d.j.p.b.c()) {
                        return;
                    }
                    c.d.j.p.b.a();
                    return;
                }
                c().a(dVar, i);
                if (!c.d.j.p.b.c()) {
                    return;
                }
                c.d.j.p.b.a();
            } finally {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
            }
        }
    }

    public r(c.d.j.d.p<c.d.b.a.d, c.d.d.g.g> pVar, c.d.j.d.f fVar, j0<c.d.j.k.d> j0Var) {
        this.f3541a = pVar;
        this.f3542b = fVar;
        this.f3543c = j0Var;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            String a2 = k0Var.a();
            m0 e2 = k0Var.e();
            e2.a(a2, "EncodedMemoryCacheProducer");
            c.d.b.a.d c2 = this.f3542b.c(k0Var.f(), k0Var.b());
            c.d.d.h.a<c.d.d.g.g> aVar = this.f3541a.get(c2);
            Map<String, String> map = null;
            if (aVar != null) {
                c.d.j.k.d dVar = new c.d.j.k.d(aVar);
                if (e2.a(a2)) {
                    map = c.d.d.d.f.a("cached_value_found", "true");
                }
                e2.a(a2, "EncodedMemoryCacheProducer", map);
                e2.a(a2, "EncodedMemoryCacheProducer", true);
                kVar.a(1.0f);
                kVar.a(dVar, 1);
                c.d.j.k.d.c(dVar);
                c.d.d.h.a.b(aVar);
            } else if (k0Var.h().a() >= c.b.ENCODED_MEMORY_CACHE.a()) {
                e2.a(a2, "EncodedMemoryCacheProducer", e2.a(a2) ? c.d.d.d.f.a("cached_value_found", "false") : null);
                e2.a(a2, "EncodedMemoryCacheProducer", false);
                kVar.a(null, 1);
                c.d.d.h.a.b(aVar);
                if (!c.d.j.p.b.c()) {
                    return;
                }
                c.d.j.p.b.a();
            } else {
                a aVar2 = new a(kVar, this.f3541a, c2, k0Var.f().s());
                if (e2.a(a2)) {
                    map = c.d.d.d.f.a("cached_value_found", "false");
                }
                e2.a(a2, "EncodedMemoryCacheProducer", map);
                this.f3543c.a(aVar2, k0Var);
                c.d.d.h.a.b(aVar);
                if (!c.d.j.p.b.c()) {
                    return;
                }
                c.d.j.p.b.a();
            }
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
