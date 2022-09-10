package defpackage;
/* renamed from: bkve  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkve implements cqlc {
    static final cqlc a = new bkve();

    private bkve() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = bkvq.a;
        boolean z = false;
        if (!blkzVar.q().booleanValue() && blkzVar.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
