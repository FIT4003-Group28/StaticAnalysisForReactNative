package c.d.j.g;

import c.d.j.n.j0;
import c.d.j.n.p0;
/* loaded from: classes.dex */
public class c<T> extends a<c.d.d.h.a<T>> {
    private c(j0<c.d.d.h.a<T>> j0Var, p0 p0Var, c.d.j.l.c cVar) {
        super(j0Var, p0Var, cVar);
    }

    public static <T> c.d.e.c<c.d.d.h.a<T>> a(j0<c.d.d.h.a<T>> j0Var, p0 p0Var, c.d.j.l.c cVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar2 = new c(j0Var, p0Var, cVar);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return cVar2;
    }

    protected void a(c.d.d.h.a<T> aVar) {
        c.d.d.h.a.b(aVar);
    }

    protected void a(c.d.d.h.a<T> aVar, int i) {
        super.a((c<T>) c.d.d.h.a.a((c.d.d.h.a) aVar), i);
    }

    @Override // c.d.e.a
    protected /* bridge */ /* synthetic */ void a(Object obj) {
        a((c.d.d.h.a) ((c.d.d.h.a) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.j.g.a
    public /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((c.d.d.h.a) ((c.d.d.h.a) obj), i);
    }

    @Override // c.d.e.a, c.d.e.c
    /* renamed from: b */
    public c.d.d.h.a<T> mo140b() {
        return c.d.d.h.a.a((c.d.d.h.a) super.mo140b());
    }
}
