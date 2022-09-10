package defpackage;
/* renamed from: bggg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bggg implements cqlc {
    static final cqlc a = new bggg();

    private bggg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgnl bgnlVar = (bgnl) cqkpVar;
        int i = bggk.a;
        boolean z = true;
        if (!bgnlVar.e().booleanValue() && !cqjv.v(bgnlVar.c()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
