package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: cequ  reason: default package */
/* loaded from: classes4.dex */
public final class cequ extends cqiw<ceti> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ceti cetiVar, Context context, cqiv cqivVar) {
        ceti cetiVar2 = cetiVar;
        cesn e = cetiVar2.e();
        if (!e.e().isEmpty()) {
            cqivVar.a(new cehc(), e);
        }
        if (!cetiVar2.j().isEmpty()) {
            cqivVar.a(new ceqt(), cetiVar2);
        }
        List<cetg> d = cetiVar2.d();
        int i2 = 0;
        while (i2 < d.size()) {
            cetg cetgVar = d.get(i2);
            i2++;
            cetgVar.l(i2);
            cqivVar.a(new ceqi(), cetgVar);
            cqivVar.c(ict.p(false, new cqmp[0]));
        }
        if (cetiVar2.Ry().booleanValue()) {
            cqivVar.c(new oag());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ceti> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqqx.x(ceqr.a));
    }
}
