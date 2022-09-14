package c.e.a.b.d.e;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class c<T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    private int f3869b = e.f3888b;

    /* renamed from: c  reason: collision with root package name */
    private T f3870c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final T a() {
        this.f3869b = e.f3889c;
        return null;
    }

    protected abstract T f();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3869b != e.f3890d) {
            int i = b.f3863a[this.f3869b - 1];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f3869b = e.f3890d;
            this.f3870c = f();
            if (this.f3869b == e.f3889c) {
                return false;
            }
            this.f3869b = e.f3887a;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f3869b = e.f3888b;
            T t = this.f3870c;
            this.f3870c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
