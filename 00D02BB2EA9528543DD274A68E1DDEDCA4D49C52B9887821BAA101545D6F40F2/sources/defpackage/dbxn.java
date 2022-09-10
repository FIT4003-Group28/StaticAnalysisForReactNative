package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxn  reason: default package */
/* loaded from: classes5.dex */
final class dbxn implements Iterator<Map.Entry> {
    final Iterator<Map.Entry> a;
    Collection b;
    final /* synthetic */ dbxo c;

    public dbxn(dbxo dbxoVar) {
        this.c = dbxoVar;
        this.a = dbxoVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.a.next();
        this.b = (Collection) next.getValue();
        return this.c.b(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.b != null);
        this.a.remove();
        dbye.C(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
