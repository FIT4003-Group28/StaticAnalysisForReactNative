package defpackage;

import java.io.Serializable;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dznb  reason: default package */
/* loaded from: classes6.dex */
public final class dznb extends dzkw implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dznc.a;
    }

    @Override // defpackage.dzkq, defpackage.dzmx
    public final long a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzks, defpackage.dzna
    public final long b() {
        throw new NoSuchElementException();
    }

    public final Object clone() {
        return dznc.a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // defpackage.dzgt, java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }
}
