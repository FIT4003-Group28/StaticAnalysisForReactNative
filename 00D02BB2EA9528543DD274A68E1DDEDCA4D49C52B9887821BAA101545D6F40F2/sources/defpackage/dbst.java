package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbst  reason: default package */
/* loaded from: classes5.dex */
public final class dbst {
    public static <T> dbsl<T> a(dbsl<T> dbslVar) {
        return new dbsr(dbslVar);
    }

    public static <T> dbsl<T> b(dbsl<? super T> dbslVar, dbsl<? super T> dbslVar2) {
        dbsk.s(dbslVar);
        dbsk.s(dbslVar2);
        return new dbsm(Arrays.asList(dbslVar, dbslVar2));
    }

    public static <T> dbsl<T> c(T t) {
        if (t == null) {
            return dbss.IS_NULL;
        }
        return new dbsq(t);
    }

    public static dbsl<Object> d(Class<?> cls) {
        return new dbsp(cls);
    }

    public static <A, B> dbsl<A> e(dbsl<B> dbslVar, dbrn<A, ? extends B> dbrnVar) {
        return new dbsn(dbslVar, dbrnVar);
    }
}
