package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwld  reason: default package */
/* loaded from: classes4.dex */
public class bwld extends cqiw<bwoe> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bwoe bwoeVar, Context context, cqiv cqivVar) {
        bwoe bwoeVar2 = bwoeVar;
        for (jbf jbfVar : bwoeVar2.a()) {
            cqivVar.a(new bwkz(), jbfVar);
            if (bwoeVar2.d().booleanValue()) {
                cqivVar.a(new gvd(), bwoeVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<bwoe> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(ibl.b()), cqgr.gq(cqgr.cd(-1), cqgr.bq(irh.a()), cqgr.aJ(16), cqgr.bR(irh.b()), cqgr.eU(ibl.q()), cqgr.fh(cqrp.d(14.0d)), cqgr.eM(bwlb.a)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())), cqgr.gq(cqgr.cd(-1), cqgr.bq(irh.a()), cqgr.aJ(16), cqgr.bR(irh.e()), cqgr.cW(cqgr.q(bwlc.a)), irn.p(), cqgr.eU(ibl.H()), iue.b(cjtd.a(dtxx.bA)), cqgr.eJ(cqrt.l(R.string.OFFLINE_MAPS_CARD_MANAGE_BUTTON)), cqgr.bD(irh.h())));
    }
}
