package c.e.a.b.d.e;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class s<E> extends k0<E> {

    /* renamed from: b  reason: collision with root package name */
    private final int f3984b;

    /* renamed from: c  reason: collision with root package name */
    private int f3985c;

    /* JADX INFO: Access modifiers changed from: protected */
    public s(int i, int i2) {
        m.b(i2, i);
        this.f3984b = i;
        this.f3985c = i2;
    }

    protected abstract E a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3985c < this.f3984b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3985c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f3985c;
            this.f3985c = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3985c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f3985c - 1;
            this.f3985c = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3985c - 1;
    }
}
