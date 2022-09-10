package defpackage;
/* renamed from: bmqs  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmqs implements cqlc {
    static final cqlc a = new bmqs();

    private bmqs() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        if (bmtvVar.w().booleanValue()) {
            return ddhj.VISIBILITY_VISIBLE;
        }
        if (bmtvVar.V().a().booleanValue()) {
            return ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        return ddhj.VISIBILITY_REPRESSED_PRIVACY;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
