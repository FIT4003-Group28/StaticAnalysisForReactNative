package defpackage;

import android.content.Context;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ysj  reason: default package */
/* loaded from: classes7.dex */
public final class ysj extends cqiw<yvs> {
    public static final cqtv a = cqrp.f(20.0d);

    @SafeVarargs
    public static cqmj<yvs> e(cqmp<yvs>... cqmpVarArr) {
        cqmj<yvs> gq = cqgr.gq(cqgr.cd(-2), cqgr.bq(cqrp.f(16.0d)), cqgr.aJ(16), ibq.p(), ibq.y(), ibq.z());
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, yvs yvsVar, Context context, cqiv cqivVar) {
        yvs yvsVar2 = yvsVar;
        boolean isEmpty = yvsVar2.c().isEmpty();
        cqivVar.a(new ysi(isEmpty), yvsVar2);
        if (!isEmpty) {
            yvt yvtVar = (yvt) dcft.s(yvsVar2.c());
            Iterator<yvt> it = yvsVar2.c().iterator();
            while (it.hasNext()) {
                yvt next = it.next();
                cqivVar.c(new yri());
                cqivVar.a(new yrr(next == yvtVar, true), next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<yvs> a() {
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(16), cqgr.ck(C()), cqgr.az(true), cqgr.aC(true), cqgr.aW(1));
    }
}
