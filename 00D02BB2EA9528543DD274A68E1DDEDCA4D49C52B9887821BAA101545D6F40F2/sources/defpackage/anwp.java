package defpackage;
/* renamed from: anwp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anwp implements cqlc {
    static final cqlc a = new anwp();

    private anwp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        anxu anxuVar = (anxu) cqkpVar;
        int i = anxt.a;
        boolean z = true;
        if (!anxuVar.k().booleanValue() && !anxuVar.p().booleanValue() && !anxuVar.l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
