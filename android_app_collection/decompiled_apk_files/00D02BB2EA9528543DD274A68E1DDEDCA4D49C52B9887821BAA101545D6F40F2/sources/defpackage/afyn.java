package defpackage;
/* compiled from: PG */
/* renamed from: afyn  reason: default package */
/* loaded from: classes2.dex */
public final class afyn<T> extends btrh<T> {
    private final int d;

    public afyn(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                alhy alhyVar = (alhy) obj;
                ((afyk) this.a).a.ae.k(true);
                return;
            }
            alhl alhlVar = (alhl) obj;
            ((afyk) this.a).a.ae.k(true);
            return;
        }
        afyk afykVar = (afyk) this.a;
        ardp ardpVar = (ardp) obj;
        afykVar.a.e.a().m().h(amwd.OFF);
        afykVar.a.ae.k(true);
        afyl afylVar = afykVar.a;
        afylVar.ag = null;
        afylVar.i(0L);
    }
}
