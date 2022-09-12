package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahz  reason: default package */
/* loaded from: classes.dex */
final class ahz implements Set<Map.Entry> {
    final /* synthetic */ aif a;

    public ahz(aif aifVar) {
        this.a = aifVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry> collection) {
        int i = this.a.j;
        for (Map.Entry entry : collection) {
            this.a.put(entry.getKey(), entry.getValue());
        }
        return i != this.a.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int g = this.a.g(entry.getKey());
        if (g >= 0) {
            return aii.d(this.a.j(g), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return aif.c(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int i2 = this.a.j - 1; i2 >= 0; i2--) {
            K i3 = this.a.i(i2);
            V j = this.a.j(i2);
            i += (i3 == 0 ? 0 : i3.hashCode()) ^ (j == 0 ? 0 : j.hashCode());
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry> iterator() {
        return new aic(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }
}
