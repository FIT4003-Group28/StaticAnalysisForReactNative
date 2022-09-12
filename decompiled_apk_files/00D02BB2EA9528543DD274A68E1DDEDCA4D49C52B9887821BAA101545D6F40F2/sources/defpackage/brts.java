package defpackage;
/* renamed from: brts  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brts implements cqlc {
    static final cqlc a = new brts();

    private brts() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        brve brveVar = (brve) cqkpVar;
        boolean z = true;
        if (!cqjv.v(brveVar.a()).booleanValue() && brveVar.o().booleanValue() && brveVar.F().intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
