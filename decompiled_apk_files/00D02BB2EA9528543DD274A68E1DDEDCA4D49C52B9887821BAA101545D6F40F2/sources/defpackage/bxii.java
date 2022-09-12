package defpackage;
/* renamed from: bxii  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bxii implements cqlc {
    static final cqlc a = new bxii();

    private bxii() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bxoi bxoiVar = (bxoi) cqkpVar;
        int i = bxjh.a;
        boolean z = true;
        if (bxoiVar.j().booleanValue() && !bxoiVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
