package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dckz  reason: default package */
/* loaded from: classes5.dex */
public final class dckz {
    public static <K, V> dcna<K, V> a(Map<K, Collection<V>> map, dbty<? extends Set<V>> dbtyVar) {
        return new dckr(map, dbtyVar);
    }

    public static <K, V> dcha<K, V> b(dcha<K, V> dchaVar) {
        return new dcol(dchaVar, null);
    }

    public static <V> Collection<V> c(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    public static <K, V1, V2> dcka<K, V2> d(dcka<K, V1> dckaVar, dbrn<? super V1, V2> dbrnVar) {
        dbsk.s(dbrnVar);
        return new dckv(dckaVar, dcjz.u(dbrnVar));
    }

    public static <K, V> dcde<K, V> e(Iterable<V> iterable, dbrn<? super V, K> dbrnVar) {
        Iterator<V> it = iterable.iterator();
        dbsk.s(dbrnVar);
        dcdd a = dcde.a();
        while (it.hasNext()) {
            V next = it.next();
            dbsk.t(next, it);
            a.b(dbrnVar.a(next), next);
        }
        return a.a();
    }

    public static boolean f(dcka<?, ?> dckaVar, Object obj) {
        if (obj == dckaVar) {
            return true;
        }
        if (!(obj instanceof dcka)) {
            return false;
        }
        return dckaVar.L().equals(((dcka) obj).L());
    }
}
