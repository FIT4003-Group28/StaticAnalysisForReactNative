package c.d.j.n;

import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class y0 implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3618a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.h f3619b;

    /* renamed from: c  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3620c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends q0<c.d.j.k.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.d.j.k.d f3621g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, m0 m0Var, String str, String str2, c.d.j.k.d dVar) {
            super(kVar, m0Var, str, str2);
            this.f3621g = dVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        public void a(c.d.j.k.d dVar) {
            c.d.j.k.d.c(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        public void a(Exception exc) {
            c.d.j.k.d.c(this.f3621g);
            super.a(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.d.b.e
        /* renamed from: b */
        public c.d.j.k.d mo147b() {
            c.d.d.g.j mo191a = y0.this.f3619b.mo191a();
            try {
                y0.b(this.f3621g, mo191a);
                c.d.d.h.a a2 = c.d.d.h.a.a(mo191a.mo193a());
                c.d.j.k.d dVar = new c.d.j.k.d(a2);
                dVar.a(this.f3621g);
                c.d.d.h.a.b(a2);
                return dVar;
            } finally {
                mo191a.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        public void b(c.d.j.k.d dVar) {
            c.d.j.k.d.c(this.f3621g);
            super.b((a) dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.q0, c.d.d.b.e
        public void c() {
            c.d.j.k.d.c(this.f3621g);
            super.c();
        }
    }

    /* loaded from: classes.dex */
    private class b extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final k0 f3623c;

        /* renamed from: d  reason: collision with root package name */
        private c.d.d.k.e f3624d;

        public b(k<c.d.j.k.d> kVar, k0 k0Var) {
            super(kVar);
            this.f3623c = k0Var;
            this.f3624d = c.d.d.k.e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (this.f3624d == c.d.d.k.e.UNSET && dVar != null) {
                this.f3624d = y0.b(dVar);
            }
            if (this.f3624d == c.d.d.k.e.NO) {
                c().a(dVar, i);
            } else if (!c.d.j.n.b.a(i)) {
            } else {
                if (this.f3624d != c.d.d.k.e.YES || dVar == null) {
                    c().a(dVar, i);
                } else {
                    y0.this.a(dVar, c(), this.f3623c);
                }
            }
        }
    }

    public y0(Executor executor, c.d.d.g.h hVar, j0<c.d.j.k.d> j0Var) {
        c.d.d.d.i.a(executor);
        this.f3618a = executor;
        c.d.d.d.i.a(hVar);
        this.f3619b = hVar;
        c.d.d.d.i.a(j0Var);
        this.f3620c = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c.d.j.k.d dVar, k<c.d.j.k.d> kVar, k0 k0Var) {
        c.d.d.d.i.a(dVar);
        this.f3618a.execute(new a(kVar, k0Var.e(), "WebpTranscodeProducer", k0Var.a(), c.d.j.k.d.b(dVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c.d.d.k.e b(c.d.j.k.d dVar) {
        c.d.d.d.i.a(dVar);
        c.d.i.c c2 = c.d.i.d.c(dVar.h());
        if (!c.d.i.b.a(c2)) {
            return c2 == c.d.i.c.f3152b ? c.d.d.k.e.UNSET : c.d.d.k.e.NO;
        }
        com.facebook.imagepipeline.nativecode.e a2 = com.facebook.imagepipeline.nativecode.f.a();
        return a2 == null ? c.d.d.k.e.NO : c.d.d.k.e.a(!a2.a(c2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(c.d.j.k.d dVar, c.d.d.g.j jVar) {
        c.d.i.c cVar;
        InputStream h2 = dVar.h();
        c.d.i.c c2 = c.d.i.d.c(h2);
        if (c2 == c.d.i.b.f3149f || c2 == c.d.i.b.f3151h) {
            com.facebook.imagepipeline.nativecode.f.a().a(h2, jVar, 80);
            cVar = c.d.i.b.f3144a;
        } else if (c2 != c.d.i.b.f3150g && c2 != c.d.i.b.i) {
            throw new IllegalArgumentException("Wrong image format");
        } else {
            com.facebook.imagepipeline.nativecode.f.a().a(h2, jVar);
            cVar = c.d.i.b.f3145b;
        }
        dVar.a(cVar);
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        this.f3620c.a(new b(kVar, k0Var), k0Var);
    }
}
