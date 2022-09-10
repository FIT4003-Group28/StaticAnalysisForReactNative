package defpackage;
/* renamed from: bgda  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgda implements cqlc {
    static final cqlc a = new bgda();

    private bgda() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = true;
        if (!bnihVar.v().booleanValue() && !bnihVar.j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
