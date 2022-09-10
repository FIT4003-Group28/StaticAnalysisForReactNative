package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjq  reason: default package */
/* loaded from: classes5.dex */
final class dcjq<K, V> extends dcjx<K, V> {
    final Map<K, V> a;
    final dbsl<? super Map.Entry<K, V>> b;

    public dcjq(Map<K, V> map, Map<K, V> map2, dbsl<? super Map.Entry<K, V>> dbslVar) {
        super(map);
        this.a = map2;
        this.b = dbslVar;
    }

    @Override // defpackage.dcjx, java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        Iterator<Map.Entry<K, V>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.b.a(next) && dbsd.a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcjx, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<Map.Entry<K, V>> it = this.a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.b.a(next) && collection.contains(next.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dcjx, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<Map.Entry<K, V>> it = this.a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.b.a(next) && !collection.contains(next.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return dchl.d(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dchl.d(iterator()).toArray(tArr);
    }
}
