package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbvx  reason: default package */
/* loaded from: classes.dex */
public final class dbvx<K, V> extends ReentrantLock {
    final dbwu<K, V> a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray<dbwv<K, V>> f;
    final long g;
    final ReferenceQueue<K> h;
    final ReferenceQueue<V> i;
    final Queue<dbwv<K, V>> j;
    final AtomicInteger k = new AtomicInteger();
    final Queue<dbwv<K, V>> l;
    final Queue<dbwv<K, V>> m;
    final dbuk n;

    public dbvx(dbwu dbwuVar, int i, long j, dbuk dbukVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        dbws dbwsVar;
        this.a = dbwuVar;
        this.g = j;
        dbsk.s(dbukVar);
        this.n = dbukVar;
        AtomicReferenceArray<dbwv<K, V>> z = z(i);
        this.e = (z.length() * 3) / 4;
        if (!dbwuVar.b()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = z;
        ReferenceQueue<V> referenceQueue = null;
        this.h = dbwuVar.g() ? new ReferenceQueue<>() : null;
        this.i = dbwuVar.h() ? new ReferenceQueue<>() : referenceQueue;
        if (dbwuVar.e()) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        } else {
            concurrentLinkedQueue = (Queue<dbwv<K, V>>) dbwu.u;
        }
        this.j = concurrentLinkedQueue;
        if (dbwuVar.c()) {
            dbwsVar = new dbws();
        } else {
            dbwsVar = (Queue<dbwv<K, V>>) dbwu.u;
        }
        this.l = dbwsVar;
        this.m = dbwuVar.e() ? new dbvc() : (Queue<dbwv<K, V>>) dbwu.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final V B(V v) {
        return v;
    }

    static final AtomicReferenceArray<dbwv<K, V>> z(int i) {
        return new AtomicReferenceArray<>(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbwv<K, V> A(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2, K k, V v, dbwg<K, V> dbwgVar, dbww dbwwVar) {
        y(k, v, dbwgVar.a(), dbwwVar);
        this.l.remove(dbwvVar2);
        this.m.remove(dbwvVar2);
        if (dbwgVar.d()) {
            dbwgVar.g(null);
            return dbwvVar;
        }
        return s(dbwvVar, dbwvVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(dbwv<K, V> dbwvVar, V v, long j) {
        dbwg<K, V> dbwoVar;
        dbwg<K, V> a = dbwvVar.a();
        int a2 = this.a.k.a();
        dbsk.m(a2 >= 0, "Weights must be non-negative");
        int ordinal = this.a.i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw null;
                }
                if (a2 == 1) {
                    dbwoVar = new dbwl<>(this.i, v, dbwvVar);
                } else {
                    dbwoVar = new dbwp<>(this.i, v, dbwvVar, a2);
                }
            } else if (a2 == 1) {
                dbwoVar = new dbvy<>(this.i, v, dbwvVar);
            } else {
                dbwoVar = new dbwn<>(this.i, v, dbwvVar, a2);
            }
        } else if (a2 == 1) {
            dbwoVar = new dbwd<>(v);
        } else {
            dbwoVar = new dbwo<>(v, a2);
        }
        dbwvVar.b(dbwoVar);
        j();
        this.c += a2;
        if (this.a.d()) {
            dbwvVar.g(j);
        }
        if (this.a.f()) {
            dbwvVar.m(j);
        }
        this.m.add(dbwvVar);
        this.l.add(dbwvVar);
        a.g(v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbwv<K, V> a(K k, int i, dbwv<K, V> dbwvVar) {
        dbvj dbvjVar = this.a.r;
        dbsk.s(k);
        return dbvjVar.c(this, k, i, dbwvVar);
    }

    final dbwv<K, V> b(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        if (dbwvVar.e() == null) {
            return null;
        }
        dbwg<K, V> a = dbwvVar.a();
        V v = a.get();
        if (v == null && a.e()) {
            return null;
        }
        dbwv<K, V> a2 = this.a.r.a(this, dbwvVar, dbwvVar2);
        a2.b(a.c(this.i, v, a2));
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V c(Object obj, int i) {
        try {
            if (this.b != 0) {
                long a = this.a.q.a();
                dbwv<K, V> o = o(obj, i, a);
                if (o == null) {
                    return null;
                }
                V v = o.a().get();
                if (v != null) {
                    h(o, a);
                    o.e();
                    dbus<? super K, V> dbusVar = this.a.s;
                    return (V) B(v);
                }
                f();
            }
            return null;
        } finally {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V d(dbwv<K, V> dbwvVar, K k, dbwg<K, V> dbwgVar) {
        if (!dbwgVar.d()) {
            throw new AssertionError();
        }
        dbsk.p(!Thread.holdsLock(dbwvVar), "Recursive load of: %s", k);
        V f = dbwgVar.f();
        if (f == null) {
            String valueOf = String.valueOf(k);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("CacheLoader returned null for key ");
            sb.append(valueOf);
            sb.append(".");
            throw new dbuq(sb.toString());
        }
        h(dbwvVar, this.a.q.a());
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V e(K k, int i, dbvr<K, V> dbvrVar, dehn<V> dehnVar) {
        V v = null;
        try {
            V v2 = (V) deix.b(dehnVar);
            try {
                if (v2 != null) {
                    dbvrVar.k();
                    lock();
                    long a = this.a.q.a();
                    w(a);
                    int i2 = this.b + 1;
                    if (i2 > this.e) {
                        r();
                        i2 = this.b + 1;
                    }
                    AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.f;
                    int length = (atomicReferenceArray.length() - 1) & i;
                    dbwv<K, V> dbwvVar = atomicReferenceArray.get(length);
                    dbwv<K, V> dbwvVar2 = dbwvVar;
                    while (true) {
                        if (dbwvVar2 != null) {
                            K e = dbwvVar2.e();
                            if (dbwvVar2.d() != i || e == null || !this.a.f.c(k, e)) {
                                dbwvVar2 = dbwvVar2.c();
                            } else {
                                dbwg<K, V> a2 = dbwvVar2.a();
                                V v3 = a2.get();
                                if (dbvrVar == a2) {
                                    v = v3;
                                } else if (v3 != null || a2 == dbwu.t) {
                                    y(k, v2, 0, dbww.REPLACED);
                                    unlock();
                                }
                                this.d++;
                                if (dbvrVar.e()) {
                                    y(k, v, dbvrVar.a(), v == null ? dbww.COLLECTED : dbww.REPLACED);
                                    i2--;
                                }
                                C(dbwvVar2, v2, a);
                                this.b = i2;
                                m(dbwvVar2);
                                unlock();
                            }
                        } else {
                            this.d++;
                            dbwv<K, V> a3 = a(k, i, dbwvVar);
                            C(a3, v2, a);
                            atomicReferenceArray.set(length, a3);
                            this.b = i2;
                            m(a3);
                            unlock();
                            break;
                        }
                    }
                    x();
                    return v2;
                }
                String valueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(valueOf);
                sb.append(".");
                throw new dbuq(sb.toString());
            } catch (Throwable th) {
                v = v2;
                th = th;
                if (v == null) {
                    dbvrVar.k();
                    lock();
                    try {
                        AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray2 = this.f;
                        int length2 = (atomicReferenceArray2.length() - 1) & i;
                        dbwv<K, V> dbwvVar3 = atomicReferenceArray2.get(length2);
                        dbwv<K, V> dbwvVar4 = dbwvVar3;
                        while (true) {
                            if (dbwvVar4 == null) {
                                break;
                            }
                            K e2 = dbwvVar4.e();
                            if (dbwvVar4.d() != i || e2 == null || !this.a.f.c(k, e2)) {
                                dbwvVar4 = dbwvVar4.c();
                            } else if (dbwvVar4.a() == dbvrVar) {
                                if (dbvrVar.e()) {
                                    dbwvVar4.b(dbvrVar.a);
                                } else {
                                    atomicReferenceArray2.set(length2, s(dbwvVar3, dbwvVar4));
                                }
                            }
                        }
                    } finally {
                        unlock();
                        x();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    final void f() {
        if (tryLock()) {
            try {
                g();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbvx.g():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(dbwv<K, V> dbwvVar, long j) {
        if (this.a.d()) {
            dbwvVar.g(j);
        }
        this.j.add(dbwvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dbwv<K, V> dbwvVar, long j) {
        if (this.a.d()) {
            dbwvVar.g(j);
        }
        this.m.add(dbwvVar);
    }

    final void j() {
        while (true) {
            dbwv<K, V> poll = this.j.poll();
            if (poll != null) {
                if (this.m.contains(poll)) {
                    this.m.add(poll);
                }
            } else {
                return;
            }
        }
    }

    final void k(long j) {
        if (tryLock()) {
            try {
                l(j);
            } finally {
                unlock();
            }
        }
    }

    final void l(long j) {
        dbwv<K, V> peek;
        dbwv<K, V> peek2;
        j();
        do {
            peek = this.l.peek();
            if (peek == null || !this.a.l(peek, j)) {
                do {
                    peek2 = this.m.peek();
                    if (peek2 == null || !this.a.l(peek2, j)) {
                        return;
                    }
                } while (u(peek2, peek2.d(), dbww.EXPIRED));
                throw new AssertionError();
            }
        } while (u(peek, peek.d(), dbww.EXPIRED));
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (u(r0, r0.d(), defpackage.dbww.SIZE) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.dbwv<K, V> r6) {
        /*
            r5 = this;
            dbwu<K, V> r0 = r5.a
            boolean r0 = r0.a()
            if (r0 != 0) goto L9
            return
        L9:
            r5.j()
            dbwg r0 = r6.a()
            int r0 = r0.a()
            long r0 = (long) r0
            long r2 = r5.g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1c
            goto L28
        L1c:
            int r0 = r6.d()
            dbww r1 = defpackage.dbww.SIZE
            boolean r6 = r5.u(r6, r0, r1)
            if (r6 == 0) goto L66
        L28:
            long r0 = r5.c
            long r2 = r5.g
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L65
            java.util.Queue<dbwv<K, V>> r6 = r5.m
            java.util.Iterator r6 = r6.iterator()
        L36:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            dbwv r0 = (defpackage.dbwv) r0
            dbwg r1 = r0.a()
            int r1 = r1.a()
            if (r1 <= 0) goto L36
            int r6 = r0.d()
            dbww r1 = defpackage.dbww.SIZE
            boolean r6 = r5.u(r0, r6, r1)
            if (r6 == 0) goto L59
            goto L28
        L59:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L65:
            return
        L66:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            goto L6d
        L6c:
            throw r6
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbvx.m(dbwv):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbwv<K, V> n(Object obj, int i) {
        AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.f;
        for (dbwv<K, V> dbwvVar = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); dbwvVar != null; dbwvVar = dbwvVar.c()) {
            if (dbwvVar.d() == i) {
                K e = dbwvVar.e();
                if (e == null) {
                    f();
                } else if (this.a.f.c(obj, e)) {
                    return dbwvVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbwv<K, V> o(Object obj, int i, long j) {
        dbwv<K, V> n = n(obj, i);
        if (n == null) {
            return null;
        }
        if (!this.a.l(n, j)) {
            return n;
        }
        k(j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V p(dbwv<K, V> dbwvVar, long j) {
        if (dbwvVar.e() == null) {
            f();
            return null;
        }
        V v = dbwvVar.a().get();
        if (v == null) {
            f();
            return null;
        } else if (!this.a.l(dbwvVar, j)) {
            return v;
        } else {
            k(j);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V q(K k, int i, V v, boolean z) {
        int i2;
        lock();
        try {
            long a = this.a.q.a();
            w(a);
            if (this.b + 1 > this.e) {
                r();
            }
            AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            dbwv<K, V> dbwvVar = atomicReferenceArray.get(length);
            dbwv<K, V> dbwvVar2 = dbwvVar;
            while (true) {
                if (dbwvVar2 != null) {
                    K e = dbwvVar2.e();
                    if (dbwvVar2.d() != i || e == null || !this.a.f.c(k, e)) {
                        dbwvVar2 = dbwvVar2.c();
                    } else {
                        dbwg<K, V> a2 = dbwvVar2.a();
                        V v2 = a2.get();
                        if (v2 != null) {
                            if (z) {
                                i(dbwvVar2, a);
                            } else {
                                this.d++;
                                y(k, v2, a2.a(), dbww.REPLACED);
                                C(dbwvVar2, v, a);
                                m(dbwvVar2);
                            }
                            return v2;
                        }
                        this.d++;
                        if (a2.e()) {
                            y(k, null, a2.a(), dbww.COLLECTED);
                            C(dbwvVar2, v, a);
                            i2 = this.b;
                        } else {
                            C(dbwvVar2, v, a);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        m(dbwvVar2);
                    }
                } else {
                    this.d++;
                    dbwv<K, V> a3 = a(k, i, dbwvVar);
                    C(a3, v, a);
                    atomicReferenceArray.set(length, a3);
                    this.b++;
                    m(a3);
                    break;
                }
            }
            return null;
        } finally {
            unlock();
            x();
        }
    }

    final void r() {
        AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray<dbwv<K, V>> z = z(length + length);
        this.e = (z.length() * 3) / 4;
        int length2 = z.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            dbwv<K, V> dbwvVar = atomicReferenceArray.get(i2);
            if (dbwvVar != null) {
                dbwv<K, V> c = dbwvVar.c();
                int d = dbwvVar.d() & length2;
                if (c != null) {
                    dbwv<K, V> dbwvVar2 = dbwvVar;
                    while (c != null) {
                        int d2 = c.d() & length2;
                        int i3 = d2 != d ? d2 : d;
                        if (d2 != d) {
                            dbwvVar2 = c;
                        }
                        c = c.c();
                        d = i3;
                    }
                    z.set(d, dbwvVar2);
                    while (dbwvVar != dbwvVar2) {
                        int d3 = dbwvVar.d() & length2;
                        dbwv<K, V> b = b(dbwvVar, z.get(d3));
                        if (b != null) {
                            z.set(d3, b);
                        } else {
                            t(dbwvVar);
                            i--;
                        }
                        dbwvVar = dbwvVar.c();
                    }
                } else {
                    z.set(d, dbwvVar);
                }
            }
        }
        this.f = z;
        this.b = i;
    }

    final dbwv<K, V> s(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        int i = this.b;
        dbwv<K, V> c = dbwvVar2.c();
        while (dbwvVar != dbwvVar2) {
            dbwv<K, V> b = b(dbwvVar, c);
            if (b == null) {
                t(dbwvVar);
                i--;
            } else {
                c = b;
            }
            dbwvVar = dbwvVar.c();
        }
        this.b = i;
        return c;
    }

    final void t(dbwv<K, V> dbwvVar) {
        K e = dbwvVar.e();
        dbwvVar.d();
        y(e, dbwvVar.a().get(), dbwvVar.a().a(), dbww.COLLECTED);
        this.l.remove(dbwvVar);
        this.m.remove(dbwvVar);
    }

    final boolean u(dbwv<K, V> dbwvVar, int i, dbww dbwwVar) {
        AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        dbwv<K, V> dbwvVar2 = atomicReferenceArray.get(length);
        for (dbwv<K, V> dbwvVar3 = dbwvVar2; dbwvVar3 != null; dbwvVar3 = dbwvVar3.c()) {
            if (dbwvVar3 == dbwvVar) {
                this.d++;
                dbwv<K, V> A = A(dbwvVar2, dbwvVar3, dbwvVar3.e(), dbwvVar3.a().get(), dbwvVar3.a(), dbwwVar);
                int i2 = this.b;
                atomicReferenceArray.set(length, A);
                this.b = i2 - 1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            w(this.a.q.a());
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(long j) {
        if (tryLock()) {
            try {
                g();
                l(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        if (!isHeldByCurrentThread()) {
            dbwu<K, V> dbwuVar = this.a;
            while (true) {
                dbwy<K, V> poll = dbwuVar.o.poll();
                if (poll == null) {
                    return;
                }
                try {
                    dbwuVar.p.a(poll);
                } catch (Throwable th) {
                    dbwu.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(K k, V v, int i, dbww dbwwVar) {
        this.c -= i;
        int ordinal = dbwwVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            if (this.a.o == dbwu.u) {
                return;
            }
            this.a.o.offer(new dbwy<>(k, v, dbwwVar));
            return;
        }
        throw null;
    }
}
