package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: hgt  reason: default package */
/* loaded from: classes6.dex */
public final class hgt extends cqiw<oxk> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxk oxkVar, Context context, cqiv cqivVar) {
        List<oxj> b = oxkVar.b();
        int size = b.size();
        int i2 = 0;
        while (i2 < size) {
            cqivVar.a(new hgs(size + (-1) == i2), b.get(i2));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxk> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-1), cqgr.cd(-1), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.aF(cqjv.x(hgn.a)), cqgr.eM(hgo.a), ibq.q()), cqpi.a(cqgr.aF(cqjv.x(hgp.a)), cqgr.cd(-1), cqgr.bp(-2), cqpi.g(), cqpi.f(), cqpi.e(), cqgr.ck(C())));
    }
}
