package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcod  reason: default package */
/* loaded from: classes5.dex */
final class dcod<K, V> extends dcom<K, Collection<V>> {
    private static final long serialVersionUID = 0;
    transient Set<Map.Entry<K, Collection<V>>> a;
    transient Collection<Collection<V>> b;

    public dcod(Map<K, Collection<V>> map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.dcom, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.dcom, java.util.Map
    public final Set<Map.Entry<K, Collection<V>>> entrySet() {
        Set<Map.Entry<K, Collection<V>>> set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new dcog(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.dcom, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection e;
        synchronized (this.g) {
            Collection collection = (Collection) super.get(obj);
            e = collection == null ? null : dcos.e(collection, this.g);
        }
        return e;
    }

    @Override // defpackage.dcom, java.util.Map
    public final Collection<Collection<V>> values() {
        Collection<Collection<V>> collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new dcoi(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}
