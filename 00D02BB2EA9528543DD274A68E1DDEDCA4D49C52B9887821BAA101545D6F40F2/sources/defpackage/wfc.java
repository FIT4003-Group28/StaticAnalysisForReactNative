package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: wfc  reason: default package */
/* loaded from: classes7.dex */
public final class wfc extends cqiw<wfn> {
    public static final cqtv a = cqrp.d(8.0d);

    public static cqnf<bxsz> e() {
        return cqgr.w(wef.a);
    }

    private static void f(cqiv cqivVar, cqtc cqtcVar, boolean z, bxsz bxszVar) {
        cqivVar.a(z ? new wer(cqtcVar) : new wek(), bxszVar);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wfn wfnVar, Context context, cqiv cqivVar) {
        wfn wfnVar2 = wfnVar;
        bxsz c = wfnVar2.c();
        bxsz d = wfnVar2.d();
        boolean z = false;
        if (wfnVar2.b().booleanValue()) {
            int i2 = c != null ? 1 : 0;
            if (d != null) {
                i2++;
            }
            if (wfnVar2.e().size() + i2 > 4) {
                z = true;
            }
        }
        cqtv f = cqsg.f(cqsz.c(), Float.valueOf(1.0f / (true != z ? 4.0f : 4.5f)));
        for (bxsz bxszVar : wfnVar2.e()) {
            cqivVar.a(wfnVar2.b().booleanValue() ? new wer(f) : new wfb(), bxszVar);
        }
        if (d != null) {
            f(cqivVar, f, wfnVar2.b().booleanValue(), d);
        }
        if (c != null) {
            f(cqivVar, f, wfnVar2.b().booleanValue(), c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wfn> a() {
        return cqgr.gd(cqgr.aI(wea.a), cqgr.dr(1), GmmRecyclerView.aw(C(), cqgr.dX(web.a), cqgr.dE(wec.a), cqgr.cd(-2), cqgr.bp(-2), cqqx.p(null), cqqx.G(), cqgr.ep(false), cqgr.fH(wed.a), cqqx.v(wee.a)));
    }
}
