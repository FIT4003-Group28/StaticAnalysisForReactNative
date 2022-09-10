package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdhz  reason: default package */
/* loaded from: classes3.dex */
public final class bdhz extends cqiw<bdim> {
    public static final cqjg a = cqjg.a();
    public static final cqrp b = cqrp.d(16.0d);
    private static final acb c = new bdhv();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdim bdimVar, Context context, cqiv cqivVar) {
        cqiw bdhyVar;
        cqkp cqkpVar;
        bdim bdimVar2 = bdimVar;
        cqivVar.a(new bdhw(), bdimVar2);
        List<bcdf> a2 = bdimVar2.a();
        if (a2 != null && !a2.isEmpty()) {
            cqivVar.f(new bcde(), bdimVar2.a());
        }
        if (bdimVar2.b().booleanValue()) {
            bdhyVar = new bdhx();
            cqkpVar = bdimVar2.d();
        } else if (a2 == null || !a2.isEmpty() || bdimVar2.g().booleanValue()) {
            return;
        } else {
            bdhyVar = new bdhy();
            cqkpVar = cqkp.T;
        }
        cqivVar.a(bdhyVar, cqkpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdim> a() {
        return cqgr.gd(cqgr.z(irg.a()), cqgr.dr(1), hxc.a(hxc.b(bdhm.a)), ise.d(), cqgr.fP(new gna(), bdhn.a, new cqmp[0]), GmmRecyclerView.aw(C(), cqgr.aT(a), cqqx.x(bdho.a), iue.c(bdhp.a), cqqx.z(c)));
    }
}
