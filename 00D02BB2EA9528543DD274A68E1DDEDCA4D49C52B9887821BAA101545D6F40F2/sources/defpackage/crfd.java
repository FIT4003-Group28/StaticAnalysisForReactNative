package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: crfd  reason: default package */
/* loaded from: classes5.dex */
public final class crfd implements Iterator<amut> {
    @dzsi
    private amuo a;
    private int b;

    public crfd(amut amutVar) {
        amuo a = amutVar.a();
        this.a = a;
        this.b = a.D.indexOf(amutVar);
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final amut next() {
        amuo amuoVar = this.a;
        dbsk.s(amuoVar);
        amut amutVar = amuoVar.D.get(this.b);
        this.b++;
        while (true) {
            amuo amuoVar2 = this.a;
            if (amuoVar2 == null || this.b < amuoVar2.D.size()) {
                break;
            }
            this.a = this.a.Q;
            this.b = 0;
        }
        return amutVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        amuo amuoVar = this.a;
        return amuoVar != null && this.b < amuoVar.D.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
