package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: okz  reason: default package */
/* loaded from: classes7.dex */
public class okz extends cqiw<oxp> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxp oxpVar, Context context, cqiv cqivVar) {
        List<jba> b = oxpVar.b();
        if (b.isEmpty()) {
            return;
        }
        if (i == 0) {
            cqivVar.a(new okx(), b.get(0));
            return;
        }
        int min = Math.min(d(), b.size());
        for (int i2 = 1; i2 < min; i2++) {
            if (i2 != 1) {
                cqivVar.a(new oky(), b.get(i2));
            }
            cqivVar.a(new okx(), b.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxp> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bq(cqrp.d(145.0d)), cqgr.aF(cqjv.x(okr.a)), cqgr.gd(cqgr.dr(1), cqgr.cd(0), cqgr.bp(-1), cqgr.ca(Float.valueOf(2.0f)), cqgr.ck(D(0))), cqgr.gd(cqgr.dr(1), cqgr.aF(oks.a), cqgr.cd(0), cqgr.bp(-1), cqgr.ca(Float.valueOf(1.0f)), cqgr.bR(cqrp.d(2.0d)), cqgr.ck(D(1))));
    }

    protected int d() {
        return 3;
    }
}
