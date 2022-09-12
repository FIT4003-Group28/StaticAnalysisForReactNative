package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdij  reason: default package */
/* loaded from: classes4.dex */
public final class cdij extends cqiw<cdin> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cdin cdinVar, Context context, cqiv cqivVar) {
        for (cdim cdimVar : cdinVar.f()) {
            cqivVar.a(new cdii(), cdimVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdin> a() {
        cqlc a2 = cqkz.a(ibn.l());
        cqmp[] cqmpVarArr = {cqgr.aI(cdhw.a), cqgr.bw(1), cqgr.ce(cqrp.d(48.0d)), cqgr.bq(cqrp.d(48.0d))};
        cqmp[] cqmpVarArr2 = {cqgr.aI(cdhx.a), cqgr.ca(Float.valueOf(1.0f)), cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.ck(C()))};
        cqrp f = ibn.f();
        cqmp[] cqmpVarArr3 = {cqgr.aI(cdhy.a), cqgr.dr(1), cqgr.bp(-2), cqgr.dz(f, f, f, f), cqgr.aJ(1), cqgr.x(ibq.E()), cqgr.cW(cqgr.q(cdhz.a)), cqgr.gc(cqgr.eE(cqrt.g(2131231773, ibm.C()))), ijc.h(cqsk.b(cqrt.l(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY)), cqgr.bV(ibn.f()))};
        cqrp f2 = ibn.f();
        return ijc.b(a2, cqgr.cd(-1), cqgr.bp(-2), ijc.f(cdhq.a, new cqmp[0]), cqgr.gg(cqmpVarArr), cqgr.gk(cqmpVarArr2), cqgr.gd(cqmpVarArr3), cqgr.gq(cqgr.aI(cdia.a), cqgr.bL(cqrp.d(12.0d)), cqgr.bO(cqrp.d(12.0d)), cqgr.bD(cqrp.d(6.0d)), cqgr.bV(cqrp.d(6.0d)), cqgr.dz(f2, f2, f2, f2), iue.b(cjtd.a(dtyd.z)), cqgr.x(ibq.E()), cqgr.eN(5), ibq.r(), cqgr.eU(ibm.y()), cqgr.eJ(cqrt.l(R.string.IAMHERE_SOMEWHERE_ELSE)), cqgr.cW(cqgr.q(cdib.a))), ijc.n(cdic.a, cqgr.q(cdid.a), cqkz.a(cjtd.a(dtyd.x)), cqkz.a(null), cqkz.a(null), cqkz.a(null), cqgr.aF(cdie.a)), ijc.n(cdhr.a, cqgr.q(cdhs.a), cqkz.a(cjtd.a(dtyd.x)), cdht.a, cqgr.q(cdhu.a), cqkz.a(null), cqgr.aI(cdhv.a)));
    }
}
