package defpackage;
/* renamed from: bdnq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdnq implements cqlc {
    static final cqlc a = new bdnq();

    private bdnq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdon bdonVar = (bdon) cqkpVar;
        int i = bdnr.a;
        boolean z = false;
        if (bdonVar.e().booleanValue() && !bdonVar.a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
