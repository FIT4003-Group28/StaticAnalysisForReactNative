package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceqq  reason: default package */
/* loaded from: classes4.dex */
public final class ceqq extends cqiw<ceth> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ceth cethVar, Context context, cqiv cqivVar) {
        List<cetg> j = cethVar.j();
        int i2 = 0;
        while (i2 < j.size()) {
            cetg cetgVar = j.get(i2);
            int i3 = i2 + 1;
            cetgVar.l(i3);
            if (i2 != 0) {
                cqivVar.c(ict.p(false, new cqmp[0]));
            }
            cqivVar.a(new ceqi(), cetgVar);
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ceth> a() {
        cqmp[] cqmpVarArr = {cqic.c(cqjv.x(ceql.a), new cqmp[0]), cqgr.cd(-1), cqgr.dr(1), cqgr.ck(C())};
        cqrp f = ibn.f();
        return cqgr.gd(cqgr.aF(cqjv.x(ceqj.a)), cqgr.aW(2), cqgr.cd(-1), cqgr.dr(1), cqgr.fP(new cerf(), ceqk.a, new cqmp[0]), cqgr.gd(cqmpVarArr), cqgr.gq(cqgr.aF(cqjv.x(ceqm.a)), cqgr.cd(-1), cqgr.cH(ibn.a()), cqgr.dz(f, f, f, f), cqgr.x(ibo.h()), cqgr.eM(ceqn.a), ibq.u(), cqgr.eN(4), cqgr.cW(cqgr.q(ceqo.a)), iue.c(ceqp.a)));
    }
}
