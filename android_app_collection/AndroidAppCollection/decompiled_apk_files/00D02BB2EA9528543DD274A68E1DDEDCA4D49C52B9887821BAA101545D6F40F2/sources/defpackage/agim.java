package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agim  reason: default package */
/* loaded from: classes2.dex */
public final class agim extends cqiw<agwu> {
    private static final dcqe a = dcqe.c("agim");

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agwu agwuVar, Context context, cqiv cqivVar) {
        int i2;
        List<agwt> f = agwuVar.f();
        if (f.isEmpty()) {
            bvoo.h("No image to render on place snippet.", new Object[0]);
            return;
        }
        int min = Math.min(f.size(), 2);
        int i3 = 0;
        while (i3 < min) {
            int i4 = min - 1;
            float f2 = 1.0f;
            if (min == 2 && i3 == 0) {
                f2 = 2.0f;
                i2 = 0;
            } else {
                i2 = i3;
            }
            cqivVar.a(new agil(f2, i3 == i4 ? 0 : 2), f.get(i2));
            i3 = i2 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agwu> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.x(irn.G()), cqgr.cW(cqgr.q(agic.a)), iue.c(agid.a), cqgr.L(false), cqgr.P(false), cqgr.gd(cqgr.cd(-1), cqgr.bq(cqrp.d(100.0d)), cqgr.ck(C())), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrp.d(8.0d)), cqgr.aJ(16), cqgr.gd(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bR(cqrp.d(8.0d)), cqgr.bV(cqrp.d(16.0d)), cqgr.bD(cqrp.d(16.0d)), cqgr.bI(agie.a), cqgr.dr(1), iue.f(ibq.f(), cqgr.eU(ibm.t()), cqgr.eN(5), cqgr.eM(agif.a)), agoc.e(cqgr.bV(cqrp.d(2.0d))), iue.f(cqic.c(cqjv.x(agig.a), new cqmp[0]), cqgr.bV(cqrp.d(1.0d)), ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.eM(agih.a))), cqgr.fP(new agqs(70, true), agii.a, cqgr.aI(agij.a), cqgr.dF(cqrp.d(16.0d)))));
    }
}
