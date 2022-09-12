package defpackage;
/* renamed from: pwk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class pwk implements cqlc {
    static final cqlc a = new pwk();

    private pwk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zei zeiVar = (zei) cqkpVar;
        cqrp cqrpVar = pxj.b;
        boolean z = true;
        if (!cqjv.v(zeiVar.W()).booleanValue() || (!zeiVar.y().booleanValue() && !zeiVar.c().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
