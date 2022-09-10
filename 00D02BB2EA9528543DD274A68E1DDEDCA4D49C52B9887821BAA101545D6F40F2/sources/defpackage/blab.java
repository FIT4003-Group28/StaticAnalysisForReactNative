package defpackage;
/* renamed from: blab  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blab implements cqlc {
    static final cqlc a = new blab();

    private blab() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = blap.a;
        boolean z = true;
        if (!blkzVar.q().booleanValue() || (!blkzVar.l().booleanValue() && !blkzVar.o().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
