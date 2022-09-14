package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aij  reason: default package */
/* loaded from: classes.dex */
abstract class aij<T> implements Iterator<T> {
    private int a;
    private int b;
    private boolean c;

    public aij(int i) {
        this.a = i;
    }

    protected abstract T a(int i);

    protected abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T a = a(this.b);
        this.b++;
        this.c = true;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            b(i);
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
