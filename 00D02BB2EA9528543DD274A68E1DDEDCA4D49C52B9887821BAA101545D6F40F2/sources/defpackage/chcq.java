package defpackage;
/* renamed from: chcq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chcq implements cqlc {
    static final cqlc a = new chcq();

    private chcq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        chmc chmcVar = (chmc) cqkpVar;
        int i = chcr.a;
        boolean z = false;
        if (chmcVar.a().booleanValue() && !chmcVar.p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
