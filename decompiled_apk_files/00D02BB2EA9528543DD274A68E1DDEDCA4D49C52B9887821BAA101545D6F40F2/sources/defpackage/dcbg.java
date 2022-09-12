package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcbg  reason: default package */
/* loaded from: classes.dex */
public abstract class dcbg<E> implements Iterable<E> {
    private final dbsg<Iterable<E>> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcbg() {
        this.a = dbpy.a;
    }

    public dcbg(Iterable<E> iterable) {
        dbsk.s(iterable);
        this.a = dbsg.j(this == iterable ? null : iterable);
    }

    private static <T> dcbg<T> G(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            dbsk.s(iterable);
        }
        return new dcbf(iterableArr);
    }

    public static <E> dcbg<E> b(Iterable<E> iterable) {
        if (iterable instanceof dcbg) {
            return (dcbg) iterable;
        }
        return new dcbc(iterable, iterable);
    }

    public static <E> dcbg<E> c(E[] eArr) {
        return b(Arrays.asList(eArr));
    }

    public static <T> dcbg<T> d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return G(iterable, iterable2);
    }

    public static <T> dcbg<T> e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return G(iterable, iterable2, iterable3);
    }

    public static <T> dcbg<T> f(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return G(iterable, iterable2, iterable3, iterable4);
    }

    public static <T> dcbg<T> g(Iterable<? extends T>... iterableArr) {
        return G((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <T> dcbg<T> h(Iterable<? extends Iterable<? extends T>> iterable) {
        dbsk.s(iterable);
        return new dcbd(iterable);
    }

    public static <E> dcbg<E> i() {
        return b(dcdc.e());
    }

    public static <E> dcbg<E> j(E e, E... eArr) {
        return b(dchl.j(e, eArr));
    }

    public final dcdc<E> A(Comparator<? super E> comparator) {
        return dcdc.w(dclu.d(comparator), a());
    }

    public final dcep<E> B() {
        return dcep.L(a());
    }

    public final <K> dcde<K, E> C(dbrn<? super E, K> dbrnVar) {
        return dckz.e(a(), dbrnVar);
    }

    public final <K> dcdn<K, E> D(dbrn<? super E, K> dbrnVar) {
        return dcjz.o(a(), dbrnVar);
    }

    public final E[] E(Class<E> cls) {
        return (E[]) dcft.e(a(), cls);
    }

    public final E F(int i) {
        return (E) dcft.p(a(), i);
    }

    public final Iterable<E> a() {
        return this.a.c(this);
    }

    public final int k() {
        return dcft.a(a());
    }

    public final boolean l(Object obj) {
        Iterable<E> a = a();
        if (a instanceof Collection) {
            return dbze.b((Collection) a, obj);
        }
        return dcgh.c(a.iterator(), obj);
    }

    public final dcbg<E> m(Iterable<? extends E> iterable) {
        return d(a(), iterable);
    }

    public final dcbg<E> n(E... eArr) {
        return d(a(), Arrays.asList(eArr));
    }

    public final dcbg<E> o(dbsl<? super E> dbslVar) {
        return b(dcft.i(a(), dbslVar));
    }

    public final boolean p(dbsl<? super E> dbslVar) {
        return dcft.j(a(), dbslVar);
    }

    public final boolean q(dbsl<? super E> dbslVar) {
        return dcft.k(a(), dbslVar);
    }

    public final dbsg<E> r(dbsl<? super E> dbslVar) {
        return dcft.m(a(), dbslVar);
    }

    public final <T> dcbg<T> s(dbrn<? super E, T> dbrnVar) {
        return b(dcft.o(a(), dbrnVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> dcbg<T> t(dbrn<? super E, ? extends Iterable<? extends T>> dbrnVar) {
        return h(s(dbrnVar));
    }

    public String toString() {
        return dcft.b(a());
    }

    public final dbsg<E> u() {
        Iterator<E> it = a().iterator();
        return it.hasNext() ? dbsg.i(it.next()) : dbpy.a;
    }

    public final dbsg<E> v() {
        E next;
        Iterable<E> a = a();
        if (a instanceof List) {
            List list = (List) a;
            return list.isEmpty() ? dbpy.a : dbsg.i(list.get(list.size() - 1));
        }
        Iterator<E> it = a.iterator();
        if (!it.hasNext()) {
            return dbpy.a;
        }
        if (!(a instanceof SortedSet)) {
            do {
                next = it.next();
            } while (it.hasNext());
            return dbsg.i(next);
        }
        return dbsg.i(((SortedSet) a).last());
    }

    public final dcbg<E> w(int i) {
        return b(dcft.u(a(), i));
    }

    public final dcbg<E> x(int i) {
        return b(dcft.v(a(), i));
    }

    public final boolean y() {
        return !a().iterator().hasNext();
    }

    public final dcdc<E> z() {
        return dcdc.q(a());
    }
}
