package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bhkt  reason: default package */
/* loaded from: classes3.dex */
public final class bhkt extends cqiw<actl> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, actl actlVar, Context context, cqiv cqivVar) {
        actl actlVar2 = actlVar;
        Iterator<? extends actk> it = actlVar2.j().iterator();
        while (it.hasNext()) {
            cqivVar.a(new bhks(), (actm) it.next());
        }
        if (actlVar2.q().booleanValue()) {
            cqivVar.a(new bhkm(), actlVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<actl> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), aclf.b(bhjx.a), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.gq(cqgr.aF(cqjv.x(bhjy.a)), cqgr.bp(-2), cqgr.cd(-1), cqgr.ca(Float.valueOf(1.0f)), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.dU(cqrp.d(14.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.aJ(16), cqgr.az(true), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(bhjz.a), ibq.t(), cqgr.co(cqrp.f(8.0d), false), cqgr.eN(5), aclf.b(bhka.a)), cqgr.gq(cqic.f(bhkb.a, new cqmp[0]), cqgr.cL(ibn.a()), cqgr.cH(ibn.a()), cqgr.bG(ibn.f()), ibq.u(), cqgr.aJ(16), cqgr.eM(bhkc.a), cqgr.co(cqrp.f(8.0d), false), cqgr.eU(ibm.x()), cqgr.eN(6), cqgr.cW(bhkd.a), aclf.b(bhke.a))), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.dE(bhkf.a), cqgr.P(false), cqgr.af(cqtt.j(cqtt.c(), cqrp.d(8.0d))), cqgr.ez(2), cqgr.ck(C())));
    }
}
