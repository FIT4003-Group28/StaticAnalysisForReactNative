package defpackage;
/* compiled from: PG */
/* renamed from: per  reason: default package */
/* loaded from: classes.dex */
public final class per<T> extends btrh<T> {
    private final int d;

    public per(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dqvj dqvjVar;
        boolean z;
        if (this.d != 0) {
            peq peqVar = (peq) this.a;
            if (!peqVar.c.h(peq.f(peqVar.a, peqVar.d, ((btvr) obj).a))) {
                return;
            }
            peqVar.g(false);
            return;
        }
        peq peqVar2 = (peq) this.a;
        crhp crhpVar = (crhp) obj;
        boolean z2 = true;
        if (crhpVar.d()) {
            dqvjVar = crhpVar.e().g().a.h;
            z = false;
        } else {
            if (crhpVar.f()) {
                dqvjVar = crhpVar.g().f;
                z = true;
            } else {
                dqvjVar = null;
                z = false;
            }
            z2 = false;
        }
        if (!peqVar2.c.e(z2, z, dqvjVar)) {
            return;
        }
        peqVar2.g(false);
    }
}
