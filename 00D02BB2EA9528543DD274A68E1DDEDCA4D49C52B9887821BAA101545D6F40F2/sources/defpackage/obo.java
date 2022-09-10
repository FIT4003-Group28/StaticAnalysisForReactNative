package defpackage;
/* renamed from: obo  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class obo implements cqlc {
    static final cqlc a = new obo();

    private obo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = ocd.a;
        boolean z = true;
        if (!cqjv.v(oxiVar.b()).booleanValue() && !cqjv.v(oxiVar.j()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
