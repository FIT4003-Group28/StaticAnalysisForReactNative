package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: okp  reason: default package */
/* loaded from: classes7.dex */
public final class okp extends cqiw<oxr> implements cqih {
    public static final /* synthetic */ int a = 0;
    private static final cqjb<oxr, abx> b = new ojw();

    public static final <T extends cqkp> cqjb<T, Integer> d() {
        return new ojv();
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxr oxrVar, Context context, cqiv cqivVar) {
        cqiw oknVar;
        Object a2;
        oxr oxrVar2 = oxrVar;
        List<oxq> d = oxrVar2.d();
        if (d.size() >= 3) {
            for (int i2 = 0; i2 < Math.min(d.size(), 4); i2++) {
                if (i2 != 0) {
                    cqivVar.a(new oko(), oxrVar2);
                }
                if (d.get(i2).b() != null) {
                    oknVar = new okh();
                    a2 = d.get(i2).b();
                } else {
                    oknVar = new okn();
                    a2 = d.get(i2).a();
                }
                cqivVar.a(oknVar, a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxr> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(100.0d)), cqgr.aF(ojt.a), cqqx.D(cqgr.cd(-1), cqgr.bp(-1), cqqx.G(), cqgr.fF(oju.a), cqqx.u(b), cqgr.ck(C())));
    }
}
