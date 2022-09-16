package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsqc  reason: default package */
/* loaded from: classes4.dex */
final class bsqc extends brua {
    @Override // defpackage.brtf, defpackage.cqiw
    public final cqmj<brve> a() {
        return cqgr.fY(cqgr.z(ibm.b()), cqgr.cd(-1), cqgr.bp(-1), cqgr.dk(bspx.a), iue.c(bspy.a), iue.e(bspz.a), cqgr.cW(cqgr.q(bsqa.a)), cqgr.gj(cqgr.bp(-1), q(), l()));
    }

    @Override // defpackage.brtf
    protected final cqmp<brve> h() {
        return cqgr.fP(bfka.g(), bsqb.a, cqgr.bp(-1));
    }

    @Override // defpackage.brtf
    protected final cqmj<brve> l() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bY(cqjd.j()), j());
    }

    @Override // defpackage.brtf
    protected final cqmj<brve> u(brvd brvdVar) {
        cqmj<brve> u = super.u(brvdVar);
        u.g(cqgr.dU(cqrp.d(4.0d)));
        return u;
    }

    @Override // defpackage.brtf
    protected final void o(int i, brvd brvdVar, Context context, cqiv cqivVar) {
        if (i == 1) {
            List<? extends bevj> R = brvdVar.A().R();
            if (R == null) {
                return;
            }
            for (int i2 = 0; i2 < Math.min(R.size(), 3); i2++) {
                cqivVar.a(new bevh(), R.get(i2));
            }
            return;
        }
        super.RI(i, brvdVar, context, cqivVar);
    }
}
