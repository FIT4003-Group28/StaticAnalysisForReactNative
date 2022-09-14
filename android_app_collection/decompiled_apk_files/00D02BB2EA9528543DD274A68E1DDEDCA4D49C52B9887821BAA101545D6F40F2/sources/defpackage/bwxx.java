package defpackage;
/* renamed from: bwxx  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwxx implements cqlc {
    static final cqlc a = new bwxx();

    private bwxx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bxcc bxccVar = (bxcc) cqkpVar;
        cqss cqssVar = bwyz.a;
        boolean z = false;
        if (bxccVar.r().booleanValue() && !bxccVar.o().booleanValue() && !bxccVar.x().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
