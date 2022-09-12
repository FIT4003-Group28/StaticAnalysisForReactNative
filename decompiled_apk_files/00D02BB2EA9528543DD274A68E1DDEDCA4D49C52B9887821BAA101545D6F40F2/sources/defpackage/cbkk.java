package defpackage;
/* renamed from: cbkk  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cbkk implements cqlc {
    static final cqlc a = new cbkk();

    private cbkk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cbrc cbrcVar = (cbrc) cqkpVar;
        int i = cbkq.a;
        boolean z = true;
        if (!cqjv.v(cbrcVar.d()).booleanValue() && !cbrcVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
