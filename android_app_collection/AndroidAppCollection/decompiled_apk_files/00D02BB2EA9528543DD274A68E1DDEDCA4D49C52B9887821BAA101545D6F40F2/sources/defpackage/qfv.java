package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: qfv  reason: default package */
/* loaded from: classes7.dex */
public class qfv {
    public final vxa a;
    public final ahjq b;
    public final dxio<ascb> c;
    public final dxio<vzi> d;
    private final Activity e;
    private final vwv f;
    private final bwqv g;

    public qfv(Activity activity, vwv vwvVar, vxa vxaVar, ahjq ahjqVar, bwqv bwqvVar, dxio<ascb> dxioVar, dxio<vzi> dxioVar2) {
        this.e = activity;
        this.f = vwvVar;
        this.a = vxaVar;
        this.b = ahjqVar;
        this.g = bwqvVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    public final boolean a(amub amubVar, akqq akqqVar) {
        Integer num;
        GmmLocation a = this.b.a();
        if (a == null || (num = (Integer) dcft.m(amubVar.n(), qft.a).h(qfu.a).f()) == null || !zba.h(amubVar, num, this.b, this.f, true)) {
            return false;
        }
        if (a.F(akqqVar) < 50.0f) {
            return true;
        }
        double q = akra.q(a.getLatitude()) * 250.0d;
        akrn V = amubVar.V(a.C(), q);
        akrn V2 = amubVar.V(akra.f(akqqVar), q);
        return (V == null || V2 == null || amubVar.M(V) < amubVar.M(V2)) ? false : true;
    }

    public final void b(amub amubVar, qhq qhqVar, qhq qhqVar2) {
        GmmLocation a = this.b.a();
        if (a == null || !a(amubVar, qhqVar.a())) {
            this.d.a().a(this.g, amubVar.d(), amubVar.c, 0);
            return;
        }
        amvg P = amvh.P();
        P.d = qhqVar2.a();
        P.j = qhqVar2.b().a();
        this.c.a().d(c(a, P.a()), asca.BIKESHARING);
    }

    public final qcx c(GmmLocation gmmLocation, amvh amvhVar) {
        qcw x = qcx.x();
        x.k(qbs.NAVIGATION);
        x.d(true);
        x.j(true);
        x.r(amvh.g(this.e, gmmLocation.B()));
        x.u(amvhVar);
        x.s(dqvj.BICYCLE);
        return x.a();
    }
}
