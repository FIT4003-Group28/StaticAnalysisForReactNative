package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzns  reason: default package */
/* loaded from: classes6.dex */
public final class dzns<K, V> implements dzqo<K, V> {
    protected final K a;
    protected final V b;

    public dzns(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k = this.a;
        if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
            V v = this.b;
            if (v == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (v.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
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
        K k = this.a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a + "->" + this.b;
    }
}
