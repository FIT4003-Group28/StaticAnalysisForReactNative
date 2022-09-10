package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcgi  reason: default package */
/* loaded from: classes5.dex */
final class dcgi implements Iterator<Map.Entry> {
    dcgj a;
    dcgj b;
    final /* synthetic */ dcgn c;

    public dcgi(dcgn dcgnVar) {
        this.c = dcgnVar;
        this.a = dcgnVar.d.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.c.d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        if (hasNext()) {
            dcgj dcgjVar = this.a;
            this.b = dcgjVar;
            this.a = dcgjVar.h;
            return dcgjVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.b != null);
        dcgn dcgnVar = this.c;
        dcgj dcgjVar = this.b;
        dcgnVar.G(dcgjVar.a, dcgjVar.b);
        this.b = null;
    }
}
