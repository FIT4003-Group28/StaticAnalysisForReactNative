package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcfo  reason: default package */
/* loaded from: classes5.dex */
final class dcfo implements Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;

    public dcfo(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(!this.a);
        this.b.remove();
    }
}
