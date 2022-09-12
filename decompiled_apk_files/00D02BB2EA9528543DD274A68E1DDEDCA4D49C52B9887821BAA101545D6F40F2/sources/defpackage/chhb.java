package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: chhb  reason: default package */
/* loaded from: classes4.dex */
public final class chhb extends cqiw<chmy> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmy chmyVar, Context context, cqiv cqivVar) {
        chmy chmyVar2 = chmyVar;
        cqivVar.a(new chgu(), chmyVar2);
        dcdc<chmv> c = chmyVar2.c();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.get(i2).RH(cqivVar);
        }
        if (chmyVar2.d().booleanValue()) {
            cqivVar.a(new chgy(), chmyVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmy> a() {
        return GmmRecyclerView.aw(C(), cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-1), cqgr.dU(ird.b()), iue.c(chgp.a), cqgr.z(iva.b(ibl.g(), ibl.w())), cqgr.fu(true), cqqx.p(null), cqqx.z(chgq.a), cqgr.fH(chgr.a));
    }
}
