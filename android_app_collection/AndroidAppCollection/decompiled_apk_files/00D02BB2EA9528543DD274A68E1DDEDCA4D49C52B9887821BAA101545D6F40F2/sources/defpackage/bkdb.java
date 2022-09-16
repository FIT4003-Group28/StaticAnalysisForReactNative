package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkdb  reason: default package */
/* loaded from: classes3.dex */
public final class bkdb extends cqiw<bkdj> {
    public static final cqjg a = cqjg.a();

    public static dbsg<AutoCompleteTextView> e(View view) {
        final dccx F = dcdc.F();
        cqjg cqjgVar = a;
        F.getClass();
        cqkx.h(view, cqjgVar, AutoCompleteTextView.class, new dbrn(F) { // from class: bkcj
            private final dccx a;

            {
                this.a = F;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dccx dccxVar = this.a;
                dccxVar.g((AutoCompleteTextView) obj);
                return dccxVar;
            }
        });
        return dcbg.b(F.f()).r(bkcp.a);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bkdj bkdjVar, Context context, cqiv cqivVar) {
        for (jbf jbfVar : bkdjVar.i()) {
            cqivVar.a(new bkda(), jbfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bkdj> a() {
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.x(ibm.b()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.ab(131072), cqgr.aC(true), cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(36.0d)), cqgr.bY(cqjd.e(), cqjd.t()), cqgr.y(bkcq.a)), new cqmh(jdf.class, cqgr.aT(a), iue.b(cjtd.a(dtxy.ox)), cqgr.cd(-1), cqgr.bq(cqrp.d(48.0d)), cqgr.bY(cqjd.e(), cqjd.t()), cqgr.ck(C()), cqgr.aQ(bkcr.a), cqgr.x(ibm.a()), cqgr.dk(bkcs.a), cqgr.dc(bkct.a), cqgr.cW(cqgr.q(bkcu.a)), cqgr.dg(bkcv.a), cqgr.dp(cqgi.a(bkcw.a)), cqgr.dl(bkcx.a), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dB(cqrp.d(dcyn.a)), ibq.p(), cqgr.eB(true), cqgr.eN(5), cqgr.eU(ibm.t()), cqgr.eX(ibm.n()), cqgr.eM(bkck.a), cqgr.et(bkcl.a)), cqgr.gc(cqgr.aF(bkcm.a), cqgr.ce(ibn.b()), cqgr.bq(ibn.b()), cqgr.bG(ibn.d()), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eD(2131231736), cqgr.fm(ibm.o())), cqgr.gc(cqgr.aI(bkcn.a), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.J(true), cqgr.cW(cqgr.q(bkco.a)), cqgr.x(ibm.a()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.fm(ibm.o()), cqgr.eE(cqrt.f(2131232205)), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLEAR)), iue.b(cjtd.a(dtxy.oy))));
    }
}
