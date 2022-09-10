package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acvu  reason: default package */
/* loaded from: classes2.dex */
public final class acvu extends cqiw<acvw> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, acvw acvwVar, Context context, cqiv cqivVar) {
        cqiw hsdVar;
        Object e;
        acvw acvwVar2 = acvwVar;
        for (acvx acvxVar : acvwVar2.b()) {
            cqivVar.a(acvxVar.f() ? new grf(dtxy.nq) : new acvs(), acvxVar);
        }
        if (acvwVar2.c().booleanValue()) {
            hsdVar = new haw(null);
            e = acvwVar2.d();
        } else {
            hsdVar = new hsd();
            e = hsd.e(cqrp.d(24.0d));
        }
        cqivVar.a(hsdVar, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<acvw> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bV(aclq.c()), cqgr.bD(irh.h()), cqgr.dr(1), itj.i(dtxy.np), cqgr.gq(cqgr.bR(aclq.b()), cqmn.a(ibq.t(), cqgr.co(cqrp.f(8.0d), false)), ibq.v(), cqgr.eL(Integer.valueOf((int) R.string.TOP_LISTS_HEADER_TITLE))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.ck(C())));
    }
}
