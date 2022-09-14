package defpackage;
/* renamed from: bkvo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkvo implements cqlc {
    static final cqlc a = new bkvo();

    private bkvo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = bkvq.a;
        boolean z = false;
        if (!blkzVar.j().booleanValue() && !blkzVar.q().booleanValue() && blkzVar.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
