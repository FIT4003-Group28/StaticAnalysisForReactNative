package defpackage;
/* renamed from: rxa  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class rxa implements cqlc {
    static final cqlc a = new rxa();

    private rxa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        saz sazVar = (saz) cqkpVar;
        cqjg cqjgVar = rxs.a;
        boolean z = true;
        if (!sazVar.t().booleanValue() && cqjv.v(sazVar.u()).booleanValue() && !sazVar.v().booleanValue() && !sazVar.w().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
