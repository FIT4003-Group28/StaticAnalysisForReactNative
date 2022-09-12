package defpackage;
/* renamed from: bxhm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bxhm implements cqlc {
    static final cqlc a = new bxhm();

    private bxhm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bxoe bxoeVar = (bxoe) cqkpVar;
        int i = bxic.a;
        boolean z = false;
        if (!bxoeVar.t().booleanValue() && cqjv.v(bxoeVar.a()).booleanValue() && !bxoeVar.c().a().booleanValue() && !bxoeVar.n().booleanValue() && !bxoeVar.k().booleanValue() && !bxoeVar.m().booleanValue() && !bxoeVar.g().booleanValue() && cqjv.v(bxoeVar.o()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
