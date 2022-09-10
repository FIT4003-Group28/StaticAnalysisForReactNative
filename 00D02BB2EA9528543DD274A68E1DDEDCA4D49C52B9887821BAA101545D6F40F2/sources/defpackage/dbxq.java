package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxq  reason: default package */
/* loaded from: classes5.dex */
final class dbxq implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ dbxr c;

    public dbxq(dbxr dbxrVar, Iterator it) {
        this.c = dbxrVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        dbye.C(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
