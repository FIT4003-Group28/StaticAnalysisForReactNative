package defpackage;
/* renamed from: bhkg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhkg implements cqlc {
    static final cqlc a = new bhkg();

    private bhkg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        actl actlVar = (actl) cqkpVar;
        int i = bhkm.a;
        boolean z = false;
        if (actlVar.a().booleanValue() && actlVar.q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
