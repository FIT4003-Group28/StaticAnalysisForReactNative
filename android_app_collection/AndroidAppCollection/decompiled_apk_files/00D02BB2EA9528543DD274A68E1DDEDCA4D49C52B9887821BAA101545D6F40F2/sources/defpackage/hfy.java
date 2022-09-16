package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hfy  reason: default package */
/* loaded from: classes6.dex */
public final class hfy extends cqiw<jbq> {
    private static final cjtd c = cjtd.a(dtxv.C);
    private static final cjtd d = cjtd.a(dtxv.B);
    private static final cqvj e = irn.b;
    private static final cqss f = irg.a();
    private static final cqss g = new hfv(new Object[]{irg.k()});
    public static final cqfc a = f(true);
    public static final cqfc b = f(false);

    private static cqmj<jbq> e(cqlc<jbq, Boolean> cqlcVar, int i, int i2, int i3, cqlc<jbq, cjtd> cqlcVar2) {
        return cqgr.gq(cqgr.aF(cqlcVar), cqgr.bV(cqrp.d(i2)), cqgr.bD(cqrp.d(i3)), cqgr.dM(cqrp.d(8.0d)), cqgr.dO(cqrp.d(8.0d)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.fh(cqrp.d(12.0d)), cqgr.fe(e), cqgr.eU(f), cqgr.eL(Integer.valueOf(i)), iue.c(cqlcVar2));
    }

    private static cqfc f(boolean z) {
        return new hfx(z, true != z ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jbq> a() {
        return cqgr.fY(cqgr.fF(new cqlc() { // from class: hfq
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jbq) cqkpVar).c().booleanValue() ? hfy.a : hfy.b;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aJ(17), cqgr.dU(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.dc(hfr.a), cqgr.bw(17), cqgr.dr(1), cqgr.cd(-2), cqgr.bp(-2), cqgr.x(cqtt.l(g, cqrp.d(2.0d))), e(hfs.a, R.string.MAP_LOAD_RUNNING_STATUS, 4, 4, cqkz.a(c)), e(hft.a, R.string.MAP_LOAD_STOPPED_STATUS, 4, 0, cqkz.a(d)), e(hfu.a, R.string.MAP_LOAD_STOPPED_TIP, 0, 4, cqkz.a(null))));
    }
}
