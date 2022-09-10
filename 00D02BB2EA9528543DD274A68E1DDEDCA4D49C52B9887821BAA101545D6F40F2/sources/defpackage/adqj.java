package defpackage;
/* renamed from: adqj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class adqj implements cqlc {
    static final cqlc a = new adqj();

    private adqj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        advl advlVar = (advl) cqkpVar;
        int i = adqm.a;
        boolean z = true;
        if (!cqjv.v(advlVar.a()).booleanValue() && !cqjv.v(advlVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
