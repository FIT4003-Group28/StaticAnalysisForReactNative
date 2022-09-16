package com.facebook.c;

import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.util.List;
/* compiled from: FirstAvailableDataSourceSupplier.java */
/* loaded from: classes.dex */
public class f<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<k<c<T>>> f2247a;

    private f(List<k<c<T>>> list) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f2247a = list;
    }

    public static <T> f<T> a(List<k<c<T>>> list) {
        return new f<>(list);
    }

    @Override // com.facebook.common.d.k
    /* renamed from: a */
    public c<T> b() {
        return new a();
    }

    public int hashCode() {
        return this.f2247a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return com.facebook.common.d.h.a(this.f2247a, ((f) obj).f2247a);
        }
        return false;
    }

    public String toString() {
        return com.facebook.common.d.h.a(this).a("list", this.f2247a).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirstAvailableDataSourceSupplier.java */
    /* loaded from: classes.dex */
    public class a extends com.facebook.c.a<T> {

        /* renamed from: b  reason: collision with root package name */
        private int f2249b = 0;

        /* renamed from: c  reason: collision with root package name */
        private c<T> f2250c = null;

        /* renamed from: d  reason: collision with root package name */
        private c<T> f2251d = null;

        public a() {
            if (!j()) {
                a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        @Override // com.facebook.c.a, com.facebook.c.c
        public synchronized T d() {
            c<T> l;
            l = l();
            return l != null ? l.d() : null;
        }

        @Override // com.facebook.c.a, com.facebook.c.c
        public synchronized boolean c() {
            boolean z;
            c<T> l = l();
            if (l != null) {
                if (l.c()) {
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
                c<T> cVar = this.f2250c;
                this.f2250c = null;
                c<T> cVar2 = this.f2251d;
                this.f2251d = null;
                e(cVar2);
                e(cVar);
                return true;
            }
        }

        private boolean j() {
            k<c<T>> k = k();
            c<T> b2 = k != null ? k.b() : null;
            if (a((c) b2) && b2 != null) {
                b2.a(new C0045a(), com.facebook.common.b.a.a());
                return true;
            }
            e(b2);
            return false;
        }

        private synchronized k<c<T>> k() {
            if (a() || this.f2249b >= f.this.f2247a.size()) {
                return null;
            }
            List list = f.this.f2247a;
            int i = this.f2249b;
            this.f2249b = i + 1;
            return (k) list.get(i);
        }

        private synchronized boolean a(c<T> cVar) {
            if (a()) {
                return false;
            }
            this.f2250c = cVar;
            return true;
        }

        private synchronized boolean b(c<T> cVar) {
            if (!a() && cVar == this.f2250c) {
                this.f2250c = null;
                return true;
            }
            return false;
        }

        private synchronized c<T> l() {
            return this.f2251d;
        }

        private void a(c<T> cVar, boolean z) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f2250c && cVar != this.f2251d) {
                    if (this.f2251d != null && !z) {
                        cVar2 = null;
                        e(cVar2);
                    }
                    c<T> cVar3 = this.f2251d;
                    this.f2251d = cVar;
                    cVar2 = cVar3;
                    e(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(c<T> cVar) {
            if (!b(cVar)) {
                return;
            }
            if (cVar != l()) {
                e(cVar);
            }
            if (j()) {
                return;
            }
            a(cVar.f());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(c<T> cVar) {
            a((c) cVar, cVar.b());
            if (cVar == l()) {
                a((a) null, cVar.b());
            }
        }

        private void e(c<T> cVar) {
            if (cVar != null) {
                cVar.h();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FirstAvailableDataSourceSupplier.java */
        /* renamed from: com.facebook.c.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0045a implements e<T> {
            @Override // com.facebook.c.e
            public void c(c<T> cVar) {
            }

            private C0045a() {
            }

            @Override // com.facebook.c.e
            public void b(c<T> cVar) {
                a.this.c(cVar);
            }

            @Override // com.facebook.c.e
            public void a(c<T> cVar) {
                if (cVar.c()) {
                    a.this.d(cVar);
                } else if (!cVar.b()) {
                } else {
                    a.this.c(cVar);
                }
            }

            @Override // com.facebook.c.e
            public void d(c<T> cVar) {
                a.this.a(Math.max(a.this.g(), cVar.g()));
            }
        }
    }
}
