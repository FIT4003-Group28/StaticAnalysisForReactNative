package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: azti  reason: default package */
/* loaded from: classes2.dex */
public final class azti implements Iterator, j$.util.Iterator {
    final /* synthetic */ aztj a;
    private final Iterator b;

    public azti(aztj aztjVar) {
        this.a = aztjVar;
        this.b = aztjVar.a.a();
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
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
