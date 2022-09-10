package defpackage;
/* compiled from: PG */
/* renamed from: keb  reason: default package */
/* loaded from: classes7.dex */
public final class keb<T> extends btrh<T> {
    private final int d;

    public keb(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            amqo amqoVar = (amqo) obj;
            ((kdy) this.a).a.f();
            return;
        }
        kdy kdyVar = (kdy) this.a;
        crhp crhpVar = (crhp) obj;
        kdyVar.a.i = eapd.a();
        kdyVar.a.h = crhpVar;
        if (!crhpVar.d()) {
            kea keaVar = kdyVar.a;
            if (keaVar.g == null) {
                return;
            }
            keaVar.g = null;
            keaVar.b();
            return;
        }
        crqf e = crhpVar.e();
        kea keaVar2 = kdyVar.a;
        crqf crqfVar = keaVar2.g;
        if (crqfVar == null) {
            keaVar2.d(e.f(), e.g());
            kdyVar.a.g = e;
            return;
        }
        amuo amuoVar = e.g().b;
        if (e.f().h(crqfVar.f()) && amuoVar != null && amuoVar.equals(crqfVar.g().b)) {
            return;
        }
        kdyVar.a.d(e.f(), e.g());
        kdyVar.a.g = e;
    }
}
