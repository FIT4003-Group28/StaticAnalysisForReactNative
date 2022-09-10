package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcms  reason: default package */
/* loaded from: classes5.dex */
public final class dcms<E> extends dcfc<E> {
    public static final dcms<Comparable> a = new dcms<>(dcdc.e(), dcln.a);
    public final transient dcdc<E> d;

    public dcms(dcdc<E> dcdcVar, Comparator<? super E> comparator) {
        super(comparator);
        this.d = dcdcVar;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        return this.d.A(objArr, i);
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return this.d.listIterator();
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    /* renamed from: SG */
    public final dcpd<E> descendingIterator() {
        return this.d.SL().listIterator();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return this.d.SI();
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E ceiling(E e) {
        int f = f(e, true);
        if (f == size()) {
            return null;
        }
        return this.d.get(f);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.b) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof dclb) {
            collection = ((dclb) collection).j();
        }
        if (!dcnq.a(this.b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        dcpd<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int V = V(next2, next);
                if (V >= 0) {
                    if (V != 0) {
                        break;
                    } else if (!it2.hasNext()) {
                        return true;
                    } else {
                        next = it2.next();
                    }
                } else if (!it.hasNext()) {
                    return false;
                } else {
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(E e, boolean z) {
        dcdc<E> dcdcVar = this.d;
        dbsk.s(e);
        int binarySearch = Collections.binarySearch(dcdcVar, e, this.b);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator<? super E> r1 = r5.b
            boolean r1 = defpackage.dcnq.a(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            dcpd r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.V(r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2e
        L44:
            return r2
        L45:
            return r0
        L46:
            return r2
        L47:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcms.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(E e, boolean z) {
        dcdc<E> dcdcVar = this.d;
        dbsk.s(e);
        int binarySearch = Collections.binarySearch(dcdcVar, e, this.b);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : binarySearch ^ (-1);
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E floor(E e) {
        int e2 = e(e, true) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.d.get(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcms<E> g(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new dcms<>(this.d.subList(i, i2), this.b);
        }
        return P(this.b);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E higher(E e) {
        int f = f(e, false);
        if (f == size()) {
            return null;
        }
        return this.d.get(f);
    }

    @Override // defpackage.dcfc
    public final dcfc<E> l() {
        Comparator reverseOrder = Collections.reverseOrder(this.b);
        if (isEmpty()) {
            return P(reverseOrder);
        }
        return new dcms(this.d.SL(), reverseOrder);
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E lower(E e) {
        int e2 = e(e, false) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.d.get(e2);
    }

    @Override // defpackage.dcfc
    public final dcfc<E> m(E e, boolean z) {
        return g(f(e, z), size());
    }

    @Override // defpackage.dcfc
    public final dcfc<E> n(E e, boolean z, E e2, boolean z2) {
        return m(e, z).o(e2, z2);
    }

    @Override // defpackage.dcfc
    public final dcfc<E> o(E e, boolean z) {
        return g(0, e(e, z));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.dcep, defpackage.dccr
    public final dcdc<E> v() {
        return this.d;
    }

    @Override // defpackage.dccr
    public final Object[] x() {
        return this.d.x();
    }

    @Override // defpackage.dccr
    public final int y() {
        return this.d.y();
    }

    @Override // defpackage.dccr
    public final int z() {
        return this.d.z();
    }
}
