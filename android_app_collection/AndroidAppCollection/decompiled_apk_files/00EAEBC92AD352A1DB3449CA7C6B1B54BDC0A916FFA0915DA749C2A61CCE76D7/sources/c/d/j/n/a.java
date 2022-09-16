package c.d.j.n;
/* loaded from: classes.dex */
public class a implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3394a;

    /* loaded from: classes.dex */
    private static class b extends n<c.d.j.k.d, c.d.j.k.d> {
        private b(k<c.d.j.k.d> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (dVar == null) {
                c().a(null, i);
                return;
            }
            if (!c.d.j.k.d.d(dVar)) {
                dVar.C();
            }
            c().a(dVar, i);
        }
    }

    public a(j0<c.d.j.k.d> j0Var) {
        this.f3394a = j0Var;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        this.f3394a.a(new b(kVar), k0Var);
    }
}
