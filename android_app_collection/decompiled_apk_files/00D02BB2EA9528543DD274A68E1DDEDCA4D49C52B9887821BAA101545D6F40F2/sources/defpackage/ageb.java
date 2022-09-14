package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: ageb  reason: default package */
/* loaded from: classes2.dex */
final class ageb extends cqiw<agyt> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agyt agytVar, Context context, cqiv cqivVar) {
        agyt agytVar2 = agytVar;
        List<agys> b = agytVar2.b();
        for (int i2 = 0; i2 < b.size(); i2++) {
            cqivVar.a(new agec(agytVar2.d().booleanValue()), b.get(i2));
        }
        if (agytVar2.l().booleanValue()) {
            cqivVar.a(new agea(), agytVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agyt> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqgr.P(false), cqgr.dQ(cqrp.d(15.0d)), cqgr.dF(cqrp.d(15.0d)), cqqx.G(), cqqx.v(agdx.a), cqgr.dk(agdy.a), iue.c(agdz.a), cqgr.ep(false), cqgr.az(false));
    }
}
