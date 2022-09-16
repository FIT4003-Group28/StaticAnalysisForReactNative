package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wpb  reason: default package */
/* loaded from: classes7.dex */
public final class wpb {
    public static final cqjb<zcv, cqss> a = new wpa();

    @SafeVarargs
    public static <T extends zef> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqlc cqlcVar = wow.a;
        cqmj<T> a2 = zxb.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.eU(irg.J()), cqgr.eS(Integer.valueOf((int) R.style.TransitDetailsSegmentDescriptionText)), cqgr.fe(irn.e), cqgr.cB(1), cqgr.eB(true));
        if (cqmpVarArr.length > 0) {
            a2.f(cqmpVarArr);
        }
        a2.f(zvb.b(cqlcVar));
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, jhk> cqlcVar, cqlc<T, jhk> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = zxb.a(cqgr.cd(-2), cqgr.bp(-2), cqjv.l(cqjv.x(cqlcVar), zxb.b(cqlcVar2), zxb.b(cqlcVar)));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends wpv> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqlc cqlcVar = wox.a;
        final cqss H = irg.H();
        cqmj<T> gd = cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-2), cqgr.gc(cqgr.eG(cqlcVar), cqgr.aF(cqjv.x(cqlcVar)), iue.b(cjtd.a(dtyc.eg)), cqgr.bG(cqrp.d(4.0d)), cqgr.E(true)), cqgr.gq(cqgr.eK(vlh.l(woy.a)), cqgr.eW(new cqlc(H) { // from class: xjf
            private final cqss a;

            {
                this.a = H;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqss cqssVar = this.a;
                xkd xkdVar = (xkd) cqkpVar;
                if (xkdVar.Z(donz.ON_TIME).booleanValue()) {
                    return irg.u();
                }
                if (xkdVar.Z(donz.CHANGED).booleanValue()) {
                    return irg.y();
                }
                return xkdVar.Z(donz.CANCELED).booleanValue() ? irg.H() : cqssVar;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), itj.o(woz.a), irn.l(), irn.E()));
        gd.f(cqmpVarArr);
        return gd;
    }
}
