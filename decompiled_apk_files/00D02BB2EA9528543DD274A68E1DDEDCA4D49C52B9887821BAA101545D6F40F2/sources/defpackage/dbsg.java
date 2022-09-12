package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbsg  reason: default package */
/* loaded from: classes.dex */
public abstract class dbsg<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> dbsg<T> i(T t) {
        dbsk.s(t);
        return new dbsu(t);
    }

    public static <T> dbsg<T> j(T t) {
        return t == null ? dbpy.a : new dbsu(t);
    }

    public static <T> Iterable<T> k(Iterable<? extends dbsg<? extends T>> iterable) {
        dbsk.s(iterable);
        return new dbsf(iterable);
    }

    public abstract boolean a();

    public abstract T b();

    public abstract T c(T t);

    public abstract dbsg<T> d(dbsg<? extends T> dbsgVar);

    public abstract T e(dbty<? extends T> dbtyVar);

    public abstract boolean equals(Object obj);

    public abstract T f();

    public abstract Set<T> g();

    public abstract <V> dbsg<V> h(dbrn<? super T, V> dbrnVar);

    public abstract int hashCode();

    public abstract String toString();
}
