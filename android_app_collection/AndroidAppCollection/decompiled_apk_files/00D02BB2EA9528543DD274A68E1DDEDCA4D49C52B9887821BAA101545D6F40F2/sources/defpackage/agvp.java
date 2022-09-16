package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agvp  reason: default package */
/* loaded from: classes2.dex */
public final class agvp extends agwz<ahag> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        ahag ahagVar = (ahag) cqkpVar;
        List<ahah> b = ahagVar.b();
        for (int i2 = 0; i2 < b.size(); i2++) {
            cqivVar.a(new agvy(), b.get(i2));
        }
        if (!b.isEmpty()) {
            cqivVar.a(new agvo(), ahagVar);
        }
    }

    @Override // defpackage.agwz
    protected final cqml<ahag> e() {
        return jgv.c(cqgr.aI(agvl.a), cqgr.bw(80), cqgr.dQ(cqrp.d(12.0d)), cqgr.dF(cqrp.d(12.0d)), jgv.a(C(), cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.P(false), cqqx.p(null)));
    }
}
