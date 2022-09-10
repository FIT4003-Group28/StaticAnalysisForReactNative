package defpackage;
/* renamed from: blai  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blai implements cqlc {
    static final cqlc a = new blai();

    private blai() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = blap.a;
        boolean z = true;
        if (blkzVar.j().booleanValue() || (!blkzVar.q().booleanValue() && !blkzVar.l().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
