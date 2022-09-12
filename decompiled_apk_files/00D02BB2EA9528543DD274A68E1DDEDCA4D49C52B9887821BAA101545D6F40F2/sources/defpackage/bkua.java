package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bkua  reason: default package */
/* loaded from: classes3.dex */
public final class bkua extends cqiw<bkub> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.d(2.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bkub bkubVar, Context context, cqiv cqivVar) {
        bkub bkubVar2 = bkubVar;
        int intValue = bkubVar2.b().intValue();
        int i2 = 0;
        while (i2 < intValue) {
            bkuc a2 = bkubVar2.a(i2);
            if (a2 != null) {
                cqivVar.a(new bktz(i2 == 0 ? irh.b() : b, i2 == intValue + (-1) ? irh.b() : b), a2);
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bkub> a() {
        return cqgr.gd(cqgr.aF(bktt.a), cqgr.bV(cqrp.d(12.0d)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), iue.b(cjtd.a(dtya.ed)), cqgr.fY(cqgr.fR(new bktz(irh.b(), irh.b()), bktu.a, cqgr.cd(-1)), cqgr.aI(bktv.a)), GmmRecyclerView.aw(C(), cqqx.G(), cqqx.p(null), cqgr.cd(-1), cqgr.bp(-2), cqgr.ep(false), cqgr.L(false), cqgr.P(false), cqgr.aI(bktw.a)), cqgr.gm(cqgr.cd(-1), cqgr.bq(cqrp.d(12.0d))), ict.n(false, new cqmp[0]));
    }
}
