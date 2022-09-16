package defpackage;
/* renamed from: bfps  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfps implements cqlc {
    static final cqlc a = new bfps();

    private bfps() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrd bfrdVar = (bfrd) cqkpVar;
        int i = bfqt.b;
        boolean z = true;
        if (!bfrdVar.l().booleanValue() && !bfrdVar.m().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
