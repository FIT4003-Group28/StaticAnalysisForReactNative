package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dsro  reason: default package */
/* loaded from: classes6.dex */
final class dsro<K> implements Map.Entry<K, Object> {
    public final Map.Entry<K, dsrq> a;

    public dsro(Map.Entry<K, dsrq> entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof dssj)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        dsrq value = this.a.getValue();
        dssj dssjVar = value.a;
        value.b = null;
        value.a = (dssj) obj;
        return dssjVar;
    }
}
