package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dguu  reason: default package */
/* loaded from: classes6.dex */
final class dguu<K, V> implements Map.Entry<K, V> {
    dguu<K, V> a;
    dguu<K, V> b;
    dguu<K, V> c;
    dguu<K, V> d;
    dguu<K, V> e;
    final K f;
    V g;
    int h;

    public dguu() {
        this.f = null;
        this.e = this;
        this.d = this;
    }

    public dguu(dguu<K, V> dguuVar, K k, dguu<K, V> dguuVar2, dguu<K, V> dguuVar3) {
        this.a = dguuVar;
        this.f = k;
        this.h = 1;
        this.d = dguuVar2;
        this.e = dguuVar3;
        dguuVar3.d = this;
        dguuVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f;
            if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.g;
                if (v == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (v.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.g;
        this.g = v;
        return v2;
    }

    public final String toString() {
        return this.f + "=" + this.g;
    }
}
