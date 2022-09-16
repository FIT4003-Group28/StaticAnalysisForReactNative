package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dccr  reason: default package */
/* loaded from: classes.dex */
public abstract class dccr<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] Jl = new Object[0];

    public int A(Object[] objArr, int i) {
        dcpd<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public abstract dcpd<E> iterator();

    public abstract boolean SI();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(Jl);
    }

    public dcdc<E> v() {
        return isEmpty() ? dcdc.e() : dcdc.B(toArray());
    }

    Object writeReplace() {
        return new dcda(toArray());
    }

    public Object[] x() {
        return null;
    }

    public int y() {
        throw new UnsupportedOperationException();
    }

    public int z() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        dbsk.s(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] x = x();
            if (x == null) {
                tArr = (T[]) dclv.a(tArr, size);
            } else {
                return (T[]) Arrays.copyOfRange(x, y(), z(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        A(tArr, 0);
        return tArr;
    }
}
