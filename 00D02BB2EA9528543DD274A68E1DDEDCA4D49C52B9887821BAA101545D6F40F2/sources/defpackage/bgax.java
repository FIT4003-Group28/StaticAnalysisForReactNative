package defpackage;
/* renamed from: bgax  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgax implements cqlc {
    static final cqlc a = new bgax();

    private bgax() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = false;
        if (bnihVar.u().booleanValue() && !cqjv.v(bnihVar.aa()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
