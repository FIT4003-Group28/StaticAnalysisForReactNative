package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzhk  reason: default package */
/* loaded from: classes6.dex */
public final class dzhk implements Serializable, dzhi {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final dzhi a;

    public dzhk(dzhi dzhiVar) {
        this.a = dzhiVar;
    }

    @Override // defpackage.dzhi
    public final dzhl a() {
        throw null;
    }

    @Override // java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Double d) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzhi, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new dzhn(this.a.a());
    }

    @Override // java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((dzhg) this.a).b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.a.toArray();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }
}
