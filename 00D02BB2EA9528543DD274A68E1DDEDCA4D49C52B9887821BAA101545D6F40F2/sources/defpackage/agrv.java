package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agrv  reason: default package */
/* loaded from: classes2.dex */
final class agrv extends cqiw<agxd> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agxd agxdVar, Context context, cqiv cqivVar) {
        agrf agrfVar;
        agwt agwtVar;
        List<agwt> e = agxdVar.e();
        if (e.size() < 3) {
            return;
        }
        if (i == 0) {
            agrd h = agre.h();
            h.d(1.0f);
            h.f(2);
            agrfVar = new agrf(h.a());
            agwtVar = e.get(0);
        } else if (i != 1) {
            return;
        } else {
            agrd h2 = agre.h();
            h2.b(false);
            h2.d(1.0f);
            h2.e(1);
            cqivVar.a(new agrf(h2.a()), e.get(1));
            agrd h3 = agre.h();
            h3.b(false);
            h3.d(1.0f);
            h3.g(1);
            agrfVar = new agrf(h3.a());
            agwtVar = e.get(2);
        }
        cqivVar.a(agrfVar, agwtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agxd> a() {
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(0), cqgr.fY(cqgr.cd(0), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.ck(D(0))), cqgr.gd(cqgr.cd(0), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.dr(1), cqgr.ck(D(1))));
    }
}
