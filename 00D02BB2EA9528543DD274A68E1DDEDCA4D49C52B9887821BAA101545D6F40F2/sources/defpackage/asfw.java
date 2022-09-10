package defpackage;
/* renamed from: asfw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asfw implements cqlc {
    static final cqlc a = new asfw();

    private asfw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        asha ashaVar = (asha) cqkpVar;
        cqjb<jba, Boolean> cqjbVar = asgx.a;
        boolean z = true;
        if ((ashaVar.e().booleanValue() || !ashaVar.j().booleanValue()) && !ashaVar.n().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
