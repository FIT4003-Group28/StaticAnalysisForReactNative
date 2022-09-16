package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dcae  reason: default package */
/* loaded from: classes.dex */
public final class dcae<E> extends dbyq<E> implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient ConcurrentMap<E, AtomicInteger> a;

    public dcae(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        dbsk.g(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.a = concurrentMap;
    }

    private final List<E> g() {
        ArrayList g = dchl.g(size());
        for (dcla<E> dclaVar : l()) {
            E a = dclaVar.a();
            for (int b = dclaVar.b(); b > 0; b--) {
                g.add(a);
            }
        }
        return g;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        dcad.a.a(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
    }

    @Override // defpackage.dclb
    public final int a(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) dcjz.A(this.a, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // defpackage.dbyq, defpackage.dclb
    public final int b(Object obj, int i) {
        int i2;
        int max;
        dbzb.b(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) dcjz.A(this.a, obj);
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    max = Math.max(0, i2 - i);
                }
            } while (!atomicInteger.compareAndSet(i2, max));
            if (max == 0) {
                this.a.remove(obj, atomicInteger);
            }
            return i2;
        }
        return 0;
    }

    @Override // defpackage.dbyq
    public final Iterator<E> c() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dbyq
    public final Iterator<dcla<E>> d() {
        return new dcab(this, new dcaa(this));
    }

    @Override // defpackage.dbyq
    public final int e() {
        return this.a.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r8.a.putIfAbsent(r9, r1) == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        return;
     */
    @Override // defpackage.dbyq, defpackage.dclb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(E r9, int r10) {
        /*
            r8 = this;
            defpackage.dbsk.s(r9)
            if (r10 != 0) goto L9
            r8.a(r9)
            return
        L9:
            java.lang.String r0 = "occurences"
            defpackage.dbzb.b(r10, r0)
        Le:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r8.a
            java.lang.Object r0 = defpackage.dcjz.A(r0, r9)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L29
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r8.a
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r10)
            java.lang.Object r0 = r0.putIfAbsent(r9, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            int r1 = r0.get()
            if (r1 == 0) goto L68
            long r2 = (long) r1
            long r4 = (long) r10
            long r2 = r2 + r4
            int r4 = (int) r2
            long r5 = (long) r4
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L3a
            r2 = 1
            goto L3b
        L3a:
            r2 = 0
        L3b:
            java.lang.String r3 = "checkedAdd"
            defpackage.debb.b(r2, r3, r1, r10)     // Catch: java.lang.ArithmeticException -> L47
            boolean r1 = r0.compareAndSet(r1, r4)     // Catch: java.lang.ArithmeticException -> L47
            if (r1 == 0) goto L29
            return
        L47:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 65
            r0.<init>(r2)
            java.lang.String r2 = "Overflow adding "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = " occurrences to a count of "
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L68:
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r10)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r2 = r8.a
            java.lang.Object r2 = r2.putIfAbsent(r9, r1)
            if (r2 == 0) goto L7d
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r2 = r8.a
            boolean r0 = r2.replace(r9, r0, r1)
            if (r0 == 0) goto Le
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcae.f(java.lang.Object, int):void");
    }

    @Override // defpackage.dbyq, defpackage.dclb
    public final boolean i(E e, int i) {
        dbsk.s(e);
        dbzb.d(i, "oldCount");
        dbzb.d(0, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) dcjz.A(this.a, e);
        if (atomicInteger == null) {
            return i == 0;
        }
        int i2 = atomicInteger.get();
        if (i2 == i) {
            if (i2 == 0) {
                this.a.remove(e, atomicInteger);
                return true;
            } else if (atomicInteger.compareAndSet(i2, 0)) {
                this.a.remove(e, atomicInteger);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dbyq, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return dclh.b(this);
    }

    @Override // defpackage.dbyq
    public final Set<E> k() {
        return new dbzz(this.a.keySet());
    }

    @Override // defpackage.dbyq
    @Deprecated
    public final Set<dcla<E>> m() {
        return new dcac(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.a.values()) {
            j += atomicInteger.get();
        }
        return decl.b(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return g().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) g().toArray(tArr);
    }
}
