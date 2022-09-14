package defpackage;
/* renamed from: bkvr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkvr implements cqlc {
    static final cqlc a = new bkvr();

    private bkvr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkz blkzVar = (blkz) cqkpVar;
        int i = bkvx.a;
        boolean z = false;
        if (blkzVar.j().booleanValue() && !blkzVar.q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
