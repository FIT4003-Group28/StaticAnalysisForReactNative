package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: dcnm  reason: default package */
/* loaded from: classes.dex */
public final class dcnm {
    private dcnm() {
    }

    public static <E extends Enum<E>> dcep<E> a(E e, E... eArr) {
        return dccw.b(EnumSet.of((Enum) e, (Enum[]) eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends Enum<E>> dcep<E> b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            if (iterable.isEmpty()) {
                return dcmr.a;
            }
            return dccw.b(EnumSet.copyOf((Collection) iterable));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return dcmr.a;
        }
        EnumSet of = EnumSet.of((Enum) it.next());
        dcgh.g(of, it);
        return dccw.b(of);
    }

    public static <E> HashSet<E> c() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> d(E... eArr) {
        HashSet<E> f = f(eArr.length);
        Collections.addAll(f, eArr);
        return f;
    }

    public static <E> HashSet<E> e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        HashSet<E> c = c();
        dcgh.g(c, it);
        return c;
    }

    public static <E> HashSet<E> f(int i) {
        return new HashSet<>(dcjz.g(i));
    }

    public static <E> Set<E> g() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> LinkedHashSet<E> h() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> i(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> h = h();
        dcft.h(h, iterable);
        return h;
    }

    public static <E extends Comparable> TreeSet<E> j() {
        return new TreeSet<>();
    }

    public static <E> TreeSet<E> k(Comparator<? super E> comparator) {
        dbsk.s(comparator);
        return new TreeSet<>(comparator);
    }

    public static <E> Set<E> l() {
        return Collections.newSetFromMap(dcjz.l());
    }

    public static <E> CopyOnWriteArraySet<E> m() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E> dcnk<E> n(Set<? extends E> set, Set<? extends E> set2) {
        dbsk.t(set, "set1");
        dbsk.t(set2, "set2");
        return new dcnc(set, set2);
    }

    public static <E> dcnk<E> o(Set<E> set, Set set2) {
        dbsk.t(set, "set1");
        dbsk.t(set2, "set2");
        return new dcne(set, set2);
    }

    public static <E> dcnk<E> p(Set<E> set, Set set2) {
        dbsk.t(set, "set1");
        dbsk.t(set2, "set2");
        return new dcng(set, set2);
    }

    public static <E> Set<E> q(Set<E> set, dbsl<? super E> dbslVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof dcnh) {
                dcnh dcnhVar = (dcnh) sortedSet;
                return new dcni((SortedSet) dcnhVar.a, dbst.b(dcnhVar.b, dbslVar));
            }
            dbsk.s(sortedSet);
            dbsk.s(dbslVar);
            return new dcni(sortedSet, dbslVar);
        } else if (set instanceof dcnh) {
            dcnh dcnhVar2 = (dcnh) set;
            return new dcnh((Set) dcnhVar2.a, dbst.b(dcnhVar2.b, dbslVar));
        } else {
            dbsk.s(set);
            dbsk.s(dbslVar);
            return new dcnh(set, dbslVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> NavigableSet<E> t(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof dccr) || (navigableSet instanceof dcnl)) ? navigableSet : new dcnl(navigableSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return true == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(Set<?> set, Collection<?> collection) {
        dbsk.s(collection);
        if (collection instanceof dclb) {
            collection = ((dclb) collection).j();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return u(set, collection.iterator());
        }
        return dcgh.d(set.iterator(), collection);
    }
}
