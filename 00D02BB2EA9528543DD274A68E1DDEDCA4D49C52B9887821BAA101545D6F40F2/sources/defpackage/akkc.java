package defpackage;
/* renamed from: akkc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akkc implements cqlc {
    static final cqlc a = new akkc();

    private akkc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aklg aklgVar = (aklg) cqkpVar;
        int i = akki.a;
        boolean z = true;
        if (cqjv.v(aklgVar.c()).booleanValue() && !cqjv.v(aklgVar.d()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
