package defpackage;

import android.view.animation.AlphaAnimation;
/* compiled from: PG */
/* renamed from: aiqw  reason: default package */
/* loaded from: classes2.dex */
public final class aiqw extends cqiw<aiqv> {
    public static final cqjg a;
    public static final cqjg b;
    private static final cqgq c;
    private static final cqgq d;

    static {
        cqgq n = cqgr.n();
        n.d = 200;
        n.a = Float.valueOf(1.0f);
        c = n;
        cqgq n2 = cqgr.n();
        n2.d = 200;
        n2.a = Float.valueOf(0.0f);
        d = n2;
        a = cqjg.a();
        b = cqjg.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aiqv> a() {
        cqmj gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(8.0d)), cqgr.bw(49), cqgr.eE(cqrt.i(ibk.a, ibm.j())));
        gc.f(cqjv.l(aiqm.a, c.b(), d.b()));
        final cqlc cqlcVar = aiqn.a;
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new aiop(), aiqo.a, new cqmp[0]));
        fY.f(new cqmp[0]);
        cqmp[] cqmpVarArr = {cqgr.bk(aiqp.a), cqgr.aF(aiqq.a)};
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(16), cqgr.fR(new aiuj(), aiqs.a, new cqmp[0]), cqgr.fR(new aipd(), aiqt.a, new cqmp[0]), ict.n(false, new cqmp[0]));
        gd.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqic.f(aiqr.a, new cqmp[0])};
        cqmj b2 = jeh.b(irg.r(), cqgr.bq(cqrp.d(3.0d)), cqgr.cd(-1), cqgr.az(true), cqgr.z(ibm.v()));
        b2.f(cqmpVarArr2);
        cqmj gd2 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(16), cqgr.fR(new aiut(), aiqu.a, new cqmp[0]), ict.n(false, cqic.c(cqjv.x(aipy.a), new cqmp[0])), cqgr.fR(new aivh(), aipz.a, new cqmp[0]), ict.n(false, cqic.c(cqjv.x(aiqa.a), new cqmp[0])), cqgr.fR(new aipi(), aiqb.a, new cqmp[0]), ict.n(false, cqic.c(cqjv.x(aiqc.a), new cqmp[0])), cqgr.fR(new aipl(), aiqd.a, new cqmp[0]), ict.n(false, cqic.c(cqjv.x(aiqe.a), new cqmp[0])));
        gd2.f(new cqmp[0]);
        cqmj gd3 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(16), cqgr.fR(new aipp(), aiqf.a, new cqmp[0]), ict.n(false, cqic.c(aiqg.a, new cqmp[0])), cqgr.fR(new aipw(), aiqh.a, new cqmp[0]), ict.n(false, cqic.c(aiqj.a, new cqmp[0])), cqgr.fR(new aiou(), aiqk.a, new cqmp[0]));
        gd3.f(new cqmp[0]);
        cqmj gd4 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.x(ibm.b()), cqgr.p(true), gd, b2, gd2, gd3);
        gd4.f(new cqmp[0]);
        cqmp[] cqmpVarArr3 = {cqgr.aT(b)};
        final cqjg a2 = cqjg.a();
        final cqjg a3 = cqjg.a();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(225L);
        alphaAnimation.setInterpolator(irf.b);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(225L);
        alphaAnimation2.setInterpolator(irf.c);
        fY.g(cqgr.aT(a2));
        gd4.g(cqgr.aT(a3));
        cqmj gv = cqgr.gv(cqgr.cd(-1), cqgr.bp(-2), cqgr.o(false), cqgr.aY(alphaAnimation), cqgr.du(alphaAnimation2), cqgr.ad(new cqlc(cqlcVar, a2, a3) { // from class: aiql
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
                cqjg cqjgVar3 = aiqw.a;
                return ((Boolean) cqlcVar2.a((aiqv) cqkpVar)).booleanValue() ? cqjgVar : cqjgVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), fY, gd4);
        gv.f(cqmpVarArr3);
        return jgn.a(cqgr.cd(-1), cqgr.bp(-1), cqgr.aJ(48), itj.i(dtxu.dI), cqgr.x(ibm.b()), jgn.d(aipx.a), cqgr.fH(aiqi.a), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), acnp.a(cqgr.fu(false), cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), gc, gv, cqgr.fY(cqgr.aT(a), cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)))))));
    }
}
