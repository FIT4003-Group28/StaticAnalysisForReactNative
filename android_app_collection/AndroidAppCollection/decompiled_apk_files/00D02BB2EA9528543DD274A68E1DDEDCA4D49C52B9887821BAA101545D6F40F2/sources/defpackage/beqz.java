package defpackage;
/* renamed from: beqz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class beqz implements cqlc {
    static final cqlc a = new beqz();

    private beqz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        betc betcVar = (betc) cqkpVar;
        cqtv cqtvVar = besc.a;
        boolean z = false;
        if (cqjv.v(betcVar.a()).booleanValue() && betcVar.i().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
