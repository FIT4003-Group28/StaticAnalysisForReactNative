package defpackage;
/* renamed from: bkvt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkvt implements cqlc {
    static final cqlc a = new bkvt();

    private bkvt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = bkvx.a;
        boolean z = true;
        if (!blkzVar.j().booleanValue() && !blkzVar.q().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
