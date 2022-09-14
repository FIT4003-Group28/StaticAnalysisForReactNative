package defpackage;
/* renamed from: bgch  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgch implements cqlc {
    static final cqlc a = new bgch();

    private bgch() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = false;
        if (bnihVar.j().booleanValue() && !cqjv.v(bnihVar.q()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
