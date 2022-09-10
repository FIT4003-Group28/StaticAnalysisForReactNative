package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: ojs  reason: default package */
/* loaded from: classes7.dex */
public final class ojs extends cqiw<oxi> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxi oxiVar, Context context, cqiv cqivVar) {
        oxi oxiVar2 = oxiVar;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return;
            }
            cqivVar.f(new ojq(), oxiVar2.w());
            return;
        }
        List<oxh> C = oxiVar2.C();
        if (C.isEmpty()) {
            return;
        }
        if (i == 0) {
            cqivVar.a(new ojo(), C.get(0));
            return;
        }
        int min = Math.min(3, C.size());
        for (int i2 = 1; i2 < min; i2++) {
            if (i2 != 1) {
                cqivVar.a(new ojr(), C.get(i2));
            }
            cqivVar.a(new ojo(), C.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxi> a() {
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.cd(0), cqgr.bp(-1), cqgr.ca(Float.valueOf(2.0f)), cqgr.ck(D(0))};
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(160.0d)), cqgr.aF(cqjv.x(ojd.a)), cqgr.cW(acly.a(oje.a)), cqgr.K(ojf.a), cqgr.az(true), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqmpVarArr), cqgr.gd(cqgr.dr(1), cqgr.aF(ojg.a), cqgr.cd(0), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.bR(cqrp.d(2.0d)), cqgr.ck(D(1)))), cqgr.fY(cqgr.aI(ojh.a), cqgr.cd(-1), cqgr.bq(cqrp.d(40.0d)), cqgr.A(-1879048192), cqgr.bw(80), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-1), cqgr.bR(irh.b()), cqgr.bG(irh.b()), cqgr.aJ(16), WebImageView.a(cqgr.aI(oji.a), cqgr.ce(cqrp.d(16.0d)), cqgr.bq(cqrp.d(16.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.bG(cqrp.d(10.0d)), WebImageView.l(ojj.a)), iue.f(irn.p(), cqgr.m(ojk.a), cqgr.cj(Float.valueOf(0.1f)), cqgr.bp(-2), cqgr.cd(0), cqgr.ca(valueOf), cqgr.eW(ojl.a), cqgr.eN(5), cqgr.eM(ojm.a)), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.ck(D(2))))));
    }
}
