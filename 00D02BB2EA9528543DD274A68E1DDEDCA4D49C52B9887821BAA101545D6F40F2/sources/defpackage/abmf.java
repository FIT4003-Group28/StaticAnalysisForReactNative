package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abmf  reason: default package */
/* loaded from: classes2.dex */
public final class abmf extends cqiw<abmg> {
    private static final cqtv a = cqsv.c(ibn.o(), ibn.o(), cqrp.d(48.0d), ibn.o());

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abmg abmgVar, Context context, cqiv cqivVar) {
        for (ablx ablxVar : abmgVar.c()) {
            cqivVar.a(new ablw(), ablxVar);
            cqivVar.c(ict.p(true, cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(20.0d))));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abmg> a() {
        cqmp[] cqmpVarArr = {cqgr.aF(cqjv.x(ablz.a)), iue.c(abma.a), cqgr.cW(acly.a(abmb.a)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(abmc.a)};
        cqmp[] cqmpVarArr2 = {cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(20.0d))};
        cqmp[] cqmpVarArr3 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())};
        cqtv cqtvVar = a;
        return cqgr.gd(cqgr.aF(cqjv.x(ably.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), abjc.d(cqmpVarArr), ict.n(true, cqmpVarArr2), cqgr.gd(cqmpVarArr3), abja.e(cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), iue.c(abmd.a), cqgr.eL(Integer.valueOf((int) R.string.EXPLORE_SEE_ALL)), cqgr.cW(acly.a(abme.a))));
    }
}
