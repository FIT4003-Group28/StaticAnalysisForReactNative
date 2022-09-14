package defpackage;

import android.view.animation.OvershootInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atqo  reason: default package */
/* loaded from: classes2.dex */
public final class atqo extends cqiw<atya> {
    public static final dcqe a = dcqe.c("atqo");
    private static final cqjb<atya, cqtd> b = atqm.a;
    private static final cqsv c = cqsv.f(54.0d, 27.0d, 54.0d, 27.0d);

    private static cqmj<atya> e(cqmp<atya> cqmpVar) {
        return cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(8.0d)), cqgr.bR(irh.b()), cqgr.bG(irh.b()), cqgr.eN(4), ibq.k(), ibq.A(), cqgr.fh(cqrp.f(18.0d)), cqmpVar);
    }

    private static cqmn<atya> f(Boolean bool) {
        cqgq a2 = itj.a();
        a2.a = Float.valueOf(1.0f);
        a2.e = 300L;
        a2.d = Integer.valueOf((int) cpnx.a);
        a2.i = atql.a;
        cqnf b2 = a2.b();
        cqgq a3 = itj.a();
        a3.a = Float.valueOf(0.0f);
        a3.d = 0;
        return cqmn.a(cqgr.i(0), cqjv.k(bool, b2, a3.b()));
    }

    private static cqmn<atya> h(Boolean bool, @dzsi cqgp<cqkp> cqgpVar) {
        Float valueOf = Float.valueOf(0.0f);
        cqgq n = cqgr.n();
        Float valueOf2 = Float.valueOf(1.0f);
        n.f = valueOf2;
        n.g = valueOf2;
        n.e = 400L;
        n.d = Integer.valueOf((int) cpnx.a);
        n.c = new OvershootInterpolator();
        n.i = cqgpVar;
        cqnf b2 = n.b();
        cqgq a2 = itj.a();
        a2.f = valueOf;
        a2.g = valueOf;
        a2.d = 0;
        return cqmn.a(cqgr.ek(valueOf), cqgr.el(valueOf), cqjv.k(bool, b2, a2.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atya> a() {
        cqsv cqsvVar = c;
        cqmm fQ = cqgr.fQ(new atqn(), B().f(), new cqmp[0]);
        fQ.a(cqjv.d(cqfe.PROGRESS_DRAWABLE, b), h(B().a(), null));
        cqmp[] cqmpVarArr = {cqgr.bl(B().a()), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(17), cqgr.dU(cqsvVar), cqgr.dB(cqsvVar), cqgr.az(true), cqgr.L(false), f(B().a()), fQ, e(cqgr.eL(B().c())), hyb.c(cqgr.cd(-2), cqgr.bp(-2), iue.b(cjtd.a(dtxw.bP)), cqgr.bV(irh.c()), cqgr.cL(cqrp.d(90.0d)), cqgr.cH(irh.a()), cqgr.cU(B().b()), cqgr.l(true), cqgr.eL(Integer.valueOf((int) R.string.REPORT_INCIDENT_PROMPT_UNDO)))};
        cqrp d = cqrp.d(16.0d);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), iue.b(cjtd.a(dtxw.bE)), cqgr.gd(cqmpVarArr), cqgr.gd(cqgr.bi(B().a()), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(17), cqgr.dU(cqsvVar), cqgr.dB(cqsvVar), cqgr.az(true), cqgr.L(false), f(cqjv.u(B().a())), cqgr.gc(cqgr.bq(cqrp.d(64.0d)), cqgr.ce(cqrp.d(64.0d)), cqgr.bV(cqrp.d(8.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.dz(d, d, d, d), h(cqjv.u(B().a()), atqk.a), cqgr.x(cqtt.g(ibl.ac()))), e(cqgr.eL(B().d()))));
    }
}
