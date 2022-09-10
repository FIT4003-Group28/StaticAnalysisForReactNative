package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agph  reason: default package */
/* loaded from: classes2.dex */
final class agph extends cqiw<agpi> {
    private final int a;
    private final int b;

    public agph(int i, int i2) {
        super(Integer.valueOf(i), Integer.valueOf(i2));
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agpi agpiVar, Context context, cqiv cqivVar) {
        cqivVar.e(agpiVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agpi> a() {
        return agxk.d(cqgr.ce(cqrp.d(256.0d)), cqgr.bp(-1), cqgr.bR(cqrp.d(this.a)), cqgr.bG(cqrp.d(this.b)), cqgr.ck(C()));
    }
}
