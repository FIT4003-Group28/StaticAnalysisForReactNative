package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dclu  reason: default package */
/* loaded from: classes.dex */
public abstract class dclu<T> implements Comparator<T> {
    public static <T> dclu<T> d(Comparator<T> comparator) {
        if (comparator instanceof dclu) {
            return (dclu) comparator;
        }
        return new dbzt(comparator);
    }

    public static <T> dclu<T> e(List<T> list) {
        return new dcbb(dcjz.G(list));
    }

    public static <T> dclu<T> f(T t, T... tArr) {
        return e(dchl.j(t, tArr));
    }

    public <S extends T> dclu<S> St() {
        return new dclo(this);
    }

    public <S extends T> dclu<S> b() {
        return new dclp(this);
    }

    public <S extends T> dclu<S> c() {
        return new dcmx(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public final <F> dclu<F> g(dbrn<F, ? extends T> dbrnVar) {
        return new dbza(dbrnVar, this);
    }

    public final <U extends T> dclu<U> h(Comparator<? super U> comparator) {
        dbsk.s(comparator);
        return new dbzy(this, comparator);
    }

    public <E extends T> E i(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) k(next, it.next());
        }
        return next;
    }

    public <E extends T> E j(Iterable<E> iterable) {
        return (E) i(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E k(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <E extends T> E l(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) n(next, it.next());
        }
        return next;
    }

    public <E extends T> E m(Iterable<E> iterable) {
        return (E) l(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E n(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public final <E extends T> List<E> o(Iterable<E> iterable) {
        Object[] g = dcft.g(iterable);
        Arrays.sort(g, this);
        return dchl.c(Arrays.asList(g));
    }

    public final boolean p(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }
}
