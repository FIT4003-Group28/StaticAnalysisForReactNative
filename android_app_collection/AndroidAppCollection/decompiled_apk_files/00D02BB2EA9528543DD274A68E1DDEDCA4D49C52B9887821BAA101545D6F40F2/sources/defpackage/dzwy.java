package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzwy  reason: default package */
/* loaded from: classes6.dex */
public final class dzwy implements Iterator {
    final /* synthetic */ dzwz a;
    private final Iterator b;

    public dzwy(dzwz dzwzVar) {
        this.a = dzwzVar;
        this.b = new dzxe((dzxf) dzwzVar.a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
