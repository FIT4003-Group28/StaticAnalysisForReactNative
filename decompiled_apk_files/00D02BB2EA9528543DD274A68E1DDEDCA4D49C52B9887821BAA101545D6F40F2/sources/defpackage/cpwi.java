package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: cpwi  reason: default package */
/* loaded from: classes5.dex */
public final class cpwi {
    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> b(int i) {
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> c(Collection<E> collection) {
        return new ArrayList<>(collection);
    }

    public static <F, T> List<T> d(List<F> list, cpwe<? super F, ? extends T> cpweVar) {
        if (list instanceof RandomAccess) {
            return new cpwh(list, cpweVar);
        }
        return new cpwg(list, cpweVar);
    }
}
