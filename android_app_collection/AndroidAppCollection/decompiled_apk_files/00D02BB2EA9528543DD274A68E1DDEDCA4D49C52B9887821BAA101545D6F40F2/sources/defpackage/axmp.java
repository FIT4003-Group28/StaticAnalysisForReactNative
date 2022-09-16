package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axmp  reason: default package */
/* loaded from: classes3.dex */
public final class axmp extends cqiw<axot> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, axot axotVar, Context context, cqiv cqivVar) {
        axot axotVar2 = axotVar;
        axor e = axotVar2.e();
        if (e != null) {
            cqivVar.a(new axmo(), e);
        }
        for (axos axosVar : axotVar2.b()) {
            axosVar.l(cqivVar);
        }
        if (axotVar2.g().booleanValue()) {
            cqivVar.c(new axmr());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<axot> a() {
        return cqgr.fY(cqgr.z(ibm.b()), cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqgr.aF(axmh.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), GmmRecyclerView.aw(C(), cqqx.v(axmi.a), cqgr.aT(a), cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1))), cqgr.gd(cqgr.az(false), cqgr.aI(axmj.a), cqgr.cd(-1), cqgr.dr(1), cqgr.z(ibm.b()), cqgr.aJ(17), cqgr.dQ(cqrp.d(36.0d)), cqgr.dF(cqrp.d(36.0d)), cqgr.gc(cqgr.ce(cqrp.d(160.0d)), cqgr.bq(cqrp.d(160.0d)), cqgr.dB(cqrp.d(24.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(iup.e(R.raw.list_zero_state_person))), cqgr.gq(cqgr.az(true), cqgr.cd(-1), ibq.f(), cqgr.eN(4), cqgr.eM(axmk.a))));
    }
}
