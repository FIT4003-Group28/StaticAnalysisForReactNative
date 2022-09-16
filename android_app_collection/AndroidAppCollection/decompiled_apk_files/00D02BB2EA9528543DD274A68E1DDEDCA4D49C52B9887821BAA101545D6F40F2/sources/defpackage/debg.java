package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: debg  reason: default package */
/* loaded from: classes6.dex */
final class debg<K, V> extends dcbh<Collection<V>> {
    final Collection<Collection<V>> a;
    final Set<Map.Entry<K, Collection<V>>> b;

    public debg(Collection<Collection<V>> collection, Set<Map.Entry<K, Collection<V>>> set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbh
    protected final Collection<Collection<V>> b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return dcgh.c(iterator(), obj);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return dbze.e(this, collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new debf(this.b.iterator());
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Iterator<Collection<V>> it = iterator();
        while (it.hasNext()) {
            if (dbsd.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        return dcgh.d(iterator(), collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        return d(collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}
