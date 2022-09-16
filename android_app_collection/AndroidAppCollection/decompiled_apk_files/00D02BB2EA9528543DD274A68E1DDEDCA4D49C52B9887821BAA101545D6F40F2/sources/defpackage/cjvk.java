package defpackage;
/* compiled from: PG */
/* renamed from: cjvk  reason: default package */
/* loaded from: classes.dex */
public final class cjvk<T> extends btrh<T> {
    public cjvk(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cjvi cjviVar = (cjvi) this.a;
        cjqs cjqsVar = (cjqs) obj;
        if (!dbsj.d(cjqsVar.a)) {
            ddxz e = cjra.e(cjqsVar.a);
            if (e != null) {
                int i = e.a;
                if ((i & 2) != 0 && (i & 1) != 0) {
                    return;
                }
            }
            cjviVar.a.h = cjqsVar.a;
        }
    }
}
