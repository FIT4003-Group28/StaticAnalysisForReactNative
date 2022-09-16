package defpackage;
/* renamed from: taq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class taq implements cqlc {
    static final cqlc a = new taq();

    private taq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        tdh tdhVar = (tdh) cqkpVar;
        int i = tau.a;
        boolean z = true;
        if (!tdhVar.h().booleanValue() && tdhVar.i().booleanValue() && tdhVar.j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
