package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcgh  reason: default package */
/* loaded from: classes.dex */
public final class dcgh {
    public static <T> dcpd<T> a(Iterator<? extends T> it) {
        dbsk.s(it);
        if (it instanceof dcpd) {
            return (dcpd) it;
        }
        return new dcfu(it);
    }

    public static int b(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return decl.b(j);
    }

    public static boolean d(Iterator<?> it, Collection<?> collection) {
        dbsk.s(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean e(Iterator<?> it, Collection<?> collection) {
        dbsk.s(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> T f(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> boolean g(Collection<T> collection, Iterator<? extends T> it) {
        dbsk.s(collection);
        dbsk.s(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return true == z;
    }

    public static <T> Iterator<T> h(Iterator<? extends Iterator<? extends T>> it) {
        return new dcgc(it);
    }

    public static <T> dcpd<T> i(Iterator<T> it, dbsl<? super T> dbslVar) {
        dbsk.s(it);
        dbsk.s(dbslVar);
        return new dcfx(it, dbslVar);
    }

    public static <T> T j(Iterator<T> it, dbsl<? super T> dbslVar) {
        dbsk.s(it);
        dbsk.s(dbslVar);
        while (it.hasNext()) {
            T next = it.next();
            if (dbslVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> int k(Iterator<T> it, dbsl<? super T> dbslVar) {
        dbsk.t(dbslVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (dbslVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> l(Iterator<F> it, dbrn<? super F, ? extends T> dbrnVar) {
        dbsk.s(dbrnVar);
        return new dcfy(it, dbrnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("position (");
        sb.append(i);
        sb.append(") must not be negative");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static <T> T n(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T o(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int p(Iterator<?> it, int i) {
        dbsk.s(it);
        int i2 = 0;
        dbsk.b(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T q(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(Iterator<?> it) {
        dbsk.s(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @SafeVarargs
    public static <T> dcpd<T> s(T... tArr) {
        int length = tArr.length;
        dbsk.a(true);
        dbsk.u(0, length, length);
        dbsk.y(0, length);
        if (length == 0) {
            return dcgb.a;
        }
        return new dcgb(tArr, length);
    }

    public static <T> dcgg t(Iterator<? extends T> it) {
        if (it instanceof dcgg) {
            return (dcgg) it;
        }
        return new dcgg(it);
    }

    public static boolean c(Iterator<?> it, Object obj) {
        if (obj != null) {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }
}
