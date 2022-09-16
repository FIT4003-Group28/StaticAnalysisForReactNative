package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: ujo  reason: default package */
/* loaded from: classes7.dex */
public final class ujo extends cqiw<uma> {
    public static <T extends cqkp> cqmn<T> e() {
        return cqmn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(16), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dB(ibn.d()));
    }

    public static <T extends cqkp> cqmj<T> f(cqlc<T, CharSequence> cqlcVar) {
        return cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eM(cqlcVar), ibq.e(), cqgr.eU(ibm.t()), cqgr.eN(5));
    }

    public static <T extends cqkp> cqmj<T> g(cqlc<T, cqtd> cqlcVar) {
        return cqgr.gc(cqgr.eG(cqlcVar), cqgr.ce(cqrp.d(40.0d)), cqgr.bq(cqrp.d(32.0d)), cqgr.bR(ibn.d()), cqgr.bG(ibn.d()), cqgr.bw(48), cqgr.dQ(ibn.d()), cqgr.dF(ibn.d()), cqgr.dB(ibn.d()));
    }

    public static cqtd h(int i) {
        return iut.a(cqrt.h(i, ibm.c()));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, uma umaVar, Context context, cqiv cqivVar) {
        uma umaVar2 = umaVar;
        cqivVar.a(umaVar2.i().booleanValue() ? new ujg() : new ujb(), umaVar2);
        cqivVar.a(new ujh(), umaVar2);
        if (umaVar2.g().booleanValue()) {
            cqivVar.a(new ujn(), umaVar2);
        }
        if (umaVar2.h().booleanValue()) {
            cqivVar.a(new uiy(), umaVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<uma> a() {
        return cqgr.fY(GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.x(ibm.g()), cqgr.ep(false), cqqx.p(null), iue.b(cjtd.a(dtxs.ac))));
    }
}
