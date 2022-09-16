package defpackage;
/* renamed from: bfpv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfpv implements cqlc {
    static final cqlc a = new bfpv();

    private bfpv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrd bfrdVar = (bfrd) cqkpVar;
        int i = bfqt.b;
        boolean z = false;
        if (bfrdVar.n().booleanValue() && bfrdVar.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
