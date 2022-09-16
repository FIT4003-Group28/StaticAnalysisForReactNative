package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccow  reason: default package */
/* loaded from: classes4.dex */
public final class ccow extends cqiw<ccxf> {
    private static final cqrp e = cqrp.d(20.0d);
    public static final int a = cqir.a();
    public static final int b = cqir.a();
    public static final int c = cqir.a();
    public static final int d = cqir.a();

    private static cqmj<ccxf> e(int i, cqlc<ccxf, Integer> cqlcVar, final cqlc<ccxf, ddho> cqlcVar2, cqlc<ccxf, View.OnClickListener> cqlcVar3) {
        return cqgr.gh(cqgr.aR(Integer.valueOf(i)), cqgr.cd(-1), cqgr.cH(ibn.a()), cqgr.dM(cqrp.d(8.0d)), cqgr.eM(cqlcVar), cqgr.eN(5), ibq.o(), cqgr.cW(cqlcVar3), iue.c(new cqlc(cqlcVar2) { // from class: ccom
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                ccxf ccxfVar = (ccxf) cqkpVar;
                int i2 = ccow.a;
                return cjtd.a((ddho) ((cqlb) cqlcVar4).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccxf> a() {
        cqrp cqrpVar = e;
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrpVar), cqgr.bD(cqrp.d(8.0d)), cqgr.dJ(cqrp.d(20.0d)), cqgr.gq(cqgr.cd(-1), cqgr.cH(cqrp.d(dcyn.a)), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_SUGGEST_AN_EDIT_LABEL)), cqgr.eN(4), ibq.h(), cqgr.eU(ibm.t())), cqgr.gq(cqgr.cd(-1), cqgr.cH(cqrp.d(dcyn.a)), cqgr.eM(ccoi.a), cqgr.eN(4), ibq.p(), cqgr.eU(ibm.n()))};
        cqmj<ccxf> e2 = e(a, cqkz.a(Integer.valueOf((int) R.string.OFFERING_DETAILS_DISH_RAP_EDIT_DISH_NAME)), cqkz.a(dtxx.ad), cqgr.q(ccoo.a));
        e2.f(cqgr.aI(ccop.a));
        cqmj<ccxf> e3 = e(b, cqkz.a(Integer.valueOf((int) R.string.OFFERING_DETAILS_DISH_RAP_INCORRECT_DISH_NAME)), cqkz.a(dtxx.ad), cqgr.q(ccoq.a));
        e3.f(cqgr.aI(ccor.a));
        cqmj<ccxf> e4 = e(c, cqkz.a(Integer.valueOf((int) R.string.OFFERING_DETAILS_DISH_RAP_INAPPROPRIATE_DISH_NAME)), cqkz.a(dtxx.ab), cqgr.q(ccos.a));
        e4.f(cqgr.aI(ccot.a));
        cqmj<ccxf> e5 = e(d, cqkz.a(Integer.valueOf((int) R.string.OFFERING_DETAILS_DISH_RAP_DISH_DOES_NOT_EXIST)), cqkz.a(dtxx.ac), cqgr.q(ccou.a));
        e5.f(cqgr.aI(ccov.a));
        cqmp[] cqmpVarArr2 = {cqgr.de(ccon.a), e2, e3, e4, e5};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(18.0d)), cqgr.bD(cqrp.d(14.0d)), cqgr.cH(ibn.a()), cqgr.aJ(8388613), cqjv.i(ccqo.a, true, ccqm.a), hyb.c(cqgr.eL(Integer.valueOf((int) R.string.CANCEL_BUTTON)), cqgr.ca(valueOf), cqgr.bG(cqrp.d(18.0d)), cqgr.cW(cqgr.q(ccoj.a))), hyb.a(cqgr.eL(Integer.valueOf((int) R.string.NEXT_BUTTON)), cqgr.ca(valueOf), cqgr.au(ccok.a), cqgr.cW(cqgr.q(ccol.a)))};
        cqmh cqmhVar = new cqmh(ccqm.class, new cqmp[0]);
        cqmhVar.f(cqmpVarArr3);
        return cqgr.gd(cqgr.dr(1), cqgr.ce(ibn.m()), cqgr.cL(ibn.m()), cqgr.bp(-2), cqgr.eN(2), cqgr.gd(cqmpVarArr), cqgr.gk(cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dJ(cqrpVar), cqgr.gi(cqmpVarArr2), cqmhVar)));
    }
}
