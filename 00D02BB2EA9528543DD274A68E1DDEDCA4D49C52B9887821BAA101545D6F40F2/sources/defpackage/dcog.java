package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcog  reason: default package */
/* loaded from: classes5.dex */
final class dcog<K, V> extends dcoq<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    public dcog(Set<Map.Entry<K, Collection<V>>> set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean D;
        synchronized (this.g) {
            D = dcjz.D(a(), obj);
        }
        return D;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        boolean e;
        synchronized (this.g) {
            e = dbze.e(a(), collection);
        }
        return e;
    }

    @Override // defpackage.dcoq, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean s;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            s = dcnm.s(a(), obj);
        }
        return s;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new dcof(this, super.iterator());
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = !(obj instanceof Map.Entry) ? false : a().remove(dcjz.q((Map.Entry) obj));
        }
        return remove;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        boolean d;
        synchronized (this.g) {
            d = dcgh.d(a().iterator(), collection);
        }
        return d;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean e;
        synchronized (this.g) {
            e = dcgh.e(a().iterator(), collection);
        }
        return e;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] f;
        synchronized (this.g) {
            f = dclq.f(a());
        }
        return f;
    }

    @Override // defpackage.dcoj, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) dclq.e(a(), tArr);
        }
        return tArr2;
    }
}
