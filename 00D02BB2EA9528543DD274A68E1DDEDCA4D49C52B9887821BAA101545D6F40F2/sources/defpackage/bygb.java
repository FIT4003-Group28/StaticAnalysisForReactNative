package defpackage;
/* renamed from: bygb  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bygb implements cqlc {
    static final cqlc a = new bygb();

    private bygb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        byie byieVar = (byie) cqkpVar;
        int i = bygf.a;
        boolean z = false;
        if (!byieVar.a().booleanValue() && cqjv.v(byieVar.e()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
