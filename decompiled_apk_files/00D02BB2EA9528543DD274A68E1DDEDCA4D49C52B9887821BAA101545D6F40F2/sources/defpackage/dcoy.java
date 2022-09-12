package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcoy  reason: default package */
/* loaded from: classes.dex */
abstract class dcoy<F, T> implements Iterator<T> {
    final Iterator<? extends F> b;

    public dcoy(Iterator<? extends F> it) {
        dbsk.s(it);
        this.b = it;
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
