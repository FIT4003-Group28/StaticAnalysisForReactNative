package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cddf  reason: default package */
/* loaded from: classes4.dex */
public final class cddf extends cqiw<cdai> {
    public static final cqss a = iva.b(ibl.al(), ibl.am());
    public static final cqss b = ibm.Q();
    private static final cqtd c = new cdde(new Object[0]);

    private static cqmj<cdai> e(final int i) {
        cqmp[] cqmpVarArr = new cqmp[3];
        cqmpVarArr[0] = cqgr.x(c);
        cqmpVarArr[1] = cqgr.bO(cqrp.d(i == 3 ? dcyn.a : 1.0d));
        cqmp[] cqmpVarArr2 = {cqgr.bq(cqrp.d(28.0d)), cqgr.aJ(17), cqjv.i(cdaa.SKIP_ANIMATION_WHEN_NOT_VISIBLE, true, cdab.a), cqgr.dM(cqrp.d(3.0d)), cqgr.dO(cqrp.d(3.0d)), cqgr.eU(ibm.b()), cqgr.fh(cqrp.f(20.0d)), cqjv.i(cdaa.LOCALE, Locale.ENGLISH, cdab.a), cqjv.g(cdaa.COUNT, new cqlc(i) { // from class: cddc
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = this.a;
                cqss cqssVar = cddf.a;
                return ((cdai) cqkpVar).b(i2, 4);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cdab.a), cqjv.g(cdaa.INDETERMINATE, cddd.a, cdab.a)};
        cqmh cqmhVar = new cqmh(cdab.class, cqmpVarArr2);
        cqmhVar.f(cqmpVarArr2);
        cqmpVarArr[2] = cqmhVar;
        return cqgr.fY(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdai> a() {
        return cqgr.gd(cqgr.aI(cdcx.a), cqgr.aT(cdeg.e), cqgr.dr(1), cqgr.ce(cdeg.a), cqgr.aW(1), cqgr.V(cdcy.a), cqgr.cW(cqgr.q(cdcz.a)), iue.c(cdda.a), cqgr.gd(cqgr.bp(-2), cqgr.aJ(1), cqgr.bv(0), cqgr.dr(0), cqgr.aW(4), e(0), e(1), e(2), e(3)), cqgr.gq(cqgr.aJ(1), cqgr.dU(cqrp.d(4.0d)), cqgr.aW(4), irn.v(), cqgr.fj(2), cqgr.fh(cqrp.f(12.0d)), cqgr.eM(cddb.a)));
    }
}
