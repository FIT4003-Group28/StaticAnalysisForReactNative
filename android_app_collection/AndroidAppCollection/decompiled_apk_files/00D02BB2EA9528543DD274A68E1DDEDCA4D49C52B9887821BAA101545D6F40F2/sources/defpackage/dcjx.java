package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjx  reason: default package */
/* loaded from: classes5.dex */
class dcjx<K, V> extends AbstractCollection<V> {
    final Map<K, V> c;

    public dcjx(Map<K, V> map) {
        this.c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return dcjz.b(this.c.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.c.entrySet()) {
                if (dbsd.a(obj, entry.getValue())) {
                    this.c.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        try {
            dbsk.s(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet c = dcnm.c();
            for (Map.Entry<K, V> entry : this.c.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    c.add(entry.getKey());
                }
            }
            return this.c.keySet().removeAll(c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        try {
            dbsk.s(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet c = dcnm.c();
            for (Map.Entry<K, V> entry : this.c.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    c.add(entry.getKey());
                }
            }
            return this.c.keySet().retainAll(c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.c.size();
    }
}
