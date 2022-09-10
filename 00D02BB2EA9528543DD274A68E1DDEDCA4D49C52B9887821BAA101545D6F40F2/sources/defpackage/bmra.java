package defpackage;
/* renamed from: bmra  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmra implements cqlc {
    static final cqlc a = new bmra();

    private bmra() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        if (bmtvVar.w().booleanValue()) {
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
