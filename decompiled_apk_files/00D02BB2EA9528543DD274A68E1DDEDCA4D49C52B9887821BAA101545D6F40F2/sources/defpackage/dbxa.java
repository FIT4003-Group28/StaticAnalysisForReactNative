package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxa  reason: default package */
/* loaded from: classes5.dex */
final class dbxa implements Iterator<Map.Entry> {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ dbxg c;

    public dbxa(dbxg dbxgVar, Iterator it) {
        this.c = dbxgVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.a = (Map.Entry) this.b.next();
        return new dbxb(this.c, this.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.a != null);
        Object value = this.a.getValue();
        this.b.remove();
        this.c.h(value);
        this.a = null;
    }
}
