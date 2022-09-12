package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agrw  reason: default package */
/* loaded from: classes2.dex */
public final class agrw extends cqiw<agxd> {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [agwt] */
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agxd agxdVar, Context context, cqiv cqivVar) {
        int i2;
        cqiw agrvVar;
        agxd agxdVar2;
        agxd agxdVar3 = agxdVar;
        List<agwt> e = agxdVar3.e();
        if (e.isEmpty()) {
            return;
        }
        if (i == 1) {
            if (!agxdVar3.f().booleanValue()) {
                return;
            }
            if (e.size() < 3) {
                agrvVar = new agrf(agre.h().a());
                agxdVar2 = e.get(0);
            } else {
                agrvVar = new agrv();
                agxdVar2 = agxdVar3;
            }
            cqivVar.a(agrvVar, agxdVar2);
        } else if (i != 2 || !agxdVar3.g().booleanValue()) {
        } else {
            int min = Math.min(e.size(), 3);
            int i3 = 0;
            while (i3 < min) {
                int i4 = min - 1;
                agrd h = agre.h();
                h.c(false);
                float f = 1.0f;
                if (min == 2 && i3 == 0) {
                    f = 2.0f;
                    i2 = 0;
                } else {
                    i2 = i3;
                }
                h.d(f);
                h.f(i3 == i4 ? 0 : 2);
                cqivVar.a(new agrf(h.a()), e.get(i2));
                i3 = i2 + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agxd> a() {
        cqlc cqlcVar = agri.a;
        final cqlc cqlcVar2 = agrm.a;
        cqmp[] cqmpVarArr = {cqic.f(agrr.a, new cqmp[0]), cqgr.cd(-1), cqgr.bq(agss.f(0.5625f)), cqgr.ck(D(1))};
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqic.f(agru.a, new cqmp[0]), cqgr.cd(-1), cqgr.bq(agss.f(0.33333334f)), cqgr.ck(D(2))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(56.0d)), cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(12.0d)), cqgr.dr(0), cqgr.aJ(16), agss.b(cqlcVar), agss.c(cqlcVar), agss.d(cqlcVar), agss.e(cqlcVar, cqgr.cW(cqgr.r(agrj.a))))};
        cqmp[] cqmpVarArr3 = {cqgr.ca(Float.valueOf(1.0f))};
        cqmj e = agib.e(agrk.a, agrl.a, cqlcVar2);
        e.f(cqgr.bV(cqrp.d(8.0d)));
        return cqgr.fY(cqgr.aT(agta.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.K(agrn.a), cqgr.x(irn.G()), cqgr.cW(cqgr.q(agro.a)), iue.c(agrp.a), cqgr.dk(agrq.a), cqgr.gd(cqmpVarArr), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.cJ(agrs.a), cqgr.dr(1), cqgr.y(new cqlc(cqlcVar2) { // from class: agrt
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                agxd agxdVar = (agxd) cqkpVar;
                int i = agrw.a;
                if (!((Boolean) cqlcVar3.a(agxdVar)).booleanValue() || agxdVar.h().booleanValue()) {
                    return null;
                }
                return agss.a;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.fY(cqmpVarArr2), cqgr.gm(cqmpVarArr3), cqgr.gd(cqgr.cd(-1), cqgr.dU(agss.b), cqgr.dB(agss.b), cqgr.dQ(agss.c), cqgr.dF(agss.c), cqgr.dr(1), agss.a(cqlcVar2), e)));
    }
}
