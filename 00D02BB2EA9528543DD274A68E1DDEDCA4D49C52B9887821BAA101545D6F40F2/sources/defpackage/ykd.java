package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ykd  reason: default package */
/* loaded from: classes7.dex */
class ykd extends cqiw<ynk> {
    public final dbsl<ynj> a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ykd(int i, dbsl<ynj> dbslVar) {
        this.b = i;
        this.a = dbslVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ynk ynkVar, Context context, cqiv cqivVar) {
        cqivVar.f(new ykc(), dcbg.b(ynkVar.a()).o(this.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ynk> a() {
        return cqgr.gd(cqgr.aI(new cqlc(this) { // from class: yjw
            private final ykd a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(dcbg.b(((ynk) cqkpVar).a()).p(this.a.a));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bD(cqrp.d(12.0d)), vlb.a(), ibq.k(), cqgr.eL(Integer.valueOf(this.b))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())));
    }
}
