package defpackage;
/* renamed from: bgbr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgbr implements cqlc {
    static final cqlc a = new bgbr();

    private bgbr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        cqtv cqtvVar = bgdg.a;
        boolean z = true;
        if (!bnihVar.ab().booleanValue() && !bnihVar.j().booleanValue() && !bnihVar.ac().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
