package defpackage;
/* renamed from: cbgi  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cbgi implements cqlc {
    static final cqlc a = new cbgi();

    private cbgi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cbqs cbqsVar = (cbqs) cqkpVar;
        int i = cbgk.a;
        boolean z = true;
        if (!cbqsVar.l().booleanValue() && !cqjv.v(cbqsVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
