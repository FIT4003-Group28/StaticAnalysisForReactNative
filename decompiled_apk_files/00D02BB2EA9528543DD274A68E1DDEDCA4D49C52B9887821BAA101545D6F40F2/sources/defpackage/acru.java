package defpackage;
/* renamed from: acru  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class acru implements cqlc {
    static final cqlc a = new acru();

    private acru() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        actl actlVar = (actl) cqkpVar;
        int i = acsb.a;
        boolean z = false;
        if (actlVar.a().booleanValue() && actlVar.q().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
