package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcnv  reason: default package */
/* loaded from: classes5.dex */
final class dcnv implements Iterator<Map.Entry> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ dcnx b;

    public dcnv(dcnx dcnxVar, Iterator it) {
        this.b = dcnxVar;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        return new dcnw((Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        this.b.c();
    }
}
