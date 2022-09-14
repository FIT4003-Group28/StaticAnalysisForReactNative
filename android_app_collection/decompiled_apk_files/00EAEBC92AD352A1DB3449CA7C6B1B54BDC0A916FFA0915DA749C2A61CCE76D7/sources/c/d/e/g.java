package c.d.e;

import c.d.d.d.h;
import c.d.d.d.i;
import c.d.d.d.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g<T> implements l<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<l<c<T>>> f2899a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2900b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends c.d.e.a<T> {

        /* renamed from: g  reason: collision with root package name */
        private ArrayList<c<T>> f2901g;

        /* renamed from: h  reason: collision with root package name */
        private int f2902h;
        private int i;
        private AtomicInteger j;
        private Throwable k;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c.d.e.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0074a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            private int f2903a;

            public C0074a(int i) {
                this.f2903a = i;
            }

            @Override // c.d.e.e
            public void a(c<T> cVar) {
            }

            @Override // c.d.e.e
            public void b(c<T> cVar) {
                if (cVar.c()) {
                    a.this.b(this.f2903a, cVar);
                } else if (!cVar.d()) {
                } else {
                    a.this.a(this.f2903a, cVar);
                }
            }

            @Override // c.d.e.e
            public void c(c<T> cVar) {
                a.this.a(this.f2903a, cVar);
            }

            @Override // c.d.e.e
            public void d(c<T> cVar) {
                if (this.f2903a == 0) {
                    a.this.a(cVar.f());
                }
            }
        }

        public a() {
            if (!g.this.f2900b) {
                j();
            }
        }

        private synchronized c<T> a(int i) {
            c<T> cVar;
            cVar = null;
            if (this.f2901g != null && i < this.f2901g.size()) {
                cVar = this.f2901g.set(i, null);
            }
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, c<T> cVar) {
            a((c) c(i, cVar));
            if (i == 0) {
                this.k = cVar.e();
            }
            l();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[LOOP:0: B:17:0x0022->B:18:0x0024, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(int r4, c.d.e.c<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f2902h     // Catch: java.lang.Throwable -> L31
                int r1 = r3.f2902h     // Catch: java.lang.Throwable -> L31
                c.d.e.c r2 = r3.b(r4)     // Catch: java.lang.Throwable -> L31
                if (r5 != r2) goto L2f
                int r5 = r3.f2902h     // Catch: java.lang.Throwable -> L31
                if (r4 != r5) goto L10
                goto L2f
            L10:
                c.d.e.c r5 = r3.k()     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L1f
                if (r6 == 0) goto L1d
                int r5 = r3.f2902h     // Catch: java.lang.Throwable -> L31
                if (r4 >= r5) goto L1d
                goto L1f
            L1d:
                r4 = r1
                goto L21
            L1f:
                r3.f2902h = r4     // Catch: java.lang.Throwable -> L31
            L21:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            L22:
                if (r0 <= r4) goto L2e
                c.d.e.c r5 = r3.a(r0)
                r3.a(r5)
                int r0 = r0 + (-1)
                goto L22
            L2e:
                return
            L2f:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                return
            L31:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.e.g.a.a(int, c.d.e.c, boolean):void");
        }

        private void a(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c<T> b(int i) {
            return (this.f2901g == null || i >= this.f2901g.size()) ? null : this.f2901g.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, c<T> cVar) {
            a(i, cVar, cVar.d());
            if (cVar == k()) {
                a((a) null, i == 0 && cVar.d());
            }
            l();
        }

        private synchronized c<T> c(int i, c<T> cVar) {
            if (cVar == k()) {
                return null;
            }
            if (cVar != b(i)) {
                return cVar;
            }
            return a(i);
        }

        private void j() {
            if (this.j != null) {
                return;
            }
            synchronized (this) {
                if (this.j == null) {
                    this.j = new AtomicInteger(0);
                    int size = g.this.f2899a.size();
                    this.i = size;
                    this.f2902h = size;
                    this.f2901g = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        c<T> cVar = (c) ((l) g.this.f2899a.get(i)).mo139get();
                        this.f2901g.add(cVar);
                        cVar.a(new C0074a(i), c.d.d.b.a.a());
                        if (cVar.c()) {
                            break;
                        }
                    }
                }
            }
        }

        private synchronized c<T> k() {
            return b(this.f2902h);
        }

        private void l() {
            Throwable th;
            if (this.j.incrementAndGet() != this.i || (th = this.k) == null) {
                return;
            }
            a(th);
        }

        @Override // c.d.e.a, c.d.e.c
        /* renamed from: b */
        public synchronized T mo140b() {
            c<T> k;
            if (g.this.f2900b) {
                j();
            }
            k = k();
            return k != null ? k.mo140b() : null;
        }

        @Override // c.d.e.a, c.d.e.c
        public synchronized boolean c() {
            boolean z;
            if (g.this.f2900b) {
                j();
            }
            c<T> k = k();
            if (k != null) {
                if (k.c()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // c.d.e.a, c.d.e.c
        public boolean close() {
            if (g.this.f2900b) {
                j();
            }
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                ArrayList<c<T>> arrayList = this.f2901g;
                this.f2901g = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    a((c) arrayList.get(i));
                }
                return true;
            }
        }
    }

    private g(List<l<c<T>>> list, boolean z) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f2899a = list;
        this.f2900b = z;
    }

    public static <T> g<T> a(List<l<c<T>>> list, boolean z) {
        return new g<>(list, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return c.d.d.d.h.a(this.f2899a, ((g) obj).f2899a);
        }
        return false;
    }

    @Override // c.d.d.d.l
    /* renamed from: get */
    public c<T> mo139get() {
        return new a();
    }

    public int hashCode() {
        return this.f2899a.hashCode();
    }

    public String toString() {
        h.b a2 = c.d.d.d.h.a(this);
        a2.a("list", this.f2899a);
        return a2.toString();
    }
}
