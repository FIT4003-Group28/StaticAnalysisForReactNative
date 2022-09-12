package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzrk  reason: default package */
/* loaded from: classes6.dex */
public class dzrk<K> extends dznw<K> {
    @Override // defpackage.dznw, defpackage.dzrj, defpackage.dzrv
    public final /* bridge */ /* synthetic */ dzrn a() {
        return dzrq.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return dzrq.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return dzrh.a;
    }
}
