package defpackage;
/* renamed from: osr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class osr implements cqlc {
    static final cqlc a = new osr();

    private osr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = ota.a;
        boolean z = false;
        if (cqjv.v(oxiVar.b()).booleanValue() && cqjv.v(oxiVar.f()).booleanValue() && !oxiVar.n().booleanValue() && !oxiVar.t().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
