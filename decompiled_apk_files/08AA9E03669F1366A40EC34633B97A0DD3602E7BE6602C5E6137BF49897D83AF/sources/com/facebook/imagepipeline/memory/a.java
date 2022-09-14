package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;
import java.util.Set;
/* compiled from: BasePool.java */
/* loaded from: classes.dex */
public abstract class a<V> implements com.facebook.common.g.e<V> {

    /* renamed from: a  reason: collision with root package name */
    final com.facebook.common.g.c f2934a;

    /* renamed from: b  reason: collision with root package name */
    final t f2935b;

    /* renamed from: d  reason: collision with root package name */
    final Set<V> f2937d;
    final C0061a e;
    final C0061a f;
    private boolean h;
    private final u i;
    private final Class<?> g = getClass();

    /* renamed from: c  reason: collision with root package name */
    final SparseArray<e<V>> f2936c = new SparseArray<>();

    protected abstract V b(int i);

    protected abstract void b(V v);

    protected abstract int c(int i);

    protected abstract int c(V v);

    protected abstract int d(int i);

    public a(com.facebook.common.g.c cVar, t tVar, u uVar) {
        this.f2934a = (com.facebook.common.g.c) com.facebook.common.d.i.a(cVar);
        this.f2935b = (t) com.facebook.common.d.i.a(tVar);
        this.i = (u) com.facebook.common.d.i.a(uVar);
        a(new SparseIntArray(0));
        this.f2937d = com.facebook.common.d.j.a();
        this.f = new C0061a();
        this.e = new C0061a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f2934a.a(this);
        this.i.a(this);
    }

