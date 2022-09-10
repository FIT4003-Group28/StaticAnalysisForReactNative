package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: brfp  reason: default package */
/* loaded from: classes4.dex */
public final class brfp extends cqiw<brgu> {
    public static final cqjg a = cqjg.a();
    private static final cqtv b = cqrp.d(8.0d);
    private static final cqtv c = cqrp.d(1.0d);
    private static final cqss d = ibm.j();
    private static final cqss e = ibm.b();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, brgu brguVar, Context context, cqiv cqivVar) {
        brfb brfbVar;
        List<brgt> g;
        brgu brguVar2 = brguVar;
        if (i == 0) {
            brfbVar = new brfb();
            g = brguVar2.g();
        } else if (i != 1) {
            return;
        } else {
            brfbVar = new brfb();
            g = brguVar2.l();
        }
        cqivVar.f(brfbVar, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brgu> a() {
        cqmp[] cqmpVarArr = {cqgr.bp(-1), cqgr.cd(-1), cqgr.aF(brfc.a), itj.s(cqgr.aI(brfg.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17)), cqgr.fR(new brex(), brfi.a, cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17))};
        cqtv cqtvVar = c;
        cqss cqssVar = d;
        cqug[] cqugVarArr = {cquh.a(0), cquh.g(b), cquh.e(cqtvVar, cqssVar), cquh.f(ibm.b())};
        cqmp[] cqmpVarArr2 = {cqgr.dU(cqrp.d(16.0d)), cqgr.eN(5), cqgr.ca(Float.valueOf(1.0f)), ibq.m(), ibq.x(), cqgr.eL(Integer.valueOf((int) R.string.EV_PROFILE_VIEW_CONNECTORS_HEADING_V2))};
        cqrp d2 = cqrp.d(dcyn.a);
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.fY(cqmpVarArr), acnp.a(cqgr.aI(brfh.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.dx(0), cqgr.gd(cqgr.dr(1), cqgr.gd(cqgr.bA(cqrp.d(16.0d)), cqgr.dr(1), cqgr.x(cqui.c(cqugVarArr)), cqgr.gd(cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(8.0d)), cqgr.dr(0), cqgr.gq(cqmpVarArr2), hyb.d(cqgr.bA(cqrp.d(dcyn.a)), cqgr.dz(d2, d2, d2, d2), cqgr.aI(brfj.a), cqgr.cL(ibn.a()), cqgr.cH(ibn.a()), iue.b(cjtd.a(dtxo.as)), cqgr.aT(a), cqgr.cW(cqgr.q(brfk.a)), cqgr.eL(Integer.valueOf((int) R.string.EV_PROFILE_EDIT)))), cqgr.gd(cqgr.aI(brfl.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(8388611), cqgr.dQ(cqrp.d(16.0d)), cqgr.dB(cqtvVar), cqgr.eN(5), cqgr.ck(D(0))), cqgr.gd(cqgr.aI(brfm.a), cqgr.aJ(17), hyb.d(cqgr.cW(cqgr.q(brfn.a)), hyb.h(brfo.a), cqgr.eM(brfd.a))), cqgr.gd(cqgr.aF(brfe.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), iue.b(cjtd.a(dtxo.as)), cqgr.cW(cqgr.q(brff.a)), cqgr.cH(ibn.a()), cqgr.gc(cqgr.dU(cqrp.d(16.0d)), cqgr.bp(-2), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqtt.d(cqtt.i(cqtt.g(cqssVar), cqrp.d(56.0d), cqrp.d(56.0d)), cqtt.e(cqtt.i(cqtt.g(e), cqrp.d(56.0d), cqrp.d(56.0d)), cqtvVar, cqtvVar, cqtvVar, cqtvVar), cqtt.h(cqrt.g(2131232486, ibm.x()), 0.6f)))), cqgr.gq(cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(16.0d)), ibq.r(), cqgr.eU(ibm.x()), cqgr.eN(4), cqgr.eL(Integer.valueOf((int) R.string.EV_PROFILE_ADD_CONNECTORS_V2))))), cqmp.e)));
    }
}
