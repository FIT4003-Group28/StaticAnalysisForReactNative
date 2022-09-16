package com.facebook.c;

import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: IncreasingQualityDataSourceSupplier.java */
/* loaded from: classes.dex */
public class g<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<k<c<T>>> f2253a;

    private g(List<k<c<T>>> list) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f2253a = list;
    }

    public static <T> g<T> a(List<k<c<T>>> list) {
        return new g<>(list);
    }

    @Override // com.facebook.common.d.k
    /* renamed from: a */
    public c<T> b() {
        return new a();
    }

    public int hashCode() {
        return this.f2253a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return com.facebook.common.d.h.a(this.f2253a, ((g) obj).f2253a);
        }
        return false;
    }

    public String toString() {
        return com.facebook.common.d.h.a(this).a("list", this.f2253a).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IncreasingQualityDataSourceSupplier.java */
    /* loaded from: classes.dex */
    public class a extends com.facebook.c.a<T> {

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<c<T>> f2255b;

        /* renamed from: c  reason: collision with root package name */
        private int f2256c;

        public a() {
            int size = g.this.f2253a.size();
            this.f2256c = size;
            this.f2255b = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                c<T> cVar = (c) ((k) g.this.f2253a.get(i)).b();
                this.f2255b.add(cVar);
                cVar.a(new C0046a(i), com.facebook.common.b.a.a());
                if (cVar.c()) {
                    return;
                }
            }
        }

        private synchronized c<T> a(int i) {
            return (this.f2255b == null || i >= this.f2255b.size()) ? null : this.f2255b.get(i);
        }

        private synchronized c<T> b(int i) {
            c<T> cVar;
            cVar = null;
            if (this.f2255b != null && i < this.f2255b.size()) {
                cVar = this.f2255b.set(i, null);
            }
            return cVar;
        }

        private synchronized c<T> j() {
            return a(this.f2256c);
        }

        @Override // com.facebook.c.a, com.facebook.c.c
        public synchronized T d() {
            c<T> j;
            j = j();
            return j != null ? j.d() : null;
        }

        @Override // com.facebook.c.a, com.facebook.c.c
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

        @Override // com.facebook.c.a, com.facebook.c.c
        public boolean h() {
            synchronized (this) {
                if (!super.h()) {
                    return false;
                }
                ArrayList<c<T>> arrayList = this.f2255b;
                this.f2255b = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    a((c) arrayList.get(i));
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, c<T> cVar) {
            a(i, cVar, cVar.b());
            if (cVar == j()) {
                a((a) null, i == 0 && cVar.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, c<T> cVar) {
            a((c) c(i, cVar));
            if (i == 0) {
                a(cVar.f());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[LOOP:0: B:17:0x0022->B:18:0x0024, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(int r4, com.facebook.c.c<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f2256c     // Catch: java.lang.Throwable -> L31
                int r1 = r3.f2256c     // Catch: java.lang.Throwable -> L31
                com.facebook.c.c r2 = r3.a(r4)     // Catch: java.lang.Throwable -> L31
                if (r5 != r2) goto L2f
                int r5 = r3.f2256c     // Catch: java.lang.Throwable -> L31
                if (r4 != r5) goto L10
                goto L2f
            L10:
                com.facebook.c.c r5 = r3.j()     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L1f
                if (r6 == 0) goto L1d
                int r5 = r3.f2256c     // Catch: java.lang.Throwable -> L31
                if (r4 >= r5) goto L1d
                goto L1f
            L1d:
                r4 = r1
                goto L21
            L1f:
                r3.f2256c = r4     // Catch: java.lang.Throwable -> L31
            L21:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            L22:
                if (r0 <= r4) goto L2e
                com.facebook.c.c r5 = r3.b(r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.g.a.a(int, com.facebook.c.c, boolean):void");
        }

        private synchronized c<T> c(int i, c<T> cVar) {
            if (cVar == j()) {
                return null;
            }
            if (cVar != a(i)) {
                return cVar;
            }
            return b(i);
        }

        private void a(c<T> cVar) {
            if (cVar != null) {
                cVar.h();
            }
        }

        /* compiled from: IncreasingQualityDataSourceSupplier.java */
        /* renamed from: com.facebook.c.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0046a implements e<T> {

            /* renamed from: b  reason: collision with root package name */
            private int f2258b;

            @Override // com.facebook.c.e
            public void c(c<T> cVar) {
            }

            public C0046a(int i) {
                this.f2258b = i;
            }

            @Override // com.facebook.c.e
            public void a(c<T> cVar) {
                if (cVar.c()) {
                    a.this.a(this.f2258b, cVar);
                } else if (!cVar.b()) {
                } else {
                    a.this.b(this.f2258b, cVar);
                }
            }

            @Override // com.facebook.c.e
            public void b(c<T> cVar) {
                a.this.b(this.f2258b, cVar);
            }

            @Override // com.facebook.c.e
            public void d(c<T> cVar) {
                if (this.f2258b == 0) {
                    a.this.a(cVar.g());
                }
            }
        }
    }
}
