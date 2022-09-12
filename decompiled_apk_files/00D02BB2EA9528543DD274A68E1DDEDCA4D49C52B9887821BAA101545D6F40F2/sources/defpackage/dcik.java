package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcik  reason: default package */
/* loaded from: classes5.dex */
final class dcik extends AbstractCollection {
    final /* synthetic */ dciv a;

    public dcik(dciv dcivVar) {
        this.a = dcivVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dcij(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return dciv.d(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dciv.d(this).toArray(tArr);
    }
}
