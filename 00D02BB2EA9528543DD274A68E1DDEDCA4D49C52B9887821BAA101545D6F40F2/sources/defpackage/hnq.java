package defpackage;
/* renamed from: hnq  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hnq implements cqlc {
    static final cqlc a = new hnq();

    private hnq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        izs izsVar = (izs) cqkpVar;
        int i = hou.a;
        boolean z = false;
        if (izsVar.y().booleanValue() && !cqjv.v(izsVar.X()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
