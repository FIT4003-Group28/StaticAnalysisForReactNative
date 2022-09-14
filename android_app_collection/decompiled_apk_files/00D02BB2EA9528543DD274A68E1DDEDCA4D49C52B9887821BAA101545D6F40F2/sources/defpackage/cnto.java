package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: cnto  reason: default package */
/* loaded from: classes5.dex */
public final class cnto<T> implements Iterator<T> {
    protected final cntn<T> a;
    protected int b = -1;

    public cnto(cntn<T> cntnVar) {
        this.a = cntnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c() + (-1);
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            cntn<T> cntnVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return cntnVar.d(i);
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
