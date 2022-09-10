package defpackage;
/* renamed from: xgp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xgp implements cqlc {
    static final cqlc a = new xgp();

    private xgp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        xgv xgvVar = (xgv) cqkpVar;
        int i = xgr.a;
        boolean z = true;
        if (!xgvVar.e().booleanValue() && !xgvVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
