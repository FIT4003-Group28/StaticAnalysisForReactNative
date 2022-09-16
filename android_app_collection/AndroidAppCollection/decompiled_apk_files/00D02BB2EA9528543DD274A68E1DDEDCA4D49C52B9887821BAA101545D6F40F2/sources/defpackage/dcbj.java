package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcbj  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbj<T> extends dcbq implements Iterator<T> {
    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    protected abstract Iterator<T> a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a().hasNext();
    }

    public T next() {
        return a().next();
    }

    public void remove() {
        a().remove();
    }
}
