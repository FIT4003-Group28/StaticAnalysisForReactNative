package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: debf  reason: default package */
/* loaded from: classes6.dex */
final class debf implements Iterator<Collection> {
    final /* synthetic */ Iterator a;

    public debf(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Collection next() {
        return (Collection) ((Map.Entry) this.a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
