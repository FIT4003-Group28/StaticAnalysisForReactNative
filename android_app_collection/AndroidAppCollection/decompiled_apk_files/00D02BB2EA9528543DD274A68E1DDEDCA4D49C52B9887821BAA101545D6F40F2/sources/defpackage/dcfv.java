package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcfv  reason: default package */
/* loaded from: classes5.dex */
final class dcfv implements Iterator {
    Iterator a = dcgd.a;
    final /* synthetic */ Iterable b;

    public dcfv(Iterable iterable) {
        this.b = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.b.iterator().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a.hasNext()) {
            Iterator it = this.b.iterator();
            this.a = it;
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
