package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ampc  reason: default package */
/* loaded from: classes.dex */
final class ampc implements Iterator, j$.util.Iterator {
    final /* synthetic */ ampd a;
    private final Iterator b;

    public ampc(ampd ampdVar) {
        this.a = ampdVar;
        this.b = ((amuk) ampdVar.a).listIterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        return this.a.b.d(this.b.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
