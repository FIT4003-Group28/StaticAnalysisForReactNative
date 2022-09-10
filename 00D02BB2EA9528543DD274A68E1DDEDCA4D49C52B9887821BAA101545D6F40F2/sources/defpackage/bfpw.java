package defpackage;
/* renamed from: bfpw  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfpw implements cqlc {
    static final cqlc a = new bfpw();

    private bfpw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrd bfrdVar = (bfrd) cqkpVar;
        int i = bfqt.b;
        boolean z = false;
        if (bfrdVar.n().booleanValue() && bfrdVar.m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
