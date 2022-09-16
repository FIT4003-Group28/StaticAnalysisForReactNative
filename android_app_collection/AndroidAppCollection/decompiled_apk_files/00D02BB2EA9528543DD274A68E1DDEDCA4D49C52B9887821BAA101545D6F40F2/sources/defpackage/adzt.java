package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adzt  reason: default package */
/* loaded from: classes2.dex */
public final class adzt extends cqiw<aeeq> {
    static final cqtv a = cqsg.d(cqrp.d(80.0d), ird.b());

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, aeeq aeeqVar, Context context) {
        cqiv cqivVar = new cqiv();
        for (cqix<?> cqixVar : aeeqVar.b()) {
            cqivVar.e(cqixVar);
        }
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aeeq> a() {
        Integer valueOf = Integer.valueOf((int) R.id.side_panel_close_button);
        Integer valueOf2 = Integer.valueOf((int) R.id.side_panel_collapsible_view);
        return jjh.a(cqgr.bp(-1), cqgr.cd(-1), cqgr.aR(Integer.valueOf((int) R.id.side_panel)), jjh.c(valueOf), jjh.d(cqrp.d(dcyn.a)), jjh.e(valueOf2), cqgr.fY(cqgr.bs(adzn.a), cqgr.cd(-1), cqgr.fY(cqgr.ce(cqsg.d(ibn.a(), cqrp.d(10.0d))), cqgr.bq(cqsg.d(ibn.a(), cqrp.d(8.0d))), cqgr.aR(valueOf), cqgr.cW(cqgr.q(adzo.a)), cqgr.S(Integer.valueOf((int) R.string.CLOSE_BUTTON)), cqqx.E(cqgr.ce(cqsg.d(cqrp.d(24.0d), cqrp.d(14.0d))), cqgr.bs(adzp.a), cqqx.g(cqrp.d(6.0d)), cqgr.bR(cqrp.d(-12.0d)), cqgr.bw(8388611), cqqx.d(ibm.b()), cqqx.B(true), cqgr.gc(cqgr.ce(cqrp.d(24.0d)), cqgr.bp(-1), cqgr.bw(8388629), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.dy(0, cqrp.d(10.0d), 0, cqrp.d(10.0d)), cqgr.eE(iut.a(cqrt.g(2131232515, ibm.p())))))), cqgr.fY(cqgr.bp(-1), cqgr.ce(cqsg.d(cqrt.d(R.dimen.tablet_landscape_side_sheet_width), cqrp.d(5.0d))), cqgr.dr(0), cqgr.aR(valueOf2), cqic.f(adzq.a, new cqmp[0]), cqgr.gs(cqgr.bw(8388613), cqgr.bp(-1), cqgr.ce(cqrp.d(13.0d)), cqgr.x(iut.a(iva.g(R.drawable.home_side_panel_shadow_rounded_corners, R.drawable.home_side_panel_shadow_rounded_corners_nightmode)))), cqgr.fY(cqgr.bp(-1), cqgr.ce(cqrt.d(R.dimen.tablet_landscape_side_sheet_width)), cqgr.dU(a), cqmn.a(cqgr.x(cqui.c(cquh.g(cqrp.d(8.0d)), cquh.f(ibm.b()))), cqgr.M(true)), cqgr.az(true), GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.side_panel_card_stream_container)), cqgr.bp(-1), cqgr.cd(-1), cqqx.p(null), cqqx.v(adzr.a)), cqgr.gc(cqgr.cd(-1), cqgr.bq(cqrp.d(2.0d)), cqgr.eE(ibp.b()), cqic.f(adzs.a, new cqmp[0]))))));
    }
}
