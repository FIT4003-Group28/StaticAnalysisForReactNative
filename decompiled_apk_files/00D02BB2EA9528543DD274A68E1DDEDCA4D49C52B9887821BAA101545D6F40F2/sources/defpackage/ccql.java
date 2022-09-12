package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ccql  reason: default package */
/* loaded from: classes4.dex */
public final class ccql extends cqiw<ccxl> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final int d = cqir.a();
    public static final cqjg e = cqjg.a();

    public static jic e(ccxl ccxlVar) {
        String r = ccxlVar.r();
        return new jic(r, jfv.a(r == null ? "" : r), ibm.h(), 250);
    }

    private static cqiw<cqkp> f() {
        return ict.p(false, cqgr.z(irg.f()));
    }

    private static void h(cqiv cqivVar, List<? extends ccxk> list, boolean z) {
        cqtv cqtvVar = ccpl.c;
        int i = 0;
        while (i < list.size()) {
            if (z && cqivVar.i() > 0 && i > 0) {
                cqivVar.c(ict.o(cqtvVar, new cqmp[0]));
            }
            ccxk ccxkVar = list.get(i);
            cqtv cqtvVar2 = ccxkVar.b() == ccxj.NONE ? ccpl.c : ccpl.b;
            cqivVar.a(new ccpl(z, ccxkVar.b()), ccxkVar);
            i++;
            cqtvVar = cqtvVar2;
        }
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ccxl ccxlVar, Context context, cqiv cqivVar) {
        List<? extends ccxk> f;
        ccxl ccxlVar2 = ccxlVar;
        if (cqjv.v(ccxlVar2.b()).booleanValue() || cqjv.v(ccxlVar2.d()).booleanValue()) {
            boolean booleanValue = cqjv.v(ccxlVar2.e()).booleanValue();
            boolean z = !booleanValue;
            ccvs q = ccxlVar2.q();
            if (q != null && !q.a().isEmpty()) {
                cqivVar.c(f());
                cqivVar.a(new ccvq(), q);
            }
            if (z) {
                cqivVar.c(f());
                cqivVar.c(new ccqk(true != ccxlVar2.B().booleanValue() ? R.string.OFFERING_SUGGESTION_POPULAR_DISH_SUGGESTION_MODULE_TITLE : R.string.OFFERING_SUGGESTION_MENU_HIGHLIGHTS_SUGGESTION_MODULE_TITLE));
                h(cqivVar, ccxlVar2.e(), ccxlVar2.y().booleanValue());
            }
            if (cqjv.v(ccxlVar2.f()).booleanValue()) {
                return;
            }
            int i2 = true != booleanValue ? R.string.OFFERING_SUGGESTION_GENERIC_SUGGESTION_MODULE_TITLE : R.string.OFFERING_SUGGESTION_ONLY_GENERIC_SUGGESTION_MODULE_TITLE;
            cqivVar.c(f());
            cqivVar.c(new ccqk(i2));
            f = ccxlVar2.f();
        } else {
            f = ccxlVar2.d();
        }
        h(cqivVar, f, ccxlVar2.y().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccxl> a() {
        cqmn a2 = cqmn.a(cqgr.eK(ccqb.a));
        cqmn a3 = cqmn.a(cqgr.cW(cqgr.q(ccpm.a)), iue.b(cjtd.a(dtxx.an)));
        cqmp[] cqmpVarArr = {cqgr.au(ccpx.a), cqgr.cW(acly.a(ccqc.a)), iue.c(ccqd.a), cqgr.eM(ccqe.a)};
        final cqlc cqlcVar = ccqf.a;
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(cqrp.d(12.0d)), cqgr.z(ibm.b()), cqgr.dJ(cqrp.d(20.0d)), cqjv.l(ccpn.a, ccra.h(), ccra.i()), ccra.n(cqkz.a(ibm.x()), ccpo.a, ccpp.a, cqgr.gc(cqmp.e, cqgr.aF(cqjv.x(ccpz.a)), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.ca(Float.valueOf(0.0f)), cqgr.x(irn.G()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131232581, irg.j())), cqgr.J(true), cqgr.cW(cqgr.q(ccqa.a)), iue.b(cjtd.a(dtxx.al)), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLEAR))), cqkz.a(false), cqmn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.aC(true)), cqmn.a(cqgr.aT(c), cqgr.dp(cqgi.a(ccpq.a)), cqgr.aU(268435462), cqgr.dl(ccpr.a)))};
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.dB(ibn.f()), jeh.a(irn.A(), cqgr.fI(0), cqgr.bw(17)));
        fY.f(cqgr.aI(cqlcVar));
        cqmj fY2 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.x(ibm.c()), cqgr.fY(cqgr.aR(Integer.valueOf(d)), cqgr.aT(e), cqgr.cd(-1), cqgr.bp(-1), cqgr.bV(cqsg.f(ird.b(), Float.valueOf(-1.0f))), cqgr.az(true), cqgr.S(Integer.valueOf((int) R.string.OFFERING_SUGGESTION_MENU_PHOTO_VIEWER_CONTENT_DESCRIPTION))));
        fY2.f(cqgr.aI(ccqg.a));
        cqmp[] cqmpVarArr3 = {cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.dB(ird.c()), cqgr.fY(cqmpVarArr2), fY, fY2, GmmRecyclerView.aw(C(), cqmp.e, cqgr.dr(1), cqgr.cd(-1), cqgr.aF(new cqlc(cqlcVar) { // from class: ccqh
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                ccxl ccxlVar = (ccxl) cqkpVar;
                cqjg cqjgVar = ccql.a;
                boolean z = true;
                if (!((Boolean) cqlcVar2.a(ccxlVar)).booleanValue() && !ccxlVar.p().booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.x(ibm.b()), cqqx.p(null), cqqx.v(ccqi.a))};
        cqmj E = cqqx.E(cqgr.bq(cqrp.d(86.0d)), cqgr.ce(cqrp.d(106.0d)), cqgr.bF(ccps.a), cqgr.bJ(cqrp.d(20.0d)), cqgr.bw(8388693), cqqx.g(cqrp.d(8.0d)), ccra.j(), cqgr.cW(cqgr.q(ccpt.a)), iue.c(ccpu.a), cqgr.V(ccpv.a), cqqx.E(cqgr.bq(cqrp.d(80.0d)), cqgr.ce(cqrp.d(100.0d)), cqgr.bw(17), cqqx.g(cqrp.d(8.0d)), ccra.h(), WebImageView.a(cqgr.aF(cqjv.x(ccpw.a)), cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.m(ccpy.a)), cqgr.gc(cqgr.ch(cqrp.d(30.0d)), cqgr.bA(cqrp.d(4.0d)), cqgr.bw(8388661), cqgr.ef(Float.valueOf(45.0f)), cqgr.eE(iup.g(cqrt.g(2131232662, ibm.b()), 0.6666667f, ibm.e())))));
        E.f(cqgr.aF(ccqj.a));
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(irg.a()), ccra.c(a2, a3, cqmn.a(cqmpVarArr), cqkz.a(false)), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), cqgr.gd(cqmpVarArr3), E));
    }
}
