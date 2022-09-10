package defpackage;
/* renamed from: byfo  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class byfo implements cqlc {
    static final cqlc a = new byfo();

    private byfo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        byie byieVar = (byie) cqkpVar;
        int i = bygf.a;
        boolean z = false;
        if (!byieVar.a().booleanValue() && cqjv.v(byieVar.f()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
