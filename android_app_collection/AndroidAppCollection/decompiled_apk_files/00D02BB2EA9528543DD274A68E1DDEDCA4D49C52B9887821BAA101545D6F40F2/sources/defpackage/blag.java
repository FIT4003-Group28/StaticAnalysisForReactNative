package defpackage;
/* renamed from: blag  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blag implements cqlc {
    static final cqlc a = new blag();

    private blag() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = blap.a;
        boolean z = true;
        if (!blkzVar.j().booleanValue() || (!blkzVar.q().booleanValue() && !blkzVar.l().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
