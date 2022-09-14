package a.b.a.b;

import a.b.a.b.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f84f = new HashMap<>();

    @Override // a.b.a.b.b
    protected b.c<K, V> a(K k) {
        return this.f84f.get(k);
    }

    @Override // a.b.a.b.b
    public V b(K k, V v) {
        b.c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f90c;
        }
        this.f84f.put(k, a(k, v));
        return null;
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f84f.get(k).f92e;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f84f.containsKey(k);
    }

    @Override // a.b.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f84f.remove(k);
        return v;
    }
}
