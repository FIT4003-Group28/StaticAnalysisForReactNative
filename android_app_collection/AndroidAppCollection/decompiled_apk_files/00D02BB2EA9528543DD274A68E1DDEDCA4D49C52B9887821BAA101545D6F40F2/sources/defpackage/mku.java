package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mku  reason: default package */
/* loaded from: classes7.dex */
public final class mku extends cqiw<moy> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, moy moyVar, Context context, cqiv cqivVar) {
        moy moyVar2 = moyVar;
        int size = moyVar2.b().size();
        float f = context.getResources().getConfiguration().screenHeightDp;
        cqivVar.f(new mlt(true), moyVar2.b().subList(0, Math.min(size, f >= 445.0f ? Integer.MAX_VALUE : f >= 400.0f ? 4 : 3)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<moy> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bv(3), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(nqo.W), cqgr.dB(nqo.W), cqgr.gq(cqgr.aR(Integer.valueOf(mlp.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(mkr.m), cqgr.bG(mkr.m), vlb.a(), nre.e(), cqgr.eM(mks.a), cqgr.aF(cqjv.x(mkt.a)), cqgr.cB(2)), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C()))));
    }
}
