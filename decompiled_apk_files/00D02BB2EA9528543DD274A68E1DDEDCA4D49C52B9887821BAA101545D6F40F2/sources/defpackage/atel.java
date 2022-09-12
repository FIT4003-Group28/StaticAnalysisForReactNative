package defpackage;
/* renamed from: atel  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atel implements cqlc {
    static final cqlc a = new atel();

    private atel() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atnf atnfVar = (atnf) cqkpVar;
        atob atobVar = ateu.a;
        boolean z = true;
        if (!atnfVar.U().booleanValue() && atnfVar.t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
