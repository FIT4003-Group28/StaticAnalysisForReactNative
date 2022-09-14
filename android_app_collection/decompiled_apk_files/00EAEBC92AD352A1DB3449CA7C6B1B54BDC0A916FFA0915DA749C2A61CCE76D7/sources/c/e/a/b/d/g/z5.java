package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class z5 extends u5 {
    private z5() {
        super();
    }

    private static <E> k5<E> b(Object obj, long j) {
        return (k5) a8.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.u5
    public final void a(Object obj, long j) {
        b(obj, j).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // c.e.a.b.d.g.u5
    public final <E> void a(Object obj, Object obj2, long j) {
        k5<E> b2 = b(obj, j);
        k5<E> b3 = b(obj2, j);
        int size = b2.size();
        int size2 = b3.size();
        k5<E> k5Var = b2;
        k5Var = b2;
        if (size > 0 && size2 > 0) {
            boolean f2 = b2.f();
            k5<E> k5Var2 = b2;
            if (!f2) {
                k5Var2 = b2.a(size2 + size);
            }
            k5Var2.addAll(b3);
            k5Var = k5Var2;
        }
        if (size > 0) {
            b3 = k5Var;
        }
        a8.a(obj, j, b3);
    }
}
