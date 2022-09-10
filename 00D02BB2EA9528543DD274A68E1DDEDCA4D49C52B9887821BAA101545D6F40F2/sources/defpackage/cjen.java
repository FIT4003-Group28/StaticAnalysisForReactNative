package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: cjen  reason: default package */
/* loaded from: classes4.dex */
public final class cjen extends cqiw<cjev> {
    public static final /* synthetic */ int a = 0;
    private static final cqgq b;
    private static final cqgq c;

    static {
        cqgq n = cqgr.n();
        n.d = 200;
        n.a = Float.valueOf(1.0f);
        b = n;
        cqgq n2 = cqgr.n();
        n2.d = 200;
        n2.a = Float.valueOf(0.0f);
        c = n2;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cjev cjevVar, Context context, cqiv cqivVar) {
        cjev cjevVar2 = cjevVar;
        for (int i2 = 0; i2 < cjevVar2.c().size(); i2++) {
            cqivVar.a(new cjeq(), cjevVar2.c().get(i2));
            if (i2 != cjevVar2.c().size() - 1) {
                cqivVar.a(new ije(), cqkp.T);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjev> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(irh.h()), e(true)};
        cqmj gc = cqgr.gc(cqgr.bw(49), cqgr.eE(cqrt.i(ibk.a, ibm.j())));
        gc.f(cqmpVarArr);
        return jgn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(irg.a()), jgn.d(cjek.a), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(irg.a()), gc, cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new hxj(), cjel.a, e(false)), cqgr.gq(e(true), cqgr.cd(-1), cqgr.bp(-2), cqgr.eN(4), cqgr.eI("Edits"), ibq.e(), ibq.v(), cqgr.dU(cqrp.d(6.0d)), cqgr.dB(irh.c()))), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqgr.ep(false), cqgr.z(ibm.g()))));
    }

    private static final cqmp<cjev> e(boolean z) {
        return cqjv.l(cjem.a, (!z ? b : c).b(), (!z ? c : b).b());
    }
}
