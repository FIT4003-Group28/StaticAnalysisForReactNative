package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.OvershootInterpolator;
/* compiled from: PG */
/* renamed from: aish  reason: default package */
/* loaded from: classes2.dex */
public final class aish extends cqiw<aisg> {
    public static final cqrp a;
    public static final cqrp b;
    private static final cqgq c;
    private static final cqgq d;
    private static final cqrp e;
    private static final cqrp f;

    static {
        cqgq n = cqgr.n();
        n.d = 250;
        Float valueOf = Float.valueOf(1.0f);
        n.a = valueOf;
        n.f = valueOf;
        n.g = valueOf;
        n.c = new OvershootInterpolator();
        n.e = 125L;
        c = n;
        cqgq n2 = cqgr.n();
        n2.d = 250;
        n2.a = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.45f);
        n2.f = valueOf2;
        n2.c = new OvershootInterpolator();
        n2.g = valueOf2;
        d = n2;
        a = cqrp.d(18.0d);
        b = cqrp.d(12.0d);
        e = cqrp.d(12.0d);
        f = cqrp.d(12.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aisg> a() {
        cqmp[] cqmpVarArr = {hxc.b(airt.a)};
        cqrp cqrpVar = e;
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrpVar), cqgr.dF(cqrpVar), cqgr.dB(f), cqgr.z(ibm.b()), cqgr.bw(17), cqgr.aJ(17), cqgr.eN(4), cqgr.aI(aisc.a), cqgr.fR(new aitd(), aisd.a, cqgr.bw(17), cqgr.aJ(17))};
        cqmp[] cqmpVarArr3 = {cqgr.aI(airx.a)};
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fR(new aiox(), aise.a, new cqmp[0]));
        cqmj fY2 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fR(new aiwe(), aisf.a, new cqmp[0]));
        Float valueOf = Float.valueOf(0.45f);
        final cqlc cqlcVar = airu.a;
        final cqjg a2 = cqjg.a();
        final cqjg a3 = cqjg.a();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(225L);
        alphaAnimation.setInterpolator(irf.b);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(225L);
        alphaAnimation2.setInterpolator(irf.c);
        fY2.g(cqgr.aT(a2));
        fY.g(cqgr.aT(a3));
        cqmj gv = cqgr.gv(cqgr.cd(-1), cqgr.bp(-2), cqgr.o(false), cqgr.aY(alphaAnimation), cqgr.du(alphaAnimation2), cqgr.ad(new cqlc(cqlcVar, a2, a3) { // from class: airw
            private final cqlc a;
            private final cqjg b;
            private final cqjg c;

            {
                this.a = cqlcVar;
                this.b = a2;
                this.c = a3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                cqjg cqjgVar = this.b;
                cqjg cqjgVar2 = this.c;
                cqrp cqrpVar2 = aish.a;
                return ((Boolean) cqlcVar2.a((aisg) cqkpVar)).booleanValue() ? cqjgVar : cqjgVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), fY2, fY);
        gv.f(new cqmp[0]);
        cqmj fY3 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.ek(valueOf), cqgr.el(valueOf), cqgr.i(0), gv);
        fY3.f(new cqmp[0]);
        fY3.f(cqjv.l(cqjv.x(airv.a), d.b(), c.b()));
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), hxc.a(cqmpVarArr), cqgr.fY(cqmpVarArr2), ict.n(false, cqmpVarArr3), cqgr.fY(cqgr.dX(airy.a), cqgr.dT(airz.a), cqgr.dI(aisa.a), cqgr.aF(cqjv.x(aisb.a)), fY3));
    }
}
