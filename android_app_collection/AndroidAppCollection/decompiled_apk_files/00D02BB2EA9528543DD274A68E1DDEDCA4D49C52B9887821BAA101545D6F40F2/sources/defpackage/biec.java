package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: biec  reason: default package */
/* loaded from: classes3.dex */
public final class biec extends cqiw<bije> {
    private static <T extends cqkp> void e(cqiv cqivVar, @dzsi List<T> list, cqiw<T> cqiwVar) {
        if (list == null) {
            return;
        }
        for (T t : list) {
            cqivVar.a(new bikc(), t);
            cqivVar.a(cqiwVar, t);
        }
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bije bijeVar, Context context, cqiv cqivVar) {
        bije bijeVar2 = bijeVar;
        if (bijeVar2 == null || !bijeVar2.l().booleanValue()) {
            return;
        }
        cqivVar.a(new bihp(), bijeVar2.i());
        e(cqivVar, bijeVar2.a(), new bigf());
        e(cqivVar, bijeVar2.b(), new biib());
        e(cqivVar, bijeVar2.c(), new bihk());
        e(cqivVar, bijeVar2.d(), new bigx());
        e(cqivVar, bijeVar2.e(), new bift());
        e(cqivVar, bijeVar2.f(), new biiv());
        e(cqivVar, bijeVar2.g(), new bifc());
        e(cqivVar, bijeVar2.h(), new bieb());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bije> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.ck(C()));
    }
}
