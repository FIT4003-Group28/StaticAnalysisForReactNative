package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmcl  reason: default package */
/* loaded from: classes3.dex */
public final class bmcl extends cqiw<bmcv> {
    private static final qa a = new bmch();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bmcv bmcvVar, Context context, cqiv cqivVar) {
        bmcv bmcvVar2 = bmcvVar;
        List<bmcs> a2 = bmcvVar2.a();
        if (a2.isEmpty()) {
            cqivVar.a(new acnn(), bmcvVar2);
        } else {
            gva.b(cqivVar, a2, new bmbx(), ict.p(false, new cqmp[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bmcv> a() {
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-1);
        cqmpVarArr[2] = cqgr.dr(1);
        cqmpVarArr[3] = cqgr.z(irg.a());
        cqmp[] cqmpVarArr2 = new cqmp[9];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqmpVarArr2[1] = cqgr.bV(cqrp.d(10.0d));
        cqmpVarArr2[2] = cqgr.bD(cqrp.d(10.0d));
        cqmpVarArr2[3] = cqgr.bR(cqrp.d(16.0d));
        cqmpVarArr2[4] = cqgr.bG(cqrp.d(16.0d));
        cqmpVarArr2[5] = cqgr.eN(5);
        cqmpVarArr2[6] = cqgr.eU(irg.H());
        cqmpVarArr2[7] = cqgr.fh(cqrp.f(16.0d));
        int bi = ((btvq) btsr.a(btvq.class)).rp().getUgcParameters().bi();
        int i = bi - 1;
        if (bi == 0) {
            throw null;
        }
        cqmpVarArr2[8] = cqgr.eL(Integer.valueOf((i == 2 || i == 3 || i == 4) ? R.string.EDIT_SCALABLE_ATTRIBUTES_DESCRIPTION_SELECT_FEATURES : R.string.EDIT_SCALABLE_ATTRIBUTES_DESCRIPTION));
        cqmpVarArr[4] = cqgr.gq(cqmpVarArr2);
        cqmpVarArr[5] = cqgr.fP(new bmck(), bmcg.a, new cqmp[0]);
        cqmpVarArr[6] = acnp.a(cqgr.cd(-1), cqgr.bp(-1), cqjv.j(acno.a, a), aclf.a(acli.a(dtxo.aa)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.ck(C()), cqgr.dB(cqrp.d(32.0d))));
        return cqgr.gd(cqmpVarArr);
    }
}
