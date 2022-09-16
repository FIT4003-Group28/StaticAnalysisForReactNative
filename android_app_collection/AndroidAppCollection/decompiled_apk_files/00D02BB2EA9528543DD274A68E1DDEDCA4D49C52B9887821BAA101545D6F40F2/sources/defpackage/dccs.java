package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dccs  reason: default package */
/* loaded from: classes.dex */
class dccs<K, V> extends dbyj<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K a;
    final V b;

    public dccs(K k, V v) {
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
        throw new UnsupportedOperationException();
    }
}
