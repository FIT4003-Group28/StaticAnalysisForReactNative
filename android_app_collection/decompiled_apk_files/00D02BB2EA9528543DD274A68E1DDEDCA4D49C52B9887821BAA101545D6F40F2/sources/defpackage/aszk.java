package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aszk  reason: default package */
/* loaded from: classes2.dex */
public final class aszk extends cqiw<aszx> {
    public static final cqtv a = cqrp.d(40.0d);
    public static final int b = cqir.a();
    public static final int c = cqir.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aszx aszxVar, Context context, cqiv cqivVar) {
        for (aszu aszuVar : aszxVar.b()) {
            cqivVar.a(new aszd(), aszuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aszx> a() {
        cqtv cqtvVar = a;
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(cqtvVar), iuy.e(), cqgr.cW(cqgr.q(asze.a)), cqgr.S(Integer.valueOf((int) R.string.DESTINATIONS_PANEL_CONTENT_DESCRIPTION)), iue.c(aszf.a), cqgr.gc(cqgr.ce(cqrp.d(72.0d)), cqgr.bq(cqtvVar), cqgr.eD(2131231804), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.fo(iuy.d())), cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(1.0d)), cqgr.bw(80), iuy.a()));
        cqlc cqlcVar = aszg.a;
        cqgq n = cqgr.n();
        n.a = Float.valueOf(0.67f);
        cqnf b2 = n.b();
        cqgq n2 = cqgr.n();
        n2.a = Float.valueOf(1.0f);
        return aefx.f(cqgr.aR(Integer.valueOf(b)), aefx.b(Float.valueOf(0.3f)), cqgr.cd(-1), cqgr.bp(-1), cqjv.l(cqlcVar, b2, n2.b()), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), iuy.h(), fY, cqgr.fY(GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf(c)), cqgr.cd(-1), cqgr.bp(-2), cqgr.fu(false), cqgr.cZ(aszh.a), cqqx.v(aszi.a)), cqgr.gs(cqgr.aI(aszj.a), cqgr.cd(-1), cqgr.bq(cqrp.d(4.0d)), cqgr.bw(48), cqgr.x(ibp.b())))));
    }
}
