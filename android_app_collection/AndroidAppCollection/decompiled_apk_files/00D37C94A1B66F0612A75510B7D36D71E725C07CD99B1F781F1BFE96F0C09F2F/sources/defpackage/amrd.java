package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amrd  reason: default package */
/* loaded from: classes.dex */
final class amrd implements Iterator, j$.util.Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ amre c;

    public amrd(amre amreVar, Iterator it) {
        this.c = amreVar;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        aqxo.z(this.a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        this.c.a.b -= collection.size();
        collection.clear();
        this.a = null;
    }
}
