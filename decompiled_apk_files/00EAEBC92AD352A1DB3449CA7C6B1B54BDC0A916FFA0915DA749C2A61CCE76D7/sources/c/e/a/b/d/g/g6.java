package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class g6 implements h6 {
    @Override // c.e.a.b.d.g.h6
    public final int a(int i, Object obj, Object obj2) {
        e6 e6Var = (e6) obj;
        c6 c6Var = (c6) obj2;
        if (e6Var.isEmpty()) {
            return 0;
        }
        Iterator it = e6Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // c.e.a.b.d.g.h6
    public final Object a(Object obj, Object obj2) {
        e6 e6Var = (e6) obj;
        e6 e6Var2 = (e6) obj2;
        if (!e6Var2.isEmpty()) {
            if (!e6Var.c()) {
                e6Var = e6Var.a();
            }
            e6Var.a(e6Var2);
        }
        return e6Var;
    }

    @Override // c.e.a.b.d.g.h6
    public final Map<?, ?> a(Object obj) {
        return (e6) obj;
    }

    @Override // c.e.a.b.d.g.h6
    public final boolean b(Object obj) {
        return !((e6) obj).c();
    }

    @Override // c.e.a.b.d.g.h6
    public final Map<?, ?> c(Object obj) {
        return (e6) obj;
    }

    @Override // c.e.a.b.d.g.h6
    public final f6<?, ?> d(Object obj) {
        c6 c6Var = (c6) obj;
        throw new NoSuchMethodError();
    }

    @Override // c.e.a.b.d.g.h6
    public final Object e(Object obj) {
        return e6.d().a();
    }

    @Override // c.e.a.b.d.g.h6
    public final Object f(Object obj) {
        ((e6) obj).b();
        return obj;
    }
}
