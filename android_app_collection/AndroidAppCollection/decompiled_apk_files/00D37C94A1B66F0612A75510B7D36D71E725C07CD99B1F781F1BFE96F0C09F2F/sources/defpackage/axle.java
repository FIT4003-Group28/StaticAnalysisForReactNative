package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: axle  reason: default package */
/* loaded from: classes2.dex */
final class axle implements Iterator, j$.util.Iterator {
    int a = 0;
    final /* synthetic */ axlf b;

    public axle(axlf axlfVar) {
        this.b = axlfVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.size() || this.b.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (this.a < this.b.a.size()) {
            List list = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return list.get(i);
        }
        axlf axlfVar = this.b;
        axlfVar.a.add(axlfVar.b.next());
        return mo416next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
