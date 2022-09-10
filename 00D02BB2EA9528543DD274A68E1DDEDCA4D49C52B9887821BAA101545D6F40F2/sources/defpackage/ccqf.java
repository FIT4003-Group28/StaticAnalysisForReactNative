package defpackage;
/* renamed from: ccqf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccqf implements cqlc {
    static final cqlc a = new ccqf();

    private ccqf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ccxl ccxlVar = (ccxl) cqkpVar;
        cqjg cqjgVar = ccql.a;
        boolean z = false;
        if (ccxlVar.o().booleanValue() && !ccxlVar.n().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
