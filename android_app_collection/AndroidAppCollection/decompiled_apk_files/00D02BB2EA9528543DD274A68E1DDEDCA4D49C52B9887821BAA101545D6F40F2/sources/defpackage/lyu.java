package defpackage;
/* compiled from: PG */
/* renamed from: lyu  reason: default package */
/* loaded from: classes.dex */
public final class lyu<T> extends btrh<T> {
    private final int d;

    public lyu(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            lyt lytVar = (lyt) this.a;
            crhp crhpVar = (crhp) obj;
            if (!lytVar.f) {
                lyt.c(lytVar.b());
                lyt.c(crhpVar);
            }
            lytVar.d = crhpVar;
            lytVar.a();
            return;
        }
        lyt lytVar2 = (lyt) this.a;
        crhq crhqVar = (crhq) obj;
        if (!crhqVar.b()) {
            lytVar2.e = null;
        } else {
            lytVar2.e = crhqVar.a();
        }
        lytVar2.f = true;
        lytVar2.a();
    }
}
