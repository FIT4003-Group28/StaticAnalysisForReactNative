package defpackage;
/* renamed from: bwco  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwco implements cqlc {
    static final cqlc a = new bwco();

    private bwco() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bwch bwchVar = (bwch) cqkpVar;
        cqjg cqjgVar = bwcx.a;
        boolean z = true;
        if (!bwchVar.p().booleanValue() && !cqjv.v(bwchVar.q()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
