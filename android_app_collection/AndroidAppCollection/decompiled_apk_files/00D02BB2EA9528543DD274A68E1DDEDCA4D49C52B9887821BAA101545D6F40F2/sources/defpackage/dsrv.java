package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dsrv  reason: default package */
/* loaded from: classes.dex */
final class dsrv extends dsrw {
    static <E> dsrj<E> d(Object obj, long j) {
        return (dsrj) dsui.l(obj, j);
    }

    @Override // defpackage.dsrw
    public final <L> List<L> a(Object obj, long j) {
        dsrj d = d(obj, j);
        if (!d.a()) {
            int size = d.size();
            dsrj e = d.e(size == 0 ? 10 : size + size);
            dsui.m(obj, j, e);
            return e;
        }
        return d;
    }

    @Override // defpackage.dsrw
    public final void b(Object obj, long j) {
        d(obj, j).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dsrj] */
    @Override // defpackage.dsrw
    public final <E> void c(Object obj, Object obj2, long j) {
        dsrj<E> d = d(obj, j);
        dsrj<E> d2 = d(obj2, j);
        int size = d.size();
        int size2 = d2.size();
        dsrj<E> dsrjVar = d;
        dsrjVar = d;
        if (size > 0 && size2 > 0) {
            boolean a = d.a();
            dsrj<E> dsrjVar2 = d;
            if (!a) {
                dsrjVar2 = d.e(size2 + size);
            }
            dsrjVar2.addAll(d2);
            dsrjVar = dsrjVar2;
        }
        if (size > 0) {
            d2 = dsrjVar;
        }
        dsui.m(obj, j, d2);
    }
}
