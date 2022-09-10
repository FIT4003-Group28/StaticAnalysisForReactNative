package defpackage;
/* renamed from: cibt  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cibt implements cqlc {
    static final cqlc a = new cibt();

    private cibt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cict cictVar = (cict) cqkpVar;
        int i = cics.a;
        boolean z = false;
        if (cqjv.v(cictVar.f()).booleanValue() && cqjv.v(cictVar.i()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
