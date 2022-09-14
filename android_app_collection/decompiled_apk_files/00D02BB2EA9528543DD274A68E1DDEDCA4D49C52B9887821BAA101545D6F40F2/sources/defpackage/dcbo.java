package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcbo  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbo<K, V> extends dcbq implements Map.Entry<K, V> {
    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    protected abstract Map.Entry<K, V> a();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return a().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return a().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode();
    }

    public V setValue(V v) {
        return a().setValue(v);
    }
}
