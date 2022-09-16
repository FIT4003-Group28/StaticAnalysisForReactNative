package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abzz  reason: default package */
/* loaded from: classes2.dex */
public final class abzz extends cqiw<acbc> {
    public static final abxz a = abxz.f(10);
    public static final abxz b = abxz.f(1);
    private static final cqjb<acbc, abp> c = abzm.a;

    private static cqmj<acbc> e(cqlc<acbc, String> cqlcVar, cqlc<acbc, String> cqlcVar2, cqlc<acbc, String> cqlcVar3, cqtd cqtdVar, cqlc<acbc, View.OnClickListener> cqlcVar4, cqlc<acbc, cjtd> cqlcVar5) {
        cqtv b2 = irh.b();
        cqmp[] cqmpVarArr = {cqgr.bw(16), cqgr.eE(cqtdVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER)};
        cqtv g = irh.g();
        cqmp[] cqmpVarArr2 = {cqgr.dz(g, g, g, g), cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(16), ibq.m(), cqgr.fh(abxz.f(18)), cqgr.eN(4), cqgr.eM(cqlcVar)};
        cqtv g2 = irh.g();
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.dz(b2, b2, b2, b2), cqgr.gc(cqmpVarArr), cqgr.gq(cqmpVarArr2), cqgr.gq(cqgr.aF(cqjv.x(cqlcVar2)), cqgr.dz(g2, g2, g2, g2), cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(16), cqgr.bR(abxz.f(40)), cqgr.bG(abxz.f(40)), ibq.l(), irn.v(), cqgr.eN(4), cqgr.eM(cqlcVar2)), cqgr.fY(cqgr.aF(cqjv.x(cqlcVar3)), cqgr.cd(-2), cqgr.bw(17), hyw.d(cqkz.a(null), cqlcVar3, cqlcVar4, cqlcVar3, cqlcVar5, new cqmp[0])));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, acbc acbcVar, Context context, cqiv cqivVar) {
        cqiw acacVar;
        Object obj;
        acbc acbcVar2 = acbcVar;
        if (acbcVar2.w().booleanValue()) {
            cqivVar.a(new abyv(), acbcVar2.x());
        }
        dcdc<acba> e = acbcVar2.e();
        int size = e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = (acba) e.get(i2);
            if (obj2 instanceof acaz) {
                acacVar = new acaf();
                obj = (acaz) obj2;
            } else if (obj2 instanceof acbb) {
                acacVar = new acaw();
                obj = (acbb) obj2;
            } else if (obj2 instanceof acay) {
                acacVar = new acac();
                obj = (acay) obj2;
            } else {
                bvoo.f(new IllegalArgumentException("Unsupported thumbnail type."));
            }
            cqivVar.a(acacVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<acbc> a() {
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), GmmRecyclerView.aw(C(), cqgr.aF(abyw.a), cqgr.aR(Integer.valueOf((int) R.id.visual_explore_gallery)), cqgr.aT(acbc.a), cqgr.bp(-2), cqgr.cd(-1), cqqx.K(c), cqqx.v(abzh.a), cqqx.p(null), cqqx.r(new abzw(new Object[0])), iue.c(abzn.a), cqgr.ep(false), cqjv.f(cqqi.SNAP_HELPER, abzo.a)), cqgr.fP(new acch(), abzp.a, cqgr.aI(abzq.a), cqgr.bs(abzr.a), cqgr.dB(a))), cqgr.fY(cqgr.aI(abzs.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.fP(new abzx(), cqkz.a(cqkp.T), new cqmp[0])), cqgr.fY(cqgr.aF(abzt.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.fY(cqgr.aI(abzu.a), e(abyx.a, abyy.a, cqkz.a(""), iup.e(R.raw.empty_state_camera), cqgr.q(abyz.a), abza.a)), cqgr.fY(cqgr.aI(abzb.a), e(abzc.a, cqkz.a(""), abzd.a, iup.e(R.raw.empty_state_connection), cqgr.q(abze.a), abzf.a)), cqgr.fY(cqgr.aI(abzg.a), e(abzi.a, cqkz.a(""), abzj.a, iup.e(R.raw.empty_state_desert), cqgr.q(abzk.a), abzl.a))));
    }
}
