package defpackage;
/* renamed from: xgg  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xgg implements cqlc {
    static final cqlc a = new xgg();

    private xgg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        xgv xgvVar = (xgv) cqkpVar;
        int i = xgr.a;
        boolean z = false;
        if (!xgvVar.e().booleanValue() || (xgvVar.e().booleanValue() && xgvVar.c().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
