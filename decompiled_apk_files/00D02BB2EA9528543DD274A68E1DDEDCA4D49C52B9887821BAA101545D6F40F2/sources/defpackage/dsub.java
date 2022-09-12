package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dsub  reason: default package */
/* loaded from: classes6.dex */
final class dsub implements Iterator<String> {
    final Iterator<String> a;
    final /* synthetic */ dsuc b;

    public dsub(dsuc dsucVar) {
        this.b = dsucVar;
        this.a = dsucVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
