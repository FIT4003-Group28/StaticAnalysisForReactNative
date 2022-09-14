package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dcdc  reason: default package */
/* loaded from: classes.dex */
public abstract class dcdc<E> extends dccr<E> implements List<E>, RandomAccess {
    private static final dcpe<Object> a = new dccy(dcmi.a, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> dcdc<E> B(Object[] objArr) {
        return C(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> dcdc<E> C(Object[] objArr, int i) {
        if (i == 0) {
            return (dcdc<E>) dcmi.a;
        }
        return new dcmi(objArr, i);
    }

    public static <E> dccx<E> F() {
        return new dccx<>();
    }

    public static <E> dccx<E> G(int i) {
        dbzb.d(i, "expectedSize");
        return new dccx<>(i);
    }

    private static <E> dcdc<E> H(Object... objArr) {
        dclq.i(objArr);
        return B(objArr);
    }

    public static <E> dcdc<E> e() {
        return (dcdc<E>) dcmi.a;
    }

    public static <E> dcdc<E> f(E e) {
        return H(e);
    }

    public static <E> dcdc<E> g(E e, E e2) {
        return H(e, e2);
    }

    public static <E> dcdc<E> h(E e, E e2, E e3) {
        return H(e, e2, e3);
    }

    public static <E> dcdc<E> i(E e, E e2, E e3, E e4) {
        return H(e, e2, e3, e4);
    }

    public static <E> dcdc<E> j(E e, E e2, E e3, E e4, E e5) {
        return H(e, e2, e3, e4, e5);
    }

    public static <E> dcdc<E> k(E e, E e2, E e3, E e4, E e5, E e6) {
        return H(e, e2, e3, e4, e5, e6);
    }

    public static <E> dcdc<E> l(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return H(e, e2, e3, e4, e5, e6, e7);
    }

    public static <E> dcdc<E> m(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return H(e, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> dcdc<E> n(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return H(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> dcdc<E> o(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return H(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    public static <E> dcdc<E> p(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        dbsk.b(true, "the total number of elements must fit in an int");
        int length = eArr.length;
        Object[] objArr = new Object[length + 12];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, length);
        return H(objArr);
    }

    public static <E> dcdc<E> q(Iterable<? extends E> iterable) {
        dbsk.s(iterable);
        if (iterable instanceof Collection) {
            return r((Collection) iterable);
        }
        return s(iterable.iterator());
    }

    public static <E> dcdc<E> r(Collection<? extends E> collection) {
        if (collection instanceof dccr) {
            dcdc<E> v = ((dccr) collection).v();
            return v.SI() ? B(v.toArray()) : v;
        }
        return H(collection.toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> dcdc<E> s(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return (dcdc<E>) dcmi.a;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return f(next);
        }
        dccx dccxVar = new dccx();
        dccxVar.g(next);
        dccxVar.j(it);
        return dccxVar.f();
    }

    public static <E> dcdc<E> t(E[] eArr) {
        if (eArr.length == 0) {
            return (dcdc<E>) dcmi.a;
        }
        return H((Object[]) eArr.clone());
    }

    public static <E extends Comparable<? super E>> dcdc<E> u(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) dcft.f(iterable, new Comparable[0]);
        dclq.i(comparableArr);
        Arrays.sort(comparableArr);
        return B(comparableArr);
    }

    public static <E> dcdc<E> w(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        dbsk.s(comparator);
        Object[] g = dcft.g(iterable);
        dclq.i(g);
        Arrays.sort(g, comparator);
        return B(g);
    }

    @Override // defpackage.dccr
    public int A(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: D */
    public final dcpe<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: E */
    public final dcpe<E> listIterator(int i) {
        dbsk.y(i, size());
        return isEmpty() ? (dcpe<E>) a : new dccy(this, i);
    }

    @Override // defpackage.dccr
    public final dcpd<E> SE() {
        return listIterator();
    }

    public dcdc<E> SL() {
        return size() <= 1 ? this : new dccz(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: c */
    public dcdc<E> subList(int i, int i2) {
        dbsk.u(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new dcdb(this, i, i3);
        }
        return (dcdc<E>) dcmi.a;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return dchl.m(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dccr
    public final dcdc<E> v() {
        return this;
    }

    @Override // defpackage.dccr
    Object writeReplace() {
        return new dcda(toArray());
    }
}
