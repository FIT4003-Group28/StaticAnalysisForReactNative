package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bcwy  reason: default package */
/* loaded from: classes3.dex */
public final class bcwy extends cqiw<bdam> {
    private final cqnf<bdam> a;
    private final cqnf<bdam> b;

    public bcwy() {
        super(null, 0, null);
        this.a = cqgr.cd(-1);
        this.b = cqgr.bp(-1);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdam bdamVar, Context context, cqiv cqivVar) {
        bdam bdamVar2 = bdamVar;
        cqivVar.a(bdamVar2.b() != null ? new bcwx() : new bcww(), bdamVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdam> a() {
        return cqgr.fY(this.a, this.b, cqgr.dF(cqrp.d(dcyn.a)), cqgr.ck(C()));
    }
}
