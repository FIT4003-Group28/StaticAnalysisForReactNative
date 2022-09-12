package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcha  reason: default package */
/* loaded from: classes.dex */
public interface dcha<K, V> extends dcka<K, V> {
    @Override // defpackage.dcka
    Map<K, Collection<V>> L();

    List<V> c(K k);

    List<V> d(Object obj);

    List<V> e(K k, Iterable<? extends V> iterable);
}
