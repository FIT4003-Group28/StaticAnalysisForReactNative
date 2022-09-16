package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: qwe  reason: default package */
/* loaded from: classes4.dex */
public final class qwe implements Iterator, j$.util.Iterator {
    protected int a = -1;
    protected final qwd b;

    public qwe(qwd qwdVar) {
        this.b = qwdVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.h + (-1);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (hasNext()) {
            qwd qwdVar = this.b;
            int i = this.a + 1;
            this.a = i;
            return new qwf(qwdVar.a, i);
        }
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
