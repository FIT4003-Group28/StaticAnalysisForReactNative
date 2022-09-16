package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dcoz  reason: default package */
/* loaded from: classes.dex */
abstract class dcoz<F, T> extends dcoy<F, T> implements ListIterator<T> {
    public dcoz(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private final ListIterator<? extends F> b() {
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
