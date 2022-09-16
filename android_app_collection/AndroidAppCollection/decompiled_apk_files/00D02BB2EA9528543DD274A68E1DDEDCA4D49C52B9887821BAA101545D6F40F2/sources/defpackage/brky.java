package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brky  reason: default package */
/* loaded from: classes4.dex */
public final class brky extends cqiw<bssu> {
    public static final /* synthetic */ int a = 0;
    private static final cqjb<bssu, abp> b = brkv.a;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bssu bssuVar, Context context, cqiv cqivVar) {
        bssu bssuVar2 = bssuVar;
        cqivVar.g(bssuVar2.q());
        if (bssuVar2.g().booleanValue()) {
            cqivVar.a(new brkx(), bssuVar2.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bssu> a() {
        return GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.search_list_layout)), cqqx.x(brkq.a), cqgr.fF(brkr.a), cqgr.B(brku.a), cqqx.K(b), iue.c(brks.a), cqqx.v(brkt.a), cqgr.cd(-1), cqgr.bp(-1));
    }
}
