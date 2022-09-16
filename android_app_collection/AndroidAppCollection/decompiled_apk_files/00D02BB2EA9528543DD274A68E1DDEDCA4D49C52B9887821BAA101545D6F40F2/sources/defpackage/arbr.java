package defpackage;
/* compiled from: PG */
/* renamed from: arbr  reason: default package */
/* loaded from: classes.dex */
public final class arbr<T> extends btrh<T> {
    public arbr(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        arbp arbpVar = (arbp) this.a;
        alhw alhwVar = (alhw) obj;
        if (arbpVar.a.c == null || alhwVar.a != alje.LAST_FINGER_UP) {
            return;
        }
        arbq arbqVar = arbpVar.a;
        arar ararVar = arbqVar.g;
        bvrj.UI_THREAD.c();
        akra akraVar = new akra();
        if (true != ararVar.a.d.f(akraVar)) {
            akraVar = null;
        }
        if (akraVar == null || (arbqVar.b.p().j.y(akraVar) / akyx.e(arbqVar.b)) / arbqVar.b.B() >= 20.0d) {
            arbpVar.a.c = null;
            return;
        }
        amwd amwdVar = arbpVar.a.c;
        dbsk.s(amwdVar);
        if (amwdVar == amwd.COMPASS) {
            arbq arbqVar2 = arbpVar.a;
            arar ararVar2 = arbqVar2.g;
            bvrj.UI_THREAD.c();
            if (Math.abs(bvop.c(arbqVar2.b.p().m - ararVar2.a.d.g())) > 10.0f) {
                amwdVar = amwd.TRACKING;
            }
        }
        arar ararVar3 = arbpVar.a.g;
        bvrj.UI_THREAD.c();
        if (amwdVar == amwd.OFF) {
            bvoo.h("Attempted to snap back to AutoPanMode.OFF", new Object[0]);
        } else {
            akox akoxVar = ararVar3.a.f;
            if (akoxVar != null) {
                alad p = akoxVar.k().p();
                alaf a = alai.a();
                alae alaeVar = ararVar3.a.k;
                if (alaeVar == null) {
                    alaeVar = p.n;
                }
                a.e = alaeVar;
                a.c = p.l;
                a.b = p.k;
                if (amwdVar == amwd.TRACKING) {
                    a.d = p.m;
                    a.f = alah.LOCATION_ONLY;
                } else {
                    a.f = alah.LOCATION_AND_BEARING;
                }
                ararVar3.a.j(a.a(), false);
            }
        }
        arbpVar.a.c = null;
    }
}
