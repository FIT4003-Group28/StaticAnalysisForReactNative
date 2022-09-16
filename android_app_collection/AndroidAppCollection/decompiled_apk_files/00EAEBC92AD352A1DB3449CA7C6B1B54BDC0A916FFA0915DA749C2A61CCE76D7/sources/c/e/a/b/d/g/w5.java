package c.e.a.b.d.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class w5 extends u5 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4503c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private w5() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j, int i) {
        List<L> a2;
        s5 s5Var;
        List<L> b2 = b(obj, j);
        if (!b2.isEmpty()) {
            if (f4503c.isAssignableFrom(b2.getClass())) {
                ArrayList arrayList = new ArrayList(b2.size() + i);
                arrayList.addAll(b2);
                s5Var = arrayList;
            } else if (b2 instanceof v7) {
                s5 s5Var2 = new s5(b2.size() + i);
                s5Var2.addAll((v7) b2);
                s5Var = s5Var2;
            } else if (!(b2 instanceof v6) || !(b2 instanceof k5)) {
                return b2;
            } else {
                k5 k5Var = (k5) b2;
                if (k5Var.f()) {
                    return b2;
                }
                a2 = k5Var.a(b2.size() + i);
            }
            a8.a(obj, j, s5Var);
            return s5Var;
        }
        a2 = b2 instanceof v5 ? new s5(i) : (!(b2 instanceof v6) || !(b2 instanceof k5)) ? new ArrayList<>(i) : ((k5) b2).a(i);
        a8.a(obj, j, a2);
        return a2;
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) a8.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.u5
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) a8.f(obj, j);
        if (list instanceof v5) {
            unmodifiableList = ((v5) list).g();
        } else if (f4503c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof v6) && (list instanceof k5)) {
                k5 k5Var = (k5) list;
                if (!k5Var.f()) {
                    return;
                }
                k5Var.j();
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        a8.a(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.u5
    public final <E> void a(Object obj, Object obj2, long j) {
        List b2 = b(obj2, j);
        List a2 = a(obj, j, b2.size());
        int size = a2.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(b2);
        }
        if (size > 0) {
            b2 = a2;
        }
        a8.a(obj, j, b2);
    }
}
