package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsmq  reason: default package */
/* loaded from: classes4.dex */
public final class bsmq extends cqiw<bsmy> {
    private static final cqrp a = cqrp.d(8.0d);
    private final boolean b;

    public bsmq(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bsmy bsmyVar, Context context, cqiv cqivVar) {
        cqiw bsmwVar;
        Object obj;
        List<bsmz> a2 = bsmyVar.a();
        int i2 = 0;
        while (i2 < a2.size()) {
            Object obj2 = (bsmz) a2.get(i2);
            if (obj2 instanceof bsmx) {
                bsmwVar = new bsmk();
                obj = (bsmx) obj2;
            } else {
                bsmwVar = new bsmw(i2 == 0 ? 0 : 4);
                obj = (bsmz) a2.get(i2);
            }
            cqivVar.a(bsmwVar, obj);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bsmy> a() {
        cqmp<bsmy>[] cqmpVarArr = {iue.f(cqgr.aF(cqjv.x(bsmm.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.bD(ibn.f()), ibq.m(), ibq.x(), cqgr.eN(5), cqgr.eM(bsmn.a)), jgv.a(C(), iue.c(bsmo.a), cqgr.dk(bsmp.a))};
        cqlc x = cqjv.x(bsml.a);
        cqrp cqrpVar = a;
        cqmj<bsmy> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dQ(cqrp.d(18.0d)), cqgr.dF(cqrp.d(18.0d)), cqjv.n(x, cqmn.a(cqgr.dU(cqrpVar), cqgr.dB(cqrpVar)), cqmn.a(cqgr.dU(ibn.f()), cqgr.dB(ibn.f()))), cqgr.P(false), cqgr.z(ibm.b()));
        gd.f(cqmpVarArr);
        if (this.b) {
            cqmj<bsmy> fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(cqrp.d(10.0d)), cqgr.z(ibm.i()));
            fY.f(gd);
            return fY;
        }
        return gd;
    }
}
