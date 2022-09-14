package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcnq  reason: default package */
/* loaded from: classes5.dex */
final class dcnq {
    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Object comparator2;
        dbsk.s(comparator);
        dbsk.s(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = dcln.a;
            }
        } else if (!(iterable instanceof dcnp)) {
            return false;
        } else {
            comparator2 = ((dcnp) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
