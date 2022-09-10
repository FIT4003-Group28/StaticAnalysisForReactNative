package defpackage;
/* renamed from: hoa  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hoa implements cqlc {
    static final cqlc a = new hoa();

    private hoa() {
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
