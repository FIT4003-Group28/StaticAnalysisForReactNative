package defpackage;
/* renamed from: qmc  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class qmc implements cqlc {
    static final cqlc a = new qmc();

    private qmc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        qnd qndVar = (qnd) cqkpVar;
        int i = qmd.a;
        if (!qndVar.b().isEmpty()) {
            return qndVar.b().get(0);
        }
        return null;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
