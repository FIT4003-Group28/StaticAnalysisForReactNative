package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcjy  reason: default package */
/* loaded from: classes.dex */
abstract class dcjy<K, V> extends AbstractMap<K, V> {
    private transient Set<Map.Entry<K, V>> a;
    private transient Set<K> b;
    private transient Collection<V> c;

    public Collection<V> SD() {
        return new dcjx(this);
    }

    public abstract Set<Map.Entry<K, V>> a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.a;
        if (set == null) {
            Set<Map.Entry<K, V>> a = a();
            this.a = a;
            return a;
        }
        return set;
    }

    public Set<K> j() {
        return new dcjt(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.b;
        if (set == null) {
            Set<K> j = j();
            this.b = j;
            return j;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection == null) {
            Collection<V> SD = SD();
            this.c = SD;
            return SD;
        }
        return collection;
    }
}
