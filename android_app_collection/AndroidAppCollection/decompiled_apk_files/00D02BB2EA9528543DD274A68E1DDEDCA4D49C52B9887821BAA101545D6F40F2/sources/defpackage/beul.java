package defpackage;
/* compiled from: PG */
/* renamed from: beul  reason: default package */
/* loaded from: classes3.dex */
final class beul extends cqiw<bevx> {
    private static cqmj<bevx> e(final boolean z) {
        cqtd f;
        cqlc a = cqkz.a(Boolean.valueOf(z));
        cqtd cqtdVar = null;
        cqlc a2 = cqkz.a(null);
        if (z) {
            f = cqrt.g(2131232597, ibm.x());
        } else {
            f = cqrt.f(2131232597);
        }
        cqlc a3 = cqkz.a(f);
        cqlc cqlcVar = beuj.a;
        cqmn m = irn.m();
        cqlc a4 = cqkz.a(irg.J());
        if (z) {
            cqtdVar = iut.a(cqrt.g(2131231710, irg.k()));
        }
        return grc.d(a, a2, a3, cqlcVar, m, a4, cqkz.a(cqtdVar), new cqlc(z) { // from class: beuk
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((bevx) cqkpVar).b(this.a ? dtxy.iu : dtxy.it);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bevx> a() {
        cqmj<bevx> e = e(true);
        e.g(cqic.f(beuh.a, new cqmp[0]));
        cqmj<bevx> e2 = e(false);
        e2.g(cqic.c(beui.a, new cqmp[0]));
        return cqgr.fY(cqgr.cd(-1), e, e2);
    }
}
