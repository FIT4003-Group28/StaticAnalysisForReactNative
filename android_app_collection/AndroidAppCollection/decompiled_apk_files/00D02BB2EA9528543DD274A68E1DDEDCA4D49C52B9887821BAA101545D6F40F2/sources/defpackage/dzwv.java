package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzwv  reason: default package */
/* loaded from: classes6.dex */
public final class dzwv implements Iterator<dztx> {
    private final Iterator a;
    private int b;

    public dzwv(dzww dzwwVar) {
        this.a = new cduw(((cduv) dzwwVar.a).a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ dztx next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            dzti.c();
        }
        return new dztx(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
