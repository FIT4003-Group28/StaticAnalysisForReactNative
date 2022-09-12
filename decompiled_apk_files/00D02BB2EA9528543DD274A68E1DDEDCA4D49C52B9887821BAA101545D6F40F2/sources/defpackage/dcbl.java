package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dcbl  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbl<E> extends dcbj<E> implements ListIterator<E> {
    @Override // defpackage.dcbj
    protected /* bridge */ /* synthetic */ Iterator a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        b().add(e);
    }

    protected abstract ListIterator<E> b();

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        b().set(e);
    }
}
