package defpackage;
/* renamed from: blbo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blbo implements cqlc {
    static final cqlc a = new blbo();

    private blbo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blkv blkvVar = (blkv) cqkpVar;
        int i = blbr.a;
        boolean z = false;
        if (cqjv.v(blkvVar.d()).booleanValue() && !blkvVar.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
