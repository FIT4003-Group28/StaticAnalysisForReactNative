package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dcft  reason: default package */
/* loaded from: classes.dex */
public final class dcft {
    private static <T> void A(List<T> list, dbsl<? super T> dbslVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (dbslVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static <E> Collection<E> B(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return dchl.d(iterable.iterator());
    }

    private static <T> T C(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static int a(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return dcgh.b(iterable.iterator());
    }

    public static String b(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> T c(Iterable<T> iterable) {
        return (T) dcgh.f(iterable.iterator());
    }

    public static <T> T d(Iterable<? extends T> iterable, T t) {
        Iterator<? extends T> it = iterable.iterator();
        return it.hasNext() ? (T) dcgh.f(it) : t;
    }

    public static <T> T[] e(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) f(iterable, dclq.a(cls, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] f(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) B(iterable).toArray(tArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] g(Iterable<?> iterable) {
        return B(iterable).toArray();
    }

    public static <T> boolean h(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        dbsk.s(iterable);
        return dcgh.g(collection, iterable.iterator());
    }

    public static <T> Iterable<T> i(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        dbsk.s(iterable);
        dbsk.s(dbslVar);
        return new dcfm(iterable, dbslVar);
    }

    public static <T> boolean j(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        return dcgh.k(iterable.iterator(), dbslVar) != -1;
    }

    public static <T> boolean k(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        dbsk.s(dbslVar);
        for (T t : iterable) {
            if (!dbslVar.a(t)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T l(Iterable<? extends T> iterable, dbsl<? super T> dbslVar, T t) {
        Iterator<? extends T> it = iterable.iterator();
        dbsk.s(it);
        dbsk.s(dbslVar);
        while (it.hasNext()) {
            T next = it.next();
            if (dbslVar.a(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> dbsg<T> m(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        Iterator<T> it = iterable.iterator();
        dbsk.s(it);
        dbsk.s(dbslVar);
        while (it.hasNext()) {
            T next = it.next();
            if (dbslVar.a(next)) {
                return dbsg.i(next);
            }
        }
        return dbpy.a;
    }

    public static <T> int n(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        return dcgh.k(iterable.iterator(), dbslVar);
    }

    public static <F, T> Iterable<T> o(Iterable<F> iterable, dbrn<? super F, ? extends T> dbrnVar) {
        dbsk.s(iterable);
        dbsk.s(dbrnVar);
        return new dcfn(iterable, dbrnVar);
    }

    public static <T> T p(Iterable<T> iterable, int i) {
        dbsk.s(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        Iterator<T> it = iterable.iterator();
        dcgh.m(i);
        int p = dcgh.p(it, i);
        if (!it.hasNext()) {
            StringBuilder sb = new StringBuilder(91);
            sb.append("position (");
            sb.append(i);
            sb.append(") must be less than the number of elements that remained (");
            sb.append(p);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return it.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T q(Iterable<? extends T> iterable, int i, T t) {
        dbsk.s(iterable);
        dcgh.m(i);
        if (iterable instanceof List) {
            return i < iterable.size() ? (T) iterable.get(i) : t;
        }
        Iterator it = iterable.iterator();
        dcgh.p(it, i);
        return (T) dcgh.n(it, t);
    }

    public static <T> T r(Iterable<? extends T> iterable, T t) {
        return (T) dcgh.n(iterable.iterator(), t);
    }

    public static <T> T s(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) C(list);
        }
        return (T) dcgh.o(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T t(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (iterable.isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) C(iterable);
            }
        }
        Iterator it = iterable.iterator();
        return it.hasNext() ? (T) dcgh.o(it) : t;
    }

    public static <T> Iterable<T> u(Iterable<T> iterable, int i) {
        dbsk.s(iterable);
        dbsk.b(i >= 0, "number to skip cannot be negative");
        return new dcfp(iterable, i);
    }

    public static <T> Iterable<T> v(Iterable<T> iterable, int i) {
        dbsk.s(iterable);
        dbsk.b(i >= 0, "limit is negative");
        return new dcfq(iterable, i);
    }

    public static boolean w(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dbrn<Iterable<? extends T>, Iterator<? extends T>> x() {
        return new dcfj();
    }

    public static <T> void y(Iterable<T> iterable, dbsl<? super T> dbslVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator<T> it = iterable.iterator();
            dbsk.s(dbslVar);
            while (it.hasNext()) {
                if (dbslVar.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        dbsk.s(dbslVar);
        z((List) iterable, dbslVar);
    }

    private static <T> boolean z(List<T> list, dbsl<? super T> dbslVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!dbslVar.a(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        A(list, dbslVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        A(list, dbslVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
