package c.d.j.g;

import c.d.d.d.i;
import c.d.j.n.j0;
import c.d.j.n.k;
import c.d.j.n.p0;
/* loaded from: classes.dex */
public abstract class a<T> extends c.d.e.a<T> implements c.d.j.o.b {

    /* renamed from: g  reason: collision with root package name */
    private final p0 f3355g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.j.l.c f3356h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.j.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0086a extends c.d.j.n.b<T> {
        C0086a() {
        }

        @Override // c.d.j.n.b
        protected void b() {
            a.this.k();
        }

        @Override // c.d.j.n.b
        protected void b(float f2) {
            a.this.a(f2);
        }

        @Override // c.d.j.n.b
        protected void b(T t, int i) {
            a.this.a((a) t, i);
        }

        @Override // c.d.j.n.b
        protected void b(Throwable th) {
            a.this.b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(j0<T> j0Var, p0 p0Var, c.d.j.l.c cVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractProducerToDataSourceAdapter()");
        }
        this.f3355g = p0Var;
        this.f3356h = cVar;
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.f3356h.a(p0Var.f(), this.f3355g.b(), this.f3355g.a(), this.f3355g.d());
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        j0Var.a(j(), p0Var);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Throwable th) {
        if (super.a(th)) {
            this.f3356h.a(this.f3355g.f(), this.f3355g.a(), th, this.f3355g.d());
        }
    }

    private k<T> j() {
        return new C0086a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        i.b(h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(T t, int i) {
        boolean a2 = c.d.j.n.b.a(i);
        if (!super.a((a<T>) t, a2) || !a2) {
            return;
        }
        this.f3356h.a(this.f3355g.f(), this.f3355g.a(), this.f3355g.d());
    }

    @Override // c.d.e.a, c.d.e.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.d()) {
            return true;
        }
        this.f3356h.b(this.f3355g.a());
        this.f3355g.i();
        return true;
    }
}
