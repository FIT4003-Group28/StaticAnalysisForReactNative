package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: yna  reason: default package */
/* loaded from: classes4.dex */
public final class yna implements Iterator, j$.util.Iterator {
    private final Iterator a;
    private Object b;

    public yna(Iterator it) {
        it.getClass();
        this.a = it;
        b();
    }

    private final void b() {
        this.b = this.a.hasNext() ? this.a.next() : null;
    }

    public final Object a() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        Object obj = this.b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        b();
        return obj;
    }
}
