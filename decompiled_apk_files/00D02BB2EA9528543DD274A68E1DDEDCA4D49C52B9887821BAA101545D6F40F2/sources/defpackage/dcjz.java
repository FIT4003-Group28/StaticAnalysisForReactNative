package defpackage;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dcjz  reason: default package */
/* loaded from: classes.dex */
public final class dcjz {
    public static <V> V A(Map<?, V> map, Object obj) {
        dbsk.s(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(Map<?, ?> map, Object obj) {
        dbsk.s(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V C(Map<?, V> map, Object obj) {
        dbsk.s(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> boolean D(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(q((Map.Entry) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String E(Map<?, ?> map) {
        StringBuilder f = dbze.f(map.size());
        f.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                f.append(", ");
            }
            f.append(entry.getKey());
            f.append('=');
            f.append(entry.getValue());
            z = false;
        }
        f.append('}');
        return f.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> K F(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> dcdn<E, Integer> G(Collection<E> collection) {
        dcdg dcdgVar = new dcdg(collection.size());
        int i = 0;
        for (E e : collection) {
            dcdgVar.f(e, Integer.valueOf(i));
            i++;
        }
        return dcdgVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new dcja(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new dcjb(it);
    }

    public static <K extends Enum<K>, V> dcdn<K, V> c(Map<K, ? extends V> map) {
        if (map instanceof dccu) {
            return (dccu) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return (dcdn<K, V>) dcmn.a;
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        dbzb.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((EnumMap) key, (K) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            dbzb.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return (dcdn<K, V>) dcmn.a;
        }
        if (size == 1) {
            Map.Entry entry = (Map.Entry) dcft.c(enumMap.entrySet());
            return dcdn.k((Enum) entry.getKey(), entry.getValue());
        }
        return new dccu(enumMap);
    }

    public static <K, V> HashMap<K, V> d() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> e(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> f(int i) {
        return new HashMap<>(g(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i) {
        if (i < 3) {
            dbzb.d(i, "expectedSize");
            return i + 1;
        } else if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        } else {
            return (int) ((i / 0.75f) + 1.0f);
        }
    }

    public static <K, V> LinkedHashMap<K, V> h() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> i(int i) {
        return new LinkedHashMap<>(g(i));
    }

    public static <K, V> ConcurrentMap<K, V> j() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> k(Class<K> cls) {
        return new EnumMap<>(cls);
    }

    public static <K, V> IdentityHashMap<K, V> l() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, dbrn<? super K, V> dbrnVar) {
        return new dcjc(set.iterator(), dbrnVar);
    }

    public static <K, V> dcdn<K, V> n(Iterator<K> it, dbrn<? super K, V> dbrnVar) {
        dbsk.s(dbrnVar);
        LinkedHashMap h = h();
        while (it.hasNext()) {
            K next = it.next();
            h.put(next, dbrnVar.a(next));
        }
        return dcdn.r(h);
    }

    public static <K, V> dcdn<K, V> o(Iterable<V> iterable, dbrn<? super V, K> dbrnVar) {
        dbsk.s(dbrnVar);
        dcdg p = dcdn.p();
        for (V v : iterable) {
            p.f(dbrnVar.a(v), v);
        }
        try {
            return p.b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static <K, V> Map.Entry<K, V> p(K k, V v) {
        return new dccs(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Map.Entry<K, V> q(Map.Entry<? extends K, ? extends V> entry) {
        dbsk.s(entry);
        return new dcjd(entry);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> dcpd<Map.Entry<K, V>> r(Iterator<Map.Entry<K, V>> it) {
        return new dcje(it);
    }

    public static <K, V1, V2> Map<K, V2> s(Map<K, V1> map, dbrn<? super V1, V2> dbrnVar) {
        return t(map, u(dbrnVar));
    }

    public static <K, V1, V2> Map<K, V2> t(Map<K, V1> map, dcjj<? super K, ? super V1, V2> dcjjVar) {
        return new dcju(map, dcjjVar);
    }

    public static <K, V1, V2> dcjj<K, V1, V2> u(dbrn<? super V1, V2> dbrnVar) {
        dbsk.s(dbrnVar);
        return new dcjf(dbrnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V1, V2> dbrn<V1, V2> v(dcjj<? super K, V1, V2> dcjjVar, K k) {
        return new dciw(dcjjVar, k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V1, V2> dbrn<Map.Entry<K, V1>, Map.Entry<K, V2>> w(dcjj<? super K, ? super V1, V2> dcjjVar) {
        dbsk.s(dcjjVar);
        return new dciz(dcjjVar);
    }

    public static <K, V> Map<K, V> x(Map<K, V> map, dbsl<? super K> dbslVar) {
        dbsk.s(dbslVar);
        dbsl e = dbst.e(dbslVar, dcjh.KEY);
        dbsk.s(map);
        return new dcjp(map, dbslVar, e);
    }

    public static <K, V> Map<K, V> y(Map<K, V> map, dbsl<? super V> dbslVar) {
        return z(map, dbst.e(dbslVar, dcjh.VALUE));
    }

    public static <K, V> Map<K, V> z(Map<K, V> map, dbsl<? super Map.Entry<K, V>> dbslVar) {
        dbsk.s(dbslVar);
        if (map instanceof dcjg) {
            dcjg dcjgVar = (dcjg) map;
            return new dcjo(dcjgVar.a, dbst.b(dcjgVar.b, dbslVar));
        }
        dbsk.s(map);
        return new dcjo(map, dbslVar);
    }
}
