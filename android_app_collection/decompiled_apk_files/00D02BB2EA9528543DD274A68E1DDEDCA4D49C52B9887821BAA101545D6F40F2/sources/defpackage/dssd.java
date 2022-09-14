package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dssd  reason: default package */
/* loaded from: classes.dex */
public final class dssd<K, V> extends LinkedHashMap<K, V> {
    public static final dssd b;
    public boolean a;

    static {
        dssd dssdVar = new dssd();
        b = dssdVar;
        dssdVar.b();
    }

    private dssd() {
        this.a = true;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return dsrk.e((byte[]) obj);
        }
        if (obj instanceof dsrb) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final dssd<K, V> a() {
        return isEmpty() ? new dssd<>() : new dssd<>(this);
    }

    public final void b() {
        this.a = false;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                    equals = value.equals(obj2);
                    continue;
                } else {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += d(entry.getValue()) ^ d(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        c();
        dsrk.h(k);
        dsrk.h(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c();
        for (K k : map.keySet()) {
            dsrk.h(k);
            dsrk.h(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        return (V) super.remove(obj);
    }

    private dssd(Map<K, V> map) {
        super(map);
        this.a = true;
    }
}
