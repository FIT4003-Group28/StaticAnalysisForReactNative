package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: brta  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class brta implements cqlc {
    static final cqlc a = new brta();

    private brta() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        brvd brvdVar = (brvd) cqkpVar;
        brkj brkjVar = brtf.b;
        boolean z = true;
        if (!brvdVar.D().booleanValue() && brvdVar.d().booleanValue() && !cqjv.v(brvdVar.P()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
