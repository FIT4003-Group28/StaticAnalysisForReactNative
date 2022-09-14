package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzty  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzty implements Iterator<Integer> {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
