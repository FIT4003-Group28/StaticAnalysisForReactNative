package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ccum  reason: default package */
/* loaded from: classes4.dex */
public final class ccum extends cqiw<ccup<?>> {
    private final ccud a;

    public ccum(ccud ccudVar) {
        super(ccudVar);
        this.a = ccudVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ccup<?> ccupVar, Context context, cqiv cqivVar) {
        ccup<?> ccupVar2 = ccupVar;
        if (ccupVar2.a().isEmpty()) {
            cqivVar.a(new ccuf(this.a), ccupVar2.b());
            return;
        }
        for (ccuo<?> ccuoVar : ccupVar2.a()) {
            Object e = ccuoVar.e();
            dbsk.s(e);
            cqivVar.a(new ccul(this.a, e), ccuoVar);
        }
        ccud ccudVar = this.a;
        if (((cctz) ccudVar).b) {
            return;
        }
        cqivVar.a(new ccub(ccudVar), ccupVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccup<?>> a() {
        return cqqx.D(cqgr.bq(((cctz) this.a).c), cqgr.cd(-1), cqgr.ep(false), cqqx.G(), cqgr.ck(C()), cqgr.P(false));
    }
}
