package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bmak  reason: default package */
/* loaded from: classes3.dex */
public final class bmak extends cqiw<bmbf> {
    private final cqmp<bmbf>[] a;

    @SafeVarargs
    public bmak(cqmp<bmbf>... cqmpVarArr) {
        super(cqmpVarArr);
        this.a = cqmpVarArr;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bmbf bmbfVar, Context context, cqiv cqivVar) {
        gva.b(cqivVar, bmbfVar.b(), new bmap(), new hse(ibq.p()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bmbf> a() {
        cqmj<bmbf> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.ck(C()), iue.c(bmaj.a));
        gd.f(this.a);
        return gd;
    }
}
