package defpackage;
/* compiled from: PG */
/* renamed from: dcgw  reason: default package */
/* loaded from: classes5.dex */
final class dcgw<K, V> extends dbyj<K, V> {
    final K a;
    V b;
    dcgw<K, V> c;
    dcgw<K, V> d;
    dcgw<K, V> e;
    dcgw<K, V> f;

    public dcgw(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.b;
        this.b = v;
        return v2;
    }
}
