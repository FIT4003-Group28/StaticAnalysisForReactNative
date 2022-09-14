package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agpg  reason: default package */
/* loaded from: classes2.dex */
final class agpg extends cqiw<agyt> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agyt agytVar, Context context, cqiv cqivVar) {
        List<cqix<?>> a = agytVar.a();
        int i2 = 0;
        while (i2 < a.size()) {
            int size = a.size() - 1;
            int i3 = 20;
            int i4 = i2 == 0 ? 20 : 10;
            if (i2 != size) {
                i3 = 0;
            }
            cqivVar.a(new agph(i4, i3), new agpj(a.get(i2)));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agyt> a() {
        return jix.b(cqgr.cd(-1), cqgr.bp(-2), cqgr.dk(agpe.a), iue.c(agpf.a), cqgr.ep(false), jgi.d(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), cqgr.ck(C())));
    }
}
