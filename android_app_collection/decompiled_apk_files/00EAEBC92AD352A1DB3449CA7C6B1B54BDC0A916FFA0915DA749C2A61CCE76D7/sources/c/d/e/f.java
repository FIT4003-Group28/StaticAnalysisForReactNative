package c.d.e;

import c.d.d.d.h;
import c.d.d.d.i;
import c.d.d.d.l;
import java.util.List;
/* loaded from: classes.dex */
public class f<T> implements l<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<l<c<T>>> f2895a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends c.d.e.a<T> {

        /* renamed from: g  reason: collision with root package name */
        private int f2896g = 0;

        /* renamed from: h  reason: collision with root package name */
        private c<T> f2897h = null;
        private c<T> i = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements e<T> {
            private a() {
            }

            @Override // c.d.e.e
            public void a(c<T> cVar) {
            }

            @Override // c.d.e.e
            public void b(c<T> cVar) {
                if (cVar.c()) {
                    b.this.d(cVar);
                } else if (!cVar.d()) {
                } else {
                    b.this.c(cVar);
                }
            }

            @Override // c.d.e.e
            public void c(c<T> cVar) {
                b.this.c(cVar);
            }

            @Override // c.d.e.e
            public void d(c<T> cVar) {
                b.this.a(Math.max(b.this.f(), cVar.f()));
            }
        }

        public b() {
            if (!l()) {
                a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private void a(c<T> cVar, boolean z) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f2897h && cVar != this.i) {
                    if (this.i != null && !z) {
                        cVar2 = null;
                        b(cVar2);
                    }
                    c<T> cVar3 = this.i;
                    this.i = cVar;
                    cVar2 = cVar3;
                    b(cVar2);
                }
            }
        }

        private synchronized boolean a(c<T> cVar) {
            boolean z;
            if (!h() && cVar == this.f2897h) {
                this.f2897h = null;
                z = true;
            }
            z = false;
            return z;
        }

        private void b(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(c<T> cVar) {
            if (!a((c) cVar)) {
                return;
            }
            if (cVar != j()) {
                b(cVar);
            }
            if (l()) {
                return;
            }
            a(cVar.e());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(c<T> cVar) {
            a((c) cVar, cVar.d());
            if (cVar == j()) {
                a((b) null, cVar.d());
            }
        }

        private synchronized boolean e(c<T> cVar) {
            boolean z;
            if (h()) {
                z = false;
            } else {
                this.f2897h = cVar;
                z = true;
            }
            return z;
        }

        private synchronized c<T> j() {
            return this.i;
        }

        private synchronized l<c<T>> k() {
            if (h() || this.f2896g >= f.this.f2895a.size()) {
                return null;
            }
            List list = f.this.f2895a;
            int i = this.f2896g;
            this.f2896g = i + 1;
            return (l) list.get(i);
        }

        private boolean l() {
            l<c<T>> k = k();
            c<T> mo139get = k != null ? k.mo139get() : null;
            if (!e(mo139get) || mo139get == null) {
                b(mo139get);
                return false;
            }
            mo139get.a(new a(), c.d.d.b.a.a());
            return true;
        }

        @Override // c.d.e.a, c.d.e.c
        /* renamed from: b */
        public synchronized T mo140b() {
            c<T> j;
            j = j();
            return j != null ? j.mo140b() : null;
        }

        @Override // c.d.e.a, c.d.e.c
        public synchronized boolean c() {
            boolean z;
            c<T> j = j();
            if (j != null) {
                if (j.c()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // c.d.e.a, c.d.e.c
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                c<T> cVar = this.f2897h;
                this.f2897h = null;
                c<T> cVar2 = this.i;
                this.i = null;
                b(cVar2);
                b(cVar);
                return true;
            }
        }
    }

    private f(List<l<c<T>>> list) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f2895a = list;
    }

    public static <T> f<T> a(List<l<c<T>>> list) {
        return new f<>(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return c.d.d.d.h.a(this.f2895a, ((f) obj).f2895a);
        }
        return false;
    }

    @Override // c.d.d.d.l
    /* renamed from: get */
    public c<T> mo139get() {
        return new b();
    }

    public int hashCode() {
        return this.f2895a.hashCode();
    }

    public String toString() {
        h.b a2 = c.d.d.d.h.a(this);
        a2.a("list", this.f2895a);
        return a2.toString();
    }
}
