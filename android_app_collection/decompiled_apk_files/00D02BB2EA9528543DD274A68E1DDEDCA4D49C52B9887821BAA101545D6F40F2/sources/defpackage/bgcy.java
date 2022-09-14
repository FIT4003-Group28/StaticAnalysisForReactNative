package defpackage;
/* renamed from: bgcy  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgcy implements cqlc {
    static final cqlc a = new bgcy();

    private bgcy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = true;
        if (!bnihVar.S().booleanValue() && bnihVar.ac().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
