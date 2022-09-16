package defpackage;
/* compiled from: PG */
/* renamed from: asje  reason: default package */
/* loaded from: classes2.dex */
public final class asje<T> extends btrh<T> {
    public asje(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        asjd asjdVar = (asjd) this.a;
        srf srfVar = (srf) obj;
        synchronized (asjdVar) {
            if (!asjdVar.i || asjdVar.h != srfVar.a) {
                return;
            }
            asjdVar.d();
            dbsk.l(!asjdVar.i);
            amte n = srfVar.b.n();
            if (n == null || !zba.d(asjdVar.b, asjdVar.d, asjdVar.e, n, 0, asjdVar.f)) {
                asjdVar.k(new RuntimeException(String.valueOf(asjd.a).concat(": DirectionsStorageItem is not navigable")));
            } else {
                asjdVar.j(n);
            }
        }
    }
}
