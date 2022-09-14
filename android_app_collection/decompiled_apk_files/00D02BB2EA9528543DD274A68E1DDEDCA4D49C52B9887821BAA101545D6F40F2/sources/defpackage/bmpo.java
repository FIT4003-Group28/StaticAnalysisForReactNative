package defpackage;
/* renamed from: bmpo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmpo implements cqlc {
    static final cqlc a = new bmpo();

    private bmpo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        if (bmtvVar.D().booleanValue() || bmtvVar.z().booleanValue() || bmtvVar.C().booleanValue() || bmtvVar.E().booleanValue() || bmtvVar.F().booleanValue()) {
            return ddhj.VISIBILITY_VISIBLE;
        }
        if (bmtvVar.V().b().booleanValue()) {
            return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        return ddhj.VISIBILITY_REPRESSED_PRIVACY;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
