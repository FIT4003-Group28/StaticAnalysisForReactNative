package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: dqp  reason: default package */
/* loaded from: classes6.dex */
public final class dqp implements dqn {
    private final czz a;
    private final btvo b;
    private final View c;

    public dqp(Activity activity, czz czzVar, btvo btvoVar) {
        this.a = czzVar;
        this.b = btvoVar;
        this.c = new View(activity);
    }

    @Override // defpackage.dqn
    public final void a(View view) {
        this.a.v(view);
    }

    @Override // defpackage.dqn
    public final egu b(ggc ggcVar, View view) {
        egj egjVar = new egj(ggcVar);
        egjVar.ag(null);
        egjVar.M(view);
        egjVar.k(true);
        egjVar.F(this.c);
        final czz czzVar = this.a;
        czzVar.getClass();
        egjVar.C(new dbty(czzVar) { // from class: dqo
            private final czz a;

            {
                this.a = czzVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.l());
            }
        });
        egjVar.w(null);
        egjVar.y(true);
        egjVar.f(false);
        egjVar.Y(true);
        egf a = egf.a();
        a.a = true;
        a.n = false;
        a.x = false;
        a.l(false);
        dknv dknvVar = this.b.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        dkgv dkgvVar = dknvVar.q;
        if (dkgvVar == null) {
            dkgvVar = dkgv.d;
        }
        a.g = dkgvVar.c;
        a.l = new afwn[]{afwn.e(afwm.STREETVIEW, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TERRAIN, false)};
        a.k();
        egjVar.A(a);
        egjVar.J(this.a.b());
        return egjVar.a();
    }
}
