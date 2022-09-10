package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dchl  reason: default package */
/* loaded from: classes.dex */
public final class dchl {
    private dchl() {
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    @SafeVarargs
    public static <E> ArrayList<E> b(E... eArr) {
        dbsk.s(eArr);
        ArrayList<E> arrayList = new ArrayList<>(e(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> c(Iterable<? extends E> iterable) {
        dbsk.s(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return d(iterable.iterator());
    }

    public static <E> ArrayList<E> d(Iterator<? extends E> it) {
        ArrayList<E> a = a();
        dcgh.g(a, it);
        return a;
    }

    static int e(int i) {
        dbzb.d(i, "arraySize");
        return decl.b(i + 5 + (i / 10));
    }

    public static <E> ArrayList<E> f(int i) {
        dbzb.d(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> g(int i) {
        return new ArrayList<>(e(i));
    }

    public static <E> LinkedList<E> h() {
        return new LinkedList<>();
    }

    public static <E> LinkedList<E> i(Iterable<? extends E> iterable) {
        LinkedList<E> h = h();
        dcft.h(h, iterable);
        return h;
    }

    public static <E> List<E> j(E e, E[] eArr) {
        return new dchb(e, eArr);
    }

    public static <F, T> List<T> k(List<F> list, dbrn<? super F, ? extends T> dbrnVar) {
        if (list instanceof RandomAccess) {
            return new dchi(list, dbrnVar);
        }
        return new dchk(list, dbrnVar);
    }

    public static <T> List<T> l(List<T> list) {
        if (list instanceof dcdc) {
            return ((dcdc) list).SL();
        }
        if (list instanceof dchg) {
            return ((dchg) list).a;
        }
        if (list instanceof RandomAccess) {
            return new dche(list);
        }
        return new dchg(list);
    }

    public static boolean m(List<?> list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!dbsd.a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<?> it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it2.hasNext()) {
                    if (!dbsd.a(it.next(), it2.next())) {
                        break;
                    }
                } else {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static <T> List<List<T>> n(List<T> list) {
        dbsk.s(list);
        dbsk.a(true);
        if (list instanceof RandomAccess) {
            return new dchd(list);
        }
        return new dchc(list);
    }
}
