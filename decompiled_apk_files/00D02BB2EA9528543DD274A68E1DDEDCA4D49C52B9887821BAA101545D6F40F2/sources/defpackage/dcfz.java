package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcfz  reason: default package */
/* loaded from: classes5.dex */
final class dcfz implements Iterator {
    final /* synthetic */ int a;
    final /* synthetic */ Iterator b;
    private int c;

    public dcfz(int i, Iterator it) {
        this.a = i;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.a && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c++;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
