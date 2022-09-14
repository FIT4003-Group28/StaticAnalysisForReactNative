package c.d.j.n;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class i0 implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<c.d.d.h.a<c.d.j.k.b>> f3465a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.c.f f3466b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3467c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: c  reason: collision with root package name */
        private final m0 f3468c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3469d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.j.o.e f3470e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3471f;

        /* renamed from: g  reason: collision with root package name */
        private c.d.d.h.a<c.d.j.k.b> f3472g;

        /* renamed from: h  reason: collision with root package name */
        private int f3473h;
        private boolean i;
        private boolean j;

        /* loaded from: classes.dex */
        class a extends e {
            a(i0 i0Var) {
            }

            @Override // c.d.j.n.l0
            public void a() {
                b.this.g();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c.d.j.n.i0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0089b implements Runnable {
            RunnableC0089b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.d.d.h.a aVar;
                int i;
                synchronized (b.this) {
                    aVar = b.this.f3472g;
                    i = b.this.f3473h;
                    b.this.f3472g = null;
                    b.this.i = false;
                }
                if (c.d.d.h.a.c(aVar)) {
                    try {
                        b.this.b((c.d.d.h.a<c.d.j.k.b>) aVar, i);
                    } finally {
                        c.d.d.h.a.b(aVar);
                    }
                }
                b.this.d();
            }
        }

        public b(k<c.d.d.h.a<c.d.j.k.b>> kVar, m0 m0Var, String str, c.d.j.o.e eVar, k0 k0Var) {
            super(kVar);
            this.f3472g = null;
            this.f3473h = 0;
            this.i = false;
            this.j = false;
            this.f3468c = m0Var;
            this.f3469d = str;
            this.f3470e = eVar;
            k0Var.a(new a(i0.this));
        }

        private c.d.d.h.a<c.d.j.k.b> a(c.d.j.k.b bVar) {
            c.d.j.k.c cVar = (c.d.j.k.c) bVar;
            c.d.d.h.a<Bitmap> a2 = this.f3470e.a(cVar.f(), i0.this.f3466b);
            try {
                return c.d.d.h.a.a(new c.d.j.k.c(a2, bVar.c(), cVar.h(), cVar.g()));
            } finally {
                c.d.d.h.a.b(a2);
            }
        }

        private Map<String, String> a(m0 m0Var, String str, c.d.j.o.e eVar) {
            if (!m0Var.a(str)) {
                return null;
            }
            return c.d.d.d.f.a("Postprocessor", eVar.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            c.d.d.d.i.a(c.d.d.h.a.c(aVar));
            if (!b(aVar.b())) {
                c(aVar, i);
                return;
            }
            this.f3468c.a(this.f3469d, "PostprocessorProducer");
            try {
                try {
                    c.d.d.h.a<c.d.j.k.b> a2 = a(aVar.b());
                    this.f3468c.a(this.f3469d, "PostprocessorProducer", a(this.f3468c, this.f3469d, this.f3470e));
                    c(a2, i);
                    c.d.d.h.a.b(a2);
                } catch (Exception e2) {
                    this.f3468c.a(this.f3469d, "PostprocessorProducer", e2, a(this.f3468c, this.f3469d, this.f3470e));
                    c(e2);
                    c.d.d.h.a.b(null);
                }
            } catch (Throwable th) {
                c.d.d.h.a.b(null);
                throw th;
            }
        }

        private boolean b(c.d.j.k.b bVar) {
            return bVar instanceof c.d.j.k.c;
        }

        private void c(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            boolean a2 = c.d.j.n.b.a(i);
            if ((a2 || f()) && (!a2 || !e())) {
                return;
            }
            c().a(aVar, i);
        }

        private void c(Throwable th) {
            if (e()) {
                c().a(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            boolean h2;
            synchronized (this) {
                this.j = false;
                h2 = h();
            }
            if (h2) {
                i();
            }
        }

        private void d(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            synchronized (this) {
                if (this.f3471f) {
                    return;
                }
                c.d.d.h.a<c.d.j.k.b> aVar2 = this.f3472g;
                this.f3472g = c.d.d.h.a.a((c.d.d.h.a) aVar);
                this.f3473h = i;
                this.i = true;
                boolean h2 = h();
                c.d.d.h.a.b(aVar2);
                if (!h2) {
                    return;
                }
                i();
            }
        }

        private boolean e() {
            synchronized (this) {
                if (this.f3471f) {
                    return false;
                }
                c.d.d.h.a<c.d.j.k.b> aVar = this.f3472g;
                this.f3472g = null;
                this.f3471f = true;
                c.d.d.h.a.b(aVar);
                return true;
            }
        }

        private synchronized boolean f() {
            return this.f3471f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (e()) {
                c().a();
            }
        }

        private synchronized boolean h() {
            if (this.f3471f || !this.i || this.j || !c.d.d.h.a.c(this.f3472g)) {
                return false;
            }
            this.j = true;
            return true;
        }

        private void i() {
            i0.this.f3467c.execute(new RunnableC0089b());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            if (c.d.d.h.a.c(aVar)) {
                d(aVar, i);
            } else if (!c.d.j.n.b.a(i)) {
            } else {
                c((c.d.d.h.a<c.d.j.k.b>) null, i);
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b() {
            g();
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b(Throwable th) {
            c(th);
        }
    }

    /* loaded from: classes.dex */
    class c extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> implements c.d.j.o.g {

        /* renamed from: c  reason: collision with root package name */
        private boolean f3476c;

        /* renamed from: d  reason: collision with root package name */
        private c.d.d.h.a<c.d.j.k.b> f3477d;

        /* loaded from: classes.dex */
        class a extends e {
            a(i0 i0Var) {
            }

            @Override // c.d.j.n.l0
            public void a() {
                if (c.this.d()) {
                    c.this.c().a();
                }
            }
        }

        private c(i0 i0Var, b bVar, c.d.j.o.f fVar, k0 k0Var) {
            super(bVar);
            this.f3476c = false;
            this.f3477d = null;
            fVar.a(this);
            k0Var.a(new a(i0Var));
        }

        private void a(c.d.d.h.a<c.d.j.k.b> aVar) {
            synchronized (this) {
                if (this.f3476c) {
                    return;
                }
                c.d.d.h.a<c.d.j.k.b> aVar2 = this.f3477d;
                this.f3477d = c.d.d.h.a.a((c.d.d.h.a) aVar);
                c.d.d.h.a.b(aVar2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            synchronized (this) {
                if (this.f3476c) {
                    return false;
                }
                c.d.d.h.a<c.d.j.k.b> aVar = this.f3477d;
                this.f3477d = null;
                this.f3476c = true;
                c.d.d.h.a.b(aVar);
                return true;
            }
        }

        private void e() {
            synchronized (this) {
                if (this.f3476c) {
                    return;
                }
                c.d.d.h.a<c.d.j.k.b> a2 = c.d.d.h.a.a((c.d.d.h.a) this.f3477d);
                try {
                    c().a(a2, 0);
                } finally {
                    c.d.d.h.a.b(a2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            if (c.d.j.n.b.b(i)) {
                return;
            }
            a(aVar);
            e();
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b() {
            if (d()) {
                c().a();
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b(Throwable th) {
            if (d()) {
                c().a(th);
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> {
        private d(i0 i0Var, b bVar) {
            super(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            if (c.d.j.n.b.b(i)) {
                return;
            }
            c().a(aVar, i);
        }
    }

    public i0(j0<c.d.d.h.a<c.d.j.k.b>> j0Var, c.d.j.c.f fVar, Executor executor) {
        c.d.d.d.i.a(j0Var);
        this.f3465a = j0Var;
        this.f3466b = fVar;
        c.d.d.d.i.a(executor);
        this.f3467c = executor;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        m0 e2 = k0Var.e();
        c.d.j.o.e f2 = k0Var.f().f();
        b bVar = new b(kVar, e2, k0Var.a(), f2, k0Var);
        this.f3465a.a(f2 instanceof c.d.j.o.f ? new c(bVar, (c.d.j.o.f) f2, k0Var) : new d(bVar), k0Var);
    }
}
