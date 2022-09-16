package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgjs  reason: default package */
/* loaded from: classes4.dex */
public final class cgjs extends cqiw<cgvw> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cgvw cgvwVar, Context context, cqiv cqivVar) {
        cqiw cgitVar;
        Object obj;
        Object k = cgvwVar.k();
        if (k instanceof cgwe) {
            cgitVar = new cgpt();
            obj = (cgwe) k;
        } else if (k instanceof cgvy) {
            cgitVar = new cgls();
            obj = (cgvy) k;
        } else if (k instanceof cgvz) {
            cgitVar = new cgmw();
            obj = (cgvz) k;
        } else if (!(k instanceof cgvs)) {
            return;
        } else {
            cgitVar = new cgit();
            obj = (cgvs) k;
        }
        cqivVar.a(cgitVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgvw> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.aJ(48), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bC(0), cqgr.dr(0), cqgr.z(irg.a()), cqgr.gd(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bp(-2), cqgr.bA(cgjw.a), cqgr.bC(0), cqgr.dr(1), cgjw.a(cgjn.a, cgjo.a, new cqmp[0]), cgjw.b(cgjp.a, cqgr.bV(cgjw.a))), cqgr.gd(cqgr.aI(cgjq.a), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.bL(cgjw.a), cqgr.S(Integer.valueOf((int) R.string.UGC_TASKS_REPORT_TEXT)), jhc.d(cgjr.a, cqgr.fm(irg.k())), iue.b(cjtd.a(dtyd.aK)))), cqgr.fY(cqgr.ck(C())));
    }
}
