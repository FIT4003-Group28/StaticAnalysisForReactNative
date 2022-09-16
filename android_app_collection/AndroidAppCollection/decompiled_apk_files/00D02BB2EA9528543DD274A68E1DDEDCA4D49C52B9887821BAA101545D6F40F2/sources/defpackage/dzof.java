package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzof  reason: default package */
/* loaded from: classes6.dex */
public final class dzof<K, V> implements Map.Entry {
    protected final K a;
    protected final V b;

    public dzof(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a == entry.getKey() && this.b == entry.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.a);
        V v = this.b;
        return identityHashCode ^ (v == null ? 0 : System.identityHashCode(v));
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a + "->" + this.b;
    }
}
