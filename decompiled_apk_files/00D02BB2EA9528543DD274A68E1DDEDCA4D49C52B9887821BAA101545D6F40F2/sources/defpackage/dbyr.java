package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dbyr  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbyr<T> extends dcpd<T> {
    private T a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dbyr(T t) {
        this.a = t;
    }

    protected abstract T a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.a;
                this.a = a(t);
                return t;
            } catch (Throwable th) {
                this.a = a(this.a);
                throw th;
            }
        }
        throw new NoSuchElementException();
    }
}
