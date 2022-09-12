package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsce  reason: default package */
/* loaded from: classes4.dex */
final class bsce extends cqiw<jao> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.d(24.0d);

    public static final CharSequence e(jao jaoVar, Context context) {
        bvsi bvsiVar = new bvsi(context);
        bvsiVar.c(jaoVar.c());
        bvsiVar.c(context.getResources().getString(true != jaoVar.a().booleanValue() ? R.string.ACCESSIBILITY_INSTRUCTION_EXPAND : R.string.ACCESSIBILITY_INSTRUCTION_COLLAPSE));
        return bvsiVar.toString();
    }

    @SafeVarargs
    private static cqmj<jao> f(int i, cqmp<jao>... cqmpVarArr) {
        cqmj<jao> gc = cqgr.gc(cqgr.x(ibq.E()), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.eE(cqrt.g(i, ibm.n())));
        gc.f(cqmpVarArr);
        return gc;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, jao jaoVar, Context context, cqiv cqivVar) {
        List<? extends jao> d = jaoVar.d();
        if (d == null) {
            return;
        }
        cqivVar.f(new bsce(), d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jao> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.b(bsbr.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.cH(ibn.a()), cqgr.gd(cqgr.dr(0), cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.cL(ibn.a()), cqgr.aJ(16), cqgr.cW(cqgr.q(bsbx.a)), iue.c(bsby.a), cqgr.V(bsbz.a), new cqmh(ikx.class, cqjv.g(iky.CHECK_BOX_STATE, bsca.a, ikv.a), cqgr.x(ibq.E())), cqgr.gq(cqgr.dQ(ibn.d()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cB(1), ibq.p(), cqgr.eM(bsbw.a), cqgr.eU(ibm.p()), cqgr.eN(5))), cqgr.fY(cqic.c(cqjv.x(bscb.a), new cqmp[0]), cqgr.bp(-1), cqgr.cd(-2), cqgr.cL(ibn.a()), cqgr.dF(cqrp.d(2.0d)), cqgr.cW(cqgr.q(bscc.a)), cqgr.U(new cqjb() { // from class: bscd
            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return bsce.e((jao) cqkpVar, context);
            }
        }), f(2131232261, cqic.f(bsbs.a, new cqmp[0])), f(2131232264, cqic.c(bsbt.a, new cqmp[0]))), cqgr.dI(bsbu.a)), cqgr.gd(cqgr.dQ(b), cqgr.dr(1), cqic.f(bsbv.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C())));
    }
}