    @Override // com.facebook.common.g.e
    public V a(int i) {
        V c2;
        d();
        int c3 = c(i);
        synchronized (this) {
            e<V> f = f(c3);
            if (f != null && (c2 = f.c()) != null) {
                com.facebook.common.d.i.b(this.f2937d.add(c2));
                int c4 = c((a<V>) c2);
                int d2 = d(c4);
                this.e.a(d2);
                this.f.b(d2);
                this.i.a(d2);
                e();
                if (com.facebook.common.e.a.a(2)) {
                    com.facebook.common.e.a.a(this.g, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(c2)), Integer.valueOf(c4));
                }
                return c2;
            }
            int d3 = d(c3);
            if (!h(d3)) {
                throw new c(this.f2935b.f2977a, this.e.f2939b, this.f.f2939b, d3);
            }
            this.e.a(d3);
            if (f != null) {
                f.e();
            }
            V v = null;
            try {
                v = b(c3);
            } catch (Throwable th) {
                synchronized (this) {
                    this.e.b(d3);
                    e<V> f2 = f(c3);
                    if (f2 != null) {
                        f2.f();
                    }
                    com.facebook.common.d.m.a(th);
                }
            }
            synchronized (this) {
                com.facebook.common.d.i.b(this.f2937d.add(v));
                b();
                this.i.b(d3);
                e();
                if (com.facebook.common.e.a.a(2)) {
                    com.facebook.common.e.a.a(this.g, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c3));
                }
            }
            return v;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.f();
     */
    @Override // com.facebook.common.g.e, com.facebook.common.h.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(V r8) {
        /*
            r7 = this;
            com.facebook.common.d.i.a(r8)
            int r0 = r7.c(r8)
            int r1 = r7.d(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.e r2 = r7.f(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.f2937d     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.g     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.e.a.c(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.b(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.u r8 = r7.i     // Catch: java.lang.Throwable -> Lae
            r8.c(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.a()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.c()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.d(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.a(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.a$a r2 = r7.f     // Catch: java.lang.Throwable -> Lae
            r2.a(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.a$a r2 = r7.e     // Catch: java.lang.Throwable -> Lae
            r2.b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.u r2 = r7.i     // Catch: java.lang.Throwable -> Lae
            r2.d(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = com.facebook.common.e.a.a(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.g     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.e.a.a(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.f()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = com.facebook.common.e.a.a(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.g     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.e.a.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.b(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.a$a r8 = r7.e     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.u r8 = r7.i     // Catch: java.lang.Throwable -> Lae
            r8.c(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.e()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.a(java.lang.Object):void");
    }

    protected boolean d(V v) {
        com.facebook.common.d.i.a(v);
        return true;
    }

    private synchronized void d() {
        boolean z;
        if (c() && this.f.f2939b != 0) {
            z = false;
            com.facebook.common.d.i.b(z);
        }
        z = true;
        com.facebook.common.d.i.b(z);
    }

    private synchronized void a(SparseIntArray sparseIntArray) {
        com.facebook.common.d.i.a(sparseIntArray);
        this.f2936c.clear();
        SparseIntArray sparseIntArray2 = this.f2935b.f2979c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f2936c.put(keyAt, new e<>(d(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
            }
            this.h = false;
        } else {
            this.h = true;
        }
    }

    synchronized void b() {
        if (c()) {
            e(this.f2935b.f2978b);
        }
    }

    synchronized void e(int i) {
        int min = Math.min((this.e.f2939b + this.f.f2939b) - i, this.f.f2939b);
        if (min <= 0) {
            return;
        }
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(this.g, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.e.f2939b + this.f.f2939b), Integer.valueOf(min));
        }
        e();
        for (int i2 = 0; i2 < this.f2936c.size() && min > 0; i2++) {
            e<V> valueAt = this.f2936c.valueAt(i2);
            while (min > 0) {
                V d2 = valueAt.d();
                if (d2 == null) {
                    break;
                }
                b((a<V>) d2);
                min -= valueAt.f2947a;
                this.f.b(valueAt.f2947a);
            }
        }
        e();
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(this.g, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.e.f2939b + this.f.f2939b));
        }
    }

    synchronized e<V> f(int i) {
        e<V> eVar = this.f2936c.get(i);
        if (eVar == null && this.h) {
            if (com.facebook.common.e.a.a(2)) {
                com.facebook.common.e.a.a(this.g, "creating new bucket %s", Integer.valueOf(i));
            }
            e<V> g = g(i);
            this.f2936c.put(i, g);
            return g;
        }
        return eVar;
    }

    e<V> g(int i) {
        return new e<>(d(i), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0);
    }

    synchronized boolean c() {
        boolean z;
        z = this.e.f2939b + this.f.f2939b > this.f2935b.f2978b;
        if (z) {
            this.i.b();
        }
        return z;
    }

    synchronized boolean h(int i) {
        int i2 = this.f2935b.f2977a;
        if (i > i2 - this.e.f2939b) {
            this.i.c();
            return false;
        }
        int i3 = this.f2935b.f2978b;
        if (i > i3 - (this.e.f2939b + this.f.f2939b)) {
            e(i3 - i);
        }
        if (i <= i2 - (this.e.f2939b + this.f.f2939b)) {
            return true;
        }
        this.i.c();
        return false;
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void e() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(this.g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.e.f2938a), Integer.valueOf(this.e.f2939b), Integer.valueOf(this.f.f2938a), Integer.valueOf(this.f.f2939b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasePool.java */
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0061a {

        /* renamed from: a  reason: collision with root package name */
        int f2938a;

        /* renamed from: b  reason: collision with root package name */
        int f2939b;

        C0061a() {
        }

        public void a(int i) {
            this.f2938a++;
            this.f2939b += i;
        }

        public void b(int i) {
            if (this.f2939b >= i && this.f2938a > 0) {
                this.f2938a--;
                this.f2939b -= i;
                return;
            }
            com.facebook.common.e.a.c("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f2939b), Integer.valueOf(this.f2938a));
        }
    }

    /* compiled from: BasePool.java */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* compiled from: BasePool.java */
    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }
}
