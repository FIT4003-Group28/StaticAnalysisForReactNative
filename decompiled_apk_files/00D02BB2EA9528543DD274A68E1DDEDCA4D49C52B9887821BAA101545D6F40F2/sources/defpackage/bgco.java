package defpackage;
/* renamed from: bgco  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgco implements cqlc {
    static final cqlc a = new bgco();

    private bgco() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = false;
        if (bnihVar.j().booleanValue() && !cqjv.v(bnihVar.s()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
