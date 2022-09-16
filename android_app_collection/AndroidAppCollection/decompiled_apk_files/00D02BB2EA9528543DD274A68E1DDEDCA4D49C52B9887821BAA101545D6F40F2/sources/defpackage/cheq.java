package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cheq  reason: default package */
/* loaded from: classes4.dex */
public final class cheq extends cqiw<chml> {
    @SafeVarargs
    private static cqmj<chml> e(cqmp<chml>... cqmpVarArr) {
        cqmj<chml> gs = cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(1.0d)), cqgr.z(cqrt.c(R.color.stats_page_title_text)));
        gs.f(cqmpVarArr);
        return gs;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chml chmlVar, Context context, cqiv cqivVar) {
        for (chmk chmkVar : chmlVar.b()) {
            cqivVar.a(new chep(), chmkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chml> a() {
        String a = B().a();
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqjv.k(E(), cqgr.dB(cqrp.d(dcyn.a)), cqgr.dB(cqrp.d(5.0d))), cqgr.gd(cqgr.aD(cqjv.v(a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(16), cqgr.dB(cqrp.d(20.0d)), e(cqgr.ca(valueOf)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.ca(Float.valueOf(0.0f)), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), irn.j(), cqgr.cj(Float.valueOf(0.2f)), cqgr.fj(1), cqgr.eU(irg.j()), cqgr.eI(a)), e(cqgr.ca(valueOf))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C())));
    }
}
