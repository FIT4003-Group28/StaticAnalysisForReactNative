package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbze  reason: default package */
/* loaded from: classes5.dex */
public final class dbze {
    public static <E> Collection<E> a(Collection<E> collection, dbsl<? super E> dbslVar) {
        if (collection instanceof dbzc) {
            dbzc dbzcVar = (dbzc) collection;
            return new dbzc(dbzcVar.a, dbst.b(dbzcVar.b, dbslVar));
        }
        dbsk.s(collection);
        dbsk.s(dbslVar);
        return new dbzc(collection, dbslVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Collection<?> collection, Object obj) {
        dbsk.s(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Collection<?> collection, Object obj) {
        dbsk.s(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <F, T> Collection<T> d(Collection<F> collection, dbrn<? super F, T> dbrnVar) {
        return new dbzd(collection, dbrnVar);
    }

    public static boolean e(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder f(int i) {
        dbzb.d(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }
}
