package defpackage;
/* renamed from: brtu  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brtu implements cqlc {
    static final cqlc a = new brtu();

    private brtu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        brve brveVar = (brve) cqkpVar;
        boolean z = true;
        if (brveVar.n().booleanValue() && !cqjv.v(brveVar.a()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
