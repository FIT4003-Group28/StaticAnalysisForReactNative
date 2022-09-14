package c.e.a.b.d.g;

import java.util.Map;
/* loaded from: classes.dex */
final class r5<K> implements Map.Entry<K, Object> {

    /* renamed from: b  reason: collision with root package name */
    private Map.Entry<K, p5> f4385b;

    private r5(Map.Entry<K, p5> entry) {
        this.f4385b = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f4385b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4385b.getValue() == null) {
            return null;
        }
        p5.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof k6) {
            return this.f4385b.getValue().a((k6) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
