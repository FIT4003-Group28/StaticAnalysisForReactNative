package defpackage;
/* renamed from: agmt  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agmt implements cqlc {
    static final cqlc a = new agmt();

    private agmt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        agzs agzsVar = (agzs) cqkpVar;
        int i = agnd.a;
        boolean z = false;
        if (cqjv.v(agzsVar.a()).booleanValue() && cqjv.v(agzsVar.d()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
