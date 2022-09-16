package defpackage;
/* renamed from: hoo  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hoo implements cqlc {
    static final cqlc a = new hoo();

    private hoo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        izs izsVar = (izs) cqkpVar;
        int i = hou.a;
        boolean z = true;
        if (!izsVar.A().booleanValue() && !izsVar.W().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
