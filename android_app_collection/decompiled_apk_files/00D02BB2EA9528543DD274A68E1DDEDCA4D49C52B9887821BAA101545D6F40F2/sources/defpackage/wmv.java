package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wmv  reason: default package */
/* loaded from: classes7.dex */
public final class wmv extends cqiw<wpn> {
    public static final /* synthetic */ int a = 0;
    private static final jby b = hsd.f(cqrp.d(16.0d), cqrp.d(24.0d));
    private static final jby c = hsd.f(cqrp.d(52.0d), cqrp.d(24.0d));

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wpn wpnVar, Context context, cqiv cqivVar) {
        cqivVar.a(new hsd(), b);
        cqivVar.f(new wnc(), wpnVar.a());
        cqivVar.a(new hsd(), c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wpn> a() {
        cqjb<wpn, cqiv> C = C();
        cqmp[] cqmpVarArr = {cqgr.aT(zaa.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(52.0d)), cqgr.aI(wmq.a), cqqx.G(), cqgr.ep(false), iue.d(wmr.a, cqkz.a(dtyc.eY))};
        cqmp[] cqmpVarArr2 = {cqgr.bw(8388629)};
        cqmj fY = cqgr.fY(cqgr.ce(cqrp.d(56.0d)), cqgr.bp(-1), cqgr.aI(wms.a), cqgr.x(cqui.c(cquh.a(0), cquh.d(GradientDrawable.Orientation.LEFT_RIGHT), cquh.i(ibm.a(), ibm.b(), ibm.b(), ibm.b()))), itj.q(), cqgr.gb(cqgr.cd(-1), cqgr.bp(-1), cqgr.J(true), cqgr.cW(wmt.a), cqgr.S(Integer.valueOf((int) R.string.TRANSIT_STATION_ENABLE_ALL_LINES_BUTTON_CONTENT_DESCRIPTION)), cqgr.x(irm.b), cqgr.eE(cqrt.g(2131232575, ibm.n())), cqgr.ei(ImageView.ScaleType.CENTER), iue.d(wmu.a, cqkz.a(dtyc.fb))));
        fY.f(cqmpVarArr2);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(8.0d)), GmmRecyclerView.aw(C, cqmpVarArr), fY);
    }
}
