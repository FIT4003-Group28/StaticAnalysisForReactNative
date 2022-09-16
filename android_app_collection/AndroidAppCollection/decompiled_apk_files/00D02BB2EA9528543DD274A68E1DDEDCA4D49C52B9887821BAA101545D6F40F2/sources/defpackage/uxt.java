package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: uxt  reason: default package */
/* loaded from: classes7.dex */
public final class uxt extends cqiw<zcf> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcf zcfVar, Context context, cqiv cqivVar) {
        cqiw qjbVar;
        zcf zcfVar2 = zcfVar;
        dcdc<zdu> b = zcfVar2.b();
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (zdu) b.get(i2);
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
        return jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(cqrp.d(14.0d)), jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(48), cqgr.dQ(irh.b()), cqgr.dF(irh.b()), cqgr.dU(cqrp.d(14.0d)), jgi.e(cqrp.d(6.0d)), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), jgi.e(cqrp.d(8.0d)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), irn.E(), ibq.e(), cqgr.eM(uxn.a), cqgr.V(uxo.a)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), irn.E(), ibq.e(), ibq.y(), cqgr.eK(cqiq.c("(%s)", cqiq.h(uxp.a))))), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(16), vlh.g(C(), cqgr.ce(cqrp.d(dcyn.a)), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.aF(cqjv.x(uxq.a))), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(16), cqgr.aJ(8388629), irn.E(), ibq.p(), ibq.y(), cqgr.eM(uxr.a), cqgr.V(uxs.a)))), cqgr.fP(new uzo(), uxm.a, cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388613)));
    }
}
