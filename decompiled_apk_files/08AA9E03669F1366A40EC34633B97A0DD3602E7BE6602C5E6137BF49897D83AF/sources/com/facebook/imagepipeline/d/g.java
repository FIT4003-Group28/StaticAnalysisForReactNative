package com.facebook.imagepipeline.d;

import com.android.internal.util.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: CountingLruMap.java */
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final ac<V> f2578a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f2579b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f2580c = 0;

    public g(ac<V> acVar) {
        this.f2578a = acVar;
    }

    public synchronized int a() {
        return this.f2579b.size();
    }

    public synchronized int b() {
        return this.f2580c;
    }

    public synchronized K c() {
        return this.f2579b.isEmpty() ? null : this.f2579b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> a(Predicate<K> predicate) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f2579b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f2579b.entrySet()) {
            if (predicate == null || predicate.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized V a(K k) {
        return this.f2579b.get(k);
    }

    public synchronized V a(K k, V v) {
        V remove;
        remove = this.f2579b.remove(k);
        this.f2580c -= c(remove);
        this.f2579b.put(k, v);
        this.f2580c += c(v);
        return remove;
    }

    public synchronized V b(K k) {
        V remove;
        remove = this.f2579b.remove(k);
        this.f2580c -= c(remove);
        return remove;
    }

    public synchronized ArrayList<V> b(Predicate<K> predicate) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f2579b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (predicate == null || predicate.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f2580c -= c(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    private int c(V v) {
        if (v == null) {
            return 0;
        }
        return this.f2578a.a(v);
    }
}
