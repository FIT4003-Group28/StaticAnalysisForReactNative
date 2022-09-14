package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class a<V> implements c.d.d.g.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f5193a = getClass();

    /* renamed from: b  reason: collision with root package name */
    final c.d.d.g.c f5194b;

    /* renamed from: c  reason: collision with root package name */
    final g0 f5195c;

    /* renamed from: d  reason: collision with root package name */
    final SparseArray<f<V>> f5196d;

    /* renamed from: e  reason: collision with root package name */
    final Set<V> f5197e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5198f;

    /* renamed from: g  reason: collision with root package name */
    final C0115a f5199g;

    /* renamed from: h  reason: collision with root package name */
    final C0115a f5200h;
    private final h0 i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0115a {

        /* renamed from: a  reason: collision with root package name */
        int f5201a;

        /* renamed from: b  reason: collision with root package name */
        int f5202b;

        C0115a() {
        }

        public void a(int i) {
            int i2;
            int i3 = this.f5202b;
            if (i3 < i || (i2 = this.f5201a) <= 0) {
                c.d.d.e.a.d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f5202b), Integer.valueOf(this.f5201a));
                return;
            }
            this.f5201a = i2 - 1;
            this.f5202b = i3 - i;
        }

        public void b(int i) {
            this.f5201a++;
            this.f5202b += i;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public a(c.d.d.g.c cVar, g0 g0Var, h0 h0Var) {
        c.d.d.d.i.a(cVar);
        this.f5194b = cVar;
        c.d.d.d.i.a(g0Var);
        this.f5195c = g0Var;
        c.d.d.d.i.a(h0Var);
        this.i = h0Var;
        this.f5196d = new SparseArray<>();
        if (this.f5195c.f5253d) {
            e();
        } else {
            b(new SparseIntArray(0));
        }
        this.f5197e = c.d.d.d.k.b();
        this.f5200h = new C0115a();
        this.f5199g = new C0115a();
    }

    private void a(SparseIntArray sparseIntArray) {
        this.f5196d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f5196d.put(keyAt, new f<>(e(keyAt), sparseIntArray.valueAt(i), 0, this.f5195c.f5253d));
        }
    }

    private synchronized void b(SparseIntArray sparseIntArray) {
        c.d.d.d.i.a(sparseIntArray);
        this.f5196d.clear();
        SparseIntArray sparseIntArray2 = this.f5195c.f5252c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f5196d.put(keyAt, new f<>(e(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f5195c.f5253d));
            }
            this.f5198f = false;
        } else {
            this.f5198f = true;
        }
    }

    private synchronized void d() {
        boolean z;
        if (b() && this.f5200h.f5202b != 0) {
            z = false;
            c.d.d.d.i.b(z);
        }
        z = true;
        c.d.d.d.i.b(z);
    }

    private synchronized void e() {
        SparseIntArray sparseIntArray = this.f5195c.f5252c;
        if (sparseIntArray != null) {
            a(sparseIntArray);
            this.f5198f = false;
        } else {
            this.f5198f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void f() {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(this.f5193a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f5199g.f5201a), Integer.valueOf(this.f5199g.f5202b), Integer.valueOf(this.f5200h.f5201a), Integer.valueOf(this.f5200h.f5202b));
        }
    }

    private synchronized f<V> h(int i) {
        return this.f5196d.get(i);
    }

    /* renamed from: a */
    protected abstract V mo187a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized V mo181a(f<V> fVar) {
        return fVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f5194b.a(this);
        this.i.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        r2.a();
     */
    @Override // c.d.d.g.e, c.d.d.h.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(V r8) {
        /*
            r7 = this;
            c.d.d.d.i.a(r8)
            int r0 = r7.c(r8)
            int r1 = r7.e(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.f r2 = r7.h(r0)     // Catch: java.lang.Throwable -> Lac
            java.util.Set<V> r3 = r7.f5197e     // Catch: java.lang.Throwable -> Lac
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lac
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f5193a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lac
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lac
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lac
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lac
            c.d.d.e.a.a(r2, r3, r4)     // Catch: java.lang.Throwable -> Lac
            r7.b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.h0 r8 = r7.i     // Catch: java.lang.Throwable -> Lac
        L39:
            r8.c(r1)     // Catch: java.lang.Throwable -> Lac
            goto La7
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.e()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7e
            boolean r3 = r7.b()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7e
            boolean r3 = r7.d(r8)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r2 = r7.f5200h     // Catch: java.lang.Throwable -> Lac
            r2.b(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r2 = r7.f5199g     // Catch: java.lang.Throwable -> Lac
            r2.a(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.h0 r2 = r7.i     // Catch: java.lang.Throwable -> Lac
            r2.d(r1)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = c.d.d.e.a.a(r4)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto La7
            java.lang.Class<?> r1 = r7.f5193a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            c.d.d.e.a.a(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lac
            goto La7
        L7e:
            if (r2 == 0) goto L83
            r2.a()     // Catch: java.lang.Throwable -> Lac
        L83:
            boolean r2 = c.d.d.e.a.a(r4)     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f5193a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            c.d.d.e.a.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lac
        L9c:
            r7.b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r8 = r7.f5199g     // Catch: java.lang.Throwable -> Lac
            r8.a(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.h0 r8 = r7.i     // Catch: java.lang.Throwable -> Lac
            goto L39
        La7:
            r7.f()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            return
        Lac:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.a(java.lang.Object):void");
    }

    protected abstract void b(V v);

    synchronized boolean b() {
        boolean z;
        z = this.f5199g.f5202b + this.f5200h.f5202b > this.f5195c.f5251b;
        if (z) {
            this.i.b();
        }
        return z;
    }

    synchronized boolean b(int i) {
        int i2 = this.f5195c.f5250a;
        if (i > i2 - this.f5199g.f5202b) {
            this.i.a();
            return false;
        }
        int i3 = this.f5195c.f5251b;
        if (i > i3 - (this.f5199g.f5202b + this.f5200h.f5202b)) {
            g(i3 - i);
        }
        if (i <= i2 - (this.f5199g.f5202b + this.f5200h.f5202b)) {
            return true;
        }
        this.i.a();
        return false;
    }

    protected abstract int c(V v);

    synchronized f<V> c(int i) {
        f<V> fVar = this.f5196d.get(i);
        if (fVar == null && this.f5198f) {
            if (c.d.d.e.a.a(2)) {
                c.d.d.e.a.b(this.f5193a, "creating new bucket %s", Integer.valueOf(i));
            }
            f<V> f2 = f(i);
            this.f5196d.put(i, f2);
            return f2;
        }
        return fVar;
    }

    synchronized void c() {
        if (b()) {
            g(this.f5195c.f5251b);
        }
    }

    protected abstract int d(int i);

    protected boolean d(V v) {
        c.d.d.d.i.a(v);
        return true;
    }

    protected abstract int e(int i);

    f<V> f(int i) {
        return new f<>(e(i), Integer.MAX_VALUE, 0, this.f5195c.f5253d);
    }

    synchronized void g(int i) {
        int min = Math.min((this.f5199g.f5202b + this.f5200h.f5202b) - i, this.f5200h.f5202b);
        if (min <= 0) {
            return;
        }
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(this.f5193a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f5199g.f5202b + this.f5200h.f5202b), Integer.valueOf(min));
        }
        f();
        for (int i2 = 0; i2 < this.f5196d.size() && min > 0; i2++) {
            f<V> valueAt = this.f5196d.valueAt(i2);
            while (min > 0) {
                V f2 = valueAt.f();
                if (f2 == null) {
                    break;
                }
                b((a<V>) f2);
                min -= valueAt.f5230a;
                this.f5200h.a(valueAt.f5230a);
            }
        }
        f();
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(this.f5193a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f5199g.f5202b + this.f5200h.f5202b));
        }
    }

    @Override // c.d.d.g.e
    /* renamed from: get */
    public V mo186get(int i) {
        V mo181a;
        d();
        int d2 = d(i);
        synchronized (this) {
            f<V> c2 = c(d2);
            if (c2 != null && (mo181a = mo181a((f) c2)) != null) {
                c.d.d.d.i.b(this.f5197e.add(mo181a));
                int c3 = c((a<V>) mo181a);
                int e2 = e(c3);
                this.f5199g.b(e2);
                this.f5200h.a(e2);
                this.i.b(e2);
                f();
                if (c.d.d.e.a.a(2)) {
                    c.d.d.e.a.a(this.f5193a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(mo181a)), Integer.valueOf(c3));
                }
                return mo181a;
            }
            int e3 = e(d2);
            if (!b(e3)) {
                throw new c(this.f5195c.f5250a, this.f5199g.f5202b, this.f5200h.f5202b, e3);
            }
            this.f5199g.b(e3);
            if (c2 != null) {
                c2.d();
            }
            V v = null;
            try {
                v = mo187a(d2);
            } catch (Throwable th) {
                synchronized (this) {
                    this.f5199g.a(e3);
                    f<V> c4 = c(d2);
                    if (c4 != null) {
                        c4.a();
                    }
                    c.d.d.d.n.b(th);
                }
            }
            synchronized (this) {
                c.d.d.d.i.b(this.f5197e.add(v));
                c();
                this.i.a(e3);
                f();
                if (c.d.d.e.a.a(2)) {
                    c.d.d.e.a.a(this.f5193a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(d2));
                }
            }
            return v;
        }
    }
}
