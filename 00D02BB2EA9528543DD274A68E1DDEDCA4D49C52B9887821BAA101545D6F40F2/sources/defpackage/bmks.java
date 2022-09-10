package defpackage;
/* renamed from: bmks  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmks implements cqlc {
    static final cqlc a = new bmks();

    private bmks() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmkz bmkzVar = (bmkz) cqkpVar;
        int i = bmky.a;
        boolean z = true;
        if (bmkzVar.k().booleanValue() && !bmkzVar.n().booleanValue() && !bmkzVar.s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
