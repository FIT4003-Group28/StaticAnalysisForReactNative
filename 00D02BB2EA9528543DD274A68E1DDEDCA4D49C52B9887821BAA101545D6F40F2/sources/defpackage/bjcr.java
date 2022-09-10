package defpackage;
/* renamed from: bjcr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjcr implements cqlc {
    static final cqlc a = new bjcr();

    private bjcr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bjda bjdaVar = (bjda) cqkpVar;
        int i = bjcz.b;
        if (bjdaVar.c().booleanValue()) {
            return cqrp.d(cqjv.v(bjdaVar.n()).booleanValue() ? 80.0d : 120.0d);
        }
        return cqsv.f(200.0d, 150.0d, 200.0d, 150.0d);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
