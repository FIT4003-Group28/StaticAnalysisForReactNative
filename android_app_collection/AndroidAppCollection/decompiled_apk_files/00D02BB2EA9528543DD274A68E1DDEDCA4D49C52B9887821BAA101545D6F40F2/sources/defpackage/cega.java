package defpackage;
/* renamed from: cega  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cega implements cqlc {
    static final cqlc a = new cega();

    private cega() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cesj cesjVar = (cesj) cqkpVar;
        cqjg cqjgVar = cegd.a;
        boolean z = true;
        if (cesjVar.n().booleanValue() && !cqjv.v(cesjVar.g()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
