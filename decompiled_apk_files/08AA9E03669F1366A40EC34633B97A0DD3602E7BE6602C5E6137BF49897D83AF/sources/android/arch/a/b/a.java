package android.arch.a.b;

import android.arch.a.b.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f51a = new HashMap<>();

    @Override // android.arch.a.b.b
    protected b.c<K, V> a(K k) {
        return this.f51a.get(k);
    }

    @Override // android.arch.a.b.b
    public V a(K k, V v) {
        b.c<K, V> a2 = a((a<K, V>) k);
        if (a2 != null) {
            return a2.f57b;
        }
        this.f51a.put(k, b(k, v));
        return null;
    }

    @Override // android.arch.a.b.b
    public V b(K k) {
        V v = (V) super.b(k);
        this.f51a.remove(k);
        return v;
    }

    public boolean c(K k) {
        return this.f51a.containsKey(k);
    }

    public Map.Entry<K, V> d(K k) {
        if (c(k)) {
            return this.f51a.get(k).f59d;
        }
        return null;
    }
}
