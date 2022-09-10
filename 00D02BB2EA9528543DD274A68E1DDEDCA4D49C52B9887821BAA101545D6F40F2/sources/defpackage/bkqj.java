package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkqj  reason: default package */
/* loaded from: classes3.dex */
public final class bkqj extends cqiw<bksa> {
    public static final cqjg a = cqjg.a();

    public bkqj() {
        super(20, 0, true);
    }

    private static final int e() {
        return Math.max(0, 12);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bksa bksaVar, Context context, cqiv cqivVar) {
        cqiw bkrqVar;
        bksa bksaVar2 = bksaVar;
        Object d = bksaVar2.d();
        if (d != null) {
            cqivVar.f(new bkqe(), bksaVar2.c());
            bkrqVar = new bkqe();
        } else {
            cqivVar.f(new bkqe(), bksaVar2.b());
            d = bksaVar2.e();
            if (d == null) {
                return;
            }
            bkrqVar = new bkrq();
        }
        cqivVar.a(bkrqVar, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bksa> a() {
        return cqgr.gd(cqgr.aT(a), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.aR(Integer.valueOf((int) R.id.filter_toolbar_view)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.bD(cqrp.d(dcyn.a)), iue.b(cjtd.a(dtxy.nK)), cqgr.aW(2), cqgr.dU(cqrp.d(e())), cqgr.dB(cqrp.d(e())), cqgr.bm(bkqf.a), cqgr.gq(cqgr.eL(Integer.valueOf((int) R.string.PLACE_TOPICS_HEADER)), ibq.k(), ibq.A(), cqgr.bR(cqrp.d(4.0d))), cqpi.a(cqgr.cd(-1), cqgr.bp(-2), cqpi.g(), cqpi.f(), cqpi.e(), cqgr.ck(C())), cqgr.gq(cqgr.aF(cqjv.x(bkqg.a)), cqgr.bR(cqrp.d(4.0d)), cqgr.eM(bkqh.a), cqgr.fj(2), cqgr.eY(ibm.n()), cqgr.cO(LinkMovementMethod.getInstance()))), cqgr.fP(ict.p(false, new cqmp[0]), bkqi.a, new cqmp[0]));
    }
}
