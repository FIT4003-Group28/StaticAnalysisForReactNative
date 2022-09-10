package defpackage;
/* renamed from: ojh  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ojh implements cqlc {
    static final cqlc a = new ojh();

    private ojh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = ojs.a;
        boolean z = true;
        if (!oxiVar.e().booleanValue() && !oxiVar.n().booleanValue() && !oxiVar.t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
