package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayif  reason: default package */
/* loaded from: classes3.dex */
public final class ayif extends cqiw<aymp> {
    public static final /* synthetic */ int a = 0;
    private static final View.AccessibilityDelegate b = new ayib();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aymp aympVar, Context context, cqiv cqivVar) {
        cqiw aykjVar;
        Object obj;
        Object r = aympVar.r();
        if (r instanceof ayde) {
            aykjVar = new ayck();
            obj = (ayde) r;
        } else if (!(r instanceof aymu)) {
            return;
        } else {
            aykjVar = new aykj();
            obj = (aymu) r;
        }
        cqivVar.a(aykjVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aymp> a() {
        cqmp[] cqmpVarArr = {cqic.c(ayhv.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.cW(cqgr.q(ayhw.a)), cqgr.fY(cqgr.cd(-1), cqgr.bV(ibn.d()), cqic.c(cqjv.x(ayhx.a), new cqmp[0]), cqgr.fP(bfka.f(), ayhy.a, cqgr.bs(ayhz.a), cqgr.aW(4)), cqgr.fR(new aybw(), ayia.a, cqgr.bV(cqsg.d(ibn.d(), cqrp.d(10.0d))), cqgr.bR(cqsg.d(ibn.f(), ibn.f())))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dU(ibn.f()), cqgr.gq(ibq.z(), ibq.f(), ibq.x(), cqgr.eN(5), cqgr.eM(aygz.a)), cqgr.gq(cqgr.aF(cqjv.x(ayha.a)), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(4.0d)), ibq.z(), ibq.p(), cqgr.eN(5), ibq.y(), cqgr.eM(ayhb.a)), cqgr.gq(cqgr.aF(cqjv.x(ayhc.a)), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(4.0d)), ibq.z(), ibq.p(), cqgr.eN(5), ibq.y(), cqgr.eM(ayhd.a)))};
        cqmp[] cqmpVarArr2 = {cqic.f(ayhu.a, new cqmp[0]), cqgr.cd(-1), cqgr.bV(ibn.d()), cqgr.ck(C())};
        cqlc cqlcVar = ayhg.a;
        cqmp[] cqmpVarArr3 = {cqgr.bY(cqjd.f()), cqgr.bV(ibn.d()), cqgr.bG(ibn.f()), cqic.c(ayhh.a, new cqmp[0])};
        cqjd[] cqjdVarArr = {cqjd.f()};
        cqtv[] cqtvVarArr = {ibn.f(), ibn.d()};
        cqtv[] cqtvVarArr2 = {ibn.f(), ibn.f()};
        cqrp d = cqrp.d(12.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(ibm.b()), cqgr.V(aygy.a), cqgr.a(b), cqgr.gj(cqgr.gd(cqmpVarArr), cqgr.fY(cqmpVarArr2), jhc.d(cqlcVar, cqmpVarArr3), cqgr.fY(cqic.c(ayhe.a, new cqmp[0]), cqgr.bY(cqjdVarArr), cqgr.bV(cqsg.d(cqtvVarArr)), cqgr.bG(cqsg.d(cqtvVarArr2)), cqgr.cd(-2), cqgr.bp(-2), cqgr.x(ibl.a()), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.S(Integer.valueOf((int) R.string.ACCESSIBILITY_OVERFLOW_MENU)), cqgr.x(ibo.b()), cqgr.cW(ayhf.a), cqgr.fY(cqgr.ch(ibn.a()), cqgr.bw(17), cqgr.gc(cqgr.ch(ibn.a()), cqgr.dz(d, d, d, d), cqgr.bw(17), cqgr.v(Integer.valueOf((int) R.drawable.action_icon_background)), cqgr.eD(2131231593), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.fo(ibl.b()))))), cqgr.fY(cqic.f(ayhi.a, new cqmp[0]), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.cd(-2), cqgr.bp(-2), cqgr.x(irn.O()), cqgr.gc(cqgr.bG(cqrp.d(28.0d)), cqgr.eE(cqrt.g(2131232205, ibm.p())), cqgr.cW(cqgr.q(ayhk.a))))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.bG(ibn.f()), cqgr.gq(cqgr.aI(ayhl.a), cqgr.bV(cqrp.d(12.0d)), cqgr.bR(ibn.f()), ibq.p(), ibq.x(), cqgr.co(cqrp.f(3.8d), false), cqgr.eN(5), cqgr.eM(ayhm.a), itj.i(dtxy.ek)), hyb.d(cqgr.aI(ayhn.a), cqgr.bR(ibn.d()), cqgr.cL(ibn.a()), cqgr.cW(cqgr.q(ayho.a)), cqgr.eM(ayhp.a), cqgr.eU(ibm.x()), cqgr.U(cqiq.d(ayhq.a, cqiq.h(ayhr.a))), iue.c(ayhs.a))), cqgr.fR(new ayie(), ayhj.a, new cqmp[0]), cqgr.dE(ayht.a));
    }
}
