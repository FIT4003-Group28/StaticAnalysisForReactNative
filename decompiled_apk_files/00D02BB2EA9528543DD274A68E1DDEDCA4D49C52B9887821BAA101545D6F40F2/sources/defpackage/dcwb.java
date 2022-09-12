package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcwb  reason: default package */
/* loaded from: classes5.dex */
final class dcwb implements Iterator<Integer> {
    final /* synthetic */ Iterator a;
    private dcwc b;
    private int c = 0;

    public dcwb(Iterator it) {
        this.a = it;
        this.b = (dcwc) it.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        int i = this.c;
        if (i < this.b.b) {
            this.c = i + 1;
        } else {
            this.c = 1;
            this.b = (dcwc) this.a.next();
        }
        return Integer.valueOf(this.b.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
