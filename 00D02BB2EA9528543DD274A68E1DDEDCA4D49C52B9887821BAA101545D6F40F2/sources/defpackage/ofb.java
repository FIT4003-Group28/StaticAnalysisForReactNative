package defpackage;
/* renamed from: ofb  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ofb implements cqlc {
    static final cqlc a = new ofb();

    private ofb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = ofg.a;
        boolean z = true;
        if (!oxiVar.n().booleanValue() && !oxiVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
