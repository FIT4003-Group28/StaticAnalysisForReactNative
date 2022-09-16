package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amsh  reason: default package */
/* loaded from: classes.dex */
public final class amsh extends AbstractCollection {
    final Collection a;
    final ampg b;

    public amsh(Collection collection, ampg ampgVar) {
        collection.getClass();
        this.a = collection;
        ampgVar.getClass();
        this.b = ampgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return arey.l(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
