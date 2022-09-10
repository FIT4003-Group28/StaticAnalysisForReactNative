package defpackage;
/* renamed from: aucg  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aucg implements cqlc {
    static final cqlc a = new aucg();

    private aucg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        audp audpVar = (audp) cqkpVar;
        cqrp cqrpVar = aucv.a;
        if (!audpVar.s().booleanValue() || !audpVar.k().booleanValue()) {
            return audm.a;
        }
        return audpVar.p().booleanValue() ? aucv.l : aucv.k;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
