package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcce  reason: default package */
/* loaded from: classes.dex */
public abstract class dcce<K, V, T> extends AbstractSet<T> {
    final dccf<K, V> b;

    public dcce(dccf<K, V> dccfVar) {
        this.b = dccfVar;
    }

    public abstract T a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new dccd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c;
    }
}
