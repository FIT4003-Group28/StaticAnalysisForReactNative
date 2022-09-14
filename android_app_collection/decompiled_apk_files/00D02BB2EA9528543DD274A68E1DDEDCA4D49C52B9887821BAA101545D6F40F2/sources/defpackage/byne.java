package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: byne  reason: default package */
/* loaded from: classes4.dex */
public final class byne extends cqiw<byng> {
    @dzsi
    private final ddho i;
    public static final cqjb<byng, Boolean> a = bylc.a;
    public static final cqjb<byng, Boolean> b = byld.a;
    public static final cqmn<byng> c = cqmn.a(irn.l(), cqgr.eU(irg.m()), cqgr.fh(cqrp.f(16.0d)));
    private static final cqmn<byng> h = cqmn.a(irn.l(), cqgr.eU(irg.k()), cqgr.fh(cqrp.f(12.0d)));
    public static final cqmn<byng> d = cqmn.a(cqgr.fe(irn.a), cqgr.fh(cqrp.f(12.0d)));
    public static final cqmn<byng> e = cqmn.a(cqgr.fe(irn.e), cqgr.fh(cqrp.f(12.0d)));
    public static final cqmj<byng> f = cqgr.gs(cqgr.bq(cqrp.d(dcyn.a)), cqgr.ce(cqrp.d(56.0d)));
    public static final cqrp g = cqrp.d(82.0d);

    public byne(@dzsi ddho ddhoVar) {
        super(ddhoVar);
        this.i = ddhoVar;
    }

    public static <T extends cqkp> cqmj<T> e(cqmj<T> cqmjVar, cqmj<T> cqmjVar2, cqmj<T> cqmjVar3) {
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(0), cqgr.fY(cqgr.bp(-1), cqgr.cd(-2), cqmjVar), cqgr.fY(cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqmjVar2), cqgr.fY(cqgr.bp(-1), cqgr.cd(-2), cqgr.cL(irh.c()), cqmjVar3));
    }

    public static cqmj<byng> f(cqlc<byng, cqtd> cqlcVar, int i) {
        return cqgr.gd(cqgr.dr(0), cqgr.cH(irh.a()), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.aJ(16), cqgr.gc(cqgr.ce(irh.r()), cqgr.bq(irh.r()), cqgr.eG(cqlcVar)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(16), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(12.0d)), h, cqgr.l(true), cqgr.eL(Integer.valueOf(i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [cqkp] */
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, byng byngVar, Context context, cqiv cqivVar) {
        cqiw byleVar;
        byng byngVar2;
        byng byngVar3 = byngVar;
        cqivVar.a(new bymo(), byngVar3);
        if (byngVar3.v() == bynf.LOADING) {
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (!byngVar3.g().booleanValue() && byngVar3.e().booleanValue()) {
            cqivVar.a(new byln(), byngVar3);
            z = true;
        }
        if (byngVar3.r().booleanValue()) {
            cqivVar.a(new bylk(), byngVar3);
            z = true;
        }
        if (byngVar3.m().booleanValue()) {
            cqivVar.a(new bylq(), byngVar3);
            z = true;
        }
        if (!byngVar3.m().booleanValue() && byngVar3.k().booleanValue()) {
            cqivVar.a(new bylu(), byngVar3);
            z = true;
        }
        if (byngVar3.x().booleanValue()) {
            cqivVar.a(new gvb(), cqkp.T);
            cqivVar.a(byngVar3.y().booleanValue() ? new bymr() : new bynd(), byngVar3);
        } else {
            z2 = z;
        }
        if (byngVar3.C().booleanValue()) {
            byleVar = new bylz();
            byngVar2 = byngVar3;
        } else if (z2 || byngVar3.v() != bynf.LOADED) {
            return;
        } else {
            byleVar = new byle();
            byngVar2 = cqkp.T;
        }
        cqivVar.a(byleVar, byngVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<byng> a() {
        cqrp d2 = cqrp.d(8.0d);
        return cqgr.fY(cqgr.dz(d2, d2, d2, d2), cqgr.cd(-1), cqqx.E(cqgr.bw(80), cqgr.cd(-1), cqgr.bp(-2), cqqx.d(irg.a()), cqqx.g(cqrp.d(2.0d)), cqqx.B(true), cqgr.az(true), cqgr.J(true), cqgr.cW(cqgr.q(byla.a)), iue.d(bylb.a, cqkz.a(this.i)), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.ck(C()))));
    }
}
