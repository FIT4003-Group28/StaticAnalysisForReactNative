package defpackage;
/* renamed from: hnz  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hnz implements cqlc {
    static final cqlc a = new hnz();

    private hnz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        izs izsVar = (izs) cqkpVar;
        int i = hou.a;
        boolean z = true;
        if (!izsVar.v().booleanValue() && izsVar.l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
