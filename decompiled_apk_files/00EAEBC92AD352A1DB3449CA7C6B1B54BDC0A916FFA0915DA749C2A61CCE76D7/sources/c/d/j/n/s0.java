package c.d.j.n;

import java.util.Map;
/* loaded from: classes.dex */
public class s0<T> implements j0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<T> f3553a;

    /* renamed from: b  reason: collision with root package name */
    private final t0 f3554b;

    /* loaded from: classes.dex */
    class a extends q0<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m0 f3555g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f3556h;
        final /* synthetic */ k i;
        final /* synthetic */ k0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, m0 m0Var, String str, String str2, m0 m0Var2, String str3, k kVar2, k0 k0Var) {
            super(kVar, m0Var, str, str2);
            this.f3555g = m0Var2;
            this.f3556h = str3;
            this.i = kVar2;
            this.j = k0Var;
        }

        @Override // c.d.d.b.e
        protected void a(T t) {
        }

        @Override // c.d.d.b.e
        /* renamed from: b */
        protected T mo147b() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        public void b(T t) {
            this.f3555g.a(this.f3556h, "BackgroundThreadHandoffProducer", (Map<String, String>) null);
            s0.this.f3553a.a(this.i, this.j);
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f3557a;

        b(q0 q0Var) {
            this.f3557a = q0Var;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3557a.a();
            s0.this.f3554b.b(this.f3557a);
        }
    }

    public s0(j0<T> j0Var, t0 t0Var) {
        c.d.d.d.i.a(j0Var);
        this.f3553a = j0Var;
        this.f3554b = t0Var;
    }

    @Override // c.d.j.n.j0
    public void a(k<T> kVar, k0 k0Var) {
        m0 e2 = k0Var.e();
        String a2 = k0Var.a();
        a aVar = new a(kVar, e2, "BackgroundThreadHandoffProducer", a2, e2, a2, kVar, k0Var);
        k0Var.a(new b(aVar));
        this.f3554b.a(aVar);
    }
}
