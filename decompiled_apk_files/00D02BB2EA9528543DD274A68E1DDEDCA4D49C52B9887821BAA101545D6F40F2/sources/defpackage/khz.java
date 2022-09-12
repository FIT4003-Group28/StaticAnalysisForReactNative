package defpackage;
/* renamed from: khz  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class khz implements cqlc {
    static final cqlc a = new khz();

    private khz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        klf klfVar = (klf) cqkpVar;
        int i = kjk.a;
        boolean z = false;
        if (klfVar.p().booleanValue() && klfVar.q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
