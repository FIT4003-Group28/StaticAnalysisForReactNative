package c.d.j.n;
/* loaded from: classes.dex */
public class j implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3479a;

    /* renamed from: b  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3480b;

    /* loaded from: classes.dex */
    private class b extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private k0 f3481c;

        private b(k<c.d.j.k.d> kVar, k0 k0Var) {
            super(kVar);
            this.f3481c = k0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            c.d.j.o.c f2 = this.f3481c.f();
            boolean a2 = c.d.j.n.b.a(i);
            boolean a3 = x0.a(dVar, f2.l());
            if (dVar != null && (a3 || f2.d())) {
                if (!a2 || !a3) {
                    i = c.d.j.n.b.c(i, 1);
                }
                c().a(dVar, i);
            }
            if (!a2 || a3) {
                return;
            }
            c.d.j.k.d.c(dVar);
            j.this.f3480b.a(c(), this.f3481c);
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b(Throwable th) {
            j.this.f3480b.a(c(), this.f3481c);
        }
    }

    public j(j0<c.d.j.k.d> j0Var, j0<c.d.j.k.d> j0Var2) {
        this.f3479a = j0Var;
        this.f3480b = j0Var2;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        this.f3479a.a(new b(kVar, k0Var), k0Var);
    }
}
