package defpackage;

import java.io.Serializable;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzro  reason: default package */
/* loaded from: classes6.dex */
public final class dzro<K> extends dzob<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzrq.a;
    }

    public final Object clone() {
        return dzrq.a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // defpackage.dzgt, java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final K next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // defpackage.dzgt
    public final K previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }
}
