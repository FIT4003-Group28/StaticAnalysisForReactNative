package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hpk  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class hpk implements cqlc {
    static final cqlc a = new hpk();

    private hpk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        izs izsVar = (izs) cqkpVar;
        cqtv cqtvVar = hps.a;
        boolean z = true;
        if (!izsVar.s().booleanValue() && izsVar.n().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
