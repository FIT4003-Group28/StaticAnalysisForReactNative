package defpackage;

import android.view.animation.OvershootInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajdk  reason: default package */
/* loaded from: classes2.dex */
public final class ajdk extends cqiw<ajdl> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final cqgq c;
    private static final cqgq d;
    private static final cqrp e;
    private static final cqrp f;
    private static final cqrp g;

    static {
        cqgq n = cqgr.n();
        n.d = 250;
        Float valueOf = Float.valueOf(1.0f);
        n.a = valueOf;
        n.f = valueOf;
        n.g = valueOf;
        n.c = new OvershootInterpolator();
        n.e = 300L;
        c = n;
        cqgq n2 = cqgr.n();
        n2.d = 250;
        n2.a = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.45f);
        n2.f = valueOf2;
        n2.g = valueOf2;
        d = n2;
        e = cqrp.d(16.0d);
        f = cqrp.d(32.0d);
        g = cqrp.d(16.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ajdl> a() {
        cqmp[] cqmpVarArr = {cqgr.bY(cqjd.i()), cqgr.aH(cqhg.a)};
        Float valueOf = Float.valueOf(0.45f);
        ajwn ajwnVar = new ajwn();
        cqlc cqlcVar = ajdi.a;
        cqrp cqrpVar = e;
        cqrp cqrpVar2 = f;
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.aT(a), cqgr.bw(49), cqgr.ek(valueOf), cqgr.el(valueOf), cqgr.i(0), cqgr.fP(ajwnVar, cqlcVar, cqgr.bw(81), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrpVar), cqgr.bG(cqrpVar), cqgr.bV(cqrpVar2), cqgr.bD(cqrpVar2)));
        fY.f(new cqmp[0]);
        fY.f(cqjv.l(ajdj.a, c.b(), d.b()));
        cqmj fY2 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.p(true), cqgr.dX(ajdh.a), fY);
        fY2.f(cqmpVarArr);
        return cqgr.gj(cqgr.bp(-1), cqgr.cd(-1), cqgr.dU(ird.b()), cqgr.L(false), cqgr.M(false), cqgr.P(false), cqgr.dd(), cqgr.x(iva.b(ibl.f(), cqrt.c(R.color.mod_grey500_alpha40))), fY2, jgn.a(cqgr.aT(b), cqgr.cd(-1), cqgr.bp(-2), cqgr.dW(ajdc.a), cqgr.z(ibm.b()), jgn.c(cqsv.f(8.0d, dcyn.a, 8.0d, dcyn.a)), cqgr.bY(cqjd.j()), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fP(new ajbn(), ajdd.a, cqgr.aH(cqhg.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), cqgr.dB(g)), cqgr.gk(cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dW(ajde.a), cqgr.fP(new ajeu(), ajdf.a, new cqmp[0]))), itj.t(new cqmp[0]), cqgr.fP(new ajai(), ajdg.a, new cqmp[0]))));
    }
}
