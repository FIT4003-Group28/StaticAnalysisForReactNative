package defpackage;
/* renamed from: ugu  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ugu implements cqlc {
    static final cqlc a = new ugu();

    private ugu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        uhe uheVar = (uhe) cqkpVar;
        cqrp cqrpVar = ugz.a;
        boolean z = true;
        if (uheVar.j().booleanValue() && !uheVar.i().booleanValue() && !uheVar.h().booleanValue() && !uheVar.g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
