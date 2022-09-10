package defpackage;
/* renamed from: ugt  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ugt implements cqlc {
    static final cqlc a = new ugt();

    private ugt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        uhe uheVar = (uhe) cqkpVar;
        cqrp cqrpVar = ugz.a;
        boolean z = false;
        if (uheVar.j().booleanValue() && !uheVar.i().booleanValue() && !uheVar.h().booleanValue() && !uheVar.g().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
