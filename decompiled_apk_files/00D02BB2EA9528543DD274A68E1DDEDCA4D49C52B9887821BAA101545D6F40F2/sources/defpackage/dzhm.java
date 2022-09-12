package defpackage;

import java.io.Serializable;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzhm  reason: default package */
/* loaded from: classes6.dex */
public final class dzhm extends dzhd implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzho.a;
    }

    @Override // defpackage.dzha
    public final double a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzhc, defpackage.dzhl
    public final double b() {
        throw new NoSuchElementException();
    }

    public final Object clone() {
        return dzho.a;
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
