package defpackage;
/* renamed from: bkwi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkwi implements cqlc {
    static final cqlc a = new bkwi();

    private bkwi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkx blkxVar = (blkx) cqkpVar;
        int i = bkwx.a;
        boolean z = true;
        if (blkxVar.b().a().isEmpty() && blkxVar.d().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
