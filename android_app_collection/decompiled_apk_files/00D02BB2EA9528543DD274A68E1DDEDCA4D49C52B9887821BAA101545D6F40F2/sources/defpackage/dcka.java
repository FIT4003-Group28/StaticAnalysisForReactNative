package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcka  reason: default package */
/* loaded from: classes.dex */
public interface dcka<K, V> {
    boolean D();

    boolean F(Object obj, Object obj2);

    boolean G(Object obj, Object obj2);

    boolean H(dcka<? extends K, ? extends V> dckaVar);

    Collection<Map.Entry<K, V>> I();

    Set<K> J();

    Collection<V> K();

    Map<K, Collection<V>> L();

    void M(K k, Iterable<? extends V> iterable);

    boolean equals(Object obj);

    Collection<V> f(K k);

    int hashCode();

    int l();

    boolean m(Object obj);

    boolean n(K k, V v);

    void p();
}
