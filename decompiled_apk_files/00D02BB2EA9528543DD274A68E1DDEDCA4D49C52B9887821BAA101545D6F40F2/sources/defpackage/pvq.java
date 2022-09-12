package defpackage;
/* renamed from: pvq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class pvq implements cqlc {
    static final cqlc a = new pvq();

    private pvq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zei zeiVar = (zei) cqkpVar;
        int i = pvt.b;
        boolean z = true;
        if (!zeiVar.H().booleanValue() && !zeiVar.P().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
