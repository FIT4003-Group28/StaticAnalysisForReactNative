package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: dzts  reason: default package */
/* loaded from: classes6.dex */
class dzts extends dztr {
    public static final <T> HashSet<T> e(Iterable<? extends T> iterable) {
        dzvx.c(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(dztz.a(dzti.d(iterable, 12)));
        dzti.j(iterable, hashSet);
        return hashSet;
    }

    public static final <T> List<T> f(Iterable<? extends T> iterable) {
        dzvx.c(iterable, "$this$toList");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return dztu.a;
            }
            if (size != 1) {
                return dzti.g(collection);
            }
            return dzti.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        dzvx.c(iterable, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        dzti.j(iterable, arrayList);
        return dzti.b(arrayList);
    }

    public static final <T> List<T> g(Collection<? extends T> collection) {
        dzvx.c(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        LinkedHashSet linkedHashSet;
        dzvx.c(iterable, "$this$distinct");
        dzvx.c(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            dzti.j(iterable, linkedHashSet);
        }
        return dzti.f(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> i(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        dzvx.c(collection, "$this$plus");
        dzvx.c(iterable, "elements");
        if (iterable instanceof Collection) {
            ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
            arrayList.addAll(collection);
            arrayList.addAll(iterable);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        dzvx.c(iterable, "elements");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    public static final <T, C extends Collection<? super T>> void j(Iterable<? extends T> iterable, C c) {
        dzvx.c(iterable, "$this$toCollection");
        for (T t : iterable) {
            c.add(t);
        }
    }

    public static final <T, A extends Appendable> void k(Iterable<? extends T> iterable, A a, CharSequence charSequence) {
        a.append("");
        int i = 0;
        for (T t : iterable) {
            i++;
            if (i > 1) {
                a.append(charSequence);
            }
            if (t == null || (t instanceof CharSequence)) {
                a.append((CharSequence) t);
            } else if (t instanceof Character) {
                a.append(((Character) t).charValue());
            } else {
                a.append(String.valueOf(t));
            }
        }
        a.append("");
    }
}
