package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aawi  reason: default package */
/* loaded from: classes2.dex */
public final class aawi extends cqiw<aawy> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aawy aawyVar, Context context, cqiv cqivVar) {
        aawy aawyVar2 = aawyVar;
        int i2 = 0;
        while (i2 < aawyVar2.b().size()) {
            cqivVar.a(i2 == 0 ? new aawe() : new aawh(), aawyVar2.b().get(i2));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aawy> a() {
        return cqgr.gd(cqgr.aT(a), cqgr.cd(-1), cqgr.dr(1), cqgr.dQ(aahw.a(20)), cqgr.dF(aahw.a(20)), cqgr.dB(cqrp.d(20.0d)), cqgr.P(false), cqgr.L(false), aahw.b(), cqgr.fY(cqgr.aT(b), cqgr.cd(-1), cqgr.dr(1), cqgr.gq(cqgr.aF(cqjv.x(aavv.a)), cqgr.dU(cqrp.d(16.0d)), aahw.e(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cB(3), cqgr.eM(aavw.a)), cqgr.bp(-2)), cqgr.fR(new aavh(), aavx.a, new cqmp[0]), cqgr.gm(cqgr.bs(aavy.a)), cqgr.gd(cqgr.dr(1), cqgr.ck(C())), cqgr.gm(cqgr.aF(cqjv.x(aavz.a)), cqgr.bs(aawa.a)), cqgr.fR(new aaix(), aawb.a, cqgr.bV(cqrp.d(-6.0d)), cqgr.bD(cqrp.d(-6.0d)), cqgr.bR(cqrp.d(-6.0d)), cqgr.P(false), cqgr.L(false)));
    }
}
