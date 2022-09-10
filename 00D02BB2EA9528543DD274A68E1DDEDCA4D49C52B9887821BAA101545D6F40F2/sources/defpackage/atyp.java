package defpackage;

import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: atyp  reason: default package */
/* loaded from: classes2.dex */
public final class atyp<T> extends btrh<T> {
    public atyp(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        atyn atynVar = (atyn) this.a;
        crhp crhpVar = (crhp) obj;
        if (atynVar.a.A.J()) {
            return;
        }
        if (!crhpVar.b()) {
            atynVar.a.A.e();
        } else if (!crhpVar.d() || atynVar.a.a == null) {
        } else {
            cray g = crhpVar.e().g();
            amuo amuoVar = g.b;
            Maneuvers$Maneuver maneuvers$Maneuver = null;
            if (amuoVar == null) {
                atynVar.a.a.j(null, null, null, null);
                return;
            }
            atoa atoaVar = new atoa(amuoVar, atynVar.a.ad);
            Maneuvers$Maneuver a = vrv.e(amuoVar) ? vrv.a(amuoVar) : null;
            if (atynVar.a.aR() && vrv.e(amuoVar)) {
                maneuvers$Maneuver = vrv.b(amuoVar);
            }
            dowa dowaVar = g.a.I;
            atmj a2 = audy.a(atynVar.a.H());
            int i = g.e;
            atyo atyoVar = atynVar.a;
            atynVar.a.a.j(atmk.f(i, dowaVar, a2, atyoVar.f, atyoVar.ae.b(), false), a, maneuvers$Maneuver, atoaVar);
        }
    }
}
