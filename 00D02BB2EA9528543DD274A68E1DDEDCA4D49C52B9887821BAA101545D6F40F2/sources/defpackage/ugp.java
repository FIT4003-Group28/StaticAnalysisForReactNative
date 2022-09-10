package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ugp  reason: default package */
/* loaded from: classes7.dex */
public final class ugp extends cqiw<uhc> {
    public static final int a;
    public static final cqrp b;
    private static final cqgq c;
    private static final cqgq d;
    private static final cqtv e;
    private static final cqrp f;
    private static final cqmn<uhc> g;
    private static final cqjb<uhc, Integer> h;

    static {
        cqgq n = cqgr.n();
        n.d = 75;
        n.a = Float.valueOf(0.0f);
        n.e = 0L;
        c = n;
        cqgq n2 = cqgr.n();
        n2.d = 75;
        n2.a = Float.valueOf(1.0f);
        n2.e = 275L;
        d = n2;
        e = cqsg.d(ird.b(), ibn.u());
        a = R.id.edit_waypoints_list;
        f = cqrp.d(16.0d);
        cqrp d2 = cqrp.d(24.0d);
        b = d2;
        g = cqmn.a(cqgr.ce(d2), cqgr.bq(d2));
        h = new ufs();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<uhc> a() {
        cqmj fY = cqgr.fY(cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.x(ibo.i()), cqgr.T(cqrt.l(R.string.NAVIGATE_UP)), iue.b(cjtd.a(dtyi.y)), cqgr.cW(ufn.a), cqgr.gc(g, cqgr.bw(17), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131231588, ibm.p()))));
        fY.f(new cqmp[0]);
        Float valueOf = Float.valueOf(1.0f);
        cqmj a2 = fzj.a(cqgr.aR(Integer.valueOf(a)), cqgr.dr(1), cqgr.ca(valueOf), cqgr.cd(0), cqgr.br(h), fzj.av(ufl.a), cqqx.F(), cqgr.P(false), cqgr.L(false), cqgr.an(ufm.a));
        a2.f(new cqmp[0]);
        cqmp[] cqmpVarArr = {cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(48), fY, a2};
        cqlc cqlcVar = ufo.a;
        cqgq cqgqVar = c;
        cqnf b2 = cqgqVar.b();
        cqgq cqgqVar2 = d;
        cqmp[] cqmpVarArr2 = {cqjv.l(cqlcVar, b2, cqgqVar2.b())};
        cqmj d2 = hyb.d(cqgr.cd(-2), cqgr.bp(-2), cqgr.cL(ibn.a()), cqgr.cH(ibn.a()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.x(ibo.i()), cqgr.au(ufq.a), cqgr.eJ(cqrt.l(R.string.DIRECTIONS_DONE_EDITING_DESTINATIONS)), cqgr.bw(8388629), cqgr.aJ(8388629), cqgr.cW(ufr.a));
        d2.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqjv.l(ufp.a, cqgqVar2.b(), cqgqVar.b())};
        cqrp cqrpVar = b;
        cqmj fY2 = cqgr.fY(cqgr.cd(-2), cqgr.bp(-1), cqgr.cL(ibn.a()), cqgr.dQ(ibn.f()), cqgr.bw(17), cqgr.aJ(17), cqgr.gg(cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), cqgr.bw(17), cqgr.aJ(17)));
        fY2.f(cqmpVarArr3);
        cqmj fY3 = cqgr.fY(d2, fY2);
        fY3.f(new cqmp[0]);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.P(false), cqgr.L(false), cqgr.dU(e), cqgr.dB(ibn.d()), hye.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(ibn.o()), cqgr.bG(ibn.o()), hye.f(cqrp.d(dcyn.a)), cqqx.i(cqrp.d(6.0d)), cqqx.d(ibm.ab()), cqqx.g(f), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqmpVarArr), cqgr.fY(cqgr.cd(-2), cqgr.bp(0), cqgr.ca(valueOf), ict.n(false, new cqmp[0]), fY3))));
    }
}
