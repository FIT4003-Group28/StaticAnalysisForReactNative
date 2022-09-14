package defpackage;
/* renamed from: bwyg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwyg implements cqlc {
    static final cqlc a = new bwyg();

    private bwyg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bxcc bxccVar = (bxcc) cqkpVar;
        cqss cqssVar = bwyz.a;
        boolean z = true;
        if (!cqjv.v(bxccVar.a()).booleanValue() && !bxccVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
