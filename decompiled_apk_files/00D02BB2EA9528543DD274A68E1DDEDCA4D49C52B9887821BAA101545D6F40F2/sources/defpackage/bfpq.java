package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bfpq  reason: default package */
/* loaded from: classes3.dex */
public final class bfpq extends cqiw<bfrr> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bfrr bfrrVar, Context context, cqiv cqivVar) {
        bfrr bfrrVar2 = bfrrVar;
        bfrs l = bfrrVar2.l();
        if (l != null) {
            if (bfrrVar2.o().booleanValue()) {
                cqivVar.a(new bfpc(), l);
                return;
            } else {
                cqivVar.a(new bfpi(), l);
                cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
            }
        }
        if (!bfrrVar2.e().booleanValue()) {
            cqivVar.a(new bfoy(), bfrrVar2);
            return;
        }
        cqivVar.a(new bfns(true), bfrrVar2.f());
        cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
        aeqj p = bfrrVar2.p();
        if (p != null) {
            cqivVar.a(new bfon(), p);
            cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
        }
        cqivVar.f(new bfqt(), bfrrVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfrr> a() {
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fY(cqgr.aX(bfpn.a), GmmRecyclerView.aw(C(), cqgr.aT(a), cqgr.x(ibo.c()), cqgr.cd(-1), cqgr.x(ibm.b())), iue.i(cqgr.bw(48))), bfpd.a(cqgr.aI(bfpo.a)));
        fY.f(new cqmp[0]);
        return cqgr.fY(cqgr.fH(bfpj.a), cqgr.z(ibm.b()), cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.bv(3), cqgr.dr(1), cqgr.aX(bfpk.a), cqgr.fP(new bfpp(), bfpl.a, new cqmp[0]), fY), bfpd.a(cqgr.aI(bfpm.a)));
    }
}
