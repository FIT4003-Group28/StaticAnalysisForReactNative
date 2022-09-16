package defpackage;
/* renamed from: brtw  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brtw implements cqlc {
    static final cqlc a = new brtw();

    private brtw() {
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
