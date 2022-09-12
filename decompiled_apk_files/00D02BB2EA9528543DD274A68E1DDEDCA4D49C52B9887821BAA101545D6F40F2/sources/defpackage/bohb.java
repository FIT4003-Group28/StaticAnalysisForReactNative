package defpackage;
/* renamed from: bohb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bohb implements cqlc {
    static final cqlc a = new bohb();

    private bohb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bopw bopwVar = (bopw) cqkpVar;
        cqjg cqjgVar = bohp.a;
        boolean z = false;
        if (bopwVar.a().booleanValue() && bopwVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
