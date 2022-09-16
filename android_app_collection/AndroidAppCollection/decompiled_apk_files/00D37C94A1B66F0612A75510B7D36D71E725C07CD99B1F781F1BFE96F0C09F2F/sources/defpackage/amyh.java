package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amyh  reason: default package */
/* loaded from: classes.dex */
public final class amyh extends amvq {
    static final amyh c = new amyh(amuk.q(), amxo.a);
    final transient amuk d;

    public amyh(amuk amukVar, Comparator comparator) {
        super(comparator);
        this.d = amukVar;
    }

    @Override // defpackage.amvq
    public final amvq A(Object obj, boolean z) {
        return J(0, H(obj, z));
    }

    @Override // defpackage.amvq
    public final amvq C(Object obj, boolean z, Object obj2, boolean z2) {
        return E(obj, z).A(obj2, z2);
    }

    @Override // defpackage.amvq
    public final amvq E(Object obj, boolean z) {
        return J(I(obj, z), size());
    }

    @Override // defpackage.amvq, java.util.NavigableSet
    /* renamed from: G */
    public final amzs descendingIterator() {
        return this.d.a().listIterator();
    }

    final int H(Object obj, boolean z) {
        amuk amukVar = this.d;
        obj.getClass();
        int binarySearch = Collections.binarySearch(amukVar, obj, ((amvq) this).a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    final int I(Object obj, boolean z) {
        amuk amukVar = this.d;
        obj.getClass();
        int binarySearch = Collections.binarySearch(amukVar, obj, ((amvq) this).a);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : binarySearch ^ (-1);
    }

    final amyh J(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new amyh(this.d.subList(i, i2), this.a);
        }
        return F(this.a);
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        return this.d.b(objArr, i);
    }

    @Override // defpackage.amvq, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int I = I(obj, true);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof amxj) {
            collection = ((amxj) collection).i();
        }
        if (!amyv.a(((amvq) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        amzs it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int c2 = c(next2, next);
                if (c2 >= 0) {
                    if (c2 != 0) {
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

    @Override // defpackage.amub
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.amub
    public final int e() {
        return this.d.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // defpackage.amvn, java.util.Collection, java.util.Set
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
            java.util.Comparator r1 = r5.a
            boolean r1 = defpackage.amyv.a(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            amzs r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.c(r3, r4)     // Catch: java.lang.Throwable -> L46
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amyh.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.amvq, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.amvq, java.util.NavigableSet
    public final Object floor(Object obj) {
        int H = H(obj, true) - 1;
        if (H == -1) {
            return null;
        }
        return this.d.get(H);
    }

    @Override // defpackage.amvn, defpackage.amub
    public final amuk g() {
        return this.d;
    }

    @Override // defpackage.amvq, java.util.NavigableSet
    public final Object higher(Object obj) {
        int I = I(obj, false);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.amvq, defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return this.d.listIterator();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.amvq, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.amvq, java.util.NavigableSet
    public final Object lower(Object obj) {
        int H = H(obj, false) - 1;
        if (H == -1) {
            return null;
        }
        return this.d.get(H);
    }

    @Override // defpackage.amub
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.amvq
    public final amvq y() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return F(reverseOrder);
        }
        return new amyh(this.d.a(), reverseOrder);
    }
}
