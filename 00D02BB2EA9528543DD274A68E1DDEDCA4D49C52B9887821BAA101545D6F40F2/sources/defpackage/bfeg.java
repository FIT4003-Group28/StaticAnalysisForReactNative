package defpackage;
/* renamed from: bfeg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfeg implements cqlc {
    static final cqlc a = new bfeg();

    private bfeg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfgr bfgrVar = (bfgr) cqkpVar;
        int i = bfev.a;
        boolean z = true;
        if (!bfgrVar.g().booleanValue() && !cqjv.v(bfgrVar.e()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
