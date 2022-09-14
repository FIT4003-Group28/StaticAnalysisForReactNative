package defpackage;
/* renamed from: anwq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anwq implements cqlc {
    static final cqlc a = new anwq();

    private anwq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        anxu anxuVar = (anxu) cqkpVar;
        int i = anxt.a;
        boolean z = true;
        if (anxuVar.j().booleanValue() || (anxuVar.i().booleanValue() && !anxuVar.p().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
