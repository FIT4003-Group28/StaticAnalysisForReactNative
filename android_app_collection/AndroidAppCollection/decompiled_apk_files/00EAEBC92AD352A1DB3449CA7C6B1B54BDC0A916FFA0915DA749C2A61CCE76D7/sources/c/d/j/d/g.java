package c.d.j.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final v<V> f3210a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f3211b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f3212c = 0;

    public g(v<V> vVar) {
        this.f3210a = vVar;
    }

    private int c(V v) {
        if (v == null) {
            return 0;
        }
        return this.f3210a.a(v);
    }

    public synchronized int a() {
        return this.f3211b.size();
    }

    public synchronized V a(K k) {
        return this.f3211b.get(k);
    }

    public synchronized V a(K k, V v) {
        V remove;
        remove = this.f3211b.remove(k);
        this.f3212c -= c(remove);
        this.f3211b.put(k, v);
        this.f3212c += c(v);
        return remove;
    }

    public synchronized ArrayList<Map.Entry<K, V>> a(c.d.d.d.j<K> jVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f3211b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f3211b.entrySet()) {
            if (jVar == null || jVar.a(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized K b() {
        return this.f3211b.isEmpty() ? null : this.f3211b.keySet().iterator().next();
    }

    public synchronized V b(K k) {
        V remove;
        remove = this.f3211b.remove(k);
        this.f3212c -= c(remove);
        return remove;
    }

    public synchronized ArrayList<V> b(c.d.d.d.j<K> jVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f3211b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (jVar == null || jVar.a(next.getKey())) {
                arrayList.add(next.getValue());
                this.f3212c -= c(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    public synchronized int c() {
        return this.f3212c;
    }
}
