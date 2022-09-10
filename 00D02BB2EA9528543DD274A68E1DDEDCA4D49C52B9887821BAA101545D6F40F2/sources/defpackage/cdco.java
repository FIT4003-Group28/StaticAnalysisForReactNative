package defpackage;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdco  reason: default package */
/* loaded from: classes4.dex */
public final class cdco extends cqiw<cdfb> {
    public static final /* synthetic */ int b = 0;
    private final ckln<cdfb> k = new ckln<>();
    static final cqrp a = cqrp.d(5.0d);
    private static final cqrp c = cqrp.d(2.0d);
    private static final cqrp d = cqrp.d(18.0d);
    private static final cqrp e = cqrp.d(10.0d);
    private static final cqrp f = cqrp.d(2.0d);
    private static final cqrp g = cqrp.d(12.0d);
    private static final cqrp h = cqrp.d(16.0d);
    private static final cqrp i = cqrp.d(20.0d);
    private static final cqrp j = cqrp.d(10.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i2, cdfb cdfbVar, Context context, cqiv cqivVar) {
        cdfb cdfbVar2 = cdfbVar;
        cklj b2 = this.k.b(cqivVar, cdfbVar2.r(), cdfbVar2.s());
        b2.b(new cdeb(), cdfbVar2.m());
        if (cdfbVar2.l()) {
            b2.a(new cddk(), cdfbVar2.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdfb> a() {
        cqmj d2 = hyb.d(cqgr.cH(cqrp.d(48.0d)), cqgr.bw(17), cqgr.aJ(17), hyb.o(ibm.j()), hyb.p(cqrp.d(1.0d)), hyb.f(cqrp.d(6.0d)), cqgr.eU(ibm.x()), cqgr.eJ(cqrt.l(R.string.TODO_PHOTO_PLACE_CARD_SKIP)), cqgr.V(cdce.a), cqgr.cW(cqgr.q(cdcf.a)), iue.c(cdcg.a));
        Float valueOf = Float.valueOf(1.0f);
        cqrp cqrpVar = j;
        d2.f(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bG(cqrpVar));
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(irh.a()), cqgr.dr(0), d2, cqgr.fP(new cdcw(), cdch.a, cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bR(cqrpVar)));
        cqrp cqrpVar2 = i;
        cqmj gd2 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dU(g), cqgr.dB(h), cqgr.dM(cqrpVar2), cqgr.dO(cqrpVar2), cqgr.fP(new cddr(), cdci.a, new cqmp[0]), gd);
        cqrp cqrpVar3 = e;
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqqx.D(cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrpVar3), cqgr.bL(cqrpVar3), cqgr.bO(cqrpVar3), cqgr.ck(C()), ckln.a(this.k)), gd2};
        cqlc cqlcVar = cdck.a;
        cqgq a2 = itj.a();
        a2.g(Float.valueOf(-1.5f));
        a2.d = 600;
        a2.c = new DecelerateInterpolator();
        a2.d();
        a2.i = cdcl.a;
        cqnf b2 = a2.b();
        cqlc cqlcVar2 = cdcm.a;
        cqnf b3 = new cdcn().b();
        cqgq a3 = itj.a();
        a3.j();
        a3.g(Float.valueOf(0.0f));
        a3.d = 0;
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqqx.E(cqgr.fI(0), cqgr.cd(-1), cqgr.bp(-2), cqqx.i(f), cqqx.g(a), cqqx.d(ibm.b()), cqgr.bV(c), cqgr.bD(d), cqgr.bL(irh.b()), cqgr.bO(irh.b()), cqgr.gd(cqmpVarArr), iue.c(cdcj.a), cqjv.l(cqlcVar, b2, cqjv.l(cqlcVar2, b3, a3.b()))));
    }
}
