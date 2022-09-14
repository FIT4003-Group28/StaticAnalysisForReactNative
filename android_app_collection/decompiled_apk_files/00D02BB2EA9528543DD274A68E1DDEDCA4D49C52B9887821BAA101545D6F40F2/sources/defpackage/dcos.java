package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcos  reason: default package */
/* loaded from: classes5.dex */
final class dcos {
    public static <E> Collection<E> a(Collection<E> collection, Object obj) {
        return new dcoj(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> Set<E> b(Set<E> set, Object obj) {
        return new dcoq(set, obj);
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, Object obj) {
        return new dcor(sortedSet, obj);
    }

    public static <E> List<E> d(List<E> list, Object obj) {
        if (list instanceof RandomAccess) {
            return new dcop(list, obj);
        }
        return new dcok(list, obj);
    }

    public static <E> Collection<E> e(Collection<E> collection, Object obj) {
        if (collection instanceof SortedSet) {
            return c((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return b((Set) collection, obj);
        }
        if (collection instanceof List) {
            return d((List) collection, obj);
        }
        return a(collection, obj);
    }
}
