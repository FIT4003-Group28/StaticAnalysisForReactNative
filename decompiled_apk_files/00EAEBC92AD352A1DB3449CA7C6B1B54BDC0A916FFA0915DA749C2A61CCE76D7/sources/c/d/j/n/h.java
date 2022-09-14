package c.d.j.n;

import c.d.j.o.c;
import java.util.Map;
/* loaded from: classes.dex */
public class h implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> f3446a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.f f3447b;

    /* renamed from: c  reason: collision with root package name */
    private final j0<c.d.d.h.a<c.d.j.k.b>> f3448c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.d.b.a.d f3449c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, c.d.b.a.d dVar, boolean z) {
            super(kVar);
            this.f3449c = dVar;
            this.f3450d = z;
        }

        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            c.d.d.h.a<c.d.j.k.b> aVar2;
            boolean c2;
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean a2 = b.a(i);
                c.d.d.h.a<c.d.j.k.b> aVar3 = null;
                if (aVar == null) {
                    if (a2) {
                        c().a(null, i);
                    }
                    if (!c2) {
                        return;
                    }
                    return;
                }
                if (!aVar.b().e() && !b.b(i, 8)) {
                    if (!a2 && (aVar2 = h.this.f3446a.get(this.f3449c)) != null) {
                        c.d.j.k.g c3 = aVar.b().c();
                        c.d.j.k.g c4 = aVar2.b().c();
                        if (c4.a() || c4.c() >= c3.c()) {
                            c().a(aVar2, i);
                            c.d.d.h.a.b(aVar2);
                            if (!c.d.j.p.b.c()) {
                                return;
                            }
                            c.d.j.p.b.a();
                            return;
                        }
                        c.d.d.h.a.b(aVar2);
                    }
                    if (this.f3450d) {
                        aVar3 = h.this.f3446a.a(this.f3449c, aVar);
                    }
                    if (a2) {
                        c().a(1.0f);
                    }
                    k<c.d.d.h.a<c.d.j.k.b>> c5 = c();
                    if (aVar3 != null) {
                        aVar = aVar3;
                    }
                    c5.a(aVar, i);
                    c.d.d.h.a.b(aVar3);
                    if (!c.d.j.p.b.c()) {
                        return;
                    }
                    c.d.j.p.b.a();
                    return;
                }
                c().a(aVar, i);
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

    public h(c.d.j.d.p<c.d.b.a.d, c.d.j.k.b> pVar, c.d.j.d.f fVar, j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        this.f3446a = pVar;
        this.f3447b = fVar;
        this.f3448c = j0Var;
    }

    protected k<c.d.d.h.a<c.d.j.k.b>> a(k<c.d.d.h.a<c.d.j.k.b>> kVar, c.d.b.a.d dVar, boolean z) {
        return new a(kVar, dVar, z);
    }

    protected String a() {
        return "BitmapMemoryCacheProducer";
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        boolean c2;
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            m0 e2 = k0Var.e();
            String a2 = k0Var.a();
            e2.a(a2, a());
            c.d.b.a.d a3 = this.f3447b.a(k0Var.f(), k0Var.b());
            c.d.d.h.a<c.d.j.k.b> aVar = this.f3446a.get(a3);
            Map<String, String> map = null;
            if (aVar != null) {
                boolean a4 = aVar.b().c().a();
                if (a4) {
                    e2.a(a2, a(), e2.a(a2) ? c.d.d.d.f.a("cached_value_found", "true") : null);
                    e2.a(a2, a(), true);
                    kVar.a(1.0f);
                }
                b.a(a4);
                kVar.a(aVar, a4 ? 1 : 0);
                aVar.close();
                if (a4) {
                    if (!c2) {
                        return;
                    }
                    return;
                }
            }
            if (k0Var.h().a() >= c.b.BITMAP_MEMORY_CACHE.a()) {
                e2.a(a2, a(), e2.a(a2) ? c.d.d.d.f.a("cached_value_found", "false") : null);
                e2.a(a2, a(), false);
                kVar.a(null, 1);
                if (!c.d.j.p.b.c()) {
                    return;
                }
                c.d.j.p.b.a();
                return;
            }
            k<c.d.d.h.a<c.d.j.k.b>> a5 = a(kVar, a3, k0Var.f().s());
            String a6 = a();
            if (e2.a(a2)) {
                map = c.d.d.d.f.a("cached_value_found", "false");
            }
            e2.a(a2, a6, map);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("mInputProducer.produceResult");
            }
            this.f3448c.a(a5, k0Var);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
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
