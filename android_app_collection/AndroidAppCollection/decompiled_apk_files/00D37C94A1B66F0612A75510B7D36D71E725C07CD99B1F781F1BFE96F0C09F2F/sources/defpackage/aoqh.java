package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aoqh  reason: default package */
/* loaded from: classes.dex */
final class aoqh extends aoqi {
    static aopu a(Object obj, long j) {
        return (aopu) aosg.i(obj, j);
    }

    @Override // defpackage.aoqi
    public final List b(Object obj, long j) {
        aopu a = a(obj, j);
        if (!a.c()) {
            int size = a.size();
            aopu e = a.e(size == 0 ? 10 : size + size);
            aosg.v(obj, j, e);
            return e;
        }
        return a;
    }

    @Override // defpackage.aoqi
    public final void c(Object obj, long j) {
        a(obj, j).b();
    }

    @Override // defpackage.aoqi
    public final void d(Object obj, Object obj2, long j) {
        aopu a = a(obj, j);
        aopu a2 = a(obj2, j);
        int size = a.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!a.c()) {
                a = a.e(size2 + size);
            }
            a.addAll(a2);
        }
        if (size > 0) {
            a2 = a;
        }
        aosg.v(obj, j, a2);
    }
}
