package defpackage;
/* renamed from: bctc  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bctc implements cqlc {
    static final cqlc a = new bctc();

    private bctc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdab bdabVar = (bdab) cqkpVar;
        cqjg cqjgVar = bctq.a;
        boolean z = false;
        if (cqjv.v(bdabVar.x()).booleanValue() && bdabVar.t().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
