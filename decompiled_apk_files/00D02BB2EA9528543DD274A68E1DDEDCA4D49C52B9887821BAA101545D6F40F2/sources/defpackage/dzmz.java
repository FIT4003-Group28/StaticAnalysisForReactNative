package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzmz  reason: default package */
/* loaded from: classes6.dex */
public class dzmz extends dzkr {
    @Override // defpackage.dzkr, defpackage.dzmy
    public final /* bridge */ /* synthetic */ dzna a() {
        return dznc.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
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

    @Override // defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return dznc.a;
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