package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: uyg  reason: default package */
/* loaded from: classes7.dex */
public final class uyg extends cqiw<zcf> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcf zcfVar, Context context, cqiv cqivVar) {
        cqiw qjbVar;
        zcf zcfVar2 = zcfVar;
        dcdc<zdu> a = zcfVar2.a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (zdu) a.get(i2);
            if (obj instanceof zdt) {
                qjbVar = new qit();
                obj = (zdt) obj;
            } else {
                qjbVar = new qjb();
            }
            cqivVar.a(qjbVar, obj);
        }
        cqivVar.a(new vlc(), zcfVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zcf> a() {
        cqjb<zcf, cqiv> C = C();
        Float valueOf = Float.valueOf(1.0f);
        return jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.x(irn.G()), vlh.j(), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(cqrp.d(6.0d)), jgi.e(cqrp.d(4.0d)), cqgr.aJ(16), vlh.g(C, cqgr.ce(cqrp.d(dcyn.a)), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.aF(cqjv.x(uxu.a))), vlh.b(uxx.a, uxy.a, cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5))), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), jgi.e(irh.g()), cqgr.gq(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.eN(5), cqgr.eM(uxz.a), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), ibq.x()), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5), cqgr.eM(uya.a), cqgr.V(uyb.a), ibq.p(), irn.v())), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), jgi.e(irh.g()), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.aF(cqjv.x(uyc.a)), cqgr.eN(5), cqgr.eM(uyd.a), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), ibq.y())), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.aI(uye.a), cqgr.dU(cqrp.d(4.0d)), jgi.e(irh.g()), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.aF(cqjv.x(uyf.a)), cqgr.eN(5), cqgr.eM(uxv.a)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5), cqgr.eM(uxw.a), ibq.q(), cqgr.eU(ibm.n()))));
    }
}
