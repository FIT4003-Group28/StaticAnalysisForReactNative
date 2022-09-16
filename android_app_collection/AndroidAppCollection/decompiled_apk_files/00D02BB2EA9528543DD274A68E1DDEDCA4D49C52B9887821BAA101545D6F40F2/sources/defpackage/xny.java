package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: xny  reason: default package */
/* loaded from: classes7.dex */
final class xny extends cqiw<xyy> {
    public static final cqtv a = cqrp.f(20.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, xyy xyyVar, Context context, cqiv cqivVar) {
        cqiw xnxVar;
        Object obj;
        xyy xyyVar2 = xyyVar;
        List<xyx> a2 = xyyVar2.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (xyyVar2.b().booleanValue()) {
                xnxVar = new xyo();
                obj = cqkp.T;
            } else {
                xnxVar = new xnx();
                obj = (xyx) a2.get(i2);
            }
            cqivVar.a(xnxVar, obj);
            if (i2 < a2.size() - 1) {
                cqivVar.a(new hsd(), hsd.d(irh.k()));
            }
        }
        cqivVar.a(new hsd(), hsd.d(irh.k()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<xyy> a() {
        cqrp f = cqrp.f(50.0d);
        cqrp f2 = cqrp.f(19.0d);
        cqmp[] cqmpVarArr = {cqic.f(xnm.a, new cqmp[0])};
        cqmp[] cqmpVarArr2 = {cqic.c(xnn.a, new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.DIRECTIONS_DETAILS_MULTIMODAL_OTHER_OPTIONS_TEXT)), xyq.b()};
        cqjb<xyy, cqiv> C = C();
        cqmp[] cqmpVarArr3 = {cqqx.G(), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.P(false), cqgr.ep(false)};
        cqmp[] cqmpVarArr4 = {cqgr.bw(8388629)};
        cqmj gc = cqgr.gc(cqgr.ce(cqrp.d(60.0d)), cqgr.bp(-1), cqgr.bg(iut.a(cqui.c(cquh.d(GradientDrawable.Orientation.LEFT_RIGHT), cquh.a(0), cquh.i(ibl.a(), ibm.b())))));
        gc.f(cqmpVarArr4);
        return jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.az(true), iue.c(xnl.a), xyp.a(f, f2, cqmpVarArr), cqgr.gq(cqmpVarArr2), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), GmmRecyclerView.aw(C, cqmpVarArr3), gc));
    }
}
