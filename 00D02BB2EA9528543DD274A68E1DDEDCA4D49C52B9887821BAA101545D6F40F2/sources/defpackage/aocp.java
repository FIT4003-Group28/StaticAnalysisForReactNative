package defpackage;
/* renamed from: aocp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aocp implements cqlc {
    static final cqlc a = new aocp();

    private aocp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aoct aoctVar = (aoct) cqkpVar;
        int i = aocs.a;
        boolean z = true;
        if (!cqjv.v(aoctVar.a()).booleanValue() && !cqjv.v(aoctVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
