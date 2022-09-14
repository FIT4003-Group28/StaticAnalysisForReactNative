package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class q5<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f4371b;

    public q5(Iterator<Map.Entry<K, Object>> it) {
        this.f4371b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4371b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f4371b.next();
        return next.getValue() instanceof p5 ? new r5(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4371b.remove();
    }
}
