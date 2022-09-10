package defpackage;
/* renamed from: bymc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bymc implements cqlc {
    static final cqlc a = new bymc();

    private bymc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        byng byngVar = (byng) cqkpVar;
        int i = bymo.a;
        boolean z = true;
        if (!byngVar.m().booleanValue() && byngVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
