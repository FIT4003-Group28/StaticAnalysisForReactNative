package defpackage;
/* renamed from: kar  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class kar implements cqlc {
    static final cqlc a = new kar();

    private kar() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        kcf kcfVar = (kcf) cqkpVar;
        cqtv cqtvVar = kbb.a;
        boolean z = true;
        if (!kcfVar.O().booleanValue() && !kcfVar.h().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
