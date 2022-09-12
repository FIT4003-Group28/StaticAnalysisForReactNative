package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cqpz  reason: default package */
/* loaded from: classes.dex */
public abstract class cqpz<K, V> {
    private final Map<K, Reference<V>> a = new HashMap();
    private final Map<Reference<V>, K> b = new WeakHashMap();
    private final ReferenceQueue<V> c = new ReferenceQueue<>();

    public static <K, V> cqpz<K, V> b() {
        return new cqpx();
    }

    private final void e() {
        while (true) {
            Reference<? extends V> poll = this.c.poll();
            if (poll == null) {
                return;
            }
            K remove = this.b.remove(poll);
            if (remove != null) {
                this.a.remove(remove);
            }
        }
    }

    protected abstract Reference<V> a(V v, ReferenceQueue<V> referenceQueue);

    @dzsi
    public final V c(K k) {
        e();
        Reference<V> reference = this.a.get(k);
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public final void d(K k, V v) {
        e();
        Reference<V> reference = this.a.get(k);
        if (reference != null) {
            this.b.remove(reference);
        }
        Reference<V> a = a(v, this.c);
        this.a.put(k, a);
        this.b.put(a, k);
    }
}
