package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: agct  reason: default package */
/* loaded from: classes2.dex */
final class agct extends cqiw<agyt> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agyt agytVar, Context context, cqiv cqivVar) {
        agyt agytVar2 = agytVar;
        List<cqix<?>> a = agytVar2.a();
        int i2 = 0;
        while (i2 < a.size()) {
            boolean z = true;
            boolean z2 = !agytVar2.e().booleanValue() && i2 == a.size() + (-1);
            int i3 = 20;
            int i4 = i2 == 0 ? 20 : 10;
            if (true != z2) {
                i3 = 0;
            }
            if (a.size() != 1 || agytVar2.e().booleanValue()) {
                z = false;
            }
            cqivVar.a(new agcu(i4, i3, z), new agcw(a.get(i2)));
            i2++;
        }
        if (agytVar2.e().booleanValue()) {
            cqivVar.a(agytVar2.h() == null ? new agda() : new agdg(), agytVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agyt> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqqx.G(), cqgr.dk(agcr.a), iue.c(agcs.a), cqgr.ep(false), cqgr.az(false));
    }
}
