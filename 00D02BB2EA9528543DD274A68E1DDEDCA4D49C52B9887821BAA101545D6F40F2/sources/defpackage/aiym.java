package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aiym  reason: default package */
/* loaded from: classes2.dex */
public final class aiym extends cqiw<aiyl> {
    public static final /* synthetic */ int a = 0;
    private static final cqgq b;
    private static final cqgq c;

    static {
        cqgq n = cqgr.n();
        n.d = 200;
        n.a = Float.valueOf(1.0f);
        b = n;
        cqgq n2 = cqgr.n();
        n2.d = 200;
        n2.a = Float.valueOf(0.0f);
        c = n2;
    }

    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ void RI(int i, aiyl aiylVar, Context context, cqiv cqivVar) {
        aiyl aiylVar2 = aiylVar;
        cqivVar.f(new aixv(), aiylVar2.b());
        if (aiylVar2.h() != null) {
            aixv aixvVar = new aixv();
            aixu h = aiylVar2.h();
            dbsk.s(h);
            cqivVar.a(aixvVar, h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aiyl> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bs(aiya.a)};
        cqmj gs = cqgr.gs(cqgr.L(false), cqgr.P(false), cqgr.bq(cqrp.d(4.0d)), cqgr.cd(-1), cqgr.y(aiyk.a), cqgr.fs(aiyb.a), cqgr.p(true), cqgr.aF(aiyc.a));
        gs.f(new cqmp[0]);
        cqmj gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(8.0d)), cqgr.bw(49), cqgr.eE(cqrt.i(ibk.a, ibm.j())));
        gc.f(cqjv.l(aiyh.a, b.b(), c.b()), cqgr.aI(aiyi.a));
        final cqlc cqlcVar = aiye.a;
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new aivj(), aiyf.a, new cqmp[0]));
        cqmj D = cqqx.D(cqgr.x(ibm.b()), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C()), cqqx.F());
        final cqjg a2 = cqjg.a();
        final cqjg a3 = cqjg.a();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(225L);
        alphaAnimation.setInterpolator(irf.b);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(225L);
        alphaAnimation2.setInterpolator(irf.c);
        fY.g(cqgr.aT(a2));
        D.g(cqgr.aT(a3));
        cqmj gv = cqgr.gv(cqgr.cd(-1), cqgr.bp(-2), cqgr.o(false), cqgr.aY(alphaAnimation), cqgr.du(alphaAnimation2), cqgr.ad(new cqlc(cqlcVar, a2, a3) { // from class: aiyg
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
                int i = aiym.a;
                return ((Boolean) cqlcVar2.a((aiyl) cqkpVar)).booleanValue() ? cqjgVar : cqjgVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), fY, D);
        gv.f(new cqmp[0]);
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), itj.i(dtxu.eg), cqgr.fY(cqmpVarArr), gs, jgn.a(cqgr.cd(-1), cqgr.bp(-1), cqgr.x(ibm.b()), cqgr.p(true), jgn.d(aiyd.a), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), gc, gv))};
        cqmp[] cqmpVarArr3 = {cqgr.cW(cqgr.q(aiyj.a)), iue.b(cjtd.a(dtxu.eo)), cqgr.bY(cqjd.f(), cqjd.i())};
        cqmj a4 = hzb.a(cqgr.aT(aivk.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(gwu.a()), cqgr.bG(gwu.c()), hyb.g(cqrt.g(2131232381, ibm.b())), cqgr.z(ibm.x()), cqgr.p(true), cqgr.eU(ibm.b()), cqgr.eJ(cqrt.l(R.string.MOD_CREATE_SHARE_FAB)));
        a4.f(cqmpVarArr3);
        a4.f(new cqmp[0]);
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-1), cqgr.L(false), cqgr.P(false), cqgr.p(true), cqgr.gd(cqmpVarArr2), a4);
    }
}
