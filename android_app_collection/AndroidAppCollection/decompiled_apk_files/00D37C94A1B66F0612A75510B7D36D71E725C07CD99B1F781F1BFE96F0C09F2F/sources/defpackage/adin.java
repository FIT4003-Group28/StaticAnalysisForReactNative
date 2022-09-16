package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adin  reason: default package */
/* loaded from: classes.dex */
public final class adin implements Iterator, j$.util.Iterator {
    final Iterator a;
    final /* synthetic */ adip b;

    public adin(adip adipVar) {
        this.b = adipVar;
        this.a = adipVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final adio mo416next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return new adio((String) entry.getKey(), (String) entry.getValue());
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
