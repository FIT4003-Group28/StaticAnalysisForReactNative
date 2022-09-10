package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: lso  reason: default package */
/* loaded from: classes7.dex */
public final class lso extends cqiw<atxz> {
    static final cqtv a = cqrp.d(64.0d);
    private static final cqtv b = nsg.c(8, 12);
    private static final cqtv c = nsg.c(138, 168);
    private static final cqtv d = nsg.c(178, 208);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atxz atxzVar, Context context, cqiv cqivVar) {
        atxz atxzVar2 = atxzVar;
        if (i == 1) {
            if (!atxzVar2.J(1).booleanValue()) {
                return;
            }
            atxw K = atxzVar2.K(1);
            if (!(K instanceof atxy)) {
                return;
            }
            cqivVar.a(new lsm(), ((atxy) K).b());
        } else if (i == 2) {
            if (!atxzVar2.J(0).booleanValue()) {
                return;
            }
            mac.a(dcdc.f(atxzVar2.K(0)), cqivVar, a);
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown list type: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atxz> a() {
        Boolean J = B().J(1);
        cqnf dy = cqgr.dy(0, 0, 0, 0);
        cqrp cqrpVar = nqo.R;
        return nqk.a(cqgr.ce(nqo.am), cqgr.bA(nqo.Q), cqjv.k(cqjv.v(B().A()), cqgr.bq(c), cqgr.bq(d)), nsc.y(nsc.m(Integer.valueOf(mac.b)), cqgr.gc(cqjv.m(B().J(1), cqgr.ch(nqo.Z), cqgr.ch(nqo.Y)), cqjv.k(J, dy, cqgr.dz(cqrpVar, cqrpVar, cqrpVar, cqrpVar)), cqjv.k(B().J(1), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)), cqgr.eF(new lsn())), cqgr.fY(cqgr.am(true), cqgr.ck(D(1))), cqgr.gd(cqgr.dr(1), cqgr.gd(cqgr.aR(Integer.valueOf(mac.b)), cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), cqgr.dQ(nqo.V), cqgr.dF(nqo.R), cqgr.dU(b), cqjv.k(B().J(1), nqu.a(B().K(0).o()), cqgr.x(null)), cqjv.k(B().J(1), cqgr.az(B().K(1).o()), cqgr.az(false)), cqjv.k(B().J(1), itj.g(B().K(1).c()), itj.g(null)), cqgr.gq(cqgr.bD(nqo.X), cqgr.aZ(false), cqgr.aJ(8388611), vlb.a(), nre.j(), cqgr.cB(2), cqgr.eI(B().x())), cqgr.gq(cqgr.am(true), cqgr.aJ(8388611), vlb.a(), nre.r(), cqgr.eB(true), cqgr.eI(B().A()))), cqgr.fY(cqgr.bp(-2), cqgr.ck(D(2))))));
    }
}
