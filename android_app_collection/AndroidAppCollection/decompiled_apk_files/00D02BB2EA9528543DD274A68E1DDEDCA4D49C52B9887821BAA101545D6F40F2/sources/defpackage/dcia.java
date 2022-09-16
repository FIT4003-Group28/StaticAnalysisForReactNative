package defpackage;

import defpackage.dchv;
import defpackage.dcia;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcia  reason: default package */
/* loaded from: classes.dex */
public class dcia<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> extends ReentrantLock {
    final dciv<K, V, E, S> a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray<E> e;
    final AtomicInteger g = new AtomicInteger();
    final int f = -1;

    public dcia(dciv<K, V, E, S> dcivVar, int i) {
        this.a = dcivVar;
        AtomicReferenceArray<E> o = o(i);
        int length = (o.length() * 3) / 4;
        this.d = length;
        if (length == -1) {
            this.d = length + 1;
        }
        this.e = o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V, E extends dchv<K, V, E>> boolean k(E e) {
        return e.d() == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T> void n(ReferenceQueue<T> referenceQueue) {
        do {
        } while (referenceQueue.poll() != null);
    }

    static final AtomicReferenceArray<E> o(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public void a() {
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(E e, V v) {
        this.a.f.e(this, e, v);
    }

    final E d(E e, E e2) {
        return this.a.f.d(this, e, e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (tryLock()) {
            try {
                a();
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ReferenceQueue<K> referenceQueue) {
        int i = 0;
        do {
            Reference<? extends K> poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            dchv dchvVar = (dchv) poll;
            dciv<K, V, E, S> dcivVar = this.a;
            int b = dchvVar.b();
            dcia<K, V, E, S> b2 = dcivVar.b(b);
            b2.lock();
            try {
                int i2 = b2.b;
                AtomicReferenceArray<E> atomicReferenceArray = b2.e;
                int length = b & (atomicReferenceArray.length() - 1);
                E e = atomicReferenceArray.get(length);
                dchv dchvVar2 = e;
                while (true) {
                    if (dchvVar2 == null) {
                        break;
                    } else if (dchvVar2 == dchvVar) {
                        b2.c++;
                        atomicReferenceArray.set(length, b2.j(e, dchvVar2));
                        b2.b--;
                        break;
                    } else {
                        dchvVar2 = dchvVar2.c();
                    }
                }
                b2.unlock();
                i++;
            } catch (Throwable th) {
                b2.unlock();
                throw th;
            }
        } while (i != 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void g(ReferenceQueue<V> referenceQueue) {
        int i = 0;
        do {
            Reference<? extends V> poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            dcis<K, V, E> dcisVar = (dcis) poll;
            dciv<K, V, E, S> dcivVar = this.a;
            E b = dcisVar.b();
            int b2 = b.b();
            dcia<K, V, E, S> b3 = dcivVar.b(b2);
            Object a = b.a();
            b3.lock();
            try {
                int i2 = b3.b;
                AtomicReferenceArray<E> atomicReferenceArray = b3.e;
                int length = (atomicReferenceArray.length() - 1) & b2;
                E e = atomicReferenceArray.get(length);
                E e2 = e;
                while (true) {
                    if (e2 == null) {
                        break;
                    }
                    Object a2 = e2.a();
                    if (e2.b() != b2 || a2 == null || !b3.a.e.c(a, a2)) {
                        e2 = (E) e2.c();
                    } else if (e2.e() == dcisVar) {
                        b3.c++;
                        atomicReferenceArray.set(length, b3.j(e, e2));
                        b3.b--;
                    }
                }
                b3.unlock();
                i++;
            } catch (Throwable th) {
                b3.unlock();
                throw th;
            }
        } while (i != 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final E h(Object obj, int i) {
        if (this.b != 0) {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            for (E e = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); e != null; e = (E) e.c()) {
                if (e.b() == i) {
                    Object a = e.a();
                    if (a == null) {
                        e();
                    } else if (this.a.e.c(obj, a)) {
                        return e;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final V i(K k, int i, V v, boolean z) {
        lock();
        try {
            m();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) o(length + length);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        E e = atomicReferenceArray.get(i4);
                        if (e != null) {
                            dchv c = e.c();
                            int b = e.b() & length2;
                            if (c == null) {
                                atomicReferenceArray2.set(b, e);
                            } else {
                                dchv dchvVar = e;
                                while (c != null) {
                                    int b2 = c.b() & length2;
                                    int i5 = b2 != b ? b2 : b;
                                    if (b2 != b) {
                                        dchvVar = c;
                                    }
                                    c = c.c();
                                    b = i5;
                                }
                                atomicReferenceArray2.set(b, dchvVar);
                                while (e != dchvVar) {
                                    int b3 = e.b() & length2;
                                    dchv d = d(e, (dchv) atomicReferenceArray2.get(b3));
                                    if (d != null) {
                                        atomicReferenceArray2.set(b3, d);
                                    } else {
                                        i3--;
                                    }
                                    e = e.c();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray<E> atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            E e2 = atomicReferenceArray3.get(length3);
            for (dchv dchvVar2 = e2; dchvVar2 != null; dchvVar2 = dchvVar2.c()) {
                Object a = dchvVar2.a();
                if (dchvVar2.b() == i && a != null && this.a.e.c(k, a)) {
                    V v2 = (V) dchvVar2.d();
                    if (v2 == null) {
                        this.c++;
                        c(dchvVar2, v);
                        this.b = this.b;
                        return null;
                    } else if (z) {
                        return v2;
                    } else {
                        this.c++;
                        c(dchvVar2, v);
                        return v2;
                    }
                }
            }
            this.c++;
            E c2 = this.a.f.c(this, k, i, e2);
            c(c2, v);
            atomicReferenceArray3.set(length3, c2);
            this.b = i2;
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final E j(E e, E e2) {
        int i = this.b;
        E e3 = (E) e2.c();
        while (e != e2) {
            E d = d(e, e3);
            if (d == null) {
                i--;
            } else {
                e3 = d;
            }
            e = (E) e.c();
        }
        this.b = i;
        return e3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        if ((this.g.incrementAndGet() & 63) == 0) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (tryLock()) {
            try {
                a();
                this.g.set(0);
            } finally {
                unlock();
            }
        }
    }
}
