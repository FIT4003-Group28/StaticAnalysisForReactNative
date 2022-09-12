package defpackage;

import java.util.AbstractCollection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcks  reason: default package */
/* loaded from: classes5.dex */
abstract class dcks<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    public abstract dcka<K, V> a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a().p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return a().F(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return a().G(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return a().l();
    }
}
