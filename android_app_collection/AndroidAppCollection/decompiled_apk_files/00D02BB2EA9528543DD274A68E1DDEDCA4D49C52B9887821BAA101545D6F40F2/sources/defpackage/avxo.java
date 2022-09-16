package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: avxo  reason: default package */
/* loaded from: classes3.dex */
public final class avxo extends cqiw<avxp> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, avxp avxpVar, Context context, cqiv cqivVar) {
        avxp avxpVar2 = avxpVar;
        List<avwq> c = avxpVar2.c();
        List<avwq> d = avxpVar2.d();
        if (avxpVar2.g().booleanValue()) {
            cqivVar.a(new avxn(), avxpVar2.f());
        } else if (avxpVar2.i().booleanValue()) {
            cqivVar.a(new avxm(), new ixw().a());
        } else {
            boolean z = c != null && !c.isEmpty();
            if (!z) {
                cqivVar.b(new avxg(), new ixw().a(), false);
                cqivVar.d(new avxh(), false);
            }
            if (avxpVar2.n().booleanValue()) {
                cqivVar.a(new avxb(), avxpVar2);
                if (d != null && !d.isEmpty()) {
                    cqivVar.d(new avxh(), false);
                    avxl avxlVar = new avxl();
                    ixw ixwVar = new ixw();
                    ixwVar.d = avxpVar2;
                    ixwVar.a = avxpVar2.p();
                    ixwVar.b = avxpVar2.r(d);
                    cqivVar.b(avxlVar, ixwVar.a(), false);
                    cqivVar.f(new avwo(), d);
                }
            }
            if (!z) {
                return;
            }
            cqivVar.d(new avxh(), false);
            avxl avxlVar2 = new avxl();
            ixw ixwVar2 = new ixw();
            ixwVar2.a = avxpVar2.q();
            ixwVar2.b = avxpVar2.r(c);
            cqivVar.b(avxlVar2, ixwVar2.a(), false);
            cqivVar.f(new avwo(), c);
            if (!avxpVar2.m().booleanValue()) {
                return;
            }
            avxpVar2.o();
            cqivVar.b(new avxf(), avxpVar2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<avxp> a() {
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.ge(cqgr.ca(valueOf), cqgr.ck(C()), cqgr.cq(cqta.f()), cqgr.af(null))};
        cqrp d = cqrp.d(8.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.z(ibm.b()), cqgr.fY(cqgr.bp(0), cqgr.ca(valueOf), cqgr.dU(cqrp.d(12.0d)), cqgr.gd(cqmpVarArr), cqgr.fY(cqgr.aG(false), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(81), cqgr.gq(cqgr.eM(avwy.a), cqgr.dz(d, d, d, d), ibq.p(), ibq.y()))), cqgr.fP(new avyk(), avwz.a, new cqmp[0]));
    }
}
