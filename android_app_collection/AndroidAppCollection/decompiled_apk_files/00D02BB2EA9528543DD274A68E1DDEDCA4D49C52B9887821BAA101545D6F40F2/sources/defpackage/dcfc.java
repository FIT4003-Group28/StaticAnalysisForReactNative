package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
/* compiled from: PG */
/* renamed from: dcfc  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcfc<E> extends dcfd<E> implements NavigableSet<E>, dcnp {
    final transient Comparator<? super E> b;
    transient dcfc<E> c;

    public dcfc(Comparator<? super E> comparator) {
        this.b = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> dcms<E> P(Comparator<? super E> comparator) {
        if (dcln.a.equals(comparator)) {
            return (dcms<E>) dcms.a;
        }
        return new dcms<>(dcdc.e(), comparator);
    }

    public static <E> dcfc<E> Q(Collection<? extends E> collection) {
        return R(dcln.a, collection);
    }

    public static <E> dcfc<E> R(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        dbsk.s(comparator);
        if (dcnq.a(comparator, iterable) && (iterable instanceof dcfc)) {
            dcfc<E> dcfcVar = (dcfc) iterable;
            if (!dcfcVar.SI()) {
                return dcfcVar;
            }
        }
        Object[] g = dcft.g(iterable);
        return S(comparator, g.length, g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> dcfc<E> S(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return P(comparator);
        }
        dclq.h(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < (eArr.length >> 1)) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new dcms(dcdc.C(eArr, i2), comparator);
    }

    public static <E> dcfa<E> T(Comparator<E> comparator) {
        return new dcfa<>(comparator);
    }

    public static <E extends Comparable<?>> dcfa<E> U() {
        return new dcfa<>(dcln.a);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public abstract dcpd<E> iterator();

    @Override // java.util.NavigableSet
    /* renamed from: SF */
    public dcfc<E> descendingSet() {
        dcfc<E> dcfcVar = this.c;
        if (dcfcVar == null) {
            dcfc<E> l = l();
            this.c = l;
            l.c = this;
            return l;
        }
        return dcfcVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: SG */
    public abstract dcpd<E> descendingIterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int V(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    public E ceiling(E e) {
        return (E) dcft.r(tailSet(e, true), null);
    }

    @Override // java.util.SortedSet, defpackage.dcnp
    public final Comparator<? super E> comparator() {
        return this.b;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return (E) dcgh.n(headSet(e, true).descendingIterator(), null);
    }

    public E higher(E e) {
        return (E) dcft.r(tailSet(e, false), null);
    }

    public abstract dcfc<E> l();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return (E) dcgh.n(headSet(e, false).descendingIterator(), null);
    }

    public abstract dcfc<E> m(E e, boolean z);

    public abstract dcfc<E> n(E e, boolean z, E e2, boolean z2);

    public abstract dcfc<E> o(E e, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: p */
    public dcfc<E> tailSet(E e, boolean z) {
        dbsk.s(e);
        return m(e, z);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: q */
    public dcfc<E> tailSet(E e) {
        return tailSet(e, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: r */
    public dcfc<E> subSet(E e, boolean z, E e2, boolean z2) {
        dbsk.s(e);
        dbsk.s(e2);
        dbsk.a(this.b.compare(e, e2) <= 0);
        return n(e, z, e2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: s */
    public dcfc<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: t */
    public dcfc<E> headSet(E e, boolean z) {
        dbsk.s(e);
        return o(e, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: u */
    public dcfc<E> headSet(E e) {
        return headSet(e, false);
    }

    @Override // defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dcfb(this.b, toArray());
    }
}
