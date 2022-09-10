package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: rpw  reason: default package */
/* loaded from: classes7.dex */
public final class rpw extends cqiw<sab> {
    private static final cqrp a = cqrp.d(140.0d);

    private final cqmj<sab> e() {
        return cqgr.gd(cqgr.aF(rpf.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.z(irg.a()), zvk.b(cqgr.gk(cqgr.cd(-1), cqgr.av(true), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(1), cqgr.dU(irh.k()), cqgr.dB(irh.m()), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(irh.m()), cqgr.dr(0), cqgr.ck(D(0))), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(16), cqgr.fP(new rym(), rpg.a, new cqmp[0]), iuh.b(cqgr.bR(irh.k()), cqgr.bG(irh.k())), cqgr.fP(new rym(), rph.a, new cqmp[0])))), cqgr.ca(Float.valueOf(1.0f))), h(rny.MORE_OPTIONS_FLIP_BUTTON, rpi.a));
    }

    private final cqmj<sab> f() {
        return cqgr.gd(cqgr.aI(rpj.a), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(irg.a()), zvk.b(GmmRecyclerView.aw(D(1), cqgr.cd(-1), cqgr.bp(-2)), cqgr.ca(Float.valueOf(1.0f))), h(rny.HIDE_FLIP_BUTTON, rpk.a));
    }

    private static cqmj<sab> h(int i, cqlc<sab, cjtd> cqlcVar) {
        return cqgr.gq(cqgr.aI(rpl.a), cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.cL(a), cqgr.bA(irh.k()), cqgr.dQ(irh.k()), cqgr.dF(irh.k()), cqgr.dU(irh.m()), cqgr.dB(irh.m()), cqgr.bw(1), cqgr.aJ(17), cqgr.x(aclp.a(cqta.f(), ibm.x(), cqrp.d(1.0d), cqrp.d(3.0d))), cqgr.l(true), cqgr.eL(Integer.valueOf(i)), cqgr.eU(irg.r()), cqgr.eN(4), iue.c(cqlcVar), cqgr.cW(cqgr.q(rpm.a)));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sab sabVar, Context context, cqiv cqivVar) {
        cqiw rpvVar;
        Collection i2;
        sab sabVar2 = sabVar;
        if (i == 0) {
            rpvVar = new rpv();
            i2 = sabVar2.i();
        } else if (i != 1) {
            throw new IllegalArgumentException(String.format("Cannot create layout list adapter for list type %s", Integer.valueOf(i)));
        } else {
            rpvVar = new rpe();
            i2 = sabVar2.b();
        }
        cqivVar.f(rpvVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sab> a() {
        return cqgr.fY(f(), e());
    }
}
