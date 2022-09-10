package defpackage;
/* renamed from: nmm  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nmm implements cqlc {
    static final cqlc a = new nmm();

    private nmm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        nmz nmzVar = (nmz) cqkpVar;
        int i = nmx.a;
        boolean z = true;
        if (!nmzVar.b().booleanValue() && !nmzVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
