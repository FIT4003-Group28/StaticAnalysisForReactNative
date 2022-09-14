package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cjzh  reason: default package */
/* loaded from: classes4.dex */
public final class cjzh extends cqiw<cjyw> implements cqih {
    public static int e(Context context, int i) {
        return (int) (context.getResources().getDisplayMetrics().density * i);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cjyw cjywVar, Context context, cqiv cqivVar) {
        for (cjyv<?> cjyvVar : cjywVar.b()) {
            cqivVar.a(new cjzd(), new cjzg(cjyvVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjyw> a() {
        return cqqx.D(cqgr.cd(-1), cqgr.br(new cjzb()), cqgr.aS(cjyz.a), cqqx.v(cjza.a), cqqx.G(), cqgr.ck(C()));
    }
}
