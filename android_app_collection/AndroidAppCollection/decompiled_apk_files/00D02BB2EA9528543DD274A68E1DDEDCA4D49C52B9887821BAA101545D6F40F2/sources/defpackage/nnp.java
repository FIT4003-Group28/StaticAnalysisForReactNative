package defpackage;
/* renamed from: nnp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nnp implements cqlc {
    static final cqlc a = new nnp();

    private nnp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        nny nnyVar = (nny) cqkpVar;
        cqjg cqjgVar = nns.a;
        boolean z = true;
        if (!nnyVar.d().booleanValue() && !nnyVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
