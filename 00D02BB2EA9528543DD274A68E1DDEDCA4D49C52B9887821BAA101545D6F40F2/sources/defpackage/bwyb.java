package defpackage;
/* renamed from: bwyb  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwyb implements cqlc {
    static final cqlc a = new bwyb();

    private bwyb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bxcc bxccVar = (bxcc) cqkpVar;
        cqss cqssVar = bwyz.a;
        boolean z = true;
        if (!bxccVar.v().booleanValue() && bxccVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
