package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dbpz  reason: default package */
/* loaded from: classes.dex */
abstract class dbpz<T> implements Iterator<T> {
    private T a;
    private int b = 2;

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b() {
        this.b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dbsk.l(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.b = 4;
                this.a = a();
                if (this.b != 3) {
                    this.b = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.b = 2;
            T t = this.a;
            this.a = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
