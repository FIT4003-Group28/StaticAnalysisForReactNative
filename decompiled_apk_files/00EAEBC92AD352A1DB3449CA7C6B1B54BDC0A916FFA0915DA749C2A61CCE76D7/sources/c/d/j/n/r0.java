package c.d.j.n;
/* loaded from: classes.dex */
public class r0<T> implements j0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<T> f3547a;

    /* loaded from: classes.dex */
    class a extends n<T, Void> {
        a(r0 r0Var, k kVar) {
            super(kVar);
        }

        @Override // c.d.j.n.b
        protected void b(T t, int i) {
            if (b.a(i)) {
                c().a(null, i);
            }
        }
    }

    public r0(j0<T> j0Var) {
        this.f3547a = j0Var;
    }

    @Override // c.d.j.n.j0
    public void a(k<Void> kVar, k0 k0Var) {
        this.f3547a.a(new a(this, kVar), k0Var);
    }
}
