package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcca  reason: default package */
/* loaded from: classes5.dex */
final class dcca<K, V> extends dcce<K, V, Map.Entry<V, K>> {
    public dcca(dccf<K, V> dccfVar) {
        super(dccfVar);
    }

    @Override // defpackage.dcce
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new dcbx(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = this.b.d(key);
            if (d != -1 && dbsd.a(this.b.a[d], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = dccj.b(key);
            int e = this.b.e(key, b);
            if (e == -1 || !dbsd.a(this.b.a[e], value)) {
                return false;
            }
            this.b.h(e, b);
            return true;
        }
        return false;
    }
}
