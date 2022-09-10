package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcnu  reason: default package */
/* loaded from: classes5.dex */
final class dcnu implements Iterator<dcot> {
    final Iterator<Map.Entry> a;
    Map.Entry b;
    Iterator<Map.Entry> c = dcgd.a;
    final /* synthetic */ dcoc d;

    public dcnu(dcoc dcocVar) {
        this.d = dcocVar;
        this.a = dcocVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ dcot next() {
        if (!this.c.hasNext()) {
            Map.Entry next = this.a.next();
            this.b = next;
            this.c = ((Map) next.getValue()).entrySet().iterator();
        }
        Map.Entry next2 = this.c.next();
        return dcox.a(this.b.getKey(), next2.getKey(), next2.getValue());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        if (((Map) this.b.getValue()).isEmpty()) {
            this.a.remove();
            this.b = null;
        }
    }
}
