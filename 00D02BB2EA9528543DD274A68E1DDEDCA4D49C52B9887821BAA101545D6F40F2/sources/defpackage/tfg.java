package defpackage;
/* renamed from: tfg  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tfg implements cqlc {
    static final cqlc a = new tfg();

    private tfg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        tfq tfqVar = (tfq) cqkpVar;
        int i = tfk.a;
        boolean z = true;
        if (!tfqVar.b().booleanValue() && tfqVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
