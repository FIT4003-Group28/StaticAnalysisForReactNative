package c.d.j.n;

import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class z implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3626a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.h f3627b;

    /* loaded from: classes.dex */
    class a extends q0<c.d.j.k.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.d.j.o.c f3628g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m0 f3629h;
        final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, m0 m0Var, String str, String str2, c.d.j.o.c cVar, m0 m0Var2, String str3) {
            super(kVar, m0Var, str, str2);
            this.f3628g = cVar;
            this.f3629h = m0Var2;
            this.i = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        public void a(c.d.j.k.d dVar) {
            c.d.j.k.d.c(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        /* renamed from: b */
        public c.d.j.k.d mo147b() {
            c.d.j.k.d a2 = z.this.a(this.f3628g);
            if (a2 == null) {
                this.f3629h.a(this.i, z.this.a(), false);
                return null;
            }
            a2.C();
            this.f3629h.a(this.i, z.this.a(), true);
            return a2;
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f3630a;

        b(z zVar, q0 q0Var) {
            this.f3630a = q0Var;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3630a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Executor executor, c.d.d.g.h hVar) {
        this.f3626a = executor;
        this.f3627b = hVar;
    }

    protected abstract c.d.j.k.d a(c.d.j.o.c cVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public c.d.j.k.d a(InputStream inputStream, int i) {
        c.d.d.h.a aVar = null;
        try {
            aVar = c.d.d.h.a.a(i <= 0 ? this.f3627b.mo188a(inputStream) : this.f3627b.mo189a(inputStream, i));
            return new c.d.j.k.d(aVar);
        } finally {
            c.d.d.d.b.a(inputStream);
            c.d.d.h.a.b(aVar);
        }
    }

    protected abstract String a();

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        m0 e2 = k0Var.e();
        String a2 = k0Var.a();
        a aVar = new a(kVar, e2, a(), a2, k0Var.f(), e2, a2);
        k0Var.a(new b(this, aVar));
        this.f3626a.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c.d.j.k.d b(InputStream inputStream, int i) {
        return a(inputStream, i);
    }
}
